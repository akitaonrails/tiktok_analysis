package X;

import android.content.Context;
import android.net.Uri;
import android.webkit.SafeBrowsingResponse;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.util.List;

/* JADX INFO: renamed from: X.1B0b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2197831B0b {
    public static Uri LIZIZ() {
        return WebView.getSafeBrowsingPrivacyPolicyUrl();
    }

    public static void LIZ(SafeBrowsingResponse safeBrowsingResponse, boolean z) {
        safeBrowsingResponse.backToSafety(z);
    }

    public static void LIZJ(SafeBrowsingResponse safeBrowsingResponse, boolean z) {
        safeBrowsingResponse.proceed(z);
    }

    public static void LIZLLL(List<String> list, ValueCallback<Boolean> valueCallback) {
        WebView.setSafeBrowsingWhitelist(list, valueCallback);
    }

    public static void LJ(SafeBrowsingResponse safeBrowsingResponse, boolean z) {
        safeBrowsingResponse.showInterstitial(z);
    }

    public static void LJFF(Context context, ValueCallback<Boolean> valueCallback) {
        WebView.startSafeBrowsing(context, valueCallback);
    }
}
