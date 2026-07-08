package X;

import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: X.18Z5, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18Z5 {
    public VelocityTracker LIZ;
    public float LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public float LJ;
    public final float LJFF;
    public int LJI = -1;
    public final /* synthetic */ C18Z4 LJII;

    public final VelocityTracker LIZ() {
        VelocityTracker velocityTracker = this.LIZ;
        if (velocityTracker != null) {
            return velocityTracker;
        }
        VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
        this.LIZ = velocityTrackerObtain;
        return velocityTrackerObtain;
    }

    public C18Z5(C18Z4 c18z4) {
        this.LJII = c18z4;
        ViewConfiguration.get(c18z4.getContext()).getScaledMinimumFlingVelocity();
        this.LJFF = r0.getScaledMaximumFlingVelocity();
    }
}
