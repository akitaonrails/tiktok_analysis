package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0LXS, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LXS {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038 A[Catch: JSONException -> 0x005e, PHI: r7
      0x0038: PHI (r7v7 java.lang.String) = (r7v0 java.lang.String), (r7v8 java.lang.String) binds: [B:16:0x0033, B:18:0x0036] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {JSONException -> 0x005e, blocks: (B:3:0x0001, B:5:0x000e, B:6:0x0016, B:19:0x0038, B:23:0x0043, B:31:0x005a, B:29:0x0051, B:15:0x002d), top: B:36:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040 A[PHI: r7
      0x0040: PHI (r7v1 java.lang.String) = (r7v7 java.lang.String), (r7v8 java.lang.String) binds: [B:20:0x003e, B:18:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[Catch: JSONException -> 0x005e, PHI: r7 r8
      0x0043: PHI (r7v6 java.lang.String) = (r7v1 java.lang.String), (r7v7 java.lang.String) binds: [B:22:0x0041, B:20:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x0043: PHI (r8v5 java.lang.String) = (r8v0 java.lang.String), (r8v6 java.lang.String) binds: [B:22:0x0041, B:20:0x003e] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {JSONException -> 0x005e, blocks: (B:3:0x0001, B:5:0x000e, B:6:0x0016, B:19:0x0038, B:23:0x0043, B:31:0x005a, B:29:0x0051, B:15:0x002d), top: B:36:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b A[PHI: r7 r8
      0x004b: PHI (r7v5 java.lang.String) = (r7v1 java.lang.String), (r7v6 java.lang.String) binds: [B:22:0x0041, B:24:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x004b: PHI (r8v4 java.lang.String) = (r8v0 java.lang.String), (r8v5 java.lang.String) binds: [B:22:0x0041, B:24:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C537040L4k LIZ(com.ss.android.ugc.effectmanager.effect.model.Effect r10) {
        /*
            r4 = 0
            X.0njf r0 = X.C1446130njf.LIZ     // Catch: org.json.JSONException -> L5e
            r0.getClass()     // Catch: org.json.JSONException -> L5e
            org.json.JSONObject r3 = X.C1446130njf.LJIIIZ(r10)     // Catch: org.json.JSONException -> L5e
            X.0L4k r5 = new X.0L4k     // Catch: org.json.JSONException -> L5e
            if (r3 == 0) goto L1d
            java.lang.String r0 = X.C0LXT.LIZ()     // Catch: org.json.JSONException -> L5e
            java.lang.String r1 = r3.optString(r0)     // Catch: org.json.JSONException -> L5e
        L16:
            java.lang.String r0 = "true"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: org.json.JSONException -> L5e
            goto L1f
        L1d:
            r1 = r4
            goto L16
        L1f:
            java.lang.String r10 = "1"
            java.lang.String r2 = "0"
            if (r0 == 0) goto L2b
            r6 = r10
        L26:
            java.lang.String r1 = ""
            if (r3 == 0) goto L35
            goto L2d
        L2b:
            r6 = r2
            goto L26
        L2d:
            java.lang.String r0 = "AIType"
            java.lang.String r7 = r3.optString(r0)     // Catch: org.json.JSONException -> L5e
            if (r7 != 0) goto L38
        L35:
            r7 = r1
            if (r3 == 0) goto L40
        L38:
            java.lang.String r0 = "AIGCSubType"
            java.lang.String r8 = r3.optString(r0)     // Catch: org.json.JSONException -> L5e
            if (r8 != 0) goto L43
        L40:
            r8 = r1
            if (r3 == 0) goto L4b
        L43:
            java.lang.String r0 = "AIModelName"
            java.lang.String r9 = r3.optString(r0)     // Catch: org.json.JSONException -> L5e
            if (r9 != 0) goto L51
        L4b:
            r9 = r1
            if (r3 == 0) goto L4f
            goto L51
        L4f:
            r10 = r2
            goto L5a
        L51:
            java.lang.String r0 = "AICanAsync"
            boolean r1 = r3.optBoolean(r0)     // Catch: org.json.JSONException -> L5e
            r0 = 1
            if (r1 != r0) goto L4f
        L5a:
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: org.json.JSONException -> L5e
            return r5
        L5e:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "json exception: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "AigcLoggerData"
            X.C201955140j.LIZIZ(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LXS.LIZ(com.ss.android.ugc.effectmanager.effect.model.Effect):X.0L4k");
    }

    public static C537040L4k LIZIZ(String str) {
        String str2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String str3 = "1";
            if (Intrinsics.LJFF(jSONObject.optString(C0LXT.LIZ()), "true")) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            String strOptString = jSONObject.optString("AIType");
            String strOptString2 = jSONObject.optString("AIGCSubType");
            String strOptString3 = jSONObject.optString("AIModelName");
            if (!jSONObject.optBoolean("AICanAsync")) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            return new C537040L4k(str2, strOptString, strOptString2, strOptString3, str3);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("json exception: ");
            sbLIZ.append(e);
            C201955140j.LIZIZ("AigcLoggerData", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }
}
