package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uUX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1705830uUX<T> {
    public static JSONObject LIZ(Effect effect) {
        String extra = effect.getExtra();
        if (extra != null && extra.length() != 0) {
            String extra2 = effect.getExtra();
            if (extra2 == null) {
                extra2 = "";
            }
            return new JSONObject(extra2);
        }
        return null;
    }

    public static String LIZIZ(List list) {
        if (!list.isEmpty()) {
            return (String) ListProtector.get(list, 0);
        }
        return "";
    }

    public static String LIZJ(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            try {
                return JSONObjectProtectorUtils.getString(jSONObject, str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0024 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZLLL(X.AbstractC1705800uUU r1, java.lang.String r2, java.lang.String r3) {
        /*
            r1.getClass()
            java.lang.String r1 = ""
            if (r2 == 0) goto L25
            int r0 = r2.length()
            if (r0 != 0) goto L11
            r0 = 1
        Le:
            if (r0 != 0) goto L21
            goto L13
        L11:
            r0 = 0
            goto Le
        L13:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1d
            r0.<init>(r2)     // Catch: java.lang.Exception -> L1d
            java.lang.String r0 = r0.optString(r3, r1)     // Catch: java.lang.Exception -> L1d
            goto L22
        L1d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L21:
            r0 = r1
        L22:
            if (r0 == 0) goto L25
            return r0
        L25:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1705830uUX.LIZLLL(X.0uUU, java.lang.String, java.lang.String):java.lang.String");
    }
}
