package X;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0fqe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1142940fqe implements InterfaceC1142900fqa {
    public final ExecutorService LIZ = C786410Ut5.d4(3);

    public static HttpURLConnection LIZ(C1142890fqZ c1142890fqZ, int i) throws IOException {
        String strJ4;
        String str = c1142890fqZ.LIZ;
        HttpURLConnection httpURLConnection = (HttpURLConnection) C2204961BRm.e0(new URL(str), new C0WZX("dzBzEhEpEd/bVhktTASBKG2ialb3bL59Sbmem8sSFQGZWYKUeph7qP+nz8V0Pdnrplmcfm0zMs3ltOx1vBfdl+8I", null));
        long j = c1142890fqZ.LIZIZ;
        if (j > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bytes=");
            sbLIZ.append(j);
            sbLIZ.append("-");
            httpURLConnection.setRequestProperty("range", C2188811AlT.LIZIZ(sbLIZ));
        }
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(5000);
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode >= 200) {
            if (responseCode < 300) {
                return httpURLConnection;
            }
            if (responseCode != 307 && responseCode != 308) {
                switch (responseCode) {
                }
            }
            String headerField = httpURLConnection.getHeaderField("Location");
            httpURLConnection.disconnect();
            if (headerField != null && i > 0) {
                c1142890fqZ.LIZ = headerField;
                LIZ(c1142890fqZ, i - 1);
                return httpURLConnection;
            }
            if (i == 0) {
                strJ4 = C786410Ut5.j4("URL %1$s too many redirects", new Object[]{str});
            } else {
                strJ4 = C786410Ut5.j4("URL %1$s invalid redirect", new Object[]{str});
            }
            throw new IOException(strJ4);
        }
        httpURLConnection.disconnect();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("error response code:");
        sbLIZ2.append(responseCode);
        throw new C1142930fqd(C2188811AlT.LIZIZ(sbLIZ2), responseCode);
    }
}
