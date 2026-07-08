package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.ApplyDialogUICtrlCmd;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.IMultiGuestDialogUiCtrlCmd;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.PreviewDialogUICtrlCmd;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinChannelParams;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: renamed from: X.0aBw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C925500aBw extends AbstractC945390ai1<InterfaceC919320a1y> implements InterfaceC924000a9W {
    public final C925550aC1 LL;
    public final MultiGuestV3GuestPresenter LLILLJJLI;

    @Override // X.InterfaceC924000a9W
    public final void LJIJJ() {
        Room room;
        C925550aC1 c925550aC1 = this.LL;
        BizJoinChannelParams bizJoinChannelParams = new BizJoinChannelParams((c925550aC1 == null || (room = c925550aC1.LIZ) == null) ? 0L : room.getOwnerUserId());
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            interfaceC954180awCLLJLL.LLJJJJJIL(new C925560aC2(bizJoinChannelParams));
        }
    }

    @Override // X.InterfaceC924000a9W
    public final ApplyDialogUICtrlCmd LJJIL(long j) {
        int iLIZLLL = C916490ZxP.LIZLLL(j);
        if (C925590aC5.LIZ(iLIZLLL)) {
            return new ApplyDialogUICtrlCmd(this, new PreviewDialogUICtrlCmd(false, null, null, false, false, false, false, 0, false, 8190));
        }
        if (iLIZLLL == 3) {
            return new ApplyDialogUICtrlCmd(this, new PreviewDialogUICtrlCmd(false, this, null, false, false, false, false, 0, false, 8174));
        }
        return null;
    }

    @Override // X.AbstractC945390ai1, X.C0JSV
    public final void attachView(C0JSP c0jsp) {
        super.attachView((InterfaceC919320a1y) c0jsp);
    }

    @Override // X.AbstractC945390ai1
    public final void attachView(InterfaceC919320a1y interfaceC919320a1y) {
        super.attachView(interfaceC919320a1y);
    }

    public C925500aBw(C925550aC1 c925550aC1, MultiGuestV3GuestPresenter multiGuestV3GuestPresenter) {
        this.LL = c925550aC1;
        this.LLILLJJLI = multiGuestV3GuestPresenter;
    }

    @Override // X.InterfaceC924170a9n
    public final void LJJIJIIJI(int i, String str) {
        MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = this.LLILLJJLI;
        if (multiGuestV3GuestPresenter != null) {
            AbstractC923750a97.exitInteractInNormalWay$default(multiGuestV3GuestPresenter, "leave_source_user_click_cancel_in_preview", false, i, 2, null);
        }
        C920360a3e.LIZ.getClass();
        C920360a3e.LJIIIIZZ = false;
    }

    @Override // X.InterfaceC924000a9W
    public final IMultiGuestDialogUiCtrlCmd LJJIIJZLJL(long j, boolean z, boolean z2) {
        int iLIZLLL = C916490ZxP.LIZLLL(j);
        if (C925590aC5.LIZ(iLIZLLL)) {
            return new PreviewDialogUICtrlCmd(true, this, null, !z, false, z, false, 0, z2, 3366);
        }
        if (iLIZLLL == 3) {
            return new PreviewDialogUICtrlCmd(true, this, null, !z, false, z, false, 0, z2, 3366);
        }
        return null;
    }
}
