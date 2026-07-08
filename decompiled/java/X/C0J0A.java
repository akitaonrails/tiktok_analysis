package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: X.0J0A, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J0A extends C0SUT {
    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    public C0J0A(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        if (i2 > 0 && iArr != null) {
            iArr[1] = i2;
        }
        return super.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            iArr[1] = i2;
        }
        super.onNestedPreScroll(view, i, i2, iArr);
    }
}
