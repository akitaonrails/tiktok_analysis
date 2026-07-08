package X;

import X.C19ME;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0eTo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1090340eTo<T extends C19ME> extends C1090370eTr<T> {
    public int LJIIJJI;
    public int LJIIL;
    public float LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public int LJIJJLI;
    public int LJIL;
    public int LJJ;
    public int LJJI;
    public float LJJIFFI;
    public int LJJII;
    public int LJJIII;
    public int LJJIIJ;
    public int LJJIIJZLJL;
    public int LJJIIZ;
    public int LJJIIZI;
    public int LJJIJ;
    public int LJJIJIIJI;
    public int LJJIJIIJIL;
    public int LJJIJIL;
    public float LJJIJL;
    public float LJJIJLIJ;
    public String LJJIL;
    public float LJJIZ;
    public float LJJJ;
    public int LJJJI;
    public int LJJJIL;
    public int LJJJJ;
    public int LJJJJI;
    public int LJJJJIZL;
    public int LJJJJJ;
    public int LJJJJJL;
    public int LJJJJL;
    public float LJJJJLI;
    public float LJJJJLL;
    public int LJJJJZ;
    public int LJJJJZI;
    public int LJJJLIIL;
    public boolean LJJJLL;
    public boolean LJJJLZIJ;
    public String LJJJZ;
    public boolean LJJL;

    @Override // X.C1090370eTr, X.C1090390eTt
    public Class<? extends ViewGroup.LayoutParams> LIZJ() {
        return C19ME.class;
    }

    public C1090340eTo(T t) {
        super(t);
        this.LJIIJJI = -1;
        this.LJIIL = -1;
        this.LJIILIIL = -1.0f;
        this.LJIILJJIL = -1;
        this.LJIILL = -1;
        this.LJIILLIIL = -1;
        this.LJIIZILJ = -1;
        this.LJIJ = -1;
        this.LJIJI = -1;
        this.LJIJJ = -1;
        this.LJIJJLI = -1;
        this.LJIL = -1;
        this.LJJ = -1;
        this.LJJII = -1;
        this.LJJIII = -1;
        this.LJJIIJ = -1;
        this.LJJIIJZLJL = -1;
        this.LJJIIZ = -1;
        this.LJJIIZI = -1;
        this.LJJIJ = -1;
        this.LJJIJIIJI = -1;
        this.LJJIJIIJIL = -1;
        this.LJJIJIL = -1;
        this.LJJIJL = 0.5f;
        this.LJJIJLIJ = 0.5f;
        this.LJJIZ = -1.0f;
        this.LJJJ = -1.0f;
        this.LJJJJLI = 1.0f;
        this.LJJJJLL = 1.0f;
        this.LJJJJZ = -1;
        this.LJJJJZI = -1;
        this.LJJJLIIL = -1;
    }

    @Override // X.C1090370eTr
    /* JADX INFO: renamed from: LJ, reason: merged with bridge method [inline-methods] */
    public void LIZIZ(T t) {
        super.LIZIZ(t);
        this.LJIIJJI = t.guideBegin;
        this.LJIIL = t.guideEnd;
        this.LJIILIIL = t.guidePercent;
        this.LJIILJJIL = t.leftToLeft;
        this.LJIILL = t.leftToRight;
        this.LJIILLIIL = t.rightToLeft;
        this.LJIIZILJ = t.rightToRight;
        this.LJIJ = t.topToTop;
        this.LJIJI = t.topToBottom;
        this.LJIJJ = t.bottomToTop;
        this.LJIJJLI = t.bottomToBottom;
        this.LJIL = t.baselineToBaseline;
        this.LJJ = t.circleConstraint;
        this.LJJI = t.circleRadius;
        this.LJJIFFI = t.circleAngle;
        this.LJJII = t.startToEnd;
        this.LJJIII = t.startToStart;
        this.LJJIIJ = t.endToStart;
        this.LJJIIJZLJL = t.endToEnd;
        this.LJJIIZ = t.goneLeftMargin;
        this.LJJIIZI = t.goneTopMargin;
        this.LJJIJ = t.goneRightMargin;
        this.LJJIJIIJI = t.goneBottomMargin;
        this.LJJIJIIJIL = t.goneStartMargin;
        this.LJJIJIL = t.goneEndMargin;
        this.LJJIJL = t.horizontalBias;
        this.LJJIJLIJ = t.verticalBias;
        this.LJJIL = t.dimensionRatio;
        this.LJJIZ = t.horizontalWeight;
        this.LJJJ = t.verticalWeight;
        this.LJJJI = t.horizontalChainStyle;
        this.LJJJIL = t.verticalChainStyle;
        this.LJJJLL = t.constrainedWidth;
        this.LJJJLZIJ = t.constrainedHeight;
        this.LJJJJ = t.matchConstraintDefaultWidth;
        this.LJJJJI = t.matchConstraintDefaultHeight;
        this.LJJJJIZL = t.matchConstraintMinWidth;
        this.LJJJJJL = t.matchConstraintMaxWidth;
        this.LJJJJJ = t.matchConstraintMinHeight;
        this.LJJJJL = t.matchConstraintMaxHeight;
        this.LJJJJLI = t.matchConstraintPercentWidth;
        this.LJJJJLL = t.matchConstraintPercentHeight;
        this.LJJJJZ = t.editorAbsoluteX;
        this.LJJJJZI = t.editorAbsoluteY;
        this.LJJJLIIL = t.orientation;
        this.LJJJZ = t.constraintTag;
        this.LJJL = t.helped;
    }

    @Override // X.C1090370eTr, X.C1090390eTt
    public boolean LIZ(View view, ViewGroup.LayoutParams layoutParams) {
        C19OA c19oa;
        if (layoutParams == null || !(layoutParams instanceof C19ME)) {
            return false;
        }
        C19ME c19me = (C19ME) layoutParams;
        if (!super.LIZ(view, c19me) || this.LJIIJJI != c19me.guideBegin || this.LJIIL != c19me.guideEnd || this.LJIILIIL != c19me.guidePercent || this.LJIILJJIL != c19me.leftToLeft || this.LJIILL != c19me.leftToRight || this.LJIILLIIL != c19me.rightToLeft || this.LJIIZILJ != c19me.rightToRight || this.LJIJ != c19me.topToTop || this.LJIJI != c19me.topToBottom || this.LJIJJ != c19me.bottomToTop || this.LJIJJLI != c19me.bottomToBottom || this.LJIL != c19me.baselineToBaseline || this.LJJ != c19me.circleConstraint || this.LJJI != c19me.circleRadius || this.LJJIFFI != c19me.circleAngle || this.LJJII != c19me.startToEnd || this.LJJIII != c19me.startToStart || this.LJJIIJ != c19me.endToStart || this.LJJIIJZLJL != c19me.endToEnd || this.LJJIIZ != c19me.goneLeftMargin || this.LJJIIZI != c19me.goneTopMargin || this.LJJIJ != c19me.goneRightMargin || this.LJJIJIIJI != c19me.goneBottomMargin || this.LJJIJIIJIL != c19me.goneStartMargin || this.LJJIJIL != c19me.goneEndMargin || this.LJJIJL != c19me.horizontalBias || this.LJJIJLIJ != c19me.verticalBias || !TextUtils.equals(this.LJJIL, c19me.dimensionRatio) || this.LJJIZ != c19me.horizontalWeight || this.LJJJ != c19me.verticalWeight || this.LJJJI != c19me.horizontalChainStyle || this.LJJJIL != c19me.verticalChainStyle || this.LJJJLL != c19me.constrainedWidth || this.LJJJLZIJ != c19me.constrainedHeight || this.LJJJJ != c19me.matchConstraintDefaultWidth || this.LJJJJI != c19me.matchConstraintDefaultHeight || this.LJJJJIZL != c19me.matchConstraintMinWidth || this.LJJJJJL != c19me.matchConstraintMaxWidth || this.LJJJJJ != c19me.matchConstraintMinHeight || this.LJJJJL != c19me.matchConstraintMaxHeight || this.LJJJJLI != c19me.matchConstraintPercentWidth || this.LJJJJLL != c19me.matchConstraintPercentHeight || this.LJJJJZ != c19me.editorAbsoluteX || this.LJJJJZI != c19me.editorAbsoluteY || this.LJJJLIIL != c19me.orientation || !TextUtils.equals(this.LJJJZ, c19me.constraintTag) || this.LJJL != c19me.helped || (c19oa = c19me.widget) == null || c19oa.mCompanionWidget != view) {
            return false;
        }
        return true;
    }
}
