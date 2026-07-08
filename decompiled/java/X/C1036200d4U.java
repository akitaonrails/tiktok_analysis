package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX INFO: renamed from: X.0d4U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1036200d4U {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static EnumC1036160d4Q LIZ(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -2032180703:
                if (!str.equals(LivePreviewCTASmartDisplayManager.DEFAULT)) {
                    return null;
                }
                return EnumC1036160d4Q.DEFAULT;
            case -1738293306:
                if (!str.equals("FROM_SPLIT_SCREEN")) {
                    return null;
                }
                return EnumC1036160d4Q.FROM_SPLIT_SCREEN;
            case 243358118:
                if (!str.equals("FROM_CUSTOM")) {
                    return null;
                }
                return EnumC1036160d4Q.FROM_CUSTOM;
            case 404687078:
                if (!str.equals("FROM_SCROLL_VIEW_PAGER")) {
                    return null;
                }
                return EnumC1036160d4Q.FROM_SCROLL_VIEW_PAGER;
            case 828014235:
                if (!str.equals("FROM_REWARD_AD_FLING")) {
                    return null;
                }
                return EnumC1036160d4Q.FROM_REWARD_AD_FLING;
            case 1109252372:
                if (!str.equals("FROM_CLICK_BOTTOM_BANNER")) {
                    return null;
                }
                return EnumC1036160d4Q.FROM_CLICK_BOTTOM_BANNER;
            case 1934397388:
                if (!str.equals("FROM_FEED_AD_FLING")) {
                    return null;
                }
                return EnumC1036160d4Q.FROM_FEED_AD_FLING;
            default:
                return null;
        }
    }
}
