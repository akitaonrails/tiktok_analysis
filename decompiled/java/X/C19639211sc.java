package X;

import com.ss.android.ugc.aweme.tools.sticker.core.article.ArticleStickerModel;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11sc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19639211sc {
    public final /* synthetic */ C19639311sd LIZ;

    public C19639211sc(C19639311sd c19639311sd) {
        this.LIZ = c19639311sd;
    }

    public final void LIZ(EnumC19645411tc enumC19645411tc) {
        boolean z;
        if (enumC19645411tc == EnumC19645411tc.ON_CONFIRMED) {
            z = true;
        } else {
            z = false;
        }
        C19639311sd c19639311sd = this.LIZ;
        ArticleStickerModel articleStickerModel = c19639311sd.LLJ.LIZ;
        ArticleStickerModel articleStickerModelLIZ = c19639311sd.LLIZLLLIL.LIZ();
        ArticleStickerModel.StyleModel styleModelCopy = null;
        ArticleStickerModel articleStickerModelCopy = articleStickerModelLIZ.copy(articleStickerModelLIZ.baseStickerModel, articleStickerModelLIZ.articleLink, articleStickerModelLIZ.articleTitle, articleStickerModelLIZ.brandIconId, articleStickerModelLIZ.brandIconUrl, articleStickerModelLIZ.brandThemeColor, articleStickerModelLIZ.styleState, articleStickerModel.getPreviewContainerHeightPx(), articleStickerModelLIZ.realMediaWidth, articleStickerModelLIZ.realMediaHeight);
        C19639311sd c19639311sd2 = this.LIZ;
        C0NJD<ArticleStickerModel> c0njd = c19639311sd2.LLIZLLLIL;
        if (z) {
            ArticleStickerModel.StyleModel styleState = articleStickerModel.getStyleState();
            if (styleState != null) {
                styleModelCopy = styleState.copy(styleState.type, Boolean.FALSE);
            }
            articleStickerModelCopy = articleStickerModel.copy(this.LIZ.LIZIZ(articleStickerModelCopy.getBaseStickerModel(), this.LIZ.LJ()), articleStickerModel.articleLink, articleStickerModel.articleTitle, articleStickerModel.brandIconId, articleStickerModel.brandIconUrl, articleStickerModel.brandThemeColor, styleModelCopy, articleStickerModel.previewContainerHeightPx, articleStickerModel.realMediaWidth, articleStickerModel.realMediaHeight);
        } else {
            c19639311sd2.LLJ.LIZLLL(new AwS608S0100000_29(articleStickerModelCopy, 591), true);
            this.LIZ.LLJIJIL.LIZLLL(new AwS608S0100000_29(articleStickerModelCopy, 592), true);
        }
        c0njd.LIZIZ(articleStickerModelCopy);
        this.LIZ.LIZLLL(z);
    }
}
