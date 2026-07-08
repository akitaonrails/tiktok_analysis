package X;

import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Locale;

/* JADX INFO: renamed from: X.0Wty, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C837920Wty {
    public static String LIZIZ(Locale locale) {
        Cert certFindCert;
        Cert cert = C837950Wu1.LIZ;
        if (C837910Wtx.LJFF) {
            certFindCert = CertProviderManagerKt.findCert("bpea-getCountry", 1476440072);
        } else {
            certFindCert = C837950Wu1.LIZ;
        }
        if (C837910Wtx.LIZ) {
            return (String) C837880Wtu.LIZ(C0SRQ.LIZ, Integer.valueOf(locale.hashCode()), new C837930Wtz(locale, certFindCert));
        }
        try {
            String strLIZ = LIZ(locale, certFindCert);
            if (strLIZ != null) {
                return strLIZ;
            }
            return "";
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static String LIZ(Locale locale, Cert cert) {
        C825940Wae c825940Wae = new C825940Wae(cert, "locale_getCountry", new String[]{"country/carrier"}, Integer.valueOf(EnumC746240TPa.BPEA_ENTRY.getType()), "Collect", 2885);
        C837860Wts.LIZ(c825940Wae, "java/util/Locale", "getCountry()Ljava/lang/String;", null);
        return (String) C838080WuE.LIZ(c825940Wae, new C837940Wu0(locale));
    }
}
