package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import xlp.c;

/* JADX INFO: renamed from: X.0p1g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1495740p1g {
    public final EnumC1495780p1k LIZ;
    public final C1495760p1i LIZIZ;
    public final List<Certificate> LIZJ;
    public final List<Certificate> LIZLLL;

    public final int hashCode() {
        return ((((((527 + this.LIZ.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public static C1495740p1g LIZ(SSLSession sSLSession) throws IOException {
        List listEmptyList;
        List listEmptyList2;
        Certificate[] peerCertificates;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            if (!"SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
                C1495760p1i c1495760p1iLIZ = C1495760p1i.LIZ(cipherSuite);
                String protocol = sSLSession.getProtocol();
                if (protocol != null) {
                    if (!"NONE".equals(protocol)) {
                        EnumC1495780p1k enumC1495780p1kForJavaName = EnumC1495780p1k.forJavaName(protocol);
                        try {
                            peerCertificates = sSLSession.getPeerCertificates();
                        } catch (SSLPeerUnverifiedException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (peerCertificates == null) {
                            listEmptyList = Collections.emptyList();
                        } else {
                            listEmptyList = c.LJIILJJIL(peerCertificates);
                        }
                        Certificate[] localCertificates = sSLSession.getLocalCertificates();
                        if (localCertificates != null) {
                            listEmptyList2 = c.LJIILJJIL(localCertificates);
                        } else {
                            listEmptyList2 = Collections.emptyList();
                        }
                        return new C1495740p1g(enumC1495780p1kForJavaName, c1495760p1iLIZ, listEmptyList, listEmptyList2);
                    }
                    throw new IOException("tlsVersion == NONE");
                }
                throw new IllegalStateException("tlsVersion == null");
            }
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        throw new IllegalStateException("cipherSuite == null");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1495740p1g)) {
            return false;
        }
        C1495740p1g c1495740p1g = (C1495740p1g) obj;
        if (!this.LIZ.equals(c1495740p1g.LIZ) || !this.LIZIZ.equals(c1495740p1g.LIZIZ) || !this.LIZJ.equals(c1495740p1g.LIZJ) || !this.LIZLLL.equals(c1495740p1g.LIZLLL)) {
            return false;
        }
        return true;
    }

    public C1495740p1g(EnumC1495780p1k enumC1495780p1k, C1495760p1i c1495760p1i, List<Certificate> list, List<Certificate> list2) {
        this.LIZ = enumC1495780p1k;
        this.LIZIZ = c1495760p1i;
        this.LIZJ = list;
        this.LIZLLL = list2;
    }
}
