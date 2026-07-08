package X;

import com.ss.android.ugc.aweme.net.monitor.OkHttpMonitorInterceptor;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import xlp.c;

/* JADX INFO: renamed from: X.0p1J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1495510p1J {
    public InterfaceC1495620p1U authenticator;
    public int callTimeout;
    public AbstractC842630X3t certificateChainCleaner;
    public C1495680p1a certificatePinner;
    public int connectTimeout;
    public C1495440p1C connectionPool;
    public List<C1495750p1h> connectionSpecs;
    public C0X2Z cookieJar;
    public C1495530p1L dispatcher;
    public InterfaceC1487320oo6 dns;
    public boolean enableBoe;
    public InterfaceC1494090oz1 eventListenerFactory;
    public boolean followRedirects;
    public boolean followSslRedirects;
    public HostnameVerifier hostnameVerifier;
    public final List<InterfaceC836900WsK> interceptors;
    public final List<InterfaceC836900WsK> networkInterceptors;
    public int pingInterval;
    public List<EnumC847200XLi> protocols;
    public Proxy proxy;
    public InterfaceC1495620p1U proxyAuthenticator;
    public ProxySelector proxySelector;
    public int readTimeout;
    public boolean retryOnConnectionFailure;
    public SocketFactory socketFactory;
    public SSLSocketFactory sslSocketFactory;
    public InterfaceC1493790oyX ttnetDns;
    public int writeTimeout;

    public C1495520p1K build() {
        return new C1495520p1K(this);
    }

    public C1495510p1J() {
        ArrayList arrayList = new ArrayList();
        this.interceptors = arrayList;
        this.networkInterceptors = new ArrayList();
        this.dispatcher = new C1495530p1L();
        this.protocols = C1495520p1K.LLJLIL;
        this.connectionSpecs = C1495520p1K.LLJLILLLLZIIL;
        this.eventListenerFactory = AbstractC1494940p0O.factory(AbstractC1494940p0O.NONE);
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.proxySelector = proxySelector;
        if (proxySelector == null) {
            this.proxySelector = new ProxySelector() { // from class: X.0oys
                @Override // java.net.ProxySelector
                public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
                }

                @Override // java.net.ProxySelector
                public final List<Proxy> select(URI uri) {
                    if (uri != null) {
                        return Collections.singletonList(Proxy.NO_PROXY);
                    }
                    throw new IllegalArgumentException("uri must not be null");
                }
            };
        }
        this.cookieJar = C0X2Z.LIZ;
        this.socketFactory = SocketFactory.getDefault();
        this.hostnameVerifier = C0W98.LIZ;
        this.certificatePinner = C1495680p1a.LIZJ;
        C1495630p1V c1495630p1V = InterfaceC1495620p1U.LIZ;
        this.proxyAuthenticator = c1495630p1V;
        this.authenticator = c1495630p1V;
        this.connectionPool = new C1495440p1C();
        this.dns = InterfaceC1487320oo6.LIZ;
        this.followSslRedirects = true;
        this.followRedirects = true;
        this.retryOnConnectionFailure = true;
        this.callTimeout = 0;
        this.connectTimeout = 10000;
        this.readTimeout = 10000;
        this.writeTimeout = 10000;
        this.pingInterval = 0;
        this.ttnetDns = null;
        this.enableBoe = false;
        if (C0X15.LIZ().enable) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (it2.next() instanceof OkHttpMonitorInterceptor) {
                    return;
                }
            }
            addInterceptor(new OkHttpMonitorInterceptor());
        }
    }

    public C1495510p1J(C1495520p1K c1495520p1K) {
        ArrayList arrayList = new ArrayList();
        this.interceptors = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.networkInterceptors = arrayList2;
        this.dispatcher = c1495520p1K.LL;
        this.proxy = c1495520p1K.LLILLJJLI;
        this.protocols = c1495520p1K.LLILLL;
        this.connectionSpecs = c1495520p1K.LLILZ;
        arrayList.addAll(c1495520p1K.LLILZIL);
        arrayList2.addAll(c1495520p1K.LLILZLL);
        this.eventListenerFactory = c1495520p1K.LLIZ;
        this.proxySelector = c1495520p1K.LLIZLLLIL;
        this.cookieJar = c1495520p1K.LLJ;
        this.socketFactory = c1495520p1K.LLJI;
        this.sslSocketFactory = c1495520p1K.LLJIJIL;
        this.certificateChainCleaner = c1495520p1K.LLJILJIL;
        this.hostnameVerifier = c1495520p1K.LLJILJILJ;
        this.certificatePinner = c1495520p1K.LLJILLL;
        this.proxyAuthenticator = c1495520p1K.LLJJ;
        this.authenticator = c1495520p1K.LLJJI;
        this.connectionPool = c1495520p1K.LLJJIII;
        this.dns = c1495520p1K.LLJJIJI;
        this.followSslRedirects = c1495520p1K.LLJJIJIIJIL;
        this.followRedirects = c1495520p1K.LLJJIJIL;
        this.retryOnConnectionFailure = c1495520p1K.LLJJJ;
        this.callTimeout = c1495520p1K.LLJJJIL;
        this.connectTimeout = c1495520p1K.LLJJJJ;
        this.readTimeout = c1495520p1K.LLJJJJJIL;
        this.writeTimeout = c1495520p1K.LLJJJJLIIL;
        this.pingInterval = c1495520p1K.LLJJL;
        this.ttnetDns = c1495520p1K.LLJJLIIIJLLLLLLLZ;
        this.enableBoe = c1495520p1K.LLJL;
    }

    public C1495510p1J addInterceptor(InterfaceC836900WsK interfaceC836900WsK) {
        if (interfaceC836900WsK != null) {
            this.interceptors.add(interfaceC836900WsK);
            return this;
        }
        throw new IllegalArgumentException("interceptor == null");
    }

    public C1495510p1J addNetworkInterceptor(InterfaceC836900WsK interfaceC836900WsK) {
        if (interfaceC836900WsK != null) {
            this.networkInterceptors.add(interfaceC836900WsK);
            return this;
        }
        throw new IllegalArgumentException("interceptor == null");
    }

    public C1495510p1J connectionPool(C1495440p1C c1495440p1C) {
        if (c1495440p1C != null) {
            this.connectionPool = c1495440p1C;
            return this;
        }
        throw new NullPointerException("connectionPool == null");
    }

    public C1495510p1J cookieJar(C0X2Z c0x2z) {
        if (c0x2z != null) {
            this.cookieJar = c0x2z;
            return this;
        }
        throw new NullPointerException("cookieJar == null");
    }

    public C1495510p1J dispatcher(C1495530p1L c1495530p1L) {
        if (c1495530p1L != null) {
            this.dispatcher = c1495530p1L;
            return this;
        }
        throw new IllegalArgumentException("dispatcher == null");
    }

    public C1495510p1J dns(InterfaceC1487320oo6 interfaceC1487320oo6) {
        if (interfaceC1487320oo6 != null) {
            this.dns = interfaceC1487320oo6;
            return this;
        }
        throw new NullPointerException("dns == null");
    }

    public C1495510p1J enableBoe(boolean z) {
        this.enableBoe = z;
        return this;
    }

    public C1495510p1J eventListener(AbstractC1494940p0O abstractC1494940p0O) {
        if (abstractC1494940p0O != null) {
            this.eventListenerFactory = AbstractC1494940p0O.factory(abstractC1494940p0O);
            return this;
        }
        throw new NullPointerException("eventListener == null");
    }

    public C1495510p1J eventListenerFactory(InterfaceC1494090oz1 interfaceC1494090oz1) {
        if (interfaceC1494090oz1 != null) {
            this.eventListenerFactory = interfaceC1494090oz1;
            return this;
        }
        throw new NullPointerException("eventListenerFactory == null");
    }

    public C1495510p1J followRedirects(boolean z) {
        this.followRedirects = z;
        return this;
    }

    public C1495510p1J protocols(List<EnumC847200XLi> list) {
        ArrayList arrayList = new ArrayList(list);
        EnumC847200XLi enumC847200XLi = EnumC847200XLi.H2_PRIOR_KNOWLEDGE;
        if (!arrayList.contains(enumC847200XLi) && !arrayList.contains(EnumC847200XLi.HTTP_1_1)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("protocols must contain h2_prior_knowledge or http/1.1: ");
            sbLIZ.append(arrayList);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (arrayList.contains(enumC847200XLi) && arrayList.size() > 1) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("protocols containing h2_prior_knowledge cannot use other protocols: ");
            sbLIZ2.append(arrayList);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (!arrayList.contains(EnumC847200XLi.HTTP_1_0)) {
            if (!arrayList.contains(null)) {
                arrayList.remove(EnumC847200XLi.SPDY_3);
                this.protocols = Collections.unmodifiableList(arrayList);
                return this;
            }
            throw new IllegalArgumentException("protocols must not contain null");
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("protocols must not contain http/1.0: ");
        sbLIZ3.append(arrayList);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
    }

    public C1495510p1J proxy(Proxy proxy) {
        this.proxy = proxy;
        return this;
    }

    public C1495510p1J retryOnConnectionFailure(boolean z) {
        this.retryOnConnectionFailure = z;
        return this;
    }

    public C1495510p1J ttnetDns(InterfaceC1493790oyX interfaceC1493790oyX) {
        if (interfaceC1493790oyX != null) {
            this.ttnetDns = interfaceC1493790oyX;
            return this;
        }
        throw new NullPointerException("ttnetDns == null");
    }

    public C1495510p1J connectTimeout(long j, TimeUnit timeUnit) {
        this.connectTimeout = c.LIZLLL(timeUnit, j);
        return this;
    }

    public C1495510p1J readTimeout(long j, TimeUnit timeUnit) {
        this.readTimeout = c.LIZLLL(timeUnit, j);
        return this;
    }

    public C1495510p1J writeTimeout(long j, TimeUnit timeUnit) {
        this.writeTimeout = c.LIZLLL(timeUnit, j);
        return this;
    }
}
