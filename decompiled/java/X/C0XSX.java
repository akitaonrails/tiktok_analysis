package X;

import com.ss.android.ugc.aweme.effectplatform.EPRequestInterceptor;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.publish.campaign.AMEPublishCampaignListResponse;
import com.ss.android.ugc.aweme.publish.campaign.AMEPublishCampaignService;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0XSX, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.publish.campaign.AMEPublishCampaignRepo$fetchAMEPublishCampaignListSync$response$1", f = "AMEPublishCampaignService.kt", l = {103}, m = "invokeSuspend")
public final class C0XSX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AMEPublishCampaignListResponse>, Object> {
    public int LL;

    public C0XSX(InterfaceC1364105Vn<? super C0XSX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0XSX(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AMEPublishCampaignRepo@2949.fetchAMEPublishCampaignListSync$response$1");
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
            AMEPublishCampaignService.LIZ.getClass();
            InterfaceC1445350niP networkService = ((IFoundationAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getNetworkService();
            AMEPublishCampaignService aMEPublishCampaignService = (AMEPublishCampaignService) networkService.createRetrofitWithInterceptors(networkService.getApiHost(), true, AMEPublishCampaignService.class, Collections.singletonList(new EPRequestInterceptor()));
            this.LL = 1;
            obj = aMEPublishCampaignService.getAMEPublishCampaignList(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AMEPublishCampaignRepo@2949.fetchAMEPublishCampaignListSync$response$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AMEPublishCampaignRepo@2949.fetchAMEPublishCampaignListSync$response$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AMEPublishCampaignListResponse> interfaceC1364105Vn) {
        return new C0XSX(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
