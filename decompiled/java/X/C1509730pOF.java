package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import java.io.StringReader;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pOF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509730pOF {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0037 A[PHI: r3
      0x0037: PHI (r3v1 java.lang.String) = (r3v0 java.lang.String), (r3v4 java.lang.String), (r3v5 java.lang.String), (r3v6 java.lang.String) binds: [B:3:0x0011, B:5:0x001d, B:7:0x0029, B:9:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1509310pNZ LIZ(org.json.JSONObject r5) {
        /*
            X.0pNZ r2 = new X.0pNZ
            r0 = 0
            r2.<init>(r0)
            java.lang.String r0 = "awemeId"
            java.lang.String r3 = r5.optString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L37
            java.lang.String r0 = "aweme_id"
            java.lang.String r3 = r5.optString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L37
            java.lang.String r0 = "aid"
            java.lang.String r3 = r5.optString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L37
            java.lang.String r0 = "cur_aweme_id"
            java.lang.String r3 = r5.optString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L4a
        L37:
            if (r3 == 0) goto L4a
            X.0N9a r0 = com.ss.android.ugc.aweme.ml.api.MLCommonService.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.ml.api.IMLCommonService r0 = X.C0NAL.LIZ
            X.0MtU r0 = r0.getAwemeAdapter()
            if (r0 == 0) goto L4a
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = X.C581560MrS.LIZ(r3)
        L4a:
            r2.LJIIIIZZ = r1
            java.util.Iterator r4 = r5.keys()
        L50:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lb0
            java.lang.Object r3 = r4.next()
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L65
            int r0 = r3.hashCode()
            switch(r0) {
                case -1928572192: goto L71;
                case -919839788: goto L7a;
                case -858005966: goto L89;
                case -290659267: goto L98;
                case 451480066: goto La1;
                default: goto L65;
            }
        L65:
            java.util.Map r1 = r2.LIZ()
            java.lang.Object r0 = r5.opt(r3)
            r1.put(r3, r0)
            goto L50
        L71:
            java.lang.String r0 = "serviceName"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L50
            goto L65
        L7a:
            java.lang.String r1 = "runKey"
            boolean r0 = r3.equals(r1)
            if (r0 == 0) goto L65
            java.lang.String r0 = r5.optString(r1)
            r2.LIZIZ = r0
            goto L50
        L89:
            java.lang.String r1 = "enterType"
            boolean r0 = r3.equals(r1)
            if (r0 == 0) goto L65
            java.lang.String r0 = r5.optString(r1)
            r2.LIZJ = r0
            goto L50
        L98:
            java.lang.String r0 = "features"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L50
            goto L65
        La1:
            java.lang.String r1 = "forTrack"
            boolean r0 = r3.equals(r1)
            if (r0 == 0) goto L65
            boolean r0 = r5.optBoolean(r1)
            r2.LIZLLL = r0
            goto L50
        Lb0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1509730pOF.LIZ(org.json.JSONObject):X.0pNZ");
    }

    public static C1510230pP3 LIZIZ(String str, JSONObject jSONObject) {
        Object objLJ;
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("features");
            if (jSONObjectOptJSONObject == null) {
                return null;
            }
            Gson gson = C2104708Mj.LIZ;
            C09CU c09cu = new C09CU(new StringReader(C786410Ut5.J3(jSONObjectOptJSONObject)));
            Gson gson2 = C2104708Mj.LIZ;
            synchronized (gson2) {
                try {
                    objLJ = gson2.LJ(c09cu, InputFeaturesConfig.class);
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            SmartSceneConfig smartSceneConfig = new SmartSceneConfig();
            smartSceneConfig.setScene(str);
            smartSceneConfig.setFeatures((InputFeaturesConfig) objLJ);
            C1510230pP3 c1510230pP3 = new C1510230pP3(str);
            c1510230pP3.LIZIZ = smartSceneConfig;
            return c1510230pP3;
        } catch (Exception th) {
            return null;
        }
    }
}
