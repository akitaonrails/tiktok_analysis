package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uX3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1707390uX3 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final List<C1153040g6w> LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final C1706750uW1 LJIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1707390uX3)) {
            return false;
        }
        C1707390uX3 c1707390uX3 = (C1707390uX3) obj;
        return Intrinsics.LJFF(this.LIZ, c1707390uX3.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1707390uX3.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1707390uX3.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1707390uX3.LIZLLL) && Intrinsics.LJFF(this.LJ, c1707390uX3.LJ) && Intrinsics.LJFF(this.LJFF, c1707390uX3.LJFF) && Intrinsics.LJFF(this.LJI, c1707390uX3.LJI) && Intrinsics.LJFF(this.LJII, c1707390uX3.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1707390uX3.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1707390uX3.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1707390uX3.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c1707390uX3.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c1707390uX3.LJIIL);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31;
        String str2 = this.LJIIIIZZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJIIIZ;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJIIJ;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJIIJJI;
        return ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.LJIIL.hashCode();
    }

    public final String toString() {
        return "PostPaymentGuideModel(actionType=" + this.LIZ + ", title=" + this.LIZIZ + ", subTitle=" + this.LIZJ + ", bodyRows=" + this.LIZLLL + ", primaryButton=" + this.LJ + ", skipButton=" + this.LJFF + ", successToast=" + this.LJI + ", failToast=" + this.LJII + ", host=" + this.LJIIIIZZ + ", token=" + this.LJIIIZ + ", merchantId=" + this.LJIIJ + ", merchantUserId=" + this.LJIIJJI + ", layout=" + this.LJIIL + ')';
    }

    public C1707390uX3(String str, String str2, String str3, List<C1153040g6w> list, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, C1706750uW1 c1706750uW1) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = list;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = str6;
        this.LJII = str7;
        this.LJIIIIZZ = str8;
        this.LJIIIZ = str9;
        this.LJIIJ = str10;
        this.LJIIJJI = str11;
        this.LJIIL = c1706750uW1;
    }
}
