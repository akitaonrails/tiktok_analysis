package X;

import Y.ALAdapterS24S0100000_29;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.113H, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C113H extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LLJJJ = 0;
    public final View LL;
    public final C113G LLILLJJLI;
    public final boolean LLILLL;
    public final C113D LLILZ;
    public C113J LLILZIL;
    public final boolean LLILZLL;
    public EffectModel LLIZ;
    public LinearLayout LLIZLLLIL;
    public C1324800kZy LLJ;
    public TuxTextView LLJI;
    public TuxIconView LLJIJIL;
    public ImageView LLJILJIL;
    public View LLJILJILJ;
    public View LLJILLL;
    public ObjectAnimator LLJJ;
    public int LLJJI;
    public Drawable LLJJIII;
    public C19670811xi LLJJIJI;
    public int LLJJIJIIJIL;
    public final C01GW LLJJIJIL;

    public final void L5() {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = this.LLJJ;
        if (objectAnimator2 != null && objectAnimator2.isRunning() && (objectAnimator = this.LLJJ) != null) {
            objectAnimator.cancel();
        }
        TuxIconView tuxIconView = this.LLJIJIL;
        if (tuxIconView != null) {
            C786410Ut5.Fb(tuxIconView, 0.0f);
        }
        TuxIconView tuxIconView2 = this.LLJIJIL;
        if (tuxIconView2 != null) {
            tuxIconView2.setIconRes(R.raw.icon_arrow_down_circle_fill);
        }
    }

    public final void P5() {
        EffectModel effectModel;
        C113J c113j = this.LLILZIL;
        if (c113j != null) {
            int iLIZ = c113j.LIZ(getAbsoluteAdapterPosition());
            this.LLJJIJIIJIL = iLIZ;
            if (-1 == iLIZ || (effectModel = this.LLIZ) == null) {
                return;
            }
            C113J c113j2 = this.LLILZIL;
            if (c113j2 != null) {
                c113j2.LJII(5, iLIZ, effectModel);
            }
            R5(1.0f);
        }
    }

    public final void N5(boolean z) {
        int currentTextColor;
        TuxTextView tuxTextView = this.LLJI;
        if (tuxTextView != null) {
            currentTextColor = tuxTextView.getCurrentTextColor();
        } else {
            currentTextColor = R.attr.eg;
        }
        if (!z) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(colorMatrix);
            C1324800kZy c1324800kZy = this.LLJ;
            if (c1324800kZy != null) {
                c1324800kZy.setColorFilter(colorMatrixColorFilter);
            }
            currentTextColor = R.attr.ei;
        } else {
            C1324800kZy c1324800kZy2 = this.LLJ;
            if (c1324800kZy2 != null) {
                c1324800kZy2.setColorFilter((ColorFilter) null);
            }
        }
        TuxTextView tuxTextView2 = this.LLJI;
        if (tuxTextView2 != null) {
            tuxTextView2.setTextColorRes(currentTextColor);
        }
    }

    public final void R5(float f) {
        View view;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        if (this.LLILLL) {
            view = this.itemView;
        } else {
            view = this.LLJ;
        }
        if (view != null && (viewPropertyAnimatorAnimate = view.animate()) != null) {
            viewPropertyAnimatorAnimate.scaleX(f);
            viewPropertyAnimatorAnimate.scaleY(f);
            viewPropertyAnimatorAnimate.setDuration(100L);
            viewPropertyAnimatorAnimate.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I5(int r11, com.ss.android.ugc.aweme.effect.EffectModel r12) {
        /*
            Method dump skipped, instruction units count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113H.I5(int, com.ss.android.ugc.aweme.effect.EffectModel):void");
    }

    public final void S5(int i, int i2) {
        C19670811xi c19670811xi;
        C19670811xi c19670811xi2;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        if (this.LLJJIJIIJIL == i2 && this.LLILZLL) {
            if (i >= 0 && i <= 100) {
                C19670811xi c19670811xi3 = this.LLJJIJI;
                if ((c19670811xi3 == null || c19670811xi3.getVisibility() != 0) && (c19670811xi = this.LLJJIJI) != null) {
                    C786410Ut5.G1(c19670811xi, 0);
                }
                C19670811xi c19670811xi4 = this.LLJJIJI;
                if (c19670811xi4 != null) {
                    c19670811xi4.setProgress(i);
                }
                if (i == 100 && (c19670811xi2 = this.LLJJIJI) != null && (viewPropertyAnimatorAnimate = c19670811xi2.animate()) != null) {
                    viewPropertyAnimatorAnimate.scaleX(1.8f);
                    viewPropertyAnimatorAnimate.scaleY(1.8f);
                    viewPropertyAnimatorAnimate.setInterpolator(C1619980sG4.LJIILIIL());
                    viewPropertyAnimatorAnimate.setDuration(200L);
                    viewPropertyAnimatorAnimate.setListener(new ALAdapterS24S0100000_29(this, 28));
                    viewPropertyAnimatorAnimate.start();
                    return;
                }
                return;
            }
            C19670811xi c19670811xi5 = this.LLJJIJI;
            if (c19670811xi5 != null) {
                C786410Ut5.G1(c19670811xi5, 8);
            }
        }
    }

    public C113H(View view, C113G c113g, boolean z, C113D c113d, C113J c113j, boolean z2) {
        boolean z3;
        C1324800kZy c1324800kZy;
        float f;
        super(view);
        this.LL = view;
        this.LLILLJJLI = c113g;
        this.LLILLL = z;
        this.LLILZ = c113d;
        this.LLILZIL = c113j;
        this.LLILZLL = z2;
        this.LLJJI = 1;
        this.LLJJIJIIJIL = -1;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(426));
        this.LLJJIJIL = c01gwLIZIZ;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.l1n);
        linearLayout.getLayoutParams().width = c113g.LJJ + c113g.LJIL;
        this.LLIZLLLIL = linearLayout;
        int iMin = 0;
        if (((Boolean) c01gwLIZIZ.getValue()).booleanValue() && (c113g.LJII || c113g.LJJIJIIJIL)) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1324800kZy c1324800kZy2 = (C1324800kZy) view.findViewById(R.id.lfj);
        TuxTextView tuxTextView = null;
        if (c1324800kZy2 != null) {
            c1324800kZy2.LLJILJIL = true;
            if (c113g.LJIILL) {
                Context context = c1324800kZy2.getContext();
                if (((Boolean) c01gwLIZIZ.getValue()).booleanValue()) {
                    f = 14.0f;
                } else {
                    f = 8.0f;
                }
                c1324800kZy2.setRectFRadius(C12ES.LIZJ(f, context));
                int i = C1324800kZy.LLJILLL;
                c1324800kZy2.setClipStyle(1);
            }
            iMin = Math.min(C366700EZg.LIZ(60.0d), (int) (((double) C1415610mwR.LIZIZ()) * 0.14d));
            c1324800kZy2.getLayoutParams().width = iMin;
            c1324800kZy2.getLayoutParams().height = iMin;
            c1324800kZy2.setEnableAnimation(true);
        } else {
            c1324800kZy2 = null;
        }
        this.LLJ = c1324800kZy2;
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.zjr);
        if (tuxTextView2 != null) {
            if (!z3) {
                tuxTextView2.setHorizontalFadingEdgeEnabled(true);
            }
            tuxTextView2.setFadingEdgeLength((int) C12ES.LIZJ(4.0f, tuxTextView2.getContext()));
            tuxTextView2.getLayoutParams().width = c113g.LJJ;
            tuxTextView = tuxTextView2;
        }
        this.LLJI = tuxTextView;
        this.LLJILLL = view.findViewById(R.id.lgz);
        this.LLJIJIL = (TuxIconView) view.findViewById(R.id.lf7);
        this.LLJILJIL = (ImageView) view.findViewById(R.id.lfb);
        View viewFindViewById = view.findViewById(R.id.w4q);
        viewFindViewById.getLayoutParams().width = C366700EZg.LIZ(8.0d) + iMin;
        viewFindViewById.getLayoutParams().height = C366700EZg.LIZ(8.0d) + iMin;
        this.LLJILJILJ = viewFindViewById;
        if (z2) {
            C19670811xi c19670811xi = (C19670811xi) view.findViewById(R.id.lnr);
            this.LLJJIJI = c19670811xi;
            if (c19670811xi != null) {
                c19670811xi.getLayoutParams().width = iMin;
                c19670811xi.getLayoutParams().height = iMin;
                c19670811xi.setCircleRadius((iMin / 2) - C12ES.LIZJ(8.0f, c19670811xi.getContext()));
                c19670811xi.setMaxProgress(100);
                C786410Ut5.G1(c19670811xi, 8);
            }
        }
        if (!z && (c1324800kZy = this.LLJ) != null) {
            c1324800kZy.setOnTouchListener(new ViewOnTouchListenerC1657570tEh(1.2f, 100L, c1324800kZy));
        }
        C1324800kZy c1324800kZy3 = this.LLJ;
        if (c1324800kZy3 != null) {
            Context context2 = C19733712It.LIZ;
            this.LLJJIII = C19733712It.LJ(c1324800kZy3.getContext().getDrawable(R.drawable.aa4), c1324800kZy3.getResources().getColor(R.color.a0u));
            c1324800kZy3.getHierarchy().LJIIZILJ(InterfaceC1320380kSq.LIZJ);
            c1324800kZy3.getHierarchy().LJIJ(this.LLJJIII, 5);
        }
    }
}
