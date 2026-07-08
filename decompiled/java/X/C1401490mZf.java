package X;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.music.model.RFCDraftModel;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0mZf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1401490mZf extends AbstractC1401510mZh {
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(638));

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1401500mZg interfaceC1401500mZg = (InterfaceC1401500mZg) xBaseParamModel;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        Activity activityLIZIZ = null;
        if (abstractC1387200mCcLIZIZ != null) {
            activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
        }
        if ((activityLIZIZ instanceof Activity) && activityLIZIZ != null) {
            String campaignID = interfaceC1401500mZg.getCampaignID();
            String sourcePlatformChannel = interfaceC1401500mZg.getSourcePlatformChannel();
            String backURL = interfaceC1401500mZg.getBackURL();
            if (campaignID == null) {
                campaignID = "";
            }
            RFCDraftModel rFCDraftModel = new RFCDraftModel(campaignID, backURL, sourcePlatformChannel);
            Bundle bundle = new Bundle();
            C786410Ut5.LJJIZ(bundle, "wwa_rfc_draft_model", rFCDraftModel);
            IAVDraftService iAVDraftService = (IAVDraftService) this.LLILLL.getValue();
            if (iAVDraftService != null) {
                iAVDraftService.openDraftActivity(activityLIZIZ, bundle);
            }
        }
    }
}
