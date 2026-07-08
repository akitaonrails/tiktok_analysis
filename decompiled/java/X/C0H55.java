package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0H55, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H55 extends FrameLayout {
    public final int LL;
    public float LLILLJJLI;
    public float LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public C0H55 LLILZLL;

    private final ViewOnAttachStateChangeListenerC20631115oD getChildViewPager() {
        View childAt = getChildAt(0);
        if (childAt instanceof ViewOnAttachStateChangeListenerC20631115oD) {
            return (ViewOnAttachStateChangeListenerC20631115oD) childAt;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cf  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0H55.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (this.LLILZ && z) {
            super.requestDisallowInterceptTouchEvent(false);
        } else {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    public C0H55(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public final C0H55 LIZ(int i, int i2, View view) {
        if ((view instanceof C0H55) && view != this) {
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect) && rect.contains(i, i2)) {
                return (C0H55) view;
            }
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
            C0H55 c0h55LIZ = LIZ(i, i2, viewGroup.getChildAt(childCount));
            if (c0h55LIZ != null) {
                return c0h55LIZ;
            }
        }
        return null;
    }
}
