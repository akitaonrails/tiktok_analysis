package X;

import Y.AObserverS231S0100000_29;
import android.content.Context;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ogc.news.sticker.common.ArticleStickerConfigResponse;
import com.ss.android.ugc.aweme.ogc.news.sticker.common.ArticleStickerStorage;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.article.ArticleStickerModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11sb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19639111sb extends AbstractC388880FMo<ArticleStickerModel> {
    public final C0FTH LJII;
    public final ArticleStickerStorage LJIIIIZZ;
    public final C01GW LJIIIZ;
    public C19639311sd LJIIJ;

    @Override // X.AbstractC388880FMo
    public final EnumC1466150oFx LIZLLL() {
        return EnumC1466150oFx.ARTICLE;
    }

    public final ArticleStickerModel LJIIIIZZ(ArticleStickerModel articleStickerModel) {
        Rect rectInvoke;
        Integer numValueOf;
        Function0<Rect> function0 = this.LJII.LIZ().LLJL;
        Integer numValueOf2 = null;
        if (function0 != null) {
            rectInvoke = function0.invoke();
        } else {
            rectInvoke = null;
        }
        if (rectInvoke != null) {
            numValueOf = Integer.valueOf(rectInvoke.width());
            numValueOf2 = Integer.valueOf(rectInvoke.height());
        } else {
            numValueOf = null;
        }
        return articleStickerModel.copy(articleStickerModel.baseStickerModel, articleStickerModel.articleLink, articleStickerModel.articleTitle, articleStickerModel.brandIconId, articleStickerModel.brandIconUrl, articleStickerModel.brandThemeColor, articleStickerModel.styleState, articleStickerModel.previewContainerHeightPx, numValueOf, numValueOf2);
    }

    @Override // X.AbstractC388880FMo
    public final StickerModel LIZJ(StickerModel stickerModel, int i) {
        ArticleStickerModel articleStickerModel = (ArticleStickerModel) stickerModel;
        return articleStickerModel.copy(BaseStickerModel.copy$default(articleStickerModel.getBaseStickerModel(), i, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1073741826, 15, null), articleStickerModel.articleLink, articleStickerModel.articleTitle, articleStickerModel.brandIconId, articleStickerModel.brandIconUrl, articleStickerModel.brandThemeColor, articleStickerModel.styleState, articleStickerModel.previewContainerHeightPx, articleStickerModel.realMediaWidth, articleStickerModel.realMediaHeight);
    }

    @Override // X.AbstractC388880FMo
    public final C0FFE<StickerModel> LIZ(StickerModel stickerModel, C0FFO c0ffo, LifecycleOwner lifecycleOwner) {
        ArticleStickerConfigResponse.ArticleStickerAssetConfig articleStickerAssetConfig;
        ArticleStickerModel articleStickerModel = (ArticleStickerModel) stickerModel;
        ArticleStickerStorage.LIZ.getClass();
        ArticleStickerConfigResponse articleStickerConfigResponseLIZJ = ArticleStickerStorage.LIZJ();
        if (articleStickerConfigResponseLIZJ != null) {
            articleStickerAssetConfig = articleStickerConfigResponseLIZJ.assetConfig;
        } else {
            articleStickerAssetConfig = null;
        }
        ArticleStickerModel articleStickerModelLJIIIIZZ = LJIIIIZZ(ArticleStickerStorage.LJ(articleStickerModel, "Create Real Sticker", articleStickerAssetConfig));
        InterfaceC19639511sf interfaceC19639511sf = (InterfaceC19639511sf) this.LJIIIZ.getValue();
        if (interfaceC19639511sf != null) {
            interfaceC19639511sf.Tk(articleStickerModelLJIIIIZZ);
        }
        return new C19639011sa(this.LIZ, articleStickerModelLJIIIIZZ.copy(BaseStickerModel.copy$default(articleStickerModelLJIIIIZZ.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, true, 0.0f, null, null, null, false, -1073741825, 15, null), articleStickerModelLJIIIIZZ.articleLink, articleStickerModelLJIIIIZZ.articleTitle, articleStickerModelLJIIIIZZ.brandIconId, articleStickerModelLJIIIIZZ.brandIconUrl, articleStickerModelLJIIIIZZ.brandThemeColor, articleStickerModelLJIIIIZZ.styleState, articleStickerModelLJIIIIZZ.previewContainerHeightPx, articleStickerModelLJIIIIZZ.realMediaWidth, articleStickerModelLJIIIIZZ.realMediaHeight), this.LIZIZ, c0ffo, lifecycleOwner, this.LJFF);
    }

    @Override // X.AbstractC388880FMo
    public final void LJI(C0FTJ c0ftj, C388340FKm c388340FKm, C390370FSh c390370FSh, String str, Function1 function1) {
        StickerModel stickerModelLJLI;
        ArticleStickerModel articleStickerModel;
        ArticleStickerConfigResponse.ArticleStickerAssetConfig articleStickerAssetConfig;
        String strCk2;
        C19644911tX c19644911tX;
        int iIntValue;
        String creationId;
        ArticleStickerStorage articleStickerStorage = this.LJIIIIZZ;
        Boolean bool = Boolean.TRUE;
        articleStickerStorage.getClass();
        ArticleStickerStorage.LJFF(bool);
        ArticleStickerStorage articleStickerStorage2 = ArticleStickerStorage.LIZ;
        if (c0ftj != null) {
            stickerModelLJLI = c0ftj.LJLI();
        } else {
            stickerModelLJLI = null;
        }
        if (!(stickerModelLJLI instanceof ArticleStickerModel) || (articleStickerModel = (ArticleStickerModel) stickerModelLJLI) == null) {
            articleStickerModel = new ArticleStickerModel(new BaseStickerModel(114, 0, EnumC1466150oFx.ARTICLE, 0, 0, this.LIZIZ.getWidth() / 2.0f, this.LIZIZ.getHeight() / 2.0f, 0, 0, this.LIZIZ.getLeft(), this.LIZIZ.getTop(), this.LIZIZ.getWidth(), this.LIZIZ.getHeight(), 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -7782, 15, null), null, null, null, null, null, new ArticleStickerModel.StyleModel(EnumC1779140wOm.INITIAL, Boolean.FALSE), null, null, null);
        }
        ArticleStickerModel articleStickerModelLJIIIIZZ = LJIIIIZZ(articleStickerModel);
        articleStickerStorage2.getClass();
        ArticleStickerConfigResponse articleStickerConfigResponseLIZJ = ArticleStickerStorage.LIZJ();
        if (articleStickerConfigResponseLIZJ != null) {
            articleStickerAssetConfig = articleStickerConfigResponseLIZJ.assetConfig;
        } else {
            articleStickerAssetConfig = null;
        }
        ArticleStickerModel articleStickerModelLJ = ArticleStickerStorage.LJ(articleStickerModelLJIIIIZZ, "EnterEdit", articleStickerAssetConfig);
        if (Intrinsics.LJFF(str, "sticker_panel")) {
            articleStickerModelLJ.getBaseStickerModel().setStickerSource("2");
        }
        C19639311sd c19639311sd = this.LJIIJ;
        if (c19639311sd == null) {
            Context context = this.LIZ;
            InterfaceC19639511sf interfaceC19639511sf = (InterfaceC19639511sf) this.LJIIIZ.getValue();
            if (interfaceC19639511sf == null || (creationId = interfaceC19639511sf.getCreationId()) == null) {
                creationId = "";
            }
            c19639311sd = new C19639311sd(context, creationId, this.LIZLLL, this.LJFF, this.LJII, new AwS573S0100000_29(this, 812));
            this.LIZJ.addView(c19639311sd, new ViewGroup.LayoutParams(-1, -1));
            this.LJIIJ = c19639311sd;
        }
        InterfaceC19639511sf interfaceC19639511sf2 = (InterfaceC19639511sf) this.LJIIIZ.getValue();
        if (interfaceC19639511sf2 != null) {
            strCk2 = interfaceC19639511sf2.ck2();
        } else {
            strCk2 = null;
        }
        C0FSM c0fsm = new C0FSM(EnumC1466150oFx.ARTICLE, function1, c390370FSh, c0ftj);
        c19639311sd.LLIZLLLIL.LIZIZ(articleStickerModelLJ);
        c19639311sd.LLJJI = c0fsm;
        c19639311sd.LLJ.LIZLLL(new AwS608S0100000_29(articleStickerModelLJ, 589), true);
        c19639311sd.LLJIJIL.LIZLLL(new AwS608S0100000_29(articleStickerModelLJ, 590), true);
        C19644511tT c19644511tT = new C19644511tT(c19639311sd.LL, c19639311sd);
        c19644511tT.LIZLLL = new C19639211sc(c19639311sd);
        if (c19639311sd.LJFF()) {
            C19644811tW value = c19644511tT.LJI.getValue();
            value.LJIIL(new C19639911sj(articleStickerModelLJ.getArticleTitle(), 2));
            c19644911tX = value;
        } else {
            C19644911tX value2 = c19644511tT.LJII.getValue();
            C19644911tX c19644911tX2 = value2;
            String articleLink = articleStickerModelLJ.getArticleLink();
            if (articleLink != null) {
                strCk2 = articleLink;
            }
            c19644911tX2.LJIIL(new C19639611sg(strCk2));
            c19644911tX = value2;
        }
        c19644511tT.LIZJ = c19644911tX;
        c19639311sd.LLJJ = c19644511tT;
        int visibility = c19639311sd.getVisibility();
        c19639311sd.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c19639311sd);
        FrameLayout frameLayout = c19639311sd.LLJILLL;
        Integer previewContainerHeightPx = c19639311sd.LLJ.LIZ.getPreviewContainerHeightPx();
        if (previewContainerHeightPx != null) {
            iIntValue = previewContainerHeightPx.intValue();
        } else {
            iIntValue = -1;
        }
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams.height != iIntValue) {
            layoutParams.height = iIntValue;
            C786410Ut5.W5(frameLayout, layoutParams);
        }
        if (!c19639311sd.LJ() && c19639311sd.LLJILLL.getLayoutParams().height != -1) {
            FrameLayout frameLayout2 = c19639311sd.LLJILLL;
            if (frameLayout2.isLaidOut() && !frameLayout2.isLayoutRequested()) {
                c19639311sd.LIZJ();
            } else {
                frameLayout2.addOnLayoutChangeListener(new C12YD(c19639311sd, 9));
            }
            C19644511tT c19644511tT2 = c19639311sd.LLJJ;
            if (c19644511tT2 != null) {
                c19644511tT2.LIZIZ(null);
                return;
            }
            return;
        }
        C19644511tT c19644511tT3 = c19639311sd.LLJJ;
        if (c19644511tT3 == null) {
            return;
        }
        c19644511tT3.LIZIZ(new AwS643S0100000_29(c19639311sd, 71));
    }

    public C19639111sb(Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, C0FUH c0fuh, C390420FSm c390420FSm, C0FTH c0fth) {
        super(context, frameLayout, frameLayout2, lifecycleOwner, c0fuh, c390420FSm);
        this.LJII = c0fth;
        ArticleStickerStorage articleStickerStorage = ArticleStickerStorage.LIZ;
        this.LJIIIIZZ = articleStickerStorage;
        this.LJIIIZ = C452501pT.LIZIZ(new AwS573S0100000_29(c390420FSm, 811));
        AObserverS231S0100000_29 aObserverS231S0100000_29 = new AObserverS231S0100000_29(this, 129);
        articleStickerStorage.getClass();
        ArticleStickerStorage.LJ.observe(lifecycleOwner, aObserverS231S0100000_29);
    }
}
