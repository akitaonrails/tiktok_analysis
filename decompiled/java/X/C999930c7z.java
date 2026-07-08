package X;

import android.content.Context;
import com.google.gson.h;
import com.google.gson.n;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0c7z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C999930c7z {
    public static n LIZ(Context context, Aweme aweme) {
        String string;
        String strJ3;
        List<String> urlList;
        n nVar = new n();
        String aid = null;
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                nVar.LJJIIJ("adId", awemeRawAd.getAdId().toString());
                nVar.LJJIIJ("creativeId", awemeRawAd.getCreativeIdStr());
                nVar.LJJIIJ("logExtra", awemeRawAd.getLogExtra());
                Long groupId = awemeRawAd.getGroupId();
                if (groupId != null) {
                    string = groupId.toString();
                } else {
                    string = null;
                }
                nVar.LJJIIJ("groupId", string);
                UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
                if (clickTrackUrlList != null && (urlList = clickTrackUrlList.getUrlList()) != null && !urlList.isEmpty()) {
                    h hVar = new h();
                    Iterator<String> it2 = urlList.iterator();
                    while (it2.hasNext()) {
                        hVar.LJJIII(it2.next());
                    }
                    nVar.LJJIFFI("clickTrackUrlList", hVar);
                }
                JSONObject frontendData = awemeRawAd.getFrontendData();
                if (frontendData != null) {
                    strJ3 = C786410Ut5.J3(frontendData);
                } else {
                    strJ3 = null;
                }
                nVar.LJJIIJ("frontendData", strJ3);
                NativeSiteConfig nativeSiteConfig = awemeRawAd.getNativeSiteConfig();
                if (nativeSiteConfig != null) {
                    aid = nativeSiteConfig.lynxScheme;
                }
                nVar.LJJIIJ("lynxSchema", aid);
            }
            aid = aweme.getAid();
        }
        nVar.LJJIIJ("itemId", String.valueOf(aid));
        nVar.LJJIII(Integer.valueOf(C444960Hcc.LIZJ(context) ? 1 : 0), "isRTL");
        nVar.LJJIII(Integer.valueOf(C497820Jfg.LIZJ(context)), "topSafeAreaHeight");
        return nVar;
    }
}
