package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14Cf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20226314Cf {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
        InterfaceC1541990qEH kitView;
        InterfaceC1541990qEH kitView2;
        JSONObject jSONObject = new JSONObject();
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
            kitView2.LIZ("minis.hide", jSONObject);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMinisHide, view:");
        sbLIZ.append(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        sbLIZ.append(", kitView:");
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView();
        } else {
            kitView = null;
        }
        sbLIZ.append(kitView);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZ(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, JSONObject jSONObject) {
        InterfaceC1541990qEH kitView;
        InterfaceC1541990qEH kitView2;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
            kitView2.LIZ("minis.onLoad", jSONObject);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoad, view:");
        sbLIZ.append(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        sbLIZ.append(", kitView:");
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView();
        } else {
            kitView = null;
        }
        sbLIZ.append(kitView);
        sbLIZ.append(", isHotLoad:");
        sbLIZ.append(jSONObject.get("isHotLoad"));
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZJ(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, SchemaParserData schemaParserData, boolean z) {
        Map<String, String> map;
        InterfaceC1541990qEH kitView;
        InterfaceC1541990qEH kitView2 = null;
        if (schemaParserData != null) {
            map = schemaParserData.paramsMap;
        } else {
            map = null;
        }
        C1227904rF.LIZ.getClass();
        String strLJI = C1227904rF.LJI(map);
        JSONObject jSONObject = new JSONObject();
        if (z && C123100dR.LIZ(strLJI)) {
            try {
                JSONObject jSONObject2 = new JSONObject(strLJI);
                if (jSONObject2.length() != 0) {
                    jSONObject.put("query", jSONObject2);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
            kitView.LIZ("minis.show", jSONObject);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMinisShow, view:");
        sbLIZ.append(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        sbLIZ.append(", kitView:");
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            kitView2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView();
        }
        sbLIZ.append(kitView2);
        sbLIZ.append(", paramsJson:");
        sbLIZ.append(jSONObject);
        sbLIZ.append(", passQueryMap:");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
