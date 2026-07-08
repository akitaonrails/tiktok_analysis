package Y;

import X.C013C;
import X.C01GW;
import X.C0UI0;
import X.C1161920gLG;
import X.C11QI;
import X.C11S5;
import X.C1954807lC;
import X.C19GU;
import X.C20441214yg;
import X.C259800zU;
import X.C307001Gy;
import X.C465900IOu;
import X.C497740JfY;
import X.C766270U4b;
import X.C784440Upu;
import X.C785410UrT;
import X.C915980Zwa;
import X.C916490ZxP;
import X.C917570Zz9;
import X.C917580ZzA;
import X.C919310a1x;
import X.C922430a6z;
import X.C923760a98;
import X.C924650aAZ;
import X.C924980aB6;
import X.C925320aBe;
import X.C925600aC6;
import X.C927240aEk;
import X.C927550aFF;
import X.C927570aFH;
import X.C927600aFK;
import X.C930940aKi;
import X.C931830aM9;
import X.C933080aOA;
import X.C935470aS1;
import X.C936170aT9;
import X.C936730aU3;
import X.C946850akN;
import X.C947340alA;
import X.C953230auf;
import X.C953550avB;
import X.C953770avX;
import X.C955400ayA;
import X.C955590ayT;
import X.EnumC918820a1A;
import X.EnumC920250a3T;
import X.EnumC952890au7;
import X.EnumC971520bOA;
import X.InterfaceC2217461Bqa;
import X.InterfaceC743640TFa;
import X.InterfaceC927510aFB;
import X.InterfaceC931760aM2;
import X.InterfaceC953490av5;
import android.content.Context;
import android.view.View;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.gamelink.model.GameLinkGuestMuteAudioEvent;
import com.bytedance.android.live.liveinteract.gamelink.v2.widget.GameLinkV2Widget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.AvatarGuestWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.CloudDraftItemManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveAnchorMuteVideoEvent;
import com.bytedance.android.live.liveinteract.voicechat.main.guest.VoiceChatWatchWidget;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS69S0100100_15;

/* JADX INFO: loaded from: classes16.dex */
public class AcS187S0300000_15 implements InterfaceC743640TFa {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC743640TFa
    public final void LIZ(LiveDialog liveDialog) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, liveDialog);
                break;
            case 1:
                LIZ$1(this, liveDialog);
                break;
            case 2:
                LIZ$2(this, liveDialog);
                break;
            case 3:
                LIZ$3(this, liveDialog);
                break;
            case 4:
                LIZ$4(this, liveDialog);
                break;
            case 5:
                LIZ$5(this, liveDialog);
                break;
            case 6:
                LIZ$6(this, liveDialog);
                break;
            case 7:
                LIZ$7(this, liveDialog);
                break;
            case 8:
                LIZ$8(this, liveDialog);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, liveDialog);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, liveDialog);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, liveDialog);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, liveDialog);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, liveDialog);
                break;
            case 14:
                LIZ$14(this, liveDialog);
                break;
            case 15:
                LIZ$15(this, liveDialog);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$0(AcS187S0300000_15 acS187S0300000_15, LiveDialog liveDialog) {
        Long l;
        int i = C917570Zz9.LIZ[((EnumC918820a1A) ((C259800zU) acS187S0300000_15.l0).element).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new C1954807lC();
                    }
                } else {
                    C953770avX c953770avX = (C953770avX) ((C259800zU) acS187S0300000_15.l1).element;
                    if (c953770avX != null) {
                        Context context = (Context) acS187S0300000_15.l2;
                        AwS416S0200000_15 awS416S0200000_15 = new AwS416S0200000_15(context, c953770avX, 2);
                        C953230auf.LIZ.getClass();
                        if (C953230auf.LIZIZ.size() >= C953230auf.LIZLLL) {
                            C953230auf.LJIJ(context, new AwS559S0100000_15(awS416S0200000_15, 6), AFwS203S0000000_15.get$arr$(3));
                        } else {
                            awS416S0200000_15.invoke();
                        }
                    }
                }
            } else {
                C259800zU c259800zU = (C259800zU) acS187S0300000_15.l1;
                C953770avX c953770avX2 = (C953770avX) c259800zU.element;
                if (c953770avX2 != null && (l = c953770avX2.LJIIL) != null) {
                    Context context2 = (Context) acS187S0300000_15.l2;
                    AwS69S0100100_15 awS69S0100100_15 = new AwS69S0100100_15(l.longValue(), (long) c259800zU, (C259800zU<C953770avX>) 0);
                    C953230auf.LIZ.getClass();
                    if (C953230auf.LIZIZ.size() >= C953230auf.LIZLLL) {
                        C953230auf.LJIJ(context2, new AwS559S0100000_15(awS69S0100100_15, 5), AFwS203S0000000_15.get$arr$(2));
                    } else {
                        awS69S0100100_15.invoke();
                    }
                }
            }
        } else {
            C953770avX c953770avX3 = (C953770avX) ((C259800zU) acS187S0300000_15.l1).element;
            if (c953770avX3 != null) {
                BPEAHandler bPEAHandler = CloudDraftItemManager.LIZ;
                new C11QI(CloudDraftItemManager.LJIIIZ(c953770avX3).LJJIJIIJI(C11S5.LIZ()).LJIILL(new AfS184S0100000_15(c953770avX3, 0))).LJIILL().LJIIZILJ();
            }
        }
        liveDialog.dismiss();
    }

    public static final void LIZ$1(AcS187S0300000_15 acS187S0300000_15, LiveDialog liveDialog) {
        C925320aBe c925320aBe = C925320aBe.LIZ;
        DataChannel dataChannel = (DataChannel) acS187S0300000_15.l0;
        Context context = (Context) acS187S0300000_15.l1;
        c925320aBe.getClass();
        C925320aBe.LIZ(context, dataChannel, true);
        liveDialog.dismiss();
        ((Function0) acS187S0300000_15.l2).invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$10(AcS187S0300000_15 acS187S0300000_15, LiveDialog liveDialog) {
        long j;
        RivalExtraInfo.ReserveInfo reserveInfo;
        C955400ayA c955400ayA = C955400ayA.LIZ;
        long ownerUserId = ((C955590ayT) acS187S0300000_15.l0).LJ.getOwnerUserId();
        RivalExtraInfo rivalExtraInfo = ((C955590ayT) acS187S0300000_15.l0).LJIIJ;
        if (rivalExtraInfo != null && (reserveInfo = rivalExtraInfo.reserveInfo) != null) {
            j = reserveInfo.reservationId;
        } else {
            j = 0;
        }
        c955400ayA.LLIIIL(ownerUserId, j, false);
        C19GU c19gu = (C19GU) ((C259800zU) acS187S0300000_15.l1).element;
        if (c19gu != null) {
            c19gu.dismiss();
            C785410UrT.LIZ(c19gu);
        }
        ((Function1) acS187S0300000_15.l2).invoke(Boolean.FALSE);
    }

    public static final void LIZ$11(AcS187S0300000_15 acS187S0300000_15, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((C936170aT9) acS187S0300000_15.l0).LIZIZ(((AvatarGuestWidget) acS187S0300000_15.l1).LLILZ, new AwS559S0100000_15((Runnable) acS187S0300000_15.l2, 1031));
    }

    public static final void LIZ$12(AcS187S0300000_15 acS187S0300000_15, LiveDialog liveDialog) {
        Integer numValueOf;
        C465900IOu c465900IOu = (C465900IOu) acS187S0300000_15.l0;
        if (c465900IOu != null) {
            numValueOf = Integer.valueOf(c465900IOu.LIZ);
        } else {
            numValueOf = null;
        }
        C924980aB6.LIZJ(true, true, numValueOf, null);
        liveDialog.dismiss();
        VoiceChatWatchWidget voiceChatWatchWidget = (VoiceChatWatchWidget) acS187S0300000_15.l1;
        Runnable runnable = (Runnable) acS187S0300000_15.l2;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = VoiceChatWatchWidget.LLJJJJJIL;
        voiceChatWatchWidget.C1(runnable, false, "live_end", true);
        ((VoiceChatWatchWidget) acS187S0300000_15.l1).E1("click");
    }

    public static final void LIZ$13(AcS187S0300000_15 acS187S0300000_15, LiveDialog liveDialog) {
        String strLJIILL;
        liveDialog.dismiss();
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = (MultiLiveAsAnchorListDialogV2) acS187S0300000_15.l0;
        InterfaceC927510aFB interfaceC927510aFBLL = multiLiveAsAnchorListDialogV2.LL();
        if (interfaceC927510aFBLL == null || (strLJIILL = interfaceC927510aFBLL.LJIILL()) == null) {
            strLJIILL = "";
        }
        multiLiveAsAnchorListDialogV2.LLJZIJLIL(strLJIILL, (LinkPlayerInfo) acS187S0300000_15.l1, (EnumC920250a3T) acS187S0300000_15.l2);
    }

    public static final void LIZ$14(AcS187S0300000_15 acS187S0300000_15, LiveDialog liveDialog) {
        C955400ayA.LIZ.LJZI("disconnect", ((C013C) acS187S0300000_15.l0).element);
        C915980Zwa.LJI().LIZ().LLJ();
        Function1<? super Boolean, Unit> function1 = ((C936730aU3) acS187S0300000_15.l1).LIZIZ.LIZLLL;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(((C013C) acS187S0300000_15.l2).element));
        }
        liveDialog.dismiss();
    }

    public static final void LIZ$15(AcS187S0300000_15 acS187S0300000_15, LiveDialog liveDialog) {
        Long lValueOf;
        liveDialog.dismiss();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        Long lValueOf2 = Long.valueOf(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).liveId());
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZ = MultiLiveAnchorPanelSettings.LIZ((MultiLiveAnchorPanelSettings) acS187S0300000_15.l0, 0, 0, 0, 8388607);
        multiLiveAnchorPanelSettingsLIZ.disableGuestOpenCamera = 2;
        C927550aFF c927550aFF = C927570aFH.LLILZ;
        String strLIZ = C916490ZxP.LIZ(multiLiveAnchorPanelSettingsLIZ);
        AwS381S0200000_15 awS381S0200000_15 = new AwS381S0200000_15(multiLiveAnchorPanelSettingsLIZ, (MultiLiveAnchorPanelSettings) acS187S0300000_15.l1, (Function0<Unit>) 199);
        AwS586S0100000_7 awS586S0100000_7 = new AwS586S0100000_7((View) acS187S0300000_15.l2, 602);
        c927550aFF.getClass();
        C927550aFF.LIZLLL(null, lValueOf, lValueOf2, multiLiveAnchorPanelSettingsLIZ, 12, strLIZ, null, 14, null, awS381S0200000_15, awS586S0100000_7);
    }

    public static final void LIZ$2(AcS187S0300000_15 acS187S0300000_15, LiveDialog liveDialog) {
        liveDialog.dismiss();
        new C927240aEk("cancelInviteAlert", "cancelBtn").LIZ();
        InterfaceC931760aM2 interfaceC931760aM2 = ((C931830aM9) acS187S0300000_15.l0).LLILLJJLI;
        if (interfaceC931760aM2 != null) {
            interfaceC931760aM2.LJI((LinkPlayerInfo) acS187S0300000_15.l1, ((Room) acS187S0300000_15.l2).getId());
        }
        long ownerUserId = ((Room) acS187S0300000_15.l2).getOwnerUserId();
        long id = ((LinkPlayerInfo) acS187S0300000_15.l1).mUser.getId();
        long id2 = ((Room) acS187S0300000_15.l2).getId();
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        C925600aC6.LJIIJJI(ownerUserId, id, id2, false, true, C927600aFK.LJII());
    }

    public static final void LIZ$3(AcS187S0300000_15 acS187S0300000_15, LiveDialog liveDialog) {
        Integer numValueOf;
        C465900IOu c465900IOu = (C465900IOu) acS187S0300000_15.l0;
        if (c465900IOu != null) {
            numValueOf = Integer.valueOf(c465900IOu.LIZ);
        } else {
            numValueOf = null;
        }
        C924980aB6.LIZJ(true, true, numValueOf, ((MultiGuestV3GuestWidget) acS187S0300000_15.l1).dataChannel);
        liveDialog.dismiss();
        new C927240aEk("leavePopupV", "quitBtn").LIZ();
        ((MultiGuestV3GuestWidget) acS187S0300000_15.l1).A1((Runnable) acS187S0300000_15.l2, false);
        ((MultiGuestV3GuestWidget) acS187S0300000_15.l1).Y1("click");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$4(AcS187S0300000_15 acS187S0300000_15, LiveDialog liveDialog) {
        Long l;
        int i = C917580ZzA.LIZ[((EnumC918820a1A) ((C259800zU) acS187S0300000_15.l0).element).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new C1954807lC();
                    }
                } else {
                    C953770avX c953770avX = (C953770avX) ((C259800zU) acS187S0300000_15.l1).element;
                    if (c953770avX != null) {
                        C933080aOA c933080aOA = (C933080aOA) acS187S0300000_15.l2;
                        AwS416S0200000_15 awS416S0200000_15 = new AwS416S0200000_15(c933080aOA, c953770avX, 34);
                        C953230auf.LIZ.getClass();
                        if (C953230auf.LIZIZ.size() >= C953230auf.LIZLLL) {
                            C953230auf.LJIJ(c933080aOA.getContext(), new AwS559S0100000_15(awS416S0200000_15, 293), AFwS203S0000000_15.get$arr$(105));
                        } else {
                            awS416S0200000_15.invoke();
                        }
                    }
                }
            } else {
                C259800zU c259800zU = (C259800zU) acS187S0300000_15.l1;
                C953770avX c953770avX2 = (C953770avX) c259800zU.element;
                if (c953770avX2 != null && (l = c953770avX2.LJIIL) != null) {
                    C933080aOA c933080aOA2 = (C933080aOA) acS187S0300000_15.l2;
                    AwS69S0100100_15 awS69S0100100_15 = new AwS69S0100100_15(l.longValue(), (long) c259800zU, (C259800zU<C953770avX>) 2);
                    C953230auf.LIZ.getClass();
                    if (C953230auf.LIZIZ.size() >= C953230auf.LIZLLL) {
                        C953230auf.LJIJ(c933080aOA2.getContext(), new AwS559S0100000_15(awS69S0100100_15, 292), AFwS203S0000000_15.get$arr$(103));
                    } else {
                        awS69S0100100_15.invoke();
                    }
                }
            }
        } else {
            C953770avX c953770avX3 = (C953770avX) ((C259800zU) acS187S0300000_15.l1).element;
            if (c953770avX3 != null) {
                BPEAHandler bPEAHandler = CloudDraftItemManager.LIZ;
                new C11QI(CloudDraftItemManager.LJIIIZ(c953770avX3).LJJIJIIJI(C11S5.LIZ()).LJIILL(new AfS184S0100000_15(c953770avX3, 54))).LJIILL().LJIIZILJ();
            }
        }
        liveDialog.dismiss();
    }

    public static final void LIZ$5(AcS187S0300000_15 acS187S0300000_15, LiveDialog liveDialog) {
        C20441214yg.LJIIIZ("CameraSettingInterceptor", "intercept, click_button=turnOn");
        C947340alA c947340alA = (C947340alA) acS187S0300000_15.l0;
        DataChannel dataChannel = (DataChannel) acS187S0300000_15.l1;
        c947340alA.getClass();
        C784440Upu.LIZ().LIZIZ(new C465900IOu(40));
        if (dataChannel != null) {
            dataChannel.LC0(MultiLiveAnchorMuteVideoEvent.class, new C0UI0(true, "business_mute_on_camera_cohost_invitation"));
        }
        ((Function1) acS187S0300000_15.l2).invoke(Boolean.TRUE);
        liveDialog.dismiss();
    }

    public static final void LIZ$6(AcS187S0300000_15 acS187S0300000_15, LiveDialog liveDialog) {
        C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", "show quick apply dialog, click cancel btn");
        liveDialog.dismiss();
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = (MultiGuestSharedBgAnchorViewModel) acS187S0300000_15.l0;
        Context context = (Context) acS187S0300000_15.l1;
        DataChannel dataChannel = (DataChannel) acS187S0300000_15.l2;
        String str = MultiGuestSharedBgAnchorViewModel.LLJJIII;
        multiGuestSharedBgAnchorViewModel.IQ2(context, dataChannel, true);
        C935470aS1.LJFF("grid_shared_panel_used", "cancel");
    }

    public static final void LIZ$7(AcS187S0300000_15 acS187S0300000_15, LiveDialog liveDialog) {
        InterfaceC953490av5 interfaceC953490av5 = (InterfaceC953490av5) acS187S0300000_15.l0;
        if (interfaceC953490av5 != null) {
            interfaceC953490av5.LJI(((C953550avB) acS187S0300000_15.l1).LIZ.noticeboardTemplateId);
        }
        EnumC971520bOA enumC971520bOA = EnumC971520bOA.DELETE;
        Long lValueOf = Long.valueOf(((C953550avB) acS187S0300000_15.l1).LIZ.noticeboardTemplateId);
        MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
        EnumC952890au7 enumC952890au7 = (EnumC952890au7) acS187S0300000_15.l2;
        multiCanvasUtils.getClass();
        C946850akN.LJIIIZ(enumC971520bOA, lValueOf, "personal", MultiCanvasUtils.LJIIJJI(enumC952890au7), "in_spots");
        liveDialog.dismiss();
    }

    public static final void LIZ$8(AcS187S0300000_15 acS187S0300000_15, LiveDialog liveDialog) {
        String str;
        liveDialog.dismiss();
        if (!((C923760a98) acS187S0300000_15.l0).LJJJLZIJ().LJIIIZ) {
            ((C923760a98) acS187S0300000_15.l0).LJJJLZIJ().LJIIIZ = true;
            DataChannel dataChannel = ((C923760a98) acS187S0300000_15.l0).dataChannel;
            if (dataChannel != null) {
                dataChannel.LC0(GameLinkGuestMuteAudioEvent.class, new C922430a6z(((C923760a98) acS187S0300000_15.l0).LJJJLZIJ().LJIIIZ, "business_mute_guest_confirm_host_invite"));
            }
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131843456));
            C924650aAZ.LIZ.LJIIIZ(((C923760a98) acS187S0300000_15.l0).LJJJLZIJ().LJJJJJL, ((C923760a98) acS187S0300000_15.l0).LJJJLZIJ().LJL, "anchor_manage", false);
        }
        C923760a98 c923760a98 = (C923760a98) acS187S0300000_15.l0;
        LinkListUser linkListUser = (LinkListUser) acS187S0300000_15.l1;
        boolean z = ((C013C) acS187S0300000_15.l2).element;
        if (z) {
            str = "check_click";
        } else {
            str = "click";
        }
        c923760a98.LJJLI(linkListUser, z, str, false);
    }

    public static final void LIZ$9(AcS187S0300000_15 acS187S0300000_15, LiveDialog liveDialog) {
        Integer numValueOf;
        C465900IOu c465900IOu = (C465900IOu) acS187S0300000_15.l0;
        if (c465900IOu != null) {
            numValueOf = Integer.valueOf(c465900IOu.LIZ);
        } else {
            numValueOf = null;
        }
        C924650aAZ.LJIIJ(true, numValueOf, true);
        liveDialog.dismiss();
        ((GameLinkV2Widget) acS187S0300000_15.l1).x1((Runnable) acS187S0300000_15.l2, false);
    }

    public AcS187S0300000_15(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
        this.l2 = obj3;
    }
}
