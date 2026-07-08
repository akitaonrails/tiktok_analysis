package X;

import com.bytedance.android.livesdk.livesetting.effect.LiveEffectAdaptiveSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectGLParamSetting;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.internal.b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0U9u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C767760U9u {
    public static final C767760U9u LIZ = new C767760U9u();
    public static final ConcurrentHashMap<String, Integer> LIZIZ;
    public static int LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static long LJFF;

    static {
        ConcurrentHashMap<String, Integer> concurrentHashMap;
        String strLIZIZ = InterfaceC766480U4w.LJJIL.LIZIZ();
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onInitSPMap: ");
            sbLIZ.append(strLIZIZ);
            C20441214yg.LIZIZ("EffectMonitor#Adaptive", C2188811AlT.LIZIZ(sbLIZ));
            concurrentHashMap = (ConcurrentHashMap) C19748512Ol.LIZIZ.LJIIIIZZ(strLIZIZ, new b.C0011b(null, ConcurrentHashMap.class, String.class, Integer.TYPE));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LIZIZ("EffectMonitor#Adaptive", "onInitSPMap fail");
            concurrentHashMap = new ConcurrentHashMap<>();
        }
        LIZIZ = concurrentHashMap;
        LJFF = -1L;
    }

    public static Map LIZ(String str) {
        int iIntValue;
        HashMap map = new HashMap();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tab: ");
        sbLIZ.append(str);
        sbLIZ.append(", tabStatus: ");
        ConcurrentHashMap<String, Integer> concurrentHashMap = LIZIZ;
        Integer num = concurrentHashMap.get(str);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        sbLIZ.append(iIntValue);
        sbLIZ.append(", current: ");
        sbLIZ.append(LIZJ);
        sbLIZ.append(", setting: ");
        LiveEffectGLParamSetting liveEffectGLParamSetting = LiveEffectGLParamSetting.INSTANCE;
        sbLIZ.append(liveEffectGLParamSetting.enable());
        C20441214yg.LIZIZ("EffectMonitor#AdaptiveParam", C2188811AlT.LIZIZ(sbLIZ));
        Integer num2 = concurrentHashMap.get(str);
        int i = LIZJ;
        if ((num2 == null || num2.intValue() != i) && LiveEffectAdaptiveSetting.INSTANCE.enable()) {
            map.put("trade_action", String.valueOf(LIZJ));
        }
        if (liveEffectGLParamSetting.enable()) {
            String strLIZLLL = C0UA1.LIZ().LIZLLL();
            if (strLIZLLL.length() > 0) {
                map.put("gl_version", strLIZLLL);
            }
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(java.lang.String r4) {
        /*
            com.bytedance.android.livesdk.livesetting.effect.LiveEffectAdaptiveSetting r0 = com.bytedance.android.livesdk.livesetting.effect.LiveEffectAdaptiveSetting.INSTANCE
            boolean r0 = r0.enable()
            r3 = 0
            if (r0 == 0) goto Lba
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "tab: "
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = ", tabStatus: "
            r2.append(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> r1 = X.C767760U9u.LIZIZ
            java.lang.Object r0 = r1.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto Lb7
            int r0 = r0.intValue()
        L28:
            r2.append(r0)
            java.lang.String r0 = ", current: "
            r2.append(r0)
            int r0 = X.C767760U9u.LIZJ
            r2.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
            java.lang.String r2 = "EffectMonitor#AdaptiveCheck"
            X.C20441214yg.LIZIZ(r2, r0)
            java.lang.Object r0 = r1.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto Lb5
            int r4 = r0.intValue()
        L4a:
            int r0 = X.C767760U9u.LIZJ
            r1 = 1
            if (r4 == r0) goto Lb3
            r4 = 1
        L50:
            boolean r0 = X.C767760U9u.LIZLLL
            if (r0 != 0) goto L9a
            if (r4 == 0) goto L9a
            boolean r0 = X.C500260Jjc.LJJIJLIJ()
            if (r0 != 0) goto L9a
            boolean r0 = X.C767760U9u.LJ
            if (r0 == 0) goto L9a
            java.lang.String r0 = "inside"
            X.C20441214yg.LIZIZ(r2, r0)
            X.C767760U9u.LIZLLL = r1
            boolean r0 = X.C500260Jjc.LJJIJLIJ()
            if (r0 != 0) goto Lb1
            boolean r0 = com.bytedance.android.livesdk.performance.BroadcastPerfScoreSetting.enableEffectAdaptiveOverallScore()
            if (r0 == 0) goto La0
            java.lang.Class<com.bytedance.android.livesdk.comp.api.performance.IPerformanceService> r0 = com.bytedance.android.livesdk.comp.api.performance.IPerformanceService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.comp.api.performance.IPerformanceService r0 = (com.bytedance.android.livesdk.comp.api.performance.IPerformanceService) r0
            X.0ekb r0 = r0.jM()
            if (r0 == 0) goto Lb1
            X.0elI r0 = r0.LIZLLL
        L83:
            if (r0 == 0) goto Lb1
            float r0 = r0.LIZIZ
            int r1 = (int) r0
        L88:
            java.lang.Class<com.bytedance.android.livesdk.comp.api.performance.IPerformanceService> r0 = com.bytedance.android.livesdk.comp.api.performance.IPerformanceService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.comp.api.performance.IPerformanceService r0 = (com.bytedance.android.livesdk.comp.api.performance.IPerformanceService) r0
            com.bytedance.android.livesdk.performance.PerformanceManagerImpl r0 = r0.Rs()
            r0.getClass()
            LIZLLL(r1, r3)
        L9a:
            java.lang.String r0 = "end"
            X.C20441214yg.LIZIZ(r2, r0)
            return r4
        La0:
            java.lang.Class<com.bytedance.android.livesdk.comp.api.performance.IPerformanceService> r0 = com.bytedance.android.livesdk.comp.api.performance.IPerformanceService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.comp.api.performance.IPerformanceService r0 = (com.bytedance.android.livesdk.comp.api.performance.IPerformanceService) r0
            X.0ekb r0 = r0.jM()
            if (r0 == 0) goto Lb1
            X.0elI r0 = r0.LIZ
            goto L83
        Lb1:
            r1 = 0
            goto L88
        Lb3:
            r4 = 0
            goto L50
        Lb5:
            r4 = 0
            goto L4a
        Lb7:
            r0 = 0
            goto L28
        Lba:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C767760U9u.LIZIZ(java.lang.String):boolean");
    }

    public static void LIZJ(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onTabFetched: ");
        sbLIZ.append(str);
        sbLIZ.append(", ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("EffectMonitor#Adaptive", C2188811AlT.LIZIZ(sbLIZ));
        LIZIZ.put(str, Integer.valueOf(i));
    }

    public static void LIZLLL(int i, boolean z) {
        String str;
        String str2 = "down";
        if (z) {
            str = "down";
            str2 = "end";
        } else {
            str = "start";
        }
        int i2 = !z ? 1 : 0;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_adaptive_strategy");
        c474500IjALIZ.LJJII(Long.valueOf(LJFF), "start_session");
        c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis), "end_session");
        c474500IjALIZ.LJJII(0, "session_group_id");
        c474500IjALIZ.LJJII(str, "session_from_status");
        c474500IjALIZ.LJJII(str2, "session_to_status");
        c474500IjALIZ.LJJII("live_host_item", "name");
        c474500IjALIZ.LJJII("live", Scene.SCENE_SERVICE);
        c474500IjALIZ.LJJII(Integer.valueOf(i), "perf_score");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "from_level");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "to_level");
        c474500IjALIZ.LIZ();
        LJFF = jCurrentTimeMillis;
    }
}
