package X;

import Y.ARunnableS104S0100000_4;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0CJG, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CJG {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static final ScheduledExecutorService LIZJ = C807400Vlq.LJ();

    public static void LIZ(Context context) {
        int i;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (C0BWT.LIZ()) {
            i = R.layout.ebr;
        } else {
            i = R.layout.ebs;
        }
        C20673215v0.LJI(i, context);
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preloadAvatarLayout costTime: ");
        sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
        C1720106oR.LJI("Profile_ProfilePreloadUtils", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZJ(Context context, boolean z) {
        if (LIZ) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preloadMyPageLayout preloadMyPageLayout true, isColdStart: ");
            sbLIZ.append(z);
            C1720106oR.LJI("Profile_ProfilePreloadUtils", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        LIZ = true;
        C823050WQl.LIZJ().submit(new ARunnableS104S0100000_4(context, 123));
    }

    public static void LIZLLL(Context context, boolean z) {
        int i;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C20673215v0.LJII(context, "profile_view_tab_additional_support_layout");
        C20673215v0.LJII(context, "profile_view_tab_additional_support_layout");
        int i2 = C2187451AjH.LIZ;
        C1720106oR.LJI("Profile_ProfilePreloadUtils", "preloadTabIndicatorLayout");
        if (z) {
            i = 3;
        } else {
            i = 1;
        }
        int i3 = 0;
        do {
            C20673215v0.LJII(context, "profile_view_tab_profile_image");
            i3++;
        } while (i3 < i);
        int i4 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preloadTabIndicatorLayout costTime: ");
        sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
        C1720106oR.LJI("Profile_ProfilePreloadUtils", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZIZ(final Context context, int i, boolean z) {
        if (context == null) {
            return;
        }
        if (LIZIZ) {
            if (z) {
                int i2 = C2187451AjH.LIZ;
                C1720106oR.LJI("Profile_ProfilePreloadUtils", "preloadAwemeListLayout has enter profile, cold start logic do not need to run");
                return;
            }
        } else {
            LIZIZ = true;
        }
        C01GW c01gw = C267380Ads.LIZ;
        if (i > ((Number) c01gw.getValue()).intValue() / 2) {
            i = ((Number) c01gw.getValue()).intValue() / 2;
        }
        long jLongValue = ((Number) C267360Adq.LIZ.getValue()).longValue();
        for (final int i3 = 0; i3 < i; i3++) {
            final String str = "profile_item_aweme_mine";
            LIZJ.schedule(new Runnable() { // from class: X.07xE
                public final void LIZ() {
                    try {
                        C20673215v0.LJII(context, str);
                        int i4 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("preloadAwemeListLayout: inflated ");
                        sbLIZ.append(i3);
                        sbLIZ.append(" layout");
                        C2188811AlT.LIZIZ(sbLIZ);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        int i5 = C2187451AjH.LIZ;
                        C1720106oR.LIZIZ("Profile_ProfilePreloadUtils", "preloadAwemeListLayout failed", e);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ProfilePreloadUtils@137d.preloadAwemeListLayout$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ProfilePreloadUtils@137d.preloadAwemeListLayout$1");
                }
            }, ((long) i3) * jLongValue, TimeUnit.MILLISECONDS);
        }
    }
}
