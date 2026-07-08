package X;

import android.net.Uri;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0X7W, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X7W extends C0X7V {
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ int LIZIZ;

    public C0X7W(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }

    @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
    public final String LJFF(Uri uri, WebView webView) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        int i = this.LIZ;
        int i2 = this.LIZIZ;
        jSONObject.put("count", i);
        jSONObject.put("is_success", i2);
        return C786410Ut5.J3(jSONObject);
    }
}
