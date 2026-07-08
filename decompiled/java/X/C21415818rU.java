package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.OverScroller;

/* JADX INFO: renamed from: X.18rU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21415818rU extends C21415918rV implements InterfaceC1318440kPi {
    public C21415818rU(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // X.InterfaceC1318440kPi
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        onNestedScroll(view, i, i2, i3, i4, i5);
        if (i5 == 1) {
            OverScroller currentScroller = getCurrentScroller();
            if (currentScroller != null && !currentScroller.isFinished()) {
                i3 = 0;
            }
            iArr[0] = i3;
            iArr[1] = i4;
            return;
        }
        iArr[0] = i3;
        iArr[1] = i4;
    }
}
