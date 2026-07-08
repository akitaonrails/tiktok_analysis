package X;

import X.C15A8;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: X.15AK, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15AK<T extends C15A8> {
    public static final /* synthetic */ int LJFF = 0;
    public final long LIZ;
    public final long LIZIZ;
    public final Interpolator LIZJ;
    public final C15AG LIZLLL;
    public final T LJ;

    static {
        new C15AL();
    }

    public C15AK(long j, long j2, Interpolator interpolator, C15AG c15ag, T t) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = interpolator;
        this.LIZLLL = c15ag;
        this.LJ = t;
    }

    public /* synthetic */ C15AK(long j, long j2, Interpolator interpolator, C15AG c15ag, C15A8 c15a8, int i) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 300L : j2, (i & 4) != 0 ? new LinearInterpolator() : interpolator, c15ag, c15a8);
    }
}
