package X;

import android.content.Context;
import android.os.Bundle;
import com.google.gson.h;
import com.google.gson.n;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0c7O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C999560c7O {
    public static final /* synthetic */ int LIZ = 0;

    public static Bundle LIZIZ(Context context, Aweme aweme) {
        String nativeSiteCustomData;
        AwemeRawAd awemeRawAd;
        Bundle bundle = new Bundle();
        InterfaceC1000280c8Y interfaceC1000280c8YLIZ = C988590bph.LIZ();
        if (interfaceC1000280c8YLIZ != null) {
            interfaceC1000280c8YLIZ.LJIJJ(context, bundle, aweme);
        }
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            nativeSiteCustomData = awemeRawAd.getNativeSiteCustomData();
        } else {
            nativeSiteCustomData = null;
        }
        C786410Ut5.LJJJI("bundle_native_site_custom_data", nativeSiteCustomData, bundle);
        return bundle;
    }

    public static n LIZ(Context context, JSONObject jSONObject, Aweme aweme) {
        String strJ3;
        AwemeRawAd awemeRawAd;
        String string;
        String str;
        List<String> urlList;
        n nVar = new n();
        String str2 = "";
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            Long adId = awemeRawAd.getAdId();
            String string2 = null;
            if (adId != null) {
                string = adId.toString();
            } else {
                string = null;
            }
            nVar.LJJIIJ("adId", string);
            nVar.LJJIIJ("creativeId", awemeRawAd.getCreativeIdStr());
            nVar.LJJIIJ("logExtra", awemeRawAd.getLogExtra());
            Long groupId = awemeRawAd.getGroupId();
            if (groupId != null) {
                string2 = groupId.toString();
            }
            nVar.LJJIIJ("groupId", string2);
            UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
            if (clickTrackUrlList != null && (urlList = clickTrackUrlList.getUrlList()) != null && !urlList.isEmpty()) {
                h hVar = new h();
                Iterator<String> it2 = urlList.iterator();
                while (it2.hasNext()) {
                    hVar.LJJIII(it2.next());
                }
                nVar.LJJIFFI("clickTrackUrlList", hVar);
            }
            String nativeSiteAdInfo = awemeRawAd.getNativeSiteAdInfo();
            if (nativeSiteAdInfo == null) {
                nativeSiteAdInfo = "";
            }
            nVar.LJJIIJ("pageData", nativeSiteAdInfo);
            NativeSiteConfig nativeSiteConfig = awemeRawAd.getNativeSiteConfig();
            if (nativeSiteConfig == null || (str = nativeSiteConfig.lynxScheme) == null) {
                str = "";
            }
            nVar.LJJIIJ("lynxSchema", str);
        }
        if (jSONObject != null && (strJ3 = C786410Ut5.J3(jSONObject)) != null) {
            str2 = strJ3;
        }
        nVar.LJJIIJ("cardData", str2);
        nVar.LJJIII(Integer.valueOf(C444960Hcc.LIZJ(context) ? 1 : 0), "isRTL");
        return nVar;
    }
}
