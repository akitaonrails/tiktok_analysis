package X;

import android.net.Uri;
import android.webkit.WebResourceRequest;

/* JADX INFO: renamed from: X.1BHm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2202361BHm {
    public static Uri LIZ(WebResourceRequest webResourceRequest) {
        return webResourceRequest.getUrl();
    }

    public static boolean LIZIZ(WebResourceRequest webResourceRequest) {
        return webResourceRequest.isForMainFrame();
    }
}
