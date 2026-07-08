package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ex7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C381230Ex7 {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C381230Ex7)) {
            return false;
        }
        C381230Ex7 c381230Ex7 = (C381230Ex7) obj;
        return Intrinsics.LJFF(this.LIZ, c381230Ex7.LIZ) && Intrinsics.LJFF(this.LIZIZ, c381230Ex7.LIZIZ) && this.LIZJ == c381230Ex7.LIZJ && this.LIZLLL == c381230Ex7.LIZLLL && Intrinsics.LJFF(this.LJ, c381230Ex7.LJ) && this.LJFF == c381230Ex7.LJFF && Intrinsics.LJFF(this.LJI, c381230Ex7.LJI);
    }

    public final int hashCode() {
        return (((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL) * 31) + this.LJ.hashCode()) * 31) + this.LJFF) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        return this.LJI;
    }

    public C381230Ex7(String str, int i, boolean z, String str2, String str3, int i2, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z;
        this.LIZLLL = i;
        this.LJ = str3;
        this.LJFF = i2;
        this.LJI = str4;
    }
}
