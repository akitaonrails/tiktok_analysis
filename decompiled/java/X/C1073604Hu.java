package X;

import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectItem;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectOption;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04Hu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1073604Hu {
    public static Map LIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_name", "product_review");
        linkedHashMap.put("review_cnt", Integer.valueOf(C1073704Hv.LIZIZ));
        C1073804Hw c1073804Hw = C1073704Hv.LIZLLL;
        linkedHashMap.put("page_info", C123100dR.LIZ(c1073804Hw != null ? c1073804Hw.LIZ : null) ? "impression_tag" : "all");
        linkedHashMap.put("has_rate", 1);
        float f = C1073704Hv.LIZ;
        if (f >= 0.0f) {
            linkedHashMap.put("rate", Float.valueOf(f));
        }
        linkedHashMap.put("rd_pdp_monitor_version", "v4190");
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZIZ() {
        /*
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.lang.String r1 = "page_name"
            java.lang.String r0 = "shop_review"
            r3.put(r1, r0)
            int r0 = X.C1073704Hv.LIZIZ
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "review_cnt"
            r3.put(r0, r1)
            int r0 = X.C1073704Hv.LIZJ
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "shop_review_cnt"
            r3.put(r0, r1)
            X.04Hw r1 = X.C1073704Hv.LIZLLL
            r0 = 0
            if (r1 == 0) goto L29
            java.lang.String r0 = r1.LIZ
        L29:
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L45
            X.04Hw r0 = X.C1073704Hv.LIZLLL
            if (r0 == 0) goto L61
            java.lang.Integer r2 = r0.LIZIZ
            if (r2 == 0) goto L61
            int r1 = r2.intValue()
            r0 = 2
            if (r1 != r0) goto L4d
            java.lang.String r1 = "rate"
        L40:
            java.lang.String r0 = "page_info"
            r3.put(r0, r1)
        L45:
            java.lang.String r1 = "rd_pdp_monitor_version"
            java.lang.String r0 = "v4190"
            r3.put(r1, r0)
            return r3
        L4d:
            int r1 = r2.intValue()
            r0 = 1
            if (r1 != r0) goto L57
            java.lang.String r1 = "keyword"
            goto L40
        L57:
            int r1 = r2.intValue()
            r0 = 3
            if (r1 != r0) goto L61
            java.lang.String r1 = "impression_tag"
            goto L40
        L61:
            java.lang.String r1 = "all"
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1073604Hu.LIZIZ():java.util.Map");
    }

    public static void LIZJ(LaneParams laneParams, ReviewItemStruct reviewItemStruct) {
        int i;
        int i2;
        int iIntValue;
        int size;
        String str;
        String str2;
        int iIntValue2;
        long jLongValue;
        int i3;
        String strLIZ;
        List<ReviewAspectItem> list;
        ReviewAspectItem reviewAspectItem;
        ReviewAspectOption reviewAspectOption;
        ReviewItemStruct.AppendReview appendReview;
        String str3;
        Long lLJIILIIL;
        List<ReviewMedia> list2;
        ReviewItemStruct.AppendReview appendReview2;
        List<ReviewMedia> list3;
        List<ReviewMedia> list4;
        C1010603xI.LIZJ(laneParams, reviewItemStruct.daInfo);
        laneParams.put("is_self", Integer.valueOf(Intrinsics.LJFF(reviewItemStruct.isOwner, Boolean.TRUE) ? 1 : 0));
        ReviewItemStruct.MainReview mainReview = reviewItemStruct.review;
        int i4 = 0;
        if (mainReview != null && (list4 = mainReview.media) != null) {
            i = 0;
            i2 = 0;
            for (ReviewMedia reviewMedia : list4) {
                Integer num = reviewMedia.mediaType;
                if (num != null && num.intValue() == 2) {
                    i++;
                } else {
                    Integer num2 = reviewMedia.mediaType;
                    if (num2 != null && num2.intValue() == 1) {
                        i2++;
                    }
                }
            }
        } else {
            i = 0;
            i2 = 0;
        }
        ReviewItemStruct.MainReview mainReview2 = reviewItemStruct.review;
        if (mainReview2 != null && (appendReview2 = mainReview2.appendReview) != null && (list3 = appendReview2.media) != null) {
            for (ReviewMedia reviewMedia2 : list3) {
                Integer num3 = reviewMedia2.mediaType;
                if (num3 != null && num3.intValue() == 2) {
                    i++;
                } else {
                    Integer num4 = reviewMedia2.mediaType;
                    if (num4 != null && num4.intValue() == 1) {
                        i2++;
                    }
                }
            }
        }
        Integer num5 = reviewItemStruct.reviewSourceType;
        if (num5 != null) {
            iIntValue = num5.intValue();
        } else {
            iIntValue = 0;
        }
        laneParams.put("is_third_party", Integer.valueOf(iIntValue));
        laneParams.put("photo_cnt", Integer.valueOf(i2));
        laneParams.put("video_cnt", Integer.valueOf(i));
        ReviewItemStruct.MainReview mainReview3 = reviewItemStruct.review;
        if (mainReview3 != null && (list2 = mainReview3.media) != null) {
            size = list2.size();
        } else {
            size = 0;
        }
        laneParams.put("photo_show_type", Integer.valueOf(size));
        ReviewItemStruct.MainReview mainReview4 = reviewItemStruct.review;
        String str4 = null;
        if (mainReview4 != null) {
            str = mainReview4.rating;
        } else {
            str = null;
        }
        laneParams.put("rate", str);
        ReviewItemStruct.MainReview mainReview5 = reviewItemStruct.review;
        if (mainReview5 != null && Intrinsics.LJFF(mainReview5.hasOriginText, Boolean.TRUE)) {
            str2 = "comment";
        } else {
            str2 = "default";
        }
        laneParams.put("text_type", str2);
        Integer num6 = reviewItemStruct.diggCount;
        if (num6 != null) {
            iIntValue2 = num6.intValue();
        } else {
            iIntValue2 = 0;
        }
        laneParams.put("like_cnt", Integer.valueOf(iIntValue2));
        laneParams.put("sku_id", reviewItemStruct.skuId);
        ReviewItemStruct.MainReview mainReview6 = reviewItemStruct.review;
        if (mainReview6 != null) {
            str4 = mainReview6.reviewId;
        }
        laneParams.put("review_id", str4);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
        Calendar calendar = Calendar.getInstance();
        ReviewItemStruct.MainReview mainReview7 = reviewItemStruct.review;
        if (mainReview7 != null && (str3 = mainReview7.reviewTimeStamp) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str3)) != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        calendar.setTimeInMillis(jLongValue);
        laneParams.put("post_date", simpleDateFormat.format(calendar.getTime()));
        laneParams.put("is_anonymous", Integer.valueOf(Intrinsics.LJFF(reviewItemStruct.isAnonymous, Boolean.TRUE) ? 1 : 0));
        ReviewItemStruct.MainReview mainReview8 = reviewItemStruct.review;
        if (mainReview8 != null && mainReview8.reply != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (mainReview8 != null && (appendReview = mainReview8.appendReview) != null && appendReview.reply != null) {
            i3++;
        }
        laneParams.put("reply_cnt", Integer.valueOf(i3));
        ReviewItemStruct.MainReview mainReview9 = reviewItemStruct.review;
        if (mainReview9 != null && mainReview9.appendReview != null) {
            i4 = 1;
        }
        laneParams.put("has_add_review", Integer.valueOf(i4));
        laneParams.put("has_edit", Integer.valueOf(reviewItemStruct.isUpdated ? 1 : 0));
        ReviewItemStruct.MainReview mainReview10 = reviewItemStruct.review;
        if (mainReview10 == null || (list = mainReview10.reviewAspectItems) == null || (reviewAspectItem = (ReviewAspectItem) C13LP.LJJJLL(list)) == null || (reviewAspectOption = reviewAspectItem.answer) == null || (strLIZ = reviewAspectOption.LIZ()) == null) {
            strLIZ = "null";
        }
        laneParams.put("fit_info", strLIZ);
        laneParams.put("is_local", Integer.valueOf(reviewItemStruct.isLocal ? 1 : 0));
        laneParams.put("is_incentive_review", Integer.valueOf(C123100dR.LIZ(reviewItemStruct.reviewIncentiveName) ? 1 : 0));
    }
}
