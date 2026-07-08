package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commerce.model.CommerceActivityStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.SpecialSticker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0cZe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1017080cZe {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(Aweme aweme) {
        if (aweme == null || aweme.getActivityPendant() == null) {
            return false;
        }
        CommerceActivityStruct activityPendant = aweme.getActivityPendant();
        UrlModel urlModel = activityPendant.image;
        long j = activityPendant.startTime;
        long j2 = activityPendant.endTime;
        if (urlModel == null || C086I.LIZIZ(urlModel.getUrlList())) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        if (jCurrentTimeMillis < j || jCurrentTimeMillis > j2) {
            return false;
        }
        return true;
    }

    public static final boolean LIZIZ(Aweme aweme) {
        UrlModel redImageUrl;
        if (aweme == null || !AwemeExtKt.isAdTraffic(aweme)) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (!TextUtils.equals(awemeRawAd.getType(), "redpacket") || (redImageUrl = awemeRawAd.getRedImageUrl()) == null || C086I.LIZIZ(redImageUrl.getUrlList())) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(Aweme aweme) {
        SpecialSticker specialSticker;
        if (aweme == null || (specialSticker = aweme.getSpecialSticker()) == null || specialSticker.getStickerType() != 2) {
            return false;
        }
        return true;
    }
}
