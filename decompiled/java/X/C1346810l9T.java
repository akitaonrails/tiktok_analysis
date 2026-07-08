package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import u4.q0;

/* JADX INFO: renamed from: X.0l9T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1346810l9T {
    public static final /* synthetic */ int LJIL = 0;
    public final ViewGroup LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final C1353500lKG LJII;
    public boolean LJIIIIZZ;
    public final View LJIIIZ;
    public final ImageView LJIIJ;
    public final SmartImageView LJIIJJI;
    public final LinearLayout LJIIL;
    public final LinearLayout LJIILIIL;
    public final View LJIILJJIL;
    public final TuxIconView LJIILL;
    public final TuxIconView LJIILLIIL;
    public final TuxIconView LJIIZILJ;
    public final ViewGroup LJIJ;
    public float LJIJI;
    public EnumC992180bvU LJIJJ;
    public boolean LJIJJLI;

    public final void LJ() {
        ConstraintLayout constraintLayout;
        ImageView imageView;
        if (this.LIZIZ) {
            ViewGroup viewGroup = this.LIZ;
            if (!(viewGroup instanceof ConstraintLayout) || (constraintLayout = (ConstraintLayout) viewGroup) == null) {
                return;
            }
            C19MB c19mb = new C19MB();
            c19mb.LJII(constraintLayout);
            SmartImageView smartImageView = this.LJIIJJI;
            if (smartImageView != null) {
                int id = smartImageView.getId();
                c19mb.LJI(id, 4);
                c19mb.LJIIIZ(id, 3, 0, 3, C0HD5.LIZ(this.LIZ, 13));
            }
            if ((this.LJIIIIZZ || !this.LJ) && (imageView = this.LJIIJ) != null) {
                int id2 = imageView.getId();
                c19mb.LJI(id2, 4);
                c19mb.LJIIIZ(id2, 3, 0, 3, C0HD5.LIZ(this.LIZ, 13));
            }
            c19mb.LIZIZ(constraintLayout);
        }
    }

    public final void LJFF() {
        ConstraintLayout constraintLayout;
        if (this.LIZIZ) {
            if (!this.LIZJ) {
                C786410Ut5.T4(this.LJIIIZ, 1.0f);
                this.LJIIIZ.setEnabled(true);
            }
            ViewGroup viewGroup = this.LIZ;
            if (!(viewGroup instanceof ConstraintLayout) || (constraintLayout = (ConstraintLayout) viewGroup) == null) {
                return;
            }
            C19MB c19mb = new C19MB();
            c19mb.LJII(constraintLayout);
            LinearLayout linearLayout = this.LJIIL;
            if (linearLayout != null) {
                int id = linearLayout.getId();
                c19mb.LJI(id, 7);
                c19mb.LJIIIZ(id, 7, this.LJIIIZ.getId(), 6, C0HD5.LIZ(this.LIZ, 6));
            }
            c19mb.LIZIZ(constraintLayout);
        }
    }

    public final void LIZIZ(boolean z) {
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        if (this.LIZJ) {
            C19MB c19mb = new C19MB();
            ViewGroup viewGroup = this.LIZ;
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            if (viewGroup instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) viewGroup;
            } else {
                constraintLayout = null;
            }
            c19mb.LJII(constraintLayout);
            if (!z) {
                c19mb.LJI(this.LJII.getId(), 7);
                c19mb.LJIIIZ(this.LJII.getId(), 7, this.LJIILJJIL.getId(), 7, C0HD5.LIZ(this.LIZ, 14));
            }
            ViewGroup viewGroup2 = this.LIZ;
            if (viewGroup2 instanceof ConstraintLayout) {
                constraintLayout2 = (ConstraintLayout) viewGroup2;
            } else {
                constraintLayout2 = null;
            }
            c19mb.LIZIZ(constraintLayout2);
            View view = this.LJIILJJIL;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMarginEnd(C0HD5.LIZ(view, 12));
            }
            C786410Ut5.W5(view, marginLayoutParams);
        }
    }

    public final void LIZJ(boolean z) {
        int iLIZ;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LJIILJJIL.getLayoutParams();
        if (z) {
            iLIZ = C0HD5.LIZ(this.LJIILJJIL, 14);
        } else {
            iLIZ = C0HD5.LIZ(this.LJIILJJIL, 12);
        }
        marginLayoutParams.setMarginEnd(iLIZ);
        C786410Ut5.W5(this.LJIILJJIL, marginLayoutParams);
    }

    public final void LIZLLL(float f) {
        float dimension;
        this.LJIJI = f;
        if (!this.LJIJJLI) {
            View view = this.LJIILJJIL;
            if (C1347570lAh.LIZIZ() && view != null) {
                dimension = view.getResources().getDimension(R.dimen.jq);
            } else {
                dimension = -1.0f;
            }
            Float fValueOf = Float.valueOf(dimension);
            if (fValueOf.floatValue() >= 0.0f) {
                f = fValueOf.floatValue();
            }
        }
        View view2 = this.LJIILJJIL;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(f);
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.br);
        view2.setBackground(c384050F3z.LIZ(this.LJIILJJIL.getContext()));
    }

    public C1346810l9T(ViewGroup viewGroup, boolean z) {
        View viewFindViewById;
        this.LIZ = viewGroup;
        boolean z2 = !z;
        this.LIZIZ = z2;
        this.LIZJ = z2;
        this.LIZLLL = z2;
        this.LJFF = C1347860lBA.LIZIZ;
        this.LJI = C295130BhX.LIZ();
        C1353500lKG c1353500lKG = (C1353500lKG) viewGroup.findViewById(R.id.eal);
        this.LJII = c1353500lKG;
        if (z2) {
            viewFindViewById = viewGroup.findViewById(R.id.ed9);
        } else {
            viewFindViewById = viewGroup.findViewById(R.id.ed_);
        }
        this.LJIIIZ = viewFindViewById;
        this.LJIIJ = (ImageView) viewGroup.findViewById(R.id.t83);
        this.LJIIJJI = (SmartImageView) viewGroup.findViewById(R.id.e_l);
        LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(R.id.k0y);
        this.LJIIL = linearLayout;
        this.LJIILIIL = (LinearLayout) viewGroup.findViewById(R.id.gzs);
        View viewFindViewById2 = viewGroup.findViewById(R.id.ma7);
        this.LJIILJJIL = viewFindViewById2;
        linearLayout.findViewById(R.id.lzc);
        this.LJIILL = (TuxIconView) linearLayout.findViewById(R.id.l99);
        this.LJIILLIIL = (TuxIconView) linearLayout.findViewById(R.id.lfo);
        linearLayout.findViewById(R.id.ll7);
        this.LJIIZILJ = (TuxIconView) linearLayout.findViewById(R.id.lie);
        ViewGroup viewGroup2 = (ViewGroup) linearLayout.findViewById(R.id.kcl);
        this.LJIJ = viewGroup2;
        this.LJIJJ = EnumC992180bvU.DEFAULT;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1p, c1353500lKG.getContext());
        if (numLIZJ != null) {
            c1353500lKG.setHintTextColor(numLIZJ.intValue());
        }
        LIZLLL(C0HD5.LIZIZ(viewFindViewById2, 22));
        if (viewGroup2 != null) {
            q0.LJIJ(viewGroup2, new C1402430mbB(5));
        }
    }

    public final void LIZ(C1353500lKG c1353500lKG, boolean z, boolean z2) {
        int lineHeight;
        int paddingBottom;
        Editable editableLLLZZIL = C2204961BRm.LLLZZIL(c1353500lKG, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0lmmJgVHJdzXA2WFrRFmf6pZs/d84/J7WIIPmDL4LAhSbQUFq", null));
        if (editableLLLZZIL != null && editableLLLZZIL.length() != 0) {
            c1353500lKG.setHint("");
            if (z) {
                C1350650lFf.LIZ.getClass();
                if (this.LIZLLL) {
                    lineHeight = ((int) (((double) c1353500lKG.getLineHeight()) * (((double) C288920BUc.LIZ()) + 0.5d))) + c1353500lKG.getPaddingTop();
                    paddingBottom = c1353500lKG.getPaddingBottom();
                } else {
                    lineHeight = ((int) (((double) c1353500lKG.getLineHeight()) * 3.5d)) + c1353500lKG.getPaddingTop();
                    paddingBottom = c1353500lKG.getPaddingBottom();
                }
                c1353500lKG.setMaxHeight(lineHeight + paddingBottom);
                return;
            }
            C1350650lFf.LIZ.getClass();
            c1353500lKG.setMaxLines(1);
            return;
        }
        c1353500lKG.setMaxLines(1);
        c1353500lKG.setEllipsize(TextUtils.TruncateAt.END);
    }

    public final void LJI(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        boolean z9;
        if (z) {
            C786410Ut5.LJLLLLLL(0, this.LJIIIZ);
            C786410Ut5.T4(this.LJIIIZ, 1.0f);
            this.LJIIIZ.setEnabled(true);
            if (z2) {
                AnimatorSet animatorSet = new AnimatorSet();
                if (this.LIZIZ) {
                    ObjectAnimator duration = ObjectAnimator.ofFloat(this.LJIIIZ, (Property<View, Float>) View.SCALE_X, 0.0f, 1.0f).setDuration(150L);
                    ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.LJIIIZ, (Property<View, Float>) View.SCALE_Y, 0.0f, 1.0f).setDuration(150L);
                    animatorSet.setInterpolator(C1619980sG4.LIZLLL());
                    animatorSet.playTogether(duration, duration2);
                } else {
                    ObjectAnimator duration3 = ObjectAnimator.ofFloat(this.LJIIIZ, (Property<View, Float>) View.SCALE_X, 0.0f, 1.0f).setDuration(250L);
                    ObjectAnimator duration4 = ObjectAnimator.ofFloat(this.LJIIIZ, (Property<View, Float>) View.SCALE_Y, 0.0f, 1.0f).setDuration(250L);
                    ObjectAnimator duration5 = ObjectAnimator.ofFloat(this.LJIIIZ, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(250L);
                    duration3.setInterpolator(new Interpolator() { // from class: X.0l9X
                        @Override // android.animation.TimeInterpolator
                        public final float getInterpolation(float f) {
                            if (f != 0.0f) {
                                return f <= 0.72f ? 1.14f * (f / 0.72f) : f <= 0.88f ? (((0.88f - f) / 0.16f) * 0.20999998f) + 0.93f : 1.0f - (((1.0f - f) / 0.12f) * 0.06999999f);
                            }
                            return 0.0f;
                        }
                    });
                    duration4.setInterpolator(new Interpolator() { // from class: X.0l9X
                        @Override // android.animation.TimeInterpolator
                        public final float getInterpolation(float f) {
                            if (f != 0.0f) {
                                return f <= 0.72f ? 1.14f * (f / 0.72f) : f <= 0.88f ? (((0.88f - f) / 0.16f) * 0.20999998f) + 0.93f : 1.0f - (((1.0f - f) / 0.12f) * 0.06999999f);
                            }
                            return 0.0f;
                        }
                    });
                    duration5.setInterpolator(new C1357190lQD());
                    animatorSet.playTogether(duration3, duration4, duration5);
                }
                animatorSet.start();
            }
            if (this.LIZIZ && !z4) {
                C786410Ut5.LJZL(8, this.LJIIL);
            }
            if (z5 && !z4) {
                C786410Ut5.LJZL(8, this.LJIIL);
                LinearLayout linearLayout = this.LJIILIIL;
                if (linearLayout != null) {
                    C786410Ut5.LJZL(8, linearLayout);
                }
            }
            if (((Number) C286040BJa.LIZ.getValue()).intValue() > 0 && z6 && !z4) {
                C786410Ut5.LJZL(8, this.LJIIL);
                LinearLayout linearLayout2 = this.LJIILIIL;
                if (linearLayout2 != null) {
                    C786410Ut5.LJZL(8, linearLayout2);
                }
            }
        } else {
            C786410Ut5.LJLLLLLL(8, this.LJIIIZ);
            if (this.LIZIZ && !z4) {
                C786410Ut5.LJZL(0, this.LJIIL);
            }
            if (z5 && !z4) {
                C786410Ut5.LJZL(8, this.LJIIL);
                LinearLayout linearLayout3 = this.LJIILIIL;
                if (linearLayout3 != null) {
                    C786410Ut5.LJZL(0, linearLayout3);
                }
            }
            if (((Number) C286040BJa.LIZ.getValue()).intValue() > 0) {
                if (z6 && !z4) {
                    C786410Ut5.LJZL(0, this.LJIIL);
                    LinearLayout linearLayout4 = this.LJIILIIL;
                    if (linearLayout4 != null) {
                        C786410Ut5.LJZL(8, linearLayout4);
                    }
                } else if (this.LJIJJ == EnumC992180bvU.DETAIL_BOTTOM && !z4) {
                    C786410Ut5.LJZL(8, this.LJIIL);
                    LinearLayout linearLayout5 = this.LJIILIIL;
                    if (linearLayout5 != null) {
                        C786410Ut5.LJZL(0, linearLayout5);
                    }
                }
            }
        }
        if (C1347610lAl.LIZIZ()) {
            if (this.LJIIIZ.isEnabled() != z7) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z7) {
                this.LJIIIZ.setEnabled(false);
                C786410Ut5.T4(this.LJIIIZ, 0.4f);
            } else {
                this.LJIIIZ.setEnabled(true);
                C786410Ut5.T4(this.LJIIIZ, 1.0f);
            }
            if (z9) {
                this.LJIIIZ.invalidate();
                this.LJIIIZ.requestLayout();
            }
        }
        LIZJ(z3);
        LIZ(this.LJII, z4, z8);
    }
}
