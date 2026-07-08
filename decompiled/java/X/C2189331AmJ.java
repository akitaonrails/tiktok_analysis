package X;

import com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.model.RankData;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.model.RawAdData;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceRerankInfo;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.1AmJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2189331AmJ {
    public static Boolean LIZ(Aweme aweme) {
        C256420A3c.LIZ.getClass();
        boolean z = false;
        if (((Number) C256420A3c.LIZIZ.getValue()).intValue() == 1 && !aweme.isAd()) {
            if (aweme.getAwemeType() == 0) {
                return Boolean.valueOf(((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJJJZ(aweme));
            }
            if (aweme.getAwemeType() == 101) {
                LiveRoomStruct liveRoomStructFinally = AwemeExtKt.getLiveRoomStructFinally(aweme);
                if (liveRoomStructFinally != null) {
                    z = liveRoomStructFinally.hasCommerceGoods;
                }
                return Boolean.valueOf(z);
            }
            return Boolean.FALSE;
        }
        return null;
    }

    public static RankData LIZIZ(Aweme aweme) {
        RawAdData rawAdData;
        int i;
        String itemParamForPitaya;
        int i2;
        String itemParamForPitaya2;
        long jLongValue;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (aweme.isAd() && awemeRawAd != null) {
            long jLongValue2 = 0;
            if (RankData.prunePitayaInputOptimization$delegate.getValue().booleanValue()) {
                Long adId = awemeRawAd.getAdId();
                if (adId != null) {
                    jLongValue = adId.longValue();
                } else {
                    jLongValue = 0;
                }
                Long creativeId = awemeRawAd.getCreativeId();
                if (creativeId != null) {
                    jLongValue2 = creativeId.longValue();
                }
                rawAdData = new RawAdData(jLongValue, null, null, null, null, Long.valueOf(jLongValue2));
            } else {
                Long adId2 = awemeRawAd.getAdId();
                if (adId2 != null) {
                    jLongValue2 = adId2.longValue();
                }
                rawAdData = new RawAdData(jLongValue2, Integer.valueOf(awemeRawAd.getComponentType()), Integer.valueOf(awemeRawAd.getAdSourceType()), Integer.valueOf(awemeRawAd.getChargeType()), Integer.valueOf(awemeRawAd.getSystemOrigin()), null);
            }
        } else {
            rawAdData = null;
        }
        String str = "";
        if (RankData.prunePitayaInputOptimization$delegate.getValue().booleanValue()) {
            String aid = aweme.getAid();
            if (aid == null) {
                aid = "";
            }
            int awemeType = aweme.getAwemeType();
            CommerceRerankInfo commerceRerankInfo = aweme.getCommerceRerankInfo();
            if (commerceRerankInfo != null && (itemParamForPitaya2 = commerceRerankInfo.getItemParamForPitaya()) != null) {
                str = itemParamForPitaya2;
            }
            com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.model.CommerceRerankInfo commerceRerankInfo2 = new com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.model.CommerceRerankInfo(str);
            if (!C2245741Cv6.LIZIZ(aweme) && !C2245741Cv6.LIZJ(aweme)) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            return new RankData(aid, awemeType, null, null, commerceRerankInfo2, aweme, rawAdData, i2, null, LIZ(aweme));
        }
        String aid2 = aweme.getAid();
        if (aid2 == null) {
            aid2 = "";
        }
        int awemeType2 = aweme.getAwemeType();
        Integer numValueOf = Integer.valueOf(aweme.getMusicBeginTime());
        Integer numValueOf2 = Integer.valueOf(aweme.getMusicEndTime());
        CommerceRerankInfo commerceRerankInfo3 = aweme.getCommerceRerankInfo();
        if (commerceRerankInfo3 != null && (itemParamForPitaya = commerceRerankInfo3.getItemParamForPitaya()) != null) {
            str = itemParamForPitaya;
        }
        com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.model.CommerceRerankInfo commerceRerankInfo4 = new com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.model.CommerceRerankInfo(str);
        if (!C2245741Cv6.LIZIZ(aweme) && !C2245741Cv6.LIZJ(aweme)) {
            i = 0;
        } else {
            i = 1;
        }
        return new RankData(aid2, awemeType2, numValueOf, numValueOf2, commerceRerankInfo4, aweme, rawAdData, i, null, LIZ(aweme));
    }
}
