package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import com.bytedance.android.livesdk.chatroom.behavior.ScrollHeaderBehavior;
import com.bytedance.android.livesdk.chatroom.behavior.SuctionBottomBehavior;

/* JADX INFO: renamed from: X.16FK, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16FK extends C16G0 implements InterfaceC1115680f8g {
    public float LLJJL;
    public float LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public View LLJLIL;
    public final C1318260kPQ LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public int LLJLLL;

    @Override // android.view.View, X.InterfaceC1115680f8g
    public float getBottomFadingEdgeStrength() {
        View view = this.LLJLIL;
        if (view == null) {
            view = null;
        }
        if (!C500260Jjc.LJJJJIZL(view)) {
            return 0.0f;
        }
        View view2 = this.LLJLIL;
        if (view2 == null) {
            view2 = null;
        }
        int translationY = (int) view2.getTranslationY();
        View view3 = this.LLJLIL;
        return translationY > (-(view3 != null ? view3 : null).getHeight()) ? 1.0f : 0.0f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C16BC c16bc = ((C16G1) childAt.getLayoutParams()).LIZ;
            if (c16bc instanceof ScrollHeaderBehavior) {
                this.LLJL = childAt;
            }
            if (c16bc instanceof SuctionBottomBehavior) {
                this.LLJLIL = childAt;
                this.LLJLLIL = ((SuctionBottomBehavior) c16bc).LJ;
            }
        }
    }

    public final int getLastHeight() {
        return this.LLJLLL;
    }

    public final void LJIJJLI(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        View view = null;
        if (i < 0) {
            View view2 = this.LLJL;
            if (view2 != null) {
                view = view2;
            }
            return view.canScrollVertically(i);
        }
        View view3 = this.LLJLIL;
        if (view3 == null) {
            view3 = null;
        }
        int translationY = (int) view3.getTranslationY();
        View view4 = this.LLJLIL;
        if (view4 == null) {
            view4 = null;
        }
        if (translationY == (-view4.getHeight())) {
            View view5 = this.LLJL;
            if (view5 != null) {
                view = view5;
            }
            if (!view.canScrollVertically(i)) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c7  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16FK.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setLastHeight(int i) {
        this.LLJLLL = i;
    }

    public C16FK(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C1318260kPQ c1318260kPQ = new C1318260kPQ(this);
        this.LLJLILLLLZIIL = c1318260kPQ;
        c1318260kPQ.LJIIIZ(true);
    }

    @Override // X.C16G0, X.InterfaceC1318370kPb
    public final void onStopNestedScroll(View view, int i) {
        super.onStopNestedScroll(view, i);
        this.LLJLILLLLZIIL.LJIIJJI(0);
    }

    @Override // X.C16G0, android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        this.LLJLILLLLZIIL.LIZIZ(f, f2);
        return super.onNestedPreFling(view, f, f2);
    }

    @Override // X.C16G0, X.InterfaceC1318370kPb
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        this.LLJLILLLLZIIL.LJIIJ(i, i2);
        super.onStartNestedScroll(view, view2, i, i2);
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // X.C16G0, X.InterfaceC1318440kPi
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        C16FJ c16fj;
        super.onNestedScroll(view, i, i2, i3, i4, i5, iArr);
        if (i4 < 0 && (getParent() instanceof C16FJ) && i5 == 1) {
            ViewParent parent = getParent();
            Boolean boolValueOf = null;
            if ((parent instanceof C16FJ) && (c16fj = (C16FJ) parent) != null) {
                EnumC19356910oB enumC19356910oB = c16fj.LLJJJ;
                boolean z = false;
                if ((enumC19356910oB == EnumC19356910oB.ONLY_TOP || enumC19356910oB == EnumC19356910oB.ALWAYS) && c16fj.getNestedScrollY() == 0 && c16fj.LLJJJIL == EnumC584680MwU.REFRESH) {
                    if (c16fj.LLL || c16fj.LLJZ) {
                        z = true;
                    }
                    c16fj.LIZIZ(-1, z, null, true);
                    z = true;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                iArr[1] = i4;
            }
        }
    }
}
