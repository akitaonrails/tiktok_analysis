package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0TOV, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TOV {
    public static final C0TOV LIZ = new C0TOV();
    public static long LIZIZ;

    public static void LIZ(final Context context, final InterfaceC745990TOb interfaceC745990TOb) {
        C15O7.LIZJ(new Callable() { // from class: X.0TOh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                AdvertisingIdClient.Info infoLIZIZ;
                C1C7U.LIZ("PersonalizationAdPrompt@39a8.getGooglePlayAdSettings$1");
                try {
                    infoLIZIZ = C837870Wtt.LIZIZ(context);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                boolean z = infoLIZIZ != null ? infoLIZIZ.LIZIZ : false;
                Boolean boolValueOf = Boolean.valueOf(z);
                C1C7U.LIZIZ("PersonalizationAdPrompt@39a8.getGooglePlayAdSettings$1");
                return boolValueOf;
            }
        }).LJ(new InterfaceC2385309Wh() { // from class: X.0TOT
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7<Boolean> c15o7) {
                boolean zBooleanValue;
                Boolean bool;
                C1C7U.LIZ("PersonalizationAdPrompt@39a8.getGooglePlayAdSettings$2");
                C19259110Wf c19259110Wf = C746350TPl.LIZ;
                if (c19259110Wf.LJJI == null) {
                    c19259110Wf.LJJI = new C2230608oa<>("opt_out_google_personzalized_ads", Boolean.FALSE);
                }
                c19259110Wf.LJJI.LJ(c15o7.LJIIL());
                C0TOM c0tom = C0TOM.LIZ;
                final boolean zBooleanValue2 = c15o7.LJIIL().booleanValue();
                c0tom.getClass();
                AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
                if (adPersonalitySettingsLIZIZ != null && (bool = adPersonalitySettingsLIZIZ.lat) != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                if (zBooleanValue2 != zBooleanValue) {
                    IComplianceSettingsService iComplianceSettingsServiceLIZLLL = C0TOM.LIZLLL();
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(new JSONObject().put("field", "limit_ad_tracking").put("value", String.valueOf(zBooleanValue2)));
                    iComplianceSettingsServiceLIZLLL.LJIJ(jSONArray.toString(), new InterfaceC191808102c() { // from class: X.0TOJ
                        @Override // X.InterfaceC191808102c
                        public final void LIZJ() {
                        }

                        @Override // X.InterfaceC191808102c
                        public final void onSuccess() {
                            ComplianceSetting complianceSetting;
                            C0TOM.LIZ.getClass();
                            AdPersonalitySettings adPersonalitySettingsLIZIZ2 = C0TOM.LIZIZ();
                            AdPersonalitySettings adPersonalitySettingsCopy = adPersonalitySettingsLIZIZ2 != null ? adPersonalitySettingsLIZIZ2.copy(adPersonalitySettingsLIZIZ2.mode, adPersonalitySettingsLIZIZ2.needPopUp, adPersonalitySettingsLIZIZ2.isFollowSystemConfig, adPersonalitySettingsLIZIZ2.description, adPersonalitySettingsLIZIZ2.title, adPersonalitySettingsLIZIZ2.copyWriting, adPersonalitySettingsLIZIZ2.isShowSettings, adPersonalitySettingsLIZIZ2.showInterestLabel, adPersonalitySettingsLIZIZ2.showInterestItemType, Boolean.valueOf(zBooleanValue2), adPersonalitySettingsLIZIZ2.promptStyle, adPersonalitySettingsLIZIZ2.isNpUser, adPersonalitySettingsLIZIZ2.unifiedMode, adPersonalitySettingsLIZIZ2.isTeenagerMode, adPersonalitySettingsLIZIZ2.isNewUser, adPersonalitySettingsLIZIZ2.PARevisingSwitch, adPersonalitySettingsLIZIZ2.unifiedModeTextData, adPersonalitySettingsLIZIZ2.isShowResetEntry, adPersonalitySettingsLIZIZ2.reset, adPersonalitySettingsLIZIZ2.isUseBalancePrompt, adPersonalitySettingsLIZIZ2.isShowAdvertiserSettings, adPersonalitySettingsLIZIZ2.popUpStyle, adPersonalitySettingsLIZIZ2.contentType, adPersonalitySettingsLIZIZ2.abCopyWriting, adPersonalitySettingsLIZIZ2.subscription, adPersonalitySettingsLIZIZ2.thirdPartyAdConsentPromptConfig, adPersonalitySettingsLIZIZ2.enableToggleDecoupling, adPersonalitySettingsLIZIZ2.hitDisconnectAdvExperiment) : null;
                            IComplianceSettingsService iComplianceSettingsServiceLIZLLL2 = C0TOM.LIZLLL();
                            ComplianceSetting complianceSettingLJIILLIIL = C0TOM.LIZLLL().LJIILLIIL();
                            if (complianceSettingLJIILLIIL == null || (complianceSetting = complianceSettingLJIILLIIL.copy(complianceSettingLJIILLIIL.blackSetting, complianceSettingLJIILLIIL.enableImpressum, complianceSettingLJIILLIIL.impressumUrl, complianceSettingLJIILLIIL.privacyPolicyUrl, adPersonalitySettingsCopy, complianceSettingLJIILLIIL.notifyPrivateAccount, complianceSettingLJIILLIIL.forcePrivateAccount, complianceSettingLJIILLIIL.addTermsConsentForRegister, complianceSettingLJIILLIIL.enableTermsConsentPopup, complianceSettingLJIILLIIL.termsConsentInfo, complianceSettingLJIILLIIL.termConsentInfoNewUsers, complianceSettingLJIILLIIL.complianceEncrypt, complianceSettingLJIILLIIL.ageGateInfo, complianceSettingLJIILLIIL.logPb, complianceSettingLJIILLIIL.legalEntityChangeInfo, complianceSettingLJIILLIIL.afSharingBlock, complianceSettingLJIILLIIL.interfaceControlSettingsString, complianceSettingLJIILLIIL.deviceLimitRegisterExpiredTime, complianceSettingLJIILLIIL.privacyHighlightsForTeensLink, complianceSettingLJIILLIIL.privacyHighlightsType, complianceSettingLJIILLIIL.privateAccountPrompt, complianceSettingLJIILLIIL.privateAccountPromptType, complianceSettingLJIILLIIL.isMixedAge, complianceSettingLJIILLIIL.preferenceSettings, complianceSettingLJIILLIIL.ageVerificationAction, complianceSettingLJIILLIIL.notifyParentsWithEmail, complianceSettingLJIILLIIL.ageGraduationScenes, complianceSettingLJIILLIIL.stopAutoPlayTimesThreshold)) == null) {
                                complianceSetting = new ComplianceSetting(null, 0, null, null, adPersonalitySettingsCopy, 0, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, null, null, null, null, null, null, Boolean.FALSE, null, 0L, "", 0, 0, 0, 0, null, false, false, new LinkedHashMap(), 0);
                            }
                            iComplianceSettingsServiceLIZLLL2.LJJIIJ(complianceSetting);
                        }
                    });
                }
                InterfaceC745990TOb interfaceC745990TOb2 = interfaceC745990TOb;
                if (interfaceC745990TOb2 != null) {
                    interfaceC745990TOb2.LIZ(c15o7.LJIIL().booleanValue());
                }
                C1C7U.LIZIZ("PersonalizationAdPrompt@39a8.getGooglePlayAdSettings$2");
                return null;
            }
        }, C15O7.LJIIIIZZ, null);
    }
}
