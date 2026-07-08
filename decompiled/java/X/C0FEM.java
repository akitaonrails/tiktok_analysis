package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.MemeSongTextStickerModel;
import com.ss.android.vesdk.VESize;
import kotlin.Pair;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FEM, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FEM extends C0FFE<MemeSongTextStickerModel> {
    public final Context LJIILIIL;
    public final MemeSongTextStickerModel LJIILJJIL;
    public final FrameLayout LJIILL;
    public final C0FFO LJIILLIIL;
    public final LifecycleOwner LJIIZILJ;
    public final C390420FSm LJIJ;
    public final InterfaceC388760FMc LJIJI;
    public final C0FKI LJIJJ;
    public final InterfaceC386690FEd LJIJJLI;
    public final C01GW LJIL;
    public final C01GW LJJ;

    @Override // X.C0FTJ
    public final void setAlpha(float f) {
    }

    @Override // X.C0FFE
    public final View LJJJJJ() {
        return new LinearLayout(this.LJIILIIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0FTJ
    public final StickerModel LJLI() {
        return (MemeSongTextStickerModel) ((C1664690tQB) this.LJJ.getValue()).LIZ;
    }

    @Override // X.C0FFE
    public final C0FUE LJJJI() {
        final C1664680tQA<BaseStickerModel> c1664680tQALJJIJ = LJJIJ();
        final C390420FSm c390420FSm = this.LJIJ;
        return new C0FUE(c1664680tQALJJIJ, c390420FSm) { // from class: X.0FEN
            @Override // X.C0FUE
            public final boolean LJJJJ() {
                if (this.LLJJ.LJIILJJIL.getCanMove()) {
                    return super.LJJJJ();
                }
                return false;
            }
        };
    }

    @Override // X.C0FFE
    public final LifecycleOwner LJJIJIL() {
        return this.LJIIZILJ;
    }

    @Override // X.C0FFE
    public final C0FFO LJJIJLIJ() {
        return this.LJIILLIIL;
    }

    @Override // X.C0FFE
    public final void LJJJJIZL(BaseStickerModel baseStickerModel) {
        ((C1664680tQA) this.LJJ.getValue()).LIZLLL(new AwS584S0100000_5(baseStickerModel, 951), true);
    }

    public C0FEM(Context context, MemeSongTextStickerModel memeSongTextStickerModel, FrameLayout frameLayout, C0FFO c0ffo, LifecycleOwner lifecycleOwner, C390420FSm c390420FSm) {
        C0FK0 c0fk0LJIILLIIL;
        String str;
        super(context, memeSongTextStickerModel.getBaseStickerModel(), c0ffo, lifecycleOwner, c390420FSm);
        this.LJIILIIL = context;
        this.LJIILJJIL = memeSongTextStickerModel;
        this.LJIILL = frameLayout;
        this.LJIILLIIL = c0ffo;
        this.LJIIZILJ = lifecycleOwner;
        this.LJIJ = c390420FSm;
        InterfaceC388760FMc interfaceC388760FMc = (InterfaceC388760FMc) c390420FSm.LIZIZ(C13LE.LIZ(InterfaceC388760FMc.class));
        this.LJIJI = interfaceC388760FMc;
        this.LJIJJ = interfaceC388760FMc.LJJ();
        InterfaceC386690FEd interfaceC386690FEdLIZIZ = interfaceC388760FMc.LIZIZ();
        this.LJIJJLI = interfaceC386690FEdLIZIZ;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1175));
        this.LJIL = c01gwLIZIZ;
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1176));
        this.LJJ = c01gwLIZIZ2;
        C0FF8 c0ff8LIZ = interfaceC388760FMc.LIZ();
        this.LJIIIZ = new C0EN5(interfaceC386690FEdLIZIZ, (VESize) c01gwLIZIZ.getValue(), (C1664680tQA) c01gwLIZIZ2.getValue(), LJJIJ(), lifecycleOwner, frameLayout, C2097608Jq.LJI(new Pair("appLanguage", (c0ff8LIZ == null || (c0fk0LJIILLIIL = c0ff8LIZ.LJIILLIIL()) == null || (str = c0fk0LJIILLIIL.LJIJJLI) == null) ? "" : str)));
        LJJJIL();
        LJJJ();
    }
}
