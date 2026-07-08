package androidx.webkit;

import android.content.Context;
import androidx.webkit.internal.WebViewFeatureInternal;

/* JADX INFO: loaded from: classes36.dex */
public class WebViewFeature {
    public static final String SAFE_BROWSING_WHITELIST = "SAFE_BROWSING_WHITELIST";

    public static boolean isFeatureSupported(String str) {
        return WebViewFeatureInternal.isSupported(str);
    }

    public static boolean isStartupFeatureSupported(Context context, String str) {
        return WebViewFeatureInternal.isStartupFeatureSupported(str, context);
    }
}
