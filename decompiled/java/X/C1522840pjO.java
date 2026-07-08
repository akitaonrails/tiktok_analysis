package X;

import android.webkit.WebResourceResponse;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: renamed from: X.0pjO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1522840pjO {
    public final InputStream LIZ;
    public final Map<String, String> LIZIZ;
    public final boolean LIZJ;

    public final WebResourceResponse LIZ() {
        String strLIZIZ;
        String string;
        Charset charsetLIZ;
        C0X0P c0x0pLIZ = C1522900pjU.LIZ(this.LIZIZ);
        if (c0x0pLIZ == null) {
            strLIZIZ = "text/html";
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c0x0pLIZ.LIZIZ);
            sbLIZ.append('/');
            sbLIZ.append(c0x0pLIZ.LIZJ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (c0x0pLIZ == null || (charsetLIZ = c0x0pLIZ.LIZ(null)) == null || (string = charsetLIZ.toString()) == null) {
            string = "utf-8";
        }
        return new WebResourceResponse(strLIZIZ, string, 200, "success", this.LIZIZ, this.LIZ);
    }

    public C1522840pjO(InputStream inputStream, Map<String, String> map, boolean z) {
        this.LIZ = inputStream;
        this.LIZIZ = map;
        this.LIZJ = z;
    }
}
