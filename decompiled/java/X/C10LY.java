package X;

import com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2;
import com.ss.android.ugc.aweme.friends.model.SuperAccountList;
import com.ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* JADX INFO: renamed from: X.10LY, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10LY implements C10LS {
    public final /* synthetic */ EmptyGuideV2 LIZ;

    public C10LY(EmptyGuideV2 emptyGuideV2) {
        this.LIZ = emptyGuideV2;
    }

    public final void LIZ(User user) {
        String str = this.LIZ.LLIZLLLIL;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("to_user_id", user.getUid());
        c2344009Gk.LIZJ(user.getFollowStatus(), "relation_tag");
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_follow");
        c2344009Gk.LJIIIIZZ("enter_type", "card");
        c2344009Gk.LJIIIIZZ("trigger_reason", "cold_launch");
        user.getRecommendReason();
        c2344009Gk.LJIIIIZZ("rec_reason", "super_account");
        c2344009Gk.LJIIIIZZ("log_pb", C584850Mwl.LIZ.LIZIZ(str));
        c2344009Gk.LJIIIIZZ("enter_method", "click_follow_card");
        C20684815ws.LJIJ("enter_personal_detail", C735370Ssx.LJJJ(c2344009Gk.LIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ(int i, User user) {
        M m;
        AbstractC728630Si5 abstractC728630Si5;
        T t;
        C19230810Li c19230810Li = this.LIZ.LLJ;
        if (c19230810Li != null && (m = c19230810Li.LL) != 0 && (t = (abstractC728630Si5 = (AbstractC728630Si5) m).LLILLJJLI) != 0 && !((SuperAccountList) t).getUserList().isEmpty()) {
            List<UserWithAweme> userList = ((SuperAccountList) abstractC728630Si5.LLILLJJLI).getUserList();
            userList.remove(user);
            ((SuperAccountList) abstractC728630Si5.LLILLJJLI).userList = userList;
        }
        C19218810Gs.LIZIZ(i, user, "delete");
    }
}
