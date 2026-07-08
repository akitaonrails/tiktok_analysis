package X;

import android.content.Context;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.BeInvitedDialogUICtrlCmd;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.PreviewDialogUICtrlCmd;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AFwS203S0000000_15;

/* JADX INFO: renamed from: X.0aAE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C924440aAE extends AbstractC945390ai1<InterfaceC919320a1y> implements InterfaceC923960a9S {
    public final Context LL;
    public final InterfaceC924460aAG LLILLJJLI;
    public final AbstractC923750a97 LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(283));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(284));
    public final C924450aAF LLILZLL = new InterfaceC925420aBo() { // from class: X.0aAF
        @Override // X.InterfaceC925420aBo
        public final boolean iN() {
            return true;
        }

        @Override // X.InterfaceC925420aBo
        public final void jv() {
        }

        @Override // X.InterfaceC925420aBo
        public final void JE() {
            C925050aBD.LJI(this.LL.LLILLJJLI.LIZ(), this.LL.LLILLJJLI.getDataChannel(), true);
        }

        @Override // X.InterfaceC925420aBo
        public final void Jk(boolean z) {
            DataChannel dataChannel;
            if (z && (dataChannel = this.LL.LLILLJJLI.getDataChannel()) != null) {
                C925050aBD.LJI(this.LL.LLILLJJLI.LIZ(), dataChannel, false);
            }
        }

        @Override // X.InterfaceC925420aBo
        public final void f4(Throwable th) {
            C501540Jlg.LIZLLL(this.LL.LL, th, 2131853452);
        }
    };

    @Override // X.InterfaceC923960a9S
    public final void LJJIII() {
    }

    @Override // X.InterfaceC923960a9S
    public final void LJJJJJ() {
    }

    @Override // X.InterfaceC923960a9S
    public final void randomMatchJoinDirect() {
    }

    @Override // X.InterfaceC923960a9S
    public final BeInvitedDialogUICtrlCmd LJII() {
        int iLIZIZ = C924250a9v.LIZIZ(0L);
        if (iLIZIZ == 2) {
            BeInvitedDialogUICtrlCmd beInvitedDialogUICtrlCmd = new BeInvitedDialogUICtrlCmd(this);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("provideBeInvitedUICtrlCmd(audio only): link permission ");
            sbLIZ.append(0L);
            sbLIZ.append(' ');
            sbLIZ.append(iLIZIZ);
            sbLIZ.append(' ');
            sbLIZ.append(beInvitedDialogUICtrlCmd);
            C944230ag9.LIZ("GameLinkBeInviteOptPresenter", C2188811AlT.LIZIZ(sbLIZ), false);
            return beInvitedDialogUICtrlCmd;
        }
        BeInvitedDialogUICtrlCmd beInvitedDialogUICtrlCmd2 = new BeInvitedDialogUICtrlCmd(this);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("provideBeInvitedUICtrlCmd: link permission ");
        sbLIZ2.append(0L);
        sbLIZ2.append(' ');
        sbLIZ2.append(iLIZIZ);
        sbLIZ2.append(' ');
        sbLIZ2.append(beInvitedDialogUICtrlCmd2);
        C944230ag9.LIZ("GameLinkBeInviteOptPresenter", C2188811AlT.LIZIZ(sbLIZ2), false);
        return beInvitedDialogUICtrlCmd2;
    }

    @Override // X.AbstractC945390ai1, X.C0JSV
    public final void detachView() {
        super.detachView();
        ((C11NJ) this.LLILZ.getValue()).LJ();
    }

    @Override // X.AbstractC945390ai1
    public final void attachView(InterfaceC919320a1y interfaceC919320a1y) {
        DataChannel dataChannel;
        super.attachView(interfaceC919320a1y);
        if (this.LLILLJJLI.LIZ() == null || (dataChannel = this.LLILLJJLI.getDataChannel()) == null) {
            return;
        }
        new C925290aBb(this.LLILZLL, this.LLILLJJLI, dataChannel);
    }

    @Override // X.AbstractC945390ai1, X.C0JSV
    public final /* bridge */ /* synthetic */ void attachView(C0JSP c0jsp) {
        attachView((InterfaceC919320a1y) c0jsp);
    }

    @Override // X.InterfaceC924170a9n
    public final void LJJIJIIJI(int i, String str) {
        AbstractC923750a97 abstractC923750a97 = this.LLILLL;
        if (abstractC923750a97 != null) {
            AbstractC923750a97.exitInteractInNormalWay$default(abstractC923750a97, "leave_source_user_click_cancel_in_preview", false, i, 2, null);
        }
    }

    @Override // X.InterfaceC923960a9S
    public final PreviewDialogUICtrlCmd LJJIJIL(long j, boolean z) {
        int iLIZIZ = C924250a9v.LIZIZ(j);
        if (iLIZIZ == 2) {
            C924480aAI c924480aAI = PreviewDialogUICtrlCmd.Companion;
            this.LLILLJJLI.LIZ();
            c924480aAI.getClass();
            PreviewDialogUICtrlCmd previewDialogUICtrlCmd = new PreviewDialogUICtrlCmd(true, null, this, false, !z, false, z, -1, false, 4758);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("provideBeInvitedPreviewDialogUICtrlCmd(audio only): link permission ");
            sbLIZ.append(j);
            sbLIZ.append(' ');
            sbLIZ.append(iLIZIZ);
            sbLIZ.append(' ');
            sbLIZ.append(previewDialogUICtrlCmd);
            C944230ag9.LIZ("GameLinkBeInviteOptPresenter", C2188811AlT.LIZIZ(sbLIZ), false);
            return previewDialogUICtrlCmd;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0aAF] */
    public C924440aAE(Context context, InterfaceC924460aAG interfaceC924460aAG, AbstractC923750a97 abstractC923750a97) {
        this.LL = context;
        this.LLILLJJLI = interfaceC924460aAG;
        this.LLILLL = abstractC923750a97;
    }
}
