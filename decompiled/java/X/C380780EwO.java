package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EwO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C380780EwO {
    public static final C380780EwO LJIIJJI = new C380780EwO(null, null, null, null, null, null, null, null, 2047);
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final boolean LJI;
    public final String LJII;
    public final EnumC1641380soa LJIIIIZZ;
    public final int LJIIIZ;
    public final List<C0F26> LJIIJ;

    public C380780EwO() {
        this(null, null, null, null, null, null, null, null, 2047);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C380780EwO)) {
            return false;
        }
        C380780EwO c380780EwO = (C380780EwO) obj;
        return Intrinsics.LJFF(this.LIZ, c380780EwO.LIZ) && Intrinsics.LJFF(this.LIZIZ, c380780EwO.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c380780EwO.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c380780EwO.LIZLLL) && Intrinsics.LJFF(this.LJ, c380780EwO.LJ) && Intrinsics.LJFF(this.LJFF, c380780EwO.LJFF) && this.LJI == c380780EwO.LJI && Intrinsics.LJFF(this.LJII, c380780EwO.LJII) && this.LJIIIIZZ == c380780EwO.LJIIIIZZ && this.LJIIIZ == c380780EwO.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c380780EwO.LJIIJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31;
        String str = this.LJFF;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LJI)) * 31;
        String str2 = this.LJII;
        return ((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ) * 31) + this.LJIIJ.hashCode();
    }

    public final String toString() {
        return "StrokeItem(name=" + this.LIZ + ", icon=" + this.LIZIZ + ", resId=" + this.LIZJ + ", effectId=" + this.LIZLLL + ", urs=" + this.LJ + ", resPath=" + this.LJFF + ", isSelect=" + this.LJI + ", effectSdkExtra=" + this.LJII + ", downloadStatus=" + this.LJIIIIZZ + ", downloadProgress=" + this.LJIIIZ + ", params=" + this.LJIIJ + ')';
    }

    public static C380780EwO LIZ(C380780EwO c380780EwO, String str, boolean z, String str2, EnumC1641380soa enumC1641380soa, int i, List list, int i2) {
        String str3;
        String str4;
        String str5;
        String str6;
        List list2 = list;
        int i3 = i;
        EnumC1641380soa enumC1641380soa2 = enumC1641380soa;
        String str7 = str2;
        boolean z2 = z;
        String str8 = str;
        String str9 = null;
        if ((i2 & 1) != 0) {
            str3 = c380780EwO.LIZ;
        } else {
            str3 = null;
        }
        if ((i2 & 2) != 0) {
            str4 = c380780EwO.LIZIZ;
        } else {
            str4 = null;
        }
        if ((i2 & 4) != 0) {
            str5 = c380780EwO.LIZJ;
        } else {
            str5 = null;
        }
        if ((i2 & 8) != 0) {
            str6 = c380780EwO.LIZLLL;
        } else {
            str6 = null;
        }
        if ((i2 & 16) != 0) {
            str9 = c380780EwO.LJ;
        }
        if ((i2 & 32) != 0) {
            str8 = c380780EwO.LJFF;
        }
        if ((i2 & 64) != 0) {
            z2 = c380780EwO.LJI;
        }
        if ((i2 & 128) != 0) {
            str7 = c380780EwO.LJII;
        }
        if ((i2 & 256) != 0) {
            enumC1641380soa2 = c380780EwO.LJIIIIZZ;
        }
        if ((i2 & 512) != 0) {
            i3 = c380780EwO.LJIIIZ;
        }
        if ((i2 & 1024) != 0) {
            list2 = c380780EwO.LJIIJ;
        }
        c380780EwO.getClass();
        return new C380780EwO(str3, str4, str5, str6, str9, str8, z2, str7, enumC1641380soa2, i3, list2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C380780EwO(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i) {
        int i2;
        List list2 = list;
        String str8 = str7;
        String str9 = str4;
        String str10 = str3;
        String str11 = str2;
        String str12 = str6;
        String str13 = (i & 1) != 0 ? "" : str;
        str11 = (i & 2) != 0 ? "" : str11;
        str10 = (i & 4) != 0 ? "" : str10;
        str9 = (i & 8) != 0 ? "" : str9;
        String str14 = (i & 16) == 0 ? str5 : "";
        str12 = (i & 32) != 0 ? null : str12;
        str8 = (i & 128) != 0 ? null : str8;
        EnumC1641380soa enumC1641380soa = (i & 256) != 0 ? EnumC1641380soa.PENDING : null;
        if ((i & 512) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        this(str13, str11, str10, str9, str14, str12, false, str8, enumC1641380soa, i2, (i & 1024) != 0 ? C13BV.INSTANCE : list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C380780EwO(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, EnumC1641380soa enumC1641380soa, int i, List<? extends C0F26> list) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = z;
        this.LJII = str7;
        this.LJIIIIZZ = enumC1641380soa;
        this.LJIIIZ = i;
        this.LJIIJ = list;
    }
}
