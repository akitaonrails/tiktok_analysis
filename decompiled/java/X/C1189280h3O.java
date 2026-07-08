package X;

import com.ss.android.ugc.aweme.poi.detail.container.model.PoiCommonMobParams;
import com.ss.android.ugc.aweme.poi.reviews.model.PoiReviewsMobParams;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h3O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1189280h3O {
    public final String LIZ;
    public final String LIZIZ = "poi_detail";
    public final String LIZJ;
    public final Boolean LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final PoiReviewsMobParams LJIIJJI;
    public final ArrayList<String> LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final PoiCommonMobParams LJIILL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1189280h3O)) {
            return false;
        }
        C1189280h3O c1189280h3O = (C1189280h3O) obj;
        return Intrinsics.LJFF(this.LIZ, c1189280h3O.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1189280h3O.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1189280h3O.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1189280h3O.LIZLLL) && Intrinsics.LJFF(this.LJ, c1189280h3O.LJ) && Intrinsics.LJFF(this.LJFF, c1189280h3O.LJFF) && Intrinsics.LJFF(this.LJI, c1189280h3O.LJI) && Intrinsics.LJFF(this.LJII, c1189280h3O.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1189280h3O.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1189280h3O.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1189280h3O.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c1189280h3O.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c1189280h3O.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c1189280h3O.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c1189280h3O.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c1189280h3O.LJIILL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        Boolean bool = this.LIZLLL;
        int iHashCode2 = (((((((((((((((((((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ.hashCode()) * 31) + this.LJIIJJI.hashCode()) * 31) + this.LJIIL.hashCode()) * 31;
        String str = this.LJIILIIL;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJIILJJIL;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PoiCommonMobParams poiCommonMobParams = this.LJIILL;
        return iHashCode4 + (poiCommonMobParams != null ? poiCommonMobParams.hashCode() : 0);
    }

    public final String toString() {
        return "PoiReviewLandingNavParams(poiId=" + this.LIZ + ", enterFrom=" + this.LIZIZ + ", enterMethod=" + this.LIZJ + ", isPoiDetailInSheetMode=" + this.LIZLLL + ", fromGroupId=" + this.LJ + ", initialPoiEnterFrom=" + this.LJFF + ", initialPoiEnterMethod=" + this.LJI + ", initialPoiFromGroupId=" + this.LJII + ", initialPoiId=" + this.LJIIIIZZ + ", poiDetailEnterFrom=" + this.LJIIIZ + ", poiDetailEnterMethod=" + this.LJIIJ + ", poiReviewsMobParams=" + this.LJIIJJI + ", pinReviewIds=" + this.LJIIL + ", fromReviewId=" + this.LJIILIIL + ", tagId=" + this.LJIILJJIL + ", poiCommonMobParams=" + this.LJIILL + ')';
    }

    public C1189280h3O(String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, String str7, String str8, String str9, PoiReviewsMobParams poiReviewsMobParams, ArrayList arrayList, String str10, String str11, PoiCommonMobParams poiCommonMobParams) {
        this.LIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = bool;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = str5;
        this.LJII = str6;
        this.LJIIIIZZ = str7;
        this.LJIIIZ = str8;
        this.LJIIJ = str9;
        this.LJIIJJI = poiReviewsMobParams;
        this.LJIIL = arrayList;
        this.LJIILIIL = str10;
        this.LJIILJJIL = str11;
        this.LJIILL = poiCommonMobParams;
    }
}
