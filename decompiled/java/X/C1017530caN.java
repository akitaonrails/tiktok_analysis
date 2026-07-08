package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0caN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1017530caN {
    public static boolean LJ;
    public static final C1017530caN LIZ = new C1017530caN();
    public static final Map<Aweme, String> LIZIZ = new LinkedHashMap();
    public static final Map<String, String> LIZJ = new LinkedHashMap();
    public static boolean LIZLLL = true;
    public static boolean LJFF = true;
    public static boolean LJI = true;

    public static boolean LIZJ(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null && awemeRawAd.getNativeSiteConfig() != null && Intrinsics.LJFF("lynx", awemeRawAd.getNativeSiteConfig().renderType) && C123100dR.LIZ(awemeRawAd.getNativeSiteConfig().lynxScheme)) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        if (((Boolean) C275450Aqt.LIZ.getValue()).booleanValue()) {
            return LIZJ.containsKey(aweme.getAid());
        }
        return LIZIZ.containsKey(aweme);
    }

    public static final boolean LIZ(Context context, Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        return LIZIZ(context, awemeRawAd);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZIZ(android.content.Context r8, com.ss.android.ugc.aweme.feed.model.AwemeRawAd r9) {
        /*
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IMainService> r0 = com.ss.android.ugc.aweme.services.IMainService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.services.IMainService r0 = (com.ss.android.ugc.aweme.services.IMainService) r0
            boolean r0 = r0.isMainPage(r8)
            r4 = 0
            if (r0 == 0) goto L53
            r1 = 1
            X.0C64 r3 = X.C0C64.LJIILLIIL()     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = "left_slide_lynx_page_optimize_enable_android"
            r0 = 31744(0x7c00, float:4.4483E-41)
            boolean r0 = r3.LJIIIZ(r0, r2, r1, r4)     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L33
            goto L28
        L23:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L33
        L28:
            X.0caN r0 = X.C1017530caN.LIZ
            r0.getClass()
            boolean r0 = LIZJ(r9)
            if (r0 != 0) goto L4a
        L33:
            if (r9 == 0) goto L6a
            java.lang.String r0 = r9.getCreativeIdStr()
        L39:
            boolean r0 = X.C131100ej.LIZ(r0)
            if (r0 == 0) goto L53
            X.0caN r0 = X.C1017530caN.LIZ
            r0.getClass()
            boolean r0 = LIZJ(r9)
            if (r0 != 0) goto L53
        L4a:
            if (r9 == 0) goto L54
            boolean r0 = r9.isOpenSystemBrowser()
            if (r0 != 0) goto L54
        L52:
            r4 = 1
        L53:
            return r4
        L54:
            java.lang.Class<com.ss.android.ugc.aweme.web.service.IAdWebUtils> r3 = com.ss.android.ugc.aweme.web.service.IAdWebUtils.class
            r7 = 14
            r8 = 0
            r5 = r4
            r6 = r4
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.web.service.IAdWebUtils r0 = (com.ss.android.ugc.aweme.web.service.IAdWebUtils) r0
            if (r0 == 0) goto L53
            boolean r0 = r0.Wu(r9)
            if (r0 != r1) goto L53
            goto L52
        L6a:
            r0 = 0
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1017530caN.LIZIZ(android.content.Context, com.ss.android.ugc.aweme.feed.model.AwemeRawAd):boolean");
    }

    public static void LJ(Aweme aweme, String str) {
        if (aweme == null) {
            return;
        }
        LIZIZ.put(aweme, str);
        LIZJ.put(aweme.getAid(), str);
    }
}
