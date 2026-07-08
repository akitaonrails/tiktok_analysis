package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import okio.ByteString;
import xlp.c;

/* JADX INFO: renamed from: X.0p1a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1495680p1a {
    public static final C1495680p1a LIZJ = new C1495680p1a(new LinkedHashSet(new C1496170p2N().LIZ), null);
    public final Set<C1496190p2P> LIZ;
    public final AbstractC842630X3t LIZIZ;

    public final int hashCode() {
        AbstractC842630X3t abstractC842630X3t = this.LIZIZ;
        return ((abstractC842630X3t != null ? abstractC842630X3t.hashCode() : 0) * 31) + this.LIZ.hashCode();
    }

    public static String LIZIZ(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sha256/");
            sbLIZ.append(ByteString.of(certificate.getPublicKey().getEncoded()).sha256().base64());
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1495680p1a) {
            C1495680p1a c1495680p1a = (C1495680p1a) obj;
            if (c.LJIIJ(this.LIZIZ, c1495680p1a.LIZIZ) && this.LIZ.equals(c1495680p1a.LIZ)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C1495680p1a(Set<C1496190p2P> set, AbstractC842630X3t abstractC842630X3t) {
        this.LIZ = set;
        this.LIZIZ = abstractC842630X3t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(String str, List<Certificate> list) {
        List listEmptyList = Collections.emptyList();
        Iterator<C1496190p2P> it2 = this.LIZ.iterator();
        if (!it2.hasNext()) {
            if (listEmptyList.isEmpty()) {
                return;
            }
            AbstractC842630X3t abstractC842630X3t = this.LIZIZ;
            if (abstractC842630X3t != 0) {
                list = abstractC842630X3t.LIZ(str, list);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ListProtector.get(list, i);
                if (listEmptyList.size() > 0) {
                    ListProtector.get(listEmptyList, 0).getClass();
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                X509Certificate x509Certificate = (X509Certificate) ListProtector.get(list, i2);
                sb.append("\n    ");
                sb.append(LIZIZ(x509Certificate));
                sb.append(": ");
                sb.append(x509Certificate.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(":");
            int size3 = listEmptyList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                Object obj = ListProtector.get(listEmptyList, i3);
                sb.append("\n    ");
                sb.append(obj);
            }
            throw new SSLPeerUnverifiedException(sb.toString());
        }
        it2.next().getClass();
        throw null;
    }
}
