package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.SendUpdateToUserEvent;
import com.bytedance.android.live.liveinteract.api.LinkGuestGiftPanelShowToastEvent;
import com.bytedance.android.live.liveinteract.api.LinkGuestZoomEvent;
import com.bytedance.android.live.liveinteract.api.LinkGuestZoomRestoreEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestV3GiftSelectNeedShowToastChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestV3GiftSelectTargetUserIdChannel;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveMessage;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicGIftSelectLogicSetting;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0a7f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C922850a7f {
    public final DataChannel LIZ;
    public Long LIZIZ;
    public Long LIZJ;
    public Long LIZLLL;
    public final C922860a7g LJ = new AbstractC303101Fl() { // from class: X.0a7g
        @Override // X.InterfaceC922630a7J
        public final void L2(InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50, int i) {
            boolean zLJFF;
            Long l;
            Long lValueOf;
            C922850a7f c922850a7f = this.LL;
            List<LinkPlayerInfo> listLIZ = interfaceC921200a50.LIZ();
            c922850a7f.getClass();
            LinkMicGIftSelectLogicSetting linkMicGIftSelectLogicSetting = LinkMicGIftSelectLogicSetting.INSTANCE;
            DataChannel dataChannel = c922850a7f.LIZ;
            if (dataChannel != null) {
                zLJFF = Intrinsics.LJFF(dataChannel.gg0(UserIsAnchorChannel.class), Boolean.TRUE);
            } else {
                zLJFF = false;
            }
            C923330a8R c923330a8R = C923330a8R.LIZ;
            if (linkMicGIftSelectLogicSetting.isV2(zLJFF, C923330a8R.LJFF())) {
                for (LinkPlayerInfo linkPlayerInfo : listLIZ) {
                    if (linkPlayerInfo.LIZ == 2 && (l = c922850a7f.LIZLLL) != null) {
                        User user = linkPlayerInfo.mUser;
                        Long lValueOf2 = null;
                        if (user != null) {
                            lValueOf = Long.valueOf(user.getId());
                        } else {
                            lValueOf = null;
                        }
                        if (Intrinsics.LJFF(l, lValueOf)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("updateAllLinkPlayerInfo：gifted guest，set it as the first choice, userId: ");
                            User user2 = linkPlayerInfo.mUser;
                            if (user2 != null) {
                                lValueOf2 = Long.valueOf(user2.getId());
                            }
                            sbLIZ.append(lValueOf2);
                            C20441214yg.LIZIZ("MultiGuestGiftSelectDataHolder", C2188811AlT.LIZIZ(sbLIZ));
                            Long l2 = c922850a7f.LIZLLL;
                            if (l2 != null) {
                                c922850a7f.LIZIZ(l2.longValue());
                            }
                            c922850a7f.LJI(false);
                        }
                    }
                }
            }
        }

        @Override // X.AbstractC303101Fl, X.InterfaceC922630a7J
        public final void rn(InterfaceC921200a50<LinkListUser, LinkMessage> interfaceC921200a50, int i) {
            boolean zLJFF;
            Long l;
            Long lValueOf;
            C922850a7f c922850a7f = this.LL;
            List<LinkListUser> listLIZ = interfaceC921200a50.LIZ();
            c922850a7f.getClass();
            LinkMicGIftSelectLogicSetting linkMicGIftSelectLogicSetting = LinkMicGIftSelectLogicSetting.INSTANCE;
            DataChannel dataChannel = c922850a7f.LIZ;
            if (dataChannel != null) {
                zLJFF = Intrinsics.LJFF(dataChannel.gg0(UserIsAnchorChannel.class), Boolean.TRUE);
            } else {
                zLJFF = false;
            }
            C923330a8R c923330a8R = C923330a8R.LIZ;
            if (linkMicGIftSelectLogicSetting.isV2(zLJFF, C923330a8R.LJFF())) {
                for (LinkListUser linkListUser : listLIZ) {
                    if (linkListUser.LIZ == 2 && (l = c922850a7f.LIZLLL) != null) {
                        User user = linkListUser.user;
                        Long lValueOf2 = null;
                        if (user != null) {
                            lValueOf = Long.valueOf(user.getId());
                        } else {
                            lValueOf = null;
                        }
                        if (Intrinsics.LJFF(l, lValueOf)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("updateAllLinkListUser: gifted guest，set it as the first choice, userId: ");
                            User user2 = linkListUser.user;
                            if (user2 != null) {
                                lValueOf2 = Long.valueOf(user2.getId());
                            }
                            sbLIZ.append(lValueOf2);
                            C20441214yg.LIZIZ("MultiGuestGiftSelectDataHolder", C2188811AlT.LIZIZ(sbLIZ));
                            Long l2 = c922850a7f.LIZLLL;
                            if (l2 != null) {
                                c922850a7f.LIZIZ(l2.longValue());
                            }
                            c922850a7f.LJI(false);
                        }
                    }
                }
            }
        }
    };
    public final C922870a7h LJFF = new C921870a65() { // from class: X.0a7h
        @Override // X.C921870a65, X.InterfaceC964770bDH
        public final void LLJJIJIIJIL(InterfaceC954180awC interfaceC954180awC, KickOutMessage kickOutMessage) {
            Long l = kickOutMessage.owner.userId;
            if (l != null) {
                this.LL.LJ(l.longValue());
            }
        }

        @Override // X.C921870a65, X.InterfaceC964770bDH
        public final void LLLLLLIL(InterfaceC954180awC interfaceC954180awC, LeaveMessage leaveMessage) {
            Long l = leaveMessage.leftUser.userId;
            if (l != null) {
                this.LL.LJ(l.longValue());
            }
        }
    };

    public final void LIZ() {
        C20441214yg.LIZIZ("MultiGuestGiftSelectDataHolder", "clean all");
        LJFF(null);
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
        InterfaceC921620a5g interfaceC921620a5g = (InterfaceC921620a5g) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if (interfaceC921620a5g != null) {
            interfaceC921620a5g.LJJIIJ(this.LJ);
        }
        C915980Zwa.LJIIIIZZ().a9(this.LJFF);
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0a7g] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0a7h] */
    public C922850a7f(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    public final void LIZIZ(long j) {
        boolean zLJFF;
        LinkMicGIftSelectLogicSetting linkMicGIftSelectLogicSetting = LinkMicGIftSelectLogicSetting.INSTANCE;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            zLJFF = Intrinsics.LJFF(dataChannel.gg0(UserIsAnchorChannel.class), Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        C923330a8R c923330a8R = C923330a8R.LIZ;
        if (!linkMicGIftSelectLogicSetting.isV2(zLJFF, C923330a8R.LJFF())) {
            return;
        }
        C20441214yg.LIZIZ("MultiGuestGiftSelectDataHolder", "onSendGiftSuc");
        this.LIZJ = Long.valueOf(j);
        this.LIZLLL = Long.valueOf(j);
        LJFF(Long.valueOf(j));
    }

    public final void LIZJ(boolean z) {
        InterfaceC921620a5g interfaceC921620a5g;
        String strLJIILIIL;
        Long lValueOf;
        C20441214yg.LIZIZ("MultiGuestGiftSelectDataHolder", "onWidgetCrated");
        C915980Zwa.LJIIIIZZ().Fe(this.LJFF);
        C948450amx c948450amx = C948450amx.LIZIZ;
        InterfaceC927510aFB interfaceC927510aFB = (InterfaceC927510aFB) c948450amx.LJIIJJI("ZOOM_SERVICE");
        if (interfaceC927510aFB != null && (strLJIILIIL = interfaceC927510aFB.LJIILIIL()) != null && (lValueOf = Long.valueOf(C914970Zux.LIZIZ(strLJIILIIL))) != null) {
            C20441214yg.LIZIZ("MultiGuestGiftSelectDataHolder", "Just entered the live room, a current guest has been zoomed in");
            LIZLLL(lValueOf.longValue());
        }
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.CQ2(LinkGuestZoomEvent.class, this, new AwS594S0100000_15(this, 251));
            dataChannel.CQ2(LinkGuestZoomRestoreEvent.class, this, new AwS594S0100000_15(this, 252));
            dataChannel.CQ2(SendUpdateToUserEvent.class, this, new AwS594S0100000_15(this, 253));
            dataChannel.CQ2(LinkGuestGiftPanelShowToastEvent.class, this, new AwS594S0100000_15(this, 254));
        }
        if (z) {
            DataChannel dataChannel2 = this.LIZ;
            if (dataChannel2 != null && (interfaceC921620a5g = (InterfaceC921620a5g) C933980aPc.LJII(dataChannel2, InterfaceC917640ZzG.class)) != null) {
                interfaceC921620a5g.LJJIJIL(this.LJ);
                return;
            }
            return;
        }
        InterfaceC921620a5g interfaceC921620a5g2 = (InterfaceC921620a5g) c948450amx.LJIIJJI("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if (interfaceC921620a5g2 == null) {
            return;
        }
        interfaceC921620a5g2.LJJIJIL(this.LJ);
    }

    public final void LIZLLL(long j) {
        boolean zLJFF;
        LinkMicGIftSelectLogicSetting linkMicGIftSelectLogicSetting = LinkMicGIftSelectLogicSetting.INSTANCE;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            zLJFF = Intrinsics.LJFF(dataChannel.gg0(UserIsAnchorChannel.class), Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        C923330a8R c923330a8R = C923330a8R.LIZ;
        if (linkMicGIftSelectLogicSetting.isV0(zLJFF, C923330a8R.LJFF())) {
            return;
        }
        C20441214yg.LIZIZ("MultiGuestGiftSelectDataHolder", "putZoomUserId");
        if (UserService.getInstance().user().getCurrentUserId() == j) {
            C20441214yg.LIZIZ("MultiGuestGiftSelectDataHolder", "zoom user is me!");
            if (this.LIZJ == null) {
                C20441214yg.LIZIZ("MultiGuestGiftSelectDataHolder", "never send gift to someone, clear zoomMap and targetMap, def show anchor");
                this.LIZIZ = null;
                LJFF(null);
                return;
            }
            C20441214yg.LIZIZ("MultiGuestGiftSelectDataHolder", "send gift to someone and he is on mic, do no thing");
            return;
        }
        this.LIZIZ = Long.valueOf(j);
        if (this.LIZJ != null) {
            C20441214yg.LIZIZ("MultiGuestGiftSelectDataHolder", "There are currently guests who have successfully given gifts on the mic, do not insert zoom user in the target map");
        } else {
            C20441214yg.LIZIZ("MultiGuestGiftSelectDataHolder", "insert zoom user in target map");
            LJFF(Long.valueOf(j));
        }
    }

    public final void LJ(long j) {
        Long l;
        Long l2;
        Long l3;
        Long l4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeWhenGuestLeave: ");
        sbLIZ.append(j);
        C20441214yg.LIZIZ("MultiGuestGiftSelectDataHolder", C2188811AlT.LIZIZ(sbLIZ));
        Long l5 = this.LIZIZ;
        if ((l5 == null || l5.longValue() != j) && (l = this.LIZJ) != null && l.longValue() == j) {
            if (this.LIZIZ != null) {
                C20441214yg.LIZIZ("MultiGuestGiftSelectDataHolder", "case 3. show guest");
                l2 = this.LIZIZ;
            } else {
                C20441214yg.LIZIZ("MultiGuestGiftSelectDataHolder", "case 3. show anchor");
                l2 = null;
            }
            LJFF(l2);
            this.LIZJ = null;
            LJI(true);
        }
        Long l6 = this.LIZIZ;
        if (l6 != null && l6.longValue() == j && (((l4 = this.LIZJ) == null || l4.longValue() != j) && this.LIZJ == null)) {
            C20441214yg.LIZIZ("MultiGuestGiftSelectDataHolder", "case 4. show anchor");
            this.LIZIZ = null;
            LJFF(null);
        }
        Long l7 = this.LIZIZ;
        if (l7 != null && l7.longValue() == j && (l3 = this.LIZJ) != null && l3.longValue() == j) {
            C20441214yg.LIZIZ("MultiGuestGiftSelectDataHolder", "case 6. show anchor");
            this.LIZJ = null;
            this.LIZIZ = null;
            LJFF(null);
            LJI(true);
        }
    }

    public final void LJFF(Long l) {
        if (l == null) {
            DataChannel dataChannel = this.LIZ;
            if (dataChannel != null) {
                dataChannel.zW(MultiGuestV3GiftSelectTargetUserIdChannel.class, -1L);
                return;
            }
            return;
        }
        DataChannel dataChannel2 = this.LIZ;
        if (dataChannel2 == null) {
            return;
        }
        dataChannel2.zW(MultiGuestV3GiftSelectTargetUserIdChannel.class, l);
    }

    public final void LJI(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isNeedShowToast: ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("MultiGuestGiftSelectDataHolder", C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.zW(MultiGuestV3GiftSelectNeedShowToastChannel.class, Boolean.valueOf(z));
        }
    }
}
