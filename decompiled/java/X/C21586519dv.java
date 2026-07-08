package X;

import Y.ARunnableS102S0200000_33;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.tablet.impl.business.split.split.DrawerLayout;

/* JADX INFO: renamed from: X.19dv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21586519dv extends AbstractC21586119dr {
    public final int LIZ;
    public C21586019dq LIZIZ;
    public final ARunnableS102S0200000_33 LIZJ;
    public final /* synthetic */ DrawerLayout LIZLLL;

    @Override // X.AbstractC21586119dr
    public final boolean onEdgeLock(int i) {
        return false;
    }

    @Override // X.AbstractC21586119dr
    public final int getViewHorizontalDragRange(View view) {
        this.LIZLLL.getClass();
        if (DrawerLayout.LJIILIIL(view)) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // X.AbstractC21586119dr
    public final void onViewDragStateChanged(int i) {
        this.LIZLLL.LJIJI(i, this.LIZIZ.LJIJI);
    }

    public C21586519dv(DrawerLayout drawerLayout, int i) {
        this.LIZLLL = drawerLayout;
        this.LIZ = i;
        this.LIZJ = new ARunnableS102S0200000_33(drawerLayout, this, 20);
    }

    @Override // X.AbstractC21586119dr
    public final void onEdgeDragStarted(int i, int i2) {
        View viewLJ;
        if ((i & 1) == 1) {
            viewLJ = this.LIZLLL.LJ(3);
        } else {
            viewLJ = this.LIZLLL.LJ(5);
        }
        if (viewLJ != null && this.LIZLLL.LJII(viewLJ) == 0) {
            this.LIZIZ.LIZJ(i2, viewLJ);
        }
    }

    @Override // X.AbstractC21586119dr
    public final void onEdgeTouched(int i, int i2) {
        HandlerHook.viewPostDelay(this.LIZLLL, this.LIZJ, 160L);
    }

    @Override // X.AbstractC21586119dr
    public final void onViewCaptured(View view, int i) {
        ((C21586619dw) view.getLayoutParams()).LIZJ = false;
        int i2 = 3;
        if (this.LIZ == 3) {
            i2 = 5;
        }
        View viewLJ = this.LIZLLL.LJ(i2);
        if (viewLJ != null) {
            this.LIZLLL.LIZJ(viewLJ, true);
        }
    }

    @Override // X.AbstractC21586119dr
    public final boolean tryCaptureView(View view, int i) {
        this.LIZLLL.getClass();
        if (DrawerLayout.LJIILIIL(view) && this.LIZLLL.LIZ(view, this.LIZ) && this.LIZLLL.LJII(view) == 0) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC21586119dr
    public final int clampViewPositionHorizontal(View view, int i, int i2) {
        if (this.LIZLLL.LIZ(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = this.LIZLLL.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    @Override // X.AbstractC21586119dr
    public final int clampViewPositionVertical(View view, int i, int i2) {
        return view.getTop();
    }

    @Override // X.AbstractC21586119dr
    public final void onViewReleased(View view, float f, float f2) {
        this.LIZLLL.getClass();
        float f3 = ((C21586619dw) view.getLayoutParams()).LIZIZ;
        int width = view.getWidth();
        int width2 = 0;
        if (this.LIZLLL.LIZ(view, 3)) {
            if (f <= 0.0f && (f != 0.0f || f3 <= 0.5f)) {
                width2 = -width;
            }
        } else {
            width2 = this.LIZLLL.getWidth();
            if (f < 0.0f || (f == 0.0f && f3 > 0.5f)) {
                width2 -= width;
            }
        }
        this.LIZIZ.LJIJI(width2, view.getTop());
        this.LIZLLL.invalidate();
    }

    @Override // X.AbstractC21586119dr
    public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
        float width;
        int width2 = view.getWidth();
        if (this.LIZLLL.LIZ(view, 3)) {
            width = i + width2;
        } else {
            width = this.LIZLLL.getWidth() - i;
        }
        float f = width / width2;
        this.LIZLLL.LJIIZILJ(view, f);
        int i5 = 0;
        if (f == 0.0f) {
            i5 = 4;
        }
        C786410Ut5.LJLLLLLL(i5, view);
        this.LIZLLL.invalidate();
    }
}
