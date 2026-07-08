package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.hybrid.settings.PipoContainerSspConfig;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0pvz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1530650pvz {
    public static final C1530650pvz LIZ = new C1530650pvz();
    public static final C054G LIZIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public static final ConcurrentHashMap<String, Long> LIZJ = new ConcurrentHashMap<>();

    public static void LIZJ(String str) {
        ConcurrentHashMap<String, Long> concurrentHashMap = LIZJ;
        synchronized (concurrentHashMap) {
            try {
                Long l = concurrentHashMap.get(str);
                if (l != null && l.longValue() == -1) {
                    concurrentHashMap.put(str, Long.valueOf(System.currentTimeMillis()));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZLLL(long j) {
        ConcurrentHashMap<String, Long> concurrentHashMap = LIZJ;
        if (concurrentHashMap.size() <= 200) {
            return;
        }
        Iterator<Map.Entry<String, Long>> it2 = concurrentHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<String, Long> next = it2.next();
            Long value = next.getValue();
            if (value == null || value.longValue() != -1) {
                if (j - next.getValue().longValue() >= 60000) {
                    it2.remove();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c A[PHI: r6
      0x002c: PHI (r6v3 java.lang.Integer) = (r6v0 java.lang.Integer), (r6v4 java.lang.Integer) binds: [B:21:0x0041, B:15:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044 A[PHI: r6
      0x0044: PHI (r6v1 java.lang.Integer) = (r6v0 java.lang.Integer), (r6v3 java.lang.Integer) binds: [B:21:0x0041, B:17:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a A[PHI: r3
      0x004a: PHI (r3v1 java.lang.Integer) = (r3v0 java.lang.Integer), (r3v5 java.lang.Integer) binds: [B:25:0x0047, B:8:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004e A[PHI: r3 r4
      0x004e: PHI (r3v2 java.lang.Integer) = (r3v1 java.lang.Integer), (r3v4 java.lang.Integer) binds: [B:28:0x004b, B:11:0x0017] A[DONT_GENERATE, DONT_INLINE]
      0x004e: PHI (r4v1 java.lang.Integer) = (r4v0 java.lang.Integer), (r4v3 java.lang.Integer) binds: [B:28:0x004b, B:11:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1530700pw4 LIZIZ(boolean r8, java.lang.String r9, com.bytedance.lynx.hybrid.ssp.base.SSPResponse.Data r10) {
        /*
            r1 = 0
            if (r10 == 0) goto L46
            com.bytedance.lynx.hybrid.ssp.base.SSPResponse$Prefetch[] r0 = r10.prefetchList
            if (r0 == 0) goto L46
            int r0 = r0.length
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        Lc:
            com.bytedance.lynx.hybrid.ssp.base.SSPResponse$PreConnect[] r0 = r10.preConnectList
            if (r0 == 0) goto L4a
            int r0 = r0.length
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L15:
            com.bytedance.lynx.hybrid.ssp.base.SSPResponse$PreConnect[] r0 = r10.subpagePreConnectList
            if (r0 == 0) goto L4e
            int r0 = r0.length
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L1e:
            if (r10 == 0) goto L40
            int r0 = r10.matchType
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            int r0 = r6.intValue()
            if (r0 < 0) goto L40
        L2c:
            int r0 = r10.mode
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            int r0 = r7.intValue()
            if (r0 < 0) goto L44
        L38:
            X.0pw4 r0 = new X.0pw4
            r2 = r9
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
        L40:
            r6 = r1
            if (r10 == 0) goto L44
            goto L2c
        L44:
            r7 = r1
            goto L38
        L46:
            r3 = r1
            if (r10 == 0) goto L4a
            goto Lc
        L4a:
            r4 = r1
            if (r10 == 0) goto L4e
            goto L15
        L4e:
            r5 = r1
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1530650pvz.LIZIZ(boolean, java.lang.String, com.bytedance.lynx.hybrid.ssp.base.SSPResponse$Data):X.0pw4");
    }

    public static C1725370v03 LIZ(C1530640pvy c1530640pvy, PipoContainerSspConfig pipoContainerSspConfig, String str, String str2) {
        String str3;
        String str4 = str2;
        if (str4 == null) {
            str4 = c1530640pvy.LIZ;
        }
        String str5 = c1530640pvy.LIZ;
        String str6 = c1530640pvy.LIZIZ;
        if (pipoContainerSspConfig.getEnabled() && pipoContainerSspConfig.getPrewarmTriggersEnabled()) {
            str3 = "enabled";
        } else {
            str3 = "disabled";
        }
        return new C1725370v03(null, null, str4, str5, str6, str6, "psp_prewarm", str3, str);
    }

    public static final void LJFF(C1530640pvy c1530640pvy, PipoContainerSspConfig pipoContainerSspConfig, String str, String str2) {
        C1530680pw2.LIZIZ(LIZ(c1530640pvy, pipoContainerSspConfig, str, str2), LIZIZ(false, str, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(X.C1530640pvy r4, com.ss.android.ugc.aweme.pipo.hybrid.settings.PipoContainerSspConfig r5, java.lang.String r6, long r7, com.bytedance.lynx.hybrid.ssp.base.SSPResponse.Data r9, java.lang.String r10, java.lang.Throwable r11) {
        /*
            X.0v03 r2 = LIZ(r4, r5, r10, r6)
            if (r9 == 0) goto L63
            r6 = 1
        L7:
            java.lang.String r4 = ""
            if (r11 == 0) goto L61
            java.lang.Class r0 = r11.getClass()
            java.lang.String r5 = r0.getSimpleName()
            java.lang.String r0 = r11.getMessage()
            if (r0 == 0) goto L1a
            r4 = r0
        L1a:
            if (r9 == 0) goto L5f
            int r0 = r9.mode
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 < 0) goto L5f
        L28:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r0 = "success"
            r3.put(r0, r6)
            java.lang.String r0 = "duration_ms"
            r3.put(r0, r7)
            java.lang.String r0 = "error_code"
            X.C1530720pw6.LIZ(r0, r5, r3)
            java.lang.String r0 = "error_message"
            X.C1530720pw6.LIZ(r0, r4, r3)
            java.lang.String r0 = "response_state"
            r3.put(r0, r10)
            if (r1 == 0) goto L57
            int r0 = r1.intValue()
            if (r0 < 0) goto L57
            int r1 = r1.intValue()
            java.lang.String r0 = "response_mode"
            r3.put(r0, r1)
        L57:
            java.util.List<java.lang.String> r1 = X.C1530680pw2.LIZ
            java.lang.String r0 = "rd_pipo_ssp_feature_fetch"
            X.C1530680pw2.LIZ(r0, r2, r3, r1)
            return
        L5f:
            r1 = 0
            goto L28
        L61:
            r5 = r4
            goto L1a
        L63:
            r6 = 0
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1530650pvz.LJ(X.0pvy, com.ss.android.ugc.aweme.pipo.hybrid.settings.PipoContainerSspConfig, java.lang.String, long, com.bytedance.lynx.hybrid.ssp.base.SSPResponse$Data, java.lang.String, java.lang.Throwable):void");
    }
}
