package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.global.GlobalHashTagStickerModel;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11pL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19618911pL extends C0FFE<GlobalHashTagStickerModel> {
    public final Context LJIILIIL;
    public final GlobalHashTagStickerModel LJIILJJIL;
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
        return (GlobalHashTagStickerModel) ((C1664690tQB) this.LJIJ.getValue()).LIZ;
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
        GlobalHashTagStickerModel globalHashTagStickerModel;
        super.LJIIJJI(stickerModel);
        if ((stickerModel instanceof GlobalHashTagStickerModel) && (globalHashTagStickerModel = (GlobalHashTagStickerModel) stickerModel) != null) {
            ((C1664680tQA) this.LJIJ.getValue()).LIZLLL(new AwS608S0100000_29(globalHashTagStickerModel, 810), true);
            LJJJLIIL(((GlobalHashTagStickerModel) stickerModel).getBaseStickerModel());
        }
    }

    @Override // X.C0FFE
    public final void LJJJJIZL(BaseStickerModel baseStickerModel) {
        ((C1664680tQA) this.LJIJ.getValue()).LIZLLL(new AwS608S0100000_29(baseStickerModel, 809), true);
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void setVisible(boolean z) {
        ((C1664680tQA) this.LJIJ.getValue()).LIZLLL(new AwS41S0010000_29(z, 88), true);
    }

    public C19618911pL(Context context, GlobalHashTagStickerModel globalHashTagStickerModel, FrameLayout frameLayout, C0FFO c0ffo, LifecycleOwner lifecycleOwner, C390420FSm c390420FSm) {
        super(context, globalHashTagStickerModel.getBaseStickerModel(), c0ffo, lifecycleOwner, c390420FSm);
        this.LJIILIIL = context;
        this.LJIILJJIL = globalHashTagStickerModel;
        this.LJIILL = frameLayout;
        this.LJIILLIIL = c0ffo;
        this.LJIIZILJ = lifecycleOwner;
        this.LJIJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1069));
        this.LJIJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1070));
        LJJJJ(frameLayout);
    }
}
