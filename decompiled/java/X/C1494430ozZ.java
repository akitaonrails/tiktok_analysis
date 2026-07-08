package X;

import java.net.HttpURLConnection;
import java.net.URI;
import okhttp3.Request;

/* JADX INFO: renamed from: X.0ozZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1494430ozZ extends C1494440oza {
    public static final long serialVersionUID = -7186627969477257933L;
    public final int LL;
    public final String LLILLJJLI;

    public String getErrorResponse() {
        return this.LLILLJJLI;
    }

    public int getStatusCode() {
        return this.LL;
    }

    public static String getPathFromHttpURLConnection(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null && httpURLConnection.getURL() != null && httpURLConnection.getURL().getPath() != null) {
            return httpURLConnection.getURL().getPath();
        }
        return "";
    }

    public static String getPathFromOk3Request(Request request) {
        if (request != null && request.url() != null) {
            return request.url().LJJ().getPath();
        }
        return "";
    }

    public static String getPathFromUrlString(String str) {
        URI uriLJ = C2088908Gh.LJ(str);
        if (uriLJ != null) {
            return uriLJ.getPath();
        }
        return "";
    }

    public C1494430ozZ(int i, String str) {
        super(str);
        this.LL = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1494430ozZ(int i, String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str == null ? "" : str);
        sbLIZ.append(" ");
        sbLIZ.append(str2 == null ? "" : str2);
        super(C2188811AlT.LIZIZ(sbLIZ));
        this.LL = i;
        this.LLILLJJLI = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1494430ozZ(int i, String str, String str2, String str3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str == null ? "" : str);
        sbLIZ.append(" ");
        sbLIZ.append(str2 == null ? "" : str2);
        super(C2188811AlT.LIZIZ(sbLIZ));
        this.LL = i;
        this.LLILLJJLI = str3;
    }
}
