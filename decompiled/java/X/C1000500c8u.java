package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0c8u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1000500c8u {
    public static C1028380crs LIZ(Context context, Aweme aweme) {
        String string;
        String logExtra;
        Integer numValueOf;
        Long creativeId;
        C0WOV c0wov = C0WOV.SPARK;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        Integer numValueOf2 = null;
        if (awemeRawAd != null && (creativeId = awemeRawAd.getCreativeId()) != null) {
            string = creativeId.toString();
        } else {
            string = null;
        }
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (awemeRawAd2 != null) {
            logExtra = awemeRawAd2.getLogExtra();
        } else {
            logExtra = null;
        }
        String groupId = aweme.getGroupId();
        AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
        if (awemeRawAd3 != null) {
            numValueOf = Integer.valueOf(awemeRawAd3.getChargeType());
        } else {
            numValueOf = null;
        }
        AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
        if (awemeRawAd4 != null) {
            numValueOf2 = Integer.valueOf(awemeRawAd4.getSystemOrigin());
        }
        return new C1028380crs("feed_fyp_mask", c0wov, context, new C1029740cu4(string, logExtra, groupId, numValueOf, numValueOf2, null, false, 96));
    }

    public static C1051290dSp LIZIZ(Context context, Aweme aweme) {
        EnumC1000680c9C enumC1000680c9C;
        String cardUrl;
        CardStruct cardStructLJJIJIIJI = C1017070cZd.LJJIJIIJI(aweme);
        String string = null;
        if (cardStructLJJIJIIJI != null && ((cardStructLJJIJIIJI.getCardType() == 13 || cardStructLJJIJIIJI.getCardType() == 15) && (cardUrl = cardStructLJJIJIIJI.getCardUrl()) != null)) {
            string = UriProtector.parse(cardUrl).buildUpon().appendQueryParameter("initialData", C999560c7O.LIZ(context, cardStructLJJIJIIJI.getCardData(), aweme).toString()).toString();
        }
        C1049260dPY c1049260dPY = new C1049260dPY("feed_fyp_mask", string, C999560c7O.LIZIZ(context, aweme), C1014230cV3.LIZ("feed_fyp_mask"), new C1020420cf2(), false, null, false, null, null, null, null, 16352);
        if (C07CW.LIZ() && (((Number) C07CW.LIZ.getValue()).intValue() & 2) != 0) {
            enumC1000680c9C = EnumC1000680c9C.CACHE_WITH_RETRY;
        } else {
            enumC1000680c9C = EnumC1000680c9C.ONLY_RENDER;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(aweme.getAid());
        sbLIZ.append("_mask");
        return new C1051290dSp(enumC1000680c9C, C2188811AlT.LIZIZ(sbLIZ), 0, true, c1049260dPY, null, false, false, 460);
    }
}
