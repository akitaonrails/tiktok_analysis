package X;

import Y.AComparatorS32S0000000_13;
import Y.AComparatorS512S0100000_13;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pumbaa.hybrid.governance.api.BaseGovernanceModel;
import com.bytedance.pumbaa.hybrid.governance.jsb.IframeItem;
import com.bytedance.pumbaa.hybrid.governance.jsb.PnsJsbIframeAllowlistModel;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WMG, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WMG extends C0WMA<C0WMM> {
    public final List<C0WMM> LIZ = new ArrayList();

    public C0WMG() {
        for (C0WN6 c0wn6 : Collections.singletonList(new C0WMM() { // from class: X.0WN6
            @Override // X.C0WMB
            public final C0WMF LIZLLL() {
                return new C0WMF("JSBridgeIFrameAction", C0WN8.JSBridge, C0WNE.L3, 0, 24);
            }

            @Override // X.C0WMB
            public final BaseGovernanceModel LIZIZ() {
                return C1589206Kc.LIZ();
            }

            @Override // X.C0WMB
            public final C0WM1 LJ(C0WMD c0wmd) throws JSONException {
                C0WNA c0wna;
                Object objLIZ = c0wmd.LIZ();
                if (!(objLIZ instanceof C0WNA) || (c0wna = (C0WNA) objLIZ) == null) {
                    return null;
                }
                PnsJsbIframeAllowlistModel pnsJsbIframeAllowlistModelLIZ = C1589206Kc.LIZ();
                if (!pnsJsbIframeAllowlistModelLIZ.enable) {
                    return null;
                }
                String str = c0wna.LIZ;
                String str2 = c0wna.LIZIZ;
                if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
                    return null;
                }
                String str3 = c0wna.LIZJ;
                if (str3 != null && str3.length() != 0 && pnsJsbIframeAllowlistModelLIZ.jsbList.contains(str3)) {
                    return null;
                }
                List<IframeItem> list = pnsJsbIframeAllowlistModelLIZ.allowList;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (IframeItem iframeItem : list) {
                        if (iframeItem.mainframe.length() > 0 && iframeItem.iframe.length() > 0 && a0.LJJIIZI(str, iframeItem.mainframe, false) && a0.LJJIIZI(str2, iframeItem.iframe, false)) {
                            return null;
                        }
                    }
                }
                Uri uri = UriProtector.parse(str2);
                Uri uri2 = UriProtector.parse(str);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Scene.SCENE_SERVICE, "iframe_jsb");
                jSONObject.put("method", str3);
                jSONObject.put("host", uri.getHost());
                jSONObject.put("path", uri.getPath());
                jSONObject.put("url", str2);
                jSONObject.put("web_url", str);
                jSONObject.put("web_host", uri2.getHost());
                jSONObject.put("blocked", pnsJsbIframeAllowlistModelLIZ.blockEnable ? 1 : 0);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("JSB", str3);
                jSONObject2.put("iframeUrl", str2);
                jSONObject2.put("mainFrameUrl", str);
                boolean z = pnsJsbIframeAllowlistModelLIZ.blockEnable;
                C822060WMq.LIZ(this, z);
                if (z) {
                    return new C0WM1(true, jSONObject, jSONObject2, new C821850WLv(true, C2097908Jt.LIZJ(new Pair("error", new C821880WLy(101, "can not invoke JSB in iframe")))));
                }
                return new C0WM1(false, jSONObject, jSONObject2, null);
            }
        })) {
            C0WMA.LIZJ(c0wn6);
            ((ArrayList) this.LIZ).add(c0wn6);
            C08XD.LJJ(this.LIZ, new AComparatorS512S0100000_13(new AComparatorS32S0000000_13(29), 4));
        }
    }

    @Override // X.C0WMA
    public final List<C0WMM> LIZIZ(C0WMD c0wmd) {
        return C13LP.LLIIII(this.LIZ);
    }
}
