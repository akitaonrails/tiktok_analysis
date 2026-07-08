package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: X.0kdL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1326890kdL extends C21578619ce {
    public boolean LL;
    public int LLILLJJLI;

    @Override // X.C21578619ce
    public final int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
        int iHeight;
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        Integer numValueOf4;
        if (!this.LL) {
            if (rect != null) {
                iHeight = rect.height();
            } else {
                iHeight = 0;
            }
            if (iHeight <= C12ES.LIZJ(50.0f, getContext())) {
                int iComputeScrollDeltaToGetChildRectOnScreen = super.computeScrollDeltaToGetChildRectOnScreen(rect);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("rect left ");
                Integer numValueOf5 = null;
                if (rect != null) {
                    numValueOf = Integer.valueOf(rect.left);
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                sbLIZ.append("  right ");
                if (rect != null) {
                    numValueOf2 = Integer.valueOf(rect.right);
                } else {
                    numValueOf2 = null;
                }
                sbLIZ.append(numValueOf2);
                sbLIZ.append(" bottom ");
                if (rect != null) {
                    numValueOf3 = Integer.valueOf(rect.bottom);
                } else {
                    numValueOf3 = null;
                }
                sbLIZ.append(numValueOf3);
                sbLIZ.append(" top ");
                if (rect != null) {
                    numValueOf4 = Integer.valueOf(rect.top);
                } else {
                    numValueOf4 = null;
                }
                sbLIZ.append(numValueOf4);
                sbLIZ.append("height ");
                if (rect != null) {
                    numValueOf5 = Integer.valueOf(rect.height());
                }
                sbLIZ.append(numValueOf5);
                sbLIZ.append("   result ");
                sbLIZ.append(iComputeScrollDeltaToGetChildRectOnScreen);
                C2188811AlT.LIZIZ(sbLIZ);
                return iComputeScrollDeltaToGetChildRectOnScreen;
            }
        }
        return 0;
    }

    public final void setForbidAutoScrollToShowChild(boolean z) {
        this.LL = z;
    }

    public final void setMaxHeight(int i) {
        this.LLILLJJLI = i;
    }

    public C1326890kdL(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // X.C21578619ce, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.LLILLJJLI;
        if (i3 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    public C1326890kdL(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = true;
        this.LLILLJJLI = -1;
    }
}
