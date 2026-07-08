package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0WR3, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WR3 {
    public static boolean LIZ(String str) {
        if (LIZJ(str)) {
            Uri uri = UriProtector.parse(str);
            C19259110Wf c19259110Wf = C746350TPl.LIZ;
            if (c19259110Wf.LJIILJJIL == null) {
                c19259110Wf.LJIILJJIL = new C2230608oa<>("share_url_short_white_list", new HashSet());
            }
            Set<String> setLIZ = c19259110Wf.LJIILJJIL.LIZ();
            if (setLIZ.isEmpty()) {
                IDeepLinkService iDeepLinkService = (IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class);
                if (C841040Wz0.LIZ.contains(uri.getHost()) || iDeepLinkService.LJJZZI(uri) || iDeepLinkService.LJJLIL(uri.getHost(), uri.getPath())) {
                    return true;
                }
                return false;
            }
            return setLIZ.contains(uri.getHost());
        }
        return false;
    }

    public static boolean LIZIZ(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("ttschema://view_grade_resource")) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(String str) {
        if (str == null) {
            return false;
        }
        return PatternProtector.compile("(https?|http)://[-A-Za-z0-9+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]").matcher(str).find();
    }
}
