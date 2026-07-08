package X;

import com.ss.android.ugc.aweme.ml.api.CreationFeatureBridge;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.FeatureItem;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0pTK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1512880pTK extends FeatureProducer {
    public static final C1512880pTK LIZIZ = new C1512880pTK();
    public static boolean LIZJ = true;
    public static String LIZLLL = "f_creation";

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final String getProducerName() {
        return LIZLLL;
    }

    public static Map LIZ(Integer num) {
        C1512890pTL c1512890pTL = C1512890pTL.LIZIZ;
        Map[] mapArrLIZ = C1512890pTL.LIZ(num, "kCreationFeatureCache_postPageClickPost");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = mapArrLIZ.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            for (Map.Entry entry : mapArrLIZ[i].entrySet()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("label_");
                sbLIZ.append(i2);
                linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ), entry.getValue());
            }
            i++;
            i2 = i3;
        }
        return linkedHashMap;
    }

    public static Map LIZIZ(Integer num) {
        C1512890pTL c1512890pTL = C1512890pTL.LIZIZ;
        Map[] mapArrLIZ = C1512890pTL.LIZ(num, "kCreationFeatureCache_postPageParams");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = mapArrLIZ.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            for (Map.Entry entry : mapArrLIZ[i].entrySet()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((String) entry.getKey());
                sbLIZ.append('_');
                sbLIZ.append(i2);
                linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ), entry.getValue());
            }
            i++;
            i2 = i3;
        }
        return linkedHashMap;
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final void enableProducer(List<FeatureItem> list) {
        if (LIZJ) {
            LIZJ = false;
            FeatureServiceManager.Companion.getClass();
            C1510050pOl.LIZ().addAppLogListener(C1512890pTL.LIZIZ);
            CreationFeatureBridge.Companion.getClass();
            C1448200nn0.LIZ().onProducerEnabled();
        }
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final void setProducerName(String str) {
        LIZLLL = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getFeatureInternal(java.lang.String r5, org.json.JSONObject r6, java.lang.String r7, com.ss.ugc.clientai.core.api.meta.ReturnCode r8) {
        /*
            r4 = this;
            int r0 = r5.length()
            r1 = 1
            if (r0 != 0) goto L10
            r0 = 1
        L8:
            r3 = 0
            if (r0 == 0) goto L12
            if (r8 == 0) goto Lf
            r8.code = r1
        Lf:
            return r3
        L10:
            r0 = 0
            goto L8
        L12:
            if (r6 == 0) goto L2b
            java.lang.String r0 = "params"
            org.json.JSONObject r1 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getJSONObject(r6, r0)     // Catch: java.lang.Exception -> L27
            if (r1 == 0) goto L2b
            java.lang.String r0 = "range"
            int r0 = r1.optInt(r0)     // Catch: java.lang.Exception -> L27
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L27
            goto L2c
        L27:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L2b:
            r2 = r3
        L2c:
            java.lang.String r0 = "post_page_params"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)     // Catch: java.lang.Exception -> L64
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 == 0) goto L3f
            if (r8 == 0) goto L3a
            r8.code = r1     // Catch: java.lang.Exception -> L64
        L3a:
            java.util.Map r0 = LIZIZ(r2)     // Catch: java.lang.Exception -> L64
            return r0
        L3f:
            java.lang.String r0 = "post_page_click_post"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)     // Catch: java.lang.Exception -> L64
            if (r0 == 0) goto L50
            if (r8 == 0) goto L4b
            r8.code = r1     // Catch: java.lang.Exception -> L64
        L4b:
            java.util.Map r0 = LIZ(r2)     // Catch: java.lang.Exception -> L64
            return r0
        L50:
            X.0nn0 r0 = com.ss.android.ugc.aweme.ml.api.CreationFeatureBridge.Companion     // Catch: java.lang.Exception -> L64
            r0.getClass()     // Catch: java.lang.Exception -> L64
            com.ss.android.ugc.aweme.ml.api.ICreationFeatureBridge r0 = X.C1448200nn0.LIZ()     // Catch: java.lang.Exception -> L64
            java.lang.Object r0 = r0.getFeature(r5)     // Catch: java.lang.Exception -> L64
            if (r0 == 0) goto L63
            if (r8 == 0) goto L63
            r8.code = r1     // Catch: java.lang.Exception -> L64
        L63:
            return r0
        L64:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1512880pTK.getFeatureInternal(java.lang.String, org.json.JSONObject, java.lang.String, com.ss.ugc.clientai.core.api.meta.ReturnCode):java.lang.Object");
    }
}
