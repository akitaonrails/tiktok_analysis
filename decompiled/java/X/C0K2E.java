package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.chatroom.api.SubOnlyVideosBriefInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.ranges.IntRange;
import kotlin.text.a0;
import webcast.api.sub.HomePageInfo;

/* JADX INFO: renamed from: X.0K2E, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K2E {
    public final SubSpaceFeedVM LIZ;
    public HashSet<SpacePost> LIZIZ = new HashSet<>();

    public C0K2E(SubSpaceFeedVM subSpaceFeedVM) {
        this.LIZ = subSpaceFeedVM;
    }

    public final void LIZ(RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager;
        AbstractC511100K2q abstractC511100K2q;
        C0K2D c0k2dXQ2;
        C511370K3r c511370K3r;
        HomePageInfo homePageInfo;
        Integer numValueOf;
        Long lValueOf;
        SpacePost spacePostLIZ;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            HashSet hashSetLLIFFJFJJ = C13LP.LLIFFJFJJ(new IntRange(linearLayoutManager.findFirstVisibleItemPosition(), linearLayoutManager.findLastVisibleItemPosition()));
            AbstractC21673619ry adapter = recyclerView.getAdapter();
            if ((adapter instanceof C0K2Z) && (abstractC511100K2q = (AbstractC511100K2q) adapter) != null) {
                ArrayList<AbstractC511160K2w> arrayList = abstractC511100K2q.LL;
                HashSet<SpacePost> hashSet = new HashSet<>();
                Iterator it2 = hashSetLLIFFJFJJ.iterator();
                while (it2.hasNext()) {
                    int iIntValue = ((Number) it2.next()).intValue();
                    if (iIntValue >= 0 && iIntValue < arrayList.size() && (spacePostLIZ = ((AbstractC511160K2w) ListProtector.get(arrayList, iIntValue)).LIZ()) != null) {
                        hashSet.add(spacePostLIZ);
                    }
                }
                for (SpacePost spacePost : hashSet) {
                    if (!this.LIZIZ.contains(spacePost) && (c511370K3r = (c0k2dXQ2 = this.LIZ.xQ2()).LIZ) != null && (homePageInfo = c511370K3r.LLILZLL) != null) {
                        boolean z = c511370K3r.LLJ;
                        C511970K5z c511970K5z = new C511970K5z("livesdk_anchor_subscription_space_post_show");
                        c511970K5z.LIZIZ(Long.valueOf(spacePost.postId), "post_id");
                        c511970K5z.LIZIZ(C0K2D.LIZIZ(spacePost), "post_type");
                        SubOnlyVideosBriefInfo subOnlyVideosBriefInfo = spacePost.subOnlyVideosBriefInfo;
                        if (subOnlyVideosBriefInfo != null) {
                            numValueOf = Integer.valueOf(subOnlyVideosBriefInfo.totalCount);
                        } else {
                            numValueOf = null;
                        }
                        c511970K5z.LIZIZ(numValueOf, "video_cnt");
                        c511970K5z.LIZIZ(C0K2D.LIZJ(spacePost), "vote_cnt");
                        c511970K5z.LIZIZ(Long.valueOf(spacePost.commentCount), "comment_cnt");
                        c511970K5z.LIZIZ(Long.valueOf(spacePost.likeCount), "like_cnt");
                        c511970K5z.LIZIZ(Long.valueOf(spacePost.activeTimeSec), "last_refresh_time");
                        c511970K5z.LIZIZ(Integer.valueOf(!z ? 1 : 0), "is_user");
                        c511970K5z.LIZIZ(Integer.valueOf(!a0.LJJJIL(homePageInfo.jumpUrl) ? 1 : 0), "is_onlive");
                        User user = homePageInfo.anchorInfo;
                        if (user != null) {
                            lValueOf = Long.valueOf(user.getId());
                        } else {
                            lValueOf = null;
                        }
                        c511970K5z.LIZIZ(lValueOf, "anchor_id");
                        c511970K5z.LIZIZ(c0k2dXQ2.LIZ.LLJIJIL, "space_show_entrance");
                        c511970K5z.LIZLLL();
                    }
                }
                this.LIZIZ = hashSet;
            }
        }
    }
}
