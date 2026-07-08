package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.07kS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1950207kS<T> extends AbstractC1951007ka {
    public Uri LIZ;
    public Uri LIZIZ;
    public HashMap<String, Object> LIZJ;

    public abstract Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX);

    public ArrayList<Integer> LJ() {
        return null;
    }

    public boolean LJIIIIZZ() {
        return false;
    }

    public final Uri LJFF() {
        Uri uri = this.LIZ;
        if (uri != null) {
            return uri;
        }
        return null;
    }

    public String LJI() {
        Uri uri = this.LIZIZ;
        if (uri == null) {
            return "";
        }
        C1953307kx.LIZ.getClass();
        return C1953307kx.LIZJ(uri);
    }

    public final void LJII(String str, Context context, C1950707kX c1950707kX) {
        String strSubstring;
        if (this.LIZJ != null) {
            if (!LJIIIIZZ()) {
                C1953307kx c1953307kx = C1953307kx.LIZ;
                String encodedQuery = UriProtector.parse(str).getEncodedQuery();
                c1953307kx.getClass();
                Pair<String, HashMap<String, Object>> pairLIZLLL = LIZLLL(str, C1953307kx.LIZ(encodedQuery), c1950707kX);
                String first = pairLIZLLL.getFirst();
                HashMap<String, Object> second = pairLIZLLL.getSecond();
                HashMap<String, Object> map = this.LIZJ;
                if (map == null) {
                    map = null;
                }
                second.putAll(map);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(first);
                sbLIZ.append('?');
                StringBuilder sb = new StringBuilder();
                second.entrySet();
                for (Map.Entry<String, Object> entry : second.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    sb.append(key);
                    sb.append("=");
                    sb.append(value);
                    sb.append("&");
                }
                String string = sb.toString();
                if (TextUtils.isEmpty(string)) {
                    strSubstring = "";
                } else {
                    strSubstring = string.substring(0, string.length() - 1);
                }
                sbLIZ.append(strSubstring);
                C2188811AlT.LIZIZ(sbLIZ);
                this.LIZIZ = UriProtector.parse(first);
                if (LIZ(context, first, second, LJ())) {
                    ((IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class)).LJLI(LJI());
                    ((IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class)).LJJJJ();
                    ((IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class)).LJJJJZ(2000, LJFF(), "");
                    C10YN.LIZ(c1950707kX);
                    return;
                }
                ((IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class)).LJLI(LJI());
                ((IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class)).LJJJJ();
                ((IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class)).LJJJJZ(3002, LJFF(), "action match but jump fail");
                C10YN.LIZ(c1950707kX);
                return;
            }
            LIZIZ();
        }
    }
}
