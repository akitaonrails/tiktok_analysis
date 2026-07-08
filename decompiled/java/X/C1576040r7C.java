package X;

import com.ss.android.ugc.aweme.vibefeed.experiment.SocialVibeConfig;

/* JADX INFO: renamed from: X.0r7C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1576040r7C {
    public static final SocialVibeConfig LIZ = new SocialVibeConfig(false, false, false, false, 86400, 60, 10, false, false, false, false, false, true);

    public static boolean LIZ() {
        return LJFF().enable;
    }

    public static boolean LIZIZ() {
        return LIZ() && LJFF().enableGroup;
    }

    public static boolean LIZJ() {
        return LIZ() && LJFF().actionBarEnable;
    }

    public static boolean LIZLLL() {
        return LIZ() && LJFF().naviBarEnable;
    }

    public static boolean LJ() {
        return LIZ() && LJFF().skipTutorialFreq;
    }

    public static SocialVibeConfig LJFF() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        SocialVibeConfig socialVibeConfig = LIZ;
        SocialVibeConfig socialVibeConfig2 = (SocialVibeConfig) c0c64LJIILLIIL.LJJII(SocialVibeConfig.class, socialVibeConfig, "tt_shared_feed", true);
        return socialVibeConfig2 != null ? socialVibeConfig2 : socialVibeConfig;
    }
}
