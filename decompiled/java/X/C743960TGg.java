package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0TGg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C743960TGg {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L39
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1c
            r1.<init>(r5)     // Catch: org.json.JSONException -> L1c
            java.lang.String r0 = "PushBase"
            org.json.JSONObject r2 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getJSONObject(r1, r0)     // Catch: org.json.JSONException -> L1c
            java.lang.String r1 = "livePusherSessionVersion"
            r0 = -1
            int r1 = r2.optInt(r1, r0)     // Catch: org.json.JSONException -> L1c
            r0 = 3
            if (r1 != r0) goto L39
            goto L3b
        L1c:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "check no room api failed, json exception. e="
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "AnchorNetUrlUtils"
            X.C20441214yg.LJ(r0, r1)
        L39:
            r0 = 0
            goto L3c
        L3b:
            r0 = 1
        L3c:
            java.lang.String r0 = LIZJ(r3, r4, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C743960TGg.LIZ(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public static String LIZIZ(String str, String str2, JSONObject jSONObject) {
        boolean z;
        try {
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("check no room api failed, json exception. e=");
            sbLIZ.append(e.getMessage());
            C20441214yg.LJ("AnchorNetUrlUtils", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (JSONObjectProtectorUtils.getJSONObject(jSONObject, "PushBase").optInt("livePusherSessionVersion", -1) != 3) {
            z = false;
        } else {
            z = true;
        }
        return LIZJ(str, str2, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(java.lang.String r15, java.lang.String r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C743960TGg.LIZJ(java.lang.String, java.lang.String, boolean):java.lang.String");
    }
}
