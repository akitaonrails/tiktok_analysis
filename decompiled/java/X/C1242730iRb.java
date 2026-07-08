package X;

import com.ss.android.ugc.aweme.profile.model.AdvancedFeatureInfo;
import com.ss.android.ugc.aweme.profile.model.AudienceSubInfo;
import com.ss.android.ugc.aweme.profile.model.SubscriptionInfo;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0iRb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1242730iRb {
    public static final String LIZ(User user) {
        AdvancedFeatureInfo[] advancedFeatureInfoArr = user.advancedFeatureInfo;
        if (advancedFeatureInfoArr == null) {
            return null;
        }
        for (AdvancedFeatureInfo advancedFeatureInfo : advancedFeatureInfoArr) {
            if (advancedFeatureInfo.getFeatureId() == EnumC1242710iRZ.SHOP.getId()) {
                return advancedFeatureInfo.getShopSchema();
            }
        }
        return null;
    }

    public static final String LIZIZ(User user) {
        AdvancedFeatureInfo[] advancedFeatureInfoArr = user.advancedFeatureInfo;
        if (advancedFeatureInfoArr == null) {
            return null;
        }
        for (AdvancedFeatureInfo advancedFeatureInfo : advancedFeatureInfoArr) {
            if (advancedFeatureInfo.getFeatureId() == EnumC1242710iRZ.SHOWCASE.getId()) {
                return advancedFeatureInfo.getShopSchema();
            }
        }
        return null;
    }

    public static final String LIZJ(User user) {
        AudienceSubInfo audienceSubInfo;
        Integer numValueOf;
        AdvancedFeatureInfo[] advancedFeatureInfoArr = user.advancedFeatureInfo;
        if (advancedFeatureInfoArr != null) {
            for (AdvancedFeatureInfo advancedFeatureInfo : advancedFeatureInfoArr) {
                if (advancedFeatureInfo.getFeatureId() == EnumC1242710iRZ.SUBSCRIBE.getId()) {
                    SubscriptionInfo subInfo = advancedFeatureInfo.getSubInfo();
                    if (subInfo != null && (audienceSubInfo = subInfo.getAudienceSubInfo()) != null && (numValueOf = Integer.valueOf(audienceSubInfo.getSubStatus())) != null && numValueOf.intValue() != 0 && numValueOf.intValue() != 3) {
                        if (numValueOf.intValue() == 1) {
                            return "subscribed_not_expired";
                        }
                        if (numValueOf.intValue() == 2) {
                            return "subscribed_expired_grace_period";
                        }
                        return "not_subscribed";
                    }
                    return "not_subscribed";
                }
            }
            return "not_subscribed";
        }
        return "not_subscribed";
    }
}
