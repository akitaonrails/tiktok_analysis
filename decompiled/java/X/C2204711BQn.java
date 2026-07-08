package X;

import Y.ARunnableS103S0200000_34;
import android.webkit.WebView;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import com.bytedance.ies.web.jsbridge2.WebViewBridge;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.impl.JsBridge2ConfigImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BQn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2204711BQn {
    public static final C1BR7 LJ = new C1BR6<C2204701BQm>() { // from class: X.1BR7
        @Override // X.C1BR6
        public final C2204701BQm LIZIZ() {
            C1BR0 c1br0LIZJ = JsBridge2ConfigImpl.LIZLLL().LIZJ();
            if (c1br0LIZJ != null) {
                return new C2204701BQm(c1br0LIZJ);
            }
            return null;
        }
    };
    public static C1BMV LJFF = null;
    public static final Object LJI = new Object();
    public static final List<TimeLineEvent> LJII = new CopyOnWriteArrayList();
    public static final C1BR8 LJIIIIZZ = new C1BR6<C1BRH>() { // from class: X.1BR8
        @Override // X.C1BR6
        public final C1BRH LIZIZ() {
            return JsBridge2ConfigImpl.LIZLLL().LIZIZ();
        }
    };
    public final AbstractC2204751BQr LIZ;
    public final C2203421BLo LIZIZ;
    public final List<C1BMI> LIZJ;
    public volatile boolean LIZLLL;

    public C2204711BQn(C2203421BLo c2203421BLo) {
        C2204651BQh c2204651BQhLIZIZ;
        C1BMC c1bmb;
        ArrayList arrayList = new ArrayList();
        this.LIZJ = arrayList;
        this.LIZLLL = false;
        this.LIZIZ = c2203421BLo;
        C2204811BQx c2204811BQx = new C2204811BQx();
        c2204811BQx.LIZJ(Boolean.valueOf(c2203421BLo.LJI), "enable_permission_check");
        C1BR7 c1br7 = LJ;
        c2204811BQx.LIZJ(Boolean.valueOf(c1br7.LIZ() != null), "permission_config_repository");
        c2204811BQx.LIZ("label_create_jsb_instance", c2203421BLo.LJIILIIL);
        if (c2203421BLo.LJI && c1br7.LIZ() != null) {
            c2204651BQhLIZIZ = c1br7.LIZ().LIZIZ(c2203421BLo.LJIIIZ, c2203421BLo.LJIILIIL);
        } else {
            c2204651BQhLIZIZ = null;
        }
        if (c2203421BLo.LIZ != null) {
            this.LIZ = new WebViewBridge();
        } else {
            c2203421BLo.getClass();
            this.LIZ = null;
        }
        AbstractC2204751BQr abstractC2204751BQr = this.LIZ;
        abstractC2204751BQr.LIZ = abstractC2204751BQr.LJ(c2203421BLo);
        abstractC2204751BQr.LIZJ = c2203421BLo.LIZLLL;
        abstractC2204751BQr.LIZIZ = c2203421BLo.LJII;
        abstractC2204751BQr.LJII = new C2204741BQq(c2203421BLo, abstractC2204751BQr, c2204651BQhLIZIZ);
        abstractC2204751BQr.LJ = c2203421BLo.LJIIIZ;
        abstractC2204751BQr.LJIIIZ = c2203421BLo.LJIILIIL;
        WebView webView = c2203421BLo.LIZ;
        if (webView != null) {
            c1bmb = new C1BMB(webView);
        } else {
            c1bmb = c2203421BLo.LIZIZ;
        }
        abstractC2204751BQr.LJI = c1bmb;
        abstractC2204751BQr.LJII(c2203421BLo);
        arrayList.add(c2203421BLo.LJIIIIZZ);
        C1835380xrU.LIZ = c2203421BLo.LJ;
        C1699620uKW.LIZ = c2203421BLo.LJFF;
    }

    public static void LIZIZ(boolean z, C1BRI c1bri) {
        C1BR7 c1br7 = LJ;
        if (c1br7.LIZ() != null) {
            if (z) {
                C2204701BQm c2204701BQmLIZ = c1br7.LIZ();
                c2204701BQmLIZ.getClass();
                C2204811BQx c2204811BQx = new C2204811BQx();
                c2204811BQx.LIZJ(Boolean.TRUE, "fetch_permission_config");
                c2204811BQx.LIZ("label_enable_permission_check", LJII);
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("aid", c2204701BQmLIZ.LIZJ.LJIIIIZZ());
                    jSONObject2.put("app_version", c2204701BQmLIZ.LIZJ.LJII());
                    jSONObject2.put("os", 0);
                    jSONObject2.put("device_id", c2204701BQmLIZ.LIZJ.LJIIJ());
                    JSONArray jSONArray = new JSONArray();
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("channel", "_jsb_auth");
                    jSONObject3.put("local_version", 0);
                    jSONArray.put(jSONObject3);
                    if (!C2204701BQm.LJIIJ.booleanValue()) {
                        for (String str : c2204701BQmLIZ.LIZ) {
                            JSONObject jSONObject4 = new JSONObject();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("_jsb_auth.");
                            sbLIZ.append(str);
                            jSONObject4.put("channel", C2188811AlT.LIZIZ(sbLIZ));
                            jSONObject4.put("local_version", 0);
                            jSONArray.put(jSONObject4);
                        }
                    }
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put(c2204701BQmLIZ.LIZJ.W2(), jSONArray);
                    jSONObject.put("common", jSONObject2);
                    jSONObject.put("deployment", jSONObject5);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2204811BQx c2204811BQx2 = new C2204811BQx();
                    c2204811BQx2.LIZJ(e.getClass().getSimpleName(), "exception_name");
                    c2204811BQx2.LIZJ(e.getMessage(), "exception_message");
                    c2204811BQx2.LIZJ(C786410Ut5.J3(jSONObject), "param");
                    c2204811BQx2.LIZ("label_create_fetch_param_exception", LJII);
                }
                String strJ3 = C786410Ut5.J3(jSONObject);
                c2204701BQmLIZ.LIZJ.LJI(c2204701BQmLIZ.LJ, strJ3.getBytes(), new C2204721BQo(c2204701BQmLIZ, c1bri, strJ3));
                return;
            }
            C2204701BQm c2204701BQmLIZ2 = c1br7.LIZ();
            c2204701BQmLIZ2.LJFF.execute(new ARunnableS103S0200000_34(c2204701BQmLIZ2, c1bri, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, X.1BQm] */
    public static void LIZ(boolean z, C1BR0 c1br0, C1BRI c1bri, C1BR1 c1br1, C1544660qIa c1544660qIa) {
        C1BR8 c1br8 = LJIIIIZZ;
        c1br8.LIZJ = c1br1;
        c1br8.LIZ = true;
        C1BR7 c1br7 = LJ;
        if (!c1br7.LIZ) {
            synchronized (LJI) {
                try {
                    if (!c1br7.LIZ) {
                        ?? c2204701BQm = new C2204701BQm(c1br0);
                        if (c1544660qIa != 0) {
                            C1BR9 c1br9 = c2204701BQm.LJIIIIZZ;
                            c1br9.LIZJ = c1544660qIa;
                            c1br9.LIZ = true;
                        }
                        c1br7.LIZJ = c2204701BQm;
                        c1br7.LIZ = true;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        LIZIZ(z, c1bri);
    }
}
