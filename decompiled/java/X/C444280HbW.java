package X;

import Y.ARunnableS17S0101000_6;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
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

/* JADX INFO: renamed from: X.0HbW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C444280HbW extends LinearLayout {
    public static final double LLJI;
    public SafeHandler LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public final ArrayList<ImageView> LLIZ;
    public AnimatorSet LLIZLLLIL;
    public int LLJ;

    public void LJIIIIZZ() {
        setPadding(0, 0, 0, 0);
    }

    public int getDotIndicatorBackground() {
        return R.drawable.bbp;
    }

    public float getDotIndicatorBackgroundAlpha() {
        return 0.6f;
    }

    public int getDotIndicatorSelectedBackground() {
        return R.drawable.bbo;
    }

    static {
        LLJI = C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLFF().LIZLLL(null, null) ? 7.0d : 6.0d;
    }

    private final int getLastRealPos() {
        return this.LLILZLL - 1;
    }

    private final int getLeftBoundPos() {
        return this.LLILZ - this.LLILZIL;
    }

    private final int getRightBoundPos() {
        return (getLeftBoundPos() + 6) - 1;
    }

    public final void LIZLLL() {
        if (getLeftBoundPos() == 0) {
            LIZ(0);
        } else {
            LJ(getLeftBoundPos(), 100L);
        }
        if (getRightBoundPos() == getLastRealPos()) {
            LIZ(getLastRealPos());
        } else {
            LJ(getRightBoundPos(), 100L);
        }
    }

    public final void LIZ(int i) {
        if (i < this.LLIZ.size()) {
            ((ImageView) ListProtector.get(this.LLIZ, i)).setImageResource(getDotIndicatorSelectedBackground());
            C786410Ut5.V4((ImageView) ListProtector.get(this.LLIZ, i), getDotIndicatorBackgroundAlpha());
        }
    }

    public final ImageView LIZIZ(int i) {
        if (i >= 0 && i < this.LLIZ.size()) {
            return (ImageView) ListProtector.get(this.LLIZ, i);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004d A[LOOP:1: B:29:0x004b->B:30:0x004d, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(int r9) {
        /*
            r8 = this;
            int r0 = r8.LLILZ
            if (r9 != r0) goto L5
            return
        L5:
            r3 = 0
            if (r9 < 0) goto Lbc
            int r0 = r8.LLILZLL
            if (r9 >= r0) goto Lbc
            int r6 = r8.LLILZLL
            r0 = 6
            if (r6 > r0) goto L23
            r8.LLILZIL = r9
        L13:
            int r0 = r8.LLILZ
            r8.LJFF(r0)
            int r0 = r8.LLILZ
            r8.LJI(r0)
            r8.LJFF(r9)
            r8.LLILZ = r9
            return
        L23:
            r1 = 4
            if (r9 < 0) goto Lb9
            if (r9 >= r1) goto Lb9
            r0 = 1
        L29:
            r4 = 0
            if (r0 == 0) goto L5e
            r8.LLILZIL = r9
            r1 = 0
        L30:
            r8.LIZ(r1)
            int r1 = r1 + 1
            r0 = 5
            if (r1 < r0) goto L30
            r8.LJ(r0, r4)
        L3b:
            r6 = 0
        L3c:
            android.content.Context r0 = r8.getContext()
            boolean r0 = X.C444960Hcc.LIZJ(r0)
            if (r0 != 0) goto L47
            int r6 = -r6
        L47:
            r8.LLJ = r6
            int r2 = r8.LLILZLL
        L4b:
            if (r3 >= r2) goto L13
            java.util.ArrayList<android.widget.ImageView> r0 = r8.LLIZ
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            int r0 = r8.LLJ
            float r0 = (float) r0
            X.C786410Ut5.Lc(r1, r0)
            int r3 = r3 + 1
            goto L4b
        L5e:
            if (r1 > r9) goto L8b
            int r0 = r6 + (-3)
            if (r9 > r0) goto L8b
            r0 = 1
        L65:
            r1 = 100
            if (r0 == 0) goto L97
            r0 = 3
            r8.LLILZIL = r0
            int r7 = r9 + (-3)
            int r6 = r8.LLILLJJLI
            int r0 = r8.LLILLL
            int r6 = r6 + r0
            int r6 = r6 * r7
            r8.LJ(r7, r1)
            int r1 = r8.LLILZLL
            int r0 = r1 + (-4)
            if (r9 > r0) goto L82
            int r1 = r9 + 2
            r8.LJ(r1, r4)
        L82:
            r0 = r9
        L83:
            if (r0 >= r1) goto L8d
            r8.LIZ(r0)
            int r0 = r0 + 1
            goto L83
        L8b:
            r0 = 0
            goto L65
        L8d:
            int r0 = r7 + 1
        L8f:
            if (r0 >= r9) goto L3c
            r8.LIZ(r0)
            int r0 = r0 + 1
            goto L8f
        L97:
            int r0 = r6 + (-2)
            if (r9 >= r6) goto L3b
            if (r0 > r9) goto L3b
            int r5 = r6 + (-6)
            int r4 = r8.LLILLJJLI
            int r0 = r8.LLILLL
            int r4 = r4 + r0
            int r6 = r5 * r4
            int r0 = r9 - r5
            r8.LLILZIL = r0
            r8.LJ(r5, r1)
            int r1 = r8.LLILZLL
            int r0 = r1 + (-5)
        Lb1:
            if (r0 >= r1) goto L3c
            r8.LIZ(r0)
            int r0 = r0 + 1
            goto Lb1
        Lb9:
            r0 = 0
            goto L29
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C444280HbW.LIZJ(int):void");
    }

    public final void LJFF(int i) {
        ImageView imageViewLIZIZ = LIZIZ(i);
        if (imageViewLIZIZ == null) {
            return;
        }
        imageViewLIZIZ.setImageResource(getDotIndicatorSelectedBackground());
        C786410Ut5.V4(imageViewLIZIZ, 1.0f);
    }

    public final void LJI(int i) {
        ImageView imageViewLIZIZ = LIZIZ(i);
        if (imageViewLIZIZ == null) {
            return;
        }
        imageViewLIZIZ.setImageResource(getDotIndicatorSelectedBackground());
        C786410Ut5.V4(imageViewLIZIZ, getDotIndicatorBackgroundAlpha());
    }

    public final void LJII(boolean z) {
        AnimatorSet animatorSet = this.LLIZLLLIL;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.LLIZLLLIL;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            int i = this.LLILZLL;
            for (int i2 = 0; i2 < i; i2++) {
                C786410Ut5.Lc((ImageView) ListProtector.get(this.LLIZ, i2), this.LLJ);
            }
        }
        this.LLIZLLLIL = new AnimatorSet();
        int i3 = this.LLILLL + this.LLILLJJLI;
        if (z) {
            i3 = -i3;
        }
        if (C444960Hcc.LIZIZ()) {
            i3 = -i3;
        }
        this.LLJ += i3;
        int i4 = this.LLILZLL;
        for (int i5 = 0; i5 < i4; i5++) {
            View view = (View) ListProtector.get(this.LLIZ, i5);
            AnimatorSet animatorSet3 = this.LLIZLLLIL;
            if (animatorSet3 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(view, "translationX", view.getTranslationX(), this.LLJ));
            }
        }
        AnimatorSet animatorSet4 = this.LLIZLLLIL;
        if (animatorSet4 != null) {
            animatorSet4.setDuration(100L);
        }
        AnimatorSet animatorSet5 = this.LLIZLLLIL;
        if (animatorSet5 != null) {
            animatorSet5.start();
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
        LJIIIIZZ();
        getLayoutParams().width = i2 + i3 + getPaddingStart() + getPaddingEnd();
        getLayoutParams().height = this.LLILLJJLI + getPaddingTop() + getPaddingBottom();
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        this.LLIZ.clear();
        if (this.LLIZ.size() < i) {
            int size = this.LLIZ.size();
            for (int i4 = 0; i4 < size; i4++) {
                LIZ(i4);
            }
            for (int size2 = this.LLIZ.size(); size2 < i; size2++) {
                ImageView imageView = new ImageView(getContext());
                imageView.setImageResource(getDotIndicatorSelectedBackground());
                C786410Ut5.V4(imageView, getDotIndicatorBackgroundAlpha());
                int i5 = this.LLILLJJLI;
                int i6 = this.LLILLL;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i5, i5);
                if (size2 > 0) {
                    if (C444960Hcc.LIZJ(getContext())) {
                        layoutParams.setMargins(0, 0, i6, 0);
                    } else {
                        layoutParams.setMargins(i6, 0, 0, 0);
                    }
                }
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
            LJI(i9);
        }
        this.LLILZ = 0;
        LJFF(0);
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
                        LJI(this.LLILZIL);
                        LJFF(this.LLILZ + 1);
                        this.LLILZ++;
                        this.LLILZIL++;
                        return;
                    }
                    LJI(this.LLILZIL);
                    LJFF(this.LLILZ - 1);
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
                    LJI(this.LLILZ);
                    this.LLILZ++;
                    int i3 = this.LLILZIL;
                    if (i3 >= 4 && z2) {
                        LJII(true);
                        LIZLLL();
                    } else {
                        this.LLILZIL = i3 + 1;
                    }
                    LJFF(this.LLILZ);
                    return;
                }
                if (getLeftBoundPos() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                LJI(this.LLILZ);
                this.LLILZ--;
                int i4 = this.LLILZIL;
                if (i4 <= 1 && z) {
                    LJII(false);
                    LIZLLL();
                } else {
                    this.LLILZIL = i4 - 1;
                }
                LJFF(this.LLILZ);
                return;
            }
            LIZJ(i);
        }
    }

    public C444280HbW(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
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
        safeHandler.postDelayed(new ARunnableS17S0101000_6(i, this, 22), j);
    }

    public C444280HbW(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LLIZ = new ArrayList<>();
        double d = LLJI;
        this.LLILLJJLI = C341940Daq.LIZ(d);
        this.LLILLL = C341940Daq.LIZ(d);
        setWillNotDraw(false);
        setLayerType(2, null);
    }
}
