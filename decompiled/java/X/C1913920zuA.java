package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentConfigService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.model.ConsentBoxConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopup;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupButton;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0zuA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1913920zuA implements InterfaceC1914160zuY {
    @Override // X.InterfaceC1914160zuY
    public final C15O7<UniversalPopupResponse> LIZIZ() {
        String str;
        String str2;
        IPNSConsentConfigService iPNSConsentConfigServiceLJIIIZ;
        ConsentBoxConfig consentBoxConfigLJIIJJI = (!C294580Bge.LIZ() || (iPNSConsentConfigServiceLJIIIZ = ComplianceServiceProvider.LJIIIZ()) == null) ? null : iPNSConsentConfigServiceLJIIIZ.LJIIJJI();
        if (consentBoxConfigLJIIJJI == null || (str = consentBoxConfigLJIIJJI.business) == null || str.length() <= 0) {
            str = "hu_dnu_consent_box";
        }
        if (consentBoxConfigLJIIJJI == null || (str2 = consentBoxConfigLJIIJJI.policyVersion) == null || str2.length() <= 0) {
            str2 = "v1";
        }
        Boolean bool = Boolean.TRUE;
        return C15O7.LJIIJ(new UniversalPopupResponse(Collections.singletonList(new UniversalPopup(false, str, null, str2, "consent_hu", null, "", null, null, null, null, C1697810uHb.LJIIJJI(new UniversalPopupButton("", new UniversalPopupAction("1", null, null, null, 0, bool, null, null, true, null, null, false, false, 7902, null), true, 0, true), new UniversalPopupButton("", new UniversalPopupAction(CardStruct.IStatusCode.DEFAULT, null, null, null, 0, bool, null, null, false, null, null, false, false, 7902, null), true, 0, true)), null, null, new ArrayList(), null, Boolean.FALSE, C2097608Jq.LJ(), null, null, null, null, null, 0.0f, 0.0f, null, false, 134002597, null)), null, 2, null));
    }

    @Override // X.InterfaceC1914160zuY
    public final C15O7<Unit> LIZ(String str, Map<String, String> map) {
        IPNSDeviceConsentService iPNSDeviceConsentService;
        IPNSDeviceConsentService iPNSDeviceConsentService2 = (IPNSDeviceConsentService) PluggableExtentionKt.pluggableSpi$default(IPNSDeviceConsentService.class, false, false, false, 14, null);
        if (iPNSDeviceConsentService2 != null && iPNSDeviceConsentService2.LIZJ() && !iPNSDeviceConsentService2.LJII(null) && (iPNSDeviceConsentService = (IPNSDeviceConsentService) PluggableExtentionKt.pluggableSpi$default(IPNSDeviceConsentService.class, false, false, false, 14, null)) != null) {
            iPNSDeviceConsentService.LJIILIIL(EnumC1876780ywG.APPROVE, EnumC1915980zxU.HU_CONSENT_SHEET, "hu_consent_sheet", null);
        }
        return C15O7.LJIIJ(Unit.LIZ);
    }
}
