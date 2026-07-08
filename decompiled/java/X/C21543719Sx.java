package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.19Sx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21543719Sx {
    public final Context LIZ;
    public final C21543419Su LIZIZ;
    public LinearLayout LIZJ;
    public int LIZLLL;
    public FrameLayout LJ;
    public Animator LJFF;
    public final float LJI;
    public int LJII;
    public int LJIIIIZZ;
    public CharSequence LJIIIZ;
    public boolean LJIIJ;
    public AppCompatTextView LJIIJJI;
    public CharSequence LJIIL;
    public int LJIILIIL;
    public ColorStateList LJIILJJIL;
    public CharSequence LJIILL;
    public boolean LJIILLIIL;
    public AppCompatTextView LJIIZILJ;
    public int LJIJ;
    public ColorStateList LJIJI;
    public Typeface LJIJJ;

    public final void LJII() {
        this.LJIIIZ = null;
        LIZJ();
        if (this.LJII == 1) {
            if (!this.LJIILLIIL || TextUtils.isEmpty(this.LJIILL)) {
                this.LJIIIIZZ = 0;
            } else {
                this.LJIIIIZZ = 2;
            }
        }
        LJIIJ(this.LJII, this.LJIIIIZZ, LJIIIZ(this.LJIIJJI, null));
    }

    public final void LIZIZ() {
        if (this.LIZJ == null || this.LIZIZ.getEditText() == null) {
            return;
        }
        EditText editText = this.LIZIZ.getEditText();
        boolean zLJ = C19RN.LJ(this.LIZ);
        LinearLayout linearLayout = this.LIZJ;
        int paddingStart = editText.getPaddingStart();
        if (zLJ) {
            paddingStart = this.LIZ.getResources().getDimensionPixelSize(R.dimen.a6z);
        }
        int dimensionPixelSize = this.LIZ.getResources().getDimensionPixelSize(R.dimen.a6y);
        if (zLJ) {
            dimensionPixelSize = this.LIZ.getResources().getDimensionPixelSize(R.dimen.a70);
        }
        int paddingEnd = editText.getPaddingEnd();
        if (zLJ) {
            paddingEnd = this.LIZ.getResources().getDimensionPixelSize(R.dimen.a6z);
        }
        linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
    }

    public final void LIZJ() {
        Animator animator = this.LJFF;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final boolean LJ() {
        return (this.LJIIIIZZ != 1 || this.LJIIJJI == null || TextUtils.isEmpty(this.LJIIIZ)) ? false : true;
    }

    public final int LJI() {
        AppCompatTextView appCompatTextView = this.LJIIJJI;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public C21543719Sx(C21543419Su c21543419Su) {
        this.LIZ = c21543419Su.getContext();
        this.LIZIZ = c21543419Su;
        this.LJI = r0.getResources().getDimensionPixelSize(R.dimen.re);
    }

    public final TextView LJFF(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return this.LJIIZILJ;
        }
        return this.LJIIJJI;
    }

    public final void LIZ(TextView textView, int i) {
        if (this.LIZJ == null && this.LJ == null) {
            LinearLayout linearLayout = new LinearLayout(this.LIZ);
            this.LIZJ = linearLayout;
            linearLayout.setOrientation(0);
            this.LIZIZ.addView(this.LIZJ, -1, -2);
            this.LJ = new FrameLayout(this.LIZ);
            this.LIZJ.addView(this.LJ, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.LIZIZ.getEditText() != null) {
                LIZIZ();
            }
        }
        if (i != 0 && i != 1) {
            this.LIZJ.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        } else {
            C786410Ut5.LJZ(0, this.LJ);
            this.LJ.addView(textView);
        }
        C786410Ut5.LJZL(0, this.LIZJ);
        this.LIZLLL++;
    }

    public final void LJIIIIZZ(TextView textView, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.LIZJ;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.LJ) != null) {
            C786410Ut5.LJJJZ(textView, frameLayout);
        } else {
            C786410Ut5.LJJL(textView, linearLayout);
        }
        int i2 = this.LIZLLL - 1;
        this.LIZLLL = i2;
        LinearLayout linearLayout2 = this.LIZJ;
        if (i2 == 0) {
            C786410Ut5.LJLZ(8, linearLayout2);
        }
    }

    public final boolean LJIIIZ(TextView textView, CharSequence charSequence) {
        if (this.LIZIZ.isLaidOut() && this.LIZIZ.isEnabled()) {
            if (this.LJIIIIZZ != this.LJII || textView == null || !TextUtils.equals(textView.getText(), charSequence)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void LJIIJ(final int i, final int i2, boolean z) {
        TextView textViewLJFF;
        TextView textViewLJFF2;
        if (i == i2) {
            return;
        }
        final C21543719Sx c21543719Sx = this;
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            c21543719Sx.LJFF = animatorSet;
            ArrayList arrayList = new ArrayList();
            c21543719Sx.LIZLLL(arrayList, c21543719Sx.LJIILLIIL, c21543719Sx.LJIIZILJ, 2, i, i2);
            c21543719Sx.LIZLLL(arrayList, c21543719Sx.LJIIJ, c21543719Sx.LJIIJJI, 1, i, i2);
            C15E4.LIZ(animatorSet, arrayList);
            final TextView textViewLJFF3 = c21543719Sx.LJFF(i);
            final TextView textViewLJFF4 = c21543719Sx.LJFF(i2);
            c21543719Sx = c21543719Sx;
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: X.19T0
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    AppCompatTextView appCompatTextView;
                    C21543719Sx c21543719Sx2 = this.LLILZIL;
                    c21543719Sx2.LJII = i2;
                    c21543719Sx2.LJFF = null;
                    TextView textView = textViewLJFF3;
                    if (textView != null) {
                        C786410Ut5.LLIL(textView, 4);
                        if (i == 1 && (appCompatTextView = this.LLILZIL.LJIIJJI) != null) {
                            appCompatTextView.setText((CharSequence) null);
                        }
                    }
                    if (textViewLJFF4 != null) {
                        C786410Ut5.cd(0.0f, textViewLJFF4);
                        C786410Ut5.S4(1.0f, textViewLJFF4);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    TextView textView = textViewLJFF4;
                    if (textView != null) {
                        C786410Ut5.LLIL(textView, 0);
                    }
                }
            });
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (textViewLJFF2 = c21543719Sx.LJFF(i2)) != null) {
                C786410Ut5.LLIL(textViewLJFF2, 0);
                C786410Ut5.S4(1.0f, textViewLJFF2);
            }
            if (i != 0 && (textViewLJFF = c21543719Sx.LJFF(i)) != null) {
                C786410Ut5.LLIL(textViewLJFF, 4);
                if (i == 1) {
                    textViewLJFF.setText((CharSequence) null);
                }
            }
            c21543719Sx.LJII = i2;
        }
        c21543719Sx.LIZIZ.LJIILLIIL();
        c21543719Sx.LIZIZ.LJIJ(z, false);
        c21543719Sx.LIZIZ.LJJIFFI();
    }

    public final void LIZLLL(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        boolean z2;
        float f;
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                if (i3 == i) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, f);
                objectAnimatorOfFloat.setDuration(167L);
                objectAnimatorOfFloat.setInterpolator(C194V.LIZ);
                ArrayList arrayList = (ArrayList) list;
                arrayList.add(objectAnimatorOfFloat);
                if (i3 == i) {
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.LJI, 0.0f);
                    objectAnimatorOfFloat2.setDuration(217L);
                    objectAnimatorOfFloat2.setInterpolator(C194V.LIZLLL);
                    arrayList.add(objectAnimatorOfFloat2);
                }
            }
        }
    }
}
