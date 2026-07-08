package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kod, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1333890kod {
    public static final C1333890kod LIZ = new C1333890kod();
    public static final C054G LIZIZ = C2296808zG.LIZ(C0PEM.LIZJ);

    public static void LIZ(JSONObject jSONObject, JSONObject jSONObject2) {
        double d;
        double d2;
        double dDoubleValue;
        double dDoubleValue2;
        if (jSONObject == null) {
            return;
        }
        try {
            long jOptLong = jSONObject.optLong("applied_image_px_count", -1L);
            long jOptLong2 = jSONObject.optLong("view_needed_image_px_count", -1L);
            String strOptString = jSONObject.optString("applied_image_size", "");
            String strOptString2 = jSONObject.optString("view_size", "");
            String strOptString3 = jSONObject.optString("intended_image_size", "");
            if (jOptLong > 0 && jOptLong2 > 0) {
                double d3 = jOptLong2;
                d = (jOptLong - jOptLong2) / d3;
                d2 = d3 / jOptLong;
            } else {
                d = -1.0d;
                d2 = -1.0d;
            }
            Locale locale = Locale.US;
            Double dLJII = C2327809Ae.LJII(C786410Ut5.k4(locale, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1)));
            if (dLJII != null) {
                dDoubleValue = dLJII.doubleValue();
            } else {
                dDoubleValue = -1.0d;
            }
            Double dLJII2 = C2327809Ae.LJII(C786410Ut5.k4(locale, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d2)}, 1)));
            if (dLJII2 != null) {
                dDoubleValue2 = dLJII2.doubleValue();
            } else {
                dDoubleValue2 = -1.0d;
            }
            jSONObject2.put("image_waste_rate", dDoubleValue);
            jSONObject2.put("image_utilization_rate", dDoubleValue2);
            jSONObject2.put("applied_image_px", jOptLong);
            jSONObject2.put("view_needed_px", jOptLong2);
            jSONObject2.put("applied_image_size", strOptString);
            jSONObject2.put("view_size", strOptString2);
            jSONObject2.put("intended_size", strOptString3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
