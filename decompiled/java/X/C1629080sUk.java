package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.sticker.repository.params.HorizontalEffectsFetcherRequest;
import com.ss.ugc.effectplatform.model.fullwidthcarousel.HorizontalCarouselShowFavorite;
import com.ss.ugc.effectplatform.model.fullwidthcarousel.HorizontalCarouselShowFavoriteFromVideo;
import com.ss.ugc.effectplatform.model.fullwidthcarousel.HorizontalCarouselShowRecent;
import java.util.List;

/* JADX INFO: renamed from: X.0sUk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1629080sUk {
    public static HorizontalEffectsFetcherRequest LIZ(Integer num, List list) {
        String str;
        String str2;
        int iIntValue;
        boolean zIsEnabled = HorizontalCarouselShowRecent.isEnabled();
        boolean zIsEnabled2 = HorizontalCarouselShowFavorite.isEnabled();
        if (HorizontalCarouselShowFavoriteFromVideo.isEnabled()) {
            str = "video_fav";
        } else {
            str = "fav";
        }
        C1411890mqR.LIZ.getClass();
        int iLIZ = C1402560mbO.LIZ();
        if (iLIZ != 1) {
            if (iLIZ != 2) {
                if (iLIZ != 3) {
                    str2 = "";
                } else {
                    str2 = "post_video";
                }
            } else {
                str2 = "record_video";
            }
        } else {
            str2 = "prop_click";
        }
        int limit = HorizontalCarouselRecentEffectsLimitAB.getLimit();
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        return new HorizontalEffectsFetcherRequest(list, false, zIsEnabled2, str, zIsEnabled, str2, Integer.valueOf(limit), iIntValue, null, null, 770, null);
    }
}
