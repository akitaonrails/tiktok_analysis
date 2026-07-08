package X;

import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15X0, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15X0 {
    public static final C15X0 LIZ = new C15X0();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1851030yGj());
    public static boolean LIZJ;
    public static IPitayaCore LIZLLL;

    public static IPitayaCore LIZIZ() {
        IPitayaCore iPitayaCore = LIZLLL;
        if (iPitayaCore != null) {
            return iPitayaCore;
        }
        C844470XAv.LIZ.getClass();
        return PitayaCoreFactory.getCore(String.valueOf(C844470XAv.LJIIJ));
    }

    public static boolean LIZJ() {
        boolean zIsReady;
        if (LIZJ) {
            return true;
        }
        if (((Boolean) C263830AVp.LIZ.getValue()).booleanValue()) {
            AnonymousClass1455.LIZ.getClass();
            zIsReady = AnonymousClass1455.LJI();
        } else {
            zIsReady = LIZIZ().isReady();
        }
        if (zIsReady) {
            LIZJ = true;
            LIZLLL = LIZIZ();
        }
        return zIsReady;
    }

    public static void LIZ(JSONObject jSONObject, Aweme aweme) throws JSONException {
        int rate;
        boolean zIsAd;
        int duration;
        int contentOriginalType;
        int followerStatus;
        int followStatus;
        long downloadCount;
        long shareCount;
        long commentCount;
        User author;
        AwemeStatistics statistics;
        AwemeStatistics statistics2;
        AwemeStatistics statistics3;
        User author2;
        User author3;
        User author4;
        Video video;
        if (aweme != null) {
            rate = aweme.getRate();
        } else {
            rate = -1;
        }
        jSONObject.put("rate", rate);
        int followerCount = 0;
        if (aweme != null) {
            zIsAd = aweme.isAd();
        } else {
            zIsAd = false;
        }
        jSONObject.put("is_ads", zIsAd);
        if (aweme != null && (video = aweme.getVideo()) != null) {
            duration = video.getDuration();
        } else {
            duration = 0;
        }
        jSONObject.put("video_duration", duration);
        if (aweme != null) {
            contentOriginalType = aweme.getContentOriginalType();
        } else {
            contentOriginalType = 0;
        }
        jSONObject.put("content_original_type", contentOriginalType);
        if (aweme != null && (author4 = aweme.getAuthor()) != null) {
            followerStatus = author4.getFollowerStatus();
        } else {
            followerStatus = 0;
        }
        jSONObject.put("author_follower_status", followerStatus);
        if (aweme != null && (author3 = aweme.getAuthor()) != null) {
            followStatus = author3.getFollowStatus();
        } else {
            followStatus = 0;
        }
        jSONObject.put("author_follow_status", followStatus);
        if (aweme != null && (author2 = aweme.getAuthor()) != null) {
            followerCount = author2.getFollowerCount();
        }
        jSONObject.put("author_follower_count", followerCount);
        long j = 0;
        if (aweme != null && (statistics3 = aweme.getStatistics()) != null) {
            downloadCount = statistics3.getDownloadCount();
        } else {
            downloadCount = 0;
        }
        jSONObject.put("statistics_download_count", downloadCount);
        if (aweme != null && (statistics2 = aweme.getStatistics()) != null) {
            shareCount = statistics2.getShareCount();
        } else {
            shareCount = 0;
        }
        jSONObject.put("statistics_share_count", shareCount);
        if (aweme != null && (statistics = aweme.getStatistics()) != null) {
            commentCount = statistics.getCommentCount();
        } else {
            commentCount = 0;
        }
        jSONObject.put("statistics_comment_count", commentCount);
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            j = author.profilePv;
        }
        jSONObject.put("author_profile_pv", j);
    }
}
