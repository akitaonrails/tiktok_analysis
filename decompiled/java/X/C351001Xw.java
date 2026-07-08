package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.api.PcsApi;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.smb.SMBThirdPartyLinkGetBySkuResponse;

/* JADX INFO: renamed from: X.01Xw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.thirdpartylink.model.PcsThirdPartyLinkRepository$fetchThirdPartyLink$2", f = "PcsThirdPartyLinkRepository.kt", l = {LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT}, m = "invokeSuspend")
public final class C351001Xw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends SMBThirdPartyLinkGetBySkuResponse.ResponseData>>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C351001Xw(long j, String str, InterfaceC1364105Vn<? super C351001Xw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C351001Xw(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("PcsThirdPartyLinkRepository@e4e5.fetchThirdPartyLink$2");
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
                C480460Ism.LIZ().getClass();
                PcsApi pcsApi = (PcsApi) C480460Ism.LIZLLL(PcsApi.class);
                long j = this.LLILLJJLI;
                String str = this.LLILLL;
                this.LL = 1;
                obj = pcsApi.getThirdPartyLinkBySku(j, str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PcsThirdPartyLinkRepository@e4e5.fetchThirdPartyLink$2");
                    return objLJFF;
                }
            }
            c098200Yq = (SMBThirdPartyLinkGetBySkuResponse.ResponseData) ((C470590Icr) obj).data;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("/webcast/smb/third_party_link/get_by_sku/ failed: ");
            sbLIZ.append(e.getMessage());
            C20441214yg.LIZIZ("PcsThirdPartyLinkRepository", C2188811AlT.LIZIZ(sbLIZ));
            c098200Yq = new C098200Yq(e);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
        C1C7U.LIZIZ("PcsThirdPartyLinkRepository@e4e5.fetchThirdPartyLink$2");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends SMBThirdPartyLinkGetBySkuResponse.ResponseData>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
