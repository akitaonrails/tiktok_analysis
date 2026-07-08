package X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qHI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1543860qHI extends AbstractC1543840qHG implements InterfaceC1055850daB {
    public final C1543190qGD LIZLLL;
    public final String LJ;

    @Override // X.InterfaceC1055850daB
    public final void LIZLLL(String str) {
    }

    @Override // X.AbstractC1543840qHG
    public final String LJIILJJIL() {
        return "ToutiaoJSBridge";
    }

    @Override // X.AbstractC1543840qHG
    public final void LJIILLIIL(String str, JSONObject jSONObject) {
    }

    @Override // X.InterfaceC1055850daB
    public final void onDestroy() {
    }

    @Override // X.AbstractC1543840qHG, X.AbstractC1543580qGq
    public final void LJIIIIZZ() {
        InterfaceC1544190qHp interfaceC1544190qHp = this.LIZ.LJ;
        if (interfaceC1544190qHp != null) {
            interfaceC1544190qHp.LJ(this);
        }
    }

    public C1543860qHI(C1543190qGD c1543190qGD) {
        super(c1543190qGD);
        this.LIZLLL = c1543190qGD;
        this.LJ = "bytedance";
    }

    @Override // X.InterfaceC1055850daB
    public final boolean LIZIZ(String str) {
        String lowerCase;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.LJ)) {
            String scheme = UriProtector.parse(str).getScheme();
            if (scheme != null) {
                lowerCase = scheme.toLowerCase(Locale.ROOT);
            } else {
                lowerCase = null;
            }
            if (Intrinsics.LJFF(this.LJ, lowerCase) && LJIJ(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1055850daB
    public final void LIZJ(String str) {
        LJIJ(str);
    }

    @Override // X.AbstractC1543840qHG
    public final C1543910qHN LJIIL(String str) {
        String url;
        C1543910qHN c1543910qHN = new C1543910qHN(this.LIZLLL);
        try {
            JSONObject jSONObject = new JSONObject(str);
            c1543910qHN.LJII = JSONObjectProtectorUtils.getString(jSONObject, "__msg_type");
            c1543910qHN.LJ = jSONObject.optString("__callback_id", null);
            c1543910qHN.LJFF = jSONObject.optString("func");
            c1543910qHN.LJIIIIZZ = jSONObject.opt("params");
            c1543910qHN.LJIIIZ = jSONObject.optString("JSSDK");
            c1543910qHN.LJIIL = jSONObject.optLong("__timestamp", System.currentTimeMillis());
            c1543910qHN.LJIIJ = jSONObject.optString("namespace");
            c1543910qHN.LJIIJJI = jSONObject.optString("__iframe_url");
            c1543910qHN.LJIILIIL = str;
            c1543910qHN.LJIILJJIL = jSONObject.optString("token");
            InterfaceC1544190qHp interfaceC1544190qHp = this.LIZIZ;
            if (interfaceC1544190qHp == null || (url = interfaceC1544190qHp.getUrl()) == null) {
                url = "";
            }
            c1543910qHN.LJI = url;
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("parseMsQueue:");
            sbLIZ.append(C786410Ut5.u3());
            C2188811AlT.LIZIZ(sbLIZ);
            InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
            c1543910qHN.LJIJ = EnumC1543740qH6.Web;
            String strOptString = jSONObject.optString("secure_token");
            if (strOptString != null && strOptString.length() != 0) {
                c1543910qHN.LIZIZ = jSONObject.optString("secure_token");
            } else {
                Object obj = c1543910qHN.LJIIIIZZ;
                if (obj instanceof JSONObject) {
                    c1543910qHN.LIZIZ = ((JSONObject) obj).optString("_jsb_secure_token");
                }
            }
            c1543910qHN.LJJIJLIJ = jSONObject;
            return c1543910qHN;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c1543910qHN.LJJIJIL = false;
            return c1543910qHN;
        }
    }

    public final boolean LJIJ(String str) {
        C0X7Q c0x7q;
        final String url;
        if (!u.LJJIIJZLJL(str, this.LJ, false)) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJ);
        sbLIZ.append("://dispatch_message/");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LJ);
        sbLIZ2.append("://private/setresult/");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        try {
            InterfaceC1544190qHp interfaceC1544190qHp = this.LIZIZ;
            c0x7q = null;
            if (interfaceC1544190qHp != null) {
                url = interfaceC1544190qHp.getUrl();
            } else {
                url = null;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (str.equals(strLIZIZ)) {
            if (C1544000qHW.LJIIIIZZ) {
                c0x7q = new C0X7Q(url) { // from class: X.0qI7
                    @Override // X.AbstractC1544900qIy
                    public final void LJIIJJI(Object obj) {
                        this.LIZ.LJIJJ(String.valueOf(obj));
                    }
                };
            }
            ValueCallback<String> valueCallback = new ValueCallback(url) { // from class: X.0qHx
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    this.LIZ.LJIJJ((String) obj);
                }
            };
            InterfaceC1544190qHp interfaceC1544190qHp2 = this.LIZIZ;
            if (interfaceC1544190qHp2 == null) {
                return true;
            }
            interfaceC1544190qHp2.LJII("javascript:ToutiaoJSBridge._fetchQueue()", valueCallback, c0x7q);
            return true;
        }
        if (!u.LJJIIJZLJL(str, strLIZIZ2, false)) {
            return false;
        }
        return true;
    }

    public final void LJIJJ(String str) {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("{a=");
            sbLIZ.append(str);
            sbLIZ.append('}');
            LJIJJLI(new JSONObject(C2188811AlT.LIZIZ(sbLIZ)).optString("a", ""));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("parseJsonValueEncodedMsgQueue failed, exception == ");
            sbLIZ2.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ2);
            InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
        }
    }

    public final void LJIJJLI(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                LJIILL(C786410Ut5.J3(JSONArrayProtectorUtils.getJSONObject(jSONArray, i)), 1, null);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static JSONObject LJIJI(C1543910qHN c1543910qHN, C1543440qGc c1543440qGc) throws JSONException {
        String str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("__msg_type", "callback");
        if (c1543910qHN != null) {
            str = c1543910qHN.LJ;
        } else {
            str = null;
        }
        jSONObject.put("__callback_id", str);
        jSONObject.put("__params", c1543440qGc.LIZJ(c1543910qHN));
        return jSONObject;
    }

    @Override // X.AbstractC1543840qHG
    public final Pair<String, AbstractC1544900qIy> LJIILIIL(final C1543910qHN c1543910qHN, C1543440qGc c1543440qGc) throws JSONException {
        byte[] bytes;
        Object obj = null;
        if (!TextUtils.isEmpty(c1543910qHN.LJIIJJI)) {
            final JSONObject jSONObjectLJIJI = LJIJI(c1543910qHN, c1543440qGc);
            String str = c1543910qHN.LJIIJJI;
            if (str != null) {
                bytes = str.getBytes(Charsets.UTF_8);
            } else {
                bytes = null;
            }
            final String strEncodeToString = Base64.encodeToString(bytes, 2);
            final String strEncodeToString2 = Base64.encodeToString(C786410Ut5.j4("iframe[src=\"%s\"", Arrays.copyOf(new Object[]{str}, 1)).getBytes(Charsets.UTF_8), 2);
            String strJ4 = C786410Ut5.j4("javascript:(function(){   const iframe = document.querySelector(atob('%s'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, atob('%s'));   }})()", Arrays.copyOf(new Object[]{strEncodeToString2, C786410Ut5.J3(jSONObjectLJIJI), strEncodeToString}, 3));
            if (C1544000qHW.LJI) {
                obj = new C0X8W() { // from class: X.0X8X
                    @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
                    public final String LJFF(Uri uri, WebView webView) throws JSONException {
                        JSONObject jSONObject = new JSONObject();
                        String str2 = strEncodeToString2;
                        JSONObject jSONObject2 = jSONObjectLJIJI;
                        String str3 = strEncodeToString;
                        jSONObject.put("query", str2);
                        jSONObject.put("data", C786410Ut5.J3(jSONObject2));
                        jSONObject.put("encodeIFrameUrl", str3);
                        return C786410Ut5.J3(jSONObject);
                    }
                };
            }
            return new Pair<>(strJ4, obj);
        }
        final JSONObject jSONObjectLJIJI2 = LJIJI(c1543910qHN, c1543440qGc);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("javascript:window.");
        sbLIZ.append("ToutiaoJSBridge");
        sbLIZ.append(" && ");
        sbLIZ.append("ToutiaoJSBridge");
        sbLIZ.append("._handleMessageFromToutiao && ");
        sbLIZ.append("ToutiaoJSBridge");
        sbLIZ.append("._handleMessageFromToutiao(");
        sbLIZ.append(jSONObjectLJIJI2);
        sbLIZ.append(')');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (C1544000qHW.LJII) {
            obj = new C0X8V() { // from class: X.0qHa
                @Override // X.AbstractC1544900qIy
                public final void LJIIJJI(Object obj2) {
                    C1543910qHN c1543910qHN2 = c1543910qHN;
                    if (c1543910qHN2 != null) {
                        c1543910qHN2.LJJIJ = String.valueOf(obj2);
                        C1543190qGD c1543190qGD = this.LIZ.LIZ;
                        c1543190qGD.LIZLLL.LIZLLL(c1543190qGD, c1543910qHN);
                    }
                }

                @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
                public final String LJFF(Uri uri, WebView webView) throws JSONException {
                    JSONObject jSONObject = new JSONObject();
                    C1543860qHI c1543860qHI = this.LIZ;
                    JSONObject jSONObject2 = jSONObjectLJIJI2;
                    c1543860qHI.getClass();
                    jSONObject.put("objName", "ToutiaoJSBridge");
                    jSONObject.put("objFunc", "_handleMessageFromToutiao");
                    jSONObject.put("params", jSONObject2);
                    return C786410Ut5.J3(jSONObject);
                }

                @Override // X.AbstractC1544900qIy
                public final void LJIIJ(int i, Object obj2, String str2) {
                    C1543910qHN c1543910qHN2 = c1543910qHN;
                    if (c1543910qHN2 != null) {
                        c1543910qHN2.LJJIJ = String.valueOf(obj2);
                        C1543190qGD c1543190qGD = this.LIZ.LIZ;
                        c1543190qGD.LIZLLL.LIZLLL(c1543190qGD, c1543910qHN);
                    }
                }
            };
        }
        return new Pair<>(strLIZIZ, obj);
    }
}
