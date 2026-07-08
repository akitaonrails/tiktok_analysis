package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0rVz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1591410rVz extends C21599719g3 {
    public int LLLLZI;
    public int LLLLZIL;
    public int LLLLZLL;
    public boolean LLLLZLLIL;
    public boolean LLLLZLLLI;
    public boolean LLLZ;
    public float LLLZI;
    public float LLLZIIL;
    public float LLLZIL;
    public float LLLZL;
    public float LLLZLL;
    public boolean LLLZLZ;
    public boolean LLLZZ;
    public boolean LLLZZIL;
    public boolean LLZ;
    public boolean LLZIL;
    public boolean LLZILL;
    public boolean LLZL;
    public boolean LLZLI;
    public InterfaceC1591430rW1 LLZLL;
    public boolean LLZLLIL;
    public InterfaceC1210210hb9 LLZLLLL;

    private boolean getIsPageEnabled() {
        if (this.LLZIL) {
            return true;
        }
        return this.LLZILL;
    }

    public int getItemCount() {
        PagerAdapter adapter = getAdapter();
        if (adapter == null) {
            return 0;
        }
        return adapter.getCount();
    }

    public C1591410rVz(Context context) {
        super(context);
        this.LLZILL = true;
        this.LLZLI = true;
        this.LLZLLLL = new InterfaceC1210210hb9() { // from class: X.0hb6
            @Override // X.InterfaceC1210210hb9
            public final void LJJIJLIJ(MotionEvent motionEvent) {
            }

            @Override // X.InterfaceC1210210hb9
            public final boolean LJJIL(float f, float f2, int i) {
                return true;
            }

            @Override // X.InterfaceC1210210hb9
            public final boolean LJJIZ(float f, float f2) {
                if (Math.abs(f) > this.LIZIZ.LLLLZI && Math.abs(f) > Math.abs(f2)) {
                    return true;
                }
                return false;
            }
        };
        LJJJJ(context);
    }

    public final boolean LJJJIL(MotionEvent motionEvent) {
        boolean z;
        this.LLZLLLL.LJJIJLIJ(motionEvent);
        int action = motionEvent.getAction() & 255;
        boolean z2 = true;
        if (action == 0) {
            this.LLLZI = motionEvent.getX();
            this.LLLZIIL = motionEvent.getY();
            return true;
        }
        float x = motionEvent.getX() - this.LLLZI;
        float y = motionEvent.getY() - this.LLLZIIL;
        float fAbs = Math.abs(x);
        float fAbs2 = Math.abs(y);
        if (fAbs < 1.0E-6f) {
            return true;
        }
        if (C444960Hcc.LIZJ(getContext())) {
            x = -x;
        }
        if (x > 0.0f) {
            if (getCurrentItem() <= 0 || !this.LLZLLLL.LJJIL(x, y, 1)) {
                z2 = false;
            }
        } else {
            if (getCurrentItem() < getItemCount() - 1 && this.LLZLLLL.LJJIL(x, y, -1)) {
                z = true;
            } else {
                z = false;
            }
            boolean z3 = this.LLLLZLLLI;
            if (!z3 && this.LLLLZLLIL && (fAbs < this.LLLLZLL || fAbs2 >= fAbs * 0.5f)) {
                return false;
            }
            if ((action == 1 || action == 3) && !z && this.LLZLL != null) {
                if (z3 && this.LLLLZLLIL && (fAbs < this.LLLLZLL || fAbs2 >= fAbs * 0.5f)) {
                    return false;
                }
                if (this.LLLZ && this.LLLZZIL) {
                    return false;
                }
                if (this.LLZLLLL.LJJIZ(x, y)) {
                    this.LLZLL.LIZ();
                    this.LLLZZ = true;
                }
            }
            z2 = z;
        }
        if (!this.LLZ && !z2 && x > 0.0f) {
            this.LLLZI = motionEvent.getX();
        }
        return z2;
    }

    public final void LJJJJ(Context context) {
        this.LLLLZI = C341940Daq.LIZ(8.0d);
        setDefaultGutterSize(0);
        this.LLLLZIL = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LLLLZLL = ViewConfiguration.get(context).getScaledPagingTouchSlop();
        this.LLLZLZ = C444960Hcc.LIZJ(context);
    }

    @Override // X.C21600219g8, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.LLZLI && getIsPageEnabled() && this.LLZL && motionEvent.getAction() == 0) {
            this.LLLZI = motionEvent.getX();
            this.LLLZIIL = motionEvent.getY();
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                this.LLLZLL = 0.0f;
                this.LLLZIL = 0.0f;
                this.LLLZL = 0.0f;
            }
        } else {
            this.LLLZZ = false;
            float x = motionEvent.getX();
            this.LLLZIL = x;
            this.LLLZLL = x;
            this.LLLZL = motionEvent.getY();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00db A[RETURN] */
    @Override // X.C21599719g3, X.C21600219g8, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1591410rVz.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // X.C21599719g3, X.C21600219g8, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if ((!this.LLZLI || !getIsPageEnabled() || !LJJJIL(motionEvent)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlockCanScroll(boolean z) {
        this.LLZLLIL = z;
    }

    public void setEnableDispatchTouchEventCheck(boolean z) {
        this.LLZL = z;
    }

    public void setForceSetEnabled(boolean z) {
        this.LLZIL = z;
    }

    public void setInProfileOtherPage(boolean z) {
        this.LLLZZIL = z;
    }

    public void setOnFlingEndListener(InterfaceC1591430rW1 interfaceC1591430rW1) {
        this.LLZLL = interfaceC1591430rW1;
    }

    public void setPagingMainValve(boolean z) {
        this.LLZLI = z;
    }

    public C1591410rVz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLZILL = true;
        this.LLZLI = true;
        this.LLZLLLL = new InterfaceC1210210hb9() { // from class: X.0hb6
            @Override // X.InterfaceC1210210hb9
            public final void LJJIJLIJ(MotionEvent motionEvent) {
            }

            @Override // X.InterfaceC1210210hb9
            public final boolean LJJIL(float f, float f2, int i) {
                return true;
            }

            @Override // X.InterfaceC1210210hb9
            public final boolean LJJIZ(float f, float f2) {
                if (Math.abs(f) > this.LIZIZ.LLLLZI && Math.abs(f) > Math.abs(f2)) {
                    return true;
                }
                return false;
            }
        };
        LJJJJ(context);
    }

    @Override // X.C21600219g8, android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        try {
            super.addFocusables(arrayList, i, i2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LJI(e);
            C1AF0.LJ(e);
        }
    }

    public static boolean LJJJI(View view, int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (C0J0T.LIZIZ(childAt) && (i4 = i2 + scrollX) >= childAt.getLeft() && i4 < childAt.getRight() && (i5 = i3 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && LJJJI(childAt, i, i4 - childAt.getLeft(), i5 - childAt.getTop(), true)) {
                    return true;
                }
            }
        }
        if (z && view.canScrollHorizontally(-i)) {
            return true;
        }
        return false;
    }

    @Override // X.C21600219g8
    public final boolean LJI(View view, boolean z, int i, int i2, int i3) {
        if (!this.LLZLLIL && C0J0T.LIZIZ(view) && super.LJI(view, z, i, i2, i3)) {
            return true;
        }
        return false;
    }
}
