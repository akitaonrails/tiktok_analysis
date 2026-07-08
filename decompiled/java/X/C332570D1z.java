package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D1z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C332570D1z implements Serializable {
    public final float rating;
    public final String ratingText;
    public final Integer reviewCount;
    public final String reviewCountText;
    public final boolean reviewCountVisible;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C332570D1z)) {
            return false;
        }
        C332570D1z c332570D1z = (C332570D1z) obj;
        return Float.compare(this.rating, c332570D1z.rating) == 0 && Intrinsics.LJFF(this.ratingText, c332570D1z.ratingText) && Intrinsics.LJFF(this.reviewCount, c332570D1z.reviewCount) && Intrinsics.LJFF(this.reviewCountText, c332570D1z.reviewCountText) && this.reviewCountVisible == c332570D1z.reviewCountVisible;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReviewRatingHeaderState(rating=");
        sbLIZ.append(this.rating);
        sbLIZ.append(", ratingText=");
        sbLIZ.append(this.ratingText);
        sbLIZ.append(", reviewCount=");
        sbLIZ.append(this.reviewCount);
        sbLIZ.append(", reviewCountText=");
        sbLIZ.append(this.reviewCountText);
        sbLIZ.append(", reviewCountVisible=");
        sbLIZ.append(this.reviewCountVisible);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int hashCode() {
        int iFloatToIntBits = ((Float.floatToIntBits(this.rating) * 31) + this.ratingText.hashCode()) * 31;
        Integer num = this.reviewCount;
        return ((((iFloatToIntBits + (num == null ? 0 : num.hashCode())) * 31) + this.reviewCountText.hashCode()) * 31) + C786410Ut5.Z2(this.reviewCountVisible);
    }

    public C332570D1z(float f, String str, Integer num, String str2, boolean z) {
        this.rating = f;
        this.ratingText = str;
        this.reviewCount = num;
        this.reviewCountText = str2;
        this.reviewCountVisible = z;
    }
}
