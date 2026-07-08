package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11Ta, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19505611Ta {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final int LJIIIZ;
    public final String LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19505611Ta)) {
            return false;
        }
        C19505611Ta c19505611Ta = (C19505611Ta) obj;
        return Intrinsics.LJFF(this.LIZ, c19505611Ta.LIZ) && Intrinsics.LJFF(this.LIZIZ, c19505611Ta.LIZIZ) && this.LIZJ == c19505611Ta.LIZJ && this.LIZLLL == c19505611Ta.LIZLLL && this.LJ == c19505611Ta.LJ && this.LJFF == c19505611Ta.LJFF && this.LJI == c19505611Ta.LJI && Intrinsics.LJFF(this.LJII, c19505611Ta.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c19505611Ta.LJIIIIZZ) && this.LJIIIZ == c19505611Ta.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c19505611Ta.LJIIJ);
    }

    public C19505611Ta(String str, String str2, long j, int i, int i2, int i3, int i4, String str3, String str4, int i5, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = i3;
        this.LJI = i4;
        this.LJII = str3;
        this.LJIIIIZZ = str4;
        this.LJIIIZ = i5;
        this.LJIIJ = str5;
    }
}
