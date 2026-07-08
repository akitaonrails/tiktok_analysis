package X;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.publicscreen.api.event.RoomMessageAttachEvent;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* JADX INFO: renamed from: X.00wF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C239700wF extends AbstractC1110800f0o<RoomMessage> implements InterfaceC1110040eza {
    public boolean LJJI;
    public final C239900wH LJJIFFI;

    @Override // X.AbstractC1110790f0n, X.InterfaceC1133840fby
    public final boolean LJJLIL() {
        return false;
    }

    public User getUser() {
        return null;
    }

    @Override // X.InterfaceC1110040eza
    public final void LIZIZ() {
        RoomMessage roomMessage = (RoomMessage) this.LJIL;
        if (roomMessage.source != 6) {
            if (TextUtils.equals(roomMessage.scene, "cohost_user_suggestion")) {
                LLJLIL();
                return;
            } else {
                if (TextUtils.isEmpty(((RoomMessage) this.LJIL).schema)) {
                    return;
                }
                LLJLILLLLZIIL();
                return;
            }
        }
        String str = roomMessage.scene;
        str.getClass();
        if (!str.equals("share")) {
            if (str.equals("comment")) {
                C1110530f0N c1110530f0N = new C1110530f0N(0, "", "", false);
                c1110530f0N.LJIIIZ = "message";
                C784440Upu.LIZ().LIZIZ(c1110530f0N);
                return;
            }
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
        ((IShareService) C1161920gLG.LIZJ(IShareService.class)).jR0((Activity) this.LJIILIIL.LIZ, new C1106210etP(c1106200etOLJII), new InterfaceC1372610lp5() { // from class: X.00wG
            @Override // X.InterfaceC1372610lp5
            public final void LIZ(Throwable th) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LIZIZ(HashMap map) {
            }

            @Override // X.InterfaceC1372610lp5
            public final void LIZJ(String str2, String str3, Bundle bundle) {
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
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_audience_share_panel_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(LJZL()), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(LLJJIII()), "room_id");
        c474500IjALIZ.LJJII("click", "action_type");
        c474500IjALIZ.LJJII("interaction_aggregated_msg", "enter_from");
        c474500IjALIZ.LIZ();
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1113750f5Z
    public final int LIZLLL() {
        MESSAGE message = this.LJIL;
        return ((RoomMessage) message).source == 4 ? R.drawable.eyk : TextUtils.equals(((RoomMessage) message).scene, "user_fans_upgrade") ? R.drawable.evx : (TextUtils.equals(((RoomMessage) this.LJIL).scene, "user_join_fans") || TextUtils.equals(((RoomMessage) this.LJIL).scene, "trending_reward_notice")) ? R.drawable.evv : R.drawable.eu1;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112060f2q
    public final int LJIJI() {
        return ((RoomMessage) this.LJIL).source == 5 ? 3 : 1;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112060f2q
    public final boolean LJJJJIZL() {
        return ((RoomMessage) this.LJIL).isWelcome;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1133840fby
    public final boolean LJJJLL() {
        MESSAGE message = this.LJIL;
        if (((RoomMessage) message).source != 6) {
            return (TextUtils.equals(((RoomMessage) message).scene, "cohost_user_suggestion") && !LLIILII()) || !TextUtils.isEmpty(((RoomMessage) this.LJIL).schema);
        }
        return true;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1113750f5Z
    public final Integer LJJZ() {
        return "room_stream_language".equalsIgnoreCase(((RoomMessage) this.LJIL).scene) ? Integer.valueOf(R.raw.icon_voice_translation) : ((RoomMessage) this.LJIL).LL;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1113750f5Z
    public ImageModel LJLLLLLL() {
        MESSAGE message = this.LJIL;
        return ((RoomMessage) message).icon != null ? ((RoomMessage) message).icon : super.LJLLLLLL();
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1111840f2U
    public final void LJZ() {
        CommonMessageData commonMessageData;
        RoomMessage roomMessage = (RoomMessage) this.LJIL;
        int i = roomMessage.source;
        if (i == 1 || i == 3) {
            if (this.LJIILJJIL.LIZJ == 1 && (commonMessageData = roomMessage.baseMessage) != null && commonMessageData.displayText != null) {
                C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_promoting_message_show", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
                c474500IjALIZIZ.LJIJJLI(this.LJIILIIL.LJIIIZ);
                c474500IjALIZIZ.LJJIJIIJI(Long.valueOf(this.LJIILIIL.LJIIZILJ));
                c474500IjALIZIZ.LJI(Long.valueOf(this.LJIILIIL.LJIL));
                c474500IjALIZIZ.LJJII(this.LJIL.baseMessage.displayText.key, "msg_id");
                c474500IjALIZIZ.LJJII(this.LJIILIIL.LJI ? "anchor" : "viewer", "admin_type");
                c474500IjALIZIZ.LJJII(((RoomMessage) this.LJIL).subScene, "topic_id");
                c474500IjALIZIZ.LIZ();
                return;
            }
        } else if (i == 4 && this.LJIILJJIL.LIZJ == 1) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_sub_only_live_converted_notice");
            c474500IjALIZ.LJIJJLI(this.LJIILIIL.LJIIIZ);
            c474500IjALIZ.LJJIJIIJI(Long.valueOf(this.LJIILIIL.LJIIZILJ));
            c474500IjALIZ.LJI(Long.valueOf(this.LJIILIIL.LJIL));
            c474500IjALIZ.LIZ();
            return;
        }
        if (!TextUtils.equals(roomMessage.scene, "cohost_user_suggestion") || this.LJIILIIL.LJI) {
            return;
        }
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_suggest_creator_capsule_show");
        c474500IjALIZ2.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ2.LJJII(Long.valueOf(LJZL()), "anchor_id");
        c474500IjALIZ2.LJJII(Long.valueOf(LLJJIII()), "room_id");
        c474500IjALIZ2.LJJII(LLIIL() ? "administrator" : "normal", "audience_type");
        c474500IjALIZ2.LIZ();
    }

    @Override // X.AbstractC1110790f0n
    public final InterfaceC1110040eza LLF() {
        return new InterfaceC1110040eza() { // from class: X.00mp
            @Override // X.InterfaceC1110040eza
            public final void LIZIZ() {
                if (((RoomMessage) this.LIZ.LJIL).source == 6) {
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_interaction_aggmessage_click");
                    c474500IjALIZ.LJIL();
                    c474500IjALIZ.LJJII(Long.valueOf(this.LIZ.LJZL()), "anchor_id");
                    c474500IjALIZ.LJJII(Long.valueOf(this.LIZ.LLJJIII()), "room_id");
                    c474500IjALIZ.LJJII(((RoomMessage) this.LIZ.LJIL).scene, "msg_type");
                    c474500IjALIZ.LJJII(this.LIZ.LLIILII() ? "anchor" : this.LIZ.LLIIL() ? "admin" : "viewer", "user_type");
                    c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
                    c474500IjALIZ.LIZ();
                }
            }
        };
    }

    @Override // X.AbstractC1110790f0n
    public final PublicAreaMessageCommon LLIIII() {
        return ((RoomMessage) this.LJIL).publicAreaCommon;
    }

    @Override // X.AbstractC1110790f0n
    public final String LLIIIJ() {
        return ((RoomMessage) this.LJIL).LLILLJJLI;
    }

    @Override // X.AbstractC1110790f0n
    public final boolean LLILIL() {
        MESSAGE message = this.LJIL;
        return ((RoomMessage) message).source == 6 || TextUtils.equals(((RoomMessage) message).scene, "cohost_user_suggestion");
    }

    @Override // X.AbstractC1110790f0n
    public final InterfaceC1110040eza LLILLIZIL() {
        if (!TextUtils.equals(((RoomMessage) this.LJIL).scene, "cohost_user_suggestion") || LLIILII()) {
            return null;
        }
        return new InterfaceC1110040eza() { // from class: X.00wI
            @Override // X.InterfaceC1110040eza
            public final void LIZIZ() {
                this.LIZ.LLJLIL();
            }
        };
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.AbstractC1110790f0n
    public CharSequence LLIZLLLIL() {
        String str;
        String strLJIIJJI;
        if (TextUtils.equals(((RoomMessage) this.LJIL).scene, "cohost_user_suggestion")) {
            MESSAGE message = this.LJIL;
            Text text = message.baseMessage.displayText;
            int i = CastIntegerProtector.parseInt(((RoomMessage) message).subScene);
            if (text != null && (str = text.key) != null) {
                str.getClass();
                switch (str.hashCode()) {
                    case -445517139:
                        if (str.equals("ttlive_suggestCohost_noticeInComment_viewerSuggestion")) {
                            strLJIIJJI = C497740JfY.LJIJI(2131856547);
                            break;
                        }
                        return super.LLIZLLLIL();
                    case -118269824:
                        if (str.equals("ttlive_suggestCohost_noticeInComment_viewerSuggestionAnony")) {
                            strLJIIJJI = C497740JfY.LJIJI(2131856548);
                            break;
                        }
                        return super.LLIZLLLIL();
                    case -116387230:
                        if (str.equals("ttlive_suggestCohost_noticeInComment_viewerSuggestionCount")) {
                            strLJIIJJI = C497740JfY.LJIIJJI(2131755990, i);
                            break;
                        }
                        return super.LLIZLLLIL();
                    default:
                        return super.LLIZLLLIL();
                }
                return C1133830fbx.LJIILJJIL(strLJIIJJI, text, this);
            }
        }
        return super.LLIZLLLIL();
    }

    @Override // X.AbstractC1110800f0o
    public final String LLJJJJJIL() {
        return ((RoomMessage) this.LJIL).scene;
    }

    @Override // X.AbstractC1110800f0o
    public final boolean LLJJLIIIJLLLLLLLZ() {
        if (TextUtils.equals(((RoomMessage) this.LJIL).scene, "cohost_user_suggestion") && !LLIILII()) {
            LLJLIL();
            return true;
        }
        if (TextUtils.isEmpty(((RoomMessage) this.LJIL).schema)) {
            return false;
        }
        LLJLILLLLZIIL();
        return true;
    }

    public final void LLJLIL() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_suggest_creator_capsule_click");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII(Long.valueOf(LJZL()), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(LLJJIII()), "room_id");
        c474500IjALIZ.LJJII(LLIIL() ? "administrator" : "normal", "audience_type");
        c474500IjALIZ.LIZ();
        if (Boolean.FALSE.equals(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Tn(17L))) {
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131856553));
            return;
        }
        String str = ((RoomMessage) this.LJIL).content;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(LLIIL() ? "&is_modertor=1" : "&is_modertor=0");
        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).x30(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LLJLILLLLZIIL() {
        if (TextUtils.isEmpty(((RoomMessage) this.LJIL).schema)) {
            return;
        }
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.LJIILIIL.LIZ, ((RoomMessage) this.LJIL).schema);
        if ("enter_live_rcg_redirection".equals(((RoomMessage) this.LJIL).scene)) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_room_sys_message_click");
            c474500IjALIZ.LJJII("rcg_page_guide", "msg_type");
            c474500IjALIZ.LIZ();
        }
    }

    public final boolean LLJLL() {
        return TextUtils.equals(((RoomMessage) this.LJIL).scene, "user_fans_upgrade") || TextUtils.equals(((RoomMessage) this.LJIL).scene, "user_join_fans");
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112570f3f
    public final boolean LJIIZILJ() {
        return super.LJIIZILJ() || ((RoomMessage) this.LJIL).showDurationMs > 0;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112570f3f
    public final long LJJII() {
        return super.LJJII() > 0 ? super.LJJII() : ((RoomMessage) this.LJIL).showDurationMs;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112570f3f
    public final int LJLJJL() {
        return super.LJLJJL() != 0 ? super.LJLJJL() : ((RoomMessage) this.LJIL).showDurationMs > 0 ? 1 : 0;
    }

    @Override // X.AbstractC1110790f0n
    public final InterfaceC1110040eza LLD() {
        if (LJJJLL()) {
            return this;
        }
        return null;
    }

    @Override // X.AbstractC1110790f0n
    public CharSequence LLFF() {
        return C175200lq.LIZIZ(LJLLLL(), ((RoomMessage) this.LJIL).content);
    }

    @Override // X.AbstractC1110790f0n
    public final boolean LLJILLL() {
        if (LLJLL()) {
            return true;
        }
        return this instanceof C161800jg;
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1109570eyp
    public final void onAttach() {
        DataChannel dataChannel;
        super.onAttach();
        if (this.LJIILIIL.LJIJJLI) {
            Text text = this.LJIL.baseMessage.displayText;
            String str = text != null ? text.key : "";
            if ("pm_mt_brightness_adjust_banner".equals(str)) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_brightness_adjust_message_show");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LIZ();
            }
            if (this.LJJI) {
                if ("pm_mt_autoSuggest_moderator_muteTooltip".equals(str)) {
                    C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_comment_autosuggest_tutorial_show");
                    c474500IjALIZ2.LJIL();
                    c474500IjALIZ2.LJJII("mute", "tutorial_type");
                    c474500IjALIZ2.LIZ();
                }
                if ("pm_mt_autoSuggest_moderator_blockTooltip".equals(str)) {
                    C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_comment_autosuggest_tutorial_show");
                    c474500IjALIZ3.LJIL();
                    c474500IjALIZ3.LJJII("block", "tutorial_type");
                    c474500IjALIZ3.LIZ();
                }
                if ("pm_mt_autoSuggest_moderator_tooltip".equals(str)) {
                    C474500IjA c474500IjALIZ4 = C0IJT.LIZ("livesdk_comment_autosuggest_tutorial_show");
                    c474500IjALIZ4.LJIL();
                    c474500IjALIZ4.LJJII("both", "tutorial_type");
                    c474500IjALIZ4.LIZ();
                }
                if (containsKey(str)) {
                    C474500IjA c474500IjALIZ5 = C0IJT.LIZ("livesdk_anchor_fundational_moderator_toast_show");
                    c474500IjALIZ5.LJIL();
                    c474500IjALIZ5.LJJII(get(str), "manage_action");
                    c474500IjALIZ5.LIZ();
                }
                if (((RoomMessage) this.LJIL).source == 6) {
                    C474500IjA c474500IjALIZ6 = C0IJT.LIZ("livesdk_interaction_aggmessage_show");
                    c474500IjALIZ6.LJIL();
                    c474500IjALIZ6.LJJII(((RoomMessage) this.LJIL).scene, "msg_type");
                    c474500IjALIZ6.LJJII(LLIILII() ? "anchor" : LLIIL() ? "admin" : "viewer", "user_type");
                    c474500IjALIZ6.LJJII(Long.valueOf(LJZL()), "anchor_id");
                    c474500IjALIZ6.LJJII(Long.valueOf(LLJJIII()), "room_id");
                    c474500IjALIZ6.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
                    c474500IjALIZ6.LIZ();
                }
                if ("enter_live_rcg_redirection".equals(((RoomMessage) this.LJIL).scene)) {
                    C474500IjA c474500IjALIZ7 = C0IJT.LIZ("livesdk_live_room_sys_message_show");
                    c474500IjALIZ7.LJJII("rcg_page_guide", "msg_type");
                    c474500IjALIZ7.LJJII(TextUtils.isEmpty(((RoomMessage) this.LJIL).schema) ? CardStruct.IStatusCode.DEFAULT : "1", "is_clickable");
                    c474500IjALIZ7.LIZ();
                }
            }
            this.LJJI = false;
            C1091120eV4.LIZJ(this.LJIL);
            if (!TextUtils.equals(((RoomMessage) this.LJIL).scene, "match_record_live_guide") || (dataChannel = this.LJIILIIL.LJIIIZ) == null) {
                return;
            }
            dataChannel.LC0(RoomMessageAttachEvent.class, Boolean.TRUE);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.00wH] */
    public C239700wF(RoomMessage roomMessage) {
        super(roomMessage);
        this.LJJI = true;
        this.LJJIFFI = new HashMap() { // from class: X.00wH
            {
                put("ttlive_moderatorAccessAdded_hostScreen_moderatorStartedPollToast", "start_text_poll");
                put("ttlive_moderatorAccessAdded_hostScreen_moderatorStartedGiftVoteToast", "start_gift_vote");
                put("ttlive_moderatorAccessAdded_hostScreen_moderatorEndedPollToast", "end_text_poll");
                put("ttlive_moderatorAccessAdded_hostScreen_moderatorEndedGiftVoteToast", "end_gift_vote");
            }
        };
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1133840fby
    public final CharSequence LJLIL(User user) {
        if (LLJLL()) {
            return C0KVU.LIZ(user);
        }
        return super.LJLIL(user);
    }

    @Override // X.AbstractC1110790f0n
    public final void LLJILJIL(User user) {
        if (LLJLL()) {
            C289001Aa.LIZIZ(user);
        }
    }

    @Override // X.AbstractC1110790f0n
    public final void LLJIJIL(int i, User user) {
        if (LLJLL()) {
            C289001Aa.LIZ(i, user);
        }
    }
}
