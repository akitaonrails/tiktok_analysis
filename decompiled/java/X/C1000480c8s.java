package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.model.AdBottomContainerInfoStruct;
import com.ss.android.ugc.aweme.commercialize.model.AdDescriptiveCTAStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* JADX INFO: renamed from: X.0c8s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1000480c8s {
    public static String LIZ(Aweme aweme) {
        String containerUrl;
        AdDescriptiveCTAStruct adDescriptiveCTA;
        AdBottomContainerInfoStruct bottomContainer;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(aweme.getAid());
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && (adDescriptiveCTA = awemeRawAd.getAdDescriptiveCTA()) != null && (bottomContainer = adDescriptiveCTA.getBottomContainer()) != null) {
            containerUrl = bottomContainer.getContainerUrl();
        } else {
            containerUrl = null;
        }
        sbLIZ.append(containerUrl);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C1051290dSp LIZIZ(Context context, Aweme aweme) {
        String string;
        EnumC1000680c9C enumC1000680c9C;
        AdDescriptiveCTAStruct adDescriptiveCTA;
        AdBottomContainerInfoStruct bottomContainer;
        String containerUrl;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && (adDescriptiveCTA = awemeRawAd.getAdDescriptiveCTA()) != null && (bottomContainer = adDescriptiveCTA.getBottomContainer()) != null && (containerUrl = bottomContainer.getContainerUrl()) != null) {
            string = UriProtector.parse(containerUrl).buildUpon().appendQueryParameter("initialData", C1000060c8C.LIZ(context, aweme).toString()).toString();
        } else {
            string = null;
        }
        C1049260dPY c1049260dPY = new C1049260dPY("feed_fyp_descriptive_bottom_container", string, C1000060c8C.LIZIZ(context, aweme), C1014230cV3.LIZ("feed_fyp_descriptive_bottom_container"), new C1020420cf2(), false, null, false, Integer.valueOf(C14KQ.LJIIIIZZ(context)), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56))), null, null, 13280);
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (!((Boolean) C257360A6s.LIZ.getValue()).booleanValue()) {
            enumC1000680c9C = EnumC1000680c9C.CACHE_WITH_RETRY;
        } else {
            enumC1000680c9C = EnumC1000680c9C.CACHE_WITH_ASYNC_RETRY;
        }
        return new C1051290dSp(enumC1000680c9C, LIZ(aweme), 4, false, c1049260dPY, null, false, false, 456);
    }

    public static C1028380crs LIZJ(Context context, Aweme aweme) {
        C0WOV c0wov;
        String string;
        String logExtra;
        Integer numValueOf;
        Long creativeId;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (!((Boolean) C257360A6s.LIZ.getValue()).booleanValue()) {
            c0wov = C0WOV.SPARK;
        } else {
            c0wov = C0WOV.ASYNCSARK;
        }
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
        return new C1028380crs("feed_fyp_descriptive_bottom_container", c0wov, context, new C1029740cu4(string, logExtra, groupId, numValueOf, numValueOf2, null, false, 96));
    }
}
