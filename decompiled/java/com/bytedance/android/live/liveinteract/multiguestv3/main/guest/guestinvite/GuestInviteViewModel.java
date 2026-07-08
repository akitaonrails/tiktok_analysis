package com.bytedance.android.live.liveinteract.multiguestv3.main.guest.guestinvite;

import X.C001A;
import X.C002R;
import X.C002S;
import X.C00SI;
import X.C00YI;
import X.C0184003y;
import X.C01GW;
import X.C01NB;
import X.C11NJ;
import X.C11S5;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C1770850wBP;
import X.C19322110iZ;
import X.C19487311Lz;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452501pT;
import X.C464790IKn;
import X.C480460Ism;
import X.C497740JfY;
import X.C515801zg;
import X.C516201zk;
import X.C748880TZe;
import X.C776250Uch;
import X.C782110Um9;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C917810ZzX;
import X.C921180a4y;
import X.C923330a8R;
import X.C924790aAn;
import X.C925150aBN;
import X.C930540aK4;
import X.C931680aLu;
import X.InterfaceC0148002o;
import X.InterfaceC665370Q7z;
import X.InterfaceC743640TFa;
import X.InterfaceC938950aXd;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.multilive.social.model.GuestInvitePanelReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.GuestInviteReq;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestAnchorPanelSettingChangeAllTheTime;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestGuestInviteSheetOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTLiveGuestInvitePanelAddSuggestSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class GuestInviteViewModel extends AssemViewModel<C931680aLu> implements InterfaceC938950aXd, C002S {
    public static final /* synthetic */ int LLILZLL = 0;
    public Long LL;
    public DataChannel LLILLJJLI;
    public C002R LLILLL;
    public final C11NJ LLILZ = new C11NJ();
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(88));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C931680aLu(null, null);
    }

    @Override // X.C002S
    public final void DR(C00YI c00yi) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onGuestInviteGuideIMReceived, size = ");
        List<ImageModel> list = c00yi.LIZ;
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C20441214yg.LIZIZ("GuestInviteViewModel", C2188811AlT.LIZIZ(sbLIZ));
        if (C925150aBN.LJJIJ(C930540aK4.LJIIIZ())) {
            C20441214yg.LIZIZ("GuestInviteViewModel", "unable to show guide because of multiLive permission Off");
            return;
        }
        C923330a8R c923330a8R = C923330a8R.LIZ;
        if (C923330a8R.LJFF()) {
            C20441214yg.LIZIZ("GuestInviteViewModel", "unable to show guide because of self is moderator");
        } else {
            setState(new AwS594S0100000_15(c00yi, 314));
        }
    }

    @Override // X.C002S
    public final void bg2(C0184003y c0184003y) {
        if (!C924790aAn.LIZLLL().LJFF() && !C924790aAn.LIZLLL().LJI()) {
            setState(new AwS594S0100000_15(c0184003y, 315));
        } else {
            C20441214yg.LIZIZ("GuestInviteViewModel", "drop GuestInviteIM, because online or waiting state");
        }
    }

    @Override // X.InterfaceC938950aXd
    public final void eB1(InterfaceC665370Q7z interfaceC665370Q7z) {
        IMessageManager iMessageManager;
        C20441214yg.LIZIZ("GuestInviteViewModel", "onDestroy");
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        C002R c002r = this.LLILLL;
        if (c002r != null) {
            C20441214yg.LIZIZ("GuestInviteMessageChannel", "destroy");
            try {
                DataChannel dataChannel2 = c002r.LIZ;
                if (dataChannel2 != null && (iMessageManager = (IMessageManager) dataChannel2.gg0(C776250Uch.class)) != null) {
                    iMessageManager.removeMessageListener((OnIMMessageListener) c002r.LIZJ);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJI("GuestInviteMessageChannel", e);
            }
        }
        this.LLILZ.LJ();
        vQ2(false);
    }

    @Override // X.InterfaceC938950aXd
    public final void iT0(InterfaceC665370Q7z interfaceC665370Q7z) {
        IMessageManager iMessageManager;
        C20441214yg.LIZIZ("GuestInviteViewModel", "onCreate");
        DataChannel dataChannel = this.LLILLJJLI;
        C002R c002r = new C002R(dataChannel, this);
        C20441214yg.LIZIZ("GuestInviteMessageChannel", "create");
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.addMessageListener(C001A.GUEST_INVITE_MESSAGE.getIntType(), (OnIMMessageListener) c002r.LIZJ);
            iMessageManager.addMessageListener(C001A.GUEST_INVITE_GUIDE_MESSAGE.getIntType(), (OnIMMessageListener) c002r.LIZJ);
        }
        this.LLILLL = c002r;
        DataChannel dataChannel2 = this.LLILLJJLI;
        if (dataChannel2 != null) {
            dataChannel2.CQ2(MultiGuestAnchorPanelSettingChangeAllTheTime.class, this, new AwS594S0100000_15(this, 3));
        }
    }

    public final void vQ2(boolean z) {
        Long l = this.LL;
        if (l != null) {
            long jLongValue = l.longValue();
            if (C464790IKn.LIZ.LIZIZ(jLongValue)) {
                C19322110iZ.LIZ(jLongValue);
                if (z) {
                    C782110Um9 c782110Um9 = new C782110Um9(((IHostAction) C915980Zwa.LIZIZ.getValue()).getTopActivity());
                    c782110Um9.LJIILLIIL = true;
                    c782110Um9.LJIILL = false;
                    c782110Um9.LJII(2131854217);
                    c782110Um9.LJIILIIL(2131843699, new InterfaceC743640TFa() { // from class: X.0aLx
                        @Override // X.InterfaceC743640TFa
                        public final void LIZ(LiveDialog liveDialog) {
                            liveDialog.dismiss();
                        }
                    });
                    C786410Ut5.E4(c782110Um9.LIZ());
                }
            }
        }
        this.LL = null;
    }

    public final void zQ2(C0184003y c0184003y) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setApplyPanelInfo = ");
        sbLIZ.append(c0184003y);
        C20441214yg.LIZIZ("GuestInviteViewModel", C2188811AlT.LIZIZ(sbLIZ));
        setState(new AwS594S0100000_15(c0184003y, 316));
    }

    public final void AQ2(User user, String str) {
        Bundle bundle;
        FragmentManager fragmentManager;
        float f;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLJFF = C925150aBN.LJFF();
        if (multiLiveAnchorPanelSettingsLJFF != null && multiLiveAnchorPanelSettingsLJFF.allowViewerReq == 3) {
            if (user != null) {
                bundle = new Bundle();
                bundle.putLong("show_invite_user_id", user.getId());
            } else {
                bundle = null;
            }
            DataChannel dataChannel = this.LLILLJJLI;
            if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
                MultiGuestAsGuestInviteSheetFragment.LLLFZ = str;
                SheetOptions sheetOptions = new SheetOptions();
                sheetOptions.LIZ(2, null);
                if (MultiGuestGuestInviteSheetOptSetting.isEnable() && !C930540aK4.LJJIJ() && !C917810ZzX.LJII()) {
                    f = 16.0f;
                } else {
                    f = 12.0f;
                }
                sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(f);
                this.LL = Long.valueOf(C19322110iZ.LIZLLL(fragmentManager, MultiGuestAsGuestInviteSheetFragment.class, "multi_guest_as_guest_invite_list_sheet", sheetOptions, bundle));
            }
        }
    }

    public final void wQ2(Function1<? super C00SI, Unit> function1, Function0<Unit> function0, Long l) {
        Room roomLJIIIZ = C930540aK4.LJIIIZ();
        if (roomLJIIIZ != null) {
            long id = roomLJIIIZ.getId();
            Long lLJIILLIIL = C930540aK4.LJIILLIIL();
            if (lLJIILLIIL != null) {
                long jLongValue = lLJIILLIIL.longValue();
                long jLJIILL = C921180a4y.LJIILL(C915980Zwa.LJIIIIZZ());
                GuestInvitePanelReq guestInvitePanelReq = new GuestInvitePanelReq();
                guestInvitePanelReq.roomId = id;
                guestInvitePanelReq.channelId = jLJIILL;
                guestInvitePanelReq.anchorId = jLongValue;
                List<Integer> listLJIILJJIL = C1697810uHb.LJIILJJIL(1);
                if (TTLiveGuestInvitePanelAddSuggestSetting.isEnable()) {
                    listLJIILJJIL.add(2);
                }
                guestInvitePanelReq.dataTypes = listLJIILJJIL;
                if (l != null) {
                    guestInvitePanelReq.inviteUserId = l.longValue();
                }
                C480460Ism.LIZ().getClass();
                C19487311Lz.LIZJ(C01NB.LIZ(((IGuestInviteAPI) C480460Ism.LIZLLL(IGuestInviteAPI.class)).guestInvitePanel(guestInvitePanelReq).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJIILL(new C516201zk(function1, 31)).LJIIL(new C516201zk(function0, 32))), this.LLILZ, null, null, 30);
            }
        }
    }

    public static void yQ2(GuestInviteViewModel guestInviteViewModel, C2217381BqS c2217381BqS, LifecycleOwner lifecycleOwner, Function1 function1) {
        C1770850wBP c1770850wBP = new C1770850wBP();
        c1770850wBP.LIZ(true);
        c1770850wBP.LIZ = true;
        AssemViewModel.selectSubscribe$default(guestInviteViewModel, c2217381BqS, c1770850wBP, lifecycleOwner, null, function1, 8, null);
    }

    public final void xQ2(int i, long j, int i2, Function1<? super Boolean, Unit> function1, Function0<Unit> function0) {
        Room roomLJIIIZ = C930540aK4.LJIIIZ();
        if (roomLJIIIZ != null) {
            long id = roomLJIIIZ.getId();
            long jLJIILL = C921180a4y.LJIILL(C915980Zwa.LJIIIIZZ());
            GuestInviteReq guestInviteReq = new GuestInviteReq();
            guestInviteReq.roomId = id;
            guestInviteReq.channelId = jLJIILL;
            guestInviteReq.scene = i2;
            guestInviteReq.inviteeUserId = j;
            guestInviteReq.onlineStatus = i;
            C480460Ism.LIZ().getClass();
            C19487311Lz.LIZJ(C01NB.LIZ(((IGuestInviteAPI) C480460Ism.LIZLLL(IGuestInviteAPI.class)).guestInvite(guestInviteReq).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJIILL(new C515801zg(function1, function0, 6)).LJIIL(new C516201zk(function0, 33))), this.LLILZ, null, null, 30);
            return;
        }
        if (function0 != null) {
            function0.invoke();
        }
    }
}
