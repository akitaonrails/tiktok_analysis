package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.changename.fragment.EditGroupNameFragment;
import com.ss.android.ugc.aweme.chatroom.GroupChatAssem;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.content.GroupSystemContent;
import com.ss.android.ugc.aweme.live.GroupChatPageLiveViewModel;
import com.ss.android.ugc.aweme.mention.ability.ChatRoomMentionPanelAbility;
import com.ss.android.ugc.aweme.titlebar.GroupTitleBarCenterAssem;
import com.ss.android.ugc.aweme.titlebar.GroupWithStoryTitleBarCenterAssem;
import java.util.List;

/* JADX INFO: renamed from: X.0Zmy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C910020Zmy implements InterfaceC1662206f6 {
    public static final C910020Zmy LIZJ = new C910020Zmy();

    @Override // X.InterfaceC1662206f6
    public final String LJIIIIZZ(GroupSystemContent groupSystemContent) {
        throw null;
    }

    @Override // X.InterfaceC1662206f6
    public final C19719912Dl LJIIIZ() {
        return C13LE.LIZ(GroupChatAssem.class);
    }

    @Override // X.InterfaceC1662206f6
    public final C19719912Dl LJI(String str) {
        Class cls;
        if (C298480Bmw.LIZ() && C1229100i5c.LIZ.LJIIJ(str)) {
            cls = GroupWithStoryTitleBarCenterAssem.class;
        } else {
            cls = GroupTitleBarCenterAssem.class;
        }
        return C13LE.LIZ(cls);
    }

    @Override // X.InterfaceC1662206f6
    public final InterfaceC1612206Sy LJFF(final Fragment fragment, final SessionInfo sessionInfo) {
        return (InterfaceC1612206Sy) ViewModelProviders.of(fragment, new ViewModelProvider.Factory() { // from class: X.06Nm
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final <T extends ViewModel> T create(Class<T> cls) {
                if (cls.isAssignableFrom(GroupChatPageLiveViewModel.class)) {
                    return new GroupChatPageLiveViewModel(sessionInfo, fragment);
                }
                throw new IllegalArgumentException("GroupChatPageLiveViewModel.get(): Unknown ViewModel class");
            }
        }).get(GroupChatPageLiveViewModel.class);
    }

    @Override // X.InterfaceC1662206f6
    public final void LJIIJJI(C0Y8T c0y8t, InterfaceC497601wk interfaceC497601wk) {
        C23250099c.LIZLLL(interfaceC497601wk, C0PEM.LIZJ, null, new C0NZI(c0y8t, null), 2);
    }

    @Override // X.InterfaceC1662206f6
    public final void LJJIIZ(InterfaceC665370Q7z interfaceC665370Q7z, List<String> list) {
        ChatRoomMentionPanelAbility chatRoomMentionPanelAbility = (ChatRoomMentionPanelAbility) C1558520qew.LIZ(interfaceC665370Q7z, ChatRoomMentionPanelAbility.class, null);
        if (chatRoomMentionPanelAbility != null) {
            chatRoomMentionPanelAbility.Ef1(list);
        }
    }

    @Override // X.InterfaceC1662206f6
    public final boolean LJJIJIIJI(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
        if (C0NZR.LIZ(c869590Y9l) == C0NZT.ONBOARDING_CARD_STATUS_FINISH) {
            return true;
        }
        if (c0y8t != null && C13LZ.LJ(c0y8t.getMemberCount() - 1, 0, 2) >= 2) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1662206f6
    public final void LJIIZILJ(Context context, Fragment fragment, String str) {
        EditGroupNameFragment.LLIZLLLIL.getClass();
        C910000Zmw.LIZ(context, fragment, str, "inline_chat");
    }
}
