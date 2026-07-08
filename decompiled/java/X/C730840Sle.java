package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleCommonCell;
import com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleDmReplyCell;
import com.ss.android.ugc.aweme.comment.commentpage.model.PaginationCursor;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.model.StoryInteraction;
import com.ss.android.ugc.aweme.story.model.StoryInteractionUser;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.0Sle, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C730840Sle extends AbstractC1356940lPo {
    public final C01GW LLIZ;

    @Override // X.AbstractC1356940lPo
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.AbstractC1356940lPo
    public final boolean LJII() {
        return false;
    }

    @Override // X.AbstractC1356940lPo
    public final void LJI() {
        this.LL.LJIILJJIL(ReactionBubbleCommonCell.class, ReactionBubbleDmReplyCell.class);
    }

    public C730840Sle(C1356950lPp c1356950lPp) {
        super(c1356950lPp, true);
        this.LLIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1146));
    }

    @Override // X.AbstractC1356940lPo
    public final void LJ(InterfaceC1364105Vn<? super AbstractC316870CbV<C331340Cyq>> interfaceC1364105Vn) {
        LJIIIIZZ(interfaceC1364105Vn, new C331340Cyq(4, new PaginationCursor(0L, 0L)));
    }

    public final List<InterfaceC1891350zJl> LJIIIZ(List<StoryInteractionUser> list) {
        StoryInteraction storyInteraction;
        C720930SPr c0sq6;
        ArrayList arrayList = new ArrayList();
        for (StoryInteractionUser storyInteractionUser : list) {
            User user = storyInteractionUser.user;
            if (user != null && (storyInteraction = storyInteractionUser.storyInteraction) != null) {
                int i = storyInteraction.type;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 6) {
                                c0sq6 = new C0SQ6(user, Collections.singletonList(1002), "views", this.LL.getMMobEventParam(), true, 4);
                            }
                        } else {
                            c0sq6 = new C0SQ6(user, (List<Integer>) C13BV.INSTANCE, storyInteraction.emojiContent, "emoji", this.LL.getMMobEventParam(), true);
                        }
                    } else {
                        c0sq6 = new C0SQ6(user, Collections.singletonList(1001), "like", this.LL.getMMobEventParam(), true, 4);
                    }
                } else {
                    String str = storyInteraction.messageContent;
                    String str2 = storyInteraction.conversationId;
                    long j = storyInteraction.messageId;
                    if (C703302op.LIZ(str)) {
                        c0sq6 = new C0SWV(user, str2, j, str, this.LL.getMMobEventParam());
                    } else {
                        c0sq6 = new C0SQ6(user, Collections.singletonList(1003), "dm", this.LL.getMMobEventParam(), true, 4);
                    }
                }
                arrayList.add(c0sq6);
            }
        }
        return arrayList;
    }

    @Override // X.AbstractC1356940lPo
    public final void LIZLLL(InterfaceC1364105Vn<? super AbstractC316870CbV<C331340Cyq>> interfaceC1364105Vn, C331340Cyq c331340Cyq) {
        LJIIIIZZ(interfaceC1364105Vn, c331340Cyq);
    }

    public final void LJIIIIZZ(InterfaceC1364105Vn<? super AbstractC316870CbV<C331340Cyq>> interfaceC1364105Vn, C331340Cyq c331340Cyq) {
        boolean zLJI = MethodIDManager.LJI(202470);
        C23250099c.LIZLLL((InterfaceC497601wk) this.LLIZ.getValue(), null, null, new C331310Cyn(this, interfaceC1364105Vn, c331340Cyq, null), 3);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
