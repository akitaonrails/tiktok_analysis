package X;

import com.bytedance.android.livesdk.live.model.LiveFeedSettings;
import com.bytedance.android.livesdk.livesetting.feed.FeedDrawMtSetting;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ISY, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0ISY {
    public static String LIZIZ(String str) {
        return LIZJ(str).param;
    }

    public static LiveFeedSettings LIZJ(String str) {
        Map<String, LiveFeedSettings> settings = FeedDrawMtSetting.INSTANCE.getValue().getSettings();
        if (str == null) {
            str = "";
        }
        LiveFeedSettings liveFeedSettings = settings.get(str);
        if (liveFeedSettings == null) {
            liveFeedSettings = new LiveFeedSettings();
        }
        return liveFeedSettings;
    }

    public static String LIZ(String str, String str2) {
        if (Intrinsics.LJFF("homepage_hot", str) && Intrinsics.LJFF("video_head", str2)) {
            return "homepage_hot_head_draw";
        }
        if (Intrinsics.LJFF("live_merge", str) && Intrinsics.LJFF("live_cover", str2)) {
            return "feed_draw";
        }
        return "";
    }

    public static LiveFeedSettings LIZLLL(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        return LIZJ(C2188811AlT.LIZIZ(sbLIZ));
    }
}
