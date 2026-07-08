package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import xlp.c;

/* JADX INFO: renamed from: X.0p1f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1495730p1f {
    public final List<C1495750p1h> LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;

    public C1495730p1f(List<C1495750p1h> list) {
        this.LIZ = list;
    }

    public final C1495750p1h LIZ(SSLSocket sSLSocket) throws UnknownServiceException {
        boolean z;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int size = this.LIZ.size();
        for (int i = this.LIZIZ; i < size; i++) {
            C1495750p1h c1495750p1h = (C1495750p1h) ListProtector.get(this.LIZ, i);
            if (c1495750p1h.LIZ(sSLSocket)) {
                this.LIZIZ = i + 1;
                int i2 = this.LIZIZ;
                while (true) {
                    if (i2 < this.LIZ.size()) {
                        if (((C1495750p1h) ListProtector.get(this.LIZ, i2)).LIZ(sSLSocket)) {
                            z = true;
                            break;
                        }
                        i2++;
                    } else {
                        z = false;
                        break;
                    }
                }
                this.LIZJ = z;
                C1495450p1D c1495450p1D = AbstractC1495490p1H.LIZ;
                boolean z2 = this.LIZLLL;
                c1495450p1D.getClass();
                if (c1495750p1h.LIZJ != null) {
                    enabledCipherSuites = c.LJIILL(C1495760p1i.LIZIZ, sSLSocket.getEnabledCipherSuites(), c1495750p1h.LIZJ);
                } else {
                    enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                }
                if (c1495750p1h.LIZLLL != null) {
                    enabledProtocols = c.LJIILL(c.LJIILJJIL, sSLSocket.getEnabledProtocols(), c1495750p1h.LIZLLL);
                } else {
                    enabledProtocols = sSLSocket.getEnabledProtocols();
                }
                String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
                C1496120p2I c1496120p2I = C1495760p1i.LIZIZ;
                byte[] bArr = c.LIZ;
                int length = supportedCipherSuites.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        if (c1496120p2I.compare(supportedCipherSuites[i3], "TLS_FALLBACK_SCSV") == 0) {
                            break;
                        }
                        i3++;
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                if (z2 && i3 != -1) {
                    String str = supportedCipherSuites[i3];
                    int length2 = enabledCipherSuites.length + 1;
                    String[] strArr = new String[length2];
                    System.arraycopy(enabledCipherSuites, 0, strArr, 0, enabledCipherSuites.length);
                    strArr[length2 - 1] = str;
                    enabledCipherSuites = strArr;
                }
                C1495770p1j c1495770p1j = new C1495770p1j(c1495750p1h);
                c1495770p1j.LIZ(enabledCipherSuites);
                c1495770p1j.LIZJ(enabledProtocols);
                C1495750p1h c1495750p1h2 = new C1495750p1h(c1495770p1j);
                String[] strArr2 = c1495750p1h2.LIZLLL;
                if (strArr2 != null) {
                    sSLSocket.setEnabledProtocols(strArr2);
                }
                String[] strArr3 = c1495750p1h2.LIZJ;
                if (strArr3 != null) {
                    sSLSocket.setEnabledCipherSuites(strArr3);
                }
                return c1495750p1h;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unable to find acceptable protocols. isFallback=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", modes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", supported protocols=");
        sbLIZ.append(Arrays.toString(sSLSocket.getEnabledProtocols()));
        throw new UnknownServiceException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
