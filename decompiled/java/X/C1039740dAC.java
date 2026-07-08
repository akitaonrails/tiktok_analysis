package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ad.settings.IABPrefetchHTMLSettings;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.LandingPageConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0dAC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1039740dAC {
    public static final /* synthetic */ int LIZ = 0;

    public static Pair LIZ(AwemeRawAd awemeRawAd, String str, boolean z) {
        if (!C1040020dAe.LIZ().supportRedirect) {
            return new Pair(Boolean.FALSE, "SettingsClose");
        }
        if (awemeRawAd == null) {
            return new Pair(Boolean.FALSE, "awemeRawAdNull");
        }
        if (str != null && str.length() != 0) {
            Uri uri = UriProtector.parse(str);
            String scheme = uri.getScheme();
            String lowerCase = null;
            if (scheme != null) {
                lowerCase = scheme.toLowerCase(Locale.getDefault());
            }
            if (TextUtils.isEmpty(lowerCase)) {
                return new Pair(Boolean.FALSE, "schemeEmpty");
            }
            if (!Intrinsics.LJFF(lowerCase, "http") && !Intrinsics.LJFF(lowerCase, "https")) {
                return new Pair(Boolean.FALSE, "notHttp");
            }
            if (Intrinsics.LJFF("about", lowerCase)) {
                return new Pair(Boolean.FALSE, "aboutBlank");
            }
            String path = uri.getPath();
            if (path != null && u.LJIIZILJ(path, ".apk", false)) {
                return new Pair(Boolean.FALSE, "apk");
            }
            if (str != null) {
                List list = ((IABPrefetchHTMLSettings.IABPrefetchHTMLSettingsModel) IABPrefetchHTMLSettings.LIZIZ.getValue()).redirectBlackList;
                if (list == null) {
                    list = C13BV.INSTANCE;
                }
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (a0.LJJIIZI(str, (String) next, false)) {
                        if (next != null) {
                            return new Pair(Boolean.FALSE, "blockUrl");
                        }
                    }
                }
            }
            LandingPageConfig landingPageConfig = awemeRawAd.getLandingPageConfig();
            if (landingPageConfig != null && landingPageConfig.strictUsePureLink) {
                return new Pair(Boolean.FALSE, "strictUsePureLink");
            }
            Boolean boolIsAmazonAd = awemeRawAd.isAmazonAd();
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.LJFF(boolIsAmazonAd, bool)) {
                return new Pair(Boolean.FALSE, "amazonAd");
            }
            String webUrl = awemeRawAd.getWebUrl();
            if (webUrl != null && webUrl.length() != 0) {
                if (!z) {
                    return new Pair(Boolean.FALSE, "notFirstPage");
                }
                return new Pair(bool, "");
            }
            return new Pair(Boolean.FALSE, "webUrlNull");
        }
        return new Pair(Boolean.FALSE, "urlEmpty");
    }
}
