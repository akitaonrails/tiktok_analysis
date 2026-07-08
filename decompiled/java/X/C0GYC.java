package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: renamed from: X.0GYC, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GYC extends LinearLayout {
    public final ArrayList<View> LL;
    public final ArrayList<ValueAnimator> LLILLJJLI;
    public final Random LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public final int LLJ;
    public final long LLJI;

    public final int getViewAnimatorHeight() {
        float fNextInt = this.LLILLL.nextInt(10) / 10.0f;
        double d = fNextInt;
        if (d > 0.9d) {
            return this.LLILZ;
        }
        if (d < 0.2d) {
            return this.LLILZIL;
        }
        int i = this.LLILZ;
        int i2 = (int) (((i - r2) * fNextInt) + this.LLILZIL);
        return i2 > i ? i : i2;
    }

    public C0GYC(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, 0);
        this.LL = new ArrayList<>();
        this.LLILLJJLI = new ArrayList<>();
        this.LLILLL = new Random();
        if (attributeSet != null && (typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ttlive_chat_audio_wave)) != null) {
            this.LLILZ = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.ttlive_chat_audio_wave_wave_max_height, C497740JfY.LIZIZ(24.0f));
            this.LLILZIL = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.ttlive_chat_audio_wave_wave_min_height, C497740JfY.LIZIZ(4.0f));
            this.LLILZLL = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.ttlive_chat_audio_wave_wave_margin, C497740JfY.LIZIZ(4.0f));
            this.LLIZ = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.ttlive_chat_audio_wave_wave_width, C497740JfY.LIZIZ(2.0f));
            this.LLIZLLLIL = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.ttlive_chat_audio_wave_wave_corner, C497740JfY.LIZIZ(1.0f));
            this.LLJ = typedArrayObtainStyledAttributes.getInt(R$styleable.ttlive_chat_audio_wave_wave_count, 13);
            this.LLJI = typedArrayObtainStyledAttributes.getInt(R$styleable.ttlive_chat_audio_wave_wave_animator_time, 600);
            typedArrayObtainStyledAttributes.recycle();
        }
        int i = this.LLJ;
        for (int i2 = 0; i2 < i; i2++) {
            final View view = new View(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.LLIZ, this.LLILZIL);
            int i3 = this.LLILZLL >> 1;
            layoutParams.setMargins(i3, 0, i3, 0);
            C786410Ut5.W5(view, layoutParams);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(this.LLIZLLLIL);
            gradientDrawable.setColor(-1);
            view.setBackground(gradientDrawable);
            this.LL.add(view);
            addView(view);
            ArrayList<ValueAnimator> arrayList = this.LLILLJJLI;
            final ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(1, 2);
            valueAnimatorOfInt.setRepeatCount(-1);
            valueAnimatorOfInt.setDuration(this.LLJI);
            valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(view) { // from class: X.0GUf
                public final View LL;

                {
                    this.LL = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    View view2 = this.LL;
                    view2.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    view2.requestLayout();
                }
            });
            valueAnimatorOfInt.addListener(new AnimatorListenerAdapter(this, valueAnimatorOfInt) { // from class: X.0GYB
                public final C0GYC LL;
                public final ValueAnimator LLILLJJLI;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                    ValueAnimator valueAnimator = this.LLILLJJLI;
                    int viewAnimatorHeight = this.LL.getViewAnimatorHeight();
                    int i4 = this.LL.LLILZIL;
                    valueAnimator.setIntValues(i4, viewAnimatorHeight, i4);
                }

                {
                    this.LL = this;
                    this.LLILLJJLI = valueAnimatorOfInt;
                }
            });
            arrayList.add(valueAnimatorOfInt);
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        if (i != 0) {
            Iterator<ValueAnimator> it2 = this.LLILLJJLI.iterator();
            while (it2.hasNext()) {
                it2.next().cancel();
            }
        }
    }
}
