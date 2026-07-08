package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.h;
import com.google.gson.n;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.IAdTranslationData;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0c8t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1000490c8t {
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
        return new C1028380crs("feed_fyp_carousel_tag", c0wov, context, new C1029740cu4(string, logExtra, groupId, numValueOf, numValueOf2, null, false, 96));
    }

    public static String LIZ(int i, Integer num, String str) {
        if (num == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("_carousel_");
            sbLIZ.append(i);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(num);
        sbLIZ2.append('_');
        sbLIZ2.append(str);
        sbLIZ2.append("_carousel_");
        sbLIZ2.append(i);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static C1051290dSp LIZIZ(Context context, Aweme aweme, int i) {
        String string;
        PhotoCarouselInfoStruct photoCarouselInfo;
        String lynxScheme;
        JSONObject frontendData;
        String strJ3;
        String string2;
        String string3;
        List<String> urlList;
        C997610c4F c997610c4FLIZJ;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        Integer numValueOf = null;
        if (awemeRawAd != null && (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) != null && (lynxScheme = photoCarouselInfo.getLynxScheme()) != null) {
            Uri.Builder builderBuildUpon = UriProtector.parse(lynxScheme).buildUpon();
            n nVar = new n();
            nVar.LJJIII(Integer.valueOf(C444960Hcc.LIZJ(context) ? 1 : 0), "isRTL");
            nVar.LJJIII(Integer.valueOf(i), "containerKey");
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null) {
                IAdTranslationData translationData = awemeRawAd2.getTranslationData();
                if (translationData == null || (c997610c4FLIZJ = C997720c4Q.LIZJ(translationData)) == null || (frontendData = c997610c4FLIZJ.LIZ) == null) {
                    frontendData = awemeRawAd2.getFrontendData();
                }
                String str = "";
                if (frontendData == null || (strJ3 = C786410Ut5.J3(frontendData)) == null) {
                    strJ3 = "";
                }
                nVar.LJJIIJ("frontendData", strJ3);
                Long adId = awemeRawAd2.getAdId();
                if (adId != null) {
                    string2 = adId.toString();
                } else {
                    string2 = null;
                }
                nVar.LJJIIJ("adId", string2);
                nVar.LJJIIJ("creativeId", awemeRawAd2.getCreativeIdStr());
                nVar.LJJIIJ("logExtra", awemeRawAd2.getLogExtra());
                Long groupId = awemeRawAd2.getGroupId();
                if (groupId != null) {
                    string3 = groupId.toString();
                } else {
                    string3 = null;
                }
                nVar.LJJIIJ("groupId", string3);
                UrlModel clickTrackUrlList = awemeRawAd2.getClickTrackUrlList();
                if (clickTrackUrlList != null && (urlList = clickTrackUrlList.getUrlList()) != null && !urlList.isEmpty()) {
                    h hVar = new h();
                    Iterator<String> it2 = urlList.iterator();
                    while (it2.hasNext()) {
                        hVar.LJJIII(it2.next());
                    }
                    nVar.LJJIFFI("clickTrackUrlList", hVar);
                }
                String nativeSiteAdInfo = awemeRawAd2.getNativeSiteAdInfo();
                if (nativeSiteAdInfo != null) {
                    str = nativeSiteAdInfo;
                }
                nVar.LJJIIJ("pageData", str);
                nVar.LJJIII(Integer.valueOf(awemeRawAd2.getWebviewType()), "landingStyle");
            }
            string = builderBuildUpon.appendQueryParameter("initialData", nVar.toString()).toString();
        } else {
            string = null;
        }
        Bundle bundle = new Bundle();
        InterfaceC1000280c8Y interfaceC1000280c8YLIZ = C988590bph.LIZ();
        if (interfaceC1000280c8YLIZ != null) {
            interfaceC1000280c8YLIZ.LJIJJ(context, bundle, aweme);
        }
        C1049260dPY c1049260dPY = new C1049260dPY("feed_fyp_carousel_tag", string, bundle, C1014230cV3.LIZ("feed_fyp_carousel_tag"), new C1020420cf2(), false, null, false, null, null, null, null, 16352);
        EnumC1000680c9C enumC1000680c9C = EnumC1000680c9C.CACHE_WITH_RETRY;
        AwemeRawAd awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme);
        if (awemeRawAdLJJIJLIJ != null) {
            numValueOf = Integer.valueOf(awemeRawAdLJJIJLIJ.getRit());
        }
        return new C1051290dSp(enumC1000680c9C, LIZ(i, numValueOf, aweme.getAid()), 6, true, c1049260dPY, null, false, false, 456);
    }
}
