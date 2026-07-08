package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: X.16GU, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16GU<V extends View> extends C16BC<V> {
    public int tempLeftRightOffset;
    public int tempTopBottomOffset;
    public C16GV viewOffsetHelper;

    public int getLeftAndRightOffset() {
        C16GV c16gv = this.viewOffsetHelper;
        if (c16gv != null) {
            return c16gv.LJ;
        }
        return 0;
    }

    public int getTopAndBottomOffset() {
        C16GV c16gv = this.viewOffsetHelper;
        if (c16gv != null) {
            return c16gv.LIZLLL;
        }
        return 0;
    }

    public boolean isHorizontalOffsetEnabled() {
        C16GV c16gv = this.viewOffsetHelper;
        return c16gv != null && c16gv.LJI;
    }

    public boolean isVerticalOffsetEnabled() {
        C16GV c16gv = this.viewOffsetHelper;
        return c16gv != null && c16gv.LJFF;
    }

    public C16GU() {
    }

    public void setHorizontalOffsetEnabled(boolean z) {
        C16GV c16gv = this.viewOffsetHelper;
        if (c16gv != null) {
            c16gv.LJI = z;
        }
    }

    public boolean setLeftAndRightOffset(int i) {
        C16GV c16gv = this.viewOffsetHelper;
        if (c16gv != null) {
            if (!c16gv.LJI || c16gv.LJ == i) {
                return false;
            }
            c16gv.LJ = i;
            c16gv.LIZ();
            return true;
        }
        this.tempLeftRightOffset = i;
        return false;
    }

    public boolean setTopAndBottomOffset(int i) {
        C16GV c16gv = this.viewOffsetHelper;
        if (c16gv != null) {
            return c16gv.LIZIZ(i);
        }
        this.tempTopBottomOffset = i;
        return false;
    }

    public void setVerticalOffsetEnabled(boolean z) {
        C16GV c16gv = this.viewOffsetHelper;
        if (c16gv != null) {
            c16gv.LJFF = z;
        }
    }

    public C16GU(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void layoutChild(C16G0 c16g0, V v, int i) {
        c16g0.LJIIL(i, v);
    }

    @Override // X.C16BC
    public boolean onLayoutChild(C16G0 c16g0, V v, int i) {
        layoutChild(c16g0, v, i);
        if (this.viewOffsetHelper == null) {
            this.viewOffsetHelper = new C16GV(v);
        }
        C16GV c16gv = this.viewOffsetHelper;
        c16gv.LIZIZ = c16gv.LIZ.getTop();
        c16gv.LIZJ = c16gv.LIZ.getLeft();
        this.viewOffsetHelper.LIZ();
        int i2 = this.tempTopBottomOffset;
        if (i2 != 0) {
            this.viewOffsetHelper.LIZIZ(i2);
            this.tempTopBottomOffset = 0;
        }
        int i3 = this.tempLeftRightOffset;
        if (i3 != 0) {
            C16GV c16gv2 = this.viewOffsetHelper;
            if (c16gv2.LJI && c16gv2.LJ != i3) {
                c16gv2.LJ = i3;
                c16gv2.LIZ();
            }
            this.tempLeftRightOffset = 0;
            return true;
        }
        return true;
    }
}
