package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: renamed from: X.0X3x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C842670X3x {
    public static final C842670X3x LIZ;
    public static final Logger LIZIZ;

    public void LIZ(SSLSocket sSLSocket) {
    }

    public void LJ(SSLSocketFactory sSLSocketFactory) {
    }

    public void LJFF(SSLSocket sSLSocket, String str, List<EnumC847200XLi> list) {
    }

    public String LJIIIIZZ(SSLSocket sSLSocket) {
        return null;
    }

    public boolean LJIIJ(String str) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    static {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C842670X3x.<clinit>():void");
    }

    public SSLContext LJII() {
        if ("1.7".equals(System.getProperty("java.specification.version"))) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new IllegalStateException("No TLS provider", e2);
        }
    }

    public Object LJIIIZ() {
        if (LIZIZ.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    public static List<String> LIZIZ(List<EnumC847200XLi> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EnumC847200XLi enumC847200XLi = (EnumC847200XLi) ListProtector.get(list, i);
            if (enumC847200XLi != EnumC847200XLi.HTTP_1_0) {
                arrayList.add(enumC847200XLi.toString());
            }
        }
        return arrayList;
    }

    public AbstractC842630X3t LIZJ(X509TrustManager x509TrustManager) {
        final InterfaceC842620X3s interfaceC842620X3sLIZLLL = LIZLLL(x509TrustManager);
        return new AbstractC842630X3t(interfaceC842620X3sLIZLLL) { // from class: X.0X3r
            public final InterfaceC842620X3s LIZ;

            public final int hashCode() {
                return this.LIZ.hashCode();
            }

            {
                this.LIZ = interfaceC842620X3sLIZLLL;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if ((obj instanceof C842610X3r) && ((C842610X3r) obj).LIZ.equals(this.LIZ)) {
                    return true;
                }
                return false;
            }

            public static boolean LIZIZ(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
                if (!x509Certificate.getIssuerDN().equals(x509Certificate2.getSubjectDN())) {
                    return false;
                }
                try {
                    x509Certificate.verify(x509Certificate2.getPublicKey());
                    return true;
                } catch (GeneralSecurityException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return false;
                }
            }

            @Override // X.AbstractC842630X3t
            public final List LIZ(String str, List list) throws SSLPeerUnverifiedException {
                ArrayDeque arrayDeque = new ArrayDeque(list);
                ArrayList arrayList = new ArrayList();
                arrayList.add(arrayDeque.removeFirst());
                int i = 0;
                boolean z = false;
                do {
                    X509Certificate x509Certificate = (X509Certificate) ListProtector.get(arrayList, arrayList.size() - 1);
                    X509Certificate x509CertificateLIZ = this.LIZ.LIZ(x509Certificate);
                    if (x509CertificateLIZ != null) {
                        if (arrayList.size() > 1 || !x509Certificate.equals(x509CertificateLIZ)) {
                            arrayList.add(x509CertificateLIZ);
                        }
                        if (LIZIZ(x509CertificateLIZ, x509CertificateLIZ)) {
                            return arrayList;
                        }
                        z = true;
                    } else {
                        Iterator it2 = arrayDeque.iterator();
                        while (it2.hasNext()) {
                            X509Certificate x509Certificate2 = (X509Certificate) it2.next();
                            if (LIZIZ(x509Certificate, x509Certificate2)) {
                                it2.remove();
                                arrayList.add(x509Certificate2);
                            }
                        }
                        if (z) {
                            return arrayList;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Failed to find a trusted cert that signed ");
                        sbLIZ.append(x509Certificate);
                        throw new SSLPeerUnverifiedException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    i++;
                } while (i < 9);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Certificate chain too long: ");
                sbLIZ2.append(arrayList);
                throw new SSLPeerUnverifiedException(C2188811AlT.LIZIZ(sbLIZ2));
            }
        };
    }

    public InterfaceC842620X3s LIZLLL(X509TrustManager x509TrustManager) {
        final X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new InterfaceC842620X3s(acceptedIssuers) { // from class: X.0X3v
            public final Map<X500Principal, Set<X509Certificate>> LIZ = new LinkedHashMap();

            public final int hashCode() {
                return this.LIZ.hashCode();
            }

            {
                for (X509Certificate x509Certificate : acceptedIssuers) {
                    X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
                    Set<X509Certificate> linkedHashSet = this.LIZ.get(subjectX500Principal);
                    if (linkedHashSet == null) {
                        linkedHashSet = new LinkedHashSet<>(1);
                        this.LIZ.put(subjectX500Principal, linkedHashSet);
                    }
                    linkedHashSet.add(x509Certificate);
                }
            }

            @Override // X.InterfaceC842620X3s
            public final X509Certificate LIZ(X509Certificate x509Certificate) {
                Set<X509Certificate> set = (Set) ((LinkedHashMap) this.LIZ).get(x509Certificate.getIssuerX500Principal());
                if (set == null) {
                    return null;
                }
                for (X509Certificate x509Certificate2 : set) {
                    try {
                        x509Certificate.verify(x509Certificate2.getPublicKey());
                        return x509Certificate2;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                return null;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if ((obj instanceof C842650X3v) && ((C842650X3v) obj).LIZ.equals(this.LIZ)) {
                    return true;
                }
                return false;
            }
        };
    }

    public void LJIIL(Object obj, String str) {
        if (obj == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
            str = C2188811AlT.LIZIZ(sbLIZ);
        }
        LJIIJJI(5, str, (Throwable) obj);
    }

    public void LJI(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    public void LJIIJJI(int i, String str, Throwable th) {
        Level level;
        if (i == 5) {
            level = Level.WARNING;
        } else {
            level = Level.INFO;
        }
        LIZIZ.log(level, str, th);
    }
}
