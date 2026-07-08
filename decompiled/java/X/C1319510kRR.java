package X;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0kRR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1319510kRR extends FrameLayout implements InterfaceC1318440kPi {
    public final int LL;
    public float LLILLJJLI;
    public float LLILLL;
    public C16GX LLILZ;
    public final C1317550kOH LLILZIL;

    @Override // X.InterfaceC1318370kPb
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C1317550kOH c1317550kOH = this.LLILZIL;
        return c1317550kOH.LIZIZ | c1317550kOH.LIZ;
    }

    private final View getChild() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof C16G0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof C16GX) {
                        this.LLILZ = (C16GX) childAt;
                        return;
                    }
                }
            }
        }
    }

    public C1319510kRR(Context context) {
        super(context, null);
        this.LLILZIL = new C1317550kOH();
        this.LL = ViewConfiguration.get(context).getScaledTouchSlop();
        setNestedScrollingEnabled(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ba, code lost:
    
        if (r7 == false) goto L48;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1319510kRR.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // X.InterfaceC1318370kPb
    public final void onStopNestedScroll(View view, int i) {
        this.LLILZIL.LIZIZ(i);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.LLILZIL.LIZ(i, i2);
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        boolean zCanScrollVertically;
        View child = getChild();
        if (child != null && i2 != 0) {
            if (i2 > 0) {
                zCanScrollVertically = child.canScrollVertically(1);
            } else {
                zCanScrollVertically = child.canScrollVertically(-1);
            }
            if (!zCanScrollVertically) {
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                    return;
                }
                return;
            }
            ViewParent parent2 = getParent();
            if (parent2 == null) {
                return;
            }
            parent2.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, i5, new int[]{0, 0});
    }

    @Override // X.InterfaceC1318440kPi
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewParent parent;
        if (i4 != 0 && (parent = getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }
}
