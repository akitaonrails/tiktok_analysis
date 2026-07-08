package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.model.FeedItem;

/* JADX INFO: renamed from: X.0IfU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C472220IfU {
    public static final int LIZ(FeedItem feedItem) {
        int i = feedItem.type;
        if (i != 1) {
            if (i != 101) {
                switch (i) {
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        return 3;
                    case 19:
                        return 1;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        return 2;
                    case 21:
                        return -1;
                    case 22:
                        return 5;
                    default:
                        return 6;
                }
            }
            return 4;
        }
        return 0;
    }

    public static final int LIZIZ(FeedItem feedItem) {
        int i = feedItem.type;
        if (i != 1) {
            if (i != 101) {
                switch (i) {
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        return 3;
                    case 19:
                        return 2;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        return 1;
                    case 21:
                        return -1;
                    case 22:
                        return 5;
                    default:
                        return 6;
                }
            }
            return 4;
        }
        return 0;
    }
}
