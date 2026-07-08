package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05GI, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.preload.IMPreloadStrategyManager$executeStrategy$1", f = "IMPreloadService.kt", l = {130}, m = "invokeSuspend")
public final class C05GI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05GJ LLILLJJLI;
    public final /* synthetic */ C05GK LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05GI(C05GJ c05gj, C05GK c05gk, InterfaceC1364105Vn<? super C05GI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05gj;
        this.LLILLL = c05gk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05GI(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMPreloadStrategyManager@518e.executeStrategy$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C05GJ c05gj = this.LLILLJJLI;
                Object payload = this.LLILLL.getPayload();
                if (payload == null) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("IMPreloadStrategyManager@518e.executeStrategy$1");
                    return unit;
                }
                this.LL = 1;
                obj = c05gj.LIZLLL(payload);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("IMPreloadStrategyManager@518e.executeStrategy$1");
                    return objLJFF;
                }
            }
            this.LLILLJJLI.LIZIZ();
            C1329305Id.LIZJ((List) obj);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLJJLI.LIZ().getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Error handling event for strategy ");
            sbLIZ.append(this.LLILLJJLI.getId());
            sbLIZ.append(": ");
            sbLIZ.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("IMPreloadStrategyManager@518e.executeStrategy$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
