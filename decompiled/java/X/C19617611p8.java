package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.liveshare.LiveShareStickerModel;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11p8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19617611p8 extends C0FFE<LiveShareStickerModel> {
    public final Context LJIILIIL;
    public final LiveShareStickerModel LJIILJJIL;
    public final FrameLayout LJIILL;
    public final C0FFO LJIILLIIL;
    public final LifecycleOwner LJIIZILJ;
    public final C01GW LJIJ;
    public final C01GW LJIJI;

    @Override // X.C0FTJ
    public final void setAlpha(float f) {
    }

    @Override // X.C0FFE
    public final View LJJJJJ() {
        return (View) this.LJIJI.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0FTJ
    public final StickerModel LJLI() {
        return (LiveShareStickerModel) ((C1664690tQB) this.LJIJ.getValue()).LIZ;
    }

    @Override // X.C0FFE
    public final C0FUE LJJJI() {
        final C1664680tQA<BaseStickerModel> c1664680tQALJJIJ = LJJIJ();
        return new C0FUE(c1664680tQALJJIJ) { // from class: X.11p9
            @Override // X.C0FUE
            public final boolean LJJJJ() {
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

    @Override // X.C0FFE, X.C0FTJ
    public final void LJIIJJI(StickerModel stickerModel) {
        LiveShareStickerModel liveShareStickerModel;
        super.LJIIJJI(stickerModel);
        if ((stickerModel instanceof LiveShareStickerModel) && (liveShareStickerModel = (LiveShareStickerModel) stickerModel) != null) {
            ((C1664680tQA) this.LJIJ.getValue()).LIZLLL(new AwS608S0100000_29(liveShareStickerModel, 899), true);
            LJJJLIIL(((LiveShareStickerModel) stickerModel).getBaseStickerModel());
        }
    }

    @Override // X.C0FFE
    public final void LJJJJIZL(BaseStickerModel baseStickerModel) {
        ((C1664680tQA) this.LJIJ.getValue()).LIZLLL(new AwS608S0100000_29(baseStickerModel, 898), true);
    }

    public C19617611p8(Context context, LiveShareStickerModel liveShareStickerModel, FrameLayout frameLayout, C0FFO c0ffo, LifecycleOwner lifecycleOwner, C390420FSm c390420FSm) {
        super(context, liveShareStickerModel.getBaseStickerModel(), c0ffo, lifecycleOwner, c390420FSm);
        this.LJIILIIL = context;
        this.LJIILJJIL = liveShareStickerModel;
        this.LJIILL = frameLayout;
        this.LJIILLIIL = c0ffo;
        this.LJIIZILJ = lifecycleOwner;
        this.LJIJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1143));
        this.LJIJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1144));
        LJJJJ(frameLayout);
    }
}
