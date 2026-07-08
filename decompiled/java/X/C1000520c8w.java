package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService;
import com.ss.android.ugc.aweme.commercialize.model.AdLynxEntryData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0c8w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1000520c8w {
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
        return new C1028380crs("feed_fyp_super_like", c0wov, context, new C1029740cu4(string, logExtra, groupId, numValueOf, numValueOf2, null, false, 96));
    }

    public static C1051290dSp LIZIZ(Context context, Aweme aweme) {
        InterfaceC1000280c8Y interfaceC1000280c8Y;
        AdLynxEntryData lynxEntryData;
        String str;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        String string = null;
        if (awemeRawAd != null && (lynxEntryData = awemeRawAd.getLynxEntryData()) != null && (str = lynxEntryData.lynxScheme) != null) {
            string = UriProtector.parse(str).buildUpon().appendQueryParameter("initialData", C999930c7z.LIZ(context, aweme).toString()).toString();
        }
        Bundle bundle = new Bundle();
        InterfaceC988500bpY interfaceC988500bpYQ = ((ICommercializeAdService) ServiceManager.get().getService(ICommercializeAdService.class)).Q(17);
        if ((interfaceC988500bpYQ instanceof InterfaceC1000280c8Y) && (interfaceC1000280c8Y = (InterfaceC1000280c8Y) interfaceC988500bpYQ) != null) {
            interfaceC1000280c8Y.LJIJJ(context, bundle, aweme);
        }
        return new C1051290dSp(EnumC1000680c9C.CACHE_WITH_RETRY, aweme.getAid(), 4, true, new C1049260dPY("feed_fyp_super_like", string, bundle, C1014230cV3.LIZ("feed_fyp_super_like"), new C1020420cf2(), false, null, false, null, null, null, null, 16352), null, false, false, 456);
    }
}
