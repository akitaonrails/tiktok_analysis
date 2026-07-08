package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1B9l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2200271B9l {
    public static String LIZ;

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

    public static void LIZIZ(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void LIZJ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static JSONObject LJ(JSONObject jSONObject) {
        Iterator<String> itKeys;
        if (jSONObject == null || (itKeys = jSONObject.keys()) == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        while (itKeys.hasNext()) {
            linkedList.add(itKeys.next());
        }
        try {
            return new JSONObject(jSONObject, (String[]) linkedList.toArray(new String[0]));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2209791BeD.LJIJJ().LJIILL("copyJson failed", e, new Object[0]);
            return jSONObject;
        }
    }

    public static void LJFF(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            try {
                if (sQLiteDatabase.inTransaction()) {
                    sQLiteDatabase.endTransaction();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C2209791BeD.LJIJJ().LJIILL("end transaction failed", th, new Object[0]);
            }
        }
    }

    public static boolean LJI(String str) {
        return !LJII(str);
    }

    public static boolean LJII(String str) {
        if (str != null && str.length() > 0) {
            return true;
        }
        return false;
    }

    public static void LIZLLL(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 != null) {
            try {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObject2.opt(next));
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                C2209791BeD.LJIJJ().LJIILL("copy failed", e, new Object[0]);
            }
        }
    }

    public static long LJIIIIZZ(String str, JSONObject jSONObject) {
        try {
            return CastLongProtector.parseLong(jSONObject.optString(str));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0L;
        }
    }
}
