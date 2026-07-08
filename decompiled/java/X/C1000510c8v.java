package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.commercialize.model.AdDescriptiveCTAStruct;
import com.ss.android.ugc.aweme.commercialize.model.AdTopContainerInfoStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* JADX INFO: renamed from: X.0c8v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1000510c8v {
    public static String LIZ(Aweme aweme) {
        String containerUrl;
        AdDescriptiveCTAStruct adDescriptiveCTA;
        AdTopContainerInfoStruct leftContainer;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(aweme.getAid());
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && (adDescriptiveCTA = awemeRawAd.getAdDescriptiveCTA()) != null && (leftContainer = adDescriptiveCTA.getLeftContainer()) != null) {
            containerUrl = leftContainer.getContainerUrl();
        } else {
            containerUrl = null;
        }
        sbLIZ.append(containerUrl);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C1051290dSp LIZIZ(Context context, Aweme aweme) {
        String string;
        AdDescriptiveCTAStruct adDescriptiveCTA;
        AdTopContainerInfoStruct leftContainer;
        String containerUrl;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && (adDescriptiveCTA = awemeRawAd.getAdDescriptiveCTA()) != null && (leftContainer = adDescriptiveCTA.getLeftContainer()) != null && (containerUrl = leftContainer.getContainerUrl()) != null) {
            string = UriProtector.parse(containerUrl).buildUpon().appendQueryParameter("initialData", C1000060c8C.LIZ(context, aweme).toString()).toString();
        } else {
            string = null;
        }
        return new C1051290dSp(EnumC1000680c9C.CACHE_WITH_RETRY, LIZ(aweme), 4, false, new C1049260dPY("feed_fyp_descriptive_left_container", string, C1000060c8C.LIZIZ(context, aweme), C1014230cV3.LIZ("feed_fyp_descriptive_left_container"), new C1020420cf2(), false, null, false, null, null, null, null, 16352), null, false, false, 456);
    }

    public static C1028380crs LIZJ(Context context, Aweme aweme) {
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
        return new C1028380crs("feed_fyp_descriptive_left_container", c0wov, context, new C1029740cu4(string, logExtra, groupId, numValueOf, numValueOf2, null, false, 96));
    }
}
