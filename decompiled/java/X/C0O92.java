package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O92, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O92 implements InterfaceC613720O5i<C0O93> {
    public final String LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final String LJI;
    public final String LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final String LJIILL;
    public final LinkedHashMap<String, Integer> LJIILLIIL;
    public final String LJIIZILJ;
    public final Integer LJIJ;
    public final String LJIJI;
    public final Long LJIJJ;
    public final Map<String, String> LJIJJLI;
    public final String LJIL;
    public final Boolean LJJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0O92)) {
            return false;
        }
        C0O92 c0o92 = (C0O92) obj;
        return Intrinsics.LJFF(this.LIZ, c0o92.LIZ) && this.LIZIZ == c0o92.LIZIZ && this.LIZJ == c0o92.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0o92.LIZLLL) && Intrinsics.LJFF(this.LJ, c0o92.LJ) && this.LJFF == c0o92.LJFF && Intrinsics.LJFF(this.LJI, c0o92.LJI) && Intrinsics.LJFF(this.LJII, c0o92.LJII) && this.LJIIIIZZ == c0o92.LJIIIIZZ && this.LJIIIZ == c0o92.LJIIIZ && this.LJIIJ == c0o92.LJIIJ && this.LJIIJJI == c0o92.LJIIJJI && Intrinsics.LJFF(this.LJIIL, c0o92.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c0o92.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c0o92.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c0o92.LJIILL) && Intrinsics.LJFF(this.LJIILLIIL, c0o92.LJIILLIIL) && Intrinsics.LJFF(this.LJIIZILJ, c0o92.LJIIZILJ) && Intrinsics.LJFF(this.LJIJ, c0o92.LJIJ) && Intrinsics.LJFF(this.LJIJI, c0o92.LJIJI) && Intrinsics.LJFF(this.LJIJJ, c0o92.LJIJJ) && Intrinsics.LJFF(this.LJIJJLI, c0o92.LJIJJLI) && Intrinsics.LJFF(this.LJIL, c0o92.LJIL) && Intrinsics.LJFF(this.LJJ, c0o92.LJJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF) * 31) + this.LJI.hashCode()) * 31;
        String str = this.LJII;
        int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LJIIIIZZ) * 31) + this.LJIIIZ) * 31) + this.LJIIJ) * 31) + this.LJIIJJI) * 31;
        String str2 = this.LJIIL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJIILIIL;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJIILJJIL;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJIILL;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        LinkedHashMap<String, Integer> linkedHashMap = this.LJIILLIIL;
        int iHashCode7 = (iHashCode6 + (linkedHashMap == null ? 0 : linkedHashMap.hashCode())) * 31;
        String str6 = this.LJIIZILJ;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.LJIJ;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.LJIJI;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l = this.LJIJJ;
        int iHashCode11 = (((iHashCode10 + (l == null ? 0 : l.hashCode())) * 31) + this.LJIJJLI.hashCode()) * 31;
        String str8 = this.LJIL;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool = this.LJJ;
        return iHashCode12 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "GetSearchPhotoListMutation(keyword=" + this.LIZ + ", offset=" + this.LIZIZ + ", count=" + this.LIZJ + ", source=" + this.LIZLLL + ", searchSource=" + this.LJ + ", hotSearch=" + this.LJFF + ", searchId=" + this.LJI + ", lastSearchId=" + this.LJII + ", correctType=" + this.LJIIIIZZ + ", isFilterSearch=" + this.LJIIIZ + ", sortType=" + this.LJIIJ + ", publishTime=" + this.LJIIJJI + ", enterFrom=" + this.LJIIL + ", searchChannel=" + this.LJIILIIL + ", showResultsSource=" + this.LJIILJJIL + ", searchContext=" + this.LJIILL + ", filterParam=" + this.LJIILLIIL + ", lastFeedContext=" + this.LJIIZILJ + ", isNonPersonalizedSearch=" + this.LJIJ + ", sugGenerateType=" + this.LJIJI + ", searchSessionId=" + this.LJIJJ + ", extraRequestParams=" + this.LJIJJLI + ", endToEndSessionId=" + this.LJIL + ", screenReaderEnable=" + this.LJJ + ')';
    }

    @Override // X.InterfaceC613730O5j
    public final C613690O5f LIZ() {
        return new C613690O5f(0, 3000L, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c3  */
    @Override // X.InterfaceC613730O5j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C0O8O r43, X.InterfaceC1364105Vn<? super X.C0O93> r44) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0O92.LIZIZ(X.0O8O, X.05Vn):java.lang.Object");
    }

    public C0O92(String str, long j, int i, String str2, String str3, int i2, String str4, String str5, int i3, int i4, int i5, int i6, String str6, String str7, String str8, String str9, LinkedHashMap<String, Integer> linkedHashMap, String str10, Integer num, String str11, Long l, Map<String, String> map, String str12, Boolean bool) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = i;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = i2;
        this.LJI = str4;
        this.LJII = str5;
        this.LJIIIIZZ = i3;
        this.LJIIIZ = i4;
        this.LJIIJ = i5;
        this.LJIIJJI = i6;
        this.LJIIL = str6;
        this.LJIILIIL = str7;
        this.LJIILJJIL = str8;
        this.LJIILL = str9;
        this.LJIILLIIL = linkedHashMap;
        this.LJIIZILJ = str10;
        this.LJIJ = num;
        this.LJIJI = str11;
        this.LJIJJ = l;
        this.LJIJJLI = map;
        this.LJIL = str12;
        this.LJJ = bool;
    }
}
