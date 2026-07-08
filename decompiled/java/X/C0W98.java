package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import ttpobfuscated.e3;
import xlp.c;

/* JADX INFO: renamed from: X.0W98, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W98 implements HostnameVerifier {
    public static final C0W98 LIZ = new C0W98();

    public static List<String> LIZ(X509Certificate x509Certificate) {
        List<String> listLIZIZ = LIZIZ(x509Certificate, 7);
        List<String> listLIZIZ2 = LIZIZ(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(listLIZIZ.size() + listLIZIZ2.size());
        arrayList.addAll(listLIZIZ);
        arrayList.addAll(listLIZIZ2);
        return arrayList;
    }

    public static List<String> LIZIZ(X509Certificate x509Certificate, int i) {
        Integer num;
        Object obj;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) ListProtector.get(list, 0)) != null && num.intValue() == i && (obj = ListProtector.get(list, 1)) != null) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException e) {
            TryCatchGuardChecker.doCheck(e);
            return Collections.emptyList();
        }
    }

    public static boolean LIZJ(String str, X509Certificate x509Certificate) {
        boolean zMatches;
        String strLIZIZ;
        int length;
        try {
            zMatches = c.LJIILLIIL.matcher(str).matches();
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            zMatches = false;
        }
        if (zMatches) {
            List<String> listLIZIZ = LIZIZ(x509Certificate, 7);
            int size = listLIZIZ.size();
            for (int i = 0; i < size; i++) {
                if (!str.equalsIgnoreCase((String) ListProtector.get(listLIZIZ, i))) {
                }
            }
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        for (String strLIZIZ2 : LIZIZ(x509Certificate, 2)) {
            if (lowerCase != null && lowerCase.length() != 0 && !lowerCase.startsWith(e3.d) && !lowerCase.endsWith("..") && strLIZIZ2 != null && strLIZIZ2.length() != 0 && !strLIZIZ2.startsWith(e3.d) && !strLIZIZ2.endsWith("..")) {
                if (!lowerCase.endsWith(e3.d)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(lowerCase);
                    sbLIZ.append('.');
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    strLIZIZ = lowerCase;
                }
                if (!strLIZIZ2.endsWith(e3.d)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strLIZIZ2);
                    sbLIZ2.append('.');
                    strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                }
                String lowerCase2 = strLIZIZ2.toLowerCase(Locale.US);
                if (!lowerCase2.contains("*")) {
                    if (strLIZIZ.equals(lowerCase2)) {
                    }
                } else if (lowerCase2.startsWith("*.") && lowerCase2.indexOf(42, 1) == -1 && strLIZIZ.length() >= lowerCase2.length() && !"*.".equals(lowerCase2)) {
                    String strSubstring = lowerCase2.substring(1);
                    if (!strLIZIZ.endsWith(strSubstring) || ((length = strLIZIZ.length() - strSubstring.length()) > 0 && strLIZIZ.lastIndexOf(46, length - 1) != -1)) {
                    }
                }
            }
        }
        return false;
        return true;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return LIZJ(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
