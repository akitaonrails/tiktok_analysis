package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iPZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1241470iPZ {
    public final long LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final int LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1241470iPZ)) {
            return false;
        }
        C1241470iPZ c1241470iPZ = (C1241470iPZ) obj;
        return this.LIZ == c1241470iPZ.LIZ && Intrinsics.LJFF(this.LIZIZ, c1241470iPZ.LIZIZ) && this.LIZJ == c1241470iPZ.LIZJ && this.LIZLLL == c1241470iPZ.LIZLLL && this.LJ == c1241470iPZ.LJ && this.LJFF == c1241470iPZ.LJFF && this.LJI == c1241470iPZ.LJI;
    }

    public C1241470iPZ(long j, int i, long j2, int i2, String str, long j3, long j4) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = j2;
        this.LIZLLL = i;
        this.LJ = j3;
        this.LJFF = j4;
        this.LJI = i2;
    }
}
