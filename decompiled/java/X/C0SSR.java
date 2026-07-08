package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0SSR, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SSR extends C21599719g3 {
    public int LLLLZI;
    public float LLLLZIL;
    public float LLLLZLL;
    public boolean LLLLZLLIL;
    public InterfaceC1210210hb9 LLLLZLLLI;

    public final int getItemCount() {
        PagerAdapter adapter = getAdapter();
        if (adapter != null) {
            return adapter.getCount();
        }
        return 0;
    }

    public final InterfaceC1210210hb9 getChecker() {
        return this.LLLLZLLLI;
    }

    public final float getInitialXValue() {
        return this.LLLLZIL;
    }

    public final float getInitialYValue() {
        return this.LLLLZLL;
    }

    public final int getMinDistance() {
        return this.LLLLZI;
    }

    public final boolean LJJJI(MotionEvent motionEvent) {
        this.LLLLZLLLI.LJJIJLIJ(motionEvent);
        boolean z = true;
        if ((motionEvent.getAction() & 255) == 0) {
            this.LLLLZIL = motionEvent.getX();
            this.LLLLZLL = motionEvent.getY();
            return true;
        }
        float x = motionEvent.getX() - this.LLLLZIL;
        float y = motionEvent.getY() - this.LLLLZLL;
        if (Math.abs(x) < 1.0E-6f) {
            return true;
        }
        if (C444960Hcc.LIZJ(getContext())) {
            x = -x;
        }
        if (x > 0.0f) {
            if (getCurrentItem() <= 0 || !this.LLLLZLLLI.LJJIL(x, y, 1)) {
            }
            return z;
        }
        if (getCurrentItem() < getItemCount() - 1 && this.LLLLZLLLI.LJJIL(x, y, -1)) {
            return true;
        }
        z = false;
        if (x > 0.0f) {
            this.LLLLZIL = motionEvent.getX();
            this.LLLLZLL = motionEvent.getY();
            return false;
        }
        return z;
    }

    @Override // X.C21599719g3, X.C21600219g8, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if ((!this.LLLLZLLIL || !LJJJI(motionEvent)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // X.C21599719g3, X.C21600219g8, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if ((!this.LLLLZLLIL || !LJJJI(motionEvent)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setChecker(InterfaceC1210210hb9 interfaceC1210210hb9) {
        this.LLLLZLLLI = interfaceC1210210hb9;
    }

    public final void setInitialXValue(float f) {
        this.LLLLZIL = f;
    }

    public final void setInitialYValue(float f) {
        this.LLLLZLL = f;
    }

    public final void setMinDistance(int i) {
        this.LLLLZI = i;
    }

    public C0SSR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLLLZLLIL = true;
        this.LLLLZLLLI = new InterfaceC1210210hb9() { // from class: X.0SSS
            @Override // X.InterfaceC1210210hb9
            public final void LJJIJLIJ(MotionEvent motionEvent) {
            }

            @Override // X.InterfaceC1210210hb9
            public final boolean LJJIL(float f, float f2, int i) {
                return i != -1;
            }

            @Override // X.InterfaceC1210210hb9
            public final boolean LJJIZ(float f, float f2) {
                if (Math.abs(f) > this.LIZIZ.getMinDistance() && Math.abs(f) > Math.abs(f2)) {
                    return true;
                }
                return false;
            }
        };
        this.LLLLLJLJLL = false;
        this.LLLLZI = C341940Daq.LIZ(8.0d);
        setDefaultGutterSize(0);
        ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // X.C21600219g8, android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        try {
            super.addFocusables(arrayList, i, i2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LJI(e);
        }
    }

    @Override // X.C21600219g8
    public final boolean LJI(View view, boolean z, int i, int i2, int i3) {
        if (C0J0T.LIZIZ(view) && super.LJI(view, z, i, i2, i3)) {
            return true;
        }
        return false;
    }
}
