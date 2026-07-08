package X;

import com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice.DecisionMakerNetworkApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0NFL, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pns.gatekeeper.GatekeeperDecisionMaker$loadEligibilityDataReal$observable$1", f = "GatekeeperDecisionMaker.kt", l = {113}, m = "invokeSuspend")
public final class C0NFL extends C09AX implements Function1<InterfaceC1364105Vn<? super DecisionMakerNetworkApi.DecisionMakerResponseModel>, Object> {
    public int LL;
    public final /* synthetic */ C0NQY LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NFL(C0NQY c0nqy, InterfaceC1364105Vn<? super C0NFL> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c0nqy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NFL(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super DecisionMakerNetworkApi.DecisionMakerResponseModel> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GatekeeperDecisionMaker@e782.loadEligibilityDataReal$observable$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            DecisionMakerNetworkApi decisionMakerNetworkApi = (DecisionMakerNetworkApi) this.LLILLJJLI.LJII.getValue();
            this.LL = 1;
            obj = decisionMakerNetworkApi.LIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GatekeeperDecisionMaker@e782.loadEligibilityDataReal$observable$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("GatekeeperDecisionMaker@e782.loadEligibilityDataReal$observable$1");
        return obj;
    }
}
