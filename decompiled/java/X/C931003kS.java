package X;

import Y.ARunnableS34S0300000_1;
import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.bytedance.android.ecommerce.core.QueryOrderManager;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.u;
import oo5.b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03kS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C931003kS {
    public final AtomicBoolean LIZ = new AtomicBoolean(false);
    public volatile QueryOrderManager LIZIZ = null;
    public final Object LIZJ = new Object();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final AbstractC1724310uyL LJ(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -2097869193:
                if (!str.equals("pipo.executeRiskJS")) {
                    return null;
                }
                return new AbstractC1724310uyL() { // from class: X.0uxo
                    @Override // X.AbstractC1724310uyL
                    public final String LJI() {
                        return "pipo.executeRiskJS";
                    }

                    /* JADX WARN: Type inference failed for: r1v4, types: [X.0v0e] */
                    @Override // X.AbstractC1724310uyL, X.InterfaceC1063690dmp
                    public final void LIZIZ(InterfaceC1107590evd interfaceC1107590evd, InterfaceC1063920dnC interfaceC1063920dnC, EnumC1059790dgX enumC1059790dgX) {
                        String string;
                        super.LIZIZ(interfaceC1107590evd, interfaceC1063920dnC, enumC1059790dgX);
                        if (interfaceC1107590evd.hasKey("session_id")) {
                            string = interfaceC1107590evd.getString("session_id");
                        } else {
                            string = "";
                        }
                        if (interfaceC1107590evd.hasKey("merchant_id")) {
                            interfaceC1107590evd.getString("merchant_id");
                        }
                        if (interfaceC1107590evd.hasKey("org_id")) {
                            interfaceC1107590evd.getString("org_id");
                        }
                        if (TextUtils.isEmpty(string)) {
                            C1723950uxl.LIZLLL("pipo.executeRiskJS", "sessionId is null!", interfaceC1063920dnC);
                            return;
                        }
                        try {
                            C1724150uy5 c1724150uy5 = C1724150uy5.LJIIL;
                            if (c1724150uy5.LJII == null) {
                                synchronized (c1724150uy5) {
                                    try {
                                        if (c1724150uy5.LJII == null) {
                                            final Application application = c1724150uy5.LIZ.LIZ;
                                            c1724150uy5.LJII = new Object(application) { // from class: X.0v0e
                                                public final Context LIZ;
                                                public final C1725750v0f LIZIZ = new WebChromeClient() { // from class: X.0v0f
                                                    @Override // android.webkit.WebChromeClient
                                                    public final void onProgressChanged(WebView webView, int i) {
                                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                        sbLIZ.append("risk js execute progress is: ");
                                                        sbLIZ.append(i);
                                                        C2188811AlT.LIZIZ(sbLIZ);
                                                    }
                                                };

                                                /* JADX WARN: Type inference failed for: r0v0, types: [X.0v0f] */
                                                {
                                                    this.LIZ = application;
                                                }

                                                public final String LIZ(String str2) {
                                                    try {
                                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                        sbLIZ.append("executeRiskJsCode with orgId:");
                                                        sbLIZ.append("k8vif92e");
                                                        sbLIZ.append(" merchantId:");
                                                        sbLIZ.append("bytedance");
                                                        sbLIZ.append(" merchantIdTTP:");
                                                        sbLIZ.append("pipo_us");
                                                        sbLIZ.append(" sessionID:");
                                                        sbLIZ.append(str2);
                                                        C2188811AlT.LIZIZ(sbLIZ);
                                                        WebView webView = new WebView(this.LIZ);
                                                        webView.getSettings().setJavaScriptEnabled(true);
                                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                        sbLIZ2.append("<head>\n    <script type=\"text/javascript\"\n            src=\"https://h.online-metrix.net/fp/tags.js?org_id=");
                                                        sbLIZ2.append("k8vif92e");
                                                        sbLIZ2.append("&session_id=");
                                                        sbLIZ2.append("bytedance");
                                                        sbLIZ2.append(str2);
                                                        sbLIZ2.append("\"></script>\n    <script type=\"text/javascript\"\n            src=\"https://h.online-metrix.net/fp/tags.js?org_id=");
                                                        sbLIZ2.append("k8vif92e");
                                                        sbLIZ2.append("&session_id=");
                                                        sbLIZ2.append("pipo_us");
                                                        sbLIZ2.append(str2);
                                                        sbLIZ2.append("\"></script>\n</head>");
                                                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                                        webView.setWebChromeClient(this.LIZIZ);
                                                        webView.loadData(strLIZIZ, "text/html", "UTF-8");
                                                        return "success";
                                                    } catch (Throwable th) {
                                                        TryCatchGuardChecker.doCheck(th);
                                                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                        sbLIZ3.append("exception in executeRiskJsCode :");
                                                        sbLIZ3.append(th.getLocalizedMessage());
                                                        C2188811AlT.LIZIZ(sbLIZ3);
                                                        return th.getMessage();
                                                    }
                                                }
                                            };
                                        }
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        throw th;
                                    }
                                }
                            }
                            String strLIZ = c1724150uy5.LJII.LIZ(string);
                            if (TextUtils.equals(strLIZ, "success")) {
                                C1723950uxl.LIZJ("pipo.executeRiskJS", "success", interfaceC1063920dnC);
                            } else {
                                C1723950uxl.LIZLLL("pipo.executeRiskJS", strLIZ, interfaceC1063920dnC);
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            C1723950uxl.LIZLLL("pipo.executeRiskJS", th2.getMessage(), interfaceC1063920dnC);
                        }
                    }
                };
            case -212491835:
                if (!str.equals("pipo.onEvent")) {
                    return null;
                }
                return new AbstractC1724310uyL() { // from class: X.0uxw
                    @Override // X.AbstractC1724310uyL
                    public final String LJI() {
                        return "pipo.onEvent";
                    }

                    @Override // X.AbstractC1724310uyL, X.InterfaceC1063690dmp
                    public final String getName() {
                        return "pipo.onEvent";
                    }

                    @Override // X.AbstractC1724310uyL, X.InterfaceC1063690dmp
                    public final void LIZIZ(InterfaceC1107590evd interfaceC1107590evd, InterfaceC1063920dnC interfaceC1063920dnC, EnumC1059790dgX enumC1059790dgX) {
                        super.LIZIZ(interfaceC1107590evd, interfaceC1063920dnC, enumC1059790dgX);
                        String string = interfaceC1107590evd.getString("event_name");
                        InterfaceC1107590evd map = interfaceC1107590evd.getMap("params");
                        JSONObject jSONObject = new JSONObject();
                        if (map != null) {
                            Map<String, Object> mapLIZ = map.LIZ();
                            for (String str2 : mapLIZ.keySet()) {
                                try {
                                    jSONObject.put(str2, mapLIZ.get(str2));
                                } catch (JSONException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                        }
                        ((C1724080uxy) C1724150uy5.LJIIL.LIZIZ()).onEventV3(string, jSONObject);
                        C1723950uxl.LIZJ("pipo.onEvent", "success", interfaceC1063920dnC);
                    }
                };
            case 702724384:
                if (!str.equals("pipo.encryptString")) {
                    return null;
                }
                return new AbstractC1724310uyL() { // from class: X.0uxj
                    @Override // X.AbstractC1724310uyL
                    public final String LJI() {
                        return "pipo.encryptString";
                    }

                    @Override // X.AbstractC1724310uyL, X.InterfaceC1063690dmp
                    public final void LIZIZ(InterfaceC1107590evd interfaceC1107590evd, InterfaceC1063920dnC interfaceC1063920dnC, EnumC1059790dgX enumC1059790dgX) {
                        super.LIZIZ(interfaceC1107590evd, interfaceC1063920dnC, enumC1059790dgX);
                        String string = interfaceC1107590evd.getString("key");
                        String string2 = interfaceC1107590evd.getString("origin_str");
                        if (TextUtils.isEmpty(string)) {
                            C1723950uxl.LIZLLL("pipo.encryptString", "key is null!", interfaceC1063920dnC);
                            return;
                        }
                        if (TextUtils.isEmpty(string2)) {
                            C1723950uxl.LIZLLL("pipo.encryptString", "origin_str is null!", interfaceC1063920dnC);
                            return;
                        }
                        C821520WKo c821520WKoLIZ = C821510WKn.LIZ(string, string2);
                        if (!c821520WKoLIZ.LIZ) {
                            C1723950uxl.LIZLLL("pipo.encryptString", c821520WKoLIZ.LIZIZ, interfaceC1063920dnC);
                            return;
                        }
                        HashMap map = new HashMap();
                        map.put("result", c821520WKoLIZ.LIZIZ);
                        C1723950uxl.LIZJ("pipo.encryptString", map, interfaceC1063920dnC);
                    }
                };
            case 1576812370:
                if (!str.equals("pipo.getStarlingData")) {
                    return null;
                }
                return new AbstractC1724310uyL() { // from class: X.0uxu
                    @Override // X.AbstractC1724310uyL
                    public final String LJI() {
                        return "pipo.getStarlingData";
                    }

                    @Override // X.AbstractC1724310uyL, X.InterfaceC1063690dmp
                    public final void LIZIZ(InterfaceC1107590evd interfaceC1107590evd, InterfaceC1063920dnC interfaceC1063920dnC, EnumC1059790dgX enumC1059790dgX) {
                        super.LIZIZ(interfaceC1107590evd, interfaceC1063920dnC, enumC1059790dgX);
                        String string = interfaceC1107590evd.getString("language");
                        String string2 = interfaceC1107590evd.getString("url");
                        if (TextUtils.isEmpty(string)) {
                            C1723950uxl.LIZLLL("pipo.getStarlingData", "language is null!", interfaceC1063920dnC);
                        } else {
                            if (TextUtils.isEmpty(string2)) {
                                C1723950uxl.LIZLLL("pipo.getStarlingData", "url is null!", interfaceC1063920dnC);
                                return;
                            }
                            ((C931303kV) C1724150uy5.LJIIL.LJFF()).LIZIZ(string, new C1724050uxv(this, interfaceC1063920dnC), string2);
                        }
                    }
                };
            case 1707392825:
                if (!str.equals("pipo.openWebView")) {
                    return null;
                }
                return new AbstractC1724310uyL() { // from class: X.0uxp
                    @Override // X.AbstractC1724310uyL
                    public final String LJI() {
                        return "pipo.openWebView";
                    }

                    /* JADX WARN: Type inference failed for: r1v0, types: [X.0uxq] */
                    @Override // X.AbstractC1724310uyL, X.InterfaceC1063690dmp
                    public final void LIZIZ(InterfaceC1107590evd interfaceC1107590evd, InterfaceC1063920dnC interfaceC1063920dnC, EnumC1059790dgX enumC1059790dgX) {
                        String string;
                        super.LIZIZ(interfaceC1107590evd, interfaceC1063920dnC, enumC1059790dgX);
                        if (interfaceC1107590evd.hasKey("url")) {
                            string = interfaceC1107590evd.getString("url");
                        } else {
                            string = "";
                        }
                        interfaceC1063920dnC.LIZ(new HashMap());
                        C1724150uy5 c1724150uy5 = C1724150uy5.LJIIL;
                        if (c1724150uy5.LJIIIIZZ == null) {
                            synchronized (c1724150uy5) {
                                try {
                                    if (c1724150uy5.LJIIIIZZ == null) {
                                        final InterfaceC1724010uxr interfaceC1724010uxr = c1724150uy5.LIZ.LJIILLIIL;
                                        c1724150uy5.LJIIIIZZ = new InterfaceC1724010uxr(interfaceC1724010uxr) { // from class: X.0uxq
                                            public final InterfaceC1724010uxr LIZ;

                                            {
                                                this.LIZ = interfaceC1724010uxr;
                                            }

                                            @Override // X.InterfaceC1724010uxr
                                            public final void LIZ(String str2) {
                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                sbLIZ.append("openWebView url:");
                                                sbLIZ.append(str2);
                                                C2188811AlT.LIZIZ(sbLIZ);
                                                InterfaceC1724010uxr interfaceC1724010uxr2 = this.LIZ;
                                                if (interfaceC1724010uxr2 != null) {
                                                    interfaceC1724010uxr2.LIZ(str2);
                                                }
                                            }
                                        };
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }
                        c1724150uy5.LJIIIIZZ.LIZ(string);
                        interfaceC1063920dnC.LIZ(null);
                    }
                };
            case 1725319940:
                if (!str.equals("pipo.fetch")) {
                    return null;
                }
                return new C1724260uyG();
            case 1923191191:
                if (!str.equals("pipoAppInfo")) {
                    return null;
                }
                return new AbstractC1724310uyL() { // from class: X.0uxm
                    @Override // X.AbstractC1724310uyL
                    public final String LJI() {
                        return "pipoAppInfo";
                    }

                    @Override // X.AbstractC1064500do8, X.InterfaceC1063690dmp
                    public final EnumC1063570dmd getAccess() {
                        return EnumC1063570dmd.PUBLIC;
                    }

                    @Override // X.AbstractC1724310uyL, X.InterfaceC1063690dmp
                    public final void LIZIZ(InterfaceC1107590evd interfaceC1107590evd, InterfaceC1063920dnC interfaceC1063920dnC, EnumC1059790dgX enumC1059790dgX) {
                        super.LIZIZ(interfaceC1107590evd, interfaceC1063920dnC, enumC1059790dgX);
                        HashMap map = new HashMap();
                        map.put("aid", 2112);
                        map.put("appVersion", C1717770unn.LIZJ().getVersionInfo().LIZ);
                        interfaceC1063920dnC.LIZ(map);
                    }
                };
            default:
                return null;
        }
    }

    public final String LIZ(String str) {
        if (this.LIZ.get()) {
            return C821510WKn.LIZ(C1724150uy5.LJIIL.LIZ.LJIIJ, str).LIZIZ;
        }
        throw new IllegalArgumentException("please init first");
    }

    public final C931603kY LIZIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getCardPaymentMethod with cardNumber: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        return LIZLLL(str, null);
    }

    public final C1711860ueG LJFF(C1724170uy7 c1724170uy7) {
        boolean zLJI = MethodIDManager.LJI(72102);
        try {
            if (!this.LIZ.get()) {
                try {
                    C932303kf c932303kf = new C932303kf();
                    c932303kf.LIZ = new InterfaceC932603ki() { // from class: X.03kZ
                        @Override // X.InterfaceC932603ki
                        public final void onEvent(String str, JSONObject jSONObject) {
                            ((C1724080uxy) C1724150uy5.LJIIL.LIZIZ()).onEventV3(str, jSONObject);
                        }
                    };
                    new C932003kc(c932303kf).LIZ.LIZ(new C934203ky("459695", C1717770unn.LIZJ().getVersionInfo().LIZ), null);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            this.LIZ.getAndSet(true);
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("init with configuration:\n");
            sbLIZ.append(c1724170uy7.toString());
            C2188811AlT.LIZIZ(sbLIZ);
            C1724150uy5 c1724150uy5 = C1724150uy5.LJIIL;
            C1711860ueG c1711860ueGLJI = c1724150uy5.LJI(c1724170uy7);
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            C1724080uxy c1724080uxy = (C1724080uxy) c1724150uy5.LIZIZ();
            c1724080uxy.getClass();
            JSONObject jSONObjectLIZ = C1724080uxy.LIZ();
            try {
                jSONObjectLIZ.put("param_duration", jCurrentTimeMillis2);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            c1724080uxy.onEventV3("ecommerce_init", jSONObjectLIZ);
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return c1711860ueGLJI;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            try {
                C805380Via.LIZJ(th2, "pipo ecommerce init error");
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
            }
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            try {
                th2.printStackTrace(printWriter);
                String string = stringWriter.toString();
                printWriter.close();
                C1711860ueG c1711860ueG = new C1711860ueG(11, string);
                if (zLJI) {
                    MethodIDManager.LJ();
                }
                return c1711860ueG;
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                printWriter.close();
                throw th4;
            }
        }
    }

    public final void LJIIJ(String str) {
        if (this.LIZ.get()) {
            C1724150uy5 c1724150uy5 = C1724150uy5.LJIIL;
            c1724150uy5.LIZ.LJIIZILJ = str;
            c1724150uy5.LIZJ().getClass();
            b.LJIJJLI.getClass();
            b.LJ = str;
            return;
        }
        throw new IllegalArgumentException("please init first");
    }

    public final C931603kY LIZJ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getCardPaymentMethod with cardNumber: ");
        sbLIZ.append(str);
        sbLIZ.append(", expectedPaymentMethodId: ");
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        return LIZLLL(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C931603kY LIZLLL(java.lang.String r6, java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C931003kS.LIZLLL(java.lang.String, java.lang.String):X.03kY");
    }

    public final void LJIIIIZZ(final C898003f8 c898003f8, final C908303gn c908303gn) {
        if (this.LIZ.get()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pay with ");
            sbLIZ.append(c898003f8.toString());
            C2188811AlT.LIZIZ(sbLIZ);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            InterfaceC906703gX interfaceC906703gXLIZLLL = C1724150uy5.LJIIL.LIZLLL();
            InterfaceC919803ie interfaceC919803ie = new InterfaceC919803ie() { // from class: X.03hv
                @Override // X.InterfaceC919803ie
                public final void LIZ(C910103h5 c910103h5) {
                    String str;
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    InterfaceC1724070uxx interfaceC1724070uxxLIZIZ = C1724150uy5.LJIIL.LIZIZ();
                    C898003f8 c898003f82 = c898003f8;
                    C03S9 c03s9 = c898003f82.LJIIIIZZ;
                    if (c03s9 == null) {
                        str = "";
                    } else {
                        str = c03s9.LIZ;
                    }
                    String str2 = c898003f82.LJIIIZ;
                    String str3 = c910103h5.LIZJ;
                    String str4 = c910103h5.LIZLLL;
                    String str5 = c910103h5.LJ;
                    long j = jCurrentTimeMillis2 - jCurrentTimeMillis;
                    c910103h5.toString();
                    C1724080uxy c1724080uxy = (C1724080uxy) interfaceC1724070uxxLIZIZ;
                    c1724080uxy.getClass();
                    JSONObject jSONObjectLIZ = C1724080uxy.LIZ();
                    try {
                        jSONObjectLIZ.put("param_payment_method_id", str);
                        jSONObjectLIZ.put("param_payment_reference", str2);
                        jSONObjectLIZ.put("result_code", str3);
                        jSONObjectLIZ.put("error_code", str4);
                        jSONObjectLIZ.put("error_message", str5);
                        jSONObjectLIZ.put("param_duration", j);
                        jSONObjectLIZ.put("param_response_str", "");
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    c1724080uxy.onEventV3("ecommerce_pay", jSONObjectLIZ);
                    c908303gn.LIZ(c910103h5);
                }
            };
            C914603ho c914603ho = (C914603ho) interfaceC906703gXLIZLLL;
            c914603ho.getClass();
            if (Looper.getMainLooper() == Looper.myLooper()) {
                RunnableC823120WQs.LIZIZ(new ARunnableS34S0300000_1(c898003f8, interfaceC919803ie, c914603ho, 13));
                return;
            } else {
                C914603ho.LJ(c898003f8, interfaceC919803ie);
                return;
            }
        }
        throw new IllegalArgumentException("please init first");
    }

    public final void LJIIJJI(C898403fC c898403fC, C908403go c908403go) {
        if (this.LIZ.get()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("upload pay info with ");
            sbLIZ.append(c898403fC.toString());
            C2188811AlT.LIZIZ(sbLIZ);
            C914603ho c914603ho = (C914603ho) C1724150uy5.LJIIL.LIZLLL();
            c914603ho.getClass();
            if (Looper.getMainLooper() == Looper.myLooper()) {
                RunnableC823120WQs.LIZIZ(new ARunnableS34S0300000_1(c898403fC, c908403go, c914603ho, 14));
                return;
            } else {
                C914603ho.LJI(c898403fC, c908403go);
                return;
            }
        }
        throw new IllegalArgumentException("please init first");
    }

    public final C922003j0 LJII(String str, String str2, String str3) {
        if (this.LIZ.get()) {
            C931103kT c931103kT = (C931103kT) ((HashMap) ((C931203kU) C1724150uy5.LJIIL.LIZ()).LJIIIIZZ).get(str);
            if (c931103kT != null) {
                Iterator it2 = ((HashSet) C889903dp.LIZIZ).iterator();
                while (it2.hasNext()) {
                    C930103kJ c930103kJ = (C930103kJ) ((HashMap) c931103kT.LJIIIIZZ).get(it2.next());
                    if (c930103kJ != null) {
                        c930103kJ.LJI = str2;
                        Iterator it3 = ((HashSet) C889903dp.LIZJ).iterator();
                        while (it3.hasNext()) {
                            C930103kJ c930103kJ2 = (C930103kJ) ((HashMap) c931103kT.LJIIIIZZ).get(it3.next());
                            if (c930103kJ2 != null) {
                                c930103kJ2.LJI = str3;
                                C1724150uy5 c1724150uy5 = C1724150uy5.LJIIL;
                                if (c1724150uy5.LIZLLL == null) {
                                    synchronized (c1724150uy5) {
                                        try {
                                            if (c1724150uy5.LIZLLL == null) {
                                                c1724150uy5.LIZLLL = new C929303kB();
                                            }
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }
                                return c1724150uy5.LIZLLL.LIZ(c930103kJ, c930103kJ2);
                            }
                        }
                        throw new RuntimeException("monthElement is null");
                    }
                }
                throw new RuntimeException("yearElement is null");
            }
            throw new RuntimeException("methodWithCardBrand is null");
        }
        throw new IllegalArgumentException("please init first");
    }

    public final C922003j0 LJI(Boolean bool, String str, String str2, String str3) {
        Object obj;
        if (this.LIZ.get()) {
            C1724150uy5 c1724150uy5 = C1724150uy5.LJIIL;
            C931203kU c931203kU = (C931203kU) c1724150uy5.LIZ();
            C931103kT c931103kT = (C931103kT) ((HashMap) c931203kU.LJIIIIZZ).get(str);
            if (c931103kT != null) {
                C930103kJ c930103kJ = (C930103kJ) ((HashMap) c931103kT.LJIIIIZZ).get(str2);
                if (c930103kJ != null) {
                    if (TextUtils.equals("eg_ccdc_global_cvv", str2)) {
                        if (u.LJJIIJZLJL(str, "pm_pi_cci_", false)) {
                            str = u.LJJIFFI(str, "cci", "ccdc", false);
                        }
                        if (!Boolean.TRUE.equals(bool) || (obj = ((HashMap) c931203kU.LJIILIIL).get(str)) == null) {
                            obj = ((HashMap) c931203kU.LJIIL).get(str);
                        }
                        c930103kJ.LJIIIZ = obj;
                    } else if (((HashSet) C889903dp.LIZ).contains(str2) && !TextUtils.isEmpty(str) && bool.booleanValue()) {
                        c930103kJ.LJIIIZ = new C930903kR(str);
                    }
                    c930103kJ.LJI = str3;
                    if (c1724150uy5.LIZLLL == null) {
                        synchronized (c1724150uy5) {
                            try {
                                if (c1724150uy5.LIZLLL == null) {
                                    c1724150uy5.LIZLLL = new C929303kB();
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }
                    return c1724150uy5.LIZLLL.LIZ(c930103kJ);
                }
                throw new RuntimeException("element is null");
            }
            throw new RuntimeException("methodWithCardBrand is null");
        }
        throw new IllegalArgumentException("please init first");
    }

    public final void LJIIIZ(C898303fB c898303fB, C912203hQ c912203hQ, boolean z, boolean z2, final C907903gj c907903gj) {
        if (this.LIZ.get()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("query with ");
            sbLIZ.append(c898303fB.toString());
            C2188811AlT.LIZIZ(sbLIZ);
            if (z) {
                C910203h6 c910203h6 = new C910203h6();
                c910203h6.LJII = EnumC934003kw.SUCCESS;
                c910203h6.LJFF = "";
                c910203h6.LJI = "";
                c907903gj.LIZ(c910203h6);
                return;
            }
            if (c912203hQ != null && c912203hQ.LIZJ) {
                synchronized (this.LIZJ) {
                    try {
                        if (this.LIZIZ != null) {
                            this.LIZIZ.LJ();
                            this.LIZIZ = null;
                        }
                        QueryOrderManager queryOrderManager = new QueryOrderManager(c898303fB, c912203hQ, z2, new InterfaceC919903if() { // from class: X.03i4
                            @Override // X.InterfaceC919903if
                            public final void LIZ(C910203h6 c910203h62) {
                                c907903gj.LIZ(c910203h62);
                                synchronized (this.LIZIZ.LIZJ) {
                                    try {
                                        if (this.LIZIZ.LIZIZ != null) {
                                            this.LIZIZ.LIZIZ = null;
                                        }
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        throw th;
                                    }
                                }
                            }
                        });
                        this.LIZIZ = queryOrderManager;
                        queryOrderManager.LIZLLL();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return;
            }
            new QueryOrderManager(c898303fB, c912203hQ, z2, c907903gj).LIZLLL();
            return;
        }
        throw new IllegalArgumentException("please init first");
    }
}
