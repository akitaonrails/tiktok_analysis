package X;

import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: X.16Gr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20747516Gr {
    public VelocityTracker LIZ;
    public float LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public float LJ;
    public final float LJFF;
    public int LJI = -1;
    public final /* synthetic */ C20747416Gq LJII;

    public final VelocityTracker LIZ() {
        VelocityTracker velocityTracker = this.LIZ;
        if (velocityTracker != null) {
            return velocityTracker;
        }
        VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
        this.LIZ = velocityTrackerObtain;
        return velocityTrackerObtain;
    }

    public C20747516Gr(C20747416Gq c20747416Gq) {
        this.LJII = c20747416Gq;
        ViewConfiguration.get(c20747416Gq.getContext()).getScaledMinimumFlingVelocity();
        this.LJFF = r0.getScaledMaximumFlingVelocity();
    }
}
