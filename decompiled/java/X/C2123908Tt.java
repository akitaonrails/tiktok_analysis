package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08Tt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2123908Tt {
    public static String LIZ;
    public static volatile Boolean LIZIZ;

    static {
        "0123456789ABCDEF".toCharArray();
    }

    public static boolean LIZ(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str) || "unknown".equalsIgnoreCase(str) || "Null".equalsIgnoreCase(str)) {
            return false;
        }
        int i = 0;
        while (true) {
            if (i < str.length()) {
                if (str.charAt(i) != '0') {
                    break;
                }
                i++;
            } else {
                z = true;
                break;
            }
        }
        return !z;
    }

    public static void LIZIZ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(3:59|25|(2:26|(2:28|(1:61)(1:62))(0)))|55|33|53|34|(5:35|(1:37)(1:63)|57|45|48)|38|57|45|48) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008f, code lost:
    
        X.C2123908Tt.LIZ = r1.processName;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e5, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZLLL(android.content.Context r6) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2123908Tt.LIZLLL(android.content.Context):boolean");
    }

    public static boolean LJ(String str) {
        int length;
        if (str == null || (length = str.length()) < 13 || length > 128) {
            return false;
        }
        int i = 0;
        do {
            char cCharAt = str.charAt(i);
            if (cCharAt >= '0') {
                if (cCharAt > '9') {
                    if (cCharAt >= 'a') {
                        if (cCharAt > 'f') {
                            return false;
                        }
                    } else if (cCharAt >= 'A') {
                        if (cCharAt > 'F') {
                            return false;
                        }
                    }
                }
                i++;
            }
            if (cCharAt != '-') {
                return false;
            }
            i++;
        } while (i < length);
        return true;
    }

    public static void LIZJ(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        try {
            synchronized (C0XBM.class) {
                try {
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.put(next, jSONObject2.opt(next));
                    }
                } finally {
                }
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C844830XCf.LIZLLL(e);
        }
    }

    public static void LJI(SharedPreferences sharedPreferences, String[] strArr) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        boolean z = false;
        for (String str : strArr) {
            if (sharedPreferences.contains(str)) {
                editorEdit.remove(str);
                z = true;
            }
        }
        if (z) {
            editorEdit.apply();
        }
    }

    public static void LJFF(String str, String str2, JSONObject jSONObject) throws JSONException {
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put(str, str2);
        }
    }
}
