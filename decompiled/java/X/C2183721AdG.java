package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AdG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2183721AdG {
    public final String LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final String LJFF;

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LJFF.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2183721AdG)) {
            return false;
        }
        return Intrinsics.LJFF(this.LJFF, ((C2183721AdG) obj).LJFF);
    }

    public C2183721AdG(int i, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJFF = str2;
    }
}
