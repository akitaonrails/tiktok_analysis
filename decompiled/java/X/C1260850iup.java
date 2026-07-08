package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0iup, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1260850iup extends FrameLayout {
    public final int LL;
    public final int LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public boolean LLIZ;
    public final C01GW LLIZLLLIL;

    private final View getChild() {
        return (View) this.LLIZLLLIL.getValue();
    }

    private final ViewOnAttachStateChangeListenerC20631115oD getParentPowerViewPager() {
        return (ViewOnAttachStateChangeListenerC20631115oD) this.LLILZLL.getValue();
    }

    public final C20632315oP getParentViewPager() {
        return (C20632315oP) this.LLILZIL.getValue();
    }

    public C1260850iup(Context context) {
        super(context);
        this.LL = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.LLILLJJLI = ViewConfiguration.get(getContext()).getScaledPagingTouchSlop();
        this.LLILZIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 67));
        this.LLILZLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 66));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 65));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C20632315oP parentViewPager;
        boolean z;
        float rawY;
        float f;
        float rawX;
        float f2;
        ViewOnAttachStateChangeListenerC20631115oD parentPowerViewPager = getParentPowerViewPager();
        if ((parentPowerViewPager == null || parentPowerViewPager.isUserInputEnabled()) && (parentViewPager = getParentViewPager()) != null) {
            int orientation = parentViewPager.getOrientation();
            int action = motionEvent.getAction() & motionEvent.getActionMasked();
            if (action != 1 && action != 3) {
                if (action != 0 && this.LLIZ) {
                    return true;
                }
                int rawX2 = (int) motionEvent.getRawX();
                int rawY2 = (int) motionEvent.getRawY();
                if (motionEvent.getAction() == 0) {
                    this.LLILLL = motionEvent.getRawX();
                    this.LLILZ = motionEvent.getRawY();
                    this.LLIZ = false;
                    ViewParent parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    return false;
                }
                if (motionEvent.getAction() == 2) {
                    if (orientation == 0) {
                        z = true;
                        rawY = motionEvent.getRawX();
                        f = this.LLILLL;
                    } else {
                        z = false;
                        rawY = motionEvent.getRawY();
                        f = this.LLILZ;
                    }
                    float f3 = rawY - f;
                    if (z) {
                        rawX = motionEvent.getRawY();
                        f2 = this.LLILZ;
                    } else {
                        rawX = motionEvent.getRawX();
                        f2 = this.LLILLL;
                    }
                    float fAbs = Math.abs(f3);
                    float fAbs2 = Math.abs(rawX - f2);
                    if (fAbs2 > this.LL && fAbs2 > ((double) fAbs) * 0.5d) {
                        C20632315oP parentViewPager2 = getParentViewPager();
                        if (parentViewPager2 != null) {
                            parentViewPager2.setUserInputEnabled(false);
                        }
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(false);
                        }
                        return false;
                    }
                    if (fAbs > this.LLILLJJLI && ((double) fAbs) * 0.5d > fAbs2 && !LIZ(f3, orientation, rawX2, rawY2, getChild())) {
                        this.LLIZ = true;
                        C20632315oP parentViewPager3 = getParentViewPager();
                        if (parentViewPager3 != null) {
                            parentViewPager3.setUserInputEnabled(true);
                        }
                        ViewParent parent3 = getParent();
                        if (parent3 != null) {
                            parent3.requestDisallowInterceptTouchEvent(false);
                        }
                        return true;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
            this.LLIZ = false;
            C20632315oP parentViewPager4 = getParentViewPager();
            if (parentViewPager4 != null) {
                parentViewPager4.setUserInputEnabled(true);
            }
            ViewParent parent4 = getParent();
            if (parent4 != null) {
                parent4.requestDisallowInterceptTouchEvent(false);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewOnAttachStateChangeListenerC20631115oD parentPowerViewPager = getParentPowerViewPager();
        if (parentPowerViewPager != null && !parentPowerViewPager.isUserInputEnabled()) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            this.LLIZ = false;
            C20632315oP parentViewPager = getParentViewPager();
            if (parentViewPager != null) {
                parentViewPager.setUserInputEnabled(true);
            }
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (!z) {
            super.requestDisallowInterceptTouchEvent(false);
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
                return;
            }
            return;
        }
        super.requestDisallowInterceptTouchEvent(true);
    }

    public C1260850iup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.LLILLJJLI = ViewConfiguration.get(getContext()).getScaledPagingTouchSlop();
        this.LLILZIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 67));
        this.LLILZLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 66));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 65));
    }

    public static boolean LIZ(float f, int i, int i2, int i3, View view) {
        boolean zCanScrollHorizontally;
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i4 = iArr[0];
        int i5 = iArr[1];
        int measuredWidth = view.getMeasuredWidth() + i4;
        int measuredHeight = view.getMeasuredHeight() + i5;
        if (i5 > i3 || i3 > measuredHeight || i4 > i2 || i2 > measuredWidth) {
            return false;
        }
        int i6 = -((int) Math.signum(f));
        if (i != 0) {
            if (i == 1) {
                zCanScrollHorizontally = view.canScrollVertically(i6);
            } else {
                throw new IllegalArgumentException("orientation is not found");
            }
        } else {
            zCanScrollHorizontally = view.canScrollHorizontally(i6);
        }
        if (zCanScrollHorizontally) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                if (LIZ(f, i, i2, i3, viewGroup.getChildAt(childCount))) {
                    return true;
                }
            }
        }
        return false;
    }
}
