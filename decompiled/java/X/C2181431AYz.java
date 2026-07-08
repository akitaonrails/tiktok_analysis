package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AYz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2181431AYz {
    public final String LIZ;
    public final String LIZIZ;
    public final double LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public C1AZ2 LJFF;
    public final long LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2181431AYz)) {
            return false;
        }
        C2181431AYz c2181431AYz = (C2181431AYz) obj;
        return Intrinsics.LJFF(this.LIZ, c2181431AYz.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2181431AYz.LIZIZ) && Double.compare(this.LIZJ, c2181431AYz.LIZJ) == 0 && Intrinsics.LJFF(this.LIZLLL, c2181431AYz.LIZLLL) && this.LJ == c2181431AYz.LJ && Intrinsics.LJFF(this.LJFF, c2181431AYz.LJFF) && this.LJI == c2181431AYz.LJI;
    }

    public final C2233461CbI LIZ() {
        String str = this.LIZ;
        String str2 = this.LIZIZ;
        Double dValueOf = Double.valueOf(this.LIZJ);
        String str3 = this.LIZLLL;
        Boolean boolValueOf = Boolean.valueOf(this.LJ);
        C1AZ2 c1az2 = this.LJFF;
        return new C2233461CbI(str, str2, dValueOf, str3, boolValueOf, c1az2 != null ? c1az2.LIZ() : null, Long.valueOf(this.LJI));
    }

    public C2181431AYz(String str, String str2, double d, String str3, boolean z, C1AZ2 c1az2, long j) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = d;
        this.LIZLLL = str3;
        this.LJ = z;
        this.LJFF = c1az2;
        this.LJI = j;
    }
}
