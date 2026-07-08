package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SpacePoll;
import com.bytedance.android.livesdk.chatroom.api.SpacePollOption;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.chatroom.api.SubOnlyVideosBriefInfo;
import com.bytedance.android.livesdk.chatroom.api.VoteInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;
import webcast.api.sub.HomePageInfo;

/* JADX INFO: renamed from: X.0K2D, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K2D implements C0K3Y {
    public final C511370K3r LIZ;

    public C0K2D(C511370K3r c511370K3r) {
        this.LIZ = c511370K3r;
    }

    public static final String LIZIZ(SpacePost spacePost) {
        if (spacePost.pollInfo != null) {
            return "vote";
        }
        if (spacePost.subOnlyVideosBriefInfo != null) {
            return "video";
        }
        return "topic";
    }

    public static Long LIZJ(SpacePost spacePost) {
        Boolean boolValueOf;
        List<SpacePollOption> list;
        SpacePoll spacePoll = spacePost.pollInfo;
        if (spacePoll == null) {
            return null;
        }
        VoteInfo voteInfo = spacePoll.voteInfo;
        if (voteInfo != null) {
            boolValueOf = Boolean.valueOf(voteInfo.hasVoted);
        } else {
            boolValueOf = null;
        }
        if (C0K51.LJI(boolValueOf)) {
            return null;
        }
        SpacePoll spacePoll2 = spacePost.pollInfo;
        long j = 0;
        if (spacePoll2 != null && (list = spacePoll2.optionList) != null) {
            Iterator<SpacePollOption> it2 = list.iterator();
            while (it2.hasNext()) {
                j += it2.next().votes;
            }
        }
        return Long.valueOf(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0K3Y
    public final void LIZ(SpacePost spacePost, String str) {
        HomePageInfo homePageInfo;
        boolean z;
        Integer numValueOf;
        Long lValueOf;
        C511370K3r c511370K3r = this.LIZ;
        String str2 = null;
        if (c511370K3r != null) {
            homePageInfo = c511370K3r.LLILZLL;
            z = c511370K3r.LLJ;
        } else {
            homePageInfo = null;
            z = 0;
        }
        if (spacePost != null && homePageInfo != null) {
            C511970K5z c511970K5z = new C511970K5z("livesdk_anchor_subscription_space_post_click");
            c511970K5z.LIZIZ(Long.valueOf(spacePost.postId), "post_id");
            c511970K5z.LIZIZ(LIZIZ(spacePost), "post_type");
            c511970K5z.LIZIZ(str, "click_type");
            SubOnlyVideosBriefInfo subOnlyVideosBriefInfo = spacePost.subOnlyVideosBriefInfo;
            if (subOnlyVideosBriefInfo != null) {
                numValueOf = Integer.valueOf(subOnlyVideosBriefInfo.totalCount);
            } else {
                numValueOf = null;
            }
            c511970K5z.LIZIZ(numValueOf, "video_cnt");
            c511970K5z.LIZIZ(LIZJ(spacePost), "vote_cnt");
            c511970K5z.LIZIZ(Long.valueOf(spacePost.commentCount), "comment_cnt");
            c511970K5z.LIZIZ(Long.valueOf(spacePost.likeCount), "like_cnt");
            c511970K5z.LIZIZ(Long.valueOf(spacePost.activeTimeSec), "last_refresh_time");
            c511970K5z.LIZIZ(Integer.valueOf(!z), "is_user");
            c511970K5z.LIZIZ(Integer.valueOf(!a0.LJJJIL(homePageInfo.jumpUrl) ? 1 : 0), "is_onlive");
            User user = homePageInfo.anchorInfo;
            if (user != null) {
                lValueOf = Long.valueOf(user.getId());
            } else {
                lValueOf = null;
            }
            c511970K5z.LIZIZ(lValueOf, "anchor_id");
            C511370K3r c511370K3r2 = this.LIZ;
            if (c511370K3r2 != null) {
                str2 = c511370K3r2.LLJIJIL;
            }
            c511970K5z.LIZIZ(str2, "space_show_entrance");
            c511970K5z.LIZLLL();
        }
    }

    public final void LIZLLL(String str, HomePageInfo homePageInfo, boolean z) {
        Object objValueOf;
        if (homePageInfo == null) {
            return;
        }
        C511970K5z c511970K5z = new C511970K5z("livesdk_anchor_subscription_space_page_click");
        c511970K5z.LIZIZ(str, "click_type");
        c511970K5z.LIZIZ(Integer.valueOf(!z ? 1 : 0), "is_user");
        c511970K5z.LIZIZ(Integer.valueOf(!a0.LJJJIL(homePageInfo.jumpUrl) ? 1 : 0), "is_onlive");
        User user = homePageInfo.anchorInfo;
        Object obj = null;
        if (user != null) {
            objValueOf = Long.valueOf(user.getId());
        } else {
            objValueOf = null;
        }
        c511970K5z.LIZIZ(objValueOf, "anchor_id");
        C511370K3r c511370K3r = this.LIZ;
        if (c511370K3r != null) {
            obj = c511370K3r.LLJIJIL;
        }
        c511970K5z.LIZIZ(obj, "space_show_entrance");
        c511970K5z.LIZLLL();
    }
}
