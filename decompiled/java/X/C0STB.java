package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0STB, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0STB extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0STE LL;
    public final /* synthetic */ Pair<Integer, Integer> LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ float LLILZIL;
    public final /* synthetic */ float LLILZLL;
    public final /* synthetic */ float LLIZ;
    public final /* synthetic */ float LLIZLLLIL;
    public final /* synthetic */ float LLJ;
    public final /* synthetic */ float LLJI;
    public final /* synthetic */ float LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0STB(C0STE c0ste, Pair<Integer, Integer> pair, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        super(0);
        this.LL = c0ste;
        this.LLILLJJLI = pair;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = f;
        this.LLILZLL = f2;
        this.LLIZ = f3;
        this.LLIZLLLIL = f4;
        this.LLJ = f5;
        this.LLJI = f6;
        this.LLJIJIL = f7;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        this.LL.LLILLJJLI.getLocationInWindow(new int[2]);
        Pair<Integer, Integer> pair = this.LLILLJJLI;
        if (pair == null) {
            pair = new Pair<>(0, 0);
        }
        int iIntValue = pair.getFirst().intValue();
        int iIntValue2 = pair.getSecond().intValue();
        C0STE c0ste = this.LL;
        int i = this.LLILLL;
        int i2 = this.LLILZ;
        c0ste.getClass();
        float f = 1.0f;
        float fMin = (i <= 0 || i2 <= 0 || iIntValue <= 0 || iIntValue2 <= 0) ? 1.0f : Math.min(i / iIntValue, i2 / iIntValue2);
        int width = this.LL.LL.getWidth();
        int height = this.LL.LL.getHeight();
        float fMin2 = (width <= 0 || height <= 0 || iIntValue <= 0 || iIntValue2 <= 0) ? 1.0f : Math.min(width / iIntValue, height / iIntValue2);
        if (this.LLILLJJLI != null && fMin2 > 0.0f) {
            f = fMin / fMin2;
        }
        float f2 = this.LLILZIL * f;
        float f3 = this.LLILZLL;
        float f4 = this.LLILZIL;
        float f5 = this.LLIZ * f4;
        float width2 = (this.LLIZLLLIL - r6[0]) + (f3 * f4) + (((this.LLILLL - this.LL.LLILLJJLI.getWidth()) / 2.0f) * f2);
        float height2 = (this.LLJ - r6[1]) + f5 + (((this.LLILZ - this.LL.LLILLJJLI.getHeight()) / 2.0f) * f2);
        View view = this.LL.LL;
        float f6 = this.LLJI;
        float f7 = this.LLJIJIL;
        view.setPivotX(f6);
        view.setPivotY(f7);
        C786410Ut5.Ob(view, f2);
        C786410Ut5.pc(view, f2);
        C786410Ut5.Jc(view, width2);
        C786410Ut5.ed(view, height2);
        final C0STE c0ste2 = this.LL;
        c0ste2.LLJJIII = f2;
        if (c0ste2.LLJL == EnumC719760SLe.ZOOM_FIX && f2 <= c0ste2.LLJJ) {
            final float translationX = c0ste2.LL.getTranslationX();
            final float translationY = c0ste2.LL.getTranslationY();
            final float fLIZLLL = c0ste2.LIZLLL(c0ste2.LL, translationX, true, null);
            final float fLIZLLL2 = c0ste2.LIZLLL(c0ste2.LL, translationY, false, null);
            if (translationX != fLIZLLL || translationY != fLIZLLL2) {
                ValueAnimator valueAnimator = c0ste2.LLLILZ;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setDuration(250L);
                valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(2.0f));
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0STC
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                        View view2 = c0ste2.LL;
                        float f8 = translationX;
                        C786410Ut5.Jc(view2, f8 + ((fLIZLLL - f8) * fFloatValue));
                        View view3 = c0ste2.LL;
                        float f9 = translationY;
                        C786410Ut5.ed(view3, f9 + ((fLIZLLL2 - f9) * fFloatValue));
                    }
                });
                valueAnimatorOfFloat.start();
                c0ste2.LLLILZ = valueAnimatorOfFloat;
            }
        }
        return Unit.LIZ;
    }
}
