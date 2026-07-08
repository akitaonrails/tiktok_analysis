package X;

import android.content.Context;
import com.bytedance.android.live.liveinteract.api.InteractStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestV3GuestDismissReviewDialogEvent;
import com.bytedance.android.live.liveinteract.api.ReservationJoinSucceedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.BeInvitedDialogUICtrlCmd;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.PreviewDialogUICtrlCmd;
import com.bytedance.android.live.liveinteract.multiguestv3.util.MultiGuestDialogManager;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS203S0000000_15;

/* JADX INFO: renamed from: X.0aBt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C925470aBt extends AbstractC945390ai1<InterfaceC919320a1y> implements InterfaceC923960a9S {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final C925550aC1 LL;
    public final MultiGuestV3GuestPresenter LLILLJJLI;
    public final C01GW LLILLL;
    public final C304201Fw LLILZ;
    public C925310aBd LLILZIL;
    public final C925540aC0 LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C925470aBt.class, "multiGuestDataHolder", "getMultiGuestDataHolder()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/common/MultiGuestDataHolder;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public C925470aBt() {
        this(null, null);
    }

    @Override // X.InterfaceC923960a9S
    public final BeInvitedDialogUICtrlCmd LJII() {
        int iLIZLLL = C916490ZxP.LIZLLL(0L);
        return C925590aC5.LIZ(iLIZLLL) ? new BeInvitedDialogUICtrlCmd(this) : iLIZLLL == 3 ? new BeInvitedDialogUICtrlCmd(this) : new BeInvitedDialogUICtrlCmd(this);
    }

    @Override // X.InterfaceC923960a9S
    public final void LJJIII() {
        C925310aBd c925310aBd;
        DataChannel dataChannel;
        C20441214yg.LIZIZ("MultiGuestV3BeInviteOptPresenter", "autoReplyWhenAnchorAcceptReservation");
        if (!C949950apN.LIZ()) {
            C915980Zwa.LJII().jn1();
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        int iLIZIZ = (interfaceC954180awCLLJLL != null ? interfaceC954180awCLLJLL.LIZIZ() : 0) - 1;
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        if (iLIZIZ >= C927600aFK.LJIIL()) {
            C307001Gy.LIZ().getClass();
            if (C927600aFK.LJIIL() != 0) {
                C766270U4b.LIZLLL(2131842763);
                LJJIJIIJI(10049, "leave_with_reply_reserve_accept_failed");
                C924630aAX.LJJIZ(false);
                return;
            }
        }
        if (!C917810ZzX.LJIIIIZZ() && (dataChannel = this.dataChannel) != null) {
            dataChannel.FQ2(ReservationJoinSucceedEvent.class);
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null || (c925310aBd = this.LLILZIL) == null) {
            return;
        }
        c925310aBd.LIZIZ(room.getId(), room.getOwnerUserId(), 0, new InterfaceC925460aBs() { // from class: X.0aBy
            @Override // X.InterfaceC925460aBs
            public final void LIZ() {
                C925150aBN.LJIIJJI((Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class), this.LIZ.dataChannel, true);
                C304201Fw c304201Fw = this.LIZ.LLILZ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C925470aBt.LLIZ;
                MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) c304201Fw.LIZ();
                if (multiGuestDataHolder != null) {
                    multiGuestDataHolder.LJJIIJZLJL("reply");
                }
                DataChannel dataChannel2 = this.LIZ.dataChannel;
                if (dataChannel2 != null) {
                    C924400aAA c924400aAA = new C924400aAA(1);
                    c924400aAA.LIZIZ = EnumC926600aDi.GO_LIVE;
                    dataChannel2.LC0(InteractStateChangeEvent.class, c924400aAA);
                }
            }
        }, room.getOwnerUserId(), EnumC925350aBh.NORMAL, null, false, 0, 0L);
    }

    @Override // X.InterfaceC923960a9S
    public final void LJJJJJ() {
        C925310aBd c925310aBd;
        C20441214yg.LJIIIZ("MultiGuestV3BeInviteOptPresenter", "autoJoinWhenEnterMicRoom");
        MultiGuestDialogManager multiGuestDialogManagerLIZ = C922410a6x.LIZ();
        if (multiGuestDialogManagerLIZ != null) {
            multiGuestDialogManagerLIZ.wQ2();
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(MultiGuestV3GuestDismissReviewDialogEvent.class, Unit.LIZ);
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null || (c925310aBd = this.LLILZIL) == null) {
            return;
        }
        c925310aBd.LIZIZ(room.getId(), room.getOwnerUserId(), 0, new InterfaceC925460aBs() { // from class: X.0aBx
            @Override // X.InterfaceC925460aBs
            public final void LIZ() {
                C925150aBN.LJIIJJI((Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class), this.LIZ.dataChannel, true);
                C304201Fw c304201Fw = this.LIZ.LLILZ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C925470aBt.LLIZ;
                MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) c304201Fw.LIZ();
                if (multiGuestDataHolder != null) {
                    multiGuestDataHolder.LJJIIJZLJL("reply");
                }
                DataChannel dataChannel2 = this.LIZ.dataChannel;
                if (dataChannel2 != null) {
                    C924400aAA c924400aAA = new C924400aAA(1);
                    c924400aAA.LIZIZ = EnumC926600aDi.GO_LIVE;
                    dataChannel2.LC0(InteractStateChangeEvent.class, c924400aAA);
                }
            }
        }, room.getOwnerUserId(), EnumC925350aBh.LINE_UP_IN_MICROOM, null, false, 0, 0L);
    }

    @Override // X.InterfaceC923960a9S
    public final void randomMatchJoinDirect() {
        C925310aBd c925310aBd;
        C20441214yg.LJIIIZ("MultiGuestV3BeInviteOptPresenter", "randomMatchJoinDirect");
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null || (c925310aBd = this.LLILZIL) == null) {
            return;
        }
        c925310aBd.LIZIZ(room.getId(), room.getOwnerUserId(), 0, new InterfaceC925460aBs() { // from class: X.0aBz
            @Override // X.InterfaceC925460aBs
            public final void LIZ() {
                C925150aBN.LJIIJJI((Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class), this.LIZ.dataChannel, true);
                C304201Fw c304201Fw = this.LIZ.LLILZ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C925470aBt.LLIZ;
                MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) c304201Fw.LIZ();
                if (multiGuestDataHolder != null) {
                    multiGuestDataHolder.LJJIIJZLJL("reply");
                }
                DataChannel dataChannel = this.LIZ.dataChannel;
                if (dataChannel != null) {
                    C924400aAA c924400aAA = new C924400aAA(1);
                    c924400aAA.LIZIZ = EnumC926600aDi.GO_LIVE;
                    dataChannel.LC0(InteractStateChangeEvent.class, c924400aAA);
                }
            }
        }, room.getOwnerUserId(), EnumC925350aBh.RANDOM_MATCH_JOIN_DIRECT, null, false, 0, 0L);
    }

    @Override // X.AbstractC945390ai1, X.C0JSV
    public final void detachView() {
        super.detachView();
        ((C11NJ) this.LLILLL.getValue()).LJ();
    }

    @Override // X.AbstractC945390ai1
    public final void attachView(InterfaceC919320a1y interfaceC919320a1y) {
        super.attachView(interfaceC919320a1y);
        C925550aC1 c925550aC1 = this.LL;
        if (c925550aC1 != null && c925550aC1.LIZ != null && c925550aC1.LIZJ != null) {
            this.LLILZIL = new C925310aBd(this.LLILZLL, this.LL.LIZJ);
        }
    }

    @Override // X.AbstractC945390ai1, X.C0JSV
    public final /* bridge */ /* synthetic */ void attachView(C0JSP c0jsp) {
        attachView((InterfaceC919320a1y) c0jsp);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0aC0] */
    public C925470aBt(C925550aC1 c925550aC1, MultiGuestV3GuestPresenter multiGuestV3GuestPresenter) {
        this.LL = c925550aC1;
        this.LLILLJJLI = multiGuestV3GuestPresenter;
        this.LLILLL = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(375));
        this.LLILZ = new C304201Fw("MULTI_GUEST_DATA_HOLDER");
        this.LLILZLL = new InterfaceC925420aBo() { // from class: X.0aC0
            @Override // X.InterfaceC925420aBo
            public final boolean iN() {
                return true;
            }

            @Override // X.InterfaceC925420aBo
            public final void jv() {
            }

            @Override // X.InterfaceC925420aBo
            public final void JE() {
                Room room;
                C925550aC1 c925550aC12 = this.LL.LL;
                DataChannel dataChannel = null;
                if (c925550aC12 != null) {
                    room = c925550aC12.LIZ;
                    dataChannel = c925550aC12.LIZJ;
                } else {
                    room = null;
                }
                C925150aBN.LJIIJJI(room, dataChannel, true);
            }

            @Override // X.InterfaceC925420aBo
            public final void Jk(boolean z) {
                C925550aC1 c925550aC12;
                DataChannel dataChannel;
                if (z && (c925550aC12 = this.LL.LL) != null && (dataChannel = c925550aC12.LIZJ) != null) {
                    C925150aBN.LJIIJJI(c925550aC12.LIZ, dataChannel, false);
                }
            }

            @Override // X.InterfaceC925420aBo
            public final void f4(Throwable th) {
                Context context;
                C925550aC1 c925550aC12 = this.LL.LL;
                if (c925550aC12 != null) {
                    context = c925550aC12.LIZIZ;
                } else {
                    context = null;
                }
                C501540Jlg.LIZLLL(context, th, 2131853452);
            }
        };
    }

    @Override // X.InterfaceC924170a9n
    public final void LJJIJIIJI(int i, String str) {
        MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = this.LLILLJJLI;
        if (multiGuestV3GuestPresenter != null) {
            AbstractC923750a97.exitInteractInNormalWay$default(multiGuestV3GuestPresenter, str, false, i, 2, null);
        }
    }

    @Override // X.InterfaceC923960a9S
    public final PreviewDialogUICtrlCmd LJJIJIL(long j, boolean z) {
        int iLIZLLL = C916490ZxP.LIZLLL(j);
        if (C925590aC5.LIZ(iLIZLLL)) {
            PreviewDialogUICtrlCmd.Companion.getClass();
            return new PreviewDialogUICtrlCmd(true, null, this, false, !z, false, z, -1, false, 4758);
        }
        if (iLIZLLL == 3) {
            PreviewDialogUICtrlCmd.Companion.getClass();
            return new PreviewDialogUICtrlCmd(true, null, this, false, !z, false, z, -1, false, 4758);
        }
        return null;
    }
}
