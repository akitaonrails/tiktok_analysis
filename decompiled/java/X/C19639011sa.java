package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.article.ArticleStickerModel;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11sa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19639011sa extends C0FFE<ArticleStickerModel> {
    public final Context LJIILIIL;
    public final ArticleStickerModel LJIILJJIL;
    public final FrameLayout LJIILL;
    public final C0FFO LJIILLIIL;
    public final LifecycleOwner LJIIZILJ;
    public final C01GW LJIJ;
    public final C01GW LJIJI;

    @Override // X.C0FFE
    public final View LJJJJJ() {
        return (View) this.LJIJI.getValue();
    }

    public final C1664680tQA<ArticleStickerModel> LJJJLL() {
        return (C1664680tQA) this.LJIJ.getValue();
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
        ArticleStickerModel articleStickerModel;
        super.LJIIJJI(stickerModel);
        if ((stickerModel instanceof ArticleStickerModel) && (articleStickerModel = (ArticleStickerModel) stickerModel) != null) {
            LJJJLL().LIZLLL(new AwS608S0100000_29(articleStickerModel, 520), true);
            LJJJLIIL(((ArticleStickerModel) stickerModel).getBaseStickerModel());
        }
    }

    @Override // X.C0FFE
    public final void LJJJJIZL(BaseStickerModel baseStickerModel) {
        LJJJLL().LIZLLL(new AwS608S0100000_29(baseStickerModel, 517), true);
    }

    @Override // X.C0FTJ
    public final void setAlpha(float f) {
        ArticleStickerModel articleStickerModel = LJJJLL().LIZ;
        LJIIJJI(articleStickerModel.copy(BaseStickerModel.copy$default(LJJIJ().LIZ, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, f, null, null, null, false, Integer.MAX_VALUE, 15, null), articleStickerModel.articleLink, articleStickerModel.articleTitle, articleStickerModel.brandIconId, articleStickerModel.brandIconUrl, articleStickerModel.brandThemeColor, articleStickerModel.styleState, articleStickerModel.previewContainerHeightPx, articleStickerModel.realMediaWidth, articleStickerModel.realMediaHeight));
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void setVisible(boolean z) {
        BaseStickerModel baseStickerModelCopy$default = BaseStickerModel.copy$default(LJJIJ().LIZ, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, z, 0.0f, null, null, null, false, -1073741825, 15, null);
        LJJIJ().LIZLLL(new AwS608S0100000_29(baseStickerModelCopy$default, 518), true);
        LJJJLL().LIZLLL(new AwS608S0100000_29(baseStickerModelCopy$default, 519), true);
    }

    public C19639011sa(Context context, ArticleStickerModel articleStickerModel, FrameLayout frameLayout, C0FFO c0ffo, LifecycleOwner lifecycleOwner, C390420FSm c390420FSm) {
        super(context, articleStickerModel.getBaseStickerModel(), c0ffo, lifecycleOwner, c390420FSm);
        this.LJIILIIL = context;
        this.LJIILJJIL = articleStickerModel;
        this.LJIILL = frameLayout;
        this.LJIILLIIL = c0ffo;
        this.LJIIZILJ = lifecycleOwner;
        this.LJIJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 809));
        this.LJIJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 810));
        LJJJJ(frameLayout);
    }
}
