package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0FOO, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FOO extends FrameLayout {
    public final int LL;
    public float LLILLJJLI;
    public float LLILLL;

    private final View getChild() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    private final C20632315oP getParentViewPager() {
        View view;
        Object parent = getParent();
        if (!(parent instanceof View)) {
            view = null;
            break;
        }
        view = (View) parent;
        while (view != null && !(view instanceof C20632315oP)) {
            Object parent2 = view.getParent();
            if (!(parent2 instanceof View)) {
                view = null;
                break;
            }
            view = (View) parent2;
        }
        if (view instanceof C20632315oP) {
            return (C20632315oP) view;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        float f;
        boolean z2;
        C20632315oP parentViewPager = getParentViewPager();
        if (parentViewPager != null) {
            int orientation = parentViewPager.getOrientation();
            float f2 = 1.0f;
            if (LIZ(-1.0f, orientation) || LIZ(1.0f, orientation)) {
                if (motionEvent.getAction() == 0) {
                    this.LLILLJJLI = motionEvent.getX();
                    this.LLILLL = motionEvent.getY();
                    getParent().requestDisallowInterceptTouchEvent(true);
                } else if (motionEvent.getAction() == 2) {
                    float x = motionEvent.getX() - this.LLILLJJLI;
                    float y = motionEvent.getY() - this.LLILLL;
                    if (orientation == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    float fAbs = Math.abs(x);
                    if (z) {
                        f = 0.5f;
                    } else {
                        f = 1.0f;
                    }
                    float f3 = fAbs * f;
                    float fAbs2 = Math.abs(y);
                    if (!z) {
                        f2 = 0.5f;
                    }
                    float f4 = fAbs2 * f2;
                    float f5 = this.LL;
                    if (f3 > f5 || f4 > f5) {
                        if (f4 > f3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z == z2) {
                            getParent().requestDisallowInterceptTouchEvent(false);
                        } else {
                            if (!z) {
                                x = y;
                            }
                            if (LIZ(x, orientation)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            } else {
                                getParent().requestDisallowInterceptTouchEvent(false);
                            }
                        }
                    }
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public C0FOO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    public final boolean LIZ(float f, int i) {
        int i2 = -((int) Math.signum(f));
        if (i != 0) {
            if (i == 1) {
                View child = getChild();
                if (child == null) {
                    return false;
                }
                return child.canScrollVertically(i2);
            }
            throw new IllegalArgumentException();
        }
        View child2 = getChild();
        if (child2 == null) {
            return false;
        }
        return child2.canScrollHorizontally(i2);
    }
}
