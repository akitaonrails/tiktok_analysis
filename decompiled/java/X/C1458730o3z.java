package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0o3z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1458730o3z {
    public final String LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public Long LJ;
    public final boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1458730o3z)) {
            return false;
        }
        C1458730o3z c1458730o3z = (C1458730o3z) obj;
        return Intrinsics.LJFF(this.LIZ, c1458730o3z.LIZ) && this.LIZIZ == c1458730o3z.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1458730o3z.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1458730o3z.LIZLLL) && Intrinsics.LJFF(this.LJ, c1458730o3z.LJ) && this.LJFF == c1458730o3z.LJFF;
    }

    public C1458730o3z(String str, boolean z, String str2, String str3, Long l, boolean z2, int i) {
        l = (i & 16) != 0 ? null : l;
        z2 = (i & 32) != 0 ? false : z2;
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = l;
        this.LJFF = z2;
    }
}
