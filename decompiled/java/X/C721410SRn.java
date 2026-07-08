package X;

import android.content.Context;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: renamed from: X.0SRn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C721410SRn {
    public final Context LIZ;
    public final VelocityTracker LIZIZ = VelocityTracker.obtain();
    public int LIZJ;
    public final int LIZLLL;
    public final float LJ;
    public float LJFF;
    public int LJI;
    public AwS590S0100000_11 LJII;
    public Float LJIIIIZZ;

    public C721410SRn(Context context) {
        this.LIZ = context;
        this.LJI = (int) (150 * context.getResources().getDisplayMetrics().density);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.LIZJ = Math.max(viewConfiguration.getScaledMinimumFlingVelocity(), this.LJI);
        this.LIZLLL = viewConfiguration.getScaledTouchSlop() * 10;
        this.LJ = viewConfiguration.getScaledMaximumFlingVelocity();
    }
}
