package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.log.IAdC2STrackService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BEy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2201701BEy {
    public static final C2201701BEy LIZ = new C2201701BEy();

    public static void LIZ(String str, UrlModel urlModel, Long l, String str2) {
        List<String> urlList;
        if (urlModel != null) {
            urlList = urlModel.getUrlList();
        } else {
            urlList = null;
        }
        LIZIZ(str, urlList, l, str2, null);
    }

    public static void LIZIZ(String str, List list, Long l, String str2, JSONObject jSONObject) {
        Boolean bool;
        long jLongValue;
        if (list != null && !list.isEmpty() && (bool = Boolean.TRUE) != null) {
            bool.booleanValue();
            C2201711BEz c2201711BEz = new C2201711BEz();
            c2201711BEz.LJFF = str;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            c2201711BEz.LIZ = jLongValue;
            c2201711BEz.LIZJ = list;
            c2201711BEz.LIZLLL = str2;
            c2201711BEz.LIZIZ = true;
            c2201711BEz.LJ = jSONObject;
            c2201711BEz.LJI = true;
            C1BEK c1bekLIZ = c2201711BEz.LIZ();
            IAdC2STrackService iAdC2STrackService = (IAdC2STrackService) PluggableExtentionKt.pluggableSpi$default(IAdC2STrackService.class, false, false, false, 14, null);
            if (iAdC2STrackService != null) {
                iAdC2STrackService.LIZ(c1bekLIZ);
            }
        }
    }
}
