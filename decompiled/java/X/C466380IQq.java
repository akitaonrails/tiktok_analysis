package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0IQq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C466380IQq {
    public static volatile C466380IQq LIZ;
    public static final C1143300frE LIZIZ = C1143300frE.LJIIJJI();

    public static C466380IQq LIZIZ() {
        if (LIZ == null) {
            synchronized (C466380IQq.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new C466380IQq();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }

    public static JSONObject LIZJ(Map map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            try {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(int r6, android.view.ViewGroup r7) {
        /*
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            if (r7 != 0) goto Lc
            java.lang.String r0 = r4.toString()
            return r0
        Lc:
            r3 = 0
        Ld:
            int r0 = r7.getChildCount()
            if (r3 >= r0) goto L86
            android.view.View r5 = r7.getChildAt(r3)
            java.lang.String r0 = "|index:"
            r4.append(r0)
            r4.append(r6)
            r4.append(r3)
            boolean r0 = r5 instanceof android.widget.TextView
            java.lang.String r1 = ""
            if (r0 == 0) goto L84
            r0 = r5
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r2 = r0.toString()
        L33:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L41
            java.lang.String r0 = "|text:"
            r4.append(r0)
            r4.append(r2)
        L41:
            if (r5 == 0) goto L7e
            java.lang.Object r0 = r5.getTag()
            if (r0 != 0) goto L7f
            r0 = r1
        L4a:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L58
            java.lang.String r0 = "|tag:"
            r4.append(r0)
            r4.append(r2)
        L58:
            if (r5 == 0) goto L60
            java.lang.CharSequence r1 = r5.getContentDescription()
            java.lang.String r1 = (java.lang.String) r1
        L60:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L6e
            java.lang.String r0 = "|description:"
            r4.append(r0)
            r4.append(r1)
        L6e:
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L7b
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            java.lang.String r0 = LIZ(r3, r5)
            r4.append(r0)
        L7b:
            int r3 = r3 + 1
            goto Ld
        L7e:
            r0 = r1
        L7f:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L4a
        L84:
            r2 = r1
            goto L33
        L86:
            java.lang.String r0 = r4.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C466380IQq.LIZ(int, android.view.ViewGroup):java.lang.String");
    }

    public static void LIZLLL(String str, String str2, Map map) {
        LJ(str, LIZJ(map), str2, 1);
    }

    public static void LJFF(String str, String str2, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put(str, str2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJ(String str, JSONObject jSONObject, String str2, int i) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(C786410Ut5.J3(jSONObject));
            LJFF("service", str2, jSONObject2);
            try {
                jSONObject2.put("status_code", i);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            LIZIZ.LIZJ(str, jSONObject2);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }
}
