package X;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0rYW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1592980rYW extends C1592940rYS {
    public C1592290rXP LLJJJJLIIL;
    public Pair<Integer, Integer> LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;

    @Override // X.C1592940rYS
    public final Pair<Integer, Integer> LJJJI() {
        Pair<Integer, Integer> pair = this.LLJJL;
        return (pair == null || !this.LLJJLIIIJLLLLLLLZ) ? super.LJJJI() : pair;
    }

    @Override // X.C1592940rYS, X.AbstractC1592930rYR
    public final ImageView LJI() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ImageView imageViewLJI = super.LJI();
        if (this.LLJJL != null && this.LLJJLIIIJLLLLLLLZ) {
            ViewGroup.LayoutParams layoutParams = imageViewLJI.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
            if ((layoutParams instanceof FrameLayout.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMargins(LJJJI().getFirst().intValue() / 2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0, 0);
                marginLayoutParams.setMarginStart(LJJJI().getFirst().intValue() / 2);
                marginLayoutParams2 = marginLayoutParams;
            }
            C786410Ut5.c6(imageViewLJI, marginLayoutParams2);
        }
        return imageViewLJI;
    }

    @Override // X.C1592940rYS, X.AbstractC1592930rYR
    public final ImageView LJIIIIZZ() {
        ImageView imageViewLJIIIIZZ = super.LJIIIIZZ();
        if (this.LLJJLIIIJLLLLLLLZ) {
            this.LL.setTabIconBackImageDrawable(this.LLILLL.LIZ(LJJIZ(LJIJ()).LIZ, imageViewLJIIIIZZ.getContext()));
            ImageView tabIcon = this.LL.getTabIcon();
            if (tabIcon != null) {
                ViewGroup.LayoutParams layoutParams = tabIcon.getLayoutParams();
                layoutParams.width = LJJJI().getFirst().intValue();
                layoutParams.height = LJJJI().getSecond().intValue();
                C786410Ut5.c6(tabIcon, layoutParams);
            }
        }
        return imageViewLJIIIIZZ;
    }

    public C1592980rYW(C1592950rYT c1592950rYT) {
        super(c1592950rYT);
    }

    @Override // X.AbstractC1592930rYR
    public final void LJJIFFI(C19EG c19eg) {
        this.LLJJLIIIJLLLLLLLZ = false;
        LJJJJL(c19eg);
        this.LLJJJJLIIL = null;
        this.LLJJL = null;
        LJJIJIL();
    }

    @Override // X.C1592940rYS
    public final C1593140rYm LJJIZ(boolean z) {
        C1592290rXP c1592290rXP = this.LLJJJJLIIL;
        if (c1592290rXP != null && this.LLJJLIIIJLLLLLLLZ) {
            if (this.LLILLJJLI == EnumC1571190qzN.DARK) {
                if (z) {
                    return c1592290rXP.LIZIZ;
                }
                return c1592290rXP.LIZLLL;
            }
            if (z) {
                return c1592290rXP.LIZ;
            }
            return c1592290rXP.LIZJ;
        }
        return super.LJJIZ(z);
    }

    @Override // X.C1592940rYS
    public final C1593140rYm LJJJ(boolean z) {
        C1592290rXP c1592290rXP = this.LLJJJJLIIL;
        if (c1592290rXP != null && this.LLJJLIIIJLLLLLLLZ) {
            if (z) {
                return c1592290rXP.LIZIZ;
            }
            return c1592290rXP.LIZLLL;
        }
        return super.LJJJ(z);
    }

    public final void LJJJJL(C19EG c19eg) {
        ImageView redDotVIew;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        this.LL.setTabIconBackImageDrawable(this.LLILLL.LIZ(LJJIZ(LJIJ()).LIZ, c19eg));
        ImageView tabIcon = this.LL.getTabIcon();
        if (tabIcon != null) {
            ViewGroup.LayoutParams layoutParams = tabIcon.getLayoutParams();
            layoutParams.width = LJJJI().getFirst().intValue();
            layoutParams.height = LJJJI().getSecond().intValue();
            C786410Ut5.c6(tabIcon, layoutParams);
        }
        if (this.LLJJL != null && (redDotVIew = this.LL.getRedDotVIew()) != null) {
            ViewGroup.LayoutParams layoutParams2 = redDotVIew.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
            if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams.setMargins(LJJJI().getFirst().intValue() / 2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0, 0);
                marginLayoutParams.setMarginStart(LJJJI().getFirst().intValue() / 2);
                marginLayoutParams2 = marginLayoutParams;
            }
            C786410Ut5.c6(redDotVIew, marginLayoutParams2);
        }
    }

    @Override // X.AbstractC1592930rYR
    public final void LJJIIJ(C19EG c19eg, C1592290rXP c1592290rXP, Pair pair) {
        Pair<Integer, Integer> pair2;
        this.LLJJLIIIJLLLLLLLZ = true;
        this.LLJJJJLIIL = c1592290rXP;
        if (pair != null) {
            pair2 = new Pair<>(Integer.valueOf((int) (((Number) pair.getFirst()).floatValue() * (r3.getSecond().intValue() / ((Number) pair.getSecond()).intValue()))), super.LJJJI().getSecond());
        } else {
            pair2 = null;
        }
        this.LLJJL = pair2;
        LJJJJL(c19eg);
    }
}
