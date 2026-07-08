package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.thought.ui.like.SocialThoughtLikeCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Swd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.ui.like.SocialThoughtLikeCell$onItemViewCreated$3$1", f = "SocialThoughtLikeCell.kt", l = {}, m = "invokeSuspend")
public final class C737650Swd extends C09AX implements Function1<InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ SocialThoughtLikeCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C737650Swd(SocialThoughtLikeCell socialThoughtLikeCell, InterfaceC1364105Vn<? super C737650Swd> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = socialThoughtLikeCell;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C737650Swd(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        User user;
        String str;
        C1C7U.LIZ("SocialThoughtLikeCell@ba18.onItemViewCreated$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C319540Cfo item = this.LL.getItem();
        if (item != null && (user = item.LL) != null && user.getFollowStatus() == C0SY7.FOLLOW_MUTUAL.getValue()) {
            SocialThoughtLikeCell socialThoughtLikeCell = this.LL;
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(socialThoughtLikeCell.itemView.getContext());
            if (c19egLIZIZ != null) {
                IMUser.Companion.getClass();
                IMUser iMUserLIZJ = C2201941BFw.LIZJ(user);
                if (iMUserLIZJ != null) {
                    EnterChatParams enterChatParams = new EnterChatParams((Context) c19egLIZIZ, iMUserLIZJ);
                    enterChatParams.setQuickChat(true);
                    enterChatParams.setQuickChatViewType(1);
                    enterChatParams.setShowKeyBoardByDefault(true);
                    C319540Cfo item2 = socialThoughtLikeCell.getItem();
                    if (item2 == null || (str = item2.LLILLJJLI) == null) {
                        str = "";
                    }
                    enterChatParams.setEnterFromForMob(str);
                    enterChatParams.setEnterMethodForMob("creator_thought_view_panel_likes");
                    C1336205Ku.LIZ(false).getImChatService().LJIILLIIL(enterChatParams, null);
                }
            }
            C1C7U.LIZIZ("SocialThoughtLikeCell@ba18.onItemViewCreated$3$1");
            return true;
        }
        C1C7U.LIZIZ("SocialThoughtLikeCell@ba18.onItemViewCreated$3$1");
        return false;
    }
}
