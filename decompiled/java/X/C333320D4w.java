package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D4w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C333320D4w {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Map<String, String> LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final Integer LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C333320D4w)) {
            return false;
        }
        C333320D4w c333320D4w = (C333320D4w) obj;
        return Intrinsics.LJFF(this.LIZ, c333320D4w.LIZ) && Intrinsics.LJFF(this.LIZIZ, c333320D4w.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c333320D4w.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c333320D4w.LIZLLL) && Intrinsics.LJFF(this.LJ, c333320D4w.LJ) && Intrinsics.LJFF(this.LJFF, c333320D4w.LJFF) && Intrinsics.LJFF(this.LJI, c333320D4w.LJI) && Intrinsics.LJFF(this.LJII, c333320D4w.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c333320D4w.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c333320D4w.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c333320D4w.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c333320D4w.LJIIJJI);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31;
        String str = this.LJFF;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LJI;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.LJII;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJIIIIZZ;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJIIIZ;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJIIJ;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJIIJJI;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        return "RecommendRequestContext(shopId=" + this.LIZ + ", spuId=" + this.LIZIZ + ", productId=" + this.LIZJ + ", passThrough=" + this.LIZLLL + ", source=" + this.LJ + ", externalProductId=" + this.LJFF + ", acAdType=" + this.LJI + ", openLoopUrl=" + this.LJII + ", openLoopAdvId=" + this.LJIIIIZZ + ", openLoopCid=" + this.LJIIIZ + ", openLoopPid=" + this.LJIIJ + ", openLoopProductPlatformId=" + this.LJIIJJI + ')';
    }

    public C333320D4w(String str, String str2, String str3, Map<String, String> map, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = map;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = num;
        this.LJII = str6;
        this.LJIIIIZZ = str7;
        this.LJIIIZ = str8;
        this.LJIIJ = str9;
        this.LJIIJJI = str10;
    }
}
