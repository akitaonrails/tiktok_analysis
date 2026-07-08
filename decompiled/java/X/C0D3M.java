package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D3M, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D3M implements Serializable {
    public final C1169004hk badges;
    public final Float rating;
    public final String ratingText;
    public final boolean ratingVisible;
    public final Integer reviewCount;
    public final String reviewCountText;
    public final boolean reviewCountVisible;
    public final String title;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D3M)) {
            return false;
        }
        C0D3M c0d3m = (C0D3M) obj;
        return Intrinsics.LJFF(this.title, c0d3m.title) && Intrinsics.LJFF(this.rating, c0d3m.rating) && Intrinsics.LJFF(this.ratingText, c0d3m.ratingText) && Intrinsics.LJFF(this.reviewCount, c0d3m.reviewCount) && Intrinsics.LJFF(this.reviewCountText, c0d3m.reviewCountText) && Intrinsics.LJFF(this.badges, c0d3m.badges) && this.ratingVisible == c0d3m.ratingVisible && this.reviewCountVisible == c0d3m.reviewCountVisible;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        Float f = this.rating;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        String str = this.ratingText;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.reviewCount;
        int iHashCode4 = (((iHashCode3 + (num == null ? 0 : num.hashCode())) * 31) + this.reviewCountText.hashCode()) * 31;
        C1169004hk c1169004hk = this.badges;
        return ((((iHashCode4 + (c1169004hk != null ? c1169004hk.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.ratingVisible)) * 31) + C786410Ut5.Z2(this.reviewCountVisible);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpTitleRatingState(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", rating=");
        sbLIZ.append(this.rating);
        sbLIZ.append(", ratingText=");
        sbLIZ.append(this.ratingText);
        sbLIZ.append(", reviewCount=");
        sbLIZ.append(this.reviewCount);
        sbLIZ.append(", reviewCountText=");
        sbLIZ.append(this.reviewCountText);
        sbLIZ.append(", badges=");
        sbLIZ.append(this.badges);
        sbLIZ.append(", ratingVisible=");
        sbLIZ.append(this.ratingVisible);
        sbLIZ.append(", reviewCountVisible=");
        sbLIZ.append(this.reviewCountVisible);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0D3M(String str, Float f, String str2, Integer num, String str3, C1169004hk c1169004hk, boolean z, boolean z2) {
        this.title = str;
        this.rating = f;
        this.ratingText = str2;
        this.reviewCount = num;
        this.reviewCountText = str3;
        this.badges = c1169004hk;
        this.ratingVisible = z;
        this.reviewCountVisible = z2;
    }
}
