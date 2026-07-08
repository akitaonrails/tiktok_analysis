package X;

import Y.ARunnableS60S0300000_27;
import android.app.Activity;
import com.bytedance.bpea.basics.Cert;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.AwS614S0100000_35;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0hYS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1208540hYS {
    public final C1208470hYL LIZ;
    public final C1798380wto LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Function1<Activity, Unit> LJ;
    public final InterfaceC1207310hWT LJFF;
    public final Function0<Unit> LJI;
    public final Function0<Unit> LJII;

    public final void LIZ(Cert cert, C12QJ c12qj, EnumC1208550hYT enumC1208550hYT) {
        C185100nR c185100nR = C185100nR.LIZ;
        final int value = enumC1208550hYT.getValue();
        final String string = enumC1208550hYT.toString();
        final String strCertToken = cert.certToken();
        final String string2 = c12qj.toString();
        final String str = this.LIZLLL;
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportConsentStatus: ");
        sbLIZ.append(value);
        sbLIZ.append(' ');
        sbLIZ.append(string);
        C1798620wuC.LIZLLL("SdkMonitorWrapper", C2188811AlT.LIZIZ(sbLIZ));
        if (!C185100nR.LIZ()) {
            C1798620wuC.LIZLLL("SdkMonitorWrapper", "reportConsentStatus: not initialized");
        } else {
            C786410Ut5.LJJZZIII(C185100nR.LIZIZ, new Runnable() { // from class: X.00nQ
                public final void LIZ() throws JSONException {
                    JSONObject jSONObject = new JSONObject();
                    int i = value;
                    String str2 = string;
                    String str3 = strCertToken;
                    String str4 = string2;
                    String str5 = str;
                    jSONObject.put("err_code", i);
                    jSONObject.put("err_msg", str2);
                    jSONObject.put("cert_name", str3);
                    jSONObject.put("key", str4);
                    jSONObject.put("region", str5);
                    C185100nR.LIZIZ(C185100nR.LIZ, "consent_status", jSONObject, null, 12);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SdkMonitorWrapper@f316.reportConsentStatus$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SdkMonitorWrapper@f316.reportConsentStatus$1");
                }
            });
        }
        C786410Ut5.LJJZZIII(C404501hj.LIZ, new ARunnableS60S0300000_27(cert, enumC1208550hYT, this, 3));
    }

    public C1208540hYS(C1208180hXs c1208180hXs, C1208470hYL c1208470hYL, C1798380wto c1798380wto, String str, String str2, AwS614S0100000_35 awS614S0100000_35, InterfaceC1207310hWT interfaceC1207310hWT, AFwS226S0000000_35 aFwS226S0000000_35, AFwS226S0000000_35 aFwS226S0000000_352) {
        this.LIZ = c1208470hYL;
        this.LIZIZ = c1798380wto;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = awS614S0100000_35;
        this.LJFF = interfaceC1207310hWT;
        this.LJI = aFwS226S0000000_35;
        this.LJII = aFwS226S0000000_352;
    }
}
