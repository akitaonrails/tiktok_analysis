package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0f6J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1114210f6J extends ViewGroup implements InterfaceC1090410eTv {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public C1090400eTu LLIZ;
    public int LLIZLLLIL;

    @Override // X.InterfaceC1090410eTv
    public final void LLJL() {
        this.LLIZLLLIL++;
    }

    @Override // X.InterfaceC1090410eTv
    public C1090400eTu getCacheHelper() {
        C1090400eTu c1090400eTu = this.LLIZ;
        if (c1090400eTu != null) {
            return c1090400eTu;
        }
        C1090400eTu c1090400eTu2 = new C1090400eTu();
        this.LLIZ = c1090400eTu2;
        return c1090400eTu2;
    }

    public View getLabelEnd() {
        return (View) this.LLILLJJLI.getValue();
    }

    public View getLabelStart() {
        return (View) this.LLILLL.getValue();
    }

    public View getName() {
        return (View) this.LL.getValue();
    }

    @Override // X.InterfaceC1090410eTv
    public int getCallCount() {
        return this.LLIZLLLIL;
    }

    public int getGap() {
        return this.LLILZ;
    }

    public int getNameMinWidth() {
        return this.LLILZIL;
    }

    public int getTopSpace() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1090410eTv
    public final void LLZZ(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setGap(int i) {
        this.LLILZ = i;
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1090380eTs.LIZ(this, layoutParams);
    }

    public void setNameMinWidth(int i) {
        this.LLILZIL = i;
    }

    public void setTopSpace(int i) {
        this.LLILZLL = i;
    }

    public AbstractC1114210f6J(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredWidth;
        int measuredWidth2;
        int measuredWidth3;
        int measuredWidth4;
        if (View.MeasureSpec.getMode(i) == 0) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int gap = 0;
        measureChild(getName(), ViewGroup.getChildMeasureSpec(i, 0, getName().getLayoutParams().width), ViewGroup.getChildMeasureSpec(i2, 0, getName().getLayoutParams().height));
        if (getName().getMeasuredWidth() <= getNameMinWidth()) {
            if (getLabelStart().getVisibility() != 8) {
                measureChild(getLabelStart(), ViewGroup.getChildMeasureSpec(i, getGap() + getName().getMeasuredWidth(), getLabelStart().getLayoutParams().width), ViewGroup.getChildMeasureSpec(i2, 0, getLabelStart().getLayoutParams().height));
            }
            if (getLabelEnd().getVisibility() != 8) {
                View labelEnd = getLabelEnd();
                if (getLabelStart().getVisibility() == 8) {
                    measuredWidth4 = 0;
                } else {
                    measuredWidth4 = getLabelStart().getMeasuredWidth() + getGap();
                }
                measureChild(labelEnd, ViewGroup.getChildMeasureSpec(i, measuredWidth4 + getName().getMeasuredWidth() + getGap(), getLabelEnd().getLayoutParams().width), ViewGroup.getChildMeasureSpec(i2, 0, getLabelEnd().getLayoutParams().height));
            }
        } else {
            if (getLabelStart().getVisibility() != 8) {
                measureChild(getLabelStart(), ViewGroup.getChildMeasureSpec(i, getGap() + getNameMinWidth(), getLabelStart().getLayoutParams().width), ViewGroup.getChildMeasureSpec(i2, 0, getLabelStart().getLayoutParams().height));
            }
            if (getLabelEnd().getVisibility() != 8) {
                View labelEnd2 = getLabelEnd();
                if (getLabelStart().getVisibility() == 8) {
                    measuredWidth2 = 0;
                } else {
                    measuredWidth2 = getLabelStart().getMeasuredWidth() + getGap();
                }
                measureChild(labelEnd2, ViewGroup.getChildMeasureSpec(i, measuredWidth2 + getNameMinWidth() + getGap(), getLabelEnd().getLayoutParams().width), ViewGroup.getChildMeasureSpec(i2, 0, getLabelEnd().getLayoutParams().height));
            }
            if (getLabelStart().getVisibility() != 8) {
                measuredWidth = getLabelStart().getMeasuredWidth() + getGap();
            } else {
                measuredWidth = 0;
            }
            if (getLabelEnd().getVisibility() != 8) {
                measuredWidth += getLabelEnd().getMeasuredWidth() + getGap();
            }
            measureChild(getName(), ViewGroup.getChildMeasureSpec(i, measuredWidth, getName().getLayoutParams().width), ViewGroup.getChildMeasureSpec(i2, 0, getName().getLayoutParams().height));
        }
        if (getLabelStart().getVisibility() == 8) {
            measuredWidth3 = 0;
        } else {
            measuredWidth3 = getLabelStart().getMeasuredWidth() + getGap();
        }
        int measuredWidth5 = measuredWidth3 + getName().getMeasuredWidth();
        if (getLabelEnd().getVisibility() != 8) {
            gap = getGap() + getLabelEnd().getMeasuredWidth();
        }
        int i3 = measuredWidth5 + gap;
        int iMax = Math.max(getName().getMeasuredHeight(), Math.max(getLabelEnd().getMeasuredHeight(), getLabelStart().getMeasuredHeight()));
        int size2 = View.MeasureSpec.getSize(i2);
        if (View.MeasureSpec.getMode(i2) != 0) {
            iMax = Math.min(iMax, size2);
        }
        setMeasuredDimension(Math.min(i3, size), iMax);
    }

    public AbstractC1114210f6J(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 263));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS561S0100000_17(this, 261));
        this.LLILLL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 262));
        this.LLILZ = (int) C497740JfY.LIZIZ(2.0f);
        this.LLILZIL = (int) C497740JfY.LIZIZ(68.0f);
        this.LLILZLL = (int) C497740JfY.LIZIZ(1.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth;
        boolean z2 = true;
        if (getLayoutDirection() != 1) {
            z2 = false;
        }
        if (getLabelStart().getVisibility() == 0) {
            measuredWidth = getLabelStart().getMeasuredWidth() + getGap();
        } else {
            measuredWidth = 0;
        }
        int measuredWidth2 = getName().getMeasuredWidth() + measuredWidth;
        if (getLabelEnd().getVisibility() == 0) {
            measuredWidth2 += getGap();
        }
        if (z2) {
            getLabelStart().layout(getWidth() - getLabelStart().getMeasuredWidth(), getTopSpace() + ((getHeight() - getLabelStart().getMeasuredHeight()) / 2), getWidth(), getTopSpace() + ((getHeight() + getLabelStart().getMeasuredHeight()) / 2));
            getName().layout((getWidth() - getName().getMeasuredWidth()) - measuredWidth, (getHeight() - getName().getMeasuredHeight()) / 2, getWidth() - measuredWidth, (getHeight() + getName().getMeasuredHeight()) / 2);
            getLabelEnd().layout((getWidth() - getLabelEnd().getMeasuredWidth()) - measuredWidth2, getTopSpace() + ((getHeight() - getLabelEnd().getMeasuredHeight()) / 2), getWidth() - measuredWidth2, getTopSpace() + ((getHeight() + getLabelEnd().getMeasuredHeight()) / 2));
        } else {
            getLabelStart().layout(0, getTopSpace() + ((getHeight() - getLabelStart().getMeasuredHeight()) / 2), getLabelStart().getMeasuredWidth(), getTopSpace() + ((getHeight() + getLabelStart().getMeasuredHeight()) / 2));
            getName().layout(measuredWidth, (getHeight() - getName().getMeasuredHeight()) / 2, getName().getMeasuredWidth() + measuredWidth, (getHeight() + getName().getMeasuredHeight()) / 2);
            getLabelEnd().layout(measuredWidth2, getTopSpace() + ((getHeight() - getLabelEnd().getMeasuredHeight()) / 2), getLabelEnd().getMeasuredWidth() + measuredWidth2, getTopSpace() + ((getHeight() + getLabelEnd().getMeasuredHeight()) / 2));
        }
    }
}
