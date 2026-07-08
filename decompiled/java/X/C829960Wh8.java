package X;

import com.bytedance.hybrid.spark.third.router.SeclinkConfig;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Wh8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C829960Wh8 {
    public static Map LIZ(SeclinkConfig seclinkConfig) {
        boolean z;
        String scene;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean enable = true;
        if (seclinkConfig != null && seclinkConfig.checkConfig()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            linkedHashMap.put("need_sec_link", Boolean.FALSE);
            return linkedHashMap;
        }
        if (seclinkConfig != null) {
            enable = seclinkConfig.getEnable();
        }
        linkedHashMap.put("need_sec_link", Boolean.valueOf(enable));
        if (seclinkConfig == null || (scene = seclinkConfig.getScene()) == null) {
            scene = "";
        }
        linkedHashMap.put("sec_link_scene", scene);
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C821850WLv r3, com.bytedance.hybrid.spark.third.router.SparkThirdContext r4) {
        /*
            r2 = 0
            if (r3 == 0) goto L51
            X.0WLo r0 = r3.LJ
            if (r0 == 0) goto L51
            X.0WLw r1 = r0.LIZ
        L9:
            X.0WLf r0 = X.EnumC821690WLf.WEB_ROUTER_SECLINK_OPEN_DEFAULT_GLOBALLY
            if (r1 != r0) goto L4b
            X.0WLo r0 = r3.LJ
            if (r0 == 0) goto L4f
            java.util.Map<java.lang.String, java.lang.Object> r1 = r0.LIZIZ
            if (r1 == 0) goto L4f
            java.lang.String r0 = "add_params"
            java.lang.Object r3 = r1.get(r0)
        L1b:
            boolean r0 = r3 instanceof java.util.Map
            if (r0 == 0) goto L4c
            java.util.Map r3 = (java.util.Map) r3
            if (r3 == 0) goto L4d
            java.lang.String r0 = "need_sec_link"
            java.lang.Object r1 = r3.get(r0)
        L29:
            java.lang.String r0 = "1"
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r3 == 0) goto L39
            java.lang.String r0 = "sec_link_scene"
            java.lang.Object r2 = r3.get(r0)
            java.lang.String r2 = (java.lang.String) r2
        L39:
            if (r1 == 0) goto L4b
            r1 = 1
            if (r2 == 0) goto L4b
            int r0 = r2.length()
            if (r0 == 0) goto L4b
            com.bytedance.hybrid.spark.third.router.SeclinkConfig r0 = new com.bytedance.hybrid.spark.third.router.SeclinkConfig
            r0.<init>(r1, r2)
            r4.seclinkConfig = r0
        L4b:
            return
        L4c:
            r3 = r2
        L4d:
            r1 = r2
            goto L29
        L4f:
            r3 = r2
            goto L1b
        L51:
            r1 = r2
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C829960Wh8.LIZIZ(X.0WLv, com.bytedance.hybrid.spark.third.router.SparkThirdContext):void");
    }
}
