package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.View;

/* JADX INFO: renamed from: X.0jbi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1287440jbi extends SurfaceView {
    public int LL;
    public int LLILLJJLI;

    public C1287440jbi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i4 = this.LL;
        if (i4 != 0 && (i3 = this.LLILLJJLI) != 0) {
            float f = i4 / i3;
            float f2 = size;
            float f3 = size2 * f;
            if (f2 < f3) {
                setMeasuredDimension(size, (int) (f2 / f));
                return;
            } else {
                setMeasuredDimension((int) f3, size2);
                return;
            }
        }
        setMeasuredDimension(size, size2);
    }
}
