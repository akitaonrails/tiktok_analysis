package X;

import android.net.ProxyInfo;
import android.net.Uri;

/* JADX INFO: renamed from: X.0UuO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C787220UuO {
    public static final C787220UuO LJ = new C787220UuO(0, "", "", new String[0]);
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String[] LIZLLL;

    public static C787220UuO LIZ(ProxyInfo proxyInfo) {
        String string = null;
        if (proxyInfo == null) {
            return null;
        }
        String host = proxyInfo.getHost();
        Uri pacFileUrl = proxyInfo.getPacFileUrl();
        if (host == null) {
            host = "";
        }
        int port = proxyInfo.getPort();
        if (!Uri.EMPTY.equals(pacFileUrl)) {
            string = pacFileUrl.toString();
        }
        return new C787220UuO(port, host, string, proxyInfo.getExclusionList());
    }

    public C787220UuO(int i, String str, String str2, String[] strArr) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
        this.LIZLLL = strArr;
    }
}
