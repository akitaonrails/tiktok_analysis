package X;

import android.os.Build;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0y02, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1840680y02 {
    public static final C1840680y02 LIZ = new C1840680y02();

    public static void LIZ(JSONObject jSONObject) throws JSONException {
        jSONObject.put("widget_name", "bonus");
        jSONObject.put("os_type", "android");
        String str = Build.VERSION.RELEASE;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        jSONObject.put("os_version", str);
        String string = Keva.getRepo("keva_repo_bonus_widget").getString("last_install_track_info", "");
        if (string != null) {
            str2 = string;
        }
        if (str2.length() != 0) {
            try {
                JSONObject jSONObject2 = new JSONObject(str2);
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObject2.get(next));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void LIZIZ(JSONObject jSONObject) throws JSONException {
        String str;
        String str2;
        String strOptString;
        String strOptString2;
        long jLongValue;
        Keva repo = Keva.getRepo("keva_repo_bonus_widget");
        String str3 = "";
        String string = repo.getString("bubble_info", "");
        if (string == null) {
            string = "";
        }
        JSONArray jSONArrayLIZJ = LIZJ(string);
        String string2 = repo.getString("logistic_info", "");
        if (string2 == null) {
            string2 = "";
        }
        JSONArray jSONArrayLIZJ2 = LIZJ(string2);
        if (jSONArrayLIZJ2.length() > 0) {
            str = "bonus&logistics";
        } else {
            str = "bonus";
        }
        jSONObject.put("widget_content_type", str);
        if (jSONArrayLIZJ.length() > 0) {
            str2 = "unclaimed";
        } else {
            str2 = "claimed";
        }
        jSONObject.put("bonus_status", str2);
        int length = jSONArrayLIZJ.length();
        if (length > 2) {
            length = 2;
        }
        jSONObject.put("bubble_cnt", length);
        int length2 = jSONArrayLIZJ.length();
        int i = 0;
        long j = 0;
        for (int i2 = 0; i2 < length2; i2++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayLIZJ.optJSONObject(i2);
            if (jSONObjectOptJSONObject == null || (strOptString2 = jSONObjectOptJSONObject.optString("bonus_amount", "")) == null) {
                strOptString2 = "";
            }
            Long lLJIILIIL = C2095008Iq.LJIILIIL(a0.LJLIIIL(strOptString2).toString());
            if (lLJIILIIL != null) {
                jLongValue = lLJIILIIL.longValue();
            } else {
                jLongValue = 0;
            }
            j += jLongValue;
        }
        jSONObject.put("reward_amount", j);
        JSONObject jSONObjectOptJSONObject2 = jSONArrayLIZJ2.optJSONObject(0);
        if (jSONObjectOptJSONObject2 != null && (strOptString = jSONObjectOptJSONObject2.optString("logistic_title", "")) != null) {
            str3 = strOptString;
        }
        jSONObject.put("logistics_status", str3);
        jSONObject.put("package_cnt", jSONArrayLIZJ2.length());
        if (jSONArrayLIZJ2.length() > 1) {
            i = 1;
        }
        jSONObject.put("is_scroll_card", i);
    }

    public static JSONArray LIZJ(String str) {
        boolean z;
        try {
            if (str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return new JSONArray();
            }
            return new JSONArray(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return new JSONArray();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000e A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0013, B:6:0x000e), top: B:12:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(java.lang.String r2, java.lang.String r3) {
        /*
            if (r2 == 0) goto Le
            int r0 = r2.length()     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto Le
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1d
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1d
            goto L13
        Le:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1d
            r0.<init>()     // Catch: java.lang.Throwable -> L1d
        L13:
            java.lang.String r1 = "install_type"
            r0.remove(r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r2 = X.C786410Ut5.J3(r0)     // Catch: java.lang.Throwable -> L1d
            goto L23
        L1d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r2 = "{}"
        L23:
            java.lang.String r0 = "keva_repo_bonus_widget"
            com.bytedance.keva.Keva r1 = com.bytedance.keva.Keva.getRepo(r0)
            java.lang.String r0 = "last_install_track_info"
            r1.storeString(r0, r2)
            java.lang.String r0 = "pending_install_type"
            r1.storeString(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1840680y02.LIZLLL(java.lang.String, java.lang.String):void");
    }
}
