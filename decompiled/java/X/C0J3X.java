package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0J3X, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J3X {
    public final int LIZ;
    public final ViewGroup LIZIZ;
    public final C0J45 LIZJ;
    public final C485730J3b LIZLLL;
    public final int LJ;
    public final boolean LJFF;
    public volatile View LJI;
    public volatile boolean LJII;
    public volatile boolean LJIIIIZZ;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0J3X(int i, ViewGroup viewGroup, C0J45 c0j45, C485730J3b c485730J3b, boolean z, int i2) {
        int i3;
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        this(i, viewGroup, c0j45, c485730J3b, i3, (i2 & 32) != 0 ? false : z2);
    }

    public C0J3X(int i, ViewGroup viewGroup, C0J45 c0j45, C485730J3b c485730J3b, int i2, boolean z) {
        this.LIZ = i;
        this.LIZIZ = viewGroup;
        this.LIZJ = c0j45;
        this.LIZLLL = c485730J3b;
        this.LJ = i2;
        this.LJFF = z;
    }
}
