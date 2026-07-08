package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PaidCollectionListResponse;
import com.ss.android.ugc.aweme.model.PaidVideoItem;
import com.ss.android.ugc.aweme.model.PriceInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0s3y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1612480s3y {
    public static String LJIJJ(boolean z) {
        return z ? "1" : CardStruct.IStatusCode.DEFAULT;
    }

    public static void LJFF(C2344009Gk c2344009Gk, String str) {
        if (str.length() > 0) {
            c2344009Gk.LJFF("collection_id", str);
        }
    }

    public static void LJI(C2344009Gk c2344009Gk, PaidCollectionListResponse paidCollectionListResponse) {
        StringBuilder sb = new StringBuilder();
        List<CollectionDetailModel> list = paidCollectionListResponse.collectionList;
        if (list != null) {
            int i = 0;
            for (CollectionDetailModel collectionDetailModel : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    CollectionDetailModel collectionDetailModel2 = collectionDetailModel;
                    if (i > 0) {
                        sb.append(",");
                    }
                    sb.append(String.valueOf(collectionDetailModel2.collectionId));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        c2344009Gk.LJFF("collection_id_list", sb.toString());
    }

    public static void LJII(C2344009Gk c2344009Gk, CollectionDetailModel collectionDetailModel) {
        String str;
        if (collectionDetailModel.hasPurchasedCollection) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_paid", str);
    }

    public static void LJIIIIZZ(C2344009Gk c2344009Gk, CollectionDetailModel collectionDetailModel) {
        String uid;
        User user = collectionDetailModel.collectionCreator;
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LJIIIIZZ("collection_user_id", uid);
    }

    public static void LJIIIZ(C2344009Gk c2344009Gk, CollectionDetailModel collectionDetailModel) {
        String str;
        String str2;
        PriceInfo priceInfo = collectionDetailModel.priceInfo;
        String str3 = null;
        if (priceInfo != null) {
            str = priceInfo.priceInUsd;
        } else {
            str = null;
        }
        c2344009Gk.LJFF("collection_price", str);
        if (collectionDetailModel.hasVoucher) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJFF("is_discounted_flag", str2);
        PriceInfo priceInfo2 = collectionDetailModel.discountedPriceInfo;
        if (priceInfo2 != null) {
            str3 = priceInfo2.priceInUsd;
        }
        c2344009Gk.LJFF("discount_price", str3);
    }

    public static void LJIIJ(C2344009Gk c2344009Gk, CollectionDetailModel collectionDetailModel) {
        String str;
        Long lValueOf;
        LJIIIIZZ(c2344009Gk, collectionDetailModel);
        c2344009Gk.LIZLLL(collectionDetailModel.collectionId, "collection_id");
        c2344009Gk.LJIIIIZZ("collection_name", collectionDetailModel.collectionName);
        PriceInfo priceInfo = collectionDetailModel.priceInfo;
        if (priceInfo != null) {
            str = priceInfo.priceInUsd;
        } else {
            str = null;
        }
        c2344009Gk.LJIIIIZZ("collection_price", str);
        c2344009Gk.LIZJ(collectionDetailModel.collectionVideoNum, "collection_video_cnt");
        c2344009Gk.LIZIZ(collectionDetailModel.collectionRating, "collection_rating");
        c2344009Gk.LIZLLL(collectionDetailModel.collectionTotalDuration * ((long) LSPassThroughRecordSizeConfig.DEFAULT), "collection_duration");
        StringBuilder sb = new StringBuilder();
        List<PaidVideoItem> list = collectionDetailModel.paidVideoList;
        if (list != null) {
            int i = 0;
            for (PaidVideoItem paidVideoItem : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    PaidVideoItem paidVideoItem2 = paidVideoItem;
                    if (i > 0) {
                        sb.append(",");
                    }
                    if (paidVideoItem2 != null) {
                        lValueOf = Long.valueOf(paidVideoItem2.paidVideoId);
                    } else {
                        lValueOf = null;
                    }
                    sb.append(String.valueOf(lValueOf));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        c2344009Gk.LJFF("collection_video_list", sb.toString());
        LJIIIZ(c2344009Gk, collectionDetailModel);
        c2344009Gk.LIZLLL(collectionDetailModel.collectionRatingNum, "collection_rating_num");
    }

    public static void LJIILJJIL(C2344009Gk c2344009Gk, Boolean bool) {
        c2344009Gk.LIZJ(Intrinsics.LJFF(bool, Boolean.TRUE) ? 1 : 0, "if_can_unlock_single");
    }

    public static void LJIILL(C2344009Gk c2344009Gk, boolean z) {
        c2344009Gk.LJIIIIZZ("is_from_anchor", LJIJJ(z));
    }

    public static void LJIILLIIL(C2344009Gk c2344009Gk, boolean z) {
        String str;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_success", str);
    }

    public static void LJIIZILJ(C2344009Gk c2344009Gk, C1612600s4A c1612600s4A) {
        if (c1612600s4A != null) {
            String str = c1612600s4A.anchorAuthorId;
            if (str != null) {
                c2344009Gk.LJFF("source_author_id", str);
            }
            c2344009Gk.LJFF("source_group_id", c1612600s4A.anchorGroupId);
            String str2 = c1612600s4A.anchorVideoId;
            if (str2 != null) {
                c2344009Gk.LJFF("source_video_id", str2);
            }
            c2344009Gk.LJFF("series_anchor_type", c1612600s4A.anchorType);
        }
    }

    public static void LJIJ(C2344009Gk c2344009Gk, C1612570s47 c1612570s47) {
        Object c098200Yq;
        if (c1612570s47 != null) {
            String str = c1612570s47.sourceVideoId;
            if (str != null) {
                c2344009Gk.LJFF("source_video_id", str);
            }
            String str2 = c1612570s47.sourceAuthorId;
            if (str2 != null) {
                c2344009Gk.LJFF("source_author_id", str2);
            }
            c2344009Gk.LJFF("source_group_id", c1612570s47.sourceGroupId);
            c2344009Gk.LJFF("source_video_type", c1612570s47.sourceVideoType);
            c2344009Gk.LJFF("source_series_card_type", c1612570s47.seriesCardType);
            c2344009Gk.LJFF("source_series_card_id", c1612570s47.sourceSeriesCardId);
            c2344009Gk.LJFF("series_feed_type", c1612570s47.sourceFeedType);
            String str3 = c1612570s47.entranceLogExtra;
            if (str3 != null && str3.length() > 0) {
                try {
                    JSONObject jSONObject = new JSONObject(str3);
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("entrance_");
                        sbLIZ.append(next);
                        c2344009Gk.LJFF(C2188811AlT.LIZIZ(sbLIZ), jSONObject.optString(next));
                    }
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m1boximpl(c098200Yq);
            }
        }
    }

    public static void LJIJI(C2344009Gk c2344009Gk, SeriesCategory seriesCategory) {
        Integer numValueOf;
        if (seriesCategory != null) {
            numValueOf = Integer.valueOf(seriesCategory.ordinal());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "series_category");
    }

    public static void LJIIJJI(C2344009Gk c2344009Gk, CollectionDetailModel collectionDetailModel, boolean z) {
        String str;
        LJIILJJIL(c2344009Gk, Boolean.valueOf(collectionDetailModel.enableSingleVideoPurchase));
        PriceInfo priceInfo = collectionDetailModel.singleVideoPriceInfo;
        if (priceInfo != null) {
            str = priceInfo.priceInUsd;
        } else {
            str = null;
        }
        c2344009Gk.LJFF("collection_episode_price", str);
        if (z) {
            c2344009Gk.LIZJ(collectionDetailModel.hasPurchasedCollection ? 1 : 0, "is_full_purchased");
        }
        c2344009Gk.LIZJ(collectionDetailModel.hasUserPartialPurchased ? 1 : 0, "is_partial_purchased");
    }

    public static void LJIIL(C2344009Gk c2344009Gk, String str, boolean z) {
        if (str != null && str.length() > 0) {
            if (z && (TextUtils.equals(str, "personal_homepage") || TextUtils.equals(str, "others_homepage"))) {
                str = "ads";
            }
            c2344009Gk.LJFF("enter_from", str);
        }
    }
}
