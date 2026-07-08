package X;

import android.net.http.SslError;
import android.util.Base64;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.context.AdSparkHybridContext;
import com.ss.android.ugc.aweme.web.business.special.AdWebSpecialService;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0e99, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1077530e99 extends AbstractC1539010q9T {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
    public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) throws JSONException {
        switch (this.$t) {
            case 0:
                LJJJLL$0(this, interfaceC1531560pxS);
                break;
            case 1:
                LJJJLL$1(this, interfaceC1531560pxS);
                break;
            case 2:
                LJJJLL$2(this, interfaceC1531560pxS);
                break;
            case 3:
                LJJJLL$3(this, interfaceC1531560pxS);
                break;
            case 4:
                LJJJLL$4(this, interfaceC1531560pxS);
                break;
            case 5:
                LJJJLL$5(this, interfaceC1531560pxS);
                break;
            default:
                super.LJJJLL(interfaceC1531560pxS);
                break;
        }
    }

    public C1077530e99(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJJLL$0(C1077530e99 c1077530e99, InterfaceC1531560pxS interfaceC1531560pxS) throws JSONException {
        C1049260dPY c1049260dPY;
        n nVar;
        C1049260dPY c1049260dPY2;
        C1009380cNE c1009380cNE;
        String str;
        C650530PfP c650530PfP;
        if (interfaceC1531560pxS instanceof C1537910q7h) {
            C1051290dSp c1051290dSp = (C1051290dSp) c1077530e99.l0;
            if (c1051290dSp != null && (c1049260dPY2 = c1051290dSp.LJFF) != null && (c1009380cNE = c1049260dPY2.LJIIIZ) != null && (str = c1009380cNE.LIZ) != null) {
                C1537910q7h c1537910q7h = (C1537910q7h) interfaceC1531560pxS;
                try {
                    c650530PfP = new C650530PfP(Base64.decode(str, 2));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c650530PfP = new C650530PfP(null);
                }
                c1537910q7h.LJJIL = c650530PfP;
            }
            C1051290dSp c1051290dSp2 = (C1051290dSp) c1077530e99.l0;
            if (c1051290dSp2 != null && (c1049260dPY = c1051290dSp2.LJFF) != null && (nVar = c1049260dPY.LJIIJ) != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("initialData", nVar);
                ((C1537910q7h) interfaceC1531560pxS).LJIJJ = TemplateData.LJIIIIZZ(C786410Ut5.J3(jSONObject));
            }
        }
    }

    public static final void LJJJLL$1(C1077530e99 c1077530e99, InterfaceC1531560pxS interfaceC1531560pxS) {
        if ((interfaceC1531560pxS instanceof C1541480qDS) && interfaceC1531560pxS != null) {
            ((C1541480qDS) interfaceC1531560pxS).LJII(C1524020plI.class, new AwS595S0100000_16((SparkContext) c1077530e99.l0, 96));
        }
    }

    public static final void LJJJLL$2(C1077530e99 c1077530e99, InterfaceC1531560pxS interfaceC1531560pxS) {
        if (interfaceC1531560pxS instanceof C1537910q7h) {
            C1537910q7h c1537910q7h = (C1537910q7h) interfaceC1531560pxS;
            HashMap map = new HashMap();
            String str = ((C1067310dsf) c1077530e99.l0).LIZIZ;
            if (str == null) {
                str = "";
            }
            map.put("fe_preload_data", str);
            c1537910q7h.LJIJJLI(C1067320dsg.LIZ(map));
        }
    }

    public static final void LJJJLL$3(C1077530e99 c1077530e99, InterfaceC1531560pxS interfaceC1531560pxS) {
        if (!(interfaceC1531560pxS instanceof C1541480qDS)) {
            return;
        }
        C1541480qDS c1541480qDS = (C1541480qDS) interfaceC1531560pxS;
        final AdSparkHybridContext adSparkHybridContext = (AdSparkHybridContext) c1077530e99.l0;
        c1541480qDS.LJIIJJI = new InterfaceC1047700dN2() { // from class: X.0dBl
            @Override // X.InterfaceC1047700dN2
            public final C1040730dBn LIZ(C1040730dBn c1040730dBn) {
                AdSparkHybridContext adSparkHybridContext2 = adSparkHybridContext;
                c1040730dBn.LIZ = c1040730dBn.LIZ;
                c1040730dBn.LIZIZ = AdWebSpecialService.LIZIZ().LIZ(c1040730dBn.LIZ, c1040730dBn.LIZIZ, (C1035880d3y) adSparkHybridContext2.LJFF(C1035880d3y.class));
                return c1040730dBn;
            }
        };
        c1541480qDS.LJII(C2206081BVu.class, AFwS252S0000000_16.get$arr$(357));
        c1541480qDS.LJIILLIIL = true;
    }

    public static final void LJJJLL$4(C1077530e99 c1077530e99, InterfaceC1531560pxS interfaceC1531560pxS) {
        if (!(interfaceC1531560pxS instanceof C1541480qDS)) {
            return;
        }
        final C1038030d7R c1038030d7R = (C1038030d7R) c1077530e99.l0;
        ((C1541480qDS) interfaceC1531560pxS).LIZJ = new C844210X9v() { // from class: X.0dAM
            @Override // X.AbstractC2205961BVi
            public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                String url;
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                c1038030d7R.LLILZLL = false;
                if (webView != null && (url = webView.getUrl()) != null) {
                    c1038030d7R.LJIIIZ(url);
                }
            }
        };
    }

    public static final void LJJJLL$5(C1077530e99 c1077530e99, InterfaceC1531560pxS interfaceC1531560pxS) {
        C1537910q7h c1537910q7h;
        if ((interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
            c1537910q7h.LJIJJ = TemplateData.LJIIIIZZ(C786410Ut5.J3((JSONObject) c1077530e99.l0));
        }
    }
}
