package X;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.Random;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08Ic, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2093608Ic {
    public static String LIZIZ(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            byte[] bytes = str.getBytes("UTF-8");
            for (int i = 0; i < bytes.length; i++) {
                bytes[i] = (byte) (bytes[i] ^ 5);
            }
            return C08HM.LJFF(bytes, bytes.length);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return str;
        }
    }

    public static String LIZLLL(String str) {
        if (!LJ(str)) {
            try {
                str = str.replace("[ss_random]", String.valueOf(new Random().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
                return str;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return str;
    }

    public static boolean LJ(String str) {
        if (str != null && str.length() != 0) {
            return false;
        }
        return true;
    }

    public static String LJFF(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                String str2 = map.get(str);
                if (!LJ(str) && !LJ(str2)) {
                    jSONObject.put(str, str2);
                }
            }
            return C786410Ut5.J3(jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static String LIZ(String str, Boolean... boolArr) {
        byte[] bArrLIZ;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (boolArr.length > 0 && boolArr[0].booleanValue()) {
                bArrLIZ = Base64.decode(str, 0);
            } else {
                bArrLIZ = C08HM.LIZ(str);
            }
            for (int i = 0; i < bArrLIZ.length; i++) {
                bArrLIZ[i] = (byte) (bArrLIZ[i] ^ 5);
            }
            return new String(bArrLIZ, 0, bArrLIZ.length, "UTF-8");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return str;
        }
    }

    public static boolean LIZJ(String str, String str2) {
        if (!LJ(str) || !LJ(str2)) {
            if (str != null && str.equals(str2)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
