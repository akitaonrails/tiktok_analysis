package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.emojislider.EmojiSliderStickerModel;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11mr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19603511mr extends C0FFE<EmojiSliderStickerModel> {
    public final Context LJIILIIL;
    public final EmojiSliderStickerModel LJIILJJIL;
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

    public final C1664680tQA<EmojiSliderStickerModel> LJJJLL() {
        return (C1664680tQA) this.LJIJI.getValue();
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
        EmojiSliderStickerModel emojiSliderStickerModel;
        super.LJIIJJI(stickerModel);
        if ((stickerModel instanceof EmojiSliderStickerModel) && (emojiSliderStickerModel = (EmojiSliderStickerModel) stickerModel) != null) {
            LJJJLL().LIZLLL(new AwS608S0100000_29(emojiSliderStickerModel, 259), true);
            LJJJLIIL(((EmojiSliderStickerModel) stickerModel).getBaseStickerModel());
        }
    }

    @Override // X.C0FFE
    public final void LJJJJIZL(BaseStickerModel baseStickerModel) {
        LJJJLL().LIZLLL(new AwS608S0100000_29(baseStickerModel, 258), true);
    }

    @Override // X.C0FTJ
    public final void setAlpha(float f) {
        EmojiSliderStickerModel emojiSliderStickerModel = LJJJLL().LIZ;
        LJIIJJI(emojiSliderStickerModel.copy(BaseStickerModel.copy$default(LJJIJ().LIZ, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, f, null, null, null, false, Integer.MAX_VALUE, 15, null), emojiSliderStickerModel.clickable, emojiSliderStickerModel.visible, emojiSliderStickerModel.questionText, emojiSliderStickerModel.emojiContent, emojiSliderStickerModel.voteVal, emojiSliderStickerModel.answerCount, emojiSliderStickerModel.voteAverage, emojiSliderStickerModel.androidVer, emojiSliderStickerModel.iosVer));
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void setVisible(boolean z) {
        LJJIJ().LIZLLL(new AwS41S0010000_29(z, 24), true);
        LJJJLL().LIZLLL(new AwS41S0010000_29(z, 25), true);
    }

    public C19603511mr(Context context, EmojiSliderStickerModel emojiSliderStickerModel, FrameLayout frameLayout, C0FFO c0ffo, LifecycleOwner lifecycleOwner, C390420FSm c390420FSm) {
        super(context, emojiSliderStickerModel.getBaseStickerModel(), c0ffo, lifecycleOwner, c390420FSm);
        this.LJIILIIL = context;
        this.LJIILJJIL = emojiSliderStickerModel;
        this.LJIILL = frameLayout;
        this.LJIILLIIL = c0ffo;
        this.LJIIZILJ = lifecycleOwner;
        this.LJIJ = c390420FSm;
        this.LJIJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 294));
        this.LJIJJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 295));
        LJJJJ(frameLayout);
    }
}
