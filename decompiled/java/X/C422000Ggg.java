package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ggg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C422000Ggg extends LinearLayout {
    public final int LL;
    public final int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public final ArrayList<ImageView> LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public final float LLJ;
    public AnimatorSet LLJI;

    public final ImageView getSelectedView() {
        return (ImageView) C13LP.LJJJLZIJ(this.LLILLL, this.LLILZLL);
    }

    public final void LIZ(int i) {
        if (i < this.LLILZLL.size()) {
            C786410Ut5.Qb((ImageView) ListProtector.get(this.LLILZLL, i), 1.0f);
            C786410Ut5.rc((ImageView) ListProtector.get(this.LLILZLL, i), 1.0f);
        }
    }

    public final void LIZIZ(boolean z) {
        int i;
        int i2;
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.LLJI;
        if (animatorSet2 != null && animatorSet2.isRunning() && (animatorSet = this.LLJI) != null) {
            animatorSet.end();
        }
        this.LLJI = new AnimatorSet();
        if (z) {
            i = (-this.LLILLJJLI) - this.LL;
        } else {
            i = this.LLILLJJLI + this.LL;
        }
        int i3 = this.LLILZIL;
        for (int i4 = 0; i4 < i3; i4++) {
            AnimatorSet animatorSet3 = this.LLJI;
            if (animatorSet3 != null) {
                Animator[] animatorArr = new Animator[1];
                Object obj = ListProtector.get(this.LLILZLL, i4);
                float[] fArr = new float[2];
                fArr[0] = ((View) ListProtector.get(this.LLILZLL, i4)).getTranslationX();
                float translationX = ((View) ListProtector.get(this.LLILZLL, i4)).getTranslationX();
                if (C426750GoL.LIZLLL(getContext())) {
                    i2 = -i;
                } else {
                    i2 = i;
                }
                fArr[1] = translationX + i2;
                animatorArr[0] = ObjectAnimator.ofFloat(obj, "translationX", fArr);
                animatorSet3.playTogether(animatorArr);
            }
        }
        AnimatorSet animatorSet4 = this.LLJI;
        if (animatorSet4 != null) {
            animatorSet4.setDuration(this.LLIZLLLIL);
        }
        AnimatorSet animatorSet5 = this.LLJI;
        if (animatorSet5 != null) {
            animatorSet5.start();
        }
    }

    public final void LJ(int i) {
        if (i < this.LLILZLL.size()) {
            C786410Ut5.Qb((ImageView) ListProtector.get(this.LLILZLL, i), this.LLJ);
            C786410Ut5.rc((ImageView) ListProtector.get(this.LLILZLL, i), this.LLJ);
        }
    }

    public final void LJFF(int i) {
        if (i >= 0 && i < this.LLILZLL.size()) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(ListProtector.get(this.LLILZLL, i), "scaleX", this.LLJ, 1.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(ListProtector.get(this.LLILZLL, i), "scaleY", this.LLJ, 1.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
            animatorSet.setDuration(this.LLIZLLLIL);
            animatorSet.start();
        }
    }

    public final void LJI(int i) {
        if (i >= 0 && i < this.LLILZLL.size()) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(ListProtector.get(this.LLILZLL, i), "scaleX", 1.0f, this.LLJ);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(ListProtector.get(this.LLILZLL, i), "scaleY", 1.0f, this.LLJ);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
            animatorSet.setDuration(this.LLIZLLLIL);
            animatorSet.start();
        }
    }

    public final void setCount(int i) {
        int i2;
        int i3;
        if (i == this.LLILZIL) {
            return;
        }
        if (i <= 1) {
            int visibility = getVisibility();
            setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, this);
            return;
        }
        int visibility2 = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility2, 0, this);
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        this.LLILZLL.clear();
        this.LLILZ = 0;
        LIZLLL(0, null);
        this.LLILZIL = i;
        if (i >= 6) {
            i2 = this.LL * 6;
            i3 = this.LLILLJJLI * 5;
        } else {
            i2 = (i - 1) * this.LLILLJJLI;
            i3 = this.LL * i;
        }
        getLayoutParams().width = i2 + i3;
        int i4 = 0;
        do {
            int i5 = this.LL;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i5, i5);
            if (i4 > 0) {
                if (C426750GoL.LIZLLL(getContext())) {
                    layoutParams.setMargins(0, 0, this.LLILLJJLI, 0);
                } else {
                    layoutParams.setMargins(this.LLILLJJLI, 0, 0, 0);
                }
            }
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(this.LLIZ);
            C786410Ut5.c6(imageView, layoutParams);
            addView(imageView);
            this.LLILZLL.add(imageView);
            i4++;
        } while (i4 < i);
        LIZJ(0, 0);
        if (i <= 6) {
            return;
        }
        LJ(5);
    }

    public final void setSelectedIndex(int i) {
        int i2;
        int i3 = this.LLILLL;
        if (i != i3 && i >= 0 && i < this.LLILZIL) {
            Boolean bool = null;
            if (Math.abs(i - i3) > 1) {
                if (i != this.LLILLL && i >= 0 && i < this.LLILZIL) {
                    int i4 = this.LLILZIL;
                    if (i4 <= 6) {
                        this.LLILZ = i;
                    } else {
                        int i5 = i4 - 5;
                        if (i < i4 && i5 <= i) {
                            i2 = (i4 - 6) * (this.LL + this.LLILLJJLI);
                            this.LLILZ = (i - i4) + 6;
                            LJ(i4 - 6);
                            int i6 = this.LLILZIL;
                            for (int i7 = i6 - 5; i7 < i6; i7++) {
                                LIZ(i7);
                            }
                        } else {
                            if (3 <= i) {
                                if (i < i4 - 5) {
                                    int i8 = i - 1;
                                    i2 = (this.LL + this.LLILLJJLI) * i8;
                                    this.LLILZ = 1;
                                    LJ(i8);
                                    int i9 = i + 3;
                                    LJ(i9);
                                    for (int i10 = i; i10 < i9; i10++) {
                                        LIZ(i10);
                                    }
                                }
                            } else {
                                if (i >= 0) {
                                }
                                i2 = 0;
                            }
                            if (i < 4) {
                                this.LLILZ = i;
                                int i11 = 0;
                                do {
                                    LIZ(i11);
                                    i11++;
                                } while (i11 < 5);
                                LJ(5);
                            }
                            i2 = 0;
                        }
                        if (!C426750GoL.LIZLLL(getContext())) {
                            i2 = -i2;
                        }
                        int i12 = this.LLILZIL;
                        for (int i13 = 0; i13 < i12; i13++) {
                            C786410Ut5.Lc((ImageView) ListProtector.get(this.LLILZLL, i13), i2);
                        }
                    }
                    LJII(this.LLILLL, 0);
                    LIZJ(i, 0);
                    LIZLLL(i, null);
                    return;
                }
                return;
            }
            if (this.LLILZIL <= 6) {
                LJII(this.LLILZ, 0);
                LIZJ(i, 0);
                int i14 = this.LLILLL;
                if (i > i14) {
                    LIZLLL(i14 + 1, null);
                    this.LLILZ++;
                    return;
                } else {
                    LIZLLL(i14 - 1, null);
                    this.LLILZ--;
                    return;
                }
            }
            int i15 = this.LLILLL;
            if (i > i15) {
                LJII(i15, this.LLIZLLLIL);
                LIZJ(this.LLILLL + 1, this.LLIZLLLIL);
                int i16 = this.LLILZ;
                if (i16 == 4 && this.LLILLL != this.LLILZIL - 2) {
                    LIZIZ(true);
                    bool = Boolean.TRUE;
                    int i17 = this.LLILLL;
                    if (i17 != this.LLILZIL - 3) {
                        LJI(i17 + 2);
                    }
                    LJFF(this.LLILLL + 1);
                    LJI(this.LLILLL - 3);
                } else {
                    this.LLILZ = i16 + 1;
                }
                LIZLLL(this.LLILLL + 1, bool);
                return;
            }
            LJII(i15, this.LLIZLLLIL);
            LIZJ(this.LLILLL - 1, this.LLIZLLLIL);
            int i18 = this.LLILZ;
            if (i18 == 1 && this.LLILLL != 1) {
                LIZIZ(false);
                bool = Boolean.FALSE;
                int i19 = this.LLILLL;
                if (i19 != 2) {
                    LJI(i19 - 2);
                }
                LJFF(this.LLILLL - 1);
                LJI(this.LLILLL + 3);
            } else {
                this.LLILZ = i18 - 1;
            }
            LIZLLL(this.LLILLL - 1, bool);
        }
    }

    public C422000Ggg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        this.LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        this.LLILZLL = new ArrayList<>();
        this.LLIZ = R.drawable.b9l;
        this.LLIZLLLIL = 200;
        this.LLJ = 0.6f;
    }

    public final void LIZJ(int i, int i2) {
        TransitionDrawable transitionDrawable;
        if (i >= 0 && i < this.LLILZLL.size()) {
            Drawable drawable = ((ImageView) ListProtector.get(this.LLILZLL, i)).getDrawable();
            if ((drawable instanceof TransitionDrawable) && (transitionDrawable = (TransitionDrawable) drawable) != null) {
                transitionDrawable.startTransition(i2);
            }
        }
    }

    public final void LIZLLL(int i, Boolean bool) {
        this.LLILLL = i;
        if (!Intrinsics.LJFF(bool, Boolean.TRUE)) {
            Intrinsics.LJFF(bool, Boolean.FALSE);
        }
    }

    public final void LJII(int i, int i2) {
        TransitionDrawable transitionDrawable;
        if (i >= 0 && i < this.LLILZLL.size()) {
            Drawable drawable = ((ImageView) ListProtector.get(this.LLILZLL, i)).getDrawable();
            if ((drawable instanceof TransitionDrawable) && (transitionDrawable = (TransitionDrawable) drawable) != null) {
                transitionDrawable.reverseTransition(i2);
            }
        }
    }
}
