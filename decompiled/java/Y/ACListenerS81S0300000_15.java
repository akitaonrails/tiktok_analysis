package Y;

import X.AbstractC928510aGn;
import X.AbstractC958000b2M;
import X.AbstractC963920bBu;
import X.C01FQ;
import X.C01GW;
import X.C01N8;
import X.C01Z4;
import X.C0IJT;
import X.C0KVU;
import X.C0KX4;
import X.C1099420eiS;
import X.C1109770ez9;
import X.C1117360fBO;
import X.C1119700fFA;
import X.C1143300frE;
import X.C1161920gLG;
import X.C154500iV;
import X.C1812130xFz;
import X.C1845100y7A;
import X.C1845110y7B;
import X.C1845120y7C;
import X.C19487311Lz;
import X.C1954807lC;
import X.C20337914i1;
import X.C20441214yg;
import X.C20745116Ft;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C304201Fw;
import X.C307001Gy;
import X.C354001Za;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C748880TZe;
import X.C754570Tip;
import X.C766270U4b;
import X.C782110Um9;
import X.C786410Ut5;
import X.C914590ZuL;
import X.C915850ZwN;
import X.C915980Zwa;
import X.C917140ZyS;
import X.C917520Zz4;
import X.C917920Zzi;
import X.C919530a2J;
import X.C919670a2X;
import X.C919870a2r;
import X.C920280a3W;
import X.C921170a4x;
import X.C922480a74;
import X.C925600aC6;
import X.C925610aC7;
import X.C927600aFK;
import X.C928700aH6;
import X.C930160aJS;
import X.C930540aK4;
import X.C930940aKi;
import X.C931830aM9;
import X.C932220aMm;
import X.C933130aOF;
import X.C933400aOg;
import X.C937380aV6;
import X.C937390aV7;
import X.C937460aVE;
import X.C943870afZ;
import X.C944860ahA;
import X.C945060ahU;
import X.C946850akN;
import X.C949600aoo;
import X.C950220apo;
import X.C954460awe;
import X.C955400ayA;
import X.C956740b0K;
import X.C957680b1q;
import X.C958010b2N;
import X.C958770b3b;
import X.C960300b64;
import X.C960310b65;
import X.C960320b66;
import X.C960330b67;
import X.C960360b6A;
import X.C960370b6B;
import X.C960380b6C;
import X.C961250b7b;
import X.C961360b7m;
import X.C961370b7n;
import X.C961540b84;
import X.C963810bBj;
import X.C964260bCS;
import X.C964350bCb;
import X.C971370bNv;
import X.C973660bRc;
import X.C980900bdI;
import X.C986580bmS;
import X.EnumC918970a1P;
import X.EnumC920250a3T;
import X.EnumC952890au7;
import X.EnumC971520bOA;
import X.InterfaceC1104970erP;
import X.InterfaceC2217461Bqa;
import X.InterfaceC302401Fe;
import X.InterfaceC302601Fg;
import X.InterfaceC743640TFa;
import X.InterfaceC927510aFB;
import X.InterfaceC954180awC;
import X.InterfaceC955420ayC;
import X.InterfaceC960350b69;
import X.InterfaceC960800b6s;
import X.InterfaceC964300bCW;
import X.InterfaceC972070bP3;
import Y.AfS184S0100000_15;
import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.action.LiveActionSheetDialog;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAnchorInviteGuestEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAnchorPermitGuestEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.NeedCloseMultiLiveDialogEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import com.bytedance.android.live.liveinteract.multihost.biz.link.features.followprompt.MultiCoHostFollowPromptViewModel;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostAuxStreamSwitchListFragment;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostSettingsFragment;
import com.bytedance.android.live.liveinteract.multihost.event.CoHostPunishPermissionChannel;
import com.bytedance.android.livesdk.chatroom.interact.model.Benefit;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.model.message.LinkMicAnchorGuideMessage;
import com.bytedance.android.livesdk.model.message.LinkMicAudienceNoticeMessage;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS299S0000000_15;
import kotlin.jvm.internal.AwS259S0300000_15;
import kotlin.jvm.internal.AwS451S0200000_15;
import kotlin.jvm.internal.AwS97S0210000_15;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.CohostStreamConfig;

/* JADX INFO: loaded from: classes16.dex */
public class ACListenerS81S0300000_15 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
            case 7:
                onClick$7(this, view);
                break;
            case 8:
                onClick$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onClick$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onClick$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onClick$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onClick$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onClick$13(this, view);
                break;
            case 14:
                onClick$14(this, view);
                break;
            case 15:
                onClick$15(this, view);
                break;
            case 16:
                onClick$16(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onClick$17(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onClick$18(this, view);
                break;
            case 19:
                onClick$19(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS81S0300000_15 aCListenerS81S0300000_15, View view) {
        int followStatus;
        long id = ((LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide) aCListenerS81S0300000_15.l0).user.getId();
        ((C933400aOg) aCListenerS81S0300000_15.l1).getClass();
        EnumC918970a1P enumC918970a1PLJI = C917140ZyS.LJI();
        C933400aOg c933400aOg = (C933400aOg) aCListenerS81S0300000_15.l1;
        FollowInfo followInfo = ((LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide) aCListenerS81S0300000_15.l0).user.getFollowInfo();
        c933400aOg.getClass();
        if (followInfo == null) {
            followStatus = 0;
        } else {
            followStatus = (int) followInfo.getFollowStatus();
        }
        C925600aC6.LJJIJ(id, enumC918970a1PLJI, true, followStatus, Boolean.FALSE, ((LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide) aCListenerS81S0300000_15.l0).linkmicAudienceInviteNoticeReason, "anchor_invite_guest", null, null);
        DataChannel dataChannel = ((C1109770ez9) aCListenerS81S0300000_15.l2).LJIIIZ;
        if (view != null && view.getContext() != null && dataChannel != null) {
            if (C933400aOg.R5()) {
                C766270U4b.LIZLLL(2131842740);
                return;
            }
            C922480a74.LIZ(dataChannel, null);
            if (((LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide) aCListenerS81S0300000_15.l0).user != null) {
                if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).vL1().contains(Long.valueOf(((LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide) aCListenerS81S0300000_15.l0).user.getId()))) {
                    dataChannel.LC0(LinkInRoomAnchorPermitGuestEvent.class, new C919530a2J(((LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide) aCListenerS81S0300000_15.l0).user, false, false, null, 14));
                } else {
                    dataChannel.LC0(LinkInRoomAnchorInviteGuestEvent.class, new C919670a2X(2, ((LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide) aCListenerS81S0300000_15.l0).user, "mutual_notice", "mutual_notice_invite"));
                }
            }
        }
    }

    public static final void onClick$1(ACListenerS81S0300000_15 aCListenerS81S0300000_15, View view) {
        ((C932220aMm) aCListenerS81S0300000_15.l0).LIZ((LinkPlayerInfo) aCListenerS81S0300000_15.l1);
        DataChannel dataChannel = (DataChannel) aCListenerS81S0300000_15.l2;
        if (dataChannel != null) {
            dataChannel.zW(NeedCloseMultiLiveDialogEvent.class, Boolean.TRUE);
        }
    }

    public static final void onClick$10(ACListenerS81S0300000_15 aCListenerS81S0300000_15, View view) {
        String str;
        Long lValueOf;
        C961370b7n c961370b7n = (C961370b7n) aCListenerS81S0300000_15.l0;
        C961360b7m c961360b7m = (C961360b7m) aCListenerS81S0300000_15.l1;
        c961370b7n.getClass();
        C955400ayA c955400ayA = C955400ayA.LIZ;
        int i = C961250b7b.LIZIZ[c961360b7m.LJ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    str = "viewer_suggestion";
                } else {
                    throw new C1954807lC();
                }
            } else {
                str = "recommend";
            }
        } else {
            str = "mutual_follow";
        }
        HashMap map = new HashMap();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        Long lValueOf2 = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        map.put("anchor_id", String.valueOf(lValueOf));
        if (room != null) {
            lValueOf2 = Long.valueOf(room.getId());
        }
        map.put("room_id", String.valueOf(lValueOf2));
        map.put("invitee_list", str);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_connection_mutual_see_more");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
        ((C961370b7n) aCListenerS81S0300000_15.l0).LIZIZ.bp(((C961360b7m) aCListenerS81S0300000_15.l1).LJ);
        ((C961370b7n) aCListenerS81S0300000_15.l0).LJIIIIZZ((C961540b84) aCListenerS81S0300000_15.l2, (C961360b7m) aCListenerS81S0300000_15.l1);
    }

    public static final void onClick$11(ACListenerS81S0300000_15 aCListenerS81S0300000_15, View view) {
        C20337914i1<Integer> c20337914i1 = InterfaceC960800b6s.LLLJL;
        c20337914i1.LJFF(Integer.valueOf(c20337914i1.LIZIZ().intValue() + 1));
        InterfaceC960800b6s.LLLL.LJFF(Long.valueOf(System.currentTimeMillis()));
        InterfaceC960800b6s.LLLLII.LJFF(Boolean.TRUE);
        C960320b66 c960320b66 = (C960320b66) aCListenerS81S0300000_15.l0;
        RecyclerView recyclerView = c960320b66.LIZIZ;
        if (recyclerView != null) {
            C960310b65 c960310b65 = (C960310b65) aCListenerS81S0300000_15.l2;
            InterfaceC960350b69 interfaceC960350b69 = c960320b66.LIZJ;
            if (interfaceC960350b69 != null) {
                interfaceC960350b69.kK(recyclerView.getChildAdapterPosition(c960310b65.itemView));
            }
        }
        C960320b66 c960320b662 = (C960320b66) aCListenerS81S0300000_15.l0;
        C957680b1q c957680b1q = (C957680b1q) aCListenerS81S0300000_15.l1;
        c960320b662.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_cohost_guide_close");
        c474500IjALIZ.LJJII("new_user", "type");
        c474500IjALIZ.LJJII(Integer.valueOf(c957680b1q.LJ.benefits.size()), "benefit_cnt");
        c474500IjALIZ.LJJII(null, "diamonds_cnt");
        c474500IjALIZ.LJJII(null, "viewers_cnt");
        c474500IjALIZ.LJJII(null, "friends_cnt");
        c474500IjALIZ.LJJII(null, "followers_cnt");
        c474500IjALIZ.LJJII(Long.valueOf(C950220apo.LJFF()), "anchor_id");
        c474500IjALIZ.LJJII(C930540aK4.LJIIJ(), "room_id");
        c474500IjALIZ.LJJII("new_user", "guide_type");
        c474500IjALIZ.LIZ();
    }

    public static final void onClick$12(ACListenerS81S0300000_15 aCListenerS81S0300000_15, View view) {
        ((C944860ahA) aCListenerS81S0300000_15.l0).LL.l0((C943870afZ) aCListenerS81S0300000_15.l1, ((LinkMicAnchorGuideMessage) aCListenerS81S0300000_15.l2).reserveInfo, "from_reserve_notice", null);
        C1119700fFA.LIZ(4, ((C944860ahA) aCListenerS81S0300000_15.l0).LJII());
    }

    public static final void onClick$13(ACListenerS81S0300000_15 aCListenerS81S0300000_15, View view) {
        ((C944860ahA) aCListenerS81S0300000_15.l0).LL.l0((C943870afZ) aCListenerS81S0300000_15.l1, ((LinkMicAnchorGuideMessage) aCListenerS81S0300000_15.l2).reserveInfo, "from_reserve_notice", null);
        C1119700fFA.LIZ(4, ((C944860ahA) aCListenerS81S0300000_15.l0).LJII());
    }

    public static final void onClick$14(ACListenerS81S0300000_15 aCListenerS81S0300000_15, View view) {
        ((View) aCListenerS81S0300000_15.l0).setClickable(false);
        AbstractC958000b2M abstractC958000b2M = (AbstractC958000b2M) ((MultiCoHostSettingsFragment) aCListenerS81S0300000_15.l1).LLILLL;
        if (abstractC958000b2M != null) {
            abstractC958000b2M.LJIIIZ((C958010b2N) aCListenerS81S0300000_15.l2);
        }
        C955400ayA c955400ayA = C955400ayA.LIZ;
        C955400ayA.LLIIII(((C958010b2N) aCListenerS81S0300000_15.l2).LIZJ.LIZJ.LIZIZ().booleanValue());
    }

    public static final void onClick$15(ACListenerS81S0300000_15 aCListenerS81S0300000_15, View view) {
        int i;
        InterfaceC1104970erP.C2.LIZJ(Double.valueOf(5.0d));
        C960370b6B c960370b6B = (C960370b6B) aCListenerS81S0300000_15.l0;
        C960380b6C c960380b6C = (C960380b6C) aCListenerS81S0300000_15.l1;
        c960370b6B.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_cohost_guide_close");
        if (!c960380b6C.LJ) {
            i = 1;
        } else {
            i = 2;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i), "cohost_guide_type");
        c474500IjALIZ.LIZ();
        C960370b6B c960370b6B2 = (C960370b6B) aCListenerS81S0300000_15.l0;
        RecyclerView recyclerView = c960370b6B2.LIZIZ;
        if (recyclerView != null) {
            C960360b6A c960360b6A = (C960360b6A) aCListenerS81S0300000_15.l2;
            InterfaceC960350b69 interfaceC960350b69 = c960370b6B2.LIZJ;
            if (interfaceC960350b69 != null) {
                interfaceC960350b69.Qi(recyclerView.getChildAdapterPosition(c960360b6A.itemView));
            }
        }
    }

    public static final void onClick$16(ACListenerS81S0300000_15 aCListenerS81S0300000_15, View view) {
        ((PopupWindow) aCListenerS81S0300000_15.l0).dismiss();
        InterfaceC972070bP3 interfaceC972070bP3 = (InterfaceC972070bP3) aCListenerS81S0300000_15.l1;
        if (interfaceC972070bP3 != null) {
            interfaceC972070bP3.A5((C354001Za) aCListenerS81S0300000_15.l2);
        }
    }

    public static final void onClick$17(ACListenerS81S0300000_15 aCListenerS81S0300000_15, View view) {
        ((PopupWindow) aCListenerS81S0300000_15.l0).dismiss();
        InterfaceC972070bP3 interfaceC972070bP3 = (InterfaceC972070bP3) aCListenerS81S0300000_15.l1;
        if (interfaceC972070bP3 != null) {
            interfaceC972070bP3.EA((C354001Za) aCListenerS81S0300000_15.l2);
        }
    }

    public static final void onClick$18(ACListenerS81S0300000_15 aCListenerS81S0300000_15, View view) {
        ((PopupWindow) aCListenerS81S0300000_15.l0).dismiss();
        InterfaceC972070bP3 interfaceC972070bP3 = (InterfaceC972070bP3) aCListenerS81S0300000_15.l1;
        if (interfaceC972070bP3 != null) {
            interfaceC972070bP3.xd((C354001Za) aCListenerS81S0300000_15.l2);
        }
        EnumC971520bOA enumC971520bOA = EnumC971520bOA.SET_TITLE_CLICK;
        Long lValueOf = Long.valueOf(((C354001Za) aCListenerS81S0300000_15.l2).LIZIZ.LIZLLL);
        MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
        EnumC952890au7 enumC952890au7 = C946850akN.LIZIZ;
        multiCanvasUtils.getClass();
        C946850akN.LJIIIZ(enumC971520bOA, lValueOf, "personal", MultiCanvasUtils.LJIIJJI(enumC952890au7), "header");
    }

    public static final void onClick$19(ACListenerS81S0300000_15 aCListenerS81S0300000_15, View view) {
        LiveActionSheetDialog liveActionSheetDialog = (LiveActionSheetDialog) aCListenerS81S0300000_15.l0;
        C933130aOF c933130aOF = (C933130aOF) aCListenerS81S0300000_15.l1;
        C20745116Ft c20745116Ft = (C20745116Ft) aCListenerS81S0300000_15.l2;
        liveActionSheetDialog.getClass();
        c20745116Ft.setIsShowRedDotView(false);
        c933130aOF.LIZJ.LIZ(liveActionSheetDialog);
    }

    public static final void onClick$2(ACListenerS81S0300000_15 aCListenerS81S0300000_15, View view) {
        LinkUser linkUserLJJLJLI;
        LinkPlayerInfo linkPlayerInfoLJI;
        InterfaceC927510aFB interfaceC927510aFBU5;
        User user;
        AbstractC928510aGn abstractC928510aGnLIZ;
        long jLongValue;
        Long l;
        InterfaceC302601Fg interfaceC302601FgLIZ;
        if (((EnumC920250a3T) aCListenerS81S0300000_15.l0) == EnumC920250a3T.CAN_ZOOM_TO_MIN) {
            C915850ZwN.LJIIJJI(24, UserService.getInstance().user().getCurrentUserId(), "click", null, false);
        }
        C919870a2r.LIZLLL(C928700aH6.LIZ(((C931830aM9) aCListenerS81S0300000_15.l1).U5()), String.valueOf(UserService.getInstance().user().getCurrentUser().getId()), "", "click", "anchor", "anchor_connection_panel");
        C931830aM9 c931830aM9 = (C931830aM9) aCListenerS81S0300000_15.l1;
        c931830aM9.getClass();
        C1143300frE.LJIIJJI().LJII(c931830aM9.LLLILZ, C2097608Jq.LJIIJ(new Pair("action", "onZoomClick")));
        Boolean boolValueOf = null;
        if (MultiGuestLiveShowConfigSetting.INSTANCE.isOpenLiveShow() && (interfaceC302601FgLIZ = C01FQ.LIZ()) != null && interfaceC302601FgLIZ.LJIJI()) {
            C01N8.LIZ(0, "zoom", C920280a3W.LIZIZ((EnumC920250a3T) aCListenerS81S0300000_15.l0), 0L, "anchor", "live_show", "");
            C766270U4b.LIZLLL(2131843582);
        } else {
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            String str = "";
            if (interfaceC954180awCLLJLL != null) {
                String strLJIILIIL = ((InterfaceC927510aFB) aCListenerS81S0300000_15.l2).LJIILIIL();
                if (strLJIILIIL == null) {
                    strLJIILIIL = "";
                }
                linkUserLJJLJLI = interfaceC954180awCLLJLL.LJJLJLI(strLJIILIIL);
            } else {
                linkUserLJJLJLI = null;
            }
            C304201Fw c304201Fw = ((C931830aM9) aCListenerS81S0300000_15.l1).LLLIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C931830aM9.LLLILZLLLI;
            InterfaceC302401Fe interfaceC302401Fe = (InterfaceC302401Fe) c304201Fw.LIZ();
            if (interfaceC302401Fe != null && (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) != null) {
                if (linkUserLJJLJLI != null && (l = linkUserLJJLJLI.userId) != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                linkPlayerInfoLJI = C921170a4x.LJI(abstractC928510aGnLIZ, jLongValue);
            } else {
                linkPlayerInfoLJI = null;
            }
            C931830aM9 c931830aM92 = (C931830aM9) aCListenerS81S0300000_15.l1;
            c931830aM92.getClass();
            C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
            C307001Gy.LIZ().getClass();
            if (!C927600aFK.LJ() && (interfaceC927510aFBU5 = c931830aM92.U5()) != null && interfaceC927510aFBU5.LJJ() && !C917920Zzi.LIZ()) {
                C782110Um9 c782110Um9 = new C782110Um9(((C931830aM9) aCListenerS81S0300000_15.l1).LLLIIIL);
                c782110Um9.LIZJ = C497740JfY.LJIJJ(2131843613, C0KVU.LIZ(UserService.getInstance().user().LJIJJLI()));
                Object[] objArr = new Object[2];
                if (linkPlayerInfoLJI != null) {
                    user = linkPlayerInfoLJI.mUser;
                } else {
                    user = null;
                }
                objArr[0] = C0KVU.LIZ(user);
                objArr[1] = C0KVU.LIZ(UserService.getInstance().user().LJIJJLI());
                c782110Um9.LJIIIZ(C497740JfY.LJIJJ(2131843612, objArr));
                c782110Um9.LJIIJ(2131843611, new AcS496S0100000_15((EnumC920250a3T) aCListenerS81S0300000_15.l0, 13));
                c782110Um9.LJIILIIL(2131843610, new AcS84S0400000_15((C931830aM9) aCListenerS81S0300000_15.l1, (InterfaceC927510aFB) aCListenerS81S0300000_15.l2, linkPlayerInfoLJI, (EnumC920250a3T) aCListenerS81S0300000_15.l0, 0));
                C786410Ut5.E4(c782110Um9.LIZ());
            } else {
                C931830aM9 c931830aM93 = (C931830aM9) aCListenerS81S0300000_15.l1;
                String strLJIILL = ((InterfaceC927510aFB) aCListenerS81S0300000_15.l2).LJIILL();
                if (strLJIILL != null) {
                    str = strLJIILL;
                }
                c931830aM93.w6(str, linkPlayerInfoLJI, (EnumC920250a3T) aCListenerS81S0300000_15.l0);
            }
        }
        C931830aM9 c931830aM94 = (C931830aM9) aCListenerS81S0300000_15.l1;
        LiveIconView liveIconView = c931830aM94.LLJLILLLLZIIL;
        if (liveIconView != null) {
            InterfaceC927510aFB interfaceC927510aFBU52 = c931830aM94.U5();
            if (interfaceC927510aFBU52 != null) {
                boolValueOf = Boolean.valueOf(interfaceC927510aFBU52.LJFF());
            }
            C971370bNv.LIZIZ(liveIconView, 2131840809, 2131840795, C500260Jjc.LJJJI(boolValueOf));
        }
    }

    public static final void onClick$3(ACListenerS81S0300000_15 aCListenerS81S0300000_15, View view) {
        C937380aV6 c937380aV6;
        Long lValueOf;
        view.setSelected(true);
        C1117360fBO c1117360fBO = ((C937390aV7) aCListenerS81S0300000_15.l0).LIZ;
        if ((c1117360fBO instanceof C937380aV6) && (c937380aV6 = (C937380aV6) c1117360fBO) != null) {
            int layoutPosition = ((C937460aVE) aCListenerS81S0300000_15.l1).getLayoutPosition();
            LinkListUser linkListUser = (LinkListUser) aCListenerS81S0300000_15.l2;
            c937380aV6.notifyItemChanged(c937380aV6.LLJI, 0);
            c937380aV6.LLLILZ(Collections.singletonList(ListProtector.get(c937380aV6.LL, layoutPosition)));
            c937380aV6.LLJI = layoutPosition;
            if (c937380aV6.LLILLL.isShowing()) {
                c937380aV6.LLILLL.dismiss();
            }
            c937380aV6.LLLIL(Collections.singletonList(linkListUser));
            c937380aV6.LLLILZ(Collections.singletonList(linkListUser));
            User user = linkListUser.user;
            String str = c937380aV6.LLIZLLLIL;
            long j = linkListUser.fanTicket;
            HashMap map = new HashMap();
            C01Z4.LIZ(null, map);
            if (str != null) {
                map.put("gift_enter_from", str);
            }
            map.put("user_type", C917520Zz4.LJIILL(UserService.getInstance().user().LJIJJLI()));
            if (user != null) {
                map.put("to_user_type", C917520Zz4.LJIILL(user));
                lValueOf = Long.valueOf(user.getId());
            } else {
                lValueOf = null;
            }
            map.put("to_user_id", String.valueOf(lValueOf));
            map.put("charm_values", String.valueOf(j));
            C0KX4.LIZ("livesdk_gift_recipient_click", map, null, true);
        }
    }

    public static final void onClick$4(ACListenerS81S0300000_15 aCListenerS81S0300000_15, View view) {
        CharSequence text;
        String str;
        String str2;
        String str3;
        Iterator it2 = ((List) aCListenerS81S0300000_15.l0).iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            CompoundButton compoundButton = (CompoundButton) it2.next();
            if (compoundButton != null && compoundButton.isChecked()) {
                if (i >= 0) {
                    C954460awe c954460awe = null;
                    if (i < ((List) aCListenerS81S0300000_15.l2).size()) {
                        AppCompatTextView appCompatTextView = (AppCompatTextView) ListProtector.get((List) aCListenerS81S0300000_15.l2, i);
                        if (appCompatTextView != null) {
                            text = appCompatTextView.getText();
                        } else {
                            text = null;
                        }
                    } else {
                        text = "";
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("index = ");
                    sbLIZ.append(i);
                    sbLIZ.append(", switchAuxStreamUserText = ");
                    sbLIZ.append((Object) text);
                    sbLIZ.append(' ');
                    C20441214yg.LIZIZ("MultiCoHostShareScreenSwitchListFragment", C2188811AlT.LIZIZ(sbLIZ));
                    Iterator<C954460awe> it3 = C915980Zwa.LJII().LLILZLL(true).iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        C954460awe next = it3.next();
                        C954460awe c954460awe2 = next;
                        CohostStreamConfig cohostStreamConfig = c954460awe2.LJJI;
                        if (cohostStreamConfig != null && (str = cohostStreamConfig.screenShareStreamId) != null && str.length() > 0 && c954460awe2.LJ != C915980Zwa.LJII().LJJL()) {
                            Object[] objArr = new Object[1];
                            C754570Tip c754570Tip = c954460awe2.LJIJJ;
                            if (c754570Tip != null) {
                                str2 = c754570Tip.LIZ;
                                str3 = c754570Tip.LIZIZ;
                            } else {
                                str2 = null;
                                str3 = null;
                            }
                            objArr[0] = C0KVU.LIZIZ(str2, str3);
                            if (Intrinsics.LJFF(C497740JfY.LJIJJ(2131853128, objArr), text)) {
                                c954460awe = next;
                                break;
                            }
                        }
                    }
                    C954460awe c954460awe3 = c954460awe;
                    if (c954460awe3 != null) {
                        MultiCoHostAuxStreamSwitchListFragment multiCoHostAuxStreamSwitchListFragment = (MultiCoHostAuxStreamSwitchListFragment) aCListenerS81S0300000_15.l1;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("new aux stream userId = ");
                        sbLIZ2.append(c954460awe3.LJ);
                        C20441214yg.LIZIZ("MultiCoHostShareScreenSwitchListFragment", C2188811AlT.LIZIZ(sbLIZ2));
                        AbstractC963920bBu abstractC963920bBu = (AbstractC963920bBu) multiCoHostAuxStreamSwitchListFragment.LLILLL;
                        if (abstractC963920bBu != null) {
                            abstractC963920bBu.LJIIIZ(C915980Zwa.LJII().LJJL(), c954460awe3.LJ);
                        }
                    }
                    ((MultiCoHostAuxStreamSwitchListFragment) aCListenerS81S0300000_15.l1).LL.dismiss();
                    C955400ayA c955400ayA = C955400ayA.LIZ;
                    C955400ayA.LJLJI("click");
                    return;
                }
            } else {
                i++;
            }
        }
        ((MultiCoHostAuxStreamSwitchListFragment) aCListenerS81S0300000_15.l1).LL.dismiss();
    }

    public static final void onClick$5(ACListenerS81S0300000_15 aCListenerS81S0300000_15, View view) {
        String strLJIJI;
        C973660bRc.LIZ.LJJJJIZL((DataChannel) aCListenerS81S0300000_15.l0, true);
        Context context = ((C986580bmS) aCListenerS81S0300000_15.l1).getContext();
        FragmentManager fragmentManager = (FragmentManager) ((DataChannel) aCListenerS81S0300000_15.l0).gg0(C748880TZe.class);
        if (fragmentManager == null) {
            return;
        }
        C980900bdI c980900bdI = (C980900bdI) aCListenerS81S0300000_15.l2;
        Context context2 = ((C986580bmS) aCListenerS81S0300000_15.l1).getContext();
        c980900bdI.getClass();
        if (C950220apo.LJI()) {
            strLJIJI = C497740JfY.LJIJI(2131853691);
        } else {
            strLJIJI = C497740JfY.LJIJI(2131853692);
        }
        C1845100y7A.LIZIZ(context, fragmentManager, new C1845110y7B(strLJIJI, new C1845120y7C(C497740JfY.LJIJI(2131853705), AFwS299S0000000_15.get$arr$(24), true), new C1845120y7C(C497740JfY.LJIJI(2131853700), new AwS451S0200000_15(c980900bdI, context2, 14), false), "ai_icon", c980900bdI.LLILZIL, "show_turn_off_button", "close", "turn_off"));
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [X.0bCT, java.lang.Object] */
    public static final void onClick$6(ACListenerS81S0300000_15 aCListenerS81S0300000_15, View view) {
        final MultiCoHostFollowPromptViewModel multiCoHostFollowPromptViewModel;
        C964350bCb c964350bCb = ((C964260bCS) aCListenerS81S0300000_15.l0).LIZ;
        if (c964350bCb != null && (multiCoHostFollowPromptViewModel = c964350bCb.LLILLL) != null) {
            final Context context = ((View) aCListenerS81S0300000_15.l1).getContext();
            final C963810bBj c963810bBj = (C963810bBj) aCListenerS81S0300000_15.l2;
            boolean zLIZ = c963810bBj.LIZ();
            if (!zLIZ) {
                multiCoHostFollowPromptViewModel.wQ2(c963810bBj);
            }
            final User user = c963810bBj.LIZJ;
            final AwS97S0210000_15 awS97S0210000_15 = new AwS97S0210000_15(zLIZ, multiCoHostFollowPromptViewModel, c963810bBj, 2);
            final ?? r7 = new InterfaceC964300bCW() { // from class: X.0bCT
                @Override // X.InterfaceC964300bCW
                public final void LIZ(FollowPair followPair) {
                    String str;
                    if (followPair != null) {
                        MultiCoHostFollowPromptViewModel multiCoHostFollowPromptViewModel2 = multiCoHostFollowPromptViewModel;
                        C963810bBj c963810bBj2 = c963810bBj;
                        C963270bAr c963270bAr = multiCoHostFollowPromptViewModel2.vQ2().LLILZ;
                        DataChannel dataChannel = multiCoHostFollowPromptViewModel2.vQ2().LL;
                        c963270bAr.getClass();
                        if (c963810bBj2.LIZ()) {
                            str = "unfollow";
                        } else {
                            str = "follow";
                        }
                        C474500IjA c474500IjALIZ = c963270bAr.LIZ(str);
                        c474500IjALIZ.LJJII("anchor", "connection_type");
                        c474500IjALIZ.LJJII("live_anchor_c_anchor", "request_page");
                        c474500IjALIZ.LJJII("follow_prompt_after_cohost", "click_user_position");
                        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().LJIJJLI().getId()), "user_id");
                        c474500IjALIZ.LJJII(Long.valueOf(c963810bBj2.LIZ), "to_user_id");
                        c474500IjALIZ.LJJIZ(dataChannel);
                        c474500IjALIZ.LIZ();
                    }
                }

                @Override // X.InterfaceC964300bCW
                public final void LIZIZ(Throwable th) {
                    multiCoHostFollowPromptViewModel.getClass();
                    C20441214yg.LJI("CoHostFollowPrompt", th);
                    C176600m4.LIZJ(new C5182020e(th, 253));
                    MultiCoHostFollowPromptViewModel multiCoHostFollowPromptViewModel2 = multiCoHostFollowPromptViewModel;
                    C963810bBj c963810bBj2 = c963810bBj;
                    multiCoHostFollowPromptViewModel2.xQ2(c963810bBj2, c963810bBj2.LIZIZ);
                }
            };
            final Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room != null) {
                if (zLIZ) {
                    C930160aJS.LIZ.getClass();
                    C782110Um9 c782110Um9 = new C782110Um9(context);
                    c782110Um9.LJIIIZ(C497740JfY.LJIJJ(2131842892, C0KVU.LIZ(user)));
                    c782110Um9.LJIILIIL(2131842891, new InterfaceC743640TFa() { // from class: X.0bCX
                        @Override // X.InterfaceC743640TFa
                        public final void LIZ(LiveDialog liveDialog) {
                            liveDialog.dismiss();
                            Function0<Unit> function0 = awS97S0210000_15;
                            if (function0 != null) {
                                function0.invoke();
                            }
                            C485350J1p c485350J1p = new C485350J1p();
                            c485350J1p.LIZJ = C1388190mED.LIZ(context);
                            c485350J1p.LIZIZ(user.getId());
                            c485350J1p.LJ(room.getId());
                            c485350J1p.LIZJ();
                            c485350J1p.LIZLLL((int) user.getFollowInfo().getFollowStatus());
                            c485350J1p.getClass();
                            C11NZ<FollowPair> c11nzLJI = UserService.getInstance().user().LJI(new C1812120xFy(c485350J1p));
                            C930160aJS.LIZ.getClass();
                            C11NJ c11nj = C930160aJS.LIZIZ;
                            InterfaceC964300bCW interfaceC964300bCW = r7;
                            C19487311Lz.LIZIZ(c11nzLJI, c11nj, new AfS184S0100000_15(interfaceC964300bCW, 28), new AfS184S0100000_15(interfaceC964300bCW, 29), null, null, 24);
                        }
                    });
                    c782110Um9.LJIIJ(2131843838, new InterfaceC743640TFa() { // from class: X.0bCY
                        @Override // X.InterfaceC743640TFa
                        public final void LIZ(LiveDialog liveDialog) {
                            liveDialog.dismiss();
                        }
                    });
                    C786410Ut5.E4(c782110Um9.LIZ());
                    return;
                }
                C930160aJS.LIZ.getClass();
                C1099420eiS c1099420eiS = new C1099420eiS();
                c1099420eiS.LIZIZ(user.getId());
                room.getRequestId();
                c1099420eiS.LIZLLL();
                C1099420eiS c1099420eiS2 = c1099420eiS;
                c1099420eiS2.LIZLLL();
                c1099420eiS2.LJ(room.getId());
                room.getLabels();
                c1099420eiS2.LIZLLL();
                C19487311Lz.LIZIZ(UserService.getInstance().user().LIZ(new C1812130xFz(c1099420eiS2)), C930160aJS.LIZIZ, new AfS184S0100000_15((Object) r7, 31), new AfS184S0100000_15((Object) r7, 27), null, null, 24);
            }
        }
    }

    public static final void onClick$7(ACListenerS81S0300000_15 aCListenerS81S0300000_15, View view) {
        C914590ZuL c914590ZuL;
        long id;
        C945060ahU c945060ahU;
        if (view != null && view.getContext() != null && ((C1109770ez9) aCListenerS81S0300000_15.l0).LJIIIZ != null) {
            C915980Zwa.LJI().LIZ().LJIIJ(new C943870afZ("anchor_host_notice"));
            InterfaceC955420ayC interfaceC955420ayCLIZ = C915980Zwa.LJI().LIZ();
            DataChannel dataChannel = ((C1109770ez9) aCListenerS81S0300000_15.l0).LJIIIZ;
            Long lValueOf = null;
            if (dataChannel != null && (c945060ahU = (C945060ahU) dataChannel.gg0(C956740b0K.class)) != null) {
                lValueOf = Long.valueOf(c945060ahU.LIZ);
            }
            interfaceC955420ayCLIZ.LJJJLIIL(String.valueOf(lValueOf));
            C915980Zwa.LJI().LIZ().LLILZIL("anchor_host_notice");
            DataChannel dataChannel2 = ((C1109770ez9) aCListenerS81S0300000_15.l0).LJIIIZ;
            if (dataChannel2 != null && (c914590ZuL = (C914590ZuL) dataChannel2.gg0(CoHostPunishPermissionChannel.class)) != null && c914590ZuL.LIZ) {
                Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                if (room != null) {
                    id = room.getId();
                } else {
                    id = 0;
                }
                C1109770ez9 c1109770ez9 = (C1109770ez9) aCListenerS81S0300000_15.l0;
                C925610aC7.LIZ(c1109770ez9.LJIIIZ, id, null, null, new AwS259S0300000_15((C949600aoo) aCListenerS81S0300000_15.l1, (C154500iV) aCListenerS81S0300000_15.l2, c1109770ez9, 41), true, ((C1109770ez9) aCListenerS81S0300000_15.l0).LIZ);
                return;
            }
            ((C949600aoo) aCListenerS81S0300000_15.l1).LIZIZ((C1109770ez9) aCListenerS81S0300000_15.l0, (C154500iV) aCListenerS81S0300000_15.l2);
        }
    }

    public static final void onClick$8(ACListenerS81S0300000_15 aCListenerS81S0300000_15, View view) {
        C20337914i1<Integer> c20337914i1 = InterfaceC960800b6s.LLLJL;
        c20337914i1.LJFF(Integer.valueOf(c20337914i1.LIZIZ().intValue() + 1));
        InterfaceC960800b6s.LLLL.LJFF(Long.valueOf(System.currentTimeMillis()));
        InterfaceC960800b6s.LLLLII.LJFF(Boolean.TRUE);
        C960330b67 c960330b67 = (C960330b67) aCListenerS81S0300000_15.l0;
        RecyclerView recyclerView = c960330b67.LIZIZ;
        if (recyclerView != null) {
            C960300b64 c960300b64 = (C960300b64) aCListenerS81S0300000_15.l2;
            InterfaceC960350b69 interfaceC960350b69 = c960330b67.LIZJ;
            if (interfaceC960350b69 != null) {
                interfaceC960350b69.kK(recyclerView.getChildAdapterPosition(c960300b64.itemView));
            }
        }
        C960330b67 c960330b672 = (C960330b67) aCListenerS81S0300000_15.l0;
        C958770b3b c958770b3b = (C958770b3b) aCListenerS81S0300000_15.l1;
        c960330b672.getClass();
        Long lValueOf = null;
        Long lValueOf2 = null;
        Long lValueOf3 = null;
        int i = 0;
        Long lValueOf4 = null;
        for (Benefit benefit : c958770b3b.LJ.benefits) {
            if (i < 3) {
                int i2 = benefit.type;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                lValueOf3 = Long.valueOf(benefit.value);
                            }
                        } else {
                            lValueOf2 = Long.valueOf(benefit.value);
                        }
                    } else {
                        lValueOf4 = Long.valueOf(benefit.value);
                    }
                } else {
                    lValueOf = Long.valueOf(benefit.value);
                }
                i++;
            }
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_cohost_guide_close");
        c474500IjALIZ.LJJII("recap", "type");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "benefit_cnt");
        c474500IjALIZ.LJJII(lValueOf, "diamonds_cnt");
        c474500IjALIZ.LJJII(lValueOf4, "viewers_cnt");
        c474500IjALIZ.LJJII(lValueOf2, "friends_cnt");
        c474500IjALIZ.LJJII(lValueOf3, "followers_cnt");
        c474500IjALIZ.LJJII(Long.valueOf(C950220apo.LJFF()), "anchor_id");
        c474500IjALIZ.LJJII(C930540aK4.LJIIJ(), "room_id");
        c474500IjALIZ.LJJII("recap", "guide_type");
        c474500IjALIZ.LIZ();
    }

    public static final void onClick$9(ACListenerS81S0300000_15 aCListenerS81S0300000_15, View view) {
        ((C961370b7n) aCListenerS81S0300000_15.l0).LIZIZ.bp(((C961360b7m) aCListenerS81S0300000_15.l1).LJ);
        ((C961370b7n) aCListenerS81S0300000_15.l0).LJIIIIZZ((C961540b84) aCListenerS81S0300000_15.l2, (C961360b7m) aCListenerS81S0300000_15.l1);
    }

    public ACListenerS81S0300000_15(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
