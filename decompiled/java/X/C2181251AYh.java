package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AYh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2181251AYh {
    public final C2181811AaB LIZ;
    public final String LIZIZ;
    public final double LIZJ;
    public final double LIZLLL;
    public final double LJ;
    public final double LJFF;
    public final long LJI;
    public final long LJII;
    public final long LJIIIIZZ;
    public final double LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2181251AYh)) {
            return false;
        }
        C2181251AYh c2181251AYh = (C2181251AYh) obj;
        return Intrinsics.LJFF(this.LIZ, c2181251AYh.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2181251AYh.LIZIZ) && Double.compare(this.LIZJ, c2181251AYh.LIZJ) == 0 && Double.compare(this.LIZLLL, c2181251AYh.LIZLLL) == 0 && Double.compare(this.LJ, c2181251AYh.LJ) == 0 && Double.compare(this.LJFF, c2181251AYh.LJFF) == 0 && this.LJI == c2181251AYh.LJI && this.LJII == c2181251AYh.LJII && this.LJIIIIZZ == c2181251AYh.LJIIIIZZ && Double.compare(this.LJIIIZ, c2181251AYh.LJIIIZ) == 0;
    }

    public C2181251AYh(C2181811AaB c2181811AaB, String str, double d, double d2, double d3, double d4, long j, long j2, long j3, double d5) {
        this.LIZ = c2181811AaB;
        this.LIZIZ = str;
        this.LIZJ = d;
        this.LIZLLL = d2;
        this.LJ = d3;
        this.LJFF = d4;
        this.LJI = j;
        this.LJII = j2;
        this.LJIIIIZZ = j3;
        this.LJIIIZ = d5;
    }
}
