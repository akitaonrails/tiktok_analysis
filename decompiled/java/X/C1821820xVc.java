package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.thirdpartylink.view.PcsThirdPartyLinkWebviewAssem;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.smb.SMBThirdPartyLinkGetBySkuResponse;
import webcast.api.smb.ThirdPartyLinkInfo;

/* JADX INFO: renamed from: X.0xVc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1821820xVc extends C09AY implements Function2<UIAssem, SMBThirdPartyLinkGetBySkuResponse.ResponseData, Unit> {
    public final /* synthetic */ PcsThirdPartyLinkWebviewAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1821820xVc(PcsThirdPartyLinkWebviewAssem pcsThirdPartyLinkWebviewAssem) {
        super(2);
        this.LL = pcsThirdPartyLinkWebviewAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, SMBThirdPartyLinkGetBySkuResponse.ResponseData responseData) {
        String str;
        ThirdPartyLinkInfo thirdPartyLinkInfo;
        SMBThirdPartyLinkGetBySkuResponse.ResponseData responseData2 = responseData;
        if (responseData2 == null || (thirdPartyLinkInfo = responseData2.linkInfo) == null || (str = thirdPartyLinkInfo.targetUrl) == null) {
            str = "";
        }
        if (str.length() != 0 && !Intrinsics.LJFF(str, this.LL.LLJJIJI)) {
            PcsThirdPartyLinkWebviewAssem pcsThirdPartyLinkWebviewAssem = this.LL;
            pcsThirdPartyLinkWebviewAssem.LLJJIJI = str;
            SparkThirdContext sparkThirdContext = pcsThirdPartyLinkWebviewAssem.LLJJIJIIJIL;
            if (sparkThirdContext != null) {
                sparkThirdContext.url = str;
                C1BHX c1bhx = pcsThirdPartyLinkWebviewAssem.LLJJIII;
                if (c1bhx != null) {
                    c1bhx.LIZ(sparkThirdContext);
                }
            }
        }
        return Unit.LIZ;
    }
}
