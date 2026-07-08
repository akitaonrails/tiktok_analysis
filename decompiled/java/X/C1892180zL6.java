package X;

import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentSDKConfigService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Collections;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0zL6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C1892180zL6 extends C2217421BqW implements InterfaceC1631630sYr<String, EnumC1876780ywG, String, String, Unit> {
    public C1892180zL6(Object obj) {
        super(4, obj, C1519350pdl.class, "updateConsent", "updateConsent(Ljava/lang/String;Lcom/ss/android/ugc/aweme/pns/consent/api/ConsentStatusEnum;Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(String str, EnumC1876780ywG enumC1876780ywG, String str2, String str3) {
        String str4 = str3;
        this.receiver.getClass();
        C1876860ywO c1876860ywO = new C1876860ywO(str, enumC1876780ywG, str2, null, null, null, 120);
        IPNSConsentSDKConfigService iPNSConsentSDKConfigService = (IPNSConsentSDKConfigService) PluggableExtentionKt.pluggableSpi$default(IPNSConsentSDKConfigService.class, false, false, false, 14, null);
        if (iPNSConsentSDKConfigService != null && iPNSConsentSDKConfigService.LIZ() != null) {
            C1915720zx4.LJIIIIZZ(null, str4, Collections.singletonList(c1876860ywO));
        }
        return Unit.LIZ;
    }
}
