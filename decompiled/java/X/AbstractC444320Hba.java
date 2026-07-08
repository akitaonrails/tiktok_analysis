package X;

import Y.ARunnableS17S0101000_6;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.base.SafeHandler;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0Hba, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC444320Hba extends LinearLayout implements C0SC9 {
    public static final long LLJILJIL;
    public static double LLJILJILJ;
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
    public final C01GW LLJIJIL;

    public abstract int getDotIndicatorBackground();

    public float getDotIndicatorBackgroundAlpha() {
        return 0.6f;
    }

    public abstract int getDotIndicatorSelectedBackground();

    @Override // X.C0SC9
    public View getView() {
        return this;
    }

    private final int getLastRealPos() {
        return this.LLILZLL - 1;
    }

    private final int getLeftBoundPos() {
        return this.LLILZ - this.LLILZIL;
    }

    private final Paint getTransPaint() {
        return (Paint) this.LLJIJIL.getValue();
    }

    public Rect getContentRect() {
        if (this.LLILZLL > 4) {
            return new Rect(getPaddingStart(), getPaddingTop(), getMeasuredWidth() - getPaddingEnd(), getMeasuredHeight() - getPaddingBottom());
        }
        int measuredWidth = ((int) (getMeasuredWidth() - C11VU.LIZ(72.0f))) / 2;
        return new Rect(measuredWidth, getPaddingTop(), getMeasuredWidth() - measuredWidth, getMeasuredHeight() - getPaddingBottom());
    }

    static {
        LLJILJIL = C04WZ.LIZ() ? 100L : 200L;
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        LLJILJILJ = c19252910Tv.LIZLLL().LJIJI().LLFF().LIZLLL(null, null) ? 7.0d : 6.0d;
        c19252910Tv.LIZLLL().LJIJI().LLFF().LIZLLL(null, null);
    }

    private final int getRightBoundPos() {
        return (getLeftBoundPos() + 6) - 1;
    }

    public final void LJFF() {
        if (getLeftBoundPos() == 0) {
            LIZIZ(0);
        } else {
            LJI(getLeftBoundPos(), LLJILJIL);
        }
        if (getRightBoundPos() == getLastRealPos()) {
            LIZIZ(getLastRealPos());
        } else {
            LJI(getRightBoundPos(), LLJILJIL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c A[LOOP:1: B:26:0x004a->B:27:0x004c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void LIZLLL(int r9) {
        /*
            r8 = this;
            int r0 = r8.LLILZ
            if (r9 != r0) goto L5
            return
        L5:
            r5 = 0
            if (r9 < 0) goto Lb3
            int r0 = r8.LLILZLL
            if (r9 >= r0) goto Lb3
            int r3 = r8.LLILZLL
            r0 = 6
            r1 = 0
            if (r3 > r0) goto L27
            r8.LLILZIL = r9
        L15:
            int r0 = r8.LLILZ
            r8.LJII(r0, r1)
            int r2 = r8.LLILZ
            long r0 = X.AbstractC444320Hba.LLJILJIL
            r8.LJIIIIZZ(r2, r0)
            r8.LJII(r9, r0)
            r8.LLILZ = r9
            return
        L27:
            r0 = 4
            if (r9 < 0) goto L8f
            if (r9 >= r0) goto L5d
            r8.LLILZIL = r9
            r3 = 0
        L2f:
            r8.LIZIZ(r3)
            int r3 = r3 + 1
            r0 = 5
            if (r3 < r0) goto L2f
            r8.LJI(r0, r1)
        L3a:
            r7 = 0
        L3b:
            android.content.Context r0 = r8.getContext()
            boolean r0 = X.C444960Hcc.LIZJ(r0)
            if (r0 != 0) goto L46
            int r7 = -r7
        L46:
            r8.LLJI = r7
            int r4 = r8.LLILZLL
        L4a:
            if (r5 >= r4) goto L15
            java.util.ArrayList<android.widget.ImageView> r0 = r8.LLIZ
            java.lang.Object r3 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r5)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            int r0 = r8.LLJI
            float r0 = (float) r0
            X.C786410Ut5.Lc(r3, r0)
            int r5 = r5 + 1
            goto L4a
        L5d:
            int r0 = r3 + (-3)
            if (r9 > r0) goto L8f
            r0 = 3
            r8.LLILZIL = r0
            int r6 = r9 + (-3)
            int r7 = r8.LLILLJJLI
            int r0 = r8.LLILLL
            int r7 = r7 + r0
            int r7 = r7 * r6
            long r3 = X.AbstractC444320Hba.LLJILJIL
            r8.LJI(r6, r3)
            int r3 = r8.LLILZLL
            int r0 = r3 + (-4)
            if (r9 > r0) goto L7c
            int r3 = r9 + 2
            r8.LJI(r3, r1)
        L7c:
            r0 = r9
        L7d:
            if (r0 >= r3) goto L85
            r8.LIZIZ(r0)
            int r0 = r0 + 1
            goto L7d
        L85:
            int r0 = r6 + 1
        L87:
            if (r0 >= r9) goto L3b
            r8.LIZIZ(r0)
            int r0 = r0 + 1
            goto L87
        L8f:
            int r0 = r3 + (-2)
            if (r9 >= r3) goto L3a
            if (r0 > r9) goto L3a
            int r6 = r3 + (-6)
            int r3 = r8.LLILLJJLI
            int r0 = r8.LLILLL
            int r3 = r3 + r0
            int r7 = r6 * r3
            int r0 = r9 - r6
            r8.LLILZIL = r0
            long r3 = X.AbstractC444320Hba.LLJILJIL
            r8.LJI(r6, r3)
            int r3 = r8.LLILZLL
            int r0 = r3 + (-5)
        Lab:
            if (r0 >= r3) goto L3b
            r8.LIZIZ(r0)
            int r0 = r0 + 1
            goto Lab
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC444320Hba.LIZLLL(int):void");
    }

    private final void LJIIIZ(boolean z) {
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
            animatorSet4.setDuration(LLJILJIL);
        }
        AnimatorSet animatorSet5 = this.LLJ;
        if (animatorSet5 != null) {
            animatorSet5.start();
        }
    }

    public final void LIZIZ(int i) {
        if (i < this.LLIZ.size()) {
            ((ImageView) ListProtector.get(this.LLIZ, i)).setImageResource(getDotIndicatorSelectedBackground());
            C786410Ut5.V4((ImageView) ListProtector.get(this.LLIZ, i), getDotIndicatorBackgroundAlpha());
        }
    }

    public final ImageView LIZJ(int i) {
        if (i >= 0 && i < this.LLIZ.size()) {
            return (ImageView) ListProtector.get(this.LLIZ, i);
        }
        return null;
    }

    public final Paint LJ(boolean z) {
        BlurMaskFilter blurMaskFilter = null;
        if (z) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(0);
            Context context = getContext();
            if (context != null) {
                blurMaskFilter = new BlurMaskFilter(Float.valueOf(C11VU.LIZIZ(48.0f, context)).floatValue(), BlurMaskFilter.Blur.NORMAL);
            }
            paint.setMaskFilter(blurMaskFilter);
            return paint;
        }
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(-16777216);
        paint2.setAlpha(178);
        Context context2 = getContext();
        if (context2 != null) {
            blurMaskFilter = new BlurMaskFilter(Float.valueOf(C11VU.LIZIZ(48.0f, context2)).floatValue(), BlurMaskFilter.Blur.NORMAL);
        }
        paint2.setMaskFilter(blurMaskFilter);
        return paint2;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // X.C0SC9
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
            int iLIZ = (int) C11VU.LIZ(10.0f);
            int iLIZ2 = (int) C11VU.LIZ(10.0f);
            setPadding(iLIZ2, iLIZ, iLIZ2, iLIZ);
        } else {
            setPadding(0, 0, 0, 0);
        }
        getLayoutParams().width = i4 + getPaddingStart() + getPaddingEnd();
        getLayoutParams().height = this.LLILLJJLI + getPaddingTop() + getPaddingBottom();
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        this.LLIZ.clear();
        if (this.LLIZ.size() < i) {
            int size = this.LLIZ.size();
            for (int i5 = 0; i5 < size; i5++) {
                LIZIZ(i5);
            }
            for (int size2 = this.LLIZ.size(); size2 < i; size2++) {
                ImageView imageView = new ImageView(getContext());
                imageView.setImageResource(getDotIndicatorSelectedBackground());
                C786410Ut5.V4(imageView, getDotIndicatorBackgroundAlpha());
                int i6 = this.LLILLJJLI;
                int i7 = this.LLILLL;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i6, i6);
                if (size2 > 0) {
                    if (C444960Hcc.LIZJ(getContext())) {
                        layoutParams.setMargins(0, 0, i7, 0);
                    } else {
                        layoutParams.setMargins(i7, 0, 0, 0);
                    }
                }
                C786410Ut5.c6(imageView, layoutParams);
                addView(imageView);
                this.LLIZ.add(imageView);
            }
        } else {
            int size3 = this.LLIZ.size();
            for (int i8 = i; i8 < size3; i8++) {
                ImageView imageViewLIZJ = LIZJ(i8);
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, imageViewLIZJ);
                removeView(imageViewLIZJ);
                C19719512Dh.LIZ(this.LLIZ).remove(imageViewLIZJ);
            }
            int size4 = this.LLIZ.size();
            for (int i9 = 0; i9 < size4; i9++) {
                LIZIZ(i9);
            }
        }
        int i10 = this.LLILZ;
        if (i10 != 0) {
            LJIIIIZZ(i10, 0L);
        }
        this.LLILZ = 0;
        LJII(0, 0L);
        if (i > 6) {
            LJI(5, 0L);
        }
    }

    public void setDotSize(boolean z) {
        if (z) {
            LLJILJILJ = 7.0d;
        } else {
            LLJILJILJ = 6.0d;
        }
    }

    public void setIsTabletCarousel(boolean z) {
        this.LLIZLLLIL = z;
    }

    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        if (this.LL == null) {
            this.LL = new SafeHandler(lifecycleOwner);
        }
    }

    @Override // X.C0SC9
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
                        int i3 = this.LLILZIL;
                        long j = LLJILJIL;
                        LJIIIIZZ(i3, j);
                        LJII(this.LLILZ + 1, j);
                        this.LLILZ++;
                        this.LLILZIL++;
                        return;
                    }
                    int i4 = this.LLILZIL;
                    long j2 = LLJILJIL;
                    LJIIIIZZ(i4, j2);
                    LJII(this.LLILZ - 1, j2);
                    this.LLILZ--;
                    this.LLILZIL--;
                    return;
                }
                LIZLLL(i);
                return;
            }
            if (Math.abs(i - i2) == 1) {
                if (i > this.LLILZ) {
                    if (getLastRealPos() - getRightBoundPos() > 0) {
                        z2 = true;
                    }
                    int i5 = this.LLILZ;
                    long j3 = LLJILJIL;
                    LJIIIIZZ(i5, j3);
                    this.LLILZ++;
                    int i6 = this.LLILZIL;
                    if (i6 >= 4 && z2) {
                        LJIIIZ(true);
                        LJFF();
                    } else {
                        this.LLILZIL = i6 + 1;
                    }
                    LJII(this.LLILZ, j3);
                    return;
                }
                if (getLeftBoundPos() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i7 = this.LLILZ;
                long j4 = LLJILJIL;
                LJIIIIZZ(i7, j4);
                this.LLILZ--;
                int i8 = this.LLILZIL;
                if (i8 <= 1 && z) {
                    LJIIIZ(false);
                    LJFF();
                } else {
                    this.LLILZIL = i8 - 1;
                }
                LJII(this.LLILZ, j4);
                return;
            }
            LIZLLL(i);
        }
    }

    public AbstractC444320Hba(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LJI(int i, long j) {
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
        safeHandler.postDelayed(new ARunnableS17S0101000_6(i, this, 12), j);
    }

    public final void LJII(int i, long j) {
        ImageView imageViewLIZJ = LIZJ(i);
        if (imageViewLIZJ == null) {
            return;
        }
        imageViewLIZJ.setImageResource(getDotIndicatorSelectedBackground());
        if (C04WZ.LIZ()) {
            C786410Ut5.V4(imageViewLIZJ, 1.0f);
            return;
        }
        C786410Ut5.V4(imageViewLIZJ, getDotIndicatorBackgroundAlpha());
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageViewLIZJ, "alpha", getDotIndicatorBackgroundAlpha(), 1.0f);
        objectAnimatorOfFloat.setDuration(j);
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    public final void LJIIIIZZ(int i, long j) {
        ImageView imageViewLIZJ = LIZJ(i);
        if (imageViewLIZJ == null) {
            return;
        }
        imageViewLIZJ.setImageResource(getDotIndicatorSelectedBackground());
        if (C04WZ.LIZ()) {
            C786410Ut5.V4(imageViewLIZJ, getDotIndicatorBackgroundAlpha());
            return;
        }
        C786410Ut5.V4(imageViewLIZJ, 1.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageViewLIZJ, "alpha", 1.0f, getDotIndicatorBackgroundAlpha());
        objectAnimatorOfFloat.setDuration(j);
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    public AbstractC444320Hba(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLIZ = new ArrayList<>();
        LJ(false);
        this.LLJIJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1244));
        this.LLILLJJLI = C341940Daq.LIZ(LLJILJILJ);
        this.LLILLL = C341940Daq.LIZ(LLJILJILJ);
        setWillNotDraw(false);
        setLayerType(2, null);
    }
}
