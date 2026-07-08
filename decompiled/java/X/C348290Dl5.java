package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dl5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C348290Dl5 {
    public final EnumC356230Dxt LIZ;
    public String LIZIZ;
    public boolean LIZLLL;
    public String LJ;
    public String LJII;
    public float LIZJ = 1.0f;
    public float LJFF = 1.0f;
    public float LJI = -1.0f;

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        String str2 = this.LJ;
        return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Float.floatToIntBits(this.LJFF)) * 31) + Float.floatToIntBits(this.LJI);
    }

    public C348290Dl5(EnumC356230Dxt enumC356230Dxt) {
        this.LIZ = enumC356230Dxt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C348290Dl5)) {
            return false;
        }
        C348290Dl5 c348290Dl5 = (C348290Dl5) obj;
        if (this.LIZ == c348290Dl5.LIZ && Intrinsics.LJFF(this.LIZIZ, c348290Dl5.LIZIZ) && this.LIZJ == c348290Dl5.LIZJ && this.LIZLLL == c348290Dl5.LIZLLL && Intrinsics.LJFF(this.LJ, c348290Dl5.LJ) && this.LJFF == c348290Dl5.LJFF && this.LJI == c348290Dl5.LJI) {
            return true;
        }
        return false;
    }
}
