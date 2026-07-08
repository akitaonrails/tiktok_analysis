package X;

import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bi5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2212191Bi5 implements C0VRQ {
    public static volatile C2212191Bi5 LIZIZ;
    public C2212901BjE LIZ;

    public static void LIZIZ() {
        int i;
        try {
            if (C2212231Bi9.LIZJ == null) {
                C2212381BiO.LIZLLL("SplashNetWork is null! please setup it in SplashAdManager!");
                i = 1;
            } else {
                i = 0;
            }
            if (C2212231Bi9.LIZIZ == null) {
                C2212381BiO.LIZLLL("EventListener is null! please setup it in SplashAdManager!");
                i = 2;
            }
            if (C2212231Bi9.LIZLLL == null) {
                C2212381BiO.LIZLLL("SplashAdResourceLoader is null! please setup it in SplashAdManager!");
                i = 3;
            }
            C2212381BiO.LIZLLL("SplashAdPlatformSupportCallback is null! please setup it in SplashAdManager!");
            if (i > 0) {
                C2212291BiF.LIZLLL().LJIIIZ("service_sdk_engine_invalidate", i, null);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static C2212191Bi5 LIZJ() {
        if (LIZIZ == null) {
            synchronized (C2212191Bi5.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C2212191Bi5();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public static boolean LJFF() {
        boolean z = false;
        if (!C2212231Bi9.LJJIL) {
            C2212381BiO.LJII(" SDK is unavailable ");
            return false;
        }
        if (C2212231Bi9.LJJI) {
            z = true;
        } else {
            C2212381BiO.LIZLLL("splash ad data is not ready, ad is unavailable");
            C2212291BiF.LIZLLL().LJIIIZ("service_load_local_status_monitor", 1, null);
        }
        LIZIZ();
        return z;
    }

    public final boolean LIZLLL() {
        boolean z = false;
        z = false;
        if (C2212231Bi9.LJJJZ) {
            return LJ(false);
        }
        if (LJFF()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C2212741Biy c2212741BiyLIZLLL = C2212181Bi4.LJ().LIZLLL();
            C2212201Bi6 c2212201Bi6 = c2212741BiyLIZLLL.LIZ;
            if (c2212201Bi6 != null) {
                C2212381BiO.LJ(c2212201Bi6.LLJI, " there is a suitable ad this time ");
                C2212601Bik c2212601BikLIZ = C2212601Bik.LIZ();
                c2212601BikLIZ.LIZ = c2212741BiyLIZLLL.LIZ;
                c2212601BikLIZ.LIZIZ = System.currentTimeMillis();
                z = true;
            } else {
                C2212381BiO.LJFF(" there is no suitable ad this time ");
                C2212391BiP.LIZIZ();
                C2212221Bi8.LIZIZ().LIZLLL();
            }
            if (C2212231Bi9.LJJJJ) {
                Pair<Integer, Long> pairLJIILLIIL = C2212161Bi2.LJIILLIIL();
                if (((Integer) pairLJIILLIIL.first).intValue() != -1) {
                    HashMap<String, Object> map = new HashMap<>();
                    map.put("invalid_reason", pairLJIILLIIL.first);
                    map.put("splash_show", Integer.valueOf(z ? 1 : 0));
                    map.put("error_range", pairLJIILLIIL.second);
                    int i = C2212231Bi9.LJJIJIIJI;
                    if (i != -1) {
                        map.put("is_cold_start", Integer.valueOf(i));
                    }
                    HashMap<String, Object> map2 = new HashMap<>();
                    if (!z) {
                        map2.put("log_extra", C2212141Bi0.LJIIIIZZ().LJFF());
                    }
                    C2212051Bhr.LIZJ().LJIIIIZZ(z ? c2212741BiyLIZLLL.LIZ : null, 84378473382L, "time_check_error", map2, map);
                }
            }
            C2212231Bi9.LJIIIZ();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", System.currentTimeMillis() - jCurrentTimeMillis);
                C2212291BiF.LIZLLL().LJII("bda_splash_pick_model_duration", z ? 1 : 0, jSONObject, null);
                return z;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return z;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:0|2|(1:4)|5|(2:11|(1:13)(2:69|(7:(1:107)(1:77)|78|(2:100|(1:102)(2:103|(1:105)(1:106)))(1:82)|(1:99)(1:86)|87|(2:92|(1:94)(2:95|(1:97)(1:98)))|91)(1:73)))(1:108)|14|(2:18|(1:20))|21|(17:23|(3:25|(1:27)(1:68)|28)|29|(1:31)(1:67)|32|(1:34)(10:41|(2:43|132)|51|(2:53|(2:(1:56)(1:62)|57))|58|(1:60)|61|150|63|66)|35|(1:37)|38|(1:40)|148|119|(9:123|(1:125)|126|(1:128)|129|(1:131)|132|(1:134)|135)|138|146|139|140)(2:(1:116)|117)|118|148|119|(10:121|123|(0)|126|(0)|129|(0)|132|(0)|135)(0)|138|146|139|140|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0325, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02cf A[Catch: all -> 0x0325, TryCatch #2 {all -> 0x0325, blocks: (B:119:0x02be, B:121:0x02c9, B:123:0x02cf, B:126:0x02e0, B:128:0x02f2, B:129:0x02fb, B:131:0x0302, B:132:0x030f, B:135:0x0316), top: B:148:0x02be }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02f2 A[Catch: all -> 0x0325, TryCatch #2 {all -> 0x0325, blocks: (B:119:0x02be, B:121:0x02c9, B:123:0x02cf, B:126:0x02e0, B:128:0x02f2, B:129:0x02fb, B:131:0x0302, B:132:0x030f, B:135:0x0316), top: B:148:0x02be }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0302 A[Catch: all -> 0x0325, TryCatch #2 {all -> 0x0325, blocks: (B:119:0x02be, B:121:0x02c9, B:123:0x02cf, B:126:0x02e0, B:128:0x02f2, B:129:0x02fb, B:131:0x0302, B:132:0x030f, B:135:0x0316), top: B:148:0x02be }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0315  */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.1BjE] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJ(boolean r19) {
        /*
            Method dump skipped, instruction units count: 842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2212191Bi5.LJ(boolean):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:21:0x003d
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static final byte[] LIZ(java.lang.String r4, java.lang.String r5) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r3 = 0
            if (r0 == 0) goto L8
            return r3
        L8:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L43
            X.0VSJ r2 = new X.0VSJ
            r2.<init>(r4)
            boolean r0 = r2.exists()
            if (r0 == 0) goto L43
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.io.FileNotFoundException -> L2e java.lang.Throwable -> L3d
            X.0VSP r0 = new X.0VSP     // Catch: java.io.FileNotFoundException -> L2e java.lang.Throwable -> L3d
            r0.<init>(r2)     // Catch: java.io.FileNotFoundException -> L2e java.lang.Throwable -> L3d
            r1.<init>(r0)     // Catch: java.io.FileNotFoundException -> L2e java.lang.Throwable -> L3d
            byte[] r0 = X.C2212161Bi2.LJIJJLI(r1)     // Catch: java.io.FileNotFoundException -> L2c java.lang.Throwable -> L37
            byte[] r3 = X.C2212161Bi2.LJFF(r0, r5)     // Catch: java.io.FileNotFoundException -> L2c java.lang.Throwable -> L37
            goto L33
        L2c:
            r0 = move-exception
            goto L30
        L2e:
            r0 = move-exception
            r1 = r3
        L30:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L37
        L33:
            X.C2212161Bi2.LIZLLL(r1)
            return r3
        L37:
            r0 = move-exception
            r3 = r1
        L39:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L3d
            goto L3f
        L3d:
            r0 = move-exception
            goto L39
        L3f:
            X.C2212161Bi2.LIZLLL(r3)
            throw r0
        L43:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2212191Bi5.LIZ(java.lang.String, java.lang.String):byte[]");
    }
}
