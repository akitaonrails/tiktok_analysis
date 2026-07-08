package X;

import Y.ARunnableS17S0101000_6;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0Ggi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C422020Ggi extends LinearLayout implements InterfaceC19717212Ck {
    public SafeHandler LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public final int LLILZLL;
    public int LLIZ;
    public final ArrayList<ImageView> LLIZLLLIL;
    public AnimatorSet LLJ;
    public int LLJI;
    public final Paint LLJIJIL;
    public boolean LLJILJIL;

    private final Rect getContentRect() {
        if (this.LLIZ > 4) {
            return new Rect(getPaddingStart(), getPaddingTop(), getMeasuredWidth() - getPaddingEnd(), getMeasuredHeight() - getPaddingBottom());
        }
        int measuredWidth = ((int) (getMeasuredWidth() - C11VU.LIZ(72.0f))) / 2;
        return new Rect(measuredWidth, getPaddingTop(), getMeasuredWidth() - measuredWidth, getMeasuredHeight() - getPaddingBottom());
    }

    @Override // X.InterfaceC19717212Ck
    public final void hide() {
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
    }

    @Override // X.InterfaceC19717212Ck
    public final void show() {
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
    }

    private final void setProgress(int i) {
        int i2 = this.LLILZ;
        this.LLJILJIL = true;
        if (i > i2) {
            if (i2 <= i) {
                while (true) {
                    setSelectedIndex(i2);
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        } else if (i <= i2) {
            while (true) {
                setSelectedIndex(i2);
                if (i2 == i) {
                    break;
                } else {
                    i2--;
                }
            }
        }
        this.LLJILJIL = false;
    }

    @Override // X.InterfaceC19717212Ck
    public final void LIZ(int i) {
        setSelectedIndex(i);
    }

    public final TransitionDrawable LIZJ(int i) {
        if (i >= 0 && i < this.LLIZ) {
            Drawable drawable = ((ImageView) ListProtector.get(this.LLIZLLLIL, i)).getDrawable();
            if (drawable instanceof TransitionDrawable) {
                return (TransitionDrawable) drawable;
            }
            ((ImageView) ListProtector.get(this.LLIZLLLIL, i)).setImageResource(R.drawable.aat);
            return (TransitionDrawable) ((ImageView) ListProtector.get(this.LLIZLLLIL, i)).getDrawable();
        }
        return null;
    }

    public final void LIZLLL(int i) {
        float x;
        int paddingStart;
        if (i != this.LLILZ && i >= 0 && i < this.LLIZ) {
            int i2 = this.LLIZ;
            int i3 = this.LLILZLL;
            if (i2 <= i3) {
                this.LLILZIL = i;
            } else {
                int i4 = i2 - (i3 - 1);
                if (i < i2 && i4 <= i) {
                    setProgress(i);
                    return;
                }
                if (2 <= i) {
                    if (i < i4) {
                        setProgress(i);
                        return;
                    }
                } else if (i >= 0 && i < 2) {
                    this.LLILZIL = i;
                    this.LLJI = 0;
                    int i5 = i3 - 1;
                    for (int i6 = 0; i6 < i5; i6++) {
                        ((ImageView) ListProtector.get(this.LLIZLLLIL, i6)).setImageResource(R.drawable.aat);
                    }
                    LIZIZ(this.LLILZLL - 1, 0L);
                }
                if (C444960Hcc.LIZJ(getContext())) {
                    x = ((View) ListProtector.get(this.LLIZLLLIL, 0)).getX();
                    paddingStart = (getLayoutParams().width - this.LLILLJJLI) - getPaddingEnd();
                } else {
                    x = ((View) ListProtector.get(this.LLIZLLLIL, 0)).getX();
                    paddingStart = getPaddingStart();
                }
                float f = x - paddingStart;
                int i7 = this.LLIZ;
                for (int i8 = 0; i8 < i7; i8++) {
                    ImageView imageView = (ImageView) ListProtector.get(this.LLIZLLLIL, i8);
                    C786410Ut5.Hd(imageView, (imageView.getX() - 0) - f);
                }
            }
            TransitionDrawable transitionDrawableLIZJ = LIZJ(this.LLILZ);
            if (transitionDrawableLIZJ != null) {
                transitionDrawableLIZJ.reverseTransition(200);
            }
            TransitionDrawable transitionDrawableLIZJ2 = LIZJ(i);
            if (transitionDrawableLIZJ2 != null) {
                transitionDrawableLIZJ2.startTransition(200);
            }
            this.LLILZ = i;
        }
    }

    public final void LJ(boolean z) {
        long j;
        AnimatorSet animatorSet = this.LLJ;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.LLJ;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            int i = this.LLIZ;
            for (int i2 = 0; i2 < i; i2++) {
                C786410Ut5.Lc((ImageView) ListProtector.get(this.LLIZLLLIL, i2), this.LLJI);
            }
        }
        this.LLJ = new AnimatorSet();
        int i3 = this.LLILLL + this.LLILLJJLI;
        if (z) {
            i3 = -i3;
        }
        if (C444960Hcc.LIZIZ()) {
            i3 = -i3;
        }
        this.LLJI += i3;
        int i4 = this.LLIZ;
        for (int i5 = 0; i5 < i4; i5++) {
            View view = (View) ListProtector.get(this.LLIZLLLIL, i5);
            AnimatorSet animatorSet3 = this.LLJ;
            if (animatorSet3 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(view, "translationX", view.getTranslationX(), this.LLJI));
            }
        }
        if (this.LLJILJIL) {
            j = 0;
        } else {
            j = 200;
        }
        AnimatorSet animatorSet4 = this.LLJ;
        if (animatorSet4 != null) {
            animatorSet4.setDuration(j);
        }
        AnimatorSet animatorSet5 = this.LLJ;
        if (animatorSet5 != null) {
            animatorSet5.start();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(getContentRect(), this.LLJIJIL);
    }

    @Override // X.InterfaceC19717212Ck
    public void setCount(int i) {
        int i2;
        int i3;
        SafeHandler safeHandler = this.LL;
        if (safeHandler != null) {
            safeHandler.removeCallbacksAndMessages(null);
        }
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        this.LLIZLLLIL.clear();
        this.LLILZIL = 0;
        this.LLILZ = 0;
        this.LLIZ = i;
        this.LLJI = 0;
        if (i <= 1) {
            return;
        }
        int i4 = this.LLILZLL;
        if (i >= i4) {
            i3 = this.LLILLJJLI * i4;
            i2 = (i4 - 1) * this.LLILLL;
        } else {
            i2 = this.LLILLJJLI * i;
            i3 = (i - 1) * this.LLILLL;
        }
        getLayoutParams().width = i3 + i2 + getPaddingStart() + getPaddingEnd();
        getLayoutParams().height = this.LLILLJJLI + getPaddingTop() + getPaddingBottom();
        int i5 = 0;
        do {
            int i6 = this.LLILLJJLI;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i6, i6);
            if (i5 > 0) {
                if (C444960Hcc.LIZJ(getContext())) {
                    layoutParams.setMargins(0, 0, this.LLILLL, 0);
                } else {
                    layoutParams.setMargins(this.LLILLL, 0, 0, 0);
                }
            }
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.aat);
            C786410Ut5.c6(imageView, layoutParams);
            addView(imageView);
            this.LLIZLLLIL.add(imageView);
            i5++;
        } while (i5 < i);
        TransitionDrawable transitionDrawableLIZJ = LIZJ(0);
        if (transitionDrawableLIZJ != null) {
            transitionDrawableLIZJ.startTransition(0);
        }
        int i7 = this.LLILZLL;
        if (i > i7) {
            LIZIZ(i7 - 1, 0L);
        }
    }

    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        if (this.LL == null) {
            this.LL = new SafeHandler(lifecycleOwner);
        }
    }

    public final void setSelectedIndex(int i) {
        int i2 = this.LLILZ;
        if (i == i2) {
            return;
        }
        int i3 = 0;
        if (i >= 0 && i < this.LLIZ) {
            int i4 = 200;
            if (this.LLIZ <= this.LLILZLL) {
                if (Math.abs(i - i2) == 1) {
                    if (i > this.LLILZ) {
                        TransitionDrawable transitionDrawableLIZJ = LIZJ(this.LLILZIL);
                        if (transitionDrawableLIZJ != null) {
                            transitionDrawableLIZJ.reverseTransition(200);
                        }
                        TransitionDrawable transitionDrawableLIZJ2 = LIZJ(this.LLILZ + 1);
                        if (transitionDrawableLIZJ2 != null) {
                            transitionDrawableLIZJ2.startTransition(200);
                        }
                        this.LLILZ++;
                        this.LLILZIL++;
                        return;
                    }
                    TransitionDrawable transitionDrawableLIZJ3 = LIZJ(this.LLILZIL);
                    if (transitionDrawableLIZJ3 != null) {
                        transitionDrawableLIZJ3.reverseTransition(200);
                    }
                    TransitionDrawable transitionDrawableLIZJ4 = LIZJ(this.LLILZ - 1);
                    if (transitionDrawableLIZJ4 != null) {
                        transitionDrawableLIZJ4.startTransition(200);
                    }
                    this.LLILZ--;
                    this.LLILZIL--;
                    return;
                }
                LIZLLL(i);
                return;
            }
            if (Math.abs(i - i2) == 1) {
                int i5 = this.LLILZ;
                if (i > i5) {
                    int i6 = this.LLILZLL / 2;
                    if (!this.LLJILJIL) {
                        i3 = 200;
                    }
                    int i7 = this.LLILZIL;
                    if (i7 == i6 && i5 != this.LLIZ - i6) {
                        LJ(true);
                        int i8 = this.LLILZ;
                        if (i8 != (this.LLIZ - i6) - 1) {
                            LIZIZ(i8 + i6, i3);
                        }
                        ((ImageView) ListProtector.get(this.LLIZLLLIL, this.LLILZ + ((this.LLILZLL - i6) - 1))).setImageResource(R.drawable.aat);
                        LIZIZ(this.LLILZ - (i6 - 1), i3);
                    } else {
                        this.LLILZIL = i7 + 1;
                    }
                    TransitionDrawable transitionDrawableLIZJ5 = LIZJ(this.LLILZ);
                    if (transitionDrawableLIZJ5 != null) {
                        transitionDrawableLIZJ5.reverseTransition(i3);
                    }
                    TransitionDrawable transitionDrawableLIZJ6 = LIZJ(this.LLILZ + 1);
                    if (transitionDrawableLIZJ6 != null) {
                        transitionDrawableLIZJ6.startTransition(i3);
                    }
                    this.LLILZ++;
                    return;
                }
                int i9 = this.LLILZLL / 2;
                if (this.LLJILJIL) {
                    i4 = 0;
                }
                int i10 = this.LLILZIL;
                if (i10 == i9 && i5 != i9) {
                    LJ(false);
                    int i11 = this.LLILZ;
                    if (i11 != i9 + 1) {
                        LIZIZ((i11 - i9) - 1, i4);
                    }
                    ((ImageView) ListProtector.get(this.LLIZLLLIL, this.LLILZ - i9)).setImageResource(R.drawable.aat);
                    LIZIZ((this.LLILZ + i9) - 2, i4);
                } else {
                    this.LLILZIL = i10 - 1;
                }
                TransitionDrawable transitionDrawableLIZJ7 = LIZJ(this.LLILZ);
                if (transitionDrawableLIZJ7 != null) {
                    transitionDrawableLIZJ7.reverseTransition(i4);
                }
                TransitionDrawable transitionDrawableLIZJ8 = LIZJ(this.LLILZ - 1);
                if (transitionDrawableLIZJ8 != null) {
                    transitionDrawableLIZJ8.startTransition(i4);
                }
                this.LLILZ--;
                return;
            }
            LIZLLL(i);
        }
    }

    public final void setSmallDot(int i) {
        if (Math.abs(i - this.LLILZ) > 1 && i < this.LLIZ) {
            ((ImageView) ListProtector.get(this.LLIZLLLIL, i)).setImageResource(R.drawable.aaw);
        }
    }

    public C422020Ggi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZLL = 6;
        this.LLIZLLLIL = new ArrayList<>();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(ColorProtector.parseColor("#B2000000"));
        paint.setMaskFilter(new BlurMaskFilter(C11VU.LIZIZ(48.0f, context), BlurMaskFilter.Blur.NORMAL));
        this.LLJIJIL = paint;
        this.LLILLJJLI = C341940Daq.LIZ(6.0d);
        this.LLILLL = C341940Daq.LIZ(6.0d);
        setWillNotDraw(false);
        setLayerType(1, null);
    }

    public final void LIZIZ(int i, long j) {
        if (j == 0) {
            setSmallDot(i);
            return;
        }
        SafeHandler safeHandler = this.LL;
        if (safeHandler == null) {
            return;
        }
        safeHandler.postDelayed(new ARunnableS17S0101000_6(i, this, 11), j);
    }
}
