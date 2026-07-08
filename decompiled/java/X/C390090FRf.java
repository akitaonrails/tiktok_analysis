package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.aicaption.AICaptionTagStickerModel;
import kotlin.jvm.internal.AwS20S0010000_5;
import kotlin.jvm.internal.AwS3S0000001_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS93S0110000_5;

/* JADX INFO: renamed from: X.0FRf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C390090FRf extends C0FFE<AICaptionTagStickerModel> {
    public final Context LJIILIIL;
    public final AICaptionTagStickerModel LJIILJJIL;
    public final FrameLayout LJIILL;
    public final C0FFO LJIILLIIL;
    public final LifecycleOwner LJIIZILJ;
    public final C390420FSm LJIJ;
    public final C01GW LJIJI;
    public final C01GW LJIJJ;

    @Override // X.C0FFE
    public final View LJJJJJ() {
        return (View) this.LJIJJ.getValue();
    }

    public final C1664680tQA<AICaptionTagStickerModel> LJJJLL() {
        return (C1664680tQA) this.LJIJI.getValue();
    }

    @Override // X.C0FFE
    public final C0FUE LJJJI() {
        final C1664680tQA<BaseStickerModel> c1664680tQALJJIJ = LJJIJ();
        final C390420FSm c390420FSm = this.LJIJ;
        return new C0FUE(c1664680tQALJJIJ, c390420FSm) { // from class: X.0FRg
            @Override // X.C0FUE
            public final boolean LJJJJ() {
                return false;
            }
        };
    }

    @Override // X.C0FTJ
    public final StickerModel LJLI() {
        return LJJJLL().LIZ;
    }

    @Override // X.C0FFE
    public final LifecycleOwner LJJIJIL() {
        return this.LJIIZILJ;
    }

    @Override // X.C0FFE
    public final C0FFO LJJIJLIJ() {
        return this.LJIILLIIL;
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void LJIIJJI(StickerModel stickerModel) {
        AICaptionTagStickerModel aICaptionTagStickerModel;
        super.LJIIJJI(stickerModel);
        if ((stickerModel instanceof AICaptionTagStickerModel) && (aICaptionTagStickerModel = (AICaptionTagStickerModel) stickerModel) != null) {
            AICaptionTagStickerModel aICaptionTagStickerModel2 = (AICaptionTagStickerModel) stickerModel;
            ((C1884640z8w) this.LJIJJ.getValue()).LIZIZ(aICaptionTagStickerModel2.isEdited(), false);
            LJJJLL().LIZLLL(new AwS584S0100000_5(aICaptionTagStickerModel, 904), true);
            LJJJLIIL(aICaptionTagStickerModel2.getBaseStickerModel());
        }
    }

    @Override // X.C0FFE
    public final void LJJJJIZL(BaseStickerModel baseStickerModel) {
        LJJJLL().LIZLLL(new AwS584S0100000_5(baseStickerModel, 903), true);
    }

    @Override // X.C0FTJ
    public final void setAlpha(float f) {
        LJJJLL().LIZLLL(new AwS3S0000001_5(f, 20), true);
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void setVisible(boolean z) {
        LJJIJ().LIZLLL(new AwS20S0010000_5(z, 60), true);
        LJJJLL().LIZLLL(new AwS20S0010000_5(z, 61), true);
        LJJIJIIJIL().LJJJJL(new AwS93S0110000_5(this, z, 19));
    }

    public C390090FRf(Context context, AICaptionTagStickerModel aICaptionTagStickerModel, FrameLayout frameLayout, C0FFO c0ffo, LifecycleOwner lifecycleOwner, C390420FSm c390420FSm) {
        super(context, aICaptionTagStickerModel.getBaseStickerModel(), c0ffo, lifecycleOwner, c390420FSm);
        this.LJIILIIL = context;
        this.LJIILJJIL = aICaptionTagStickerModel;
        this.LJIILL = frameLayout;
        this.LJIILLIIL = c0ffo;
        this.LJIIZILJ = lifecycleOwner;
        this.LJIJ = c390420FSm;
        this.LJIJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1077));
        this.LJIJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1078));
        LJJJJ(frameLayout);
    }
}
