package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.link.ApplyDialogUICtrlCmd;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.IMultiGuestDialogUiCtrlCmd;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinChannelParams;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: renamed from: X.0aBv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C925490aBv extends AbstractC945390ai1<InterfaceC919320a1y> implements InterfaceC924000a9W {
    public final C925550aC1 LL;
    public final C923650a8x LLILLJJLI;

    @Override // X.InterfaceC924000a9W
    public final IMultiGuestDialogUiCtrlCmd LJJIIJZLJL(long j, boolean z, boolean z2) {
        return null;
    }

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
            ApplyDialogUICtrlCmd applyDialogUICtrlCmd = new ApplyDialogUICtrlCmd(this, null);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("provideApplyDialogUICtrlCmd(audio only): ");
            sbLIZ.append(applyDialogUICtrlCmd);
            C944240agA.LIZLLL("qiuyihao", C2188811AlT.LIZIZ(sbLIZ));
            return applyDialogUICtrlCmd;
        }
        if (iLIZLLL == 3) {
            ApplyDialogUICtrlCmd applyDialogUICtrlCmd2 = new ApplyDialogUICtrlCmd(this, null);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("provideApplyDialogUICtrlCmd(video): ");
            sbLIZ2.append(applyDialogUICtrlCmd2);
            C944240agA.LIZLLL("qiuyihao", C2188811AlT.LIZIZ(sbLIZ2));
            return applyDialogUICtrlCmd2;
        }
        C944240agA.LIZLLL("qiuyihao", "link type unknown");
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

    public C925490aBv(C925550aC1 c925550aC1, C923650a8x c923650a8x) {
        this.LL = c925550aC1;
        this.LLILLJJLI = c923650a8x;
    }

    @Override // X.InterfaceC924170a9n
    public final void LJJIJIIJI(int i, String str) {
        C923650a8x c923650a8x = this.LLILLJJLI;
        if (c923650a8x != null) {
            c923650a8x.exitInteractInNormalWay("leave_source_user_click_cancel_in_preview", false, i);
        }
        C920360a3e.LIZ.getClass();
        C920360a3e.LJIIIIZZ = false;
    }
}
