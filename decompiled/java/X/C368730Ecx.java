package X;

import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.OverScroller;

/* JADX INFO: renamed from: X.0Ecx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368730Ecx {
    public final C368630Ecn LIZ;
    public float LIZIZ;
    public float LIZJ;
    public final int LJ;
    public final float LJFF;
    public final float LJI;
    public VelocityTracker LJII;
    public final OverScroller LJIIIIZZ;
    public boolean LJIIJ;
    public C0E6I LIZLLL = C0E6I.IDLE;
    public boolean LJIIIZ = true;

    public C368730Ecx(C368630Ecn c368630Ecn) {
        this.LIZ = c368630Ecn;
        this.LJ = ViewConfiguration.get(c368630Ecn.getContext()).getScaledTouchSlop();
        this.LJFF = r1.getScaledMinimumFlingVelocity();
        this.LJI = r1.getScaledMaximumFlingVelocity();
        this.LJIIIIZZ = new OverScroller(c368630Ecn.getContext());
    }
}
