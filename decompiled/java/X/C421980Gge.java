package X;

import Y.ARunnableS17S0101000_6;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Gge, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421980Gge extends LinearLayout {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public final int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public final List<ImageView> LLJ;
    public AnimatorSet LLJI;
    public int LLJIJIL;

    public final int getCurrentPosition() {
        return this.LLILZLL;
    }

    public final int getTotalCount() {
        return this.LLIZLLLIL;
    }

    public C421980Gge(Context context) {
        super(context, null, 0);
        this.LLILZ = 8;
        this.LLJ = new ArrayList();
        this.LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(4.0d)));
        this.LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(4.8d)));
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        this.LLILZIL = iLIZIZ;
        this.LLILLL = (iLIZIZ - this.LL) / 2;
        setWillNotDraw(false);
        setLayerType(1, null);
    }

    public final TransitionDrawable LIZIZ(int i) {
        boolean z = false;
        if (i >= 0 && i < this.LLIZLLLIL) {
            z = true;
        }
        if (!z || i >= ((ArrayList) this.LLJ).size()) {
            return null;
        }
        Drawable drawable = ((ImageView) ListProtector.get(this.LLJ, i)).getDrawable();
        if (drawable instanceof TransitionDrawable) {
            return (TransitionDrawable) drawable;
        }
        ((ImageView) ListProtector.get(this.LLJ, i)).setImageResource(R.drawable.bbm);
        Drawable drawable2 = ((ImageView) ListProtector.get(this.LLJ, i)).getDrawable();
        if (!(drawable2 instanceof TransitionDrawable)) {
            return null;
        }
        return (TransitionDrawable) drawable2;
    }

    public final void LIZLLL(int i) {
        boolean z;
        boolean z2;
        int i2;
        float x;
        int paddingStart;
        float f;
        if (i == this.LLILZLL) {
            return;
        }
        if (i >= 0 && i < this.LLIZLLLIL) {
            int i3 = this.LLIZLLLIL;
            int i4 = this.LLILZ;
            if (i3 <= i4) {
                this.LLIZ = i;
            } else {
                int i5 = i3 - (i4 - 1);
                if (i < i3 && i5 <= i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int i6 = i3 - i4;
                    i2 = (this.LL + this.LLILLL) * i6;
                    this.LLJIJIL = -i2;
                    this.LLIZ = (i - i3) + i4;
                    LIZJ(i6, 200L);
                    int i7 = this.LLIZLLLIL;
                    for (int i8 = i7 - (this.LLILZ - 1); i8 < i7; i8++) {
                        LJFF(i8);
                    }
                } else {
                    if (2 <= i && i < i5) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        this.LLIZ = 1;
                        int i9 = i - 1;
                        i2 = (this.LL + this.LLILLL) * i9;
                        int i10 = (i4 - 1) + i9;
                        LIZJ(i9, 200L);
                        LIZJ(i10, 0L);
                        for (int i11 = i; i11 < i10; i11++) {
                            LJFF(i11);
                        }
                    } else {
                        this.LLIZ = i;
                        this.LLJIJIL = 0;
                        int i12 = i4 - 1;
                        for (int i13 = 0; i13 < i12; i13++) {
                            LJFF(i13);
                        }
                        LIZJ(this.LLILZ - 1, 0L);
                        i2 = 0;
                    }
                }
                if (C444960Hcc.LIZJ(getContext())) {
                    if (true ^ ((ArrayList) this.LLJ).isEmpty()) {
                        x = ((View) ListProtector.get(this.LLJ, 0)).getX();
                        paddingStart = (getLayoutParams().width - this.LL) - getPaddingEnd();
                        f = x - paddingStart;
                    }
                    f = 0.0f;
                } else {
                    if (true ^ ((ArrayList) this.LLJ).isEmpty()) {
                        x = ((View) ListProtector.get(this.LLJ, 0)).getX();
                        paddingStart = getPaddingStart();
                        f = x - paddingStart;
                    }
                    f = 0.0f;
                }
                int i14 = this.LLIZLLLIL;
                for (int i15 = 0; i15 < i14; i15++) {
                    if (i15 < ((ArrayList) this.LLJ).size()) {
                        ImageView imageView = (ImageView) ListProtector.get(this.LLJ, i15);
                        C786410Ut5.Hd(imageView, (imageView.getX() - i2) - f);
                    }
                }
            }
            TransitionDrawable transitionDrawableLIZIZ = LIZIZ(this.LLILZLL);
            if (transitionDrawableLIZIZ != null) {
                transitionDrawableLIZIZ.reverseTransition(200);
            }
            TransitionDrawable transitionDrawableLIZIZ2 = LIZIZ(i);
            if (transitionDrawableLIZIZ2 != null) {
                transitionDrawableLIZIZ2.startTransition(200);
            }
            this.LLILZLL = i;
        }
    }

    public final void LJ(boolean z) {
        AnimatorSet animatorSet = this.LLJI;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        int i = this.LLIZLLLIL;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 < ((ArrayList) this.LLJ).size()) {
                C786410Ut5.Lc((ImageView) ListProtector.get(this.LLJ, i2), this.LLJIJIL);
            }
        }
        this.LLJI = new AnimatorSet();
        int i3 = this.LLILLL + this.LL;
        if (z) {
            i3 = -i3;
        }
        if (C444960Hcc.LIZIZ()) {
            i3 = -i3;
        }
        this.LLJIJIL += i3;
        int i4 = this.LLIZLLLIL;
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 < ((ArrayList) this.LLJ).size()) {
                View view = (View) ListProtector.get(this.LLJ, i5);
                AnimatorSet animatorSet2 = this.LLJI;
                if (animatorSet2 != null) {
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(view, "translationX", view.getTranslationX(), this.LLJIJIL));
                }
            }
        }
        AnimatorSet animatorSet3 = this.LLJI;
        if (animatorSet3 != null) {
            animatorSet3.setDuration(200L);
        }
        AnimatorSet animatorSet4 = this.LLJI;
        if (animatorSet4 != null) {
            animatorSet4.start();
        }
    }

    public final void LJFF(int i) {
        if (i < ((ArrayList) this.LLJ).size()) {
            ((ImageView) ListProtector.get(this.LLJ, i)).setImageResource(R.drawable.bbm);
        }
    }

    public final void setCount(int i) {
        if (this.LLIZLLLIL == i) {
            return;
        }
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        ((ArrayList) this.LLJ).clear();
        this.LLIZ = 0;
        this.LLILZLL = 0;
        this.LLJIJIL = 0;
        this.LLIZLLLIL = i;
        int i2 = this.LLILZIL;
        getLayoutParams().width = (i * i2) + getPaddingStart() + getPaddingEnd();
        getLayoutParams().height = i2 + getPaddingTop() + getPaddingBottom();
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = this.LL;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i4, i4);
            int i5 = this.LLILLL;
            layoutParams.setMargins(i5, i5, i5, i5);
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.bbm);
            C786410Ut5.c6(imageView, layoutParams);
            addView(imageView);
            ((ArrayList) this.LLJ).add(imageView);
        }
        TransitionDrawable transitionDrawableLIZIZ = LIZIZ(0);
        if (transitionDrawableLIZIZ != null) {
            transitionDrawableLIZIZ.startTransition(0);
        }
        LIZ((ImageView) ListProtector.get(this.LLJ, 0), true);
        int i6 = this.LLILZ;
        if (i > i6) {
            LIZJ(i6 - 1, 0L);
        }
    }

    public final void setSelectedIndex(int i) {
        int i2 = this.LLILZLL;
        if (i != i2 && i >= 0 && i < this.LLIZLLLIL) {
            if (this.LLIZLLLIL <= this.LLILZ) {
                if (Math.abs(i - i2) == 1) {
                    if (i > this.LLILZLL) {
                        TransitionDrawable transitionDrawableLIZIZ = LIZIZ(this.LLIZ);
                        if (transitionDrawableLIZIZ != null) {
                            transitionDrawableLIZIZ.reverseTransition(200);
                        }
                        TransitionDrawable transitionDrawableLIZIZ2 = LIZIZ(this.LLILZLL + 1);
                        if (transitionDrawableLIZIZ2 != null) {
                            transitionDrawableLIZIZ2.startTransition(200);
                        }
                        LIZ((ImageView) ListProtector.get(this.LLJ, this.LLILZLL + 1), true);
                        LIZ((ImageView) ListProtector.get(this.LLJ, this.LLIZ), false);
                        this.LLILZLL++;
                        this.LLIZ++;
                        return;
                    }
                    TransitionDrawable transitionDrawableLIZIZ3 = LIZIZ(this.LLIZ);
                    if (transitionDrawableLIZIZ3 != null) {
                        transitionDrawableLIZIZ3.reverseTransition(200);
                    }
                    TransitionDrawable transitionDrawableLIZIZ4 = LIZIZ(this.LLILZLL - 1);
                    if (transitionDrawableLIZIZ4 != null) {
                        transitionDrawableLIZIZ4.startTransition(200);
                    }
                    LIZ((ImageView) ListProtector.get(this.LLJ, this.LLILZLL - 1), true);
                    LIZ((ImageView) ListProtector.get(this.LLJ, this.LLIZ), false);
                    this.LLILZLL--;
                    this.LLIZ--;
                    return;
                }
                LIZLLL(i);
                return;
            }
            if (Math.abs(i - i2) == 1) {
                int i3 = this.LLILZLL;
                if (i > i3) {
                    int i4 = this.LLILZ / 2;
                    int i5 = this.LLIZ;
                    if (i5 == i4 && i3 != this.LLIZLLLIL - i4) {
                        LJ(true);
                        int i6 = this.LLILZLL;
                        if (i6 != (this.LLIZLLLIL - i4) - 1) {
                            LIZJ(i6 + i4, 200);
                        }
                        LJFF(this.LLILZLL + ((this.LLILZ - i4) - 1));
                        LIZJ(this.LLILZLL - (i4 - 1), 200);
                    } else {
                        this.LLIZ = i5 + 1;
                    }
                    TransitionDrawable transitionDrawableLIZIZ5 = LIZIZ(this.LLILZLL);
                    if (transitionDrawableLIZIZ5 != null) {
                        transitionDrawableLIZIZ5.reverseTransition(200);
                    }
                    TransitionDrawable transitionDrawableLIZIZ6 = LIZIZ(this.LLILZLL + 1);
                    if (transitionDrawableLIZIZ6 != null) {
                        transitionDrawableLIZIZ6.startTransition(200);
                    }
                    this.LLILZLL++;
                    return;
                }
                int i7 = this.LLILZ / 2;
                int i8 = this.LLIZ;
                if (i8 == i7 && i3 != i7) {
                    LJ(false);
                    if (this.LLILZLL != i7 + 1) {
                        LIZJ((r1 - i7) - 1, 200);
                    }
                    LJFF(this.LLILZLL - i7);
                    LIZJ((this.LLILZLL + i7) - 2, 200);
                } else {
                    this.LLIZ = i8 - 1;
                }
                TransitionDrawable transitionDrawableLIZIZ7 = LIZIZ(this.LLILZLL);
                if (transitionDrawableLIZIZ7 != null) {
                    transitionDrawableLIZIZ7.reverseTransition(200);
                }
                TransitionDrawable transitionDrawableLIZIZ8 = LIZIZ(this.LLILZLL - 1);
                if (transitionDrawableLIZIZ8 != null) {
                    transitionDrawableLIZIZ8.startTransition(200);
                }
                this.LLILZLL--;
                return;
            }
            LIZLLL(i);
        }
    }

    public final void setSmallDot(int i) {
        if (Math.abs(i - this.LLILZLL) > 1 && i < this.LLIZLLLIL && i < ((ArrayList) this.LLJ).size()) {
            ((ImageView) ListProtector.get(this.LLJ, i)).setImageResource(R.drawable.bbp);
        }
    }

    public final void LIZ(ImageView imageView, boolean z) {
        float f;
        if (z) {
            f = this.LLILLJJLI / this.LL;
        } else {
            f = 1.0f;
        }
        imageView.animate().scaleX(f).scaleY(f).setDuration(200L).start();
    }

    public final void LIZJ(int i, long j) {
        if (j == 0) {
            setSmallDot(i);
        } else {
            HandlerHook.viewPostDelay(this, new ARunnableS17S0101000_6(i, this, 9), j);
        }
    }
}
