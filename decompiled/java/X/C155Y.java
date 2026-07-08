package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.155Y, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C155Y extends LinearLayout implements InterfaceC1058150ddt {
    public final C155H LL;
    public final C155W LLILLJJLI;
    public final Context LLILLL;
    public final FrameLayout LLILZ;
    public final LinearLayout LLILZIL;

    @Override // X.InterfaceC1058150ddt
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
    }

    @Override // X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        return false;
    }

    private final int getBaseViewPagerHeight() {
        C155H c155h = this.LL;
        return (((int) c155h.LJIJI.LIZIZ) - ((int) C12ES.LIZJ((c155h.LJIIJ ? 0.0f : c155h.LJIILLIIL == 8 ? 0.0f : 48.0f) + 45.0f, this.LLILLL))) - ((int) C12ES.LIZJ(14.0f, this.LLILLL));
    }

    public final void LIZ(TuxSheet tuxSheet, float f) {
        int measuredHeight;
        View view;
        if (f < 0.0f) {
            return;
        }
        int iLJIIIIZZ = C12ES.LJIIIIZZ(this.LLILLL);
        C204636155m c204636155m = this.LL.LJIJI;
        float f2 = iLJIIIIZZ;
        float f3 = c204636155m.LIZJ / f2;
        float f4 = c204636155m.LIZIZ / f2;
        float f5 = 1.0f / f3;
        if (tuxSheet != null && (view = tuxSheet.getView()) != null) {
            measuredHeight = (int) (view.getMeasuredHeight() * (f3 - f4) * f * f5);
        } else {
            measuredHeight = 0;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, getBaseViewPagerHeight() + measuredHeight);
        FrameLayout frameLayout = this.LLILZ;
        if (frameLayout != null) {
            C786410Ut5.a6(frameLayout, layoutParams);
        }
    }

    public final void LIZIZ(TuxSheet tuxSheet, float f) {
        int measuredHeight;
        View view;
        if (f < 0.0f) {
            return;
        }
        int iLJIIIIZZ = C12ES.LJIIIIZZ(this.LLILLL);
        C204636155m c204636155m = this.LL.LJIJI;
        float f2 = iLJIIIIZZ;
        float f3 = c204636155m.LIZJ / f2;
        float f4 = c204636155m.LIZIZ / f2;
        float f5 = 1.0f / f3;
        if (tuxSheet != null && (view = tuxSheet.getView()) != null) {
            measuredHeight = (int) (view.getMeasuredHeight() * (f3 - f4) * f * f5);
        } else {
            measuredHeight = 0;
        }
        int i = ((int) this.LL.LJIJI.LIZIZ) + measuredHeight;
        LinearLayout linearLayout = this.LLILZIL;
        if (linearLayout != null) {
            C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(-1, i));
        }
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
        if (C12DO.LIZ()) {
            LIZIZ(tuxSheet, f);
        } else {
            LIZ(tuxSheet, f);
        }
    }

    public C155Y(C155H c155h, C155W c155w, C1361400lX0 c1361400lX0) {
        super(c1361400lX0, null, 0);
        this.LL = c155h;
        this.LLILLJJLI = c155w;
        this.LLILLL = c1361400lX0;
        C786410Ut5.LJLLJ(c1361400lX0, R.layout.i_g, this);
        getRootView().findViewById(R.id.tnb);
        this.LLILZIL = (LinearLayout) getRootView().findViewById(R.id.ow2);
        this.LLILZ = (FrameLayout) getRootView().findViewById(R.id.viewpager_container);
    }
}
