package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: X.19iD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21613119iD extends HorizontalScrollView {
    public InterfaceC21613319iF LL;
    public float LLILLJJLI;
    public EnumC21612919iB LLILLL;
    public boolean LLILZ;

    public C21613119iD(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final LinearLayout getContainer() {
        if (getChildCount() <= 0) {
            return null;
        }
        View childAt = getChildAt(0);
        if (childAt instanceof LinearLayout) {
            return (LinearLayout) childAt;
        }
        return null;
    }

    public final int getLeftFirstVisibleChildPosition() {
        LinearLayout container = getContainer();
        if (container == null) {
            return -1;
        }
        int childCount = container.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (LIZ(container.getChildAt(i))) {
                return i;
            }
        }
        return -1;
    }

    public final int getRightMostChildPosition() {
        LinearLayout container = getContainer();
        if (container != null) {
            for (int childCount = container.getChildCount() - 1; -1 < childCount; childCount--) {
                if (LIZ(container.getChildAt(childCount))) {
                    return childCount;
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setScrollState(X.EnumC1087340eOy r10) {
        /*
            r9 = this;
            X.0eOy r0 = X.EnumC1087340eOy.IDLE
            if (r10 != r0) goto L3c
            android.widget.LinearLayout r8 = r9.getContainer()
            r7 = 0
            if (r8 == 0) goto L40
            int r6 = r8.getChildCount()
            r5 = 0
        L10:
            if (r5 >= r6) goto L40
            android.view.View r4 = r8.getChildAt(r5)
            int r3 = r9.getScrollX()
            int r2 = r4.getLeft()
            int r1 = r4.getRight()
            int r0 = r9.getWidth()
            if (r2 < r3) goto L3d
            int r3 = r3 + r0
            if (r1 > r3) goto L3d
            java.lang.Object r0 = r4.getTag()
            if (r0 == 0) goto L40
        L31:
            X.19iF r2 = r9.LL
            if (r2 == 0) goto L3c
            X.0eOy r1 = X.EnumC1087340eOy.IDLE
            X.19iB r0 = r9.LLILLL
            r2.LIZ(r1, r0)
        L3c:
            return
        L3d:
            int r5 = r5 + 1
            goto L10
        L40:
            android.widget.LinearLayout r3 = r9.getContainer()
            if (r3 == 0) goto L31
            int r2 = r3.getChildCount()
        L4a:
            if (r7 >= r2) goto L31
            android.view.View r1 = r3.getChildAt(r7)
            boolean r0 = r9.LIZ(r1)
            if (r0 == 0) goto L5c
            if (r1 == 0) goto L31
            r1.getTag()
            goto L31
        L5c:
            int r7 = r7 + 1
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21613119iD.setScrollState(X.0eOy):void");
    }

    public final boolean LIZ(View view) {
        int scrollX = getScrollX();
        int left = view.getLeft();
        int right = view.getRight();
        if (left < getWidth() + scrollX && right > scrollX) {
            return true;
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (numValueOf.intValue() == 0) {
                this.LLILLJJLI = motionEvent.getX();
            } else if (numValueOf.intValue() == 2) {
                float x = motionEvent.getX();
                float f = x - this.LLILLJJLI;
                this.LLILLJJLI = x;
                if (f > 0.0f) {
                    this.LLILLL = EnumC21612919iB.LEFT;
                } else if (f < 0.0f) {
                    this.LLILLL = EnumC21612919iB.RIGHT;
                }
            } else if (numValueOf.intValue() == 1 || numValueOf.intValue() == 3) {
                setScrollState(EnumC1087340eOy.IDLE);
                System.currentTimeMillis();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setScrollListener(InterfaceC21613319iF interfaceC21613319iF) {
        this.LL = interfaceC21613319iF;
    }

    public C21613119iD(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LLILLL = EnumC21612919iB.NONE;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        ViewGroup viewGroup;
        int childCount;
        super.onScrollChanged(i, i2, i3, i4);
        if (!this.LLILZ) {
            View childAt = getChildAt(0);
            if ((childAt instanceof ViewGroup) && (viewGroup = (ViewGroup) childAt) != null && (childCount = viewGroup.getChildCount()) != 0) {
                View childAt2 = viewGroup.getChildAt(childCount - 1);
                int scrollX = getScrollX();
                int width = getWidth() + scrollX;
                int left = childAt2.getLeft();
                if (childAt2.getRight() <= width && left >= scrollX) {
                    InterfaceC21613319iF interfaceC21613319iF = this.LL;
                    if (interfaceC21613319iF != null) {
                        interfaceC21613319iF.LIZIZ();
                    }
                    this.LLILZ = true;
                }
            }
        }
    }
}
