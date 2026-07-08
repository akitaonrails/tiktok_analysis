package X;

import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: renamed from: X.19MA, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19MA {
    public int LIZ;
    public final C19M9 LIZIZ = new C19M9();
    public final C19MC LIZJ = new C19MC();
    public final C19M2 LIZLLL = new C19M2();
    public final C19M7 LJ = new C19M7();
    public HashMap<String, C21526019Mc> LJFF = new HashMap<>();

    public final Object clone() {
        C19MA c19ma = new C19MA();
        c19ma.LIZLLL.LIZ(this.LIZLLL);
        c19ma.LIZJ.LIZ(this.LIZJ);
        C19M9 c19m9 = c19ma.LIZIZ;
        C19M9 c19m92 = this.LIZIZ;
        c19m9.getClass();
        c19m9.LIZ = c19m92.LIZ;
        c19m9.LIZIZ = c19m92.LIZIZ;
        c19m9.LIZLLL = c19m92.LIZLLL;
        c19m9.LJ = c19m92.LJ;
        c19m9.LIZJ = c19m92.LIZJ;
        c19ma.LJ.LIZ(this.LJ);
        c19ma.LIZ = this.LIZ;
        return c19ma;
    }

    public final void LIZ(C19ME c19me) {
        C19M2 c19m2 = this.LIZLLL;
        c19me.leftToLeft = c19m2.LJII;
        c19me.leftToRight = c19m2.LJIIIIZZ;
        c19me.rightToLeft = c19m2.LJIIIZ;
        c19me.rightToRight = c19m2.LJIIJ;
        c19me.topToTop = c19m2.LJIIJJI;
        c19me.topToBottom = c19m2.LJIIL;
        c19me.bottomToTop = c19m2.LJIILIIL;
        c19me.bottomToBottom = c19m2.LJIILJJIL;
        c19me.baselineToBaseline = c19m2.LJIILL;
        c19me.startToEnd = c19m2.LJIILLIIL;
        c19me.startToStart = c19m2.LJIIZILJ;
        c19me.endToStart = c19m2.LJIJ;
        c19me.endToEnd = c19m2.LJIJI;
        ((ViewGroup.MarginLayoutParams) c19me).leftMargin = c19m2.LJJIIJZLJL;
        ((ViewGroup.MarginLayoutParams) c19me).rightMargin = c19m2.LJJIIZ;
        ((ViewGroup.MarginLayoutParams) c19me).topMargin = c19m2.LJJIIZI;
        ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = c19m2.LJJIJ;
        c19me.goneStartMargin = c19m2.LJJJ;
        c19me.goneEndMargin = c19m2.LJJIZ;
        c19me.goneTopMargin = c19m2.LJJIJL;
        c19me.goneBottomMargin = c19m2.LJJIL;
        c19me.horizontalBias = c19m2.LJIJJ;
        c19me.verticalBias = c19m2.LJIJJLI;
        c19me.circleConstraint = c19m2.LJJ;
        c19me.circleRadius = c19m2.LJJI;
        c19me.circleAngle = c19m2.LJJIFFI;
        c19me.dimensionRatio = c19m2.LJIL;
        c19me.editorAbsoluteX = c19m2.LJJII;
        c19me.editorAbsoluteY = c19m2.LJJIII;
        c19me.verticalWeight = c19m2.LJJJI;
        c19me.horizontalWeight = c19m2.LJJJIL;
        c19me.verticalChainStyle = c19m2.LJJJJI;
        c19me.horizontalChainStyle = c19m2.LJJJJ;
        c19me.constrainedWidth = c19m2.LJJLIIIIJ;
        c19me.constrainedHeight = c19m2.LJJLIIIJ;
        c19me.matchConstraintDefaultWidth = c19m2.LJJJJIZL;
        c19me.matchConstraintDefaultHeight = c19m2.LJJJJJ;
        c19me.matchConstraintMaxWidth = c19m2.LJJJJJL;
        c19me.matchConstraintMaxHeight = c19m2.LJJJJL;
        c19me.matchConstraintMinWidth = c19m2.LJJJJLI;
        c19me.matchConstraintMinHeight = c19m2.LJJJJLL;
        c19me.matchConstraintPercentWidth = c19m2.LJJJJZ;
        c19me.matchConstraintPercentHeight = c19m2.LJJJJZI;
        c19me.orientation = c19m2.LJJIIJ;
        c19me.guidePercent = c19m2.LJI;
        c19me.guideBegin = c19m2.LJ;
        c19me.guideEnd = c19m2.LJFF;
        ((ViewGroup.MarginLayoutParams) c19me).width = c19m2.LIZJ;
        ((ViewGroup.MarginLayoutParams) c19me).height = c19m2.LIZLLL;
        String str = c19m2.LJJLI;
        if (str != null) {
            c19me.constraintTag = str;
        }
        c19me.setMarginStart(c19m2.LJJIJIIJIL);
        c19me.setMarginEnd(this.LIZLLL.LJJIJIIJI);
        c19me.validate();
    }

    public final void LIZIZ(int i, C19ME c19me) {
        this.LIZ = i;
        C19M2 c19m2 = this.LIZLLL;
        c19m2.LJII = c19me.leftToLeft;
        c19m2.LJIIIIZZ = c19me.leftToRight;
        c19m2.LJIIIZ = c19me.rightToLeft;
        c19m2.LJIIJ = c19me.rightToRight;
        c19m2.LJIIJJI = c19me.topToTop;
        c19m2.LJIIL = c19me.topToBottom;
        c19m2.LJIILIIL = c19me.bottomToTop;
        c19m2.LJIILJJIL = c19me.bottomToBottom;
        c19m2.LJIILL = c19me.baselineToBaseline;
        c19m2.LJIILLIIL = c19me.startToEnd;
        c19m2.LJIIZILJ = c19me.startToStart;
        c19m2.LJIJ = c19me.endToStart;
        c19m2.LJIJI = c19me.endToEnd;
        c19m2.LJIJJ = c19me.horizontalBias;
        c19m2.LJIJJLI = c19me.verticalBias;
        c19m2.LJIL = c19me.dimensionRatio;
        c19m2.LJJ = c19me.circleConstraint;
        c19m2.LJJI = c19me.circleRadius;
        c19m2.LJJIFFI = c19me.circleAngle;
        c19m2.LJJII = c19me.editorAbsoluteX;
        c19m2.LJJIII = c19me.editorAbsoluteY;
        c19m2.LJJIIJ = c19me.orientation;
        c19m2.LJI = c19me.guidePercent;
        c19m2.LJ = c19me.guideBegin;
        c19m2.LJFF = c19me.guideEnd;
        c19m2.LIZJ = ((ViewGroup.MarginLayoutParams) c19me).width;
        c19m2.LIZLLL = ((ViewGroup.MarginLayoutParams) c19me).height;
        c19m2.LJJIIJZLJL = ((ViewGroup.MarginLayoutParams) c19me).leftMargin;
        c19m2.LJJIIZ = ((ViewGroup.MarginLayoutParams) c19me).rightMargin;
        c19m2.LJJIIZI = ((ViewGroup.MarginLayoutParams) c19me).topMargin;
        c19m2.LJJIJ = ((ViewGroup.MarginLayoutParams) c19me).bottomMargin;
        c19m2.LJJJI = c19me.verticalWeight;
        c19m2.LJJJIL = c19me.horizontalWeight;
        c19m2.LJJJJI = c19me.verticalChainStyle;
        c19m2.LJJJJ = c19me.horizontalChainStyle;
        c19m2.LJJLIIIIJ = c19me.constrainedWidth;
        c19m2.LJJLIIIJ = c19me.constrainedHeight;
        c19m2.LJJJJIZL = c19me.matchConstraintDefaultWidth;
        c19m2.LJJJJJ = c19me.matchConstraintDefaultHeight;
        c19m2.LJJJJJL = c19me.matchConstraintMaxWidth;
        c19m2.LJJJJL = c19me.matchConstraintMaxHeight;
        c19m2.LJJJJLI = c19me.matchConstraintMinWidth;
        c19m2.LJJJJLL = c19me.matchConstraintMinHeight;
        c19m2.LJJJJZ = c19me.matchConstraintPercentWidth;
        c19m2.LJJJJZI = c19me.matchConstraintPercentHeight;
        c19m2.LJJLI = c19me.constraintTag;
        c19m2.LJJIJL = c19me.goneTopMargin;
        c19m2.LJJIL = c19me.goneBottomMargin;
        c19m2.LJJIJIL = c19me.goneLeftMargin;
        c19m2.LJJIJLIJ = c19me.goneRightMargin;
        c19m2.LJJJ = c19me.goneStartMargin;
        c19m2.LJJIZ = c19me.goneEndMargin;
        c19m2.LJJIJIIJI = c19me.getMarginEnd();
        this.LIZLLL.LJJIJIIJIL = c19me.getMarginStart();
    }

    public final void LIZJ(int i, C19M3 c19m3) {
        LIZIZ(i, c19m3);
        this.LIZIZ.LIZLLL = c19m3.LIZ;
        C19M7 c19m7 = this.LJ;
        c19m7.LIZIZ = c19m3.LIZLLL;
        c19m7.LIZJ = c19m3.LJ;
        c19m7.LIZLLL = c19m3.LJFF;
        c19m7.LJ = c19m3.LJI;
        c19m7.LJFF = c19m3.LJII;
        c19m7.LJI = c19m3.LJIIIIZZ;
        c19m7.LJII = c19m3.LJIIIZ;
        c19m7.LJIIIIZZ = c19m3.LJIIJ;
        c19m7.LJIIIZ = c19m3.LJIIJJI;
        c19m7.LJIIJ = c19m3.LJIIL;
        c19m7.LJIIL = c19m3.LIZJ;
        c19m7.LJIIJJI = c19m3.LIZIZ;
    }
}
