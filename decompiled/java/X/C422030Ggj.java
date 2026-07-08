package X;

import Y.ARunnableS17S0101000_6;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0Ggj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C422030Ggj extends LinearLayout {
    public SafeHandler LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public final ArrayList<ImageView> LLIZ;
    public boolean LLIZLLLIL;
    public AnimatorSet LLJ;
    public int LLJI;
    public final Paint LLJIJIL;

    public int getDotIndicatorBackground() {
        return R.drawable.bbp;
    }

    public int getDotIndicatorSelectedBackground() {
        return R.drawable.bbo;
    }

    private final int getLastRealPos() {
        return this.LLILZLL - 1;
    }

    private final int getLeftBoundPos() {
        return this.LLILZ - this.LLILZIL;
    }

    public Rect getContentRect() {
        if (this.LLILZLL > 4) {
            return new Rect(getPaddingStart(), getPaddingTop(), getMeasuredWidth() - getPaddingEnd(), getMeasuredHeight() - getPaddingBottom());
        }
        int measuredWidth = (getMeasuredWidth() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72))) / 2;
        return new Rect(measuredWidth, getPaddingTop(), getMeasuredWidth() - measuredWidth, getMeasuredHeight() - getPaddingBottom());
    }

    private final int getRightBoundPos() {
        return (getLeftBoundPos() + 6) - 1;
    }

    public final void LIZLLL() {
        if (getLeftBoundPos() == 0) {
            LIZ(0);
        } else {
            LJ(getLeftBoundPos(), 200L);
        }
        if (getRightBoundPos() == getLastRealPos()) {
            LIZ(getLastRealPos());
        } else {
            LJ(getRightBoundPos(), 200L);
        }
    }

    public int getCurrentIndex() {
        return this.LLILZIL;
    }

    public final void LIZ(int i) {
        if (i < this.LLIZ.size()) {
            ((ImageView) ListProtector.get(this.LLIZ, i)).setImageResource(getDotIndicatorSelectedBackground());
            C786410Ut5.V4((ImageView) ListProtector.get(this.LLIZ, i), 0.6f);
        }
    }

    public final ImageView LIZIZ(int i) {
        if (i >= 0 && i < this.LLIZ.size()) {
            return (ImageView) ListProtector.get(this.LLIZ, i);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054 A[LOOP:1: B:29:0x0052->B:30:0x0054, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(int r10) {
        /*
            r9 = this;
            int r0 = r9.LLILZ
            if (r10 != r0) goto L5
            return
        L5:
            r7 = 0
            if (r10 < 0) goto Lb7
            int r0 = r9.LLILZLL
            if (r10 >= r0) goto Lb7
            int r5 = r9.LLILZLL
            r0 = 6
            r3 = 200(0xc8, double:9.9E-322)
            r1 = 0
            if (r5 > r0) goto L2f
            r9.LLILZIL = r10
        L17:
            int r0 = r9.LLILZ
            android.widget.ImageView r0 = r9.LIZIZ(r0)
            if (r0 == 0) goto L25
            r9.LJFF(r0, r1)
            r9.LJI(r0, r3)
        L25:
            android.widget.ImageView r0 = r9.LIZIZ(r10)
            r9.LJFF(r0, r3)
            r9.LLILZ = r10
            return
        L2f:
            r0 = 4
            if (r10 < 0) goto L95
            if (r10 >= r0) goto L65
            r9.LLILZIL = r10
            r5 = 0
        L37:
            r9.LIZ(r5)
            int r5 = r5 + 1
            r0 = 5
            if (r5 < r0) goto L37
            r9.LJ(r0, r1)
        L42:
            r8 = 0
        L43:
            android.content.Context r0 = r9.getContext()
            boolean r0 = X.C444960Hcc.LIZJ(r0)
            if (r0 != 0) goto L4e
            int r8 = -r8
        L4e:
            r9.LLJI = r8
            int r6 = r9.LLILZLL
        L52:
            if (r7 >= r6) goto L17
            java.util.ArrayList<android.widget.ImageView> r0 = r9.LLIZ
            java.lang.Object r5 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r7)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            int r0 = r9.LLJI
            float r0 = (float) r0
            X.C786410Ut5.Lc(r5, r0)
            int r7 = r7 + 1
            goto L52
        L65:
            int r0 = r5 + (-3)
            if (r10 > r0) goto L95
            r0 = 3
            r9.LLILZIL = r0
            int r6 = r10 + (-3)
            int r8 = r9.LLILLJJLI
            int r0 = r9.LLILLL
            int r8 = r8 + r0
            int r8 = r8 * r6
            r9.LJ(r6, r3)
            int r5 = r9.LLILZLL
            int r0 = r5 + (-4)
            if (r10 > r0) goto L82
            int r5 = r10 + 2
            r9.LJ(r5, r1)
        L82:
            r0 = r10
        L83:
            if (r0 >= r5) goto L8b
            r9.LIZ(r0)
            int r0 = r0 + 1
            goto L83
        L8b:
            int r0 = r6 + 1
        L8d:
            if (r0 >= r10) goto L43
            r9.LIZ(r0)
            int r0 = r0 + 1
            goto L8d
        L95:
            int r0 = r5 + (-2)
            if (r10 >= r5) goto L42
            if (r0 > r10) goto L42
            int r6 = r5 + (-6)
            int r5 = r9.LLILLJJLI
            int r0 = r9.LLILLL
            int r5 = r5 + r0
            int r8 = r6 * r5
            int r0 = r10 - r6
            r9.LLILZIL = r0
            r9.LJ(r6, r3)
            int r5 = r9.LLILZLL
            int r0 = r5 + (-5)
        Laf:
            if (r0 >= r5) goto L43
            r9.LIZ(r0)
            int r0 = r0 + 1
            goto Laf
        Lb7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C422030Ggj.LIZJ(int):void");
    }

    public final void LJII(boolean z) {
        AnimatorSet animatorSet = this.LLJ;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.LLJ;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            int i = this.LLILZLL;
            for (int i2 = 0; i2 < i; i2++) {
                C786410Ut5.Lc((ImageView) ListProtector.get(this.LLIZ, i2), this.LLJI);
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
        int i4 = this.LLILZLL;
        for (int i5 = 0; i5 < i4; i5++) {
            View view = (View) ListProtector.get(this.LLIZ, i5);
            AnimatorSet animatorSet3 = this.LLJ;
            if (animatorSet3 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(view, "translationX", view.getTranslationX(), this.LLJI));
            }
        }
        AnimatorSet animatorSet4 = this.LLJ;
        if (animatorSet4 != null) {
            animatorSet4.setDuration(200L);
        }
        AnimatorSet animatorSet5 = this.LLJ;
        if (animatorSet5 != null) {
            animatorSet5.start();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.LLIZLLLIL && Build.VERSION.SDK_INT >= 28) {
            canvas.drawRect(getContentRect(), this.LLJIJIL);
        }
    }

    public void setCount(int i) {
        int i2;
        int i3;
        if (i <= 1) {
            return;
        }
        SafeHandler safeHandler = this.LL;
        if (safeHandler != null) {
            safeHandler.removeCallbacksAndMessages(null);
        }
        this.LLILZIL = 0;
        this.LLILZLL = i;
        if (i >= 6) {
            i2 = this.LLILLJJLI * 6;
            i3 = this.LLILLL * 5;
        } else {
            i2 = this.LLILLJJLI * i;
            i3 = (i - 1) * this.LLILLL;
        }
        int i4 = i2 + i3;
        if (this.LLIZLLLIL) {
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(49));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(66));
            setPadding(iLIZIZ2, iLIZIZ, iLIZIZ2, iLIZIZ);
        } else {
            setPadding(0, 0, 0, 0);
        }
        getLayoutParams().width = i4 + getPaddingStart() + getPaddingEnd();
        getLayoutParams().height = this.LLILLJJLI + getPaddingTop() + getPaddingBottom();
        if (this.LLIZ.size() < i) {
            int size = this.LLIZ.size();
            for (int i5 = 0; i5 < size; i5++) {
                LIZ(i5);
            }
            for (int size2 = this.LLIZ.size(); size2 < i; size2++) {
                int i6 = this.LLILLJJLI;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i6, i6);
                if (size2 > 0) {
                    if (C444960Hcc.LIZJ(getContext())) {
                        layoutParams.setMargins(0, 0, this.LLILLL, 0);
                    } else {
                        layoutParams.setMargins(this.LLILLL, 0, 0, 0);
                    }
                }
                ImageView imageView = new ImageView(getContext());
                imageView.setImageResource(getDotIndicatorSelectedBackground());
                C786410Ut5.V4(imageView, 0.6f);
                C786410Ut5.c6(imageView, layoutParams);
                addView(imageView);
                this.LLIZ.add(imageView);
            }
        } else {
            int size3 = this.LLIZ.size();
            for (int i7 = i; i7 < size3; i7++) {
                ImageView imageViewLIZIZ = LIZIZ(i7);
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, imageViewLIZIZ);
                removeView(imageViewLIZIZ);
                C19719512Dh.LIZ(this.LLIZ).remove(imageViewLIZIZ);
            }
            int size4 = this.LLIZ.size();
            for (int i8 = 0; i8 < size4; i8++) {
                LIZ(i8);
            }
        }
        int i9 = this.LLILZ;
        if (i9 != 0) {
            LJI(LIZIZ(i9), 0L);
        }
        this.LLILZ = 0;
        LJFF(LIZIZ(0), 0L);
        if (i > 6) {
            LJ(5, 0L);
        }
    }

    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        if (this.LL == null) {
            this.LL = new SafeHandler(lifecycleOwner);
        }
    }

    public void setSelectedIndex(int i) {
        boolean z;
        int i2 = this.LLILZ;
        if (i == i2) {
            return;
        }
        boolean z2 = false;
        if (i >= 0 && i < this.LLILZLL) {
            if (this.LLILZLL <= 6) {
                if (Math.abs(i - i2) == 1) {
                    if (i > this.LLILZ) {
                        LJI(LIZIZ(this.LLILZIL), 200L);
                        LJFF(LIZIZ(this.LLILZ + 1), 200L);
                        this.LLILZ++;
                        this.LLILZIL++;
                        return;
                    }
                    LJI(LIZIZ(this.LLILZIL), 200L);
                    LJFF(LIZIZ(this.LLILZ - 1), 200L);
                    this.LLILZ--;
                    this.LLILZIL--;
                    return;
                }
                LIZJ(i);
                return;
            }
            if (Math.abs(i - i2) == 1) {
                if (i > this.LLILZ) {
                    if (getLastRealPos() - getRightBoundPos() > 0) {
                        z2 = true;
                    }
                    LJI(LIZIZ(this.LLILZ), 200L);
                    this.LLILZ++;
                    int i3 = this.LLILZIL;
                    if (i3 >= 4 && z2) {
                        LJII(true);
                        LIZLLL();
                    } else {
                        this.LLILZIL = i3 + 1;
                    }
                    LJFF(LIZIZ(this.LLILZ), 200L);
                    return;
                }
                if (getLeftBoundPos() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                LJI(LIZIZ(this.LLILZ), 200L);
                this.LLILZ--;
                int i4 = this.LLILZIL;
                if (i4 <= 1 && z) {
                    LJII(false);
                    LIZLLL();
                } else {
                    this.LLILZIL = i4 - 1;
                }
                LJFF(LIZIZ(this.LLILZ), 200L);
                return;
            }
            LIZJ(i);
        }
    }

    public C422030Ggj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLIZ = new ArrayList<>();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-16777216);
        paint.setAlpha(178);
        paint.setMaskFilter(new BlurMaskFilter(C418440Gaw.LIZIZ(48), BlurMaskFilter.Blur.NORMAL));
        this.LLJIJIL = paint;
        this.LLILLJJLI = C341940Daq.LIZ(6.0d);
        this.LLILLL = C341940Daq.LIZ(6.0d);
        setWillNotDraw(false);
        setLayerType(2, null);
    }

    public final void LJ(int i, long j) {
        if (j <= 0) {
            if (i < this.LLIZ.size()) {
                C786410Ut5.V4((ImageView) ListProtector.get(this.LLIZ, i), 1.0f);
                ((ImageView) ListProtector.get(this.LLIZ, i)).setImageResource(getDotIndicatorBackground());
                return;
            }
            return;
        }
        SafeHandler safeHandler = this.LL;
        if (safeHandler == null) {
            return;
        }
        safeHandler.postDelayed(new ARunnableS17S0101000_6(i, this, 3), j);
    }

    public final void LJFF(ImageView imageView, long j) {
        if (imageView == null) {
            return;
        }
        imageView.setImageResource(getDotIndicatorSelectedBackground());
        C786410Ut5.V4(imageView, 0.6f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "alpha", 0.6f, 1.0f);
        objectAnimatorOfFloat.setDuration(j);
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    public final void LJI(ImageView imageView, long j) {
        if (imageView == null) {
            return;
        }
        imageView.setImageResource(getDotIndicatorSelectedBackground());
        C786410Ut5.V4(imageView, 1.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "alpha", 1.0f, 0.6f);
        objectAnimatorOfFloat.setDuration(j);
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }
}
