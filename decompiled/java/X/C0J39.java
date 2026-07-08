package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0J39, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J39 {
    public static final boolean LIZ(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
        if (!C1542210qEd.LIZ(Integer.valueOf(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getOptimization())) && !C1542210qEd.LIZIZ(Integer.valueOf(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getOptimization()))) {
            return false;
        }
        return true;
    }

    public static final void LIZIZ(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
        SparkSchemaParam sparkSchemaParamLJJJI;
        SparkContext sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext();
        if (sparkContext != null) {
            C1529880puk c1529880puk = SparkContext.Companion;
            sparkSchemaParamLJJJI = sparkContext.LJJJI(-1);
        } else {
            sparkSchemaParamLJJJI = null;
        }
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIJIIJIL(sparkContext, sparkSchemaParamLJJJI);
    }

    public static final void LIZJ(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, String str, JSONObject jSONObject) {
        InterfaceC1541990qEH kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView();
        if (kitView != null) {
            kitView.LIZ(str, jSONObject);
        }
    }
}
