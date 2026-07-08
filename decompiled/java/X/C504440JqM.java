package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.chatroom.api.SubOnlyVideosBriefInfo;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.ranges.IntRange;
import kotlin.text.a0;
import webcast.api.sub.HomePageInfo;

/* JADX INFO: renamed from: X.0JqM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C504440JqM {
    public final SubSpaceFeedVM LIZ;
    public HashSet<SpacePost> LIZIZ = new HashSet<>();

    public C504440JqM(SubSpaceFeedVM subSpaceFeedVM) {
        this.LIZ = subSpaceFeedVM;
    }

    public final void LIZ(RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager;
        AbstractC502430Jn7 abstractC502430Jn7;
        C504450JqN c504450JqNWQ2;
        C504510JqT c504510JqT;
        HomePageInfo homePageInfo;
        Integer numValueOf;
        Long lValueOf;
        SpacePost spacePostLIZ;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            HashSet hashSetLLIFFJFJJ = C13LP.LLIFFJFJJ(new IntRange(linearLayoutManager.findFirstVisibleItemPosition(), linearLayoutManager.findLastVisibleItemPosition()));
            AbstractC21673619ry adapter = recyclerView.getAdapter();
            if ((adapter instanceof C503260JoS) && (abstractC502430Jn7 = (AbstractC502430Jn7) adapter) != null) {
                ArrayList<AbstractC503810JpL> arrayList = abstractC502430Jn7.LL;
                HashSet<SpacePost> hashSet = new HashSet<>();
                Iterator it2 = hashSetLLIFFJFJJ.iterator();
                while (it2.hasNext()) {
                    int iIntValue = ((Number) it2.next()).intValue();
                    if (iIntValue >= 0 && iIntValue < arrayList.size() && (spacePostLIZ = ((AbstractC503810JpL) ListProtector.get(arrayList, iIntValue)).LIZ()) != null) {
                        hashSet.add(spacePostLIZ);
                    }
                }
                for (SpacePost spacePost : hashSet) {
                    if (!this.LIZIZ.contains(spacePost) && (c504510JqT = (c504450JqNWQ2 = this.LIZ.wQ2()).LIZ) != null && (homePageInfo = c504510JqT.LLILZLL) != null) {
                        boolean z = c504510JqT.LLJ;
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_subscription_space_post_show");
                        c474500IjALIZ.LJJII(Long.valueOf(spacePost.postId), "post_id");
                        c474500IjALIZ.LJJII(C504450JqN.LIZIZ(spacePost), "post_type");
                        SubOnlyVideosBriefInfo subOnlyVideosBriefInfo = spacePost.subOnlyVideosBriefInfo;
                        if (subOnlyVideosBriefInfo != null) {
                            numValueOf = Integer.valueOf(subOnlyVideosBriefInfo.totalCount);
                        } else {
                            numValueOf = null;
                        }
                        c474500IjALIZ.LJJII(numValueOf, "video_cnt");
                        c474500IjALIZ.LJJII(C504450JqN.LIZJ(spacePost), "vote_cnt");
                        c474500IjALIZ.LJJII(Long.valueOf(spacePost.commentCount), "comment_cnt");
                        c474500IjALIZ.LJJII(Long.valueOf(spacePost.likeCount), "like_cnt");
                        c474500IjALIZ.LJJII(Long.valueOf(spacePost.activeTimeSec), "last_refresh_time");
                        c474500IjALIZ.LJJII(Integer.valueOf(!z ? 1 : 0), "is_user");
                        c474500IjALIZ.LJJII(Integer.valueOf(!a0.LJJJIL(homePageInfo.jumpUrl) ? 1 : 0), "is_onlive");
                        User user = homePageInfo.anchorInfo;
                        if (user != null) {
                            lValueOf = Long.valueOf(user.getId());
                        } else {
                            lValueOf = null;
                        }
                        c474500IjALIZ.LJJII(lValueOf, "anchor_id");
                        c474500IjALIZ.LJJII(c504450JqNWQ2.LIZ.LLJIJIL, "space_show_entrance");
                        c474500IjALIZ.LIZ();
                    }
                }
                this.LIZIZ = hashSet;
            }
        }
    }
}
