package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerConfig;

/* JADX INFO: renamed from: X.0SGz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public /* synthetic */ class C718670SGz {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[FeedBottomBannerConfig.InteractionType.values().length];
        try {
            iArr[FeedBottomBannerConfig.InteractionType.ARROW.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[FeedBottomBannerConfig.InteractionType.TEXT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[FeedBottomBannerConfig.InteractionType.SEARCH_TAKO_TEXT_ICON.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[FeedBottomBannerConfig.InteractionType.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[FeedBottomBannerConfig.InteractionType.CLOSE.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[FeedBottomBannerConfig.InteractionType.BUTTON.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr[FeedBottomBannerConfig.InteractionType.CUSTOM.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        LIZ = iArr;
    }
}
