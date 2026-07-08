package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uWE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.pipo.verify.base.PIPOVerifyContext$exchangeSession$2", f = "PIPOVerifyContext.kt", l = {337}, m = "invokeSuspend")
public final class C1706880uWE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1713570uh1 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1706880uWE(C1713570uh1 c1713570uh1, InterfaceC1364105Vn<? super C1706880uWE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1713570uh1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1706880uWE(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PIPOVerifyContext@e046.exchangeSession$2");
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
                C1713530ugx c1713530ugxLJ = this.LLILLJJLI.LJ();
                String eventName = EnumC2242008qQ.EXCHANGE_SESSION.getEventName();
                this.LL = 1;
                c1713530ugxLJ.getClass();
                obj = C23250099c.LJI(this, C0PEM.LIZJ, new C1706950uWL(eventName, c1713530ugxLJ, null, null));
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PIPOVerifyContext@e046.exchangeSession$2");
                    return objLJFF;
                }
            }
            C189200o6.m2constructorimpl((BaseResponse) obj);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PIPOVerifyContext@e046.exchangeSession$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
