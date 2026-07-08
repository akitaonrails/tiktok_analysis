package X;

import Y.ARunnableS116S0100000_16;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.HashMap;
import java.util.UUID;

/* JADX INFO: renamed from: X.10Xz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19263710Xz {
    public static long LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static boolean LJFF;
    public static String LJI;
    public static String LJII;
    public static boolean LJIIJJI;
    public static Boolean LJIIL;
    public static boolean LJIILIIL;
    public static String LJIILLIIL;
    public static String LJIIZILJ;
    public static Integer LJIJ;
    public static final C19263710Xz LIZ = new C19263710Xz();
    public static String LJIIIIZZ = "old";
    public static String LJIIIZ = "normal_deeplink";
    public static final HashMap<String, Long> LJIIJ = new HashMap<>();
    public static String LJIILJJIL = "";
    public static String LJIILL = "";

    public static final void LJII() {
        LJII = "webView_default";
        C10Y1 c10y1LIZ = C19264110Yd.LIZ();
        String str = LJII;
        if (str == null) {
            str = "";
        }
        c10y1LIZ.LIZLLL(str);
    }

    public static void LIZ(Intent intent) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Uri data = intent.getData();
        if (data != null && data.isHierarchical()) {
            Uri data2 = intent.getData();
            if (data2 != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(data2, "ugdp_id")) != null) {
                C1953307kx.LIZ.getClass();
                if (C1953307kx.LIZLLL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                    LJIILJJIL = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                    return;
                }
            }
            String string = LJIILJJIL;
            C1953307kx.LIZ.getClass();
            if (!C1953307kx.LIZLLL(string) || string == null) {
                string = UUID.randomUUID().toString();
            }
            LJIILJJIL = string;
            Uri data3 = intent.getData();
            if (data3 == null) {
                return;
            }
            intent.setData(data3.buildUpon().appendQueryParameter("ugdp_id", LJIILJJIL).build());
        }
    }

    public static boolean LIZIZ(Uri uri) {
        String host;
        if (uri != null) {
            host = uri.getHost();
        } else {
            host = null;
        }
        if (TextUtils.equals("shortlink", host)) {
            return true;
        }
        return false;
    }

    public static final void LIZJ(String str) {
        LJIIJ.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    public static final void LJ(String str) {
        long jLongValue;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l = LJIIJ.get(str);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("type", LJI);
        c2241008qG.LIZ.put("enter_to", LJII);
        c2241008qG.LIZ.put("node_name", str);
        c2241008qG.LIZ.put("cost_time", Long.valueOf(jCurrentTimeMillis - jLongValue));
        c2241008qG.LIZ.put("link_version", LJIIIIZZ);
        ARunnableS116S0100000_16 aRunnableS116S0100000_16 = new ARunnableS116S0100000_16(c2241008qG, 42);
        if (C19266010Yw.LIZ()) {
            C20684815ws.LJFF().execute(aRunnableS116S0100000_16);
        } else {
            aRunnableS116S0100000_16.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJFF(java.lang.String r4) {
        /*
            int r3 = X.C19266010Yw.LIZ
            r0 = 4
            r2 = 0
            r1 = 1
            if (r3 == r0) goto L5b
            r0 = 5
            if (r3 == r0) goto L5b
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            r0.getClass()
            java.lang.String r0 = "enable_track_inner_deeplink"
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r0, r1)
            if (r0 != 0) goto L1a
            return
        L1a:
            if (r4 == 0) goto L2f
            boolean r0 = kotlin.text.a0.LJJJIL(r4)     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L2f
            int r1 = r4.length()     // Catch: java.lang.Throwable -> L56
            r0 = 512(0x200, float:7.17E-43)
            if (r1 <= r0) goto L31
            java.lang.String r4 = r4.substring(r2, r0)     // Catch: java.lang.Throwable -> L56
            goto L31
        L2f:
            java.lang.String r4 = "unknown"
        L31:
            X.08qG r2 = new X.08qG     // Catch: java.lang.Throwable -> L56
            r2.<init>()     // Catch: java.lang.Throwable -> L56
            java.lang.String r1 = "enter_from"
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r2.LIZ     // Catch: java.lang.Throwable -> L56
            r0.put(r1, r4)     // Catch: java.lang.Throwable -> L56
            Y.ARunnableS113S0100000_13 r1 = new Y.ARunnableS113S0100000_13     // Catch: java.lang.Throwable -> L56
            r0 = 94
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L56
            boolean r0 = X.C19266010Yw.LIZ()     // Catch: java.lang.Throwable -> L56
            if (r0 == 0) goto L52
            java.util.concurrent.ExecutorService r0 = X.C20684815ws.LJFF()     // Catch: java.lang.Throwable -> L56
            r0.execute(r1)     // Catch: java.lang.Throwable -> L56
            return
        L52:
            r1.run()     // Catch: java.lang.Throwable -> L56
            return
        L56:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19263710Xz.LJFF(java.lang.String):void");
    }

    public static final void LJI(String str) {
        LJII = str;
        C10Y1 c10y1LIZ = C19264110Yd.LIZ();
        String str2 = LJII;
        if (str2 == null) {
            str2 = "";
        }
        c10y1LIZ.LIZLLL(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a1  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [int] */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r19v1, types: [int] */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(int r26, android.net.Uri r27, java.lang.String r28) {
        /*
            Method dump skipped, instruction units count: 1135
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19263710Xz.LIZLLL(int, android.net.Uri, java.lang.String):void");
    }
}
