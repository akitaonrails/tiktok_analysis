package X;

import android.webkit.WebSettings;
import androidx.webkit.internal.WebViewFeatureInternal;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: renamed from: X.1Dny, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2266801Dny {
    public static void LIZ(WebSettings webSettings) {
        C2266721Dnq c2266721Dnq = WebViewFeatureInternal.SAFE_BROWSING_ENABLE;
        if (c2266721Dnq.LIZIZ()) {
            C800500Vai.LJ(webSettings, false);
        } else {
            if (c2266721Dnq.LIZJ()) {
                C085J c085j = C085G.LIZ;
                c085j.getClass();
                ((WebSettingsBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebSettingsBoundaryInterface.class, c085j.LIZ.convertSettings(webSettings))).setSafeBrowsingEnabled(false);
                return;
            }
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }
}
