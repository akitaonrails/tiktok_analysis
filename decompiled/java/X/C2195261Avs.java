package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Avs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2195261Avs {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, JSONObject jSONObject) {
        InterfaceC1541990qEH kitView;
        InterfaceC1541990qEH kitView2;
        JSONObject jSONObject2;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
            if (jSONObject == null) {
                jSONObject2 = new JSONObject() { // from class: X.1Avt
                };
            } else {
                jSONObject2 = jSONObject;
            }
            kitView2.LIZ("minis.metaUpdate", jSONObject2);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUpdateMeta, view:");
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
