package X;

import android.content.Context;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.HttpDns;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import m14.e;
import m14.l;
import m14.m;
import okhttp3.Request;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oyy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1494060oyy extends AbstractC1494220ozE implements WeakHandler.IHandler {
    public C1495520p1K LLIZ;
    public Request LLIZLLLIL;
    public C0XLY LLJ;
    public C1495500p1I LLJI;
    public volatile C1494920p0M LLJIJIL;

    @Override // X.InterfaceC1494830p0D
    public final boolean LIZ(long j) {
        return false;
    }

    @Override // X.InterfaceC1494260ozI
    public final InputStream LJJJIL() {
        return null;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    @Override // X.InterfaceC1494260ozI
    public final String LIZIZ() {
        AbstractC842510X3h abstractC842510X3h;
        C0X0P c0x0pContentType;
        C0XLY c0xly = this.LLJ;
        if (c0xly == null || (abstractC842510X3h = c0xly.LLIZ) == null || (c0x0pContentType = abstractC842510X3h.contentType()) == null) {
            return null;
        }
        return c0x0pContentType.LIZ;
    }

    @Override // X.InterfaceC1494260ozI
    public final InputStream LJJIJIIJIL() {
        AbstractC842510X3h abstractC842510X3h;
        C0XLY c0xly = this.LLJ;
        if (c0xly == null || (abstractC842510X3h = c0xly.LLIZ) == null) {
            return null;
        }
        return abstractC842510X3h.byteStream();
    }

    @Override // X.InterfaceC1494260ozI
    public final int LJJIJIL() {
        C0XLY c0xly = this.LLJ;
        if (c0xly != null) {
            return c0xly.LLILLL;
        }
        return 0;
    }

    @Override // X.InterfaceC1494260ozI
    public final Map<String, List<String>> LJJIJL() {
        C0XLY c0xly = this.LLJ;
        if (c0xly != null) {
            return c0xly.LLILZLL.LJIIIZ();
        }
        return null;
    }

    @Override // X.InterfaceC1494260ozI
    public final String LJJIJLIJ() {
        C0XLY c0xly = this.LLJ;
        if (c0xly != null) {
            return c0xly.LLILZ;
        }
        return null;
    }

    @Override // X.InterfaceC1494260ozI
    public final boolean LJJIL() {
        C0XLY c0xly = this.LLJ;
        if (c0xly == null || c0xly.LLJ == null) {
            return false;
        }
        return c0xly.LLIZLLLIL == null || c0xly.LLILLL == 304;
    }

    @Override // X.InterfaceC1494260ozI
    public final boolean LJJJ() {
        return "gzip".equalsIgnoreCase(this.LLJ.LIZ("Content-Encoding", null));
    }

    @Override // X.InterfaceC1494260ozI
    public final void LJJJI() {
        AbstractC842510X3h abstractC842510X3h;
        C0XLY c0xly = this.LLJ;
        if (c0xly != null && (abstractC842510X3h = c0xly.LLIZ) != null) {
            C1495270p0v.LJI(abstractC842510X3h);
        }
        C1495500p1I c1495500p1I = this.LLJI;
        if (c1495500p1I != null) {
            c1495500p1I.LIZ(-1);
        }
    }

    @Override // X.InterfaceC1494260ozI
    public final long LJJJJ() {
        AbstractC842510X3h abstractC842510X3h;
        C0XLY c0xly = this.LLJ;
        if (c0xly == null || (abstractC842510X3h = c0xly.LLIZ) == null) {
            return 0L;
        }
        return abstractC842510X3h.contentLength();
    }

    @Override // X.InterfaceC1494830p0D
    public final void cancel() {
        C1495500p1I c1495500p1I = this.LLJI;
        if (c1495500p1I == null || c1495500p1I.LLILLJJLI.LIZLLL) {
            return;
        }
        this.LLJIJIL.LJJJJLL.set(true);
        this.LLJI.LIZ(-1);
        this.LLILZ = true;
    }

    @Override // X.AbstractC1494220ozE
    public final boolean LIZLLL() {
        return this.LLILLL;
    }

    @Override // X.AbstractC1494220ozE
    public final Context LJIIJ() {
        return C1493780oyW.LJIIIZ;
    }

    @Override // X.AbstractC1494220ozE
    public final void LJIILIIL() {
    }

    public C1494060oyy(com.bytedance.retrofit2.client.Request request) {
        super(request);
        try {
            C1494600ozq c1494600ozq = this.LLILLJJLI;
            c1494600ozq.LJJIFFI = 1;
            c1494600ozq.LJJIIJZLJL.put("hc", "SsOkHttp3Client");
            this.LLILLJJLI.LJJIIJZLJL.put("hcv", C1493780oyW.LJII);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LLILLJJLI.LJJII = C1493780oyW.LIZIZ;
        this.LLILLJJLI.LJJIII = C1493780oyW.LIZJ;
        C1494600ozq c1494600ozq2 = this.LLILLJJLI;
        C1494570ozn c1494570ozn = c1494600ozq2.LIZLLL;
        c1494570ozn.LJFF = c1494600ozq2.LJJII;
        c1494570ozn.LJI = c1494600ozq2.LJJIII;
        HttpDns.LJ().getClass();
        new WeakHandler(C786410Ut5.W2(HttpDns.LLJJJ), this);
        String url = this.LL.getUrl();
        this.LLJIJIL = new C1494920p0M(this.LLILLJJLI, C1493780oyW.LJIIIZ);
        C1494920p0M c1494920p0M = this.LLJIJIL;
        String method = this.LL.getMethod();
        c1494920p0M.LJJJ = url;
        c1494920p0M.LJJIJLIJ = method;
    }

    @Override // X.AbstractC1494220ozE
    public final IOException LJI(Exception exc) {
        if (exc instanceof C1494460ozc) {
            C1494460ozc c1494460ozc = (C1494460ozc) exc;
            String url = this.LL.getUrl();
            C1494600ozq c1494600ozq = this.LLILLJJLI;
            c1494460ozc.setInfo(false, true, url, c1494600ozq.LJJIJIIJIL, c1494600ozq);
            return c1494460ozc;
        }
        C1494460ozc c1494460ozc2 = new C1494460ozc(exc.getMessage(), exc);
        String url2 = this.LL.getUrl();
        C1494600ozq c1494600ozq2 = this.LLILLJJLI;
        c1494460ozc2.setInfo(false, true, url2, c1494600ozq2.LJJIJIIJIL, c1494600ozq2);
        return c1494460ozc2;
    }

    @Override // X.AbstractC1494220ozE
    public final void LJIIIIZZ(C1494570ozn c1494570ozn) {
        boolean z;
        if (this.LLJI != null) {
            c1494570ozn.getClass();
            long jNanoTime = System.nanoTime();
            c1494570ozn.LJLJI.LIZ.LIZJ = jNanoTime;
            try {
                this.LLJ = this.LLJI.execute();
                C1494920p0M c1494920p0M = this.LLJIJIL;
                C0XLY c0xly = this.LLJ;
                c1494920p0M.getClass();
                boolean z2 = true;
                if (c0xly.LLJ != null) {
                    z = true;
                } else {
                    z = false;
                }
                c1494920p0M.LJJIIJ = z;
                if (c0xly.LLIZLLLIL == null) {
                    z2 = false;
                }
                c1494920p0M.LJJIIJZLJL = z2;
                c1494570ozn.LJIILL(jNanoTime);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c1494570ozn.LJIILL(jNanoTime);
                throw th;
            }
        }
    }

    @Override // X.AbstractC1494220ozE
    public final int LJIIJJI(IOException iOException) {
        return C1494950p0P.LIZJ(iOException);
    }

    @Override // X.AbstractC1494220ozE
    public final void LJIILL(Exception exc) {
        InterfaceC1494080oz0 interfaceC1494080oz0 = C1493780oyW.LJIIJJI;
        if (interfaceC1494080oz0 != null) {
            interfaceC1494080oz0.LIZ(this.LLIZLLLIL, exc);
        }
    }

    @Override // X.AbstractC1494220ozE
    public final void LJIILLIIL(TypedInput typedInput) {
        if (!this.LL.isResponseStreaming() && (typedInput instanceof TypedByteArray)) {
            this.LLILLJJLI.LIZLLL.LJLJI.LIZJ.LIZIZ();
            try {
                C1493240oxe.LJI().LJIIJ(this.LLJ, this.LL.getUrl(), ((TypedByteArray) typedInput).getBytes());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            this.LLILLJJLI.LIZLLL.LJJII();
        }
    }

    public final void LJJIII(C1494600ozq c1494600ozq) {
        long jNanoTime = -1;
        try {
            c1494600ozq.LIZLLL.getClass();
            jNanoTime = System.nanoTime();
            this.LLIZ = C1493780oyW.LIZIZ();
            c1494600ozq.LIZLLL.LJIIJ(jNanoTime);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1494600ozq.LIZLLL.LJIIJ(jNanoTime);
            throw th;
        }
    }

    @Override // X.InterfaceC1494260ozI
    public final String LJJIZ(String str) {
        C0XLY c0xly = this.LLJ;
        if (c0xly == null) {
            return null;
        }
        return c0xly.LIZ(str, null);
    }

    @Override // X.AbstractC1494220ozE
    public final void LJIILJJIL(C1494600ozq c1494600ozq, InterfaceC1494260ozI interfaceC1494260ozI) {
        super.LJIILJJIL(c1494600ozq, interfaceC1494260ozI);
        InterfaceC1494080oz0 interfaceC1494080oz0 = C1493780oyW.LJIIJJI;
        if (interfaceC1494080oz0 != null) {
            interfaceC1494080oz0.LIZIZ(this.LLIZLLLIL, this.LLJ);
        }
    }

    public final void LJJII(com.bytedance.retrofit2.client.Request request, C1494600ozq c1494600ozq, Map<String, String> map) {
        final AbstractC1494940p0O abstractC1494940p0OCreate;
        String strMd5Stub;
        c1494600ozq.LIZLLL.getClass();
        long jNanoTime = System.nanoTime();
        try {
            C1495520p1K c1495520p1K = this.LLIZ;
            c1495520p1K.getClass();
            C1495510p1J c1495510p1J = new C1495510p1J(c1495520p1K);
            T t = c1494600ozq.LIZJ;
            if (t != 0) {
                c1495510p1J.followRedirects(t.LJIILLIIL);
            }
            InterfaceC1494070oyz interfaceC1494070oyz = C1494230ozF.LIZ;
            long j = 15000;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c1495510p1J.connectTimeout(j, timeUnit);
            c1495510p1J.readTimeout(j, timeUnit);
            c1495510p1J.writeTimeout(j, timeUnit);
            c1495510p1J.proxy(C1493780oyW.LIZLLL);
            c1495510p1J.enableBoe(C2109008Oa.LIZJ);
            T t2 = c1494600ozq.LIZJ;
            if (t2 != 0) {
                long j2 = t2.LIZJ;
                if (j2 > 0) {
                    c1495510p1J.connectTimeout(j2, timeUnit);
                }
                long j3 = t2.LJ;
                if (j3 > 0) {
                    c1495510p1J.writeTimeout(j3, timeUnit);
                }
                long j4 = t2.LIZLLL;
                if (j4 > 0) {
                    c1495510p1J.readTimeout(j4, timeUnit);
                }
                this.LLJIJIL.LJJJJJL = t2;
            }
            String url = request.getUrl();
            C1495520p1K c1495520p1K2 = this.LLIZ;
            String strLIZJ = null;
            if (c1495520p1K2.LLIZ != null) {
                C0X33 c0x33 = new C0X33();
                c0x33.LJ(url);
                c0x33.LJII(url);
                abstractC1494940p0OCreate = this.LLIZ.LLIZ.create(C1495500p1I.LIZJ(c1495520p1K2, c0x33.LIZIZ(), false));
            } else {
                abstractC1494940p0OCreate = null;
            }
            final C1494920p0M c1494920p0M = this.LLJIJIL;
            c1495510p1J.eventListener(new AbstractC1494940p0O(abstractC1494940p0OCreate, c1494920p0M) { // from class: X.0p0N
                public final C1494920p0M LIZ;
                public final AbstractC1494940p0O LIZIZ;

                @Override // X.AbstractC1494940p0O
                public final void callEnd(InterfaceC1495580p1Q interfaceC1495580p1Q) {
                    super.callEnd(interfaceC1495580p1Q);
                    AbstractC1494940p0O abstractC1494940p0O = this.LIZIZ;
                    if (abstractC1494940p0O != null) {
                        abstractC1494940p0O.callEnd(interfaceC1495580p1Q);
                    }
                    C1494920p0M c1494920p0M2 = this.LIZ;
                    if (c1494920p0M2.LJIILJJIL.compareAndSet(-1L, System.currentTimeMillis())) {
                        c1494920p0M2.LJJIJL = EnumC1494960p0Q.IDLE;
                        c1494920p0M2.LJJIZ = EnumC1494970p0R.SUCCESS;
                        c1494920p0M2.LJII();
                    }
                }

                @Override // X.AbstractC1494940p0O
                public final void callStart(InterfaceC1495580p1Q interfaceC1495580p1Q) {
                    super.callStart(interfaceC1495580p1Q);
                    AbstractC1494940p0O abstractC1494940p0O = this.LIZIZ;
                    if (abstractC1494940p0O != null) {
                        abstractC1494940p0O.callStart(interfaceC1495580p1Q);
                    }
                    C1494920p0M c1494920p0M2 = this.LIZ;
                    c1494920p0M2.getClass();
                    c1494920p0M2.LIZ = System.currentTimeMillis();
                    c1494920p0M2.LJJIZ = EnumC1494970p0R.IO_PENDING;
                }

                @Override // X.AbstractC1494940p0O
                public final void requestBodyStart(InterfaceC1495580p1Q interfaceC1495580p1Q) {
                    super.requestBodyStart(interfaceC1495580p1Q);
                    AbstractC1494940p0O abstractC1494940p0O = this.LIZIZ;
                    if (abstractC1494940p0O != null) {
                        abstractC1494940p0O.requestBodyStart(interfaceC1495580p1Q);
                    }
                    C1494920p0M c1494920p0M2 = this.LIZ;
                    c1494920p0M2.getClass();
                    c1494920p0M2.LJIIIIZZ = System.currentTimeMillis();
                }

                @Override // X.AbstractC1494940p0O
                public final void requestHeadersStart(InterfaceC1495580p1Q interfaceC1495580p1Q) {
                    super.requestHeadersStart(interfaceC1495580p1Q);
                    AbstractC1494940p0O abstractC1494940p0O = this.LIZIZ;
                    if (abstractC1494940p0O != null) {
                        abstractC1494940p0O.requestHeadersStart(interfaceC1495580p1Q);
                    }
                    C1494920p0M c1494920p0M2 = this.LIZ;
                    c1494920p0M2.getClass();
                    c1494920p0M2.LJJIJL = EnumC1494960p0Q.SENDING_REQUEST;
                    c1494920p0M2.LJI = System.currentTimeMillis();
                }

                @Override // X.AbstractC1494940p0O
                public final void responseBodyStart(InterfaceC1495580p1Q interfaceC1495580p1Q) {
                    super.responseBodyStart(interfaceC1495580p1Q);
                    AbstractC1494940p0O abstractC1494940p0O = this.LIZIZ;
                    if (abstractC1494940p0O != null) {
                        abstractC1494940p0O.responseBodyStart(interfaceC1495580p1Q);
                    }
                    C1494920p0M c1494920p0M2 = this.LIZ;
                    c1494920p0M2.getClass();
                    c1494920p0M2.LJJIJL = EnumC1494960p0Q.READING_RESPONSE;
                    c1494920p0M2.LJIIL = System.currentTimeMillis();
                }

                @Override // X.AbstractC1494940p0O
                public final void responseHeadersStart(InterfaceC1495580p1Q interfaceC1495580p1Q) {
                    super.responseHeadersStart(interfaceC1495580p1Q);
                    AbstractC1494940p0O abstractC1494940p0O = this.LIZIZ;
                    if (abstractC1494940p0O != null) {
                        abstractC1494940p0O.responseHeadersStart(interfaceC1495580p1Q);
                    }
                    C1494920p0M c1494920p0M2 = this.LIZ;
                    c1494920p0M2.getClass();
                    c1494920p0M2.LJIIJ = System.currentTimeMillis();
                }

                @Override // X.AbstractC1494940p0O
                public final void secureConnectStart(InterfaceC1495580p1Q interfaceC1495580p1Q) {
                    super.secureConnectStart(interfaceC1495580p1Q);
                    AbstractC1494940p0O abstractC1494940p0O = this.LIZIZ;
                    if (abstractC1494940p0O != null) {
                        abstractC1494940p0O.secureConnectStart(interfaceC1495580p1Q);
                    }
                    C1494920p0M c1494920p0M2 = this.LIZ;
                    c1494920p0M2.getClass();
                    c1494920p0M2.LJ = System.currentTimeMillis();
                    c1494920p0M2.LJJIJL = EnumC1494960p0Q.SSL_HANDSHAKE;
                }

                {
                    this.LIZIZ = abstractC1494940p0OCreate;
                    this.LIZ = c1494920p0M;
                }

                @Override // X.AbstractC1494940p0O
                public final void callFailed(InterfaceC1495580p1Q interfaceC1495580p1Q, IOException iOException) {
                    super.callFailed(interfaceC1495580p1Q, iOException);
                    AbstractC1494940p0O abstractC1494940p0O = this.LIZIZ;
                    if (abstractC1494940p0O != null) {
                        abstractC1494940p0O.callFailed(interfaceC1495580p1Q, iOException);
                    }
                    C1494920p0M c1494920p0M2 = this.LIZ;
                    if (c1494920p0M2.LJIILJJIL.compareAndSet(-1L, System.currentTimeMillis())) {
                        if (c1494920p0M2.LJJJJLL.get()) {
                            iOException = new IOException("Biz Canceled");
                        }
                        c1494920p0M2.LJJIJL = EnumC1494960p0Q.IDLE;
                        if (iOException != null && !TextUtils.isEmpty(iOException.getMessage()) && iOException.getMessage().contains("Canceled")) {
                            c1494920p0M2.LJJIZ = EnumC1494970p0R.CANCELED;
                        } else {
                            c1494920p0M2.LJJIZ = EnumC1494970p0R.FAILED;
                        }
                        c1494920p0M2.LJJIL = C1494920p0M.LJ(iOException);
                        c1494920p0M2.LJII();
                    }
                }

                @Override // X.AbstractC1494940p0O
                public final void callInSecureRedirect(InterfaceC1495580p1Q interfaceC1495580p1Q, JSONObject jSONObject) {
                    super.callInSecureRedirect(interfaceC1495580p1Q, jSONObject);
                    AbstractC1494940p0O abstractC1494940p0O = this.LIZIZ;
                    if (abstractC1494940p0O != null) {
                        abstractC1494940p0O.callInSecureRedirect(interfaceC1495580p1Q, jSONObject);
                    }
                    InterfaceC1493370oxr interfaceC1493370oxr = C1493780oyW.LJIIIIZZ;
                    if (interfaceC1493370oxr != null) {
                        String strJ3 = C786410Ut5.J3(jSONObject);
                        ICronetAppProvider iCronetAppProvider = ((C1493320oxm) interfaceC1493370oxr).LIZ;
                        if (iCronetAppProvider != null) {
                            iCronetAppProvider.sendAppMonitorEvent(strJ3, "ttnet_insec_rect");
                        }
                    }
                }

                @Override // X.AbstractC1494940p0O
                public final void connectionAcquired(InterfaceC1495580p1Q interfaceC1495580p1Q, InterfaceC1495030p0X interfaceC1495030p0X) {
                    super.connectionAcquired(interfaceC1495580p1Q, interfaceC1495030p0X);
                    AbstractC1494940p0O abstractC1494940p0O = this.LIZIZ;
                    if (abstractC1494940p0O != null) {
                        abstractC1494940p0O.connectionAcquired(interfaceC1495580p1Q, interfaceC1495030p0X);
                    }
                    C1494920p0M c1494920p0M2 = this.LIZ;
                    if (interfaceC1495030p0X != null) {
                        if (c1494920p0M2.LJIILJJIL.get() == -1) {
                            C1495650p1X c1495650p1X = (C1495650p1X) interfaceC1495030p0X;
                            Socket socket = c1495650p1X.LJ;
                            if (socket != null && socket.getInetAddress() != null && c1495650p1X.LJ.getInetAddress().getHostAddress() != null) {
                                c1494920p0M2.LJJIIZ = c1495650p1X.LJ.getInetAddress().getHostAddress();
                            }
                            c1494920p0M2.LJJIIZI = c1495650p1X.LJ;
                        }
                    } else {
                        c1494920p0M2.getClass();
                    }
                    c1494920p0M2.LJIILL = System.currentTimeMillis();
                }

                @Override // X.AbstractC1494940p0O
                public final void connectionReleased(InterfaceC1495580p1Q interfaceC1495580p1Q, InterfaceC1495030p0X interfaceC1495030p0X) {
                    super.connectionReleased(interfaceC1495580p1Q, interfaceC1495030p0X);
                    AbstractC1494940p0O abstractC1494940p0O = this.LIZIZ;
                    if (abstractC1494940p0O != null) {
                        abstractC1494940p0O.connectionReleased(interfaceC1495580p1Q, interfaceC1495030p0X);
                    }
                }

                @Override // X.AbstractC1494940p0O
                public final void dnsStart(InterfaceC1495580p1Q interfaceC1495580p1Q, String str) {
                    super.dnsStart(interfaceC1495580p1Q, str);
                    AbstractC1494940p0O abstractC1494940p0O = this.LIZIZ;
                    if (abstractC1494940p0O != null) {
                        abstractC1494940p0O.dnsStart(interfaceC1495580p1Q, str);
                    }
                    C1494920p0M c1494920p0M2 = this.LIZ;
                    c1494920p0M2.getClass();
                    c1494920p0M2.LIZIZ = System.currentTimeMillis();
                    c1494920p0M2.LJJIJL = EnumC1494960p0Q.RESOLVING_HOST;
                }

                @Override // X.AbstractC1494940p0O
                public final void requestBodyEnd(InterfaceC1495580p1Q interfaceC1495580p1Q, long j5) {
                    super.requestBodyEnd(interfaceC1495580p1Q, j5);
                    AbstractC1494940p0O abstractC1494940p0O = this.LIZIZ;
                    if (abstractC1494940p0O != null) {
                        abstractC1494940p0O.requestBodyEnd(interfaceC1495580p1Q, j5);
                    }
                    C1494920p0M c1494920p0M2 = this.LIZ;
                    c1494920p0M2.getClass();
                    c1494920p0M2.LJIIIZ = System.currentTimeMillis();
                    c1494920p0M2.LJIL = j5;
                }

                @Override // X.AbstractC1494940p0O
                public final void requestHeadersEnd(InterfaceC1495580p1Q interfaceC1495580p1Q, Request request2) {
                    super.requestHeadersEnd(interfaceC1495580p1Q, request2);
                    AbstractC1494940p0O abstractC1494940p0O = this.LIZIZ;
                    if (abstractC1494940p0O != null) {
                        abstractC1494940p0O.requestHeadersEnd(interfaceC1495580p1Q, request2);
                    }
                    C1494920p0M c1494920p0M2 = this.LIZ;
                    c1494920p0M2.getClass();
                    c1494920p0M2.LJII = System.currentTimeMillis();
                    if (request2 != null && c1494920p0M2.LJIILJJIL.get() == -1) {
                        c1494920p0M2.LJJ = request2.headers();
                        if (request2.url() != null) {
                            c1494920p0M2.LJJIII = request2.url().LIZ;
                        }
                    }
                    c1494920p0M2.LJJIJL = EnumC1494960p0Q.WAITING_FOR_RESPONSE;
                }

                @Override // X.AbstractC1494940p0O
                public final void responseBodyEnd(InterfaceC1495580p1Q interfaceC1495580p1Q, long j5) {
                    super.responseBodyEnd(interfaceC1495580p1Q, j5);
                    AbstractC1494940p0O abstractC1494940p0O = this.LIZIZ;
                    if (abstractC1494940p0O != null) {
                        abstractC1494940p0O.responseBodyEnd(interfaceC1495580p1Q, j5);
                    }
                    C1494920p0M c1494920p0M2 = this.LIZ;
                    c1494920p0M2.getClass();
                    c1494920p0M2.LJIILIIL = System.currentTimeMillis();
                    c1494920p0M2.LJJIFFI = j5;
                }

                /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
                @Override // X.AbstractC1494940p0O
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void responseHeadersEnd(X.InterfaceC1495580p1Q r8, X.C0XLY r9) {
                    /*
                        Method dump skipped, instruction units count: 208
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1494930p0N.responseHeadersEnd(X.0p1Q, X.0XLY):void");
                }

                @Override // X.AbstractC1494940p0O
                public final void secureConnectEnd(InterfaceC1495580p1Q interfaceC1495580p1Q, C1495740p1g c1495740p1g) {
                    super.secureConnectEnd(interfaceC1495580p1Q, c1495740p1g);
                    AbstractC1494940p0O abstractC1494940p0O = this.LIZIZ;
                    if (abstractC1494940p0O != null) {
                        abstractC1494940p0O.secureConnectEnd(interfaceC1495580p1Q, c1495740p1g);
                    }
                    C1494920p0M c1494920p0M2 = this.LIZ;
                    c1494920p0M2.getClass();
                    c1494920p0M2.LJFF = System.currentTimeMillis();
                }

                @Override // X.AbstractC1494940p0O
                public final void connectStart(InterfaceC1495580p1Q interfaceC1495580p1Q, InetSocketAddress inetSocketAddress, Proxy proxy) {
                    super.connectStart(interfaceC1495580p1Q, inetSocketAddress, proxy);
                    AbstractC1494940p0O abstractC1494940p0O = this.LIZIZ;
                    if (abstractC1494940p0O != null) {
                        abstractC1494940p0O.connectStart(interfaceC1495580p1Q, inetSocketAddress, proxy);
                    }
                    C1494920p0M c1494920p0M2 = this.LIZ;
                    c1494920p0M2.getClass();
                    c1494920p0M2.LIZLLL = System.currentTimeMillis();
                    c1494920p0M2.LJJIJL = EnumC1494960p0Q.CONNECTING;
                }

                @Override // X.AbstractC1494940p0O
                public final void dnsEnd(InterfaceC1495580p1Q interfaceC1495580p1Q, String str, List<InetAddress> list) {
                    super.dnsEnd(interfaceC1495580p1Q, str, list);
                    AbstractC1494940p0O abstractC1494940p0O = this.LIZIZ;
                    if (abstractC1494940p0O != null) {
                        abstractC1494940p0O.dnsEnd(interfaceC1495580p1Q, str, list);
                    }
                    C1494920p0M c1494920p0M2 = this.LIZ;
                    c1494920p0M2.getClass();
                    c1494920p0M2.LIZJ = System.currentTimeMillis();
                }

                @Override // X.AbstractC1494940p0O
                public final C0XLQ callRedirectDispatch(InterfaceC1495580p1Q interfaceC1495580p1Q, C0XLQ c0xlq, String str, C0XLQ c0xlq2) {
                    ReentrantReadWriteLock.ReadLock lock;
                    String str2;
                    ReentrantReadWriteLock reentrantReadWriteLock;
                    C1489860osC c1489860osC;
                    C1489870osD c1489870osDLIZIZ;
                    if (C1490290ost.LIZ == null) {
                        synchronized (C1490290ost.class) {
                            try {
                                if (C1490290ost.LIZ == null) {
                                    C1490290ost.LIZ = new C1490290ost();
                                }
                            } finally {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                    }
                    C1490290ost c1490290ost = C1490290ost.LIZ;
                    C1494920p0M c1494920p0M2 = this.LIZ;
                    c1490290ost.getClass();
                    if (c0xlq != null && !TextUtils.isEmpty(c0xlq.LIZLLL) && c0xlq2 != null && !TextUtils.isEmpty(c0xlq2.LIZLLL)) {
                        String str3 = c0xlq.LJIIIIZZ;
                        try {
                            reentrantReadWriteLock = C1490290ost.LIZJ;
                            reentrantReadWriteLock.readLock().lock();
                            c1489860osC = C1490290ost.LIZIZ;
                        } catch (Throwable th) {
                            try {
                                lock = C1490290ost.LIZJ.readLock();
                            } catch (Throwable th2) {
                                C1490290ost.LIZJ.readLock().unlock();
                                throw th2;
                            }
                        }
                        if (c1489860osC != null && c1489860osC.LIZ.get() && (c1489870osDLIZIZ = C1490290ost.LIZIZ.LIZIZ(str3)) != null) {
                            if (c1489870osDLIZIZ.LIZ) {
                                lock = reentrantReadWriteLock.readLock();
                                lock.unlock();
                                C0XLQ c0xlqLJIIL = null;
                                try {
                                    e eVarLIZ = l.LJ().LIZ(new m(c0xlq2.LJIIIIZZ, str, new ArrayList()));
                                    if (eVarLIZ != null && C2088908Gh.LIZ(eVarLIZ.LIZ)) {
                                        str2 = eVarLIZ.LIZ;
                                    } else {
                                        str2 = null;
                                    }
                                } catch (Throwable th22) {
                                }
                                if (!TextUtils.isEmpty(str2) && (c0xlqLJIIL = C0XLQ.LJIIL(str2)) != null) {
                                    if (c1494920p0M2 != null) {
                                        C1489590orl c1489590orl = new C1489590orl();
                                        boolean z = true;
                                        c1489590orl.LIZLLL = true;
                                        c1489590orl.LIZIZ = 0L;
                                        c1489590orl.LIZJ = 0;
                                        c1489590orl.LJ = 0;
                                        c1489590orl.LJFF = false;
                                        c1489590orl.LJI = c0xlqLJIIL.LJIIIIZZ;
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("redirect_dispatch_");
                                        sbLIZ.append(c0xlq2.LIZLLL);
                                        c1489590orl.LIZ = C2188811AlT.LIZIZ(sbLIZ);
                                        if (str2.equals(c0xlq2.LJIIIIZZ)) {
                                            z = false;
                                        }
                                        c1494920p0M2.LJIIIIZZ(str, c1489590orl, z);
                                        return c0xlqLJIIL;
                                    }
                                    return c0xlqLJIIL;
                                }
                            }
                        }
                        reentrantReadWriteLock.readLock().unlock();
                        return c0xlq2;
                    }
                    return c0xlq2;
                }

                @Override // X.AbstractC1494940p0O
                public final void connectEnd(InterfaceC1495580p1Q interfaceC1495580p1Q, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC847200XLi enumC847200XLi) {
                    super.connectEnd(interfaceC1495580p1Q, inetSocketAddress, proxy, enumC847200XLi);
                    AbstractC1494940p0O abstractC1494940p0O = this.LIZIZ;
                    if (abstractC1494940p0O != null) {
                        abstractC1494940p0O.connectEnd(interfaceC1495580p1Q, inetSocketAddress, proxy, enumC847200XLi);
                    }
                    C1494920p0M c1494920p0M2 = this.LIZ;
                    c1494920p0M2.getClass();
                    System.currentTimeMillis();
                    if (proxy != null) {
                        c1494920p0M2.LJIJ = proxy.type();
                    }
                }

                @Override // X.AbstractC1494940p0O
                public final void dnsEnd(InterfaceC1495580p1Q interfaceC1495580p1Q, String str, List<InetAddress> list, String str2) {
                    super.dnsEnd(interfaceC1495580p1Q, str, list, str2);
                    AbstractC1494940p0O abstractC1494940p0O = this.LIZIZ;
                    if (abstractC1494940p0O != null) {
                        abstractC1494940p0O.dnsEnd(interfaceC1495580p1Q, str, list);
                    }
                    C1494920p0M c1494920p0M2 = this.LIZ;
                    c1494920p0M2.getClass();
                    c1494920p0M2.LIZJ = System.currentTimeMillis();
                    c1494920p0M2.LJJJJJ = str2;
                }

                @Override // X.AbstractC1494940p0O
                public final void connectFailed(InterfaceC1495580p1Q interfaceC1495580p1Q, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC847200XLi enumC847200XLi, IOException iOException) {
                    super.connectFailed(interfaceC1495580p1Q, inetSocketAddress, proxy, enumC847200XLi, iOException);
                    AbstractC1494940p0O abstractC1494940p0O = this.LIZIZ;
                    if (abstractC1494940p0O != null) {
                        abstractC1494940p0O.connectFailed(interfaceC1495580p1Q, inetSocketAddress, proxy, enumC847200XLi, iOException);
                    }
                }

                @Override // X.AbstractC1494940p0O
                public final void connectFailed(InterfaceC1495580p1Q interfaceC1495580p1Q, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC847200XLi enumC847200XLi, IOException iOException, String str) {
                    super.connectFailed(interfaceC1495580p1Q, inetSocketAddress, proxy, enumC847200XLi, iOException, str);
                    AbstractC1494940p0O abstractC1494940p0O = this.LIZIZ;
                    if (abstractC1494940p0O != null) {
                        abstractC1494940p0O.connectFailed(interfaceC1495580p1Q, inetSocketAddress, proxy, enumC847200XLi, iOException);
                    }
                    C1494920p0M c1494920p0M2 = this.LIZ;
                    c1494920p0M2.getClass();
                    System.currentTimeMillis();
                    if (inetSocketAddress != null && c1494920p0M2.LJIILJJIL.get() == -1) {
                        ((ArrayList) c1494920p0M2.LJIIZILJ).add(new Pair(inetSocketAddress, Integer.valueOf(C1494920p0M.LJ(iOException))));
                    }
                    if (TextUtils.isEmpty(c1494920p0M2.LJJJJJ) && !TextUtils.isEmpty(str)) {
                        c1494920p0M2.LJJJJJ = str;
                    }
                }
            });
            this.LLIZ = c1495510p1J.build();
            ArrayList<C080U> arrayList = new ArrayList();
            if (!request.isBypassDispatch()) {
                try {
                    url = LJJIIJ(url, request.getMethod(), arrayList);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            long jUptimeMillis = SystemClock.uptimeMillis();
            C1489840osA c1489840osA = new C1489840osA();
            if (C1489810os7.LIZ == null) {
                synchronized (C1489810os7.class) {
                    try {
                        if (C1489810os7.LIZ == null) {
                            C1489810os7.LIZ = new C1489810os7();
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
            C1489810os7.LIZ.getClass();
            String strLIZ = C1489810os7.LIZ(url, request, c1489840osA, arrayList2);
            c1489840osA.LJ = SystemClock.uptimeMillis() - jUptimeMillis;
            this.LLJIJIL.LJJJJIZL = c1489840osA;
            boolean zIsEmpty = arrayList2.isEmpty();
            List<C080U> headers = arrayList2;
            if (zIsEmpty) {
                headers = request.getHeaders();
            }
            String strLIZJ2 = C2109008Oa.LIZJ(C1493780oyW.LJIIIZ, strLIZ, headers);
            C0X33 c0x332 = new C0X33();
            c0x332.LJ(strLIZJ2);
            c0x332.LJII(strLIZJ2);
            for (C080U c080u : arrayList) {
                c0x332.LIZ(c080u.LIZ, c080u.LIZIZ);
            }
            if (Logger.debug()) {
                c0x332.LIZ("fallback-reason", C1493780oyW.LIZLLL(request));
            }
            if (!C0X34.LIZ(request.getMethod())) {
                c0x332.LIZLLL(request.getMethod(), null);
            } else {
                String method = request.getMethod();
                final TypedOutput body = request.getBody();
                AbstractC842530X3j requestBody = request.getRequestBody();
                if (requestBody == null) {
                    if (body != null) {
                        final C0X0P c0x0pLIZJ = C0X0P.LIZJ(body.mimeType());
                        requestBody = new AbstractC842530X3j() { // from class: X.0XIx
                            @Override // X.AbstractC842530X3j
                            public final long LIZ() {
                                return body.length();
                            }

                            @Override // X.AbstractC842530X3j
                            public final C0X0P LIZIZ() {
                                return c0x0pLIZJ;
                            }

                            @Override // X.AbstractC842530X3j
                            public final void LJ(InterfaceC1496780p3M interfaceC1496780p3M) {
                                body.writeTo(interfaceC1496780p3M.LLIIL());
                            }
                        };
                    } else {
                        requestBody = AbstractC842530X3j.LIZJ(null, "body=null");
                    }
                }
                c0x332.LIZLLL(method, requestBody);
            }
            if (request.getBody() != null && !request.isPureRequest() && (strMd5Stub = request.getBody().md5Stub()) != null) {
                c0x332.LIZ("X-SS-STUB", strMd5Stub);
            }
            c0x332.LIZ("Accept-Encoding", "gzip");
            for (C080U c080u2 : headers) {
                if (!C2093608Ic.LJ(c080u2.LIZ) && !C2093608Ic.LJ(c080u2.LIZIZ)) {
                    if ("User-Agent".equals(c080u2.LIZ)) {
                        strLIZJ = c080u2.LIZIZ;
                    }
                    c0x332.LIZJ(c080u2.LIZ, c080u2.LIZIZ);
                }
            }
            if (C2093608Ic.LJ(strLIZJ)) {
                strLIZJ = C1494230ozF.LJIILIIL;
                if (!C2093608Ic.LJ(strLIZJ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZJ);
                    sbLIZ.append(" ");
                    sbLIZ.append(C1493780oyW.LJII);
                    strLIZJ = C2188811AlT.LIZIZ(sbLIZ);
                    c0x332.LIZJ("User-Agent", strLIZJ);
                }
            }
            if (C2093608Ic.LJ(strLIZJ)) {
                strLIZJ = C1493780oyW.LIZJ();
                if (!TextUtils.isEmpty(strLIZJ)) {
                    c0x332.LIZJ("User-Agent", strLIZJ);
                }
            }
            try {
                c1494600ozq.LJJIIJZLJL.put("ua", strLIZJ);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            if (map != null && !map.isEmpty()) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                        c0x332.LIZ(key, value);
                    }
                }
            }
            Request requestLIZIZ = c0x332.LIZIZ();
            this.LLIZLLLIL = requestLIZIZ;
            C1495520p1K c1495520p1K3 = this.LLIZ;
            c1495520p1K3.getClass();
            this.LLJI = C1495500p1I.LIZJ(c1495520p1K3, requestLIZIZ, false);
            try {
                c1494600ozq.LJIIZILJ = new URL(strLIZJ2);
            } catch (Exception e3) {
            }
            C1494570ozn c1494570ozn = c1494600ozq.LIZLLL;
            c1494570ozn.LIZ = c1494600ozq.LJIIZILJ;
            c1494570ozn.LJIIIIZZ(jNanoTime);
        } catch (Throwable th) {
            c1494600ozq.LIZLLL.LJIIIIZZ(jNanoTime);
            throw th;
        }
    }

    public final String LJJIIJ(String str, String str2, List<C080U> list) throws Exception {
        String strLIZIZ;
        if (!((ArrayList) l.LJ().LIZLLL).isEmpty()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            e eVarLIZ = l.LJ().LIZ(new m(str, str2, list));
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            if (eVarLIZ != null) {
                this.LLJIJIL.LJIIIZ(jCurrentTimeMillis2 - jCurrentTimeMillis, this.LL.getMethod(), eVarLIZ.LIZ, eVarLIZ.LIZJ, false);
                if (!str.equals(eVarLIZ.LIZ)) {
                    if (eVarLIZ.LIZ.isEmpty() && !((ArrayList) eVarLIZ.LIZIZ).isEmpty()) {
                        this.LLJIJIL.LJJIL = eVarLIZ.LIZLLL;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("ERR_TTNET_TRAFFIC_CONTROL_DROP");
                        if (eVarLIZ.LIZLLL == -555) {
                            strLIZIZ = "";
                        } else {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("_");
                            sbLIZ2.append(-eVarLIZ.LIZLLL);
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        }
                        sbLIZ.append(strLIZIZ);
                        sbLIZ.append(", ");
                        sbLIZ.append(eVarLIZ.LIZLLL);
                        throw new Exception(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    if (C2088908Gh.LIZ(eVarLIZ.LIZ)) {
                        return eVarLIZ.LIZ;
                    }
                }
            }
        } else {
            Logger.debug();
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            String strLIZLLL = l.LJ().LIZLLL(str);
            long jCurrentTimeMillis4 = System.currentTimeMillis();
            if (!str.equals(strLIZLLL) && C2088908Gh.LIZ(strLIZLLL)) {
                this.LLJIJIL.LJIIIZ(jCurrentTimeMillis4 - jCurrentTimeMillis3, this.LL.getMethod(), strLIZLLL, null, true);
                return strLIZLLL;
            }
        }
        return str;
    }

    @Override // X.AbstractC1494220ozE
    public final void LJIIZILJ(String str, com.bytedance.retrofit2.client.Request request, C1494600ozq c1494600ozq, Map<String, String> map) {
        try {
            try {
                c1494600ozq.LIZLLL.LJLJI.LIZ.LIZ = System.nanoTime();
                LJJIII(c1494600ozq);
                LJJII(request, c1494600ozq, map);
                c1494600ozq.LIZLLL.LJJIII();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                throw C1494460ozc.wrapIfNeeded(e, str, c1494600ozq.LJJIJIIJIL, c1494600ozq);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1494600ozq.LIZLLL.LJJIII();
            throw th;
        }
    }
}
