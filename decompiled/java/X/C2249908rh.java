package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08rh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2249908rh {
    public final String LIZ;
    public final String LIZIZ;
    public final EnumC1986907qN LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final long LJFF;
    public final String LJI;
    public final String LJII;
    public final boolean LJIIIIZZ;

    public C2249908rh() {
        this(null, null, null, null, null, false, 511);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2249908rh)) {
            return false;
        }
        C2249908rh c2249908rh = (C2249908rh) obj;
        return Intrinsics.LJFF(this.LIZ, c2249908rh.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2249908rh.LIZIZ) && this.LIZJ == c2249908rh.LIZJ && this.LIZLLL == c2249908rh.LIZLLL && this.LJ == c2249908rh.LJ && this.LJFF == c2249908rh.LJFF && Intrinsics.LJFF(this.LJI, c2249908rh.LJI) && Intrinsics.LJFF(this.LJII, c2249908rh.LJII) && this.LJIIIIZZ == c2249908rh.LJIIIIZZ;
    }

    public final int hashCode() {
        return (((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIIIZZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ScanAsset(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", path=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mediaType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", width=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", encryptLatitude=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", encryptLongitude=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", hasEncryptedLocation=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2249908rh(String str, String str2, EnumC1986907qN enumC1986907qN, String str3, String str4, boolean z, int i) {
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? "" : str2;
        enumC1986907qN = (i & 4) != 0 ? EnumC1986907qN.IMAGE : enumC1986907qN;
        str3 = (i & 64) != 0 ? "" : str3;
        str4 = (i & 128) != 0 ? "" : str4;
        z = (i & 256) != 0 ? false : z;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = enumC1986907qN;
        this.LIZLLL = 0;
        this.LJ = 0;
        this.LJFF = 0L;
        this.LJI = str3;
        this.LJII = str4;
        this.LJIIIIZZ = z;
    }
}
