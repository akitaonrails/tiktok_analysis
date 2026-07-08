package X;

import Y.AAListenerS339S0100000_29;
import Y.AUListenerS277S0100000_29;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ogc.news.sticker.common.ArticleStickerConfigResponse;
import com.ss.android.ugc.aweme.ogc.news.sticker.common.ArticleStickerStorage;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.article.ArticleStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS41S0001000_29;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11sd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19639311sd extends FrameLayout {
    public final String LL;
    public final LifecycleOwner LLILLJJLI;
    public final C390420FSm LLILLL;
    public final C0FTH LLILZ;
    public final Function0<Float> LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C0NJD<ArticleStickerModel> LLIZLLLIL;
    public final C1664680tQA<ArticleStickerModel> LLJ;
    public final C01GW LLJI;
    public final C1664680tQA<ArticleStickerModel> LLJIJIL;
    public final C01GW LLJILJIL;
    public final View LLJILJILJ;
    public final FrameLayout LLJILLL;
    public C19644511tT LLJJ;
    public C0FSC LLJJI;
    public Animator LLJJIII;

    private final C21637819mC getBorderLineService() {
        return (C21637819mC) this.LLIZ.getValue();
    }

    private final float getPreviewStickerTranslationYForAnimView() {
        return ((this.LLJILLL.getTop() + this.LLJILLL.getBottom()) / 2.0f) - ((getTop() + getBottom()) / 2.0f);
    }

    private final C19623911q9 getPreviewStickerView() {
        return (C19623911q9) this.LLJI.getValue();
    }

    private final float getSavedStickerTranslationYForAnimView() {
        float fFloatValue = this.LLILZIL.invoke().floatValue() + this.LLIZLLLIL.LIZ().getBaseStickerModel().getTranslateY();
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        return fFloatValue - ((C13LQ.LJJIIJ(1, iArr) != null ? r0.intValue() : 0) + (getHeight() / 2.0f));
    }

    public final void LIZJ() {
        C0FSC c0fsc = this.LLJJI;
        if (c0fsc != null) {
            c0fsc.LIZLLL(LJFF());
        }
        AwS608S0100000_29 awS608S0100000_29 = new AwS608S0100000_29(this, 586);
        if (LJ()) {
            LJII(this.LLJ, true);
            LJII(this.LLJIJIL, false);
            C19623911q9 previewStickerView = getPreviewStickerView();
            View view = this.LLJILJILJ;
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(300L);
            animatorSet.playTogether(C1697810uHb.LJIIJJI(ObjectAnimator.ofFloat(previewStickerView, "translationY", previewStickerView.getHeight() / 2.0f, 0.0f), ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f)));
            animatorSet.addListener(new AAListenerS339S0100000_29(awS608S0100000_29, 10));
            animatorSet.start();
            return;
        }
        LJII(this.LLJ, false);
        LJII(this.LLJIJIL, true);
        C19623911q9 animStickerView = getAnimStickerView();
        View view2 = this.LLJILJILJ;
        BaseStickerModel baseStickerModelCopy$default = BaseStickerModel.copy$default(this.LLIZLLLIL.LIZ().getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, getSavedStickerTranslationYForAnimView(), 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -4194305, 15, null);
        BaseStickerModel baseStickerModelCopy$default2 = BaseStickerModel.copy$default(this.LLJ.LIZ.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, getPreviewStickerTranslationYForAnimView(), 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -4194305, 15, null);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(animStickerView, "translationX", baseStickerModelCopy$default.getTranslateX(), baseStickerModelCopy$default2.getTranslateX()), ObjectAnimator.ofFloat(animStickerView, "translationY", baseStickerModelCopy$default.getTranslateY(), baseStickerModelCopy$default2.getTranslateY()), ObjectAnimator.ofFloat(animStickerView, "scaleX", baseStickerModelCopy$default.getScale(), baseStickerModelCopy$default2.getScale()), ObjectAnimator.ofFloat(animStickerView, "scaleY", baseStickerModelCopy$default.getScale(), baseStickerModelCopy$default2.getScale()), ObjectAnimator.ofFloat(animStickerView, "rotation", baseStickerModelCopy$default.getRotation(), baseStickerModelCopy$default2.getRotation()), ObjectAnimator.ofFloat(view2, "alpha", 0.0f, 1.0f));
        animatorSet2.setDuration(500L);
        animatorSet2.setInterpolator(C1619980sG4.LJIIIZ());
        animatorSet2.addListener(new AAListenerS339S0100000_29(awS608S0100000_29, 11));
        animatorSet2.start();
    }

    public final boolean LJFF() {
        Iterator<C0FTJ<StickerModel>> it2 = C390410FSl.LIZLLL(this.LLILLL).iterator();
        while (it2.hasNext()) {
            C0FTJ<StickerModel> next = it2.next();
            if (next.getStickerType() == EnumC1466150oFx.ARTICLE) {
                return next != null;
            }
        }
        return false;
    }

    public final C19623911q9 getAnimStickerView() {
        return (C19623911q9) this.LLJILJIL.getValue();
    }

    public final C391140FVg getLandscapeService() {
        return (C391140FVg) this.LLILZLL.getValue();
    }

    public final boolean LJ() {
        return !LJFF();
    }

    public final void LIZLLL(boolean z) {
        C19644511tT c19644511tT = this.LLJJ;
        if (c19644511tT != null) {
            c19644511tT.LIZ(null);
        }
        LJII(this.LLJ, false);
        LJII(this.LLJIJIL, true);
        C19623911q9 animStickerView = getAnimStickerView();
        View view = this.LLJILJILJ;
        BaseStickerModel baseStickerModelCopy$default = BaseStickerModel.copy$default(this.LLJ.LIZ.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, getPreviewStickerTranslationYForAnimView(), 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -4194305, 15, null);
        BaseStickerModel baseStickerModelCopy$default2 = BaseStickerModel.copy$default(this.LLIZLLLIL.LIZ().getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, getSavedStickerTranslationYForAnimView(), 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -4194305, 15, null);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300L);
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(ObjectAnimator.ofFloat(animStickerView, "translationX", baseStickerModelCopy$default.getTranslateX(), baseStickerModelCopy$default2.getTranslateX()), ObjectAnimator.ofFloat(animStickerView, "translationY", baseStickerModelCopy$default.getTranslateY(), baseStickerModelCopy$default2.getTranslateY()), ObjectAnimator.ofFloat(animStickerView, "scaleX", baseStickerModelCopy$default.getScale(), baseStickerModelCopy$default2.getScale()), ObjectAnimator.ofFloat(animStickerView, "scaleY", baseStickerModelCopy$default.getScale(), baseStickerModelCopy$default2.getScale()), ObjectAnimator.ofFloat(animStickerView, "rotation", baseStickerModelCopy$default.getRotation(), baseStickerModelCopy$default2.getRotation()), ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f));
        if (LJ() && !z) {
            listLJIILJJIL.add(ObjectAnimator.ofFloat(animStickerView, "alpha", 1.0f, 0.0f));
        }
        animatorSet.playTogether(listLJIILJJIL);
        animatorSet.addListener(new AAListenerS339S0100000_29(this, 12));
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.start();
    }

    public final void LJI(ArticleStickerConfigResponse.ArticleStickerAssetConfig articleStickerAssetConfig) {
        this.LLJ.LIZLLL(new AwS608S0100000_29(articleStickerAssetConfig, 587), true);
        this.LLJIJIL.LIZLLL(new AwS608S0100000_29(articleStickerAssetConfig, 588), true);
        C0NJD<ArticleStickerModel> c0njd = this.LLIZLLLIL;
        ArticleStickerStorage articleStickerStorage = ArticleStickerStorage.LIZ;
        ArticleStickerModel articleStickerModelLIZ = c0njd.LIZ();
        articleStickerStorage.getClass();
        c0njd.LIZIZ(ArticleStickerStorage.LJ(articleStickerModelLIZ, "Edit-savedModel", articleStickerAssetConfig));
    }

    public static void LJII(C1664680tQA c1664680tQA, boolean z) {
        c1664680tQA.LIZLLL(new AwS41S0010000_29(z, 50), true);
    }

    public final void LIZ(int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i3;
        int screenHeight = ScreenUtils.getScreenHeight(getContext());
        if (i > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100))) {
            ViewGroup.LayoutParams layoutParams = this.LLJILLL.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            if (marginLayoutParams == null) {
                i3 = 0;
            } else {
                i3 = marginLayoutParams.topMargin;
            }
            int i4 = this.LLJILLL.getLayoutParams().height;
            int i5 = ((screenHeight - i) - i2) - i3;
            this.LLJ.LIZLLL(new AwS41S0001000_29(i5, 34), true);
            this.LLJIJIL.LIZLLL(new AwS41S0001000_29(i5, 35), true);
            if (i4 == -1) {
                FrameLayout frameLayout = this.LLJILLL;
                ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
                if (layoutParams2.height != i5) {
                    layoutParams2.height = i5;
                    C786410Ut5.W5(frameLayout, layoutParams2);
                }
            } else {
                Animator animator = this.LLJJIII;
                if (animator != null) {
                    animator.cancel();
                }
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i4, i5);
                valueAnimatorOfInt.setDuration(150L);
                valueAnimatorOfInt.addUpdateListener(new AUListenerS277S0100000_29(this, 19));
                valueAnimatorOfInt.start();
                this.LLJJIII = valueAnimatorOfInt;
            }
        }
        new C19639411se(i, i2);
    }

    public final BaseStickerModel LIZIZ(BaseStickerModel baseStickerModel, boolean z) {
        float translateY;
        C21637819mC borderLineService = getBorderLineService();
        int width = getPreviewStickerView().getWidth();
        int height = getPreviewStickerView().getHeight();
        if (z) {
            translateY = getBorderLineService().LJIJJ();
        } else {
            translateY = baseStickerModel.getTranslateY();
        }
        BaseStickerModel baseStickerModelLJ = borderLineService.LJ(BaseStickerModel.copy$default(baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, width, height, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, translateY, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -4194689, 15, null), AFwS218S0000000_29.get$arr$(326));
        new AwS573S0100000_29(baseStickerModelLJ, 845);
        return BaseStickerModel.copy$default(baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, baseStickerModelLJ.getTranslateX(), baseStickerModelLJ.getTranslateY(), baseStickerModelLJ.getScale(), 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -14680065, 15, null);
    }

    public C19639311sd(Context context, String str, LifecycleOwner lifecycleOwner, C390420FSm c390420FSm, C0FTH c0fth, AwS573S0100000_29 awS573S0100000_29) {
        super(context, null, 0);
        this.LL = str;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = c390420FSm;
        this.LLILZ = c0fth;
        this.LLILZIL = awS573S0100000_29;
        this.LLILZLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 847));
        this.LLIZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 846));
        ArticleStickerModel.Companion.getClass();
        this.LLIZLLLIL = new C0NJD<>(ArticleStickerModel.EMPTY);
        this.LLJ = new C1664680tQA<>(new ArticleStickerModel(new BaseStickerModel(0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 1.0f, null, null, null, false, 1065353215, 15, null), null, null, null, null, null, null, null, null, null));
        this.LLJI = C452501pT.LIZIZ(new AwS430S0200000_29(context, this, 87));
        this.LLJIJIL = new C1664680tQA<>(new ArticleStickerModel(new BaseStickerModel(114, 0, EnumC1466150oFx.ARTICLE, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -6, 15, null), null, null, null, null, null, null, null, null, null));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS430S0200000_29(context, this, 86));
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.re, this, true);
        this.LLJILJILJ = viewTd.findViewById(R.id.rry);
        FrameLayout frameLayout = (FrameLayout) viewTd.findViewById(R.id.w4v);
        C995130c0F.LIZIZ(ScreenUtils.getStatusBarHeight(context) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), frameLayout);
        frameLayout.addView(getPreviewStickerView());
        this.LLJILLL = frameLayout;
        addView(getAnimStickerView());
    }
}
