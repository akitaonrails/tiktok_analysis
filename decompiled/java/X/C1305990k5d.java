package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0k5d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.starship.strategy.graph.StrategyGraphContainer$runStrategyWithEvent$result$1", f = "StrategyGraphContainer.kt", l = {127}, m = "invokeSuspend")
public final class C1305990k5d extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1306060k5k>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1306400k6I LLILLL;
    public final /* synthetic */ C1306250k63 LLILZ;
    public final /* synthetic */ Pair<String, Map<String, Object>> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1305990k5d(C1306400k6I c1306400k6I, C1306250k63 c1306250k63, Pair<String, ? extends Map<String, ? extends Object>> pair, InterfaceC1364105Vn<? super C1305990k5d> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1306400k6I;
        this.LLILZ = c1306250k63;
        this.LLILZIL = pair;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1305990k5d(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1306060k5k c1306060k5kLJIILL;
        long jMin;
        C1C7U.LIZ("StrategyGraphContainer@a2bb.runStrategyWithEvent$result$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            if (i != 0) {
                if (i == 1) {
                    jMin = this.LL;
                    try {
                        C155000ia.LIZIZ(obj);
                    } catch (C094W e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("runStrategySync timeout=");
                        sbLIZ.append(jMin);
                        sbLIZ.append(" error:");
                        sbLIZ.append(e.getMessage());
                        c1306060k5kLJIILL = C1306250k63.LJIILL(C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                this.LLILLL.getClass();
                jMin = Math.min(3000L, 3000L);
                try {
                    C1306030k5h c1306030k5h = new C1306030k5h(this.LLILLL, this.LLILZ, this.LLILZIL, null);
                    this.LL = jMin;
                    this.LLILLJJLI = 1;
                    obj = C099A.LIZIZ(jMin, c1306030k5h, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("StrategyGraphContainer@a2bb.runStrategyWithEvent$result$1");
                        return objLJFF;
                    }
                } catch (C094W e2) {
                    e = e2;
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("runStrategySync timeout=");
                    sbLIZ2.append(jMin);
                    sbLIZ2.append(" error:");
                    sbLIZ2.append(e.getMessage());
                    c1306060k5kLJIILL = C1306250k63.LJIILL(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
            c1306060k5kLJIILL = (C1306060k5k) obj;
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("runStrategySync error:");
            sbLIZ3.append(e3.getMessage());
            c1306060k5kLJIILL = C1306250k63.LJIILL(C2188811AlT.LIZIZ(sbLIZ3));
        }
        C1C7U.LIZIZ("StrategyGraphContainer@a2bb.runStrategyWithEvent$result$1");
        return c1306060k5kLJIILL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1306060k5k> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
