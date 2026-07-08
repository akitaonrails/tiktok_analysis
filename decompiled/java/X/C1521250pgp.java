package X;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pgp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1521250pgp {
    public String[] LIZ;
    public String[] LIZIZ;
    public InterfaceC1520860pgC LIZJ;
    public String LJI;
    public InterfaceC1521890phr LJII;
    public String LIZLLL = "";
    public boolean LJ = true;
    public String LJFF = "";
    public JSONObject LJIIIIZZ = new JSONObject();
    public String LJIIIZ = "";
    public String LJIIJ = "";

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Config{mWebViewClasses=");
        sbLIZ.append(Arrays.toString(this.LIZ));
        sbLIZ.append(", mWebViewObjKeys=");
        sbLIZ.append(Arrays.toString(this.LIZIZ));
        sbLIZ.append(", mBid='");
        sbLIZ.append(this.LJFF);
        sbLIZ.append('\'');
        sbLIZ.append(", virtualAid='");
        sbLIZ.append(this.LJI);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ(WebView... webViewArr) {
        if (webViewArr.length > 0) {
            ArrayList arrayList = new ArrayList();
            for (WebView webView : webViewArr) {
                if (webView != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(webView.hashCode());
                    sbLIZ.append("");
                    arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            this.LIZIZ = (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
    }
}
