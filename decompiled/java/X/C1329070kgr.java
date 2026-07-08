package X;

import android.app.ActivityManager;

/* JADX INFO: renamed from: X.0kgr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1329070kgr implements InterfaceC1320070kSL<C1329770khz> {
    public final ActivityManager LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final int LJ;

    public final int LIZ() {
        int i = this.LIZIZ;
        if (i > 0) {
            return i;
        }
        int iMin = Math.min(this.LIZ.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        if (iMin < 33554432) {
            return 4194304;
        }
        if (iMin < 67108864) {
            return 6291456;
        }
        return iMin / 8;
    }

    @Override // X.InterfaceC1320070kSL
    public final C1329770khz get() {
        boolean z = this.LIZLLL;
        if (!z && !this.LIZJ) {
            return new C1329770khz(LIZ(), 256, Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        C314750CVl.LIZ = z;
        int iLIZ = LIZ();
        return new C1329770khz(this.LIZJ, this.LIZLLL, iLIZ, this.LJ);
    }

    public C1329070kgr(ActivityManager activityManager, int i) {
        this.LJ = 10485760;
        this.LIZ = activityManager;
        this.LIZIZ = i;
    }

    public C1329070kgr(ActivityManager activityManager, int i, boolean z, int i2, boolean z2) {
        this.LJ = 10485760;
        this.LIZ = activityManager;
        this.LIZIZ = i;
        this.LIZJ = z;
        this.LJ = i2;
        this.LIZLLL = z2;
    }
}
