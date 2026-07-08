package X;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.0eW7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1091770eW7 extends C1091740eW4 {
    public boolean LLILZ;

    public final void setReverse(boolean z) {
        this.LLILZ = z;
        invalidate();
    }

    public C1091770eW7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setChildrenDrawingOrderEnabled(true);
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        if (this.LLILZ) {
            return (i - 1) - i2;
        }
        return super.getChildDrawingOrder(i, i2);
    }
}
