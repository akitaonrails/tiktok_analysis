package X;

import android.net.Uri;
import android.webkit.WebView;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pjI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1522780pjI {
    public static final CopyOnWriteArrayList<InterfaceC1522790pjJ> LJIIJ = new CopyOnWriteArrayList<>();
    public String LIZ;
    public C1522860pjQ LIZIZ;
    public Long LIZJ;
    public Long LIZLLL;
    public Long LJ;
    public Long LJFF;
    public Long LJI;
    public Boolean LJII;
    public Long LJIIIIZZ;
    public String LJIIIZ;

    public final JSONObject LIZIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("request_duration", this.LIZJ);
        jSONObject.put("image_size", this.LIZLLL);
        jSONObject.put("read_response_duration", this.LJ);
        jSONObject.put("decode_duration", this.LJFF);
        jSONObject.put("compress_duration", this.LJI);
        jSONObject.put("duration", this.LJIIIIZZ);
        return jSONObject;
    }

    public final String toString() {
        return C786410Ut5.J3(LIZIZ());
    }

    public final void LIZ(JSONObject jSONObject) throws JSONException {
        String str;
        Object c098200Yq;
        jSONObject.put("image_type", this.LJIIIZ);
        C1522860pjQ c1522860pjQ = this.LIZIZ;
        if (c1522860pjQ != null && (str = c1522860pjQ.LJ) != null) {
            jSONObject.put("image_url", str);
            jSONObject.put("url", this.LIZ);
            try {
                c098200Yq = UriProtector.parse(str);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            Uri uri = (Uri) c098200Yq;
            if (uri != null) {
                Object objLIZIZ = C1942307jB.LIZIZ(uri, "biz_tag");
                Object objLIZIZ2 = C1942307jB.LIZIZ(uri, "scene_tag");
                jSONObject.put("biz_tag", objLIZIZ);
                jSONObject.put("scene_tag", objLIZIZ2);
            }
        }
    }

    public final void LIZLLL(WebView webView, String str) throws JSONException {
        String str2;
        WebKitView webKitView;
        C1537480q70 hybridContext;
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("type: success, metrics: ");
        sbLIZ.append(this);
        sbLIZ.append(", Uri: ");
        sbLIZ.append(str);
        sbLIZ.append(", isSuperResponse = ");
        sbLIZ.append(this.LJII);
        c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.I, "ImageExtExtension_Metric");
        if (!(webView instanceof WebKitView) || (webKitView = (WebKitView) webView) == null || (hybridContext = webKitView.getHybridContext()) == null || (str2 = hybridContext.bid) == null) {
            str2 = "hybridkit_default_bid";
        }
        C1520200pf8 c1520200pf8 = C1520200pf8.LIZ;
        C1520360pfO c1520360pfO = new C1520360pfO("hybrid_web_image_metrics");
        c1520360pfO.LIZIZ = str2;
        c1520360pfO.LIZ = str;
        c1520360pfO.LJ = LIZIZ();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", 1);
        jSONObject.put("is_super_response", this.LJII);
        LIZ(jSONObject);
        c1520360pfO.LIZLLL = jSONObject;
        c1520360pfO.LJIIJJI = EnumC993170bx5.Tea;
        C1520350pfN c1520350pfNLIZ = c1520360pfO.LIZ();
        c1520200pf8.getClass();
        C1520200pf8.LIZ(c1520350pfNLIZ);
        Iterator<InterfaceC1522790pjJ> it2 = LJIIJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(true, str, this.LIZLLL, this.LIZJ, this.LJ, this.LJFF, this.LJI, this.LJIIIIZZ, null);
        }
    }

    public static void LIZJ(C1522780pjI c1522780pjI, WebView webView, String str, EnumC1522810pjL enumC1522810pjL) throws JSONException {
        String str2;
        WebKitView webKitView;
        C1537480q70 hybridContext;
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("type: failed, error: ");
        sbLIZ.append(enumC1522810pjL.name());
        sbLIZ.append(", metrics: ");
        sbLIZ.append(c1522780pjI);
        sbLIZ.append(", Uri: ");
        sbLIZ.append(str);
        sbLIZ.append(", isSuperResponse = ");
        sbLIZ.append(c1522780pjI.LJII);
        c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.I, "ImageExtExtension_Metric");
        if (!(webView instanceof WebKitView) || (webKitView = (WebKitView) webView) == null || (hybridContext = webKitView.getHybridContext()) == null || (str2 = hybridContext.bid) == null) {
            str2 = "hybridkit_default_bid";
        }
        C1520200pf8 c1520200pf8 = C1520200pf8.LIZ;
        C1520360pfO c1520360pfO = new C1520360pfO("hybrid_web_image_metrics");
        c1520360pfO.LIZIZ = str2;
        c1520360pfO.LIZ = str;
        c1520360pfO.LJ = c1522780pjI.LIZIZ();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", 0);
        jSONObject.put("is_super_response", c1522780pjI.LJII);
        jSONObject.put("error_code", enumC1522810pjL.getCode());
        jSONObject.put("error_msg", enumC1522810pjL.name());
        c1522780pjI.LIZ(jSONObject);
        c1520360pfO.LIZLLL = jSONObject;
        c1520360pfO.LJIIJJI = EnumC993170bx5.Tea;
        C1520350pfN c1520350pfNLIZ = c1520360pfO.LIZ();
        c1520200pf8.getClass();
        C1520200pf8.LIZ(c1520350pfNLIZ);
        Iterator<InterfaceC1522790pjJ> it2 = LJIIJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(false, str, c1522780pjI.LIZLLL, c1522780pjI.LIZJ, c1522780pjI.LJ, c1522780pjI.LJFF, c1522780pjI.LJI, c1522780pjI.LJIIIIZZ, enumC1522810pjL);
        }
    }
}
