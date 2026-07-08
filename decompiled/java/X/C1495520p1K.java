package X;

import com.bytedance.helios.network.okhttp.OkHttpMonitorInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Request;
import xlp.c;

/* JADX INFO: renamed from: X.0p1K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1495520p1K implements Cloneable, InterfaceC1496610p35 {
    public static final List<EnumC847200XLi> LLJLIL = c.LJIILJJIL(EnumC847200XLi.HTTP_2, EnumC847200XLi.HTTP_1_1);
    public static final List<C1495750p1h> LLJLILLLLZIIL = c.LJIILJJIL(C1495750p1h.LJ, C1495750p1h.LJFF);
    public final C1495530p1L LL;
    public final Proxy LLILLJJLI;
    public final List<EnumC847200XLi> LLILLL;
    public final List<C1495750p1h> LLILZ;
    public final List<InterfaceC836900WsK> LLILZIL;
    public final List<InterfaceC836900WsK> LLILZLL;
    public final InterfaceC1494090oz1 LLIZ;
    public final ProxySelector LLIZLLLIL;
    public final C0X2Z LLJ;
    public final SocketFactory LLJI;
    public final SSLSocketFactory LLJIJIL;
    public final AbstractC842630X3t LLJILJIL;
    public final HostnameVerifier LLJILJILJ;
    public final C1495680p1a LLJILLL;
    public final InterfaceC1495620p1U LLJJ;
    public final InterfaceC1495620p1U LLJJI;
    public final C1495440p1C LLJJIII;
    public final InterfaceC1487320oo6 LLJJIJI;
    public final boolean LLJJIJIIJIL;
    public final boolean LLJJIJIL;
    public final boolean LLJJJ;
    public final int LLJJJIL;
    public final int LLJJJJ;
    public final int LLJJJJJIL;
    public final int LLJJJJLIIL;
    public final int LLJJL;
    public final InterfaceC1493790oyX LLJJLIIIJLLLLLLLZ;
    public final boolean LLJL;

    static {
        AbstractC1495490p1H.LIZ = new C1495450p1D();
    }

    public C1495520p1K() {
        C1495510p1J c1495510p1J = new C1495510p1J();
        c1495510p1J.addInterceptor(new OkHttpMonitorInterceptor("ezR2SBYqDITzXn81UQKnaoBR+MQ=", false));
        this(c1495510p1J);
    }

    public C1495520p1K(C1495510p1J c1495510p1J) {
        boolean z;
        this.LL = c1495510p1J.dispatcher;
        this.LLILLJJLI = c1495510p1J.proxy;
        this.LLILLL = c1495510p1J.protocols;
        List<C1495750p1h> list = c1495510p1J.connectionSpecs;
        this.LLILZ = list;
        this.LLILZIL = c.LJIILIIL(c1495510p1J.interceptors);
        this.LLILZLL = c.LJIILIIL(c1495510p1J.networkInterceptors);
        this.LLIZ = c1495510p1J.eventListenerFactory;
        this.LLIZLLLIL = c1495510p1J.proxySelector;
        this.LLJ = c1495510p1J.cookieJar;
        this.LLJI = c1495510p1J.socketFactory;
        Iterator<C1495750p1h> it2 = list.iterator();
        loop0: while (true) {
            while (it2.hasNext()) {
                z = z || it2.next().LIZ;
            }
        }
        SSLSocketFactory sSLSocketFactory = c1495510p1J.sslSocketFactory;
        if (sSLSocketFactory == null && z) {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                if (trustManagers.length == 1) {
                    TrustManager trustManager = trustManagers[0];
                    if (trustManager instanceof X509TrustManager) {
                        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                        try {
                            C842670X3x c842670X3x = C842670X3x.LIZ;
                            SSLContext sSLContextLJII = c842670X3x.LJII();
                            sSLContextLJII.init(null, new TrustManager[]{x509TrustManager}, null);
                            this.LLJIJIL = sSLContextLJII.getSocketFactory();
                            this.LLJILJIL = c842670X3x.LIZJ(x509TrustManager);
                        } catch (GeneralSecurityException e) {
                            TryCatchGuardChecker.doCheck(e);
                            throw c.LIZ("No System TLS", e);
                        }
                    }
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unexpected default trust managers:");
                sbLIZ.append(Arrays.toString(trustManagers));
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            } catch (GeneralSecurityException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw c.LIZ("No System TLS", e2);
            }
        }
        this.LLJIJIL = sSLSocketFactory;
        this.LLJILJIL = c1495510p1J.certificateChainCleaner;
        SSLSocketFactory sSLSocketFactory2 = this.LLJIJIL;
        if (sSLSocketFactory2 != null) {
            C842670X3x.LIZ.LJ(sSLSocketFactory2);
        }
        this.LLJILJILJ = c1495510p1J.hostnameVerifier;
        C1495680p1a c1495680p1a = c1495510p1J.certificatePinner;
        AbstractC842630X3t abstractC842630X3t = this.LLJILJIL;
        this.LLJILLL = c.LJIIJ(c1495680p1a.LIZIZ, abstractC842630X3t) ? c1495680p1a : new C1495680p1a(c1495680p1a.LIZ, abstractC842630X3t);
        this.LLJJ = c1495510p1J.proxyAuthenticator;
        this.LLJJI = c1495510p1J.authenticator;
        this.LLJJIII = c1495510p1J.connectionPool;
        this.LLJJIJI = c1495510p1J.dns;
        this.LLJJIJIIJIL = c1495510p1J.followSslRedirects;
        this.LLJJIJIL = c1495510p1J.followRedirects;
        this.LLJJJ = c1495510p1J.retryOnConnectionFailure;
        this.LLJJJIL = c1495510p1J.callTimeout;
        this.LLJJJJ = c1495510p1J.connectTimeout;
        this.LLJJJJJIL = c1495510p1J.readTimeout;
        this.LLJJJJLIIL = c1495510p1J.writeTimeout;
        this.LLJJL = c1495510p1J.pingInterval;
        this.LLJJLIIIJLLLLLLLZ = c1495510p1J.ttnetDns;
        this.LLJL = c1495510p1J.enableBoe;
        if (!this.LLILZIL.contains(null)) {
            if (!this.LLILZLL.contains(null)) {
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Null network interceptor: ");
            sbLIZ2.append(this.LLILZLL);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Null interceptor: ");
        sbLIZ3.append(this.LLILZIL);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ3));
    }

    @Override // X.InterfaceC1496610p35
    public final C1495500p1I LIZ(Request request) {
        return C1495500p1I.LIZJ(this, request, false);
    }

    public final void LIZIZ(Request request, AbstractC1497520p4Y abstractC1497520p4Y) {
        final C1497400p4M c1497400p4M = new C1497400p4M(request, abstractC1497520p4Y, new Random(), this.LLJJL);
        C1495510p1J c1495510p1J = new C1495510p1J(this);
        c1495510p1J.eventListener(AbstractC1494940p0O.NONE);
        c1495510p1J.protocols(C1497400p4M.LJIJJ);
        C1495520p1K c1495520p1KBuild = c1495510p1J.build();
        C0X33 c0x33NewBuilder = c1497400p4M.LIZ.newBuilder();
        c0x33NewBuilder.LIZLLL.LJ("Upgrade", "websocket");
        c0x33NewBuilder.LIZLLL.LJ("Connection", "Upgrade");
        c0x33NewBuilder.LIZLLL.LJ("Sec-WebSocket-Key", c1497400p4M.LJ);
        c0x33NewBuilder.LIZLLL.LJ("Sec-WebSocket-Version", "13");
        final Request requestLIZIZ = c0x33NewBuilder.LIZIZ();
        AbstractC1495490p1H.LIZ.getClass();
        C1495500p1I c1495500p1ILIZJ = C1495500p1I.LIZJ(c1495520p1KBuild, requestLIZIZ, true);
        c1497400p4M.LJFF = c1495500p1ILIZJ;
        c1495500p1ILIZJ.LLILLL.LIZJ = 0L;
        c1495500p1ILIZJ.LJLZ(new InterfaceC1495610p1T() { // from class: X.0p1c
            @Override // X.InterfaceC1495610p1T
            public final void onFailure(InterfaceC1495580p1Q interfaceC1495580p1Q, IOException iOException) {
                c1497400p4M.LIZLLL(iOException, null);
            }

            @Override // X.InterfaceC1495610p1T
            public final void onResponse(InterfaceC1495580p1Q interfaceC1495580p1Q, C0XLY c0xly) {
                try {
                    c1497400p4M.LIZJ(c0xly);
                    AbstractC1495490p1H.LIZ.getClass();
                    C1495430p1B c1495430p1B = ((C1495500p1I) interfaceC1495580p1Q).LLILLJJLI.LIZIZ;
                    c1495430p1B.LJFF();
                    C1495650p1X c1495650p1XLIZIZ = c1495430p1B.LIZIZ();
                    c1495650p1XLIZIZ.getClass();
                    C1495860p1s c1495860p1s = new C1495860p1s(c1495650p1XLIZIZ.LJIIIIZZ, c1495650p1XLIZIZ.LJIIIZ, c1495430p1B);
                    try {
                        C1497400p4M c1497400p4M2 = c1497400p4M;
                        c1497400p4M2.LIZIZ.LJFF(c1497400p4M2);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("OkHttp WebSocket ");
                        sbLIZ.append(requestLIZIZ.url().LJIJJ());
                        c1497400p4M.LJ(C2188811AlT.LIZIZ(sbLIZ), c1495860p1s);
                        c1495430p1B.LIZIZ().LJ.setSoTimeout(0);
                        c1497400p4M.LJFF();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        c1497400p4M.LIZLLL(e, null);
                    }
                } catch (ProtocolException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    c1497400p4M.LIZLLL(e2, c0xly);
                    c.LJ(c0xly);
                }
            }
        });
    }
}
