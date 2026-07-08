package X;

import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.security.web_js.api.IJSInjectCallback$ErrorCode;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS31S0000100_16;
import kotlin.jvm.internal.AwS50S0100100_16;
import kotlin.jvm.internal.AwS6S1000100_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dAn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1040110dAn implements InterfaceC497601wk {
    public static final C1040110dAn LL = new C1040110dAn();
    public static final CoroutineContext LLILLJJLI = C0PEM.LIZJ.plus(C2296908zH.LIZ());
    public static final ConcurrentHashMap<String, String> LLILLL = new ConcurrentHashMap<>();
    public static final C01GW LLILZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(566));
    public static final C1040120dAo LLILZIL = new C1040120dAo();

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return LLILLJJLI;
    }

    public static void LIZIZ(AwemeRawAd awemeRawAd, String str) {
        C1040120dAo c1040120dAo = LLILZIL;
        synchronized (c1040120dAo) {
            if (awemeRawAd == null) {
                return;
            }
            Collection<C1039830dAL> collectionValues = c1040120dAo.LIZ.values();
            ArrayList<C1039830dAL> arrayList = new ArrayList();
            for (Object obj : collectionValues) {
                C1039830dAL c1039830dAL = (C1039830dAL) obj;
                if (!c1039830dAL.LJ && Intrinsics.LJFF(c1039830dAL.LIZ.get(), awemeRawAd) && (c1039830dAL.LIZIZ || c1039830dAL.LIZJ)) {
                    arrayList.add(obj);
                }
            }
            for (C1039830dAL c1039830dAL2 : arrayList) {
                c1039830dAL2.LIZLLL = str;
                c1039830dAL2.LJ = true;
                c1040120dAo.LJI(c1039830dAL2);
            }
        }
    }

    public static void LIZ(final long j, WebView webView, final AwemeRawAd awemeRawAd, final String str) {
        LLILZIL.LJFF(j);
        try {
            if (!C1035800d3q.LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("window.__autoFillCallback__(");
                sbLIZ.append(str);
                sbLIZ.append(",true)");
                webView.evaluateJavascript(C2188811AlT.LIZIZ(sbLIZ), new ValueCallback() { // from class: X.0dAp
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        C1040180dAu c1040180dAu;
                        String strLIZIZ;
                        boolean z;
                        String str2 = (String) obj;
                        C1040110dAn c1040110dAn = C1040110dAn.LL;
                        boolean z2 = true;
                        if (str2 != null && str2.length() != 0) {
                            try {
                                JSONObject jSONObject = new JSONObject(str2);
                                boolean zOptBoolean = jSONObject.optBoolean("success", false);
                                String strOptString = jSONObject.optString("error_msg", "");
                                if (zOptBoolean) {
                                    c1040180dAu = new C1040180dAu(true, "", "");
                                } else {
                                    if (strOptString.length() <= 0) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (!z) {
                                        strOptString = "js_callback_error";
                                    }
                                    c1040180dAu = new C1040180dAu(false, "js_callback_error", strOptString);
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                String strLJZL = C13LN.LJZL(100, str2);
                                if (strLJZL.length() <= 0) {
                                    z2 = false;
                                }
                                if (!z2) {
                                    strLIZIZ = "parse_failed";
                                } else {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("parse_error: ");
                                    sbLIZ2.append(strLJZL);
                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                }
                                c1040180dAu = new C1040180dAu(false, "parse_failed", strLIZIZ);
                            }
                        } else {
                            c1040180dAu = new C1040180dAu(false, "empty_result", "empty_result");
                        }
                        C1040120dAo c1040120dAo = C1040110dAn.LLILZIL;
                        c1040120dAo.LJ(j);
                        new C1040460dBM(new Object[0]).logAd(C1040450dBL.LIZ, awemeRawAd, new AwS50S0100100_16(c1040180dAu, j, 12));
                        c1040120dAo.LIZLLL(j);
                    }
                });
                return;
            }
            C1544770qIl.LIZ(webView, new AbstractC1043220dFo() { // from class: X.0dAq
                @Override // X.AbstractC1544900qIy
                public final void LJIIIIZZ(IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode) {
                    C1040120dAo c1040120dAo = C1040110dAn.LLILZIL;
                    c1040120dAo.LJ(j);
                    new C1040460dBM(new Object[0]).logAd(C1040450dBL.LIZ, awemeRawAd, new AwS50S0100100_16(iJSInjectCallback$ErrorCode, j, 13));
                    c1040120dAo.LIZLLL(j);
                }

                @Override // X.AbstractC1544900qIy
                public final void LJIIJJI(Object obj) {
                    C1040120dAo c1040120dAo = C1040110dAn.LLILZIL;
                    c1040120dAo.LJ(j);
                    new C1040460dBM(new Object[0]).logAd(C1040450dBL.LIZ, awemeRawAd, new AwS31S0000100_16(j, 29));
                    c1040120dAo.LIZLLL(j);
                }

                @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
                public final String LJFF(Uri uri, WebView webView2) {
                    return str;
                }

                @Override // X.AbstractC1544900qIy
                public final void LJIIJ(int i, Object obj, String str2) {
                    C1040120dAo c1040120dAo = C1040110dAn.LLILZIL;
                    c1040120dAo.LJ(j);
                    if (str2.length() <= 0) {
                        str2 = "js_callback_error";
                    }
                    new C1040460dBM(new Object[0]).logAd(C1040450dBL.LIZ, awemeRawAd, new C1040430dBJ(i, str2, j));
                    c1040120dAo.LIZLLL(j);
                }
            });
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1040120dAo c1040120dAo = LLILZIL;
            c1040120dAo.LJ(j);
            String message = th.getMessage();
            if (message == null) {
                message = "unknown_error";
            }
            new C1040460dBM(new Object[0]).logAd(C1040450dBL.LIZ, awemeRawAd, new AwS6S1000100_16(message, j, 1));
            c1040120dAo.LIZLLL(j);
        }
    }
}
