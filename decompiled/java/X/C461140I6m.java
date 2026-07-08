package X;

import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.ability.ScrollToMessageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0I6m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C461140I6m extends C09AY implements Function1<Integer, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ UIAssem LLILLJJLI;
    public final /* synthetic */ SessionInfo LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ AssemVMLazy<C461100I6i, ScrollToMessageViewModel> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C461140I6m(long j, UIAssem uIAssem, SessionInfo sessionInfo, int i, AssemVMLazy<C461100I6i, ScrollToMessageViewModel> assemVMLazy) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = uIAssem;
        this.LLILLL = sessionInfo;
        this.LLILZ = i;
        this.LLILZIL = assemVMLazy;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        Object ability;
        int iIntValue = num.intValue();
        AssemVMLazy<C461100I6i, ScrollToMessageViewModel> assemVMLazy = this.LLILZIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C461120I6k.LLILLJJLI;
        ((ScrollToMessageViewModel) assemVMLazy.getValue()).vQ2(this.LL);
        Fragment fragmentLJI = C724240Sb0.LJI(this.LLILLJJLI);
        if (fragmentLJI != null) {
            Object obj = null;
            C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJFF(fragmentLJI, null), ChatRoomScope.class);
            if (c0qsjLIZJ != null) {
                ability = c0qsjLIZJ.getAbility(ChatroomEventAbility.class);
            } else {
                ability = null;
            }
            if (ability instanceof ChatroomEventAbility) {
                obj = ability;
            }
            ChatroomEventAbility chatroomEventAbility = (ChatroomEventAbility) obj;
            if (chatroomEventAbility != null) {
                chatroomEventAbility.QU0(new C06P6(false));
            }
        }
        C1599006Nw.LIZ(this.LLILLL.getConversationId(), true, iIntValue - this.LLILZ);
        return Unit.LIZ;
    }
}
