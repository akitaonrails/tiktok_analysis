package X;

import android.webkit.WebView;
import com.bytedance.android.monitorV2.webview.WebViewMonitorHelper;
import com.lynx.tasm.LynxView;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0qHQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1543940qHQ {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public WebView LIZLLL;
    public LynxView LJ;
    public boolean LJII;
    public long LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public long LJIILL;
    public long LJIILLIIL;
    public long LJIIZILJ;
    public long LJIJ;
    public long LJIJI;
    public long LJIJJ;
    public long LJIJJLI;
    public long LJIL;
    public int LJJI;
    public String LJFF = "";
    public String LJI = "";
    public String LJIIIIZZ = "";
    public Integer LJJ = 0;

    public final HashMap<String, Object> LIZ() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("jsb_module_name", "bridge");
        map.put("jsb_method_name", "call");
        map.put("jsb_name", this.LIZ);
        map.put("jsb_protocol_version", Integer.valueOf(this.LIZIZ));
        map.put("jsb_bridgesdk", this.LIZJ);
        Integer num = this.LJJ;
        if (num != null) {
            map.put("jsb_status_code", Integer.valueOf(num.intValue()));
        }
        map.put("jsb_call_from", Integer.valueOf(this.LJJI));
        return map;
    }

    public final void LIZIZ() {
        WebView webView = this.LIZLLL;
        if (webView != null) {
            WebViewMonitorHelper.getInstance().handleJSBPvV2(webView, LIZ());
        }
    }

    public C1543940qHQ(String str, String str2, String str3, int i, String str4) {
        this.LIZ = str3;
        this.LIZIZ = i;
        this.LIZJ = str4;
    }
}
