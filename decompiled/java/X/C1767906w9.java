package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.chatnotice.GroupChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.alphavideo.ChatRoomAlphaVideoViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.viewmodel.CommonChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.viewmodel.SingleChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.suggestedemoji.SuggestedEmojiViewModel;
import com.ss.android.ugc.aweme.im.service.viewmodel.ChatRoomStreakViewModel;

/* JADX INFO: renamed from: X.06w9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1767906w9 implements ViewModelProvider.Factory {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
        switch (this.$t) {
        }
        return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        switch (this.$t) {
            case 0:
                return (T) create$0(this, cls);
            case 1:
                return (T) create$1(this, cls);
            case 2:
                return (T) create$2(this, cls);
            case 3:
                return (T) create$3(this, cls);
            case 4:
                return (T) create$4(this, cls);
            case 5:
                return (T) create$5(this, cls);
            case 6:
                return (T) create$6(this, cls);
            case 7:
                return (T) create$7(this, cls);
            default:
                return null;
        }
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
        switch (this.$t) {
        }
        return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
    }

    public C1767906w9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final ViewModel create$0(C1767906w9 c1767906w9, Class cls) {
        return new GroupChatNoticeViewModel((IChatNoticeFlowEngine) c1767906w9.l0);
    }

    public static final ViewModel create$1(C1767906w9 c1767906w9, Class cls) {
        C0I0B c0i0b = C0I0B.LJFF;
        c0i0b.LIZJ();
        if (!C894660Z7w.LIZJ()) {
            c0i0b.LIZJ();
            if (!C894660Z7w.LJ()) {
                if (cls.isAssignableFrom(ICommonChatNoticeViewModel.class)) {
                    return new ICommonChatNoticeViewModel((IChatNoticeFlowEngine) c1767906w9.l0);
                }
                throw new IllegalArgumentException("ICommonChatNoticeViewModel.get(): Unknown ViewModel class");
            }
        }
        throw new IllegalArgumentException("ICommonChatNoticeViewModel.get(): Unknown ViewModel class");
    }

    public static final ViewModel create$2(C1767906w9 c1767906w9, Class cls) {
        Object ability;
        Fragment fragment = (Fragment) c1767906w9.l0;
        Object obj = null;
        C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJFF(fragment, null), ChatRoomScope.class);
        if (c0qsjLIZJ != null) {
            ability = c0qsjLIZJ.getAbility(InterfaceC1602806Pi.class);
        } else {
            ability = null;
        }
        if (ability instanceof InterfaceC1602806Pi) {
            obj = ability;
        }
        InterfaceC1602806Pi interfaceC1602806Pi = (InterfaceC1602806Pi) obj;
        if (interfaceC1602806Pi != null) {
            return new ChatRoomAlphaVideoViewModel(interfaceC1602806Pi);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final ViewModel create$3(C1767906w9 c1767906w9, Class cls) {
        return new CommonChatNoticeViewModel((IChatNoticeFlowEngine) c1767906w9.l0, C0PEM.LIZJ);
    }

    public static final ViewModel create$4(C1767906w9 c1767906w9, Class cls) {
        return C06LG.LIZ((AbstractC738140SxQ) c1767906w9.l0).getValue();
    }

    public static final ViewModel create$5(C1767906w9 c1767906w9, Class cls) {
        return new SingleChatNoticeViewModel((IChatNoticeFlowEngine) c1767906w9.l0);
    }

    public static final ViewModel create$6(C1767906w9 c1767906w9, Class cls) {
        return new SuggestedEmojiViewModel((C06N8) c1767906w9.l0);
    }

    public static final ViewModel create$7(C1767906w9 c1767906w9, Class cls) {
        Object ability;
        Fragment fragment = (Fragment) c1767906w9.l0;
        Object obj = null;
        C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJFF(fragment, null), ChatRoomScope.class);
        if (c0qsjLIZJ != null) {
            ability = c0qsjLIZJ.getAbility(InterfaceC1602806Pi.class);
        } else {
            ability = null;
        }
        if (ability instanceof InterfaceC1602806Pi) {
            obj = ability;
        }
        InterfaceC1602806Pi interfaceC1602806Pi = (InterfaceC1602806Pi) obj;
        if (interfaceC1602806Pi != null) {
            return new ChatRoomStreakViewModel(interfaceC1602806Pi);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
