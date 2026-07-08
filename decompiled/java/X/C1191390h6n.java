package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h6n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1191390h6n implements Serializable {
    public final PoiReviewsApi.PoiReviewUserModel authorInfo;
    public final String avatarThirdPartyBgColor;
    public final UrlModel brandLogo;
    public final String brandName;
    public final String collectInfo;
    public final UrlModel darkModeBrandLogo;
    public final String enterFrom;
    public final String enterMethod;
    public final String enterPosition;
    public final String fromGroupId;
    public final Long likedCount;
    public final String localReviewFlag;
    public final String logId;
    public final String reviewContent;
    public final String reviewId;
    public final Integer reviewOrder;
    public final Float reviewRating;
    public final Integer reviewSource;
    public final EnumC1190580h5U reviewStatus;

    public C1191390h6n() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1191390h6n)) {
            return false;
        }
        C1191390h6n c1191390h6n = (C1191390h6n) obj;
        return Intrinsics.LJFF(this.authorInfo, c1191390h6n.authorInfo) && Intrinsics.LJFF(this.reviewRating, c1191390h6n.reviewRating) && Intrinsics.LJFF(this.reviewContent, c1191390h6n.reviewContent) && this.reviewStatus == c1191390h6n.reviewStatus && Intrinsics.LJFF(this.likedCount, c1191390h6n.likedCount) && Intrinsics.LJFF(this.reviewId, c1191390h6n.reviewId) && Intrinsics.LJFF(this.localReviewFlag, c1191390h6n.localReviewFlag) && Intrinsics.LJFF(this.reviewOrder, c1191390h6n.reviewOrder) && Intrinsics.LJFF(this.enterFrom, c1191390h6n.enterFrom) && Intrinsics.LJFF(this.enterMethod, c1191390h6n.enterMethod) && Intrinsics.LJFF(this.collectInfo, c1191390h6n.collectInfo) && Intrinsics.LJFF(this.logId, c1191390h6n.logId) && Intrinsics.LJFF(this.fromGroupId, c1191390h6n.fromGroupId) && Intrinsics.LJFF(this.enterPosition, c1191390h6n.enterPosition) && Intrinsics.LJFF(this.reviewSource, c1191390h6n.reviewSource) && Intrinsics.LJFF(this.brandLogo, c1191390h6n.brandLogo) && Intrinsics.LJFF(this.darkModeBrandLogo, c1191390h6n.darkModeBrandLogo) && Intrinsics.LJFF(this.brandName, c1191390h6n.brandName) && Intrinsics.LJFF(this.avatarThirdPartyBgColor, c1191390h6n.avatarThirdPartyBgColor);
    }

    public C1191390h6n(PoiReviewsApi.PoiReviewUserModel poiReviewUserModel, Float f, String str, EnumC1190580h5U enumC1190580h5U, Long l, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, Integer num2, UrlModel urlModel, UrlModel urlModel2, String str10, String str11) {
        this.authorInfo = poiReviewUserModel;
        this.reviewRating = f;
        this.reviewContent = str;
        this.reviewStatus = enumC1190580h5U;
        this.likedCount = l;
        this.reviewId = str2;
        this.localReviewFlag = str3;
        this.reviewOrder = num;
        this.enterFrom = str4;
        this.enterMethod = str5;
        this.collectInfo = str6;
        this.logId = str7;
        this.fromGroupId = str8;
        this.enterPosition = str9;
        this.reviewSource = num2;
        this.brandLogo = urlModel;
        this.darkModeBrandLogo = urlModel2;
        this.brandName = str10;
        this.avatarThirdPartyBgColor = str11;
    }
}
