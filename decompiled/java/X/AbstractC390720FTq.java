package X;

import Y.AAListenerS316S0100000_5;
import Y.AUListenerS147S0300000_5;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.SoftKeyBoardListener;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.tools.utils.KeyboardUtils;

/* JADX INFO: renamed from: X.0FTq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC390720FTq extends FrameLayout implements InterfaceC1391500mJY {
    public long LL;
    public final SoftKeyBoardListener LLILLJJLI;
    public C0J1Y LLILLL;

    public abstract void LIZIZ();

    public void LIZJ() {
    }

    public abstract void LIZLLL(int i);

    public abstract void LJ();

    public void LJFF() {
    }

    public abstract void LJI(int i);

    @Override // X.InterfaceC1391500mJY
    public final void LLLL(int i) {
    }

    public abstract View getAlphaView();

    public abstract float getStickerContainerTranslationX();

    public abstract float getStickerContainerTranslationY();

    public abstract float getStickerInitTranslationY();

    public SoftKeyBoardListener getSoftKeyBoardListenerInstance() {
        return new SoftKeyBoardListener(C0FNT.LIZ(getContext()), null, null, null, 12);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLILLJJLI.LIZ();
    }

    public long getAnimDuration() {
        return this.LL;
    }

    public final SoftKeyBoardListener getSoftKeyBoardListener() {
        return this.LLILLJJLI;
    }

    public final C0J1Y getState() {
        return this.LLILLL;
    }

    public void LIZ(EditText editText) {
        KeyboardUtils.LIZ(getContext(), editText);
    }

    public void LJII(EditText editText) {
        boolean z;
        this.LLILLJJLI.LIZIZ(this);
        editText.getVisibility();
        editText.requestFocus();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" openKeyboard request focus visible ");
        if (editText.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(" focused ");
        sbLIZ.append(editText.isFocused());
        C2188811AlT.LIZIZ(sbLIZ);
        KeyboardUtils.LIZIZ(getContext(), editText);
    }

    public void LJJIIJ(int i) {
        LIZLLL(i);
    }

    public void LJZI(int i) {
        this.LLILLJJLI.LIZ();
        LIZLLL(0);
        LJI(i);
    }

    public void setAnimDuration(long j) {
        this.LL = j;
    }

    public final void setState(C0J1Y c0j1y) {
        this.LLILLL = c0j1y;
    }

    public AbstractC390720FTq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = 300L;
        SoftKeyBoardListener softKeyBoardListenerInstance = getSoftKeyBoardListenerInstance();
        softKeyBoardListenerInstance.LIZIZ(this);
        this.LLILLJJLI = softKeyBoardListenerInstance;
        this.LLILLL = C0J1Y.RESUME;
    }

    public final void LJIIIIZZ(final View view, BaseStickerModel baseStickerModel, final BaseStickerModel baseStickerModel2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationX", getStickerContainerTranslationX(), baseStickerModel2.getTranslateX());
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float stickerContainerTranslationY = getStickerContainerTranslationY();
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0FPo
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Float f;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
                    C786410Ut5.ed(view, stickerContainerTranslationY + ((baseStickerModel2.getTranslateY() - stickerContainerTranslationY) * f.floatValue()));
                }
            }
        });
        animatorSet.playTogether(objectAnimatorOfFloat, valueAnimatorOfFloat, ObjectAnimator.ofFloat(view, "scaleX", baseStickerModel.getScale(), baseStickerModel2.getScale()), ObjectAnimator.ofFloat(view, "scaleY", baseStickerModel.getScale(), baseStickerModel2.getScale()), ObjectAnimator.ofFloat(view, "rotation", baseStickerModel.getRotation(), baseStickerModel2.getRotation()), ObjectAnimator.ofFloat(getAlphaView(), "alpha", 1.0f, 0.0f));
        animatorSet.setDuration(getAnimDuration());
        animatorSet.addListener(new AAListenerS316S0100000_5(this, 7));
        animatorSet.start();
    }

    public final void LJIIIZ(View view, BaseStickerModel baseStickerModel, BaseStickerModel baseStickerModel2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationX", baseStickerModel.getTranslateX(), getStickerContainerTranslationX());
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS147S0300000_5(this, view, baseStickerModel, 3));
        animatorSet.playTogether(objectAnimatorOfFloat, valueAnimatorOfFloat, ObjectAnimator.ofFloat(view, "scaleX", baseStickerModel.getScale(), baseStickerModel2.getScale()), ObjectAnimator.ofFloat(view, "scaleY", baseStickerModel.getScale(), baseStickerModel2.getScale()), ObjectAnimator.ofFloat(view, "rotation", baseStickerModel.getRotation(), baseStickerModel2.getRotation()), ObjectAnimator.ofFloat(getAlphaView(), "alpha", 0.0f, 1.0f));
        animatorSet.setDuration(getAnimDuration());
        animatorSet.addListener(new AAListenerS316S0100000_5(this, 8));
        animatorSet.start();
    }
}
