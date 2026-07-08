package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.embed.EmbedHashTagStickerModel;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11pI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19618611pI extends C0FFE<EmbedHashTagStickerModel> {
    public final Context LJIILIIL;
    public final EmbedHashTagStickerModel LJIILJJIL;
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
        return (EmbedHashTagStickerModel) ((C1664690tQB) this.LJIJ.getValue()).LIZ;
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
        EmbedHashTagStickerModel embedHashTagStickerModel;
        super.LJIIJJI(stickerModel);
        if ((stickerModel instanceof EmbedHashTagStickerModel) && (embedHashTagStickerModel = (EmbedHashTagStickerModel) stickerModel) != null) {
            ((C1664680tQA) this.LJIJ.getValue()).LIZLLL(new AwS608S0100000_29(embedHashTagStickerModel, 789), true);
            LJJJLIIL(((EmbedHashTagStickerModel) stickerModel).getBaseStickerModel());
        }
    }

    @Override // X.C0FFE
    public final void LJJJJIZL(BaseStickerModel baseStickerModel) {
        ((C1664680tQA) this.LJIJ.getValue()).LIZLLL(new AwS608S0100000_29(baseStickerModel, 788), true);
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void setVisible(boolean z) {
        ((C1664680tQA) this.LJIJ.getValue()).LIZLLL(new AwS41S0010000_29(z, 87), true);
    }

    public C19618611pI(Context context, EmbedHashTagStickerModel embedHashTagStickerModel, FrameLayout frameLayout, C0FFO c0ffo, LifecycleOwner lifecycleOwner, C390420FSm c390420FSm) {
        super(context, embedHashTagStickerModel.getBaseStickerModel(), c0ffo, lifecycleOwner, c390420FSm);
        this.LJIILIIL = context;
        this.LJIILJJIL = embedHashTagStickerModel;
        this.LJIILL = frameLayout;
        this.LJIILLIIL = c0ffo;
        this.LJIIZILJ = lifecycleOwner;
        this.LJIJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1053));
        this.LJIJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1054));
        LJJJJ(frameLayout);
    }
}
