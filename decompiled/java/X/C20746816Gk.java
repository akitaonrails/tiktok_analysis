package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.16Gk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20746816Gk extends C21578619ce {
    public int LL;
    public final C01GW LLILLJJLI;
    public boolean LLILLL;

    @Override // X.C21578619ce, android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        return false;
    }

    private final C20746716Gj getContainer() {
        return (C20746716Gj) this.LLILLJJLI.getValue();
    }

    public final boolean getOptNestScroll() {
        return this.LLILLL;
    }

    public final int getTotalScrollY() {
        return this.LL;
    }

    public C20746816Gk(Context context) {
        super(context);
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 24));
    }

    public final int LIZIZ(int i) {
        int iMin = Math.min(this.LL + i, getContainer().getHeaderHeight()) - this.LL;
        scrollBy(0, iMin);
        return i - iMin;
    }

    @Override // X.C21578619ce, android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // X.C21578619ce
    public final void fling(int i) {
        if (this.LL >= getContainer().getHeaderHeight()) {
            return;
        }
        super.fling(i);
    }

    public final void setOptNestScroll(boolean z) {
        this.LLILLL = z;
    }

    @Override // X.C21578619ce, android.view.ViewGroup
    public final void addView(View view, int i) {
        addView(view, i, generateDefaultLayoutParams());
    }

    @Override // X.C21578619ce, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addView(view, -1, layoutParams);
    }

    @Override // X.C21578619ce, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        getContainer().addView(view, i, layoutParams);
    }

    @Override // X.C21578619ce, android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        super.onNestedPreScroll(view, i, i2, iArr);
        if (this.LL < getContainer().getHeaderHeight()) {
            iArr[0] = i;
            iArr[1] = i2;
            scrollBy(0, i2);
        }
    }

    @Override // X.C21578619ce, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.LL = i2;
    }

    @Override // X.C21578619ce, android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        if (view != null) {
            view.measure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), Integer.MIN_VALUE));
        }
    }

    @Override // X.C21578619ce, X.InterfaceC1318370kPb
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        int iMin;
        super.onNestedPreScroll(view, i, i2, iArr, i3);
        if (this.LLILLL) {
            if (this.LL < getContainer().getHeaderHeight()) {
                if (i2 < 0) {
                    iMin = -Math.min(this.LL, Math.abs(i2));
                    if (Math.abs(iMin) < Math.abs(i2)) {
                        iArr[0] = i;
                    }
                } else {
                    iMin = Math.min(getContainer().getHeaderHeight() - this.LL, i2);
                }
                iArr[0] = i;
                iArr[1] = iMin;
                scrollBy(0, iMin);
                return;
            }
            return;
        }
        if (this.LL < getContainer().getHeaderHeight()) {
            iArr[0] = i;
            iArr[1] = i2;
            scrollBy(0, i2);
        }
    }
}
