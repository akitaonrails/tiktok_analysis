package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.detail.panel.RepostPanelViewModel;
import com.ss.android.ugc.aweme.upvote.detail.panel.UpvotePanelListCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0lSV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C1358610lSV extends C2217421BqW implements Function1<C0SY7, Unit> {
    public C1358610lSV(Object obj) {
        super(1, obj, UpvotePanelListCell.class, "onFollowStatusChange", "onFollowStatusChange(Lcom/ss/android/ugc/aweme/relation/follow/model/RelationStatusType;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0SY7 c0sy7) {
        UpvoteStruct upvoteStruct;
        User user;
        String uid;
        String aid;
        UpvoteStruct upvoteStruct2;
        User user2;
        String uid2;
        String aid2;
        UpvotePanelListCell upvotePanelListCell = (UpvotePanelListCell) this.receiver;
        upvotePanelListCell.getClass();
        if (C1358690lSd.LIZ()) {
            String str = "";
            UpvoteList upvoteListLIZJ = null;
            if (c0sy7 == C0SY7.UNFOLLOW) {
                RepostPanelViewModel repostPanelViewModelH6 = upvotePanelListCell.h6();
                C1358130lRj item = upvotePanelListCell.getItem();
                if (item != null && (upvoteStruct2 = item.LL) != null && (user2 = upvoteStruct2.user) != null && (uid2 = user2.getUid()) != null) {
                    C1358880lSw c1358880lSw = C1358880lSw.LIZ;
                    Aweme aweme = repostPanelViewModelH6.LLILLJJLI;
                    if (aweme != null && (aid2 = aweme.getAid()) != null) {
                        str = aid2;
                    }
                    c1358880lSw.getClass();
                    UpvoteList upvoteList = (UpvoteList) C1358880lSw.LJI().get(str);
                    if (upvoteList != null) {
                        C1358770lSl.LIZ.getClass();
                        C1358880lSw.LJI().put(str, C1358770lSl.LJIIIIZZ(upvoteList, uid2));
                    }
                    UpvoteList upvoteList2 = repostPanelViewModelH6.LL;
                    if (upvoteList2 != null) {
                        C1358770lSl.LIZ.getClass();
                        upvoteListLIZJ = C1358770lSl.LJIIIIZZ(upvoteList2, uid2);
                    }
                    repostPanelViewModelH6.LL = upvoteListLIZJ;
                    repostPanelViewModelH6.vQ2(upvoteListLIZJ, false);
                }
            } else {
                RepostPanelViewModel repostPanelViewModelH62 = upvotePanelListCell.h6();
                C1358130lRj item2 = upvotePanelListCell.getItem();
                if (item2 != null && (upvoteStruct = item2.LL) != null && (user = upvoteStruct.user) != null && (uid = user.getUid()) != null) {
                    C1358880lSw c1358880lSw2 = C1358880lSw.LIZ;
                    Aweme aweme2 = repostPanelViewModelH62.LLILLJJLI;
                    if (aweme2 != null && (aid = aweme2.getAid()) != null) {
                        str = aid;
                    }
                    c1358880lSw2.getClass();
                    UpvoteList upvoteList3 = (UpvoteList) C1358880lSw.LJI().get(str);
                    if (upvoteList3 != null) {
                        C1358770lSl.LIZ.getClass();
                        C1358880lSw.LJI().put(str, C1358770lSl.LIZJ(upvoteList3, uid));
                    }
                    UpvoteList upvoteList4 = repostPanelViewModelH62.LL;
                    if (upvoteList4 != null) {
                        C1358770lSl.LIZ.getClass();
                        upvoteListLIZJ = C1358770lSl.LIZJ(upvoteList4, uid);
                    }
                    repostPanelViewModelH62.LL = upvoteListLIZJ;
                    repostPanelViewModelH62.vQ2(upvoteListLIZJ, false);
                }
            }
            C1358130lRj item3 = upvotePanelListCell.getItem();
            if (item3 != null) {
                upvotePanelListCell.N5(item3);
                upvotePanelListCell.R5(item3);
            }
            C1358600lSU c1358600lSU = upvotePanelListCell.LLJJJJ;
            if (c1358600lSU != null) {
                c1358600lSU.LJ();
            }
        }
        return Unit.LIZ;
    }
}
