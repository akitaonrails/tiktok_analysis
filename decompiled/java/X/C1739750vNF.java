package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.SpotlightApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS605S0100000_26;
import njp.a;

/* JADX INFO: renamed from: X.0vNF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.manager.spotlight.SeaPdpSpotlightManager$fetchSpotlightInfoAndUpdateUI$1", f = "SeaPdpSpotlightManager.kt", l = {59}, m = "invokeSuspend")
public final class C1739750vNF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1742450vRb LLILLJJLI;
    public final /* synthetic */ InterfaceC1748810vbr LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1739750vNF(C1742450vRb c1742450vRb, InterfaceC1748810vbr interfaceC1748810vbr, InterfaceC1364105Vn<? super C1739750vNF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1742450vRb;
        this.LLILLL = interfaceC1748810vbr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1739750vNF(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0X52 c0x52;
        Response response;
        C1C7U.LIZ("SeaPdpSpotlightManager@2be3.fetchSpotlightInfoAndUpdateUI$1");
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
                this.LLILLJJLI.LIZJ = "loading";
                SpotlightApi.SpotlightRequest spotlightRequestLIZIZ = C1742450vRb.LIZIZ(this.LLILLJJLI.LIZ, this.LLILLL);
                C1739740vNE c1739740vNE = SpotlightApi.LIZ;
                this.LL = 1;
                c1739740vNE.getClass();
                obj = ((SpotlightApi) C1739740vNE.LIZIZ.create(SpotlightApi.class)).LIZ(spotlightRequestLIZIZ, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SeaPdpSpotlightManager@2be3.fetchSpotlightInfoAndUpdateUI$1");
                    return objLJFF;
                }
            }
            c0x52 = (C0X52) obj;
            if (c0x52 != null) {
                response = (Response) c0x52.LIZIZ;
            } else {
                response = null;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLJJLI.LIZJ = "error";
            C1742450vRb c1742450vRb = this.LLILLJJLI;
            c1742450vRb.LIZ.setState(new AwS605S0100000_26(c1742450vRb, 1));
            C1AF0.LJFF(e, "fetchSpotlightInfoAndUpdateUI");
        }
        if (response != null) {
            Response response2 = (Response) c0x52.LIZIZ;
            String str = (String) response2.data;
            if (str != null && response2.isCodeOK()) {
                C1742450vRb c1742450vRb2 = this.LLILLJJLI;
                c1742450vRb2.LIZIZ = str;
                c1742450vRb2.LIZJ = "success";
                C1742450vRb c1742450vRb3 = this.LLILLJJLI;
                c1742450vRb3.LIZ.setState(new AwS605S0100000_26(c1742450vRb3, 0));
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("SeaPdpSpotlightManager@2be3.fetchSpotlightInfoAndUpdateUI$1");
                return unit;
            }
            throw new RuntimeException("data is null or response code is not ok");
        }
        throw new RuntimeException("Network Error");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
