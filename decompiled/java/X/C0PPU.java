package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.lifecycle.LiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0PPU, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0PPU extends C679970Qln implements InterfaceC642610PIl {
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public InterfaceC641090PCp LLIZLLLIL;
    public C0PPY LLJ;
    public C639420P6e LLJI;
    public final C0PPV<C0PPT> LLJIJIL;

    public final void LIZLLL() {
        this.LLILZIL = true;
        invalidate();
        C0PPV<C0PPT> c0ppv = this.LLJIJIL;
        if (c0ppv.LIZLLL) {
            throw new IllegalStateException("Iteration already started");
        }
        c0ppv.LIZLLL = true;
        c0ppv.LIZIZ = null;
        C0PPW<C0PPT> c0ppw = c0ppv.LIZJ;
        ArrayList arrayList = c0ppv.LIZ;
        c0ppw.LIZ = arrayList;
        c0ppw.LIZIZ = arrayList.size();
        C0PPW<C0PPT> c0ppw2 = c0ppv.LIZJ;
        try {
            int i = c0ppw2.LIZIZ;
            for (int i2 = 0; i2 < i; i2++) {
                ((C0PPT) ListProtector.get(c0ppw2.LIZ, i2)).LIZ();
            }
            this.LLJIJIL.LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJIJIL.LIZ();
            throw th;
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        super.forceLayout();
        C0PPY c0ppy = this.LLJ;
        if (c0ppy != null) {
            c0ppy.LIZ();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        C0PPY c0ppy = this.LLJ;
        if (c0ppy != null) {
            c0ppy.LIZIZ();
        }
    }

    @Override // X.InterfaceC642610PIl
    public InterfaceC641090PCp getContainerProvider() {
        return this.LLIZLLLIL;
    }

    public C0PPY getOnLayoutRequestListener() {
        return this.LLJ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zLJI = MethodIDManager.LJI(71827);
        if (this.LLIZ) {
            boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return zDispatchTouchEvent;
        }
        if (zLJI) {
            MethodIDManager.LJ();
            return false;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        if (this.LLILZIL) {
            super.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        int i2;
        super.onWindowVisibilityChanged(i);
        C639420P6e c639420P6e = this.LLJI;
        if (c639420P6e != null) {
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z != c639420P6e.LLILLJJLI) {
                c639420P6e.LLILLJJLI = z;
                LiveData liveData = (LiveData) c639420P6e.LLILLL.getValue();
                if (z) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                liveData.setValue(i2);
            }
        }
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        super.setAlpha(f);
    }

    public void setContainerProvider(InterfaceC641090PCp interfaceC641090PCp) {
        this.LLIZLLLIL = interfaceC641090PCp;
    }

    public void setOnLayoutRequestListener(C0PPY c0ppy) {
        this.LLJ = c0ppy;
    }

    public void setWindowVisibilityStatus(C639420P6e c639420P6e) {
        boolean z;
        int i;
        this.LLJI = c639420P6e;
        if (c639420P6e != null) {
            if (getWindowVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z != c639420P6e.LLILLJJLI) {
                c639420P6e.LLILLJJLI = z;
                LiveData liveData = (LiveData) c639420P6e.LLILLL.getValue();
                if (z) {
                    i = 1;
                } else {
                    i = 0;
                }
                liveData.setValue(i);
            }
        }
    }

    public C0PPU(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZIL = true;
        this.LLIZ = true;
        this.LLJIJIL = new C0PPV<>();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean fling(int i, int i2) {
        int iLJIILL;
        float f;
        float fLJIILL;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "search_scrolling_fling_velocity_optimization_enabled", true, false)) {
            int scaledMaximumFlingVelocity = ViewConfiguration.get(getContext()).getScaledMaximumFlingVelocity();
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "search_scrolling_refresh_rate_scroll_velocity_optimization", true, false)) {
                float fLIZ = C0VXE.LIZ.LIZ(getContext());
                double d = 0.95f;
                iLJIILL = (int) (scaledMaximumFlingVelocity * ((float) (C0C64.LJIILLIIL().LJIILL(31744, "search_scrolling_fling_velocity_cap_limit", true, 1.0f) * Math.pow(d, (int) ((Math.max(fLIZ, 60.0f) - 60.0f) / 30.0f)))));
                f = i2;
                fLJIILL = (float) (((double) C0C64.LJIILLIIL().LJIILL(31744, "search_scrolling_fling_discount_factor", true, 1.0f)) * Math.pow(d, (int) ((Math.max(fLIZ, 60.0f) - 60.0f) / 30.0f)));
            } else {
                iLJIILL = (int) (scaledMaximumFlingVelocity * C0C64.LJIILLIIL().LJIILL(31744, "search_scrolling_fling_velocity_cap_limit", true, 1.0f));
                f = i2;
                fLJIILL = C0C64.LJIILLIIL().LJIILL(31744, "search_scrolling_fling_discount_factor", true, 1.0f);
            }
            return super.fling(i, Math.max(-iLJIILL, Math.min((int) (f * fLJIILL), iLJIILL)));
        }
        return super.fling(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }
}
