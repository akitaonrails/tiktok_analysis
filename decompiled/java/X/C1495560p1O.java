package X;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: renamed from: X.0p1O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1495560p1O {
    public final C1495540p1M LIZ;
    public final Proxy LIZIZ;
    public final InetSocketAddress LIZJ;
    public final String LIZLLL;

    public final int hashCode() {
        return ((((527 + this.LIZ.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Route{");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1495560p1O) {
            C1495560p1O c1495560p1O = (C1495560p1O) obj;
            if (c1495560p1O.LIZ.equals(this.LIZ) && c1495560p1O.LIZIZ.equals(this.LIZIZ) && c1495560p1O.LIZJ.equals(this.LIZJ)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C1495560p1O(C1495540p1M c1495540p1M, Proxy proxy, InetSocketAddress inetSocketAddress, String str) {
        if (c1495540p1M != null) {
            if (inetSocketAddress != null) {
                this.LIZ = c1495540p1M;
                this.LIZIZ = proxy;
                this.LIZJ = inetSocketAddress;
                this.LIZLLL = str;
                return;
            }
            throw new NullPointerException("inetSocketAddress == null");
        }
        throw new NullPointerException("address == null");
    }
}
