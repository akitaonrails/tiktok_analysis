package X;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS261S0000000_22;

/* JADX INFO: renamed from: X.0oAU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1462760oAU extends C21599719g3 {
    public boolean LLLLZI;
    public final List<PointF> LLLLZIL;
    public float LLLLZLL;
    public float LLLLZLLIL;
    public boolean LLLLZLLLI;
    public boolean LLLZ;
    public boolean LLLZI;
    public boolean LLLZIIL;
    public long LLLZIL;
    public Function1<? super MotionEvent, Boolean> LLLZL;
    public Function1<? super Boolean, Unit> LLLZLL;
    public Function1<? super Boolean, Unit> LLLZLZ;

    public final void setPreViewMode(boolean z) {
    }

    public final boolean getCanClick() {
        return this.LLLZIIL;
    }

    public final boolean getCanInterceptTouchEvent() {
        return this.LLLZ;
    }

    public final boolean getCanScroll() {
        return this.LLLLZLLLI;
    }

    public final Function1<MotionEvent, Boolean> getOnViewPagerClickListener() {
        return this.LLLZL;
    }

    public final Function1<Boolean, Unit> getOnViewPagerFlingHorizontalListener() {
        return this.LLLZLZ;
    }

    public final Function1<Boolean, Unit> getOnViewPagerFlingVerticalListener() {
        return this.LLLZLL;
    }

    public final long getStartClickTime() {
        return this.LLLZIL;
    }

    public final boolean LJJJI(MotionEvent motionEvent) {
        List<PointF> list = this.LLLLZIL;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (PointF pointF : list) {
                float f = pointF.x;
                float f2 = pointF.y;
                double d = 2;
                if (Math.sqrt(Math.pow(f - motionEvent.getX(), d) + Math.pow(f2 - motionEvent.getY(), d)) > 5.0d) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void LJJJIL(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2 || !this.LLLLZI) {
                    return;
                }
                if (LJJJI(motionEvent)) {
                    ((ArrayList) this.LLLLZIL).add(new PointF(motionEvent.getX(), motionEvent.getY()));
                    return;
                }
                this.LLLLZI = false;
                return;
            }
            if (this.LLLLZI && this.LLLZIIL) {
                if (LJJJI(motionEvent) && System.currentTimeMillis() - this.LLLZIL < 200) {
                    this.LLLZL.invoke(motionEvent);
                }
                this.LLLLZI = false;
                return;
            }
            return;
        }
        this.LLLLZI = true;
        this.LLLZIIL = false;
        ((ArrayList) this.LLLLZIL).clear();
        ((ArrayList) this.LLLLZIL).add(new PointF(motionEvent.getX(), motionEvent.getY()));
    }

    public final void LJJJJ(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                return;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            float f = this.LLLLZLL - x;
            float f2 = this.LLLLZLLIL - y;
            if (Math.abs(f) > 100.0f && Math.abs(f / f2) > 2.0f) {
                if (f > 0.0f) {
                    this.LLLZLZ.invoke(Boolean.TRUE);
                } else {
                    this.LLLZLZ.invoke(Boolean.FALSE);
                }
            }
            if (Math.abs(f2) <= 100.0f || Math.abs(f / f2) >= 1.0f) {
                return;
            }
            if (f2 > 0.0f) {
                this.LLLZLL.invoke(Boolean.TRUE);
                return;
            } else {
                this.LLLZLL.invoke(Boolean.FALSE);
                return;
            }
        }
        this.LLLLZLL = motionEvent.getX();
        this.LLLLZLLIL = motionEvent.getY();
    }

    @Override // X.C21599719g3, X.C21600219g8, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 2) {
            if (this.LLLLZLLLI && !this.LLLZI && motionEvent.getPointerCount() > 1) {
                return false;
            }
            return this.LLLLZLLLI;
        }
        if (!this.LLLZ) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // X.C21599719g3, X.C21600219g8, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.LLLZI && motionEvent != null && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
            this.LLLLZLLLI = false;
            if (this.LLLZI) {
                this.LLLLZLLLI = true;
            }
        }
        try {
            LJJJIL(motionEvent);
            LJJJJ(motionEvent);
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJI("ImageViewPager.onTouchEvent error", e);
            return false;
        }
    }

    public final void setCanClick(boolean z) {
        this.LLLZIIL = z;
    }

    public final void setCanInterceptTouchEvent(boolean z) {
        this.LLLZ = z;
    }

    public final void setCanScroll(boolean z) {
        this.LLLLZLLLI = z;
    }

    public final void setOnViewPagerClickListener(Function1<? super MotionEvent, Boolean> function1) {
        this.LLLZL = function1;
    }

    public final void setOnViewPagerFlingHorizontalListener(Function1<? super Boolean, Unit> function1) {
        this.LLLZLZ = function1;
    }

    public final void setOnViewPagerFlingVerticalListener(Function1<? super Boolean, Unit> function1) {
        this.LLLZLL = function1;
    }

    public final void setPublishPreview(boolean z) {
        this.LLLZI = z;
    }

    public final void setStartClickTime(long j) {
        this.LLLZIL = j;
    }

    public C1462760oAU(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLLLZIL = new ArrayList();
        this.LLLZ = true;
        this.LLLZL = AFwS261S0000000_22.get$arr$(75);
        this.LLLZLL = AFwS261S0000000_22.get$arr$(77);
        this.LLLZLZ = AFwS261S0000000_22.get$arr$(76);
    }
}
