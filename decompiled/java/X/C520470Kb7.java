package X;

import Y.AkS71S1200000_3;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import com.bytedance.android.monitorV2.webview.WebViewMonitorHelper;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.lynx.tasm.LynxView;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Kb7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C520470Kb7 extends AbstractC520490Kb9 {
    public InterfaceC420801kM LLILLL;

    @Override // X.AbstractC1549150qPp, X.InterfaceC1063710dmr
    public final void release() {
        super.release();
        InterfaceC420801kM interfaceC420801kM = this.LLILLL;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
    }

    @Override // X.AbstractC1549150qPp
    public final boolean shouldUseOriginalData(InterfaceC634840OvC interfaceC634840OvC) {
        EnumC1063300dmC enumC1063300dmC;
        C1543410qGZ c1543410qGZLIZJ;
        C1543190qGD c1543190qGD;
        if (interfaceC634840OvC != null && (c1543410qGZLIZJ = interfaceC634840OvC.LIZJ()) != null && (c1543190qGD = c1543410qGZLIZJ.LIZ.LIZ) != null) {
            enumC1063300dmC = c1543190qGD.LJIILJJIL;
        } else {
            enumC1063300dmC = null;
        }
        if (enumC1063300dmC == EnumC1063300dmC.WEB) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, final EnumC1063300dmC enumC1063300dmC) {
        InterfaceC520480Kb8 interfaceC520480Kb8 = (InterfaceC520480Kb8) xBaseParamModel;
        final String url = interfaceC520480Kb8.getUrl();
        final String lowerCase = interfaceC520480Kb8.getMethod().toLowerCase(Locale.US);
        Map<String, Object> headers = interfaceC520480Kb8.getHeaders();
        Map<String, Object> params = interfaceC520480Kb8.getParams();
        if (params != null && !params.isEmpty()) {
            Uri.Builder builderBuildUpon = UriProtector.parse(url).buildUpon();
            for (Map.Entry<String, Object> entry : params.entrySet()) {
                builderBuildUpon.appendQueryParameter(entry.getKey(), C1956407lS.LIZ(entry.getValue()));
            }
            url = builderBuildUpon.build().toString();
        }
        Map<String, Object> data = interfaceC520480Kb8.getData();
        if (data == null) {
            data = C2097608Jq.LJ();
        }
        if (headers == null) {
            headers = new LinkedHashMap<>();
        }
        AbstractC19484711Kz.LJIJJLI(lowerCase).LJJIJIIJI(C11S5.LIZ()).LJIL(new AkS71S1200000_3(url, headers, data, 0)).LJJ(C1701940uOG.LIZIZ()).LIZ(new InterfaceC19474811He<JSONObject>() { // from class: X.0dnn
            @Override // X.InterfaceC19474811He
            public final void onError(Throwable th) {
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                int iLIZ = C2177208fy.LIZ(th);
                this.LL.getClass();
                InterfaceC520510KbB interfaceC520510KbB = (InterfaceC520510KbB) C1549500qQO.LIZ(InterfaceC520510KbB.class);
                interfaceC520510KbB.setCode(0);
                interfaceC520510KbB.setErrorCode(Integer.valueOf(iLIZ));
                interfaceC520510KbB.setErrorMsg(message);
                completionBlock.onFailure(0, message, interfaceC520510KbB);
            }

            @Override // X.InterfaceC19474811He
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                this.LL.LLILLL = interfaceC420801kM;
            }

            @Override // X.InterfaceC19474811He
            public final void onSuccess(JSONObject jSONObject) {
                View view;
                WebView webView;
                LynxView lynxView;
                JSONObject jSONObject2 = jSONObject;
                int i = 0;
                int iOptInt = jSONObject2.optInt("status_code", 0);
                String strOptString = "";
                if (iOptInt != 0) {
                    JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("data");
                    if (jSONObjectOptJSONObject != null) {
                        strOptString = jSONObjectOptJSONObject.optString("prompts");
                        if (TextUtils.isEmpty(strOptString)) {
                            strOptString = jSONObjectOptJSONObject.optString("message");
                        }
                    }
                    EnumC1063300dmC enumC1063300dmC2 = enumC1063300dmC;
                    InterfaceC634840OvC interfaceC634840OvC = this.LL.IBridgeSdkContext;
                    if (interfaceC634840OvC != null) {
                        view = interfaceC634840OvC.getView();
                    } else {
                        view = null;
                    }
                    String str = lowerCase;
                    String str2 = url;
                    int i2 = C1063330dmF.LIZ[enumC1063300dmC2.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2 && (view instanceof LynxView) && (lynxView = (LynxView) view) != null) {
                            C1064310dnp c1064310dnp = new C1064310dnp();
                            c1064310dnp.LJI = str;
                            c1064310dnp.LJII = str2;
                            c1064310dnp.LJIIIIZZ = 200;
                            c1064310dnp.LJIIIZ = 0;
                            c1064310dnp.LJIIJ = null;
                            c1064310dnp.LJIILIIL = iOptInt;
                            c1064310dnp.LJIIL = strOptString;
                            c1064310dnp.LJIIJJI = 1;
                            LynxViewMonitor.Companion.getClass();
                            LynxViewMonitor.INSTANCE.reportJsbFetchError(lynxView, c1064310dnp);
                        }
                    } else if ((view instanceof WebView) && (webView = (WebView) view) != null) {
                        C1064300dno c1064300dno = new C1064300dno();
                        c1064300dno.LIZ = str;
                        c1064300dno.LIZIZ = str2;
                        c1064300dno.LIZJ = 200;
                        c1064300dno.LIZLLL = 0;
                        c1064300dno.LJ = null;
                        c1064300dno.LJI = iOptInt;
                        c1064300dno.LJFF = strOptString;
                        c1064300dno.LJII = 1;
                        WebViewMonitorHelper.getInstance().handleFetchError(webView, c1064300dno);
                    }
                    i = iOptInt;
                }
                this.LL.getClass();
                InterfaceC520510KbB interfaceC520510KbB = (InterfaceC520510KbB) C1909107dp.LIZJ(InterfaceC520510KbB.class, null);
                interfaceC520510KbB.setCode(1);
                C1297550js1.LIZ.getClass();
                interfaceC520510KbB.setRaw(C1297550js1.LIZIZ(jSONObject2));
                interfaceC520510KbB.setErrorCode(Integer.valueOf(i));
                interfaceC520510KbB.setErrorMsg(strOptString);
                completionBlock.onSuccess(interfaceC520510KbB, "");
            }
        });
    }
}
