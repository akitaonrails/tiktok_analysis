package X;

import com.bytedance.bpea.basics.Cert;
import java.net.Inet4Address;
import java.net.Inet6Address;

/* JADX INFO: renamed from: X.0TPb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C746250TPb {
    public static String LIZ(Inet4Address inet4Address, Cert cert) {
        C825940Wae c825940Wae = new C825940Wae(cert, "getHostAddress", new String[]{"ip"}, Integer.valueOf(EnumC746240TPa.BPEA_ENTRY.getType()), "Collect", 0);
        C837860Wts.LIZ(c825940Wae, "java/net/Inet4Address", "getHostAddress()Ljava/lang/String;", null);
        return (String) C838080WuE.LIZ(c825940Wae, new C746260TPc(inet4Address));
    }

    public static String LIZIZ(Inet6Address inet6Address, Cert cert) {
        C825940Wae c825940Wae = new C825940Wae(cert, "getHostAddress", new String[]{"ip"}, Integer.valueOf(EnumC746240TPa.BPEA_ENTRY.getType()), "Collect", 0);
        C837860Wts.LIZ(c825940Wae, "java/net/Inet6Address", "getHostAddress()Ljava/lang/String;", null);
        return (String) C838080WuE.LIZ(c825940Wae, new C746270TPd(inet6Address));
    }
}
