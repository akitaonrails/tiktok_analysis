package X;

import android.net.Uri;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.13qi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20137013qi implements InterfaceC20137113qj {
    public static final C20137013qi LIZ = new C20137013qi();
    public static final int LIZIZ;
    public static final int LIZJ;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LIZIZ = (int) timeUnit.toMillis(15L);
        LIZJ = (int) timeUnit.toMillis(10L);
    }

    public static final HttpURLConnection LIZ(Uri uri) {
        C20137213qk.LIZJ(uri, "url must not be null");
        C20137213qk.LIZ("only https connections are permitted", "https".equals(uri.getScheme()));
        HttpURLConnection httpURLConnection = (HttpURLConnection) C2204961BRm.e0(new URL(uri.toString()), new C0WZX("ejpqEg0qWsTVURkgVQKFcwd7GtRoEQ7sEu04+AgE5Y3POBl3zuRi81Zc9cQLr6suef1FtQ/MP+0=", new String[]{"01b09"}));
        httpURLConnection.setConnectTimeout(LIZIZ);
        httpURLConnection.setReadTimeout(LIZJ);
        httpURLConnection.setInstanceFollowRedirects(false);
        return httpURLConnection;
    }
}
