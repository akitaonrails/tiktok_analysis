package X;

import com.ss.android.ugc.aweme.feed.features.model.DynamicFeatureConfig;
import java.util.Collection;
import java.util.HashSet;

/* JADX INFO: renamed from: X.1DCQ, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DCQ {
    public static final HashSet<String> LIZ;

    static {
        Collection<? extends String> collection;
        HashSet<String> hashSet = new HashSet<>();
        LIZ = hashSet;
        hashSet.add("like");
        hashSet.add("like_cancel");
        hashSet.add("click_comment_button");
        hashSet.add("share_video");
        hashSet.add("follow");
        hashSet.add("follow_cancel");
        hashSet.add("favourite_video");
        hashSet.add("cancel_favourite_video");
        hashSet.add("post_comment");
        hashSet.add("enter_music_detail");
        hashSet.add("enter_personal_detail");
        hashSet.add("play_time");
        hashSet.add("video_play");
        hashSet.add("video_play_finish");
        hashSet.add("dislike");
        hashSet.add("report");
        hashSet.add("livesdk_live_window_duration_v2");
        hashSet.add("livesdk_live_duration");
        hashSet.add("livesdk_live_show");
        if (C2251931DCd.LIZJ) {
            hashSet.add("livesdk_follow");
            hashSet.add("livesdk_unfollow");
        }
        if (C2251931DCd.LIZLLL) {
            hashSet.add("livesdk_share");
        }
        if (C2251931DCd.LJ) {
            hashSet.add("livesdk_dislike");
        }
        if (C2251931DCd.LJFF) {
            hashSet.add("livesdk_live_user_report");
        }
        if (C2251931DCd.LJI) {
            hashSet.add("livesdk_comment_pannel_show");
            hashSet.add("livesdk_audience_live_message");
        }
        if (C2251931DCd.LJII) {
            hashSet.add("livesdk_like");
        }
        if (((Number) C283800BAk.LIZ.getValue()).intValue() > 0) {
            DynamicFeatureConfig dynamicFeatureConfig = (DynamicFeatureConfig) C07N4.LIZIZ.getValue();
            if (dynamicFeatureConfig == null || (collection = dynamicFeatureConfig.eventWhiteList) == null) {
                collection = C13BV.INSTANCE;
            }
            hashSet.addAll(collection);
        }
        if (C0BPK.LIZ()) {
            hashSet.add("video_feedback_bar_show");
            hashSet.add("video_feedback_bar_disappear");
        }
    }
}
