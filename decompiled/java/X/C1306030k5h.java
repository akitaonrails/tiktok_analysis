package X;

import com.bytedance.android.starship.strategy.CancelableJob;
import com.bytedance.android.starship.strategy.graph.CancelableJobImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS134S1100000_20;
import njp.a;

/* JADX INFO: renamed from: X.0k5h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.starship.strategy.graph.StrategyGraphContainer$runStrategyWithEvent$result$1$1", f = "StrategyGraphContainer.kt", l = {145}, m = "invokeSuspend")
public final class C1306030k5h extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1306060k5k>, Object> {
    public CancelableJobImpl LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1306250k63 LLILLL;
    public final /* synthetic */ C1306400k6I LLILZ;
    public final /* synthetic */ Pair<String, Map<String, Object>> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1306030k5h(C1306400k6I c1306400k6I, C1306250k63 c1306250k63, Pair pair, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1306250k63;
        this.LLILZ = c1306400k6I;
        this.LLILZIL = pair;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1306030k5h(this.LLILZ, this.LLILLL, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        CancelableJob cancelableJobRegisterStrategyCallback;
        boolean z;
        C1C7U.LIZ("StrategyGraphContainer@a2bb.runStrategyWithEvent$result$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            if (i != 0) {
                if (i == 1) {
                    cancelableJobRegisterStrategyCallback = this.LL;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                try {
                    C099F c099fLIZIZ = C090F.LIZIZ();
                    String string = UUID.randomUUID().toString();
                    cancelableJobRegisterStrategyCallback = this.LLILLL.registerStrategyCallback(this.LLILZ, new AwS134S1100000_20(string, c099fLIZIZ, 0));
                    try {
                        C1306070k5l c1306070k5l = C1306070k5l.LIZ;
                        String first = this.LLILZIL.getFirst();
                        Map<String, Object> second = this.LLILZIL.getSecond();
                        if (C1306070k5l.LIZJ.get(first) != null) {
                            C23250099c.LIZLLL(C1306070k5l.LIZIZ, null, null, new C436810HAx(first, string, second, null), 3);
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Event error:");
                            sbLIZ.append(this.LLILZIL.getFirst());
                            sbLIZ.append(", No strategy needed.");
                            c099fLIZIZ.LJJLIIIJILLIZJL(C1306250k63.LJIILL(C2188811AlT.LIZIZ(sbLIZ)));
                        }
                        this.LL = (CancelableJobImpl) cancelableJobRegisterStrategyCallback;
                        this.LLILLJJLI = 1;
                        obj = c099fLIZIZ.LJLIIIL(this);
                        if (obj == objLJFF) {
                            C1C7U.LIZIZ("StrategyGraphContainer@a2bb.runStrategyWithEvent$result$1$1");
                            return objLJFF;
                        }
                    } catch (Throwable th) {
                        th = th;
                        TryCatchGuardChecker.doCheck(th);
                        if (cancelableJobRegisterStrategyCallback != null) {
                            cancelableJobRegisterStrategyCallback.cancel();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cancelableJobRegisterStrategyCallback = null;
                }
            }
            C1306060k5k c1306060k5k = (C1306060k5k) obj;
            if (cancelableJobRegisterStrategyCallback != null) {
                cancelableJobRegisterStrategyCallback.cancel();
            }
            C1C7U.LIZIZ("StrategyGraphContainer@a2bb.runStrategyWithEvent$result$1$1");
            return c1306060k5k;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1306060k5k> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
