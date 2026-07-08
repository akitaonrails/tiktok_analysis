package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.link.ApplyDialogUICtrlCmd;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.IMultiGuestDialogUiCtrlCmd;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.PreviewDialogUICtrlCmd;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinChannelParams;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: renamed from: X.0aBu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C925480aBu extends AbstractC945390ai1<InterfaceC919320a1y> implements InterfaceC924000a9W {
    public final InterfaceC924460aAG LL;
    public final AbstractC923750a97 LLILLJJLI;

    @Override // X.InterfaceC924000a9W
    public final void LJIJJ() {
        Room roomLIZ = this.LL.LIZ();
        BizJoinChannelParams bizJoinChannelParams = new BizJoinChannelParams(roomLIZ != null ? roomLIZ.getOwnerUserId() : 0L);
        InterfaceC954180awC interfaceC954180awCLLJLL = this.LL.LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            interfaceC954180awCLLJLL.LLJJJJJIL(new C925560aC2(bizJoinChannelParams));
        }
    }

    @Override // X.InterfaceC924000a9W
    public final ApplyDialogUICtrlCmd LJJIL(long j) {
        if (C925590aC5.LIZ(C924250a9v.LIZIZ(j))) {
            ApplyDialogUICtrlCmd applyDialogUICtrlCmd = new ApplyDialogUICtrlCmd(this, new PreviewDialogUICtrlCmd(false, null, null, false, false, false, false, 0, false, 8190));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("provideApplyDialogUICtrlCmd(audio only): ");
            sbLIZ.append(applyDialogUICtrlCmd);
            C944230ag9.LIZ("GameLinkApplyOptPresenter", C2188811AlT.LIZIZ(sbLIZ), false);
            return applyDialogUICtrlCmd;
        }
        C944230ag9.LIZ("GameLinkApplyOptPresenter", "link type unknown", false);
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

    public C925480aBu(InterfaceC924460aAG interfaceC924460aAG, AbstractC923750a97 abstractC923750a97) {
        this.LL = interfaceC924460aAG;
        this.LLILLJJLI = abstractC923750a97;
    }

    @Override // X.InterfaceC924170a9n
    public final void LJJIJIIJI(int i, String str) {
        AbstractC923750a97 abstractC923750a97 = this.LLILLJJLI;
        if (abstractC923750a97 != null) {
            AbstractC923750a97.exitInteractInNormalWay$default(abstractC923750a97, "leave_source_user_click_cancel_in_preview", false, i, 2, null);
        }
    }

    @Override // X.InterfaceC924000a9W
    public final IMultiGuestDialogUiCtrlCmd LJJIIJZLJL(long j, boolean z, boolean z2) {
        if (C925590aC5.LIZ(C924250a9v.LIZIZ(j))) {
            PreviewDialogUICtrlCmd previewDialogUICtrlCmd = new PreviewDialogUICtrlCmd(true, this, null, !z, false, z, false, 0, z2, 3366);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("provideApplyConfirmDialogUICtrlCmd(audio only): ");
            sbLIZ.append(previewDialogUICtrlCmd);
            C944230ag9.LIZ("GameLinkApplyOptPresenter", C2188811AlT.LIZIZ(sbLIZ), false);
            return previewDialogUICtrlCmd;
        }
        C944230ag9.LIZ("GameLinkApplyOptPresenter", "link type unknown", false);
        return null;
    }
}
