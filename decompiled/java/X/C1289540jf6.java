package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;

/* JADX INFO: renamed from: X.0jf6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1289540jf6 extends TextureView {
    public int LL;
    public int LLILLJJLI;

    public C1289540jf6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i4 = this.LL;
        if (i4 != 0 && (i3 = this.LLILLJJLI) != 0) {
            if (size * i3 < size2 * i4) {
                setMeasuredDimension(size, (i3 * size) / i4);
                return;
            } else {
                setMeasuredDimension((i4 * size2) / i3, size2);
                return;
            }
        }
        setMeasuredDimension(size, size2);
    }
}
