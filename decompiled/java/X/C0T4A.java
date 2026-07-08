package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.0T4A, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T4A {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(int i) {
        if (i == 0) {
            return "homepage_hot";
        }
        if (i == 1) {
            return "homepage_follow";
        }
        if (i == 5) {
            return "challenge_from";
        }
        if (i == 7) {
            return "homepage_nearby";
        }
        if (i == 9) {
            return "general_search";
        }
        if (i == 26) {
            return "homepage_long_video";
        }
        if (i == 31) {
            return "homepage_friends";
        }
        if (i == 45) {
            return "homepage_series";
        }
        switch (i) {
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return "homepage_popular";
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return "homepage_now";
            case 35:
                return "homepage_explore";
            default:
                return "";
        }
    }
}
