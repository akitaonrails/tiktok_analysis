package X;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.0ecF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1095570ecF extends C1091700eW0 {
    public int LLILLL;
    public int LLILZ;

    public void setExtraOffset(int i) {
        this.LLILZ = i;
        int top = (this.LLILLL - getTop()) + this.LLILZ;
        if (top != 0) {
            offsetTopAndBottom(top);
        }
    }

    public void setTargetOffset(int i) {
        this.LLILLL = i;
        int top = (i - getTop()) + this.LLILZ;
        if (top != 0) {
            offsetTopAndBottom(top);
        }
    }

    public C1095570ecF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        setTargetOffset(this.LLILLL);
    }
}
