package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.net.BaseDNS;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import fyo.e;
import java.lang.reflect.Method;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oK9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1468750oK9 extends BaseDNS {
    public static String LJI = "";
    public final int LJFF;

    @Override // com.ss.ttvideoengine.net.BaseDNS
    public final void LIZJ() {
        if (this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        this.LJ.LIZ();
    }

    @Override // com.ss.ttvideoengine.net.BaseDNS
    public final void LJFF() {
        StringBuilder sb = new StringBuilder();
        synchronized (C1468740oK8.class) {
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(LJI);
        sbLIZ.append("/q?host=");
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        sb.append(this.LIZJ);
        String string = sb.toString();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("http dns parse url is");
        sbLIZ2.append(string);
        TTVideoEngineLog.d("HTTPDNS", C2188811AlT.LIZIZ(sbLIZ2));
        Method[] declaredMethods = this.LJ.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            Method method = declaredMethods[i2];
            if (method.getName().equals("startTask") && method.getParameterTypes().length == 5) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            this.LJ.LIZLLL(string, null, new InterfaceC1309180kAm() { // from class: X.0oKB
                @Override // X.InterfaceC1309180kAm
                public final void LIZIZ(JSONObject jSONObject, e eVar) {
                    this.LIZ.LJI(jSONObject, eVar);
                }
            });
        } else {
            this.LJ.LIZJ(string, null, new InterfaceC1309180kAm() { // from class: X.0oKC
                @Override // X.InterfaceC1309180kAm
                public final void LIZIZ(JSONObject jSONObject, e eVar) {
                    this.LIZ.LJI(jSONObject, eVar);
                }
            });
        }
    }

    public final void LJI(JSONObject jSONObject, e eVar) {
        if (eVar != null) {
            eVar.LIZJ = "kTTVideoErrorDomainHTTPDNS";
        } else {
            String str = "TT_";
            if (jSONObject != null && jSONObject.length() != 0) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ips");
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    if (this.LJFF != 2) {
                        str = "ALI_";
                    }
                    sbLIZ.append(str);
                    sbLIZ.append("HTTP dns empty");
                    eVar = new e("kTTVideoErrorDomainHTTPDNS", -9997, 0, C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    try {
                        jSONObject.put("time", System.currentTimeMillis());
                        jSONObject.put("dns_type", "httpDNS");
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                        int i = C2187451AjH.LIZ;
                        TTVideoEngineLog.d(e);
                    }
                    C786410Ut5.LJLJJL(this.LIZ, this.LIZ.obtainMessage(3, jSONObject));
                    return;
                }
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                if (this.LJFF != 2) {
                    str = "ALI_";
                }
                sbLIZ2.append(str);
                sbLIZ2.append("HTTP dns empty");
                eVar = new e("kTTVideoErrorDomainHTTPDNS", -9997, 0, C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        LJ(eVar);
    }

    public C1468750oK9(String str, AbstractC1468760oKA abstractC1468760oKA, int i) {
        String str2;
        super(str, abstractC1468760oKA);
        this.LJFF = 2;
        this.LJFF = i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DNS use HTTPDNS");
        if (i == 2) {
            str2 = "_TT";
        } else {
            str2 = "_ALI";
        }
        sbLIZ.append(str2);
        C1471660oOq.LIZJ("HTTPDNS", C2188811AlT.LIZIZ(sbLIZ));
    }
}
