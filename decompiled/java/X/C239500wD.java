package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.model.message.SocialMessage;
import com.bytedance.android.livesdk.share.LiveShareDialog;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.00wD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C239500wD extends AbstractC1110800f0o<SocialMessage> implements InterfaceC1112720f3u, InterfaceC1110040eza {
    public final C180900ml LJJI;

    @Override // X.InterfaceC1112720f3u
    public final InterfaceC1112720f3u LJIIIIZZ() {
        return null;
    }

    @Override // X.InterfaceC1112720f3u
    public final boolean LJIILIIL() {
        return false;
    }

    @Override // X.InterfaceC1110040eza
    public final void LIZIZ() {
        if (((SocialMessage) this.LJIL).action != 3) {
            return;
        }
        C1109770ez9 c1109770ez9 = this.LJIILIIL;
        DataChannel dataChannel = c1109770ez9.LJIIIZ;
        Room room = c1109770ez9.LJII;
        if (dataChannel == null || room == null) {
            return;
        }
        C1106200etO c1106200etOLJII = C481180Itw.LJII(room, dataChannel, C481180Itw.LIZIZ(room.getOwner()), "live_room_share_button", new HashMap());
        AdLiveEnterRoomConfig adLiveEnterRoomConfigLJII = C0IXW.LJII(dataChannel);
        c1106200etOLJII.LJJIJL = adLiveEnterRoomConfigLJII != null ? adLiveEnterRoomConfigLJII.aid : null;
        c1106200etOLJII.LJJIZ = C0IXW.LIZLLL(dataChannel);
        c1106200etOLJII.LJJJ = C0IXW.LJII(dataChannel);
        c1106200etOLJII.LJJIL = ((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).hL0();
        c1106200etOLJII.LIZ(Boolean.valueOf(this.LJIILIIL.LIZLLL), "show_cancel");
        LiveShareDialog liveShareDialogT71 = ((IShareService) C1161920gLG.LIZJ(IShareService.class)).t71(new C1106210etP(c1106200etOLJII), new InterfaceC1372610lp5() { // from class: X.00wE
            @Override // X.InterfaceC1372610lp5
            public final void LIZ(Throwable th) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LIZIZ(HashMap map) {
            }

            @Override // X.InterfaceC1372610lp5
            public final void LIZJ(String str, String str2, Bundle bundle) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LIZLLL(HashMap map) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJ(HashMap map) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJFF(Dialog dialog) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJI(Dialog dialog) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJII() {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void onDismiss() {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void onShow(int i) {
            }
        });
        FragmentManager fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class);
        if (liveShareDialogT71 != null && fragmentManager != null && !liveShareDialogT71.isShowing()) {
            liveShareDialogT71.show(fragmentManager, "share message");
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_audience_share_panel_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(LJZL()), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(LLJJIII()), "room_id");
        c474500IjALIZ.LJJII("click", "action_type");
        c474500IjALIZ.LJJII("interaction_msg", "enter_from");
        c474500IjALIZ.LIZ();
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_interaction_message_click");
        c474500IjALIZ2.LJJII(Long.valueOf(LJZL()), "anchor_id");
        c474500IjALIZ2.LJJII(Long.valueOf(LLJJIII()), "room_id");
        c474500IjALIZ2.LJJII(this.LJIILL.LIZ ? "fold" : "unfold", "msg_position");
        c474500IjALIZ2.LJJII(Integer.valueOf(LLIFFJFJJ()), "msg_type");
        c474500IjALIZ2.LJJII("content", "click_position");
        c474500IjALIZ2.LJJII(LLIILII() ? "anchor" : "viewer", "admin_type");
        c474500IjALIZ2.LJJIIZI(LLJ());
        c474500IjALIZ2.LIZ();
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1113750f5Z
    public final int LIZLLL() {
        MESSAGE message = this.LJIL;
        return (((SocialMessage) message).action == 1 || ((SocialMessage) message).action == 51) ? R.drawable.euu : ((SocialMessage) message).action == 3 ? R.drawable.eyf : R.drawable.eu1;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112060f2q
    public final boolean LJJJJLI() {
        return (this.LIZJ || !LLIILII() || LJJLJ()) ? false : true;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1111840f2U
    public final void LJZ() {
        C1110880f0w c1110880f0w;
        MESSAGE message = this.LJIL;
        if (message == 0 || (c1110880f0w = this.LJIILJJIL) == null || c1110880f0w.LIZJ != 1) {
            return;
        }
        DataChannel dataChannel = this.LJIILIIL.LJIIIZ;
        SocialMessage socialMessage = (SocialMessage) message;
        long j = socialMessage.action;
        if (j == 4) {
            C161900jh.LIZ(dataChannel, 1);
        } else if (j == 1) {
            C161200ja.LIZ.getClass();
            C161200ja.LIZ(dataChannel, "show", socialMessage);
        }
    }

    @Override // X.AbstractC1110790f0n
    public final InterfaceC1110040eza LLF() {
        return new InterfaceC1110040eza() { // from class: X.00mo
            @Override // X.InterfaceC1110040eza
            public final void LIZIZ() {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_interaction_message_click");
                c474500IjALIZ.LJJII(Long.valueOf(this.LIZ.LJZL()), "anchor_id");
                c474500IjALIZ.LJJII(Long.valueOf(this.LIZ.LLJJIII()), "room_id");
                c474500IjALIZ.LJJII(this.LIZ.LJIILL.LIZ ? "fold" : "unfold", "msg_position");
                c474500IjALIZ.LJJII(Integer.valueOf(this.LIZ.LLIFFJFJJ()), "msg_type");
                c474500IjALIZ.LJJII("content", "click_position");
                c474500IjALIZ.LJJII(this.LIZ.LLIILII() ? "anchor" : "viewer", "admin_type");
                c474500IjALIZ.LJJIIZI(this.LIZ.LLJ());
                c474500IjALIZ.LIZ();
            }
        };
    }

    @Override // X.AbstractC1110790f0n
    public final int LLIFFJFJJ() {
        MESSAGE message = this.LJIL;
        if (((SocialMessage) message).action == 3) {
            return 3;
        }
        if (((SocialMessage) message).action == 1) {
            return 4;
        }
        return ((SocialMessage) message).LIZ() ? 7 : 0;
    }

    @Override // X.AbstractC1110790f0n
    public final PublicAreaMessageCommon LLIIII() {
        return ((SocialMessage) this.LJIL).publicAreaMessageCommon;
    }

    @Override // X.AbstractC1110790f0n
    public final void LLILZLL() {
        SocialMessage socialMessage = (SocialMessage) this.LJIL;
        if (socialMessage.action == 1) {
            C161200ja c161200ja = C161200ja.LIZ;
            DataChannel dataChannel = this.LJIILIIL.LJIIIZ;
            c161200ja.getClass();
            C161200ja.LIZ(dataChannel, "click_user", socialMessage);
        }
        super.LLILZLL();
    }

    @Override // X.AbstractC1110800f0o
    public final String LLJJJJJIL() {
        return ((SocialMessage) this.LJIL).scene;
    }

    public final boolean LLJLIL() {
        return ((SocialMessage) this.LJIL).action == 1;
    }

    public final boolean LLJLILLLLZIIL() {
        return ((SocialMessage) this.LJIL).action == 3;
    }

    @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
    public final User getUser() {
        return ((SocialMessage) this.LJIL).user;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112570f3f
    public final boolean LJIIZILJ() {
        return super.LJIIZILJ() || ((SocialMessage) this.LJIL).showDurationMs > 0;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112570f3f
    public final long LJJII() {
        return super.LJJII() > 0 ? super.LJJII() : ((SocialMessage) this.LJIL).showDurationMs;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112680f3q
    public final boolean LJJLJ() {
        if (LLIILII()) {
            C1109770ez9 c1109770ez9 = this.LJIILIIL;
            InterfaceC1110780f0m<? extends AbstractC1136060ffY> interfaceC1110780f0mLJIILL = c1109770ez9.LJIIJJI.LJIILL(this.LJIL);
            if (interfaceC1110780f0mLJIILL instanceof C180600mi) {
                MESSAGE message = this.LJIL;
                interfaceC1110780f0mLJIILL.getClass();
                if (0 == message.getMessageId()) {
                    return false;
                }
            }
        }
        return super.LJJLJ();
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112570f3f
    public final int LJLJJL() {
        return super.LJLJJL() != 0 ? super.LJLJJL() : ((SocialMessage) this.LJIL).showDurationMs > 0 ? 1 : 0;
    }

    @Override // X.AbstractC1110790f0n
    public final InterfaceC1110040eza LLD() {
        if (LLJLILLLLZIIL() && LLIILII()) {
            return this;
        }
        return null;
    }

    @Override // X.AbstractC1110790f0n
    public final CharSequence LLFF() {
        int iLJIIL = LJIIL();
        int iLJLLLL = LJLLLL();
        SocialMessage socialMessage = (SocialMessage) this.LJIL;
        User user = socialMessage.user;
        Context contextLJII = C497740JfY.LJII();
        int i = (int) socialMessage.action;
        return C175200lq.LIZLLL(user, " ", i != 1 ? i != 3 ? "" : Build.VERSION.SDK_INT >= 24 ? C497740JfY.LJIJI(2131853545) : contextLJII.getResources().getString(2131853545) : Build.VERSION.SDK_INT >= 24 ? C497740JfY.LJIJI(2131841707) : contextLJII.getResources().getString(2131841707), iLJIIL, iLJLLLL, this);
    }

    @Override // X.AbstractC1110790f0n
    public final boolean LLILII() {
        return (LLJLIL() || LLJLILLLLZIIL()) && !this.LJIL.isLocalInsertMsg;
    }

    @Override // X.AbstractC1110790f0n
    public final boolean LLILL() {
        return LLJLIL() || LLJLILLLLZIIL();
    }

    @Override // X.AbstractC1110790f0n
    public final Map<String, String> LLJ() {
        if (LLIFFJFJJ() != 7) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("anchor_recommendation_type", String.valueOf(((SocialMessage) this.LJIL).action));
        return map;
    }

    @Override // X.AbstractC1110790f0n
    public final boolean LLJILLL() {
        return LLJLIL() || LLJLILLLLZIIL();
    }

    @Override // X.AbstractC1110790f0n
    public final boolean LLJJ() {
        if (LLIILII()) {
            return false;
        }
        return LLJLILLLLZIIL() || LLJLIL() || ((SocialMessage) this.LJIL).action == 2;
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n
    public final boolean LLJJIJIL() {
        return super.LLJJIJIL();
    }

    @Override // X.InterfaceC1112720f3u
    public final C180900ml LJJIFFI() {
        return this.LJJI;
    }

    public C239500wD(SocialMessage socialMessage) {
        super(socialMessage);
        this.LJJI = new C180900ml();
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1109650eyx
    public final void LJJJJZ(C1109770ez9 c1109770ez9) {
        super.LJJJJZ(c1109770ez9);
    }

    @Override // X.AbstractC1110790f0n
    public final void LLJILJIL(User user) {
        C289001Aa.LIZIZ(user);
    }

    @Override // X.AbstractC1110790f0n
    public final void LLJIJIL(int i, User user) {
        C289001Aa.LIZ(i, user);
    }
}
