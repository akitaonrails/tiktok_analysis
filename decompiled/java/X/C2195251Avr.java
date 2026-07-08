package X;

import com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Avr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2195251Avr {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, IMiniGameRuntimeAPI iMiniGameRuntimeAPI, JSONObject jSONObject) {
        InterfaceC1541990qEH kitView;
        InterfaceC1541990qEH kitView2;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
            kitView2.LIZ("minis.rewardedVideoAdClose", jSONObject);
        }
        if (iMiniGameRuntimeAPI != null) {
            iMiniGameRuntimeAPI.emitJSAPIEvent("minis.rewardedVideoAdClose", jSONObject);
        }
        AnonymousClass1521 anonymousClass1521LJ = C2195221Avo.LJ();
        if (anonymousClass1521LJ != null) {
            anonymousClass1521LJ.LIZ("minis.rewardedVideoAdClose", jSONObject);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRewardedVideoClose, view:");
        sbLIZ.append(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        sbLIZ.append(", kitView:");
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView();
        } else {
            kitView = null;
        }
        sbLIZ.append(kitView);
        sbLIZ.append("， eventParams:");
        sbLIZ.append(jSONObject);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZIZ(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, IMiniGameRuntimeAPI iMiniGameRuntimeAPI, JSONObject jSONObject) {
        InterfaceC1541990qEH kitView;
        InterfaceC1541990qEH kitView2;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
            kitView2.LIZ("minis.rewardedVideoAdError", jSONObject);
        }
        if (iMiniGameRuntimeAPI != null) {
            iMiniGameRuntimeAPI.emitJSAPIEvent("minis.rewardedVideoAdError", jSONObject);
        }
        AnonymousClass1521 anonymousClass1521LJ = C2195221Avo.LJ();
        if (anonymousClass1521LJ != null) {
            anonymousClass1521LJ.LIZ("minis.rewardedVideoAdError", jSONObject);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRewardedVideoError, view:");
        sbLIZ.append(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        sbLIZ.append(", kitView:");
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView();
        } else {
            kitView = null;
        }
        sbLIZ.append(kitView);
        sbLIZ.append("， eventParams:");
        sbLIZ.append(jSONObject);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
