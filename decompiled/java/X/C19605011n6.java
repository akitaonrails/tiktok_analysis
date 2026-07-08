package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.interactiveemoji.InteractiveEmojiStickerModel;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11n6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19605011n6 extends C0FFE<InteractiveEmojiStickerModel> {
    public final Context LJIILIIL;
    public final InteractiveEmojiStickerModel LJIILJJIL;
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

    public final C1664680tQA<InteractiveEmojiStickerModel> LJJJLL() {
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
        InteractiveEmojiStickerModel interactiveEmojiStickerModel;
        super.LJIIJJI(stickerModel);
        if ((stickerModel instanceof InteractiveEmojiStickerModel) && (interactiveEmojiStickerModel = (InteractiveEmojiStickerModel) stickerModel) != null) {
            LJJJLL().LIZLLL(new AwS608S0100000_29(interactiveEmojiStickerModel, 264), true);
            LJJJLIIL(((InteractiveEmojiStickerModel) stickerModel).getBaseStickerModel());
        }
    }

    @Override // X.C0FFE
    public final void LJJJJIZL(BaseStickerModel baseStickerModel) {
        LJJJLL().LIZLLL(new AwS608S0100000_29(baseStickerModel, 263), true);
    }

    @Override // X.C0FTJ
    public final void setAlpha(float f) {
        InteractiveEmojiStickerModel interactiveEmojiStickerModel = LJJJLL().LIZ;
        LJIIJJI(interactiveEmojiStickerModel.copy(BaseStickerModel.copy$default(LJJIJ().LIZ, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, f, null, null, null, false, Integer.MAX_VALUE, 15, null), interactiveEmojiStickerModel.clickable, interactiveEmojiStickerModel.visible, interactiveEmojiStickerModel.emojiContent, interactiveEmojiStickerModel.androidVer, interactiveEmojiStickerModel.iosVer));
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void setVisible(boolean z) {
        LJJIJ().LIZLLL(new AwS41S0010000_29(z, 26), true);
        LJJJLL().LIZLLL(new AwS41S0010000_29(z, 27), true);
    }

    public C19605011n6(Context context, InteractiveEmojiStickerModel interactiveEmojiStickerModel, FrameLayout frameLayout, C0FFO c0ffo, LifecycleOwner lifecycleOwner, C390420FSm c390420FSm) {
        super(context, interactiveEmojiStickerModel.getBaseStickerModel(), c0ffo, lifecycleOwner, c390420FSm);
        this.LJIILIIL = context;
        this.LJIILJJIL = interactiveEmojiStickerModel;
        this.LJIILL = frameLayout;
        this.LJIILLIIL = c0ffo;
        this.LJIIZILJ = lifecycleOwner;
        this.LJIJ = c390420FSm;
        this.LJIJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
        this.LJIJJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 301));
        LJJJJ(frameLayout);
    }
}
