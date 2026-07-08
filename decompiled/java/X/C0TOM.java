package X;

import android.app.Activity;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeSubscription;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0TOM, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TOM {
    public static final C0TOM LIZ = new C0TOM();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C0TOO());

    public static IComplianceSettingsService LIZLLL() {
        return (IComplianceSettingsService) LIZIZ.getValue();
    }

    public static int LIZ() {
        Integer num;
        AdPersonalitySettings adPersonalitySettingsLIZIZ = LIZIZ();
        if (adPersonalitySettingsLIZIZ == null || (num = adPersonalitySettingsLIZIZ.mode) == null) {
            return 0;
        }
        return num.intValue();
    }

    public static AdPersonalitySettings LIZIZ() {
        return LIZLLL().LJIIL();
    }

    public static int LIZJ() {
        Integer num;
        AdPersonalitySettings adPersonalitySettingsLIZIZ = LIZIZ();
        if (adPersonalitySettingsLIZIZ == null || (num = adPersonalitySettingsLIZIZ.unifiedMode) == null) {
            return 0;
        }
        return num.intValue();
    }

    public static AdFreeSubscription LJ() {
        AdPersonalitySettings adPersonalitySettingsLJIIL = LIZLLL().LJIIL();
        if (adPersonalitySettingsLJIIL != null) {
            return adPersonalitySettingsLJIIL.subscription;
        }
        return null;
    }

    public static Integer LJFF() {
        AdPersonalitySettings adPersonalitySettingsLIZIZ = LIZIZ();
        if (adPersonalitySettingsLIZIZ != null) {
            return adPersonalitySettingsLIZIZ.popUpStyle;
        }
        return null;
    }

    public static int LJI() {
        Integer numIsTeenagerMode;
        AdPersonalitySettings adPersonalitySettingsLIZIZ = LIZIZ();
        if (adPersonalitySettingsLIZIZ == null || (numIsTeenagerMode = adPersonalitySettingsLIZIZ.isTeenagerMode()) == null) {
            return 1;
        }
        return numIsTeenagerMode.intValue();
    }

    public static boolean LJII() {
        ComplianceSetting complianceSettingLJIILLIIL;
        AdPersonalitySettings adPersonalitySettings;
        Boolean bool;
        IComplianceSettingsService iComplianceSettingsServiceLIZLLL = LIZLLL();
        if (iComplianceSettingsServiceLIZLLL == null || (complianceSettingLJIILLIIL = iComplianceSettingsServiceLIZLLL.LJIILLIIL()) == null || (adPersonalitySettings = complianceSettingLJIILLIIL.getAdPersonalitySettings()) == null || (bool = adPersonalitySettings.hitDisconnectAdvExperiment) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static boolean LJIIIIZZ() {
        AdPersonalitySettings adPersonalitySettingsLIZIZ = LIZIZ();
        if (adPersonalitySettingsLIZIZ != null) {
            return Intrinsics.LJFF(adPersonalitySettingsLIZIZ.getPARevisingSwitch(), Boolean.FALSE);
        }
        return false;
    }

    public static boolean LJIIIZ() {
        Boolean boolIsUseBalancePrompt;
        AdPersonalitySettings adPersonalitySettingsLIZIZ = LIZIZ();
        if (adPersonalitySettingsLIZIZ == null || (boolIsUseBalancePrompt = adPersonalitySettingsLIZIZ.isUseBalancePrompt()) == null) {
            return false;
        }
        return boolIsUseBalancePrompt.booleanValue();
    }

    public static void LJIIJ(final Activity activity, boolean z) {
        final int i;
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(new JSONObject().put("field", "pers_ad_unified_mode").put("value", String.valueOf(i)));
        LIZLLL().LJIJ(jSONArray.toString(), new InterfaceC191808102c() { // from class: X.0TOI
            @Override // X.InterfaceC191808102c
            public final void LIZJ() {
                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                c1389890mGx.LJIIIZ(2131834365);
                c1389890mGx.LJIIJJI();
            }

            @Override // X.InterfaceC191808102c
            public final void onSuccess() {
                ComplianceSetting complianceSetting;
                C0TOM.LIZ.getClass();
                AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
                AdPersonalitySettings adPersonalitySettingsCopy = adPersonalitySettingsLIZIZ != null ? adPersonalitySettingsLIZIZ.copy(adPersonalitySettingsLIZIZ.mode, adPersonalitySettingsLIZIZ.needPopUp, adPersonalitySettingsLIZIZ.isFollowSystemConfig, adPersonalitySettingsLIZIZ.description, adPersonalitySettingsLIZIZ.title, adPersonalitySettingsLIZIZ.copyWriting, adPersonalitySettingsLIZIZ.isShowSettings, adPersonalitySettingsLIZIZ.showInterestLabel, adPersonalitySettingsLIZIZ.showInterestItemType, adPersonalitySettingsLIZIZ.lat, adPersonalitySettingsLIZIZ.promptStyle, adPersonalitySettingsLIZIZ.isNpUser, Integer.valueOf(i), adPersonalitySettingsLIZIZ.isTeenagerMode, adPersonalitySettingsLIZIZ.isNewUser, adPersonalitySettingsLIZIZ.PARevisingSwitch, adPersonalitySettingsLIZIZ.unifiedModeTextData, adPersonalitySettingsLIZIZ.isShowResetEntry, adPersonalitySettingsLIZIZ.reset, adPersonalitySettingsLIZIZ.isUseBalancePrompt, adPersonalitySettingsLIZIZ.isShowAdvertiserSettings, adPersonalitySettingsLIZIZ.popUpStyle, adPersonalitySettingsLIZIZ.contentType, adPersonalitySettingsLIZIZ.abCopyWriting, adPersonalitySettingsLIZIZ.subscription, adPersonalitySettingsLIZIZ.thirdPartyAdConsentPromptConfig, adPersonalitySettingsLIZIZ.enableToggleDecoupling, adPersonalitySettingsLIZIZ.hitDisconnectAdvExperiment) : null;
                IComplianceSettingsService iComplianceSettingsServiceLIZLLL = C0TOM.LIZLLL();
                ComplianceSetting complianceSettingLJIILLIIL = C0TOM.LIZLLL().LJIILLIIL();
                if (complianceSettingLJIILLIIL == null || (complianceSetting = complianceSettingLJIILLIIL.copy(complianceSettingLJIILLIIL.blackSetting, complianceSettingLJIILLIIL.enableImpressum, complianceSettingLJIILLIIL.impressumUrl, complianceSettingLJIILLIIL.privacyPolicyUrl, adPersonalitySettingsCopy, complianceSettingLJIILLIIL.notifyPrivateAccount, complianceSettingLJIILLIIL.forcePrivateAccount, complianceSettingLJIILLIIL.addTermsConsentForRegister, complianceSettingLJIILLIIL.enableTermsConsentPopup, complianceSettingLJIILLIIL.termsConsentInfo, complianceSettingLJIILLIIL.termConsentInfoNewUsers, complianceSettingLJIILLIIL.complianceEncrypt, complianceSettingLJIILLIIL.ageGateInfo, complianceSettingLJIILLIIL.logPb, complianceSettingLJIILLIIL.legalEntityChangeInfo, complianceSettingLJIILLIIL.afSharingBlock, complianceSettingLJIILLIIL.interfaceControlSettingsString, complianceSettingLJIILLIIL.deviceLimitRegisterExpiredTime, complianceSettingLJIILLIIL.privacyHighlightsForTeensLink, complianceSettingLJIILLIIL.privacyHighlightsType, complianceSettingLJIILLIIL.privateAccountPrompt, complianceSettingLJIILLIIL.privateAccountPromptType, complianceSettingLJIILLIIL.isMixedAge, complianceSettingLJIILLIIL.preferenceSettings, complianceSettingLJIILLIIL.ageVerificationAction, complianceSettingLJIILLIIL.notifyParentsWithEmail, complianceSettingLJIILLIIL.ageGraduationScenes, complianceSettingLJIILLIIL.stopAutoPlayTimesThreshold)) == null) {
                    complianceSetting = new ComplianceSetting(null, 0, null, null, adPersonalitySettingsCopy, 0, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, null, null, null, null, null, null, Boolean.FALSE, null, 0L, "", 0, 0, 0, 0, null, false, false, new LinkedHashMap(), 0);
                }
                iComplianceSettingsServiceLIZLLL.LJJIIJ(complianceSetting);
                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                c1389890mGx.LJIIIZ(2131845034);
                c1389890mGx.LJIIJJI();
            }
        });
    }

    public static void LJIIJJI(String str, boolean z) {
        final int i;
        String str2;
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(new JSONObject().put("field", "pers_ad_main_mode").put("value", String.valueOf(i)));
        C2344009Gk c2344009Gk = new C2344009Gk();
        String str3 = "on";
        if (!z) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        c2344009Gk.LJIIIIZZ("initial_status", str2);
        if (!z) {
            str3 = "off";
        }
        c2344009Gk.LJIIIIZZ("final_status", str3);
        C20684815ws.LJIILLIIL("change_personalization_status", c2344009Gk.LIZ);
        if (!Intrinsics.LJFF("", "")) {
            jSONArray.put(new JSONObject().put("field", "").put("value", str));
        }
        LIZLLL().LJIJ(jSONArray.toString(), new InterfaceC191808102c() { // from class: X.0TOH
            @Override // X.InterfaceC191808102c
            public final void onSuccess() {
                ComplianceSetting complianceSetting;
                C0TOM.LIZ.getClass();
                AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
                AdPersonalitySettings adPersonalitySettingsCopy = adPersonalitySettingsLIZIZ != null ? adPersonalitySettingsLIZIZ.copy(Integer.valueOf(i), adPersonalitySettingsLIZIZ.needPopUp, adPersonalitySettingsLIZIZ.isFollowSystemConfig, adPersonalitySettingsLIZIZ.description, adPersonalitySettingsLIZIZ.title, adPersonalitySettingsLIZIZ.copyWriting, adPersonalitySettingsLIZIZ.isShowSettings, adPersonalitySettingsLIZIZ.showInterestLabel, adPersonalitySettingsLIZIZ.showInterestItemType, adPersonalitySettingsLIZIZ.lat, adPersonalitySettingsLIZIZ.promptStyle, adPersonalitySettingsLIZIZ.isNpUser, adPersonalitySettingsLIZIZ.unifiedMode, adPersonalitySettingsLIZIZ.isTeenagerMode, adPersonalitySettingsLIZIZ.isNewUser, adPersonalitySettingsLIZIZ.PARevisingSwitch, adPersonalitySettingsLIZIZ.unifiedModeTextData, adPersonalitySettingsLIZIZ.isShowResetEntry, adPersonalitySettingsLIZIZ.reset, adPersonalitySettingsLIZIZ.isUseBalancePrompt, adPersonalitySettingsLIZIZ.isShowAdvertiserSettings, adPersonalitySettingsLIZIZ.popUpStyle, adPersonalitySettingsLIZIZ.contentType, adPersonalitySettingsLIZIZ.abCopyWriting, adPersonalitySettingsLIZIZ.subscription, adPersonalitySettingsLIZIZ.thirdPartyAdConsentPromptConfig, adPersonalitySettingsLIZIZ.enableToggleDecoupling, adPersonalitySettingsLIZIZ.hitDisconnectAdvExperiment) : null;
                IComplianceSettingsService iComplianceSettingsServiceLIZLLL = C0TOM.LIZLLL();
                ComplianceSetting complianceSettingLJIILLIIL = C0TOM.LIZLLL().LJIILLIIL();
                if (complianceSettingLJIILLIIL == null || (complianceSetting = complianceSettingLJIILLIIL.copy(complianceSettingLJIILLIIL.blackSetting, complianceSettingLJIILLIIL.enableImpressum, complianceSettingLJIILLIIL.impressumUrl, complianceSettingLJIILLIIL.privacyPolicyUrl, adPersonalitySettingsCopy, complianceSettingLJIILLIIL.notifyPrivateAccount, complianceSettingLJIILLIIL.forcePrivateAccount, complianceSettingLJIILLIIL.addTermsConsentForRegister, complianceSettingLJIILLIIL.enableTermsConsentPopup, complianceSettingLJIILLIIL.termsConsentInfo, complianceSettingLJIILLIIL.termConsentInfoNewUsers, complianceSettingLJIILLIIL.complianceEncrypt, complianceSettingLJIILLIIL.ageGateInfo, complianceSettingLJIILLIIL.logPb, complianceSettingLJIILLIIL.legalEntityChangeInfo, complianceSettingLJIILLIIL.afSharingBlock, complianceSettingLJIILLIIL.interfaceControlSettingsString, complianceSettingLJIILLIIL.deviceLimitRegisterExpiredTime, complianceSettingLJIILLIIL.privacyHighlightsForTeensLink, complianceSettingLJIILLIIL.privacyHighlightsType, complianceSettingLJIILLIIL.privateAccountPrompt, complianceSettingLJIILLIIL.privateAccountPromptType, complianceSettingLJIILLIIL.isMixedAge, complianceSettingLJIILLIIL.preferenceSettings, complianceSettingLJIILLIIL.ageVerificationAction, complianceSettingLJIILLIIL.notifyParentsWithEmail, complianceSettingLJIILLIIL.ageGraduationScenes, complianceSettingLJIILLIIL.stopAutoPlayTimesThreshold)) == null) {
                    complianceSetting = new ComplianceSetting(null, 0, null, null, adPersonalitySettingsCopy, 0, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, null, null, null, null, null, null, Boolean.FALSE, null, 0L, "", 0, 0, 0, 0, null, false, false, new LinkedHashMap(), 0);
                }
                iComplianceSettingsServiceLIZLLL.LJJIIJ(complianceSetting);
                Activity activityLJFF = C2214201BlK.LJFF();
                if (activityLJFF != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(activityLJFF);
                    c1389890mGx.LJIIIZ(2131845034);
                    c1389890mGx.LJIIJJI();
                }
            }

            @Override // X.InterfaceC191808102c
            public final void LIZJ() {
                Activity activityLJFF = C2214201BlK.LJFF();
                if (activityLJFF != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(activityLJFF);
                    c1389890mGx.LJIIIZ(2131834365);
                    c1389890mGx.LJIIJJI();
                }
            }
        });
    }
}
