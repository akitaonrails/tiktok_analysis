package X;

import Y.ARunnableS118S0100000_18;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.nearby.settings.NearbyPreloadImageOptAB;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0hQw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1203880hQw {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(List list) {
        int i;
        UrlModel cover;
        List<String> urlList;
        Object objLJJJLL;
        C01GW c01gw = NearbyPreloadImageOptAB.LIZIZ;
        if (!((NearbyPreloadImageOptAB.NearbyPreloadImageConfig) c01gw.getValue()).enableValue || list == null || (i = ((NearbyPreloadImageOptAB.NearbyPreloadImageConfig) c01gw.getValue()).preloadCount) <= 0) {
            return;
        }
        List listLL = C13LP.LL(list, i);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = listLL.iterator();
        while (it2.hasNext()) {
            Video video = ((Aweme) it2.next()).getVideo();
            if (video != null && (cover = video.getCover()) != null && (urlList = cover.getUrlList()) != null && (objLJJJLL = C13LP.LJJJLL(urlList)) != null) {
                arrayList.add(objLJJJLL);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C1336370ksd.LIZ.LJFF(new C1202730hP5(arrayList, "nearby", "nearby_cache_cover_preload"));
        C823050WQl.LIZLLL().execute(new ARunnableS118S0100000_18(arrayList, 92));
    }
}
