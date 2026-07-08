package X;

import com.ss.android.ugc.aweme.canvas.guide.EditPhotoCanvasPromptViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0o5L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1459570o5L implements InterfaceC1459790o5h, Function0<C1DRG> {
    public final AbstractC214814194y LL;
    public final VideoPublishEditModel LLILLJJLI;
    public final Function0<C1DRG> LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 427));

    @Override // X.InterfaceC1459790o5h
    public final void LIZLLL() {
        InterfaceC1460000o62 interfaceC1460000o62LJII;
        if (!C1428520nHG.LJIIJJI(this.LLILLJJLI) || (interfaceC1460000o62LJII = LJII()) == null) {
            return;
        }
        interfaceC1460000o62LJII.Jj0(6, true);
    }

    @Override // X.InterfaceC1459790o5h
    public final void LJFF() {
        ((EditPhotoCanvasPromptViewModel) C1659630tI1.LJIIIIZZ(this.LL, null, null, 6).get(EditPhotoCanvasPromptViewModel.class)).LL.postValue(Boolean.TRUE);
        C1459710o5Z.LIZ("canvas_gesture");
    }

    public final InterfaceC1460000o62 LJII() {
        return (InterfaceC1460000o62) this.LLILZ.getValue();
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1DRG invoke() {
        return this.LLILLL.invoke();
    }

    @Override // X.InterfaceC1459790o5h
    public final void LIZ() {
        InterfaceC1460000o62 interfaceC1460000o62LJII = LJII();
        if (interfaceC1460000o62LJII != null) {
            interfaceC1460000o62LJII.Jj0(4, true);
        }
    }

    @Override // X.InterfaceC1459790o5h
    public final void LIZIZ() {
        InterfaceC1460000o62 interfaceC1460000o62LJII = LJII();
        if (interfaceC1460000o62LJII != null) {
            interfaceC1460000o62LJII.Jj0(15, true);
        }
    }

    @Override // X.InterfaceC1459790o5h
    public final void LIZJ() {
        InterfaceC1460000o62 interfaceC1460000o62LJII = LJII();
        if (interfaceC1460000o62LJII != null) {
            interfaceC1460000o62LJII.Jj0(2, true);
        }
    }

    @Override // X.InterfaceC1459790o5h
    public final void LJ() {
        InterfaceC1460000o62 interfaceC1460000o62LJII;
        C1459620o5Q c1459620o5QOO;
        C1459620o5Q c1459620o5QOO2;
        if (!C0MT6.LIZ()) {
            InterfaceC1460000o62 interfaceC1460000o62LJII2 = LJII();
            if (interfaceC1460000o62LJII2 != null) {
                interfaceC1460000o62LJII2.Jj0(1, true);
                return;
            }
            return;
        }
        InterfaceC1460000o62 interfaceC1460000o62LJII3 = LJII();
        if (interfaceC1460000o62LJII3 != null && (c1459620o5QOO2 = interfaceC1460000o62LJII3.OO()) != null) {
            c1459620o5QOO2.LIZ = true;
        }
        if (C1403010mc7.LIZ.getMusicService().Qk() || (interfaceC1460000o62LJII = LJII()) == null || (c1459620o5QOO = interfaceC1460000o62LJII.OO()) == null || !c1459620o5QOO.LIZJ) {
            InterfaceC1460000o62 interfaceC1460000o62LJII4 = LJII();
            if (interfaceC1460000o62LJII4 != null) {
                interfaceC1460000o62LJII4.Jj0(1, true);
                return;
            }
            return;
        }
        InterfaceC1460000o62 interfaceC1460000o62LJII5 = LJII();
        if (interfaceC1460000o62LJII5 != null) {
            interfaceC1460000o62LJII5.wv(1, true);
        }
    }

    @Override // X.InterfaceC1459790o5h
    public final void LJI() {
        InterfaceC1460000o62 interfaceC1460000o62LJII = LJII();
        if (interfaceC1460000o62LJII != null) {
            interfaceC1460000o62LJII.Jj0(3, true);
        }
    }

    public C1459570o5L(AbstractC214814194y abstractC214814194y, VideoPublishEditModel videoPublishEditModel, Function0<C1DRG> function0) {
        this.LL = abstractC214814194y;
        this.LLILLJJLI = videoPublishEditModel;
        this.LLILLL = function0;
    }
}
