package X;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gjy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C424040Gjy extends LinearLayout {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public final ArrayList<ImageView> LLIZLLLIL;
    public final int LLJ;
    public final int LLJI;
    public final float LLJIJIL;
    public Boolean LLJILJIL;
    public AnimatorSet LLJILJILJ;
    public Set<Integer> LLJILLL;

    public final ImageView getSelectedView() {
        return (ImageView) C7727030b.LIZ(this.LLILZLL, this.LLIZLLLIL);
    }

    public final StateListDrawable LIZ(int i) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, C1385040m98.LIZ(getContext(), true));
        Integer numLIZJ2 = C1308910kAL.LIZJ(i, C1385040m98.LIZ(getContext(), false));
        StateListDrawable stateListDrawable = new StateListDrawable();
        int[] iArr = {R.attr.state_selected};
        TuxIconDrawable tuxIconDrawable = new TuxIconDrawable(getContext(), com.zhiliaoapp.musically.R.raw.icon_play_circle);
        if (numLIZJ != null) {
            tuxIconDrawable.LJFF(numLIZJ.intValue());
        }
        stateListDrawable.addState(iArr, tuxIconDrawable);
        int[] iArr2 = new int[0];
        TuxIconDrawable tuxIconDrawable2 = new TuxIconDrawable(getContext(), com.zhiliaoapp.musically.R.raw.icon_play_circle);
        if (numLIZJ2 != null) {
            tuxIconDrawable2.LJFF(numLIZJ2.intValue());
        }
        stateListDrawable.addState(iArr2, tuxIconDrawable2);
        return stateListDrawable;
    }

    public final void LIZIZ(int i) {
        if (i < this.LLIZLLLIL.size()) {
            C786410Ut5.Qb((ImageView) ListProtector.get(this.LLIZLLLIL, i), 1.0f);
            C786410Ut5.rc((ImageView) ListProtector.get(this.LLIZLLLIL, i), 1.0f);
        }
    }

    public final void LIZJ(boolean z) {
        int i;
        int i2;
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.LLJILJILJ;
        if (animatorSet2 != null && animatorSet2.isRunning() && (animatorSet = this.LLJILJILJ) != null) {
            animatorSet.end();
        }
        this.LLJILJILJ = new AnimatorSet();
        if (z) {
            i = (-this.LLILLL) - this.LL;
        } else {
            i = this.LLILLL + this.LL;
        }
        int i3 = this.LLIZ;
        for (int i4 = 0; i4 < i3; i4++) {
            AnimatorSet animatorSet3 = this.LLJILJILJ;
            if (animatorSet3 != null) {
                Animator[] animatorArr = new Animator[1];
                Object obj = ListProtector.get(this.LLIZLLLIL, i4);
                float[] fArr = new float[2];
                fArr[0] = ((View) ListProtector.get(this.LLIZLLLIL, i4)).getTranslationX();
                float translationX = ((View) ListProtector.get(this.LLIZLLLIL, i4)).getTranslationX();
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
        AnimatorSet animatorSet4 = this.LLJILJILJ;
        if (animatorSet4 != null) {
            animatorSet4.setDuration(this.LLJI);
        }
        AnimatorSet animatorSet5 = this.LLJILJILJ;
        if (animatorSet5 != null) {
            animatorSet5.start();
        }
    }

    public final void LJI(int i) {
        if (i < this.LLIZLLLIL.size()) {
            C786410Ut5.Qb((ImageView) ListProtector.get(this.LLIZLLLIL, i), this.LLJIJIL);
            C786410Ut5.rc((ImageView) ListProtector.get(this.LLIZLLLIL, i), this.LLJIJIL);
        }
    }

    public final void LJII(int i) {
        if (i >= 0 && i < this.LLIZLLLIL.size()) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(ListProtector.get(this.LLIZLLLIL, i), "scaleX", this.LLJIJIL, 1.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(ListProtector.get(this.LLIZLLLIL, i), "scaleY", this.LLJIJIL, 1.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
            animatorSet.setDuration(this.LLJI);
            animatorSet.start();
        }
    }

    public final void LJIIIIZZ(int i) {
        if (i >= 0 && i < this.LLIZLLLIL.size()) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(ListProtector.get(this.LLIZLLLIL, i), "scaleX", 1.0f, this.LLJIJIL);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(ListProtector.get(this.LLIZLLLIL, i), "scaleY", 1.0f, this.LLJIJIL);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
            animatorSet.setDuration(this.LLJI);
            animatorSet.start();
        }
    }

    public final void setSelectedIndex(int i) {
        int i2;
        int i3 = this.LLILZ;
        if (i != i3 && i >= 0 && i < this.LLIZ) {
            Boolean bool = null;
            if (Math.abs(i - i3) > 1) {
                if (i != this.LLILZ && i >= 0 && i < this.LLIZ) {
                    int i4 = this.LLIZ;
                    if (i4 <= 5) {
                        this.LLILZIL = i;
                    } else {
                        int i5 = i4 - 4;
                        if (i < i4 && i5 <= i) {
                            i2 = (i4 - 5) * (this.LL + this.LLILLL);
                            this.LLILZIL = (i - i4) + 5;
                            LJI(i4 - 5);
                            int i6 = this.LLIZ;
                            for (int i7 = i6 - 4; i7 < i6; i7++) {
                                LIZIZ(i7);
                            }
                        } else {
                            if (2 <= i) {
                                if (i < i4 - 4) {
                                    int i8 = i - 1;
                                    i2 = (this.LL + this.LLILLL) * i8;
                                    this.LLILZIL = 1;
                                    LJI(i8);
                                    int i9 = i + 3;
                                    LJI(i9);
                                    for (int i10 = i; i10 < i9; i10++) {
                                        LIZIZ(i10);
                                    }
                                }
                            } else {
                                if (i >= 0) {
                                }
                                i2 = 0;
                            }
                            if (i < 3) {
                                this.LLILZIL = i;
                                int i11 = 0;
                                do {
                                    LIZIZ(i11);
                                    i11++;
                                } while (i11 < 4);
                                LJI(4);
                            }
                            i2 = 0;
                        }
                        if (!C426750GoL.LIZLLL(getContext())) {
                            i2 = -i2;
                        }
                        int i12 = this.LLIZ;
                        for (int i13 = 0; i13 < i12; i13++) {
                            C786410Ut5.Lc((ImageView) ListProtector.get(this.LLIZLLLIL, i13), i2);
                        }
                    }
                    LJIIIZ(this.LLILZ, 0);
                    LIZLLL(i, 0);
                    LJFF(i, null);
                    return;
                }
                return;
            }
            if (this.LLIZ <= 5) {
                LJIIIZ(this.LLILZIL, 0);
                LIZLLL(i, 0);
                int i14 = this.LLILZ;
                if (i > i14) {
                    LJFF(i14 + 1, null);
                    this.LLILZIL++;
                    return;
                } else {
                    LJFF(i14 - 1, null);
                    this.LLILZIL--;
                    return;
                }
            }
            int i15 = this.LLILZ;
            if (i > i15) {
                LJIIIZ(i15, this.LLJI);
                LIZLLL(this.LLILZ + 1, this.LLJI);
                int i16 = this.LLILZIL;
                if (i16 == 3 && this.LLILZ != this.LLIZ - 2) {
                    LIZJ(true);
                    bool = Boolean.TRUE;
                    int i17 = this.LLILZ;
                    if (i17 != this.LLIZ - 3) {
                        LJIIIIZZ(i17 + 2);
                    }
                    LJII(this.LLILZ + 1);
                    LJIIIIZZ(this.LLILZ - 2);
                } else {
                    this.LLILZIL = i16 + 1;
                }
                LJFF(this.LLILZ + 1, bool);
                return;
            }
            LJIIIZ(i15, this.LLJI);
            LIZLLL(this.LLILZ - 1, this.LLJI);
            int i18 = this.LLILZIL;
            if (i18 == 1 && this.LLILZ != 1) {
                LIZJ(false);
                bool = Boolean.FALSE;
                int i19 = this.LLILZ;
                if (i19 != 2) {
                    LJIIIIZZ(i19 - 2);
                }
                LJII(this.LLILZ - 1);
                LJIIIIZZ(this.LLILZ + 2);
            } else {
                this.LLILZIL = i18 - 1;
            }
            LJFF(this.LLILZ - 1, bool);
        }
    }

    public C424040Gjy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        this.LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        this.LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        this.LLIZLLLIL = new ArrayList<>();
        this.LLJ = com.zhiliaoapp.musically.R.drawable.b56;
        this.LLJI = 200;
        this.LLJIJIL = 0.6f;
        this.LLJILJIL = Boolean.FALSE;
        this.LLJILLL = C08CX.INSTANCE;
        setGravity(16);
    }

    public final void LIZLLL(int i, int i2) {
        TransitionDrawable transitionDrawable;
        if (i >= 0 && i < this.LLIZLLLIL.size()) {
            Drawable drawable = ((ImageView) ListProtector.get(this.LLIZLLLIL, i)).getDrawable();
            if ((drawable instanceof TransitionDrawable) && (transitionDrawable = (TransitionDrawable) drawable) != null) {
                transitionDrawable.startTransition(i2);
            }
        }
    }

    public final void LJ(Set set, int i) {
        int i2;
        if (i == this.LLIZ && Intrinsics.LJFF(set, this.LLJILLL)) {
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
        set.isEmpty();
        this.LLJILLL = set;
        this.LLJILJIL = Boolean.FALSE;
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        this.LLIZLLLIL.clear();
        this.LLILZIL = 0;
        LJFF(0, null);
        this.LLIZ = i;
        if (i >= 5) {
            i2 = 5;
        } else {
            i2 = i;
        }
        getLayoutParams().width = (this.LL * i2) + ((i2 - 1) * this.LLILLL) + ((this.LLILLJJLI - this.LL) * Math.min(set.size(), i2));
        int i3 = 0;
        do {
            int i4 = this.LL;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i4, i4);
            if (i3 > 0) {
                if (C426750GoL.LIZLLL(getContext())) {
                    layoutParams.setMargins(0, 0, this.LLILLL, 0);
                } else {
                    layoutParams.setMargins(this.LLILLL, 0, 0, 0);
                }
            }
            ImageView imageView = new ImageView(getContext());
            if (this.LLJILLL.contains(Integer.valueOf(i3))) {
                imageView.setImageDrawable(new TransitionDrawable(new StateListDrawable[]{LIZ(com.zhiliaoapp.musically.R.attr.a01), LIZ(com.zhiliaoapp.musically.R.attr.a00)}));
                int i5 = this.LLILLJJLI;
                layoutParams.width = i5;
                layoutParams.height = i5;
                layoutParams.gravity = 16;
            } else {
                imageView.setImageResource(this.LLJ);
            }
            C786410Ut5.c6(imageView, layoutParams);
            addView(imageView);
            this.LLIZLLLIL.add(imageView);
            i3++;
        } while (i3 < i);
        LIZLLL(0, 0);
        if (i <= 5) {
            return;
        }
        LJI(4);
    }

    public final void LJFF(int i, Boolean bool) {
        int i2;
        this.LLILZ = i;
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            i2 = this.LLILZ - 1;
        } else if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
            i2 = this.LLILZ + 1;
        } else {
            i2 = this.LLILZ;
        }
        this.LLILZLL = i2;
    }

    public final void LJIIIZ(int i, int i2) {
        TransitionDrawable transitionDrawable;
        if (i >= 0 && i < this.LLIZLLLIL.size()) {
            Drawable drawable = ((ImageView) ListProtector.get(this.LLIZLLLIL, i)).getDrawable();
            if ((drawable instanceof TransitionDrawable) && (transitionDrawable = (TransitionDrawable) drawable) != null) {
                transitionDrawable.reverseTransition(i2);
            }
        }
    }

    public final void LJIIJ(int i, boolean z) {
        if (!Intrinsics.LJFF(this.LLJILJIL, Boolean.valueOf(z)) && i == this.LLILZ) {
            this.LLJILJIL = Boolean.valueOf(z);
            Iterator<ImageView> it2 = this.LLIZLLLIL.iterator();
            while (it2.hasNext()) {
                it2.next().setSelected(z);
            }
        }
    }
}
