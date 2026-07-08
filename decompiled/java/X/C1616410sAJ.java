package X;

import Y.ACallableS0S3221101_9;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.0sAJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1616410sAJ {
    public static Aweme LIZ;
    public static boolean LIZIZ;
    public static float LIZJ;
    public static int LIZLLL;
    public static long LJ;
    public static float LJFF;
    public static int LJI;
    public static long LJII;
    public static float LJIIIIZZ;
    public static int LJIIIZ;
    public static long LJIIJ;
    public static String LJIIJJI = "";

    public static float LIZIZ(float f) {
        try {
            return new BigDecimal(f).setScale(2, 4).floatValue();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0.0f;
        }
    }

    public static long LIZLLL(Aweme aweme) {
        Video video;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            return video.getDuration();
        }
        return -1L;
    }

    public static float LIZ(long j, long j2) {
        float fFloatValue = 0.0f;
        if (j2 <= 0) {
            return 0.0f;
        }
        try {
            fFloatValue = new BigDecimal(j).divide(new BigDecimal(j2), 2, RoundingMode.HALF_UP).floatValue();
            return fFloatValue;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return fFloatValue;
        }
    }

    public static long LIZJ(long j, long j2) {
        long jAbs = Math.abs(j - j2);
        if (jAbs > 86400000) {
            return 1000L;
        }
        return jAbs;
    }

    public static final void LJIIJJI(WeakHandler weakHandler, boolean z, String str, Aweme aweme, long j, int i, int i2) {
        Aweme aweme2 = LIZ;
        if (aweme2 == null) {
            aweme2 = aweme;
        }
        long jLIZLLL = LIZLLL(aweme2);
        if (z) {
            LIZJ = LIZ(j, LIZLLL(aweme));
            LIZLLL = i;
            LJ = System.currentTimeMillis();
            LIZ = aweme;
            Message messageObtain = Message.obtain(weakHandler, new Runnable() { // from class: X.0N0K
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ClearModeMobHelper@d9bb.trackUnstableClearMode$msg$1");
                    try {
                        C1616410sAJ.LIZIZ = true;
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ClearModeMobHelper@d9bb.trackUnstableClearMode$msg$1");
                }
            });
            messageObtain.what = 101;
            C786410Ut5.LJLJLJ(weakHandler, messageObtain, 1000L);
            return;
        }
        if (weakHandler.hasMessages(101)) {
            weakHandler.removeMessages(101);
        }
        if (i2 != 0) {
            if (i2 != 2) {
                return;
            }
            LJFF = LIZ(j, jLIZLLL);
            LJI = i;
            LJII = System.currentTimeMillis();
            return;
        }
        if (LJII <= 0) {
            LJFF = LIZ(j, jLIZLLL);
            LJI = i;
            LJII = System.currentTimeMillis();
        }
        boolean z2 = LIZIZ;
        C1616420sAK c1616420sAK = new C1616420sAK(z2, LIZ, str, jLIZLLL, LIZJ, LIZLLL, LJ, LJFF, LJI, LJII);
        if (z2) {
            C786410Ut5.f3(new C1620790sHN(c1616420sAK, 0), Looper.myQueue());
        }
        LIZ = null;
        LIZJ = 0.0f;
        LIZLLL = 0;
        LJ = 0L;
        LJFF = 0.0f;
        LJI = 0;
        LJII = 0L;
        LIZIZ = false;
    }

    public static final void LJIIIIZZ(boolean z, String str, String str2, Aweme aweme, String str3, long j, int i, String str4, Map<String, String> map) {
        float fAbs;
        long jLIZLLL = LIZLLL(aweme);
        if (z) {
            LJIIIIZZ = LIZ(j, jLIZLLL);
            LJIIIZ = i;
            LJIIJ = System.currentTimeMillis();
            LJIIJJI = str2;
            LJ(LJIIIIZZ, i, jLIZLLL, aweme, str, str2, str4, map, true, true);
            return;
        }
        C01GW<C0RGG> c01gw = C0RGG.LJ;
        if (!C586380MzE.LIZ().LIZJ(str)) {
            return;
        }
        float fLIZ = LIZ(j, jLIZLLL);
        if (i > LJIIIZ) {
            fAbs = 1 - LJIIIIZZ;
        } else {
            fAbs = fLIZ - LJIIIIZZ;
        }
        if (fAbs < 0.0f) {
            fAbs = Math.abs(1 - LIZJ);
        }
        LJFF(fLIZ, i, jLIZLLL, aweme, str, str3, str4, map, true, true);
        LJII(true, str, str3, aweme, jLIZLLL, LIZIZ(fAbs), i - LJIIIZ, LIZJ(System.currentTimeMillis(), LJIIJ), true, str4);
        LJIIIIZZ = 0.0f;
        LJIIIZ = 0;
        LJIIJ = 0L;
    }

    public static final void LJIIIZ(boolean z, String str, String str2, Aweme aweme, String str3, C0N0Y c0n0y, InterfaceC739770T0d interfaceC739770T0d, String str4, Map<String, String> map) {
        if (c0n0y != null && interfaceC739770T0d != null) {
            LJIIIIZZ(z, str, str2, aweme, str3, c0n0y.getCurrentPosition(), interfaceC739770T0d.s2(), str4, map);
        }
    }

    public static void LJ(float f, int i, long j, Aweme aweme, String str, String str2, String str3, Map map, boolean z, boolean z2) {
        C15O7.LIZIZ(new ACallableS0S3221101_9(f, i, j, aweme, str2, str, str3, map, z, z2, 0), C20684815ws.LJFF(), null);
    }

    public static void LJFF(float f, int i, long j, Aweme aweme, String str, String str2, String str3, Map map, boolean z, boolean z2) {
        C15O7.LIZIZ(new ACallableS0S3221101_9(f, i, j, aweme, str2, str, str3, map, z, z2, 1), C20684815ws.LJFF(), null);
    }

    public static void LJII(final boolean z, final String str, final String str2, final Aweme aweme, final long j, final float f, final int i, final long j2, final boolean z2, final String str3) {
        final String str4 = LJIIJJI;
        C15O7.LIZIZ(new Callable() { // from class: X.0N0J
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String groupId;
                String authorUid;
                C1C7U.LIZ("ClearModeMobHelper@d9bb.mobPlayTimeEvent$1");
                Aweme aweme2 = aweme;
                String str5 = "";
                if (aweme2 == null || (groupId = aweme2.getGroupId()) == null) {
                    groupId = "";
                }
                Aweme aweme3 = aweme;
                if (aweme3 != null && (authorUid = AwemeExtKt.getAuthorUid(aweme3)) != null) {
                    str5 = authorUid;
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_method", z ? str4 : "slide");
                c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, z ? "stable" : "unstable");
                c2344009Gk.LJIIIIZZ("quit_method", str2);
                c2344009Gk.LJIIIIZZ("enter_from", str);
                c2344009Gk.LJIIIIZZ("group_id", groupId);
                c2344009Gk.LJIIIIZZ("author_id", str5);
                c2344009Gk.LIZIZ(f, "vPct_diff");
                c2344009Gk.LIZLLL(j, "vDuration");
                c2344009Gk.LIZJ(i, "vLoops_diff");
                c2344009Gk.LIZLLL(j2, "clear_screen_duration");
                c2344009Gk.LIZJ(z2 ? 1 : 0, "is_clear_mode");
                c2344009Gk.LJIIIIZZ("from_page", str3);
                C20684815ws.LJIILLIIL("clear_screen_play_time", c2344009Gk.LIZ);
                C1C7U.LIZIZ("ClearModeMobHelper@d9bb.mobPlayTimeEvent$1");
                return null;
            }
        }, C20684815ws.LJFF(), null);
    }
}
