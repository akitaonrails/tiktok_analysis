package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11TS, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11TS {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LIZLLL = 20;
    public final int LJIIIIZZ = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11TS)) {
            return false;
        }
        C11TS c11ts = (C11TS) obj;
        return Intrinsics.LJFF(this.LIZ, c11ts.LIZ) && Intrinsics.LJFF(this.LIZIZ, c11ts.LIZIZ) && this.LIZJ == c11ts.LIZJ && this.LIZLLL == c11ts.LIZLLL && this.LJ == c11ts.LJ && this.LJFF == c11ts.LJFF && this.LJI == c11ts.LJI && this.LJII == c11ts.LJII && this.LJIIIIZZ == c11ts.LJIIIIZZ;
    }

    public C11TS(String str, String str2, long j, int i, int i2, int i3, int i4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LJ = i;
        this.LJFF = i2;
        this.LJI = i3;
        this.LJII = i4;
    }
}
