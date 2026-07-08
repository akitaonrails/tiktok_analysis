package X;

import Y.AAListenerS339S0100000_29;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.single.SingleHashTagStickerModel;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS25S0100001_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11pO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19619211pO extends AbstractC390720FTq {
    public SingleHashTagStickerModel LLILZ;
    public C1664680tQA<SingleHashTagStickerModel> LLILZIL;
    public C1664680tQA<SingleHashTagStickerModel> LLILZLL;
    public C19591011kq LLIZ;
    public C19591011kq LLIZLLLIL;
    public LifecycleOwner LLJ;
    public ViewGroup LLJI;
    public FrameLayout LLJIJIL;
    public View LLJILJIL;
    public C0FSC LLJILJILJ;

    @Override // X.AbstractC390720FTq
    public float getStickerContainerTranslationX() {
        return 0.0f;
    }

    @Override // X.AbstractC390720FTq
    public final void LIZIZ() {
        SingleHashTagStickerModel singleHashTagStickerModel;
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
        C1664680tQA<SingleHashTagStickerModel> c1664680tQA = this.LLILZLL;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        c1664680tQA.LIZLLL(AFwS273S0000000_29.get$arr$(447), true);
        C1664680tQA<SingleHashTagStickerModel> c1664680tQA2 = this.LLILZIL;
        if (c1664680tQA2 == null) {
            c1664680tQA2 = null;
        }
        c1664680tQA2.LIZLLL(AFwS273S0000000_29.get$arr$(448), true);
        SingleHashTagStickerModel singleHashTagStickerModel2 = this.LLILZ;
        if (singleHashTagStickerModel2 == null) {
            singleHashTagStickerModel = null;
            singleHashTagStickerModel2 = null;
        } else {
            singleHashTagStickerModel = singleHashTagStickerModel2;
        }
        BaseStickerModel baseStickerModelCopy$default = BaseStickerModel.copy$default(singleHashTagStickerModel2.getBaseStickerModel(), 0, 0, EnumC1466150oFx.PICTURE_HASHTAG_SINGLE, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null);
        C1664680tQA<SingleHashTagStickerModel> c1664680tQA3 = this.LLILZIL;
        SingleHashTagStickerModel singleHashTagStickerModelCopy$default = SingleHashTagStickerModel.copy$default(singleHashTagStickerModel, baseStickerModelCopy$default, 0L, (c1664680tQA3 != null ? c1664680tQA3 : null).LIZ.getContentText(), false, false, true, 2, null);
        C0FSC c0fsc = this.LLJILJILJ;
        if (c0fsc != null) {
            c0fsc.LIZ(singleHashTagStickerModelCopy$default, false);
        }
    }

    @Override // X.AbstractC390720FTq
    public final void LJ() {
        C1664680tQA<SingleHashTagStickerModel> c1664680tQA = this.LLILZLL;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        c1664680tQA.LIZLLL(AFwS273S0000000_29.get$arr$(449), true);
        C1664680tQA<SingleHashTagStickerModel> c1664680tQA2 = this.LLILZIL;
        if (c1664680tQA2 == null) {
            c1664680tQA2 = null;
        }
        c1664680tQA2.LIZLLL(AFwS273S0000000_29.get$arr$(450), true);
        C19591011kq c19591011kq = this.LLIZ;
        (c19591011kq != null ? c19591011kq : null).getContentEditText().requestFocus();
    }

    @Override // X.AbstractC390720FTq
    public final void LJFF() {
        C0FSC c0fsc = this.LLJILJILJ;
        if (c0fsc != null) {
            c0fsc.LIZLLL(true);
        }
    }

    @Override // X.AbstractC390720FTq
    public View getAlphaView() {
        ViewGroup viewGroup = this.LLJI;
        if (viewGroup == null) {
            return null;
        }
        return viewGroup;
    }

    @Override // X.AbstractC390720FTq
    public float getStickerContainerTranslationY() {
        FrameLayout frameLayout = this.LLJIJIL;
        if (frameLayout == null) {
            frameLayout = null;
        }
        int top = frameLayout.getTop();
        return ((top + (this.LLJIJIL != null ? r0 : null).getBottom()) / 2) - ((getTop() + getBottom()) / 2);
    }

    @Override // X.AbstractC390720FTq
    public float getStickerInitTranslationY() {
        SingleHashTagStickerModel singleHashTagStickerModel = this.LLILZ;
        if (singleHashTagStickerModel == null) {
            singleHashTagStickerModel = null;
        }
        float centerY = singleHashTagStickerModel.getBaseStickerModel().getCenterY();
        SingleHashTagStickerModel singleHashTagStickerModel2 = this.LLILZ;
        if (singleHashTagStickerModel2 == null) {
            singleHashTagStickerModel2 = null;
        }
        return ((centerY + singleHashTagStickerModel2.getBaseStickerModel().getTranslateY()) + (this.LLILZ != null ? r0 : null).getBaseStickerModel().getContainerTop()) - ((getTop() + getBottom()) / 2);
    }

    public final C0FSC getStickerEditListener() {
        return this.LLJILJILJ;
    }

    public C19619211pO(Context context) {
        super(context, null, 0);
    }

    @Override // X.AbstractC390720FTq
    public final void LIZLLL(int i) {
        ViewGroup viewGroup = this.LLJI;
        ViewGroup viewGroup2 = null;
        if (viewGroup == null) {
            viewGroup = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
        marginLayoutParams.bottomMargin = i - ((int) C0JAI.LIZ(62.0f, getContext()));
        ViewGroup viewGroup3 = this.LLJI;
        if (viewGroup3 != null) {
            viewGroup2 = viewGroup3;
        }
        C786410Ut5.X5(marginLayoutParams, viewGroup2);
    }

    @Override // X.AbstractC390720FTq
    public final void LJI(int i) {
        FrameLayout frameLayout = this.LLJIJIL;
        FrameLayout frameLayout2 = null;
        if (frameLayout == null) {
            frameLayout = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        marginLayoutParams.bottomMargin = i;
        FrameLayout frameLayout3 = this.LLJIJIL;
        if (frameLayout3 != null) {
            frameLayout2 = frameLayout3;
        }
        C786410Ut5.a6(frameLayout2, marginLayoutParams);
    }

    @Override // X.AbstractC390720FTq, X.InterfaceC1391500mJY
    public final void LJJIIJ(int i) {
        if (getState() == C0J1Y.PAUSE) {
            return;
        }
        LIZLLL(i);
        SingleHashTagStickerModel singleHashTagStickerModel = this.LLILZ;
        if (singleHashTagStickerModel == null) {
            singleHashTagStickerModel = null;
        }
        if (singleHashTagStickerModel.getContentText().length() == 0) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getAlphaView(), "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(300L);
            objectAnimatorOfFloat.addListener(new AAListenerS339S0100000_29(this, 27));
            C786410Ut5.Pd(objectAnimatorOfFloat);
            return;
        }
        float stickerInitTranslationY = getStickerInitTranslationY();
        C19591011kq c19591011kq = this.LLIZLLLIL;
        if (c19591011kq == null) {
            c19591011kq = null;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19591011kq);
        c19591011kq.setTranslationY(stickerInitTranslationY);
        C1664680tQA<SingleHashTagStickerModel> c1664680tQA = this.LLILZLL;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        BaseStickerModel baseStickerModel = c1664680tQA.LIZ.getBaseStickerModel();
        C1664680tQA<SingleHashTagStickerModel> c1664680tQA2 = this.LLILZLL;
        if (c1664680tQA2 == null) {
            c1664680tQA2 = null;
        }
        c1664680tQA2.LIZLLL(new AwS25S0100001_29(baseStickerModel, stickerInitTranslationY, 5), true);
        C1664680tQA<SingleHashTagStickerModel> c1664680tQA3 = this.LLILZLL;
        if (c1664680tQA3 == null) {
            c1664680tQA3 = null;
        }
        c1664680tQA3.LIZLLL(AFwS273S0000000_29.get$arr$(453), true);
        C1664680tQA<SingleHashTagStickerModel> c1664680tQA4 = this.LLILZIL;
        if (c1664680tQA4 == null) {
            c1664680tQA4 = null;
        }
        c1664680tQA4.LIZLLL(AFwS273S0000000_29.get$arr$(454), true);
        C1664680tQA<SingleHashTagStickerModel> c1664680tQA5 = this.LLILZIL;
        if (c1664680tQA5 == null) {
            c1664680tQA5 = null;
        }
        c1664680tQA5.LIZLLL(AFwS273S0000000_29.get$arr$(455), true);
        C19591011kq c19591011kq2 = this.LLIZLLLIL;
        if (c19591011kq2 == null) {
            c19591011kq2 = null;
        }
        BaseStickerModel baseStickerModelCopy$default = BaseStickerModel.copy$default(baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, stickerInitTranslationY, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -4194305, 15, null);
        C1664680tQA<SingleHashTagStickerModel> c1664680tQA6 = this.LLILZIL;
        if (c1664680tQA6 == null) {
            c1664680tQA6 = null;
        }
        LJIIIZ(c19591011kq2, baseStickerModelCopy$default, BaseStickerModel.copy$default(c1664680tQA6.LIZ.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -16777217, 15, null));
    }

    @Override // X.AbstractC390720FTq, X.InterfaceC1391500mJY
    public final void LJZI(int i) {
        if (getState() == C0J1Y.PAUSE) {
            return;
        }
        super.LJZI(i);
        C1664680tQA<SingleHashTagStickerModel> c1664680tQA = this.LLILZIL;
        SingleHashTagStickerModel singleHashTagStickerModel = null;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        c1664680tQA.LIZLLL(new AwS608S0100000_29(this, 830), true);
        C1664680tQA<SingleHashTagStickerModel> c1664680tQA2 = this.LLILZLL;
        if (c1664680tQA2 == null) {
            c1664680tQA2 = null;
        }
        c1664680tQA2.LIZLLL(new AwS608S0100000_29(this, 831), true);
        C1664680tQA<SingleHashTagStickerModel> c1664680tQA3 = this.LLILZIL;
        if (c1664680tQA3 == null) {
            c1664680tQA3 = null;
        }
        c1664680tQA3.LIZLLL(AFwS273S0000000_29.get$arr$(446), true);
        C19591011kq c19591011kq = this.LLIZLLLIL;
        if (c19591011kq == null) {
            c19591011kq = null;
        }
        C1664680tQA<SingleHashTagStickerModel> c1664680tQA4 = this.LLILZIL;
        if (c1664680tQA4 == null) {
            c1664680tQA4 = null;
        }
        BaseStickerModel baseStickerModelCopy$default = BaseStickerModel.copy$default(c1664680tQA4.LIZ.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -16777217, 15, null);
        C1664680tQA<SingleHashTagStickerModel> c1664680tQA5 = this.LLILZLL;
        if (c1664680tQA5 == null) {
            c1664680tQA5 = null;
        }
        BaseStickerModel baseStickerModel = c1664680tQA5.LIZ.getBaseStickerModel();
        SingleHashTagStickerModel singleHashTagStickerModel2 = this.LLILZ;
        if (singleHashTagStickerModel2 != null) {
            singleHashTagStickerModel = singleHashTagStickerModel2;
        }
        LJIIIIZZ(c19591011kq, baseStickerModelCopy$default, BaseStickerModel.copy$default(baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, singleHashTagStickerModel.getBaseStickerModel().getScale(), 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -8388609, 15, null));
    }

    public final void setStickerEditListener(C0FSC c0fsc) {
        this.LLJILJILJ = c0fsc;
    }
}
