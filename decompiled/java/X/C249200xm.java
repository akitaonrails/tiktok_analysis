package X;

import com.bytedance.android.livesdk.gift.model.GiftCampaignProgress;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.00xm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C249200xm {
    public static final C249200xm LIZ = new C249200xm();

    public static GiftCampaignProgress.ConditionProgress LIZJ(GiftCampaignProgress.CampaignProgress campaignProgress, long j) {
        GiftCampaignProgress.ConditionProgress conditionProgress = null;
        if (j <= 0) {
            return null;
        }
        Iterator<GiftCampaignProgress.ConditionProgress> it2 = campaignProgress.conditionProgressList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            GiftCampaignProgress.ConditionProgress next = it2.next();
            if (next.giftIds.contains(Long.valueOf(j))) {
                conditionProgress = next;
                break;
            }
        }
        return conditionProgress;
    }

    public static String LIZ(GiftCampaignProgress giftCampaignProgress, long j, long j2) {
        GiftCampaignProgress.CampaignProgress campaignProgressLIZIZ;
        String str;
        Long lValueOf = Long.valueOf(j2);
        if (giftCampaignProgress != null && j > 0 && (campaignProgressLIZIZ = LIZIZ(giftCampaignProgress, j, lValueOf)) != null && (str = campaignProgressLIZIZ.activityPageUrl) != null && (!a0.LJJJIL(str))) {
            return str;
        }
        return null;
    }

    public static GiftCampaignProgress.CampaignProgress LIZIZ(GiftCampaignProgress giftCampaignProgress, long j, Long l) {
        GiftCampaignProgress.CampaignProgress next;
        Iterator<GiftCampaignProgress.CampaignProgress> it2 = giftCampaignProgress.campaignProgressList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                GiftCampaignProgress.CampaignProgress campaignProgress = next;
                LIZ.getClass();
                if (LIZJ(campaignProgress, j) != null) {
                    if (l == null) {
                        break;
                    }
                    long j2 = campaignProgress.activityEndTime;
                    long jLongValue = l.longValue();
                    if (j2 > 0 && TimeUnit.SECONDS.toMillis(j2) - jLongValue > 0) {
                        break;
                    }
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }
}
