package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01i4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C406601i4 {
    public static int LIZIZ(int i) {
        if (i == -1) {
            return 0;
        }
        if (i == 0) {
            return 20;
        }
        int i2 = 1;
        if (i != 2) {
            if (i == 3) {
                return 2;
            }
            if (i == 1) {
                return 3;
            }
            i2 = 4;
            if (i != 4) {
                return -1;
            }
        }
        return i2;
    }

    public static String LIZ(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                    jSONObject.put(key, value);
                }
            }
            return C786410Ut5.J3(jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void LIZJ(String str, Map map) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String string = JSONObjectProtectorUtils.getString(jSONObject, next);
                    if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string)) {
                        ((HashMap) map).put(next, string);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
