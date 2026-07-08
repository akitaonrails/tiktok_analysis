package X;

import com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0o1X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1457210o1X implements InterfaceC1459790o5h {
    public final AbstractC214814194y LL;
    public final VideoPublishEditModel LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1058));

    @Override // X.InterfaceC1459790o5h
    public final void LIZ() {
    }

    @Override // X.InterfaceC1459790o5h
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1459790o5h
    public final void LJFF() {
    }

    @Override // X.InterfaceC1459790o5h
    public final void LIZJ() {
        ((FTCEditToolbarViewModel) this.LLILLL.getValue()).Jj0(2, true);
    }

    @Override // X.InterfaceC1459790o5h
    public final void LIZLLL() {
        if (C1428520nHG.LJIIJJI(this.LLILLJJLI)) {
            ((FTCEditToolbarViewModel) this.LLILLL.getValue()).Jj0(6, true);
        }
    }

    @Override // X.InterfaceC1459790o5h
    public final void LJ() {
        ((FTCEditToolbarViewModel) this.LLILLL.getValue()).Jj0(1, true);
    }

    @Override // X.InterfaceC1459790o5h
    public final void LJI() {
        ((FTCEditToolbarViewModel) this.LLILLL.getValue()).Jj0(3, true);
    }

    public C1457210o1X(AbstractC214814194y abstractC214814194y, VideoPublishEditModel videoPublishEditModel) {
        this.LL = abstractC214814194y;
        this.LLILLJJLI = videoPublishEditModel;
    }
}
