package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AaB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2181811AaB {
    public final long LIZ;
    public final C1283230jUv LIZIZ;
    public final C1170604i0 LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2181811AaB)) {
            return false;
        }
        C2181811AaB c2181811AaB = (C2181811AaB) obj;
        return this.LIZ == c2181811AaB.LIZ && Intrinsics.LJFF(this.LIZIZ, c2181811AaB.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2181811AaB.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c2181811AaB.LIZLLL) && Intrinsics.LJFF(this.LJ, c2181811AaB.LJ) && Intrinsics.LJFF(this.LJFF, c2181811AaB.LJFF) && Intrinsics.LJFF(this.LJI, c2181811AaB.LJI);
    }

    public final C2233171Cap LIZ() {
        Long lValueOf = Long.valueOf(this.LIZ);
        C1283230jUv c1283230jUv = this.LIZIZ;
        C1CW4 c1cw4LIZ = c1283230jUv != null ? c1283230jUv.LIZ() : null;
        C1170604i0 c1170604i0 = this.LIZJ;
        return new C2233171Cap(lValueOf, c1cw4LIZ, c1170604i0 != null ? new C1CO9(c1170604i0.LIZ) : null, this.LIZLLL, this.LJ, this.LJFF, this.LJI);
    }

    public C2181811AaB(long j, C1283230jUv c1283230jUv, C1170604i0 c1170604i0, String str, String str2, String str3, String str4) {
        this.LIZ = j;
        this.LIZIZ = c1283230jUv;
        this.LIZJ = c1170604i0;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = str4;
    }
}
