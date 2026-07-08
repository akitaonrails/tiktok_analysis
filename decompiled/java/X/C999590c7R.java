package X;

import android.content.Context;
import com.google.gson.h;
import com.google.gson.n;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0c7R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C999590c7R {
    public static final /* synthetic */ int LIZ = 0;

    public static n LIZ(Context context, Aweme aweme) {
        String string;
        List<String> urlList;
        n nVar = new n();
        String aid = null;
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                Long adId = awemeRawAd.getAdId();
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
                    aid = groupId.toString();
                }
                nVar.LJJIIJ("groupId", aid);
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
            }
            aid = aweme.getAid();
        }
        nVar.LJJIIJ("itemId", String.valueOf(aid));
        nVar.LJJIII(Integer.valueOf(C444960Hcc.LIZJ(context) ? 1 : 0), "isRTL");
        nVar.LJJIII(Integer.valueOf(C497820Jfg.LIZJ(context)), "topSafeAreaHeight");
        return nVar;
    }
}
