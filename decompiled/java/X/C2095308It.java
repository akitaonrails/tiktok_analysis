package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08It, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2095308It {
    public static boolean LIZ;

    public static void LIZ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static String LIZJ(C0VSJ c0vsj) {
        BufferedReader bufferedReader;
        if (!c0vsj.exists()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        try {
            bufferedReader = new BufferedReader(new C0VSF(c0vsj));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                } catch (Throwable th) {
                    th = th;
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        LIZ(bufferedReader);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        LIZ(bufferedReader);
                        throw th2;
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
        }
        LIZ(bufferedReader);
        return sb.toString();
    }

    public static void LIZIZ(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null && jSONObject2.length() > 0) {
            try {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object objOpt = jSONObject.opt(next);
                    if (objOpt == null) {
                        jSONObject.put(next, jSONObject2.opt(next));
                    } else if (objOpt instanceof JSONObject) {
                        LIZIZ(JSONObjectProtectorUtils.getJSONObject(jSONObject, next), JSONObjectProtectorUtils.getJSONObject(jSONObject2, next));
                    } else if (objOpt instanceof JSONArray) {
                        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray(next);
                        if (jSONArrayOptJSONArray != null) {
                            JSONArray jSONArray = (JSONArray) objOpt;
                            if (jSONArray.length() == 1 && (jSONArray.opt(0) instanceof JSONObject) && (jSONArrayOptJSONArray.opt(0) instanceof JSONObject)) {
                                LIZIZ(JSONArrayProtectorUtils.getJSONObject(jSONArray, 0), JSONArrayProtectorUtils.getJSONObject(jSONArrayOptJSONArray, 0));
                            } else {
                                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                                    jSONArray.put(jSONArrayOptJSONArray.get(i));
                                }
                            }
                        }
                    } else {
                        jSONObject.put(next, jSONObject2.opt(next));
                    }
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static void LIZLLL(C0VSJ c0vsj, String str) {
        C0VSV c0vsv;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c0vsj.getParentFile().mkdirs();
        try {
            c0vsv = new C0VSV((File) c0vsj, false);
        } catch (Throwable th) {
            th = th;
            c0vsv = null;
        }
        try {
            c0vsv.write(str.getBytes());
            c0vsv.flush();
        } catch (Throwable th2) {
            th = th2;
            try {
                TryCatchGuardChecker.doCheck(th);
                LIZ(c0vsv);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                LIZ(c0vsv);
                throw th3;
            }
        }
        LIZ(c0vsv);
    }
}
