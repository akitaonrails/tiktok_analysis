package X;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.0kUt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1321650kUt extends C21578619ce {
    public C1321650kUt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOverScrollMode(2);
    }

    @Override // X.C21578619ce, android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        if (i2 < 0 && canScrollVertically(i2)) {
            return false;
        }
        return super.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    @Override // X.C21578619ce, X.InterfaceC20097013kG
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        if (i2 < 0 && canScrollVertically(i2)) {
            return false;
        }
        return super.dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
    }
}
