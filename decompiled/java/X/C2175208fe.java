package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pipo.security.certificate.interceptor.SignatureVerificationInterceptor;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.mime.TypedString;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.ab.PipoTtlsEnableSecuritySdkSettings;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08fe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2175208fe {
    public static InterfaceC2174508fX LIZ;
    public static String LIZIZ;
    public static String LIZJ;

    public static void LIZ(Retrofit retrofit) {
        SignatureVerificationInterceptor signatureVerificationInterceptorLIZIZ;
        InterfaceC2174508fX interfaceC2174508fX = LIZ;
        if (interfaceC2174508fX != null && (signatureVerificationInterceptorLIZIZ = interfaceC2174508fX.LIZIZ("TTLS", new InterfaceC1726580v20() { // from class: X.08fd
            @Override // X.InterfaceC1726580v20
            public final C0X52<?> LIZ(C0X52<?> c0x52) {
                C2175508fh c2175508fh = c0x52.LIZ;
                return C0X52.LIZIZ(new TypedString("verification_error"), new C2175508fh(c2175508fh.LIZ, 418, "Invalid response signature", c2175508fh.LIZLLL, c2175508fh.LJ));
            }

            @Override // X.InterfaceC1726580v20
            public final boolean LIZIZ(C0X52<?> c0x52) {
                return Intrinsics.LJFF(C2175208fe.LIZJ(c0x52), "REQUEST_SIGNATURE_INVALID");
            }

            @Override // X.InterfaceC1726580v20
            public final boolean LIZJ(C0X52<?> c0x52) {
                return Intrinsics.LJFF(C2175208fe.LIZJ(c0x52), "REQUEST_CERTIFICATION_EXPIRED");
            }
        }, new InterfaceC1726770v2J() { // from class: X.07dY
            @Override // X.InterfaceC1726770v2J
            public final boolean LIZ(String str) {
                List<String> list;
                Object c098200Yq;
                List<String> list2;
                C01GW c01gw = PipoTtlsEnableSecuritySdkSettings.LIZIZ;
                boolean z = false;
                if (Intrinsics.LJFF(((PipoTtlsEnableSecuritySdkSettings.SecurityConfigModel) c01gw.getValue()).enable, Boolean.TRUE) && (list = ((PipoTtlsEnableSecuritySdkSettings.SecurityConfigModel) c01gw.getValue()).apiList) != null && !list.isEmpty()) {
                    try {
                        c098200Yq = UriProtector.parse(str).getPath();
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                    String str2 = (String) c098200Yq;
                    if (str2 != null && str2.length() != 0 && (list2 = ((PipoTtlsEnableSecuritySdkSettings.SecurityConfigModel) PipoTtlsEnableSecuritySdkSettings.LIZIZ.getValue()).apiList) != null && !list2.isEmpty()) {
                        Iterator<String> it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            if (u.LJIIZILJ(str2, it2.next(), false)) {
                                z = true;
                                break;
                            }
                        }
                    }
                }
                return !z;
            }
        })) != null) {
            retrofit.LJIIIIZZ.add(signatureVerificationInterceptorLIZIZ);
        }
    }

    public static String LIZJ(C0X52 c0x52) {
        Object c098200Yq;
        JSONObject jSONObject;
        try {
            Object obj = new JSONObject(C2080708Dd.LIZ(c0x52.LIZ.LJ)).get("response");
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
            } else if (obj instanceof String) {
                jSONObject = new JSONObject((String) obj);
            } else {
                jSONObject = new JSONObject();
            }
            c098200Yq = jSONObject.optString("error_code");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = "";
        }
        return (String) c098200Yq;
    }

    public static void LIZIZ(String str, String str2, String str3, String str4) {
        if (!Intrinsics.LJFF(((PipoTtlsEnableSecuritySdkSettings.SecurityConfigModel) PipoTtlsEnableSecuritySdkSettings.LIZIZ.getValue()).enable, Boolean.TRUE)) {
            return;
        }
        C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init security manager, ");
        sbLIZ.append(str);
        sbLIZ.append(", ");
        sbLIZ.append(str2);
        sbLIZ.append(", ");
        sbLIZ.append(str3);
        sbLIZ.append(", ");
        sbLIZ.append(str4);
        c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ));
        LIZIZ = str3;
        LIZJ = str4;
        InterfaceC2174508fX interfaceC2174508fX = LIZ;
        if (interfaceC2174508fX != null && interfaceC2174508fX.LIZ(str, str2)) {
            return;
        }
        try {
            C189200o6.m2constructorimpl(C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C2175408fg(str, str2, null), 2));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
