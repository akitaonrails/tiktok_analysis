package X;

import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FSM, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FSM implements C0FSC {
    public final EnumC1466150oFx LIZ;
    public final Function1<StickerModel, Unit> LIZIZ;
    public final C0FSC LIZJ;
    public final C0FTJ<StickerModel> LIZLLL;

    @Override // X.C0FSC
    public final void LIZJ() {
    }

    @Override // X.C0FSC
    public final void LJ() {
    }

    @Override // X.C0FSC
    public final void LJFF() {
    }

    @Override // X.C0FSC
    public final void LIZIZ(StickerModel stickerModel) {
        C0FSC c0fsc = this.LIZJ;
        if (c0fsc != null) {
            c0fsc.LIZIZ(stickerModel);
        }
    }

    @Override // X.C0FSC
    public final void LIZLLL(boolean z) {
        C0FTJ<StickerModel> c0ftj = this.LIZLLL;
        if (c0ftj != null) {
            if (c0ftj.LJIJI()) {
                c0ftj.LJIJ(c0ftj.LJJIIJZLJL(), false);
            }
            c0ftj.setVisible(false);
        }
    }

    @Override // X.C0FSC
    public final void LIZ(StickerModel stickerModel, boolean z) {
        if (stickerModel.getStickerType() != this.LIZ) {
            return;
        }
        C0FSC c0fsc = this.LIZJ;
        if (c0fsc != null) {
            c0fsc.LIZ(stickerModel, z);
        }
        this.LIZIZ.invoke(stickerModel);
        C0FTJ<StickerModel> c0ftj = this.LIZLLL;
        if (c0ftj != null && c0ftj.LJIJI()) {
            c0ftj.LJIJ(c0ftj.LJJIIJZLJL(), true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0FSM(EnumC1466150oFx enumC1466150oFx, Function1<? super StickerModel, Unit> function1, C0FSC c0fsc, C0FTJ<? extends StickerModel> c0ftj) {
        this.LIZ = enumC1466150oFx;
        this.LIZIZ = function1;
        this.LIZJ = c0fsc;
        this.LIZLLL = c0ftj;
    }
}
