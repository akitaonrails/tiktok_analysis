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

/* JADX INFO: renamed from: X.0JqN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C504450JqN implements InterfaceC502750Jnd {
    public final C504510JqT LIZ;

    public C504450JqN(C504510JqT c504510JqT) {
        this.LIZ = c504510JqT;
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
        if (C500260Jjc.LJJJI(boolValueOf)) {
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
    @Override // X.InterfaceC502750Jnd
    public final void LIZ(SpacePost spacePost, String str) {
        HomePageInfo homePageInfo;
        boolean z;
        Integer numValueOf;
        Long lValueOf;
        C504510JqT c504510JqT = this.LIZ;
        String str2 = null;
        if (c504510JqT != null) {
            homePageInfo = c504510JqT.LLILZLL;
            z = c504510JqT.LLJ;
        } else {
            homePageInfo = null;
            z = 0;
        }
        if (spacePost != null && homePageInfo != null) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_subscription_space_post_click");
            c474500IjALIZ.LJJII(Long.valueOf(spacePost.postId), "post_id");
            c474500IjALIZ.LJJII(LIZIZ(spacePost), "post_type");
            c474500IjALIZ.LJJII(str, "click_type");
            SubOnlyVideosBriefInfo subOnlyVideosBriefInfo = spacePost.subOnlyVideosBriefInfo;
            if (subOnlyVideosBriefInfo != null) {
                numValueOf = Integer.valueOf(subOnlyVideosBriefInfo.totalCount);
            } else {
                numValueOf = null;
            }
            c474500IjALIZ.LJJII(numValueOf, "video_cnt");
            c474500IjALIZ.LJJII(LIZJ(spacePost), "vote_cnt");
            c474500IjALIZ.LJJII(Long.valueOf(spacePost.commentCount), "comment_cnt");
            c474500IjALIZ.LJJII(Long.valueOf(spacePost.likeCount), "like_cnt");
            c474500IjALIZ.LJJII(Long.valueOf(spacePost.activeTimeSec), "last_refresh_time");
            c474500IjALIZ.LJJII(Integer.valueOf(!z), "is_user");
            c474500IjALIZ.LJJII(Integer.valueOf(!a0.LJJJIL(homePageInfo.jumpUrl) ? 1 : 0), "is_onlive");
            User user = homePageInfo.anchorInfo;
            if (user != null) {
                lValueOf = Long.valueOf(user.getId());
            } else {
                lValueOf = null;
            }
            c474500IjALIZ.LJJII(lValueOf, "anchor_id");
            C504510JqT c504510JqT2 = this.LIZ;
            if (c504510JqT2 != null) {
                str2 = c504510JqT2.LLJIJIL;
            }
            c474500IjALIZ.LJJII(str2, "space_show_entrance");
            c474500IjALIZ.LIZ();
        }
    }

    public final void LIZLLL(String str, HomePageInfo homePageInfo, boolean z) {
        Object objValueOf;
        if (homePageInfo == null) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_subscription_space_page_click");
        c474500IjALIZ.LJJII(str, "click_type");
        c474500IjALIZ.LJJII(Integer.valueOf(!z ? 1 : 0), "is_user");
        c474500IjALIZ.LJJII(Integer.valueOf(!a0.LJJJIL(homePageInfo.jumpUrl) ? 1 : 0), "is_onlive");
        User user = homePageInfo.anchorInfo;
        Object obj = null;
        if (user != null) {
            objValueOf = Long.valueOf(user.getId());
        } else {
            objValueOf = null;
        }
        c474500IjALIZ.LJJII(objValueOf, "anchor_id");
        C504510JqT c504510JqT = this.LIZ;
        if (c504510JqT != null) {
            obj = c504510JqT.LLJIJIL;
        }
        c474500IjALIZ.LJJII(obj, "space_show_entrance");
        c474500IjALIZ.LIZ();
    }
}
