package X;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import xlp.c;

/* JADX INFO: renamed from: X.0p1M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1495540p1M {
    public final C0XLQ LIZ;
    public final InterfaceC1487320oo6 LIZIZ;
    public final SocketFactory LIZJ;
    public final InterfaceC1495620p1U LIZLLL;
    public final List<EnumC847200XLi> LJ;
    public final List<C1495750p1h> LJFF;
    public final ProxySelector LJI;
    public final Proxy LJII;
    public final SSLSocketFactory LJIIIIZZ;
    public final HostnameVerifier LJIIIZ;
    public final C1495680p1a LJIIJ;
    public final InterfaceC1493790oyX LJIIJJI;

    public C1495540p1M() {
        throw null;
    }

    public final int hashCode() {
        int iHashCode = (((((((((((527 + this.LIZ.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31;
        Proxy proxy = this.LJII;
        int iHashCode2 = (iHashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.LJIIIIZZ;
        int iHashCode3 = (iHashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.LJIIIZ;
        int iHashCode4 = (iHashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        C1495680p1a c1495680p1a = this.LJIIJ;
        return iHashCode4 + (c1495680p1a != null ? c1495680p1a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        sb.append(this.LIZ.LIZLLL);
        sb.append(":");
        sb.append(this.LIZ.LJ);
        if (this.LJII != null) {
            sb.append(", proxy=");
            sb.append(this.LJII);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.LJI);
        }
        sb.append("}");
        return sb.toString();
    }

    public final boolean LIZ(C1495540p1M c1495540p1M) {
        if (this.LIZIZ.equals(c1495540p1M.LIZIZ) && this.LIZLLL.equals(c1495540p1M.LIZLLL) && this.LJ.equals(c1495540p1M.LJ) && this.LJFF.equals(c1495540p1M.LJFF) && this.LJI.equals(c1495540p1M.LJI) && c.LJIIJ(this.LJII, c1495540p1M.LJII) && c.LJIIJ(this.LJIIIIZZ, c1495540p1M.LJIIIIZZ) && c.LJIIJ(this.LJIIIZ, c1495540p1M.LJIIIZ) && c.LJIIJ(this.LJIIJ, c1495540p1M.LJIIJ) && this.LIZ.LJ == c1495540p1M.LIZ.LJ) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1495540p1M) {
            C1495540p1M c1495540p1M = (C1495540p1M) obj;
            if (this.LIZ.equals(c1495540p1M.LIZ) && LIZ(c1495540p1M)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C1495540p1M(String str, int i, InterfaceC1487320oo6 interfaceC1487320oo6, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C1495680p1a c1495680p1a, InterfaceC1495620p1U interfaceC1495620p1U, Proxy proxy, List<EnumC847200XLi> list, List<C1495750p1h> list2, ProxySelector proxySelector, InterfaceC1493790oyX interfaceC1493790oyX) {
        String str2;
        C0XLP c0xlp = new C0XLP();
        if (sSLSocketFactory != null) {
            str2 = "https";
        } else {
            str2 = "http";
        }
        c0xlp.LJIIJJI(str2);
        c0xlp.LJFF(str);
        c0xlp.LJII(i);
        this.LIZ = c0xlp.LIZLLL();
        if (interfaceC1487320oo6 != null) {
            this.LIZIZ = interfaceC1487320oo6;
            if (socketFactory != null) {
                this.LIZJ = socketFactory;
                if (interfaceC1495620p1U != null) {
                    this.LIZLLL = interfaceC1495620p1U;
                    if (list != null) {
                        this.LJ = c.LJIILIIL(list);
                        if (list2 != null) {
                            this.LJFF = c.LJIILIIL(list2);
                            if (proxySelector != null) {
                                this.LJI = proxySelector;
                                this.LJII = proxy;
                                this.LJIIIIZZ = sSLSocketFactory;
                                this.LJIIIZ = hostnameVerifier;
                                this.LJIIJ = c1495680p1a;
                                this.LJIIJJI = interfaceC1493790oyX;
                                return;
                            }
                            throw new NullPointerException("proxySelector == null");
                        }
                        throw new NullPointerException("connectionSpecs == null");
                    }
                    throw new NullPointerException("protocols == null");
                }
                throw new NullPointerException("proxyAuthenticator == null");
            }
            throw new NullPointerException("socketFactory == null");
        }
        throw new NullPointerException("dns == null");
    }
}
