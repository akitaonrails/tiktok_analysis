package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Request;
import xlp.c;

/* JADX INFO: renamed from: X.0p1X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1495650p1X extends AbstractC1496150p2L implements InterfaceC1495030p0X {
    public final C1495440p1C LIZIZ;
    public final C1495560p1O LIZJ;
    public Socket LIZLLL;
    public Socket LJ;
    public C1495740p1g LJFF;
    public EnumC847200XLi LJI;
    public C1495910p1x LJII;
    public C1496670p3B LJIIIIZZ;
    public C1496710p3F LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;
    public int LJIIL = 1;
    public final List<Reference<C1495430p1B>> LJIILIIL = new ArrayList();
    public long LJIILJJIL = Long.MAX_VALUE;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Connection{");
        sbLIZ.append(this.LIZJ.LIZ.LIZ.LIZLLL);
        sbLIZ.append(":");
        sbLIZ.append(this.LIZJ.LIZ.LIZ.LJ);
        sbLIZ.append(", proxy=");
        sbLIZ.append(this.LIZJ.LIZIZ);
        sbLIZ.append(" hostAddress=");
        sbLIZ.append(this.LIZJ.LIZJ);
        sbLIZ.append(" cipherSuite=");
        C1495740p1g c1495740p1g = this.LJFF;
        sbLIZ.append(c1495740p1g != null ? c1495740p1g.LIZIZ : "none");
        sbLIZ.append(" protocol=");
        sbLIZ.append(this.LJI);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1496150p2L
    public final void LIZ(C1495910p1x c1495910p1x) {
        synchronized (this.LIZIZ) {
            try {
                this.LJIIL = c1495910p1x.LJFF();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.AbstractC1496150p2L
    public final void LIZIZ(C1495890p1v c1495890p1v) {
        c1495890p1v.LIZJ(EnumC1496090p2F.REFUSED_STREAM);
    }

    public final boolean LJII(boolean z) {
        if (this.LJ.isClosed() || this.LJ.isInputShutdown() || this.LJ.isOutputShutdown()) {
            return false;
        }
        C1495910p1x c1495910p1x = this.LJII;
        if (c1495910p1x != null) {
            long jNanoTime = System.nanoTime();
            synchronized (c1495910p1x) {
                if (c1495910p1x.LLIZ) {
                    return false;
                }
                if (c1495910p1x.LLJILLL < c1495910p1x.LLJILJILJ) {
                    if (jNanoTime >= c1495910p1x.LLJJ) {
                        return false;
                    }
                }
                return true;
            }
        }
        if (z) {
            try {
                int soTimeout = this.LJ.getSoTimeout();
                try {
                    this.LJ.setSoTimeout(1);
                    if (this.LJIIIIZZ.LJJJJLL()) {
                        this.LJ.setSoTimeout(soTimeout);
                        return false;
                    }
                    this.LJ.setSoTimeout(soTimeout);
                    return true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LJ.setSoTimeout(soTimeout);
                    throw th;
                }
            } catch (SocketTimeoutException e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return false;
            }
        }
        return true;
    }

    public final void LJIIIZ(int i) throws SocketException {
        this.LJ.setSoTimeout(0);
        C1495870p1t c1495870p1t = new C1495870p1t();
        Socket socket = this.LJ;
        String str = this.LIZJ.LIZ.LIZ.LIZLLL;
        C1496670p3B c1496670p3B = this.LJIIIIZZ;
        C1496710p3F c1496710p3F = this.LJIIIZ;
        c1495870p1t.LIZ = socket;
        c1495870p1t.LIZIZ = str;
        c1495870p1t.LIZJ = c1496670p3B;
        c1495870p1t.LIZLLL = c1496710p3F;
        c1495870p1t.LJ = this;
        c1495870p1t.LJII = i;
        C1495910p1x c1495910p1x = new C1495910p1x(c1495870p1t);
        this.LJII = c1495910p1x;
        C1495920p1y c1495920p1y = c1495910p1x.LLJJJ;
        synchronized (c1495920p1y) {
            if (!c1495920p1y.LLILZIL) {
                if (c1495920p1y.LLILLJJLI) {
                    Logger logger = C1495920p1y.LLIZ;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(c.LJIIJJI(">> CONNECTION %s", C1495990p25.LIZ.hex()));
                    }
                    c1495920p1y.LL.write(C1495990p25.LIZ.toByteArray());
                    c1495920p1y.LL.flush();
                }
            } else {
                throw new IOException("closed");
            }
        }
        c1495910p1x.LLJJJ.LJIILLIIL(c1495910p1x.LLJJIJI);
        if (c1495910p1x.LLJJIJI.LIZ() != 65535) {
            c1495910p1x.LLJJJ.LJIJJ(0, r1 - 65535);
        }
        new BPEAThread(c1495910p1x.LLJJJIL).start();
    }

    public final boolean LJIIJ(C0XLQ c0xlq) {
        int i = c0xlq.LJ;
        C0XLQ c0xlq2 = this.LIZJ.LIZ.LIZ;
        if (i != c0xlq2.LJ) {
            return false;
        }
        if (c0xlq.LIZLLL.equals(c0xlq2.LIZLLL)) {
            return true;
        }
        C1495740p1g c1495740p1g = this.LJFF;
        if (c1495740p1g == null || !C0W98.LIZJ(c0xlq.LIZLLL, (X509Certificate) ListProtector.get(c1495740p1g.LIZJ, 0))) {
            return false;
        }
        return true;
    }

    public C1495650p1X(C1495440p1C c1495440p1C, C1495560p1O c1495560p1O) {
        this.LIZIZ = c1495440p1C;
        this.LIZJ = c1495560p1O;
    }

    public final boolean LJI(C1495540p1M c1495540p1M, C1495560p1O c1495560p1O) {
        if (((ArrayList) this.LJIILIIL).size() < this.LJIIL && !this.LJIIJ) {
            C1495450p1D c1495450p1D = AbstractC1495490p1H.LIZ;
            C1495540p1M c1495540p1M2 = this.LIZJ.LIZ;
            c1495450p1D.getClass();
            if (!c1495540p1M2.LIZ(c1495540p1M)) {
                return false;
            }
            if (c1495540p1M.LIZ.LIZLLL.equals(this.LIZJ.LIZ.LIZ.LIZLLL)) {
                return true;
            }
            if (this.LJII == null || c1495560p1O == null || c1495560p1O.LIZIZ.type() != Proxy.Type.DIRECT || this.LIZJ.LIZIZ.type() != Proxy.Type.DIRECT || !this.LIZJ.LIZJ.equals(c1495560p1O.LIZJ) || c1495560p1O.LIZ.LJIIIZ != C0W98.LIZ || !LJIIJ(c1495540p1M.LIZ)) {
                return false;
            }
            try {
                c1495540p1M.LJIIJ.LIZ(c1495540p1M.LIZ.LIZLLL, this.LJFF.LIZJ);
                return true;
            } catch (SSLPeerUnverifiedException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    public final InterfaceC1495410p19 LJIIIIZZ(C1495520p1K c1495520p1K, C1495400p18 c1495400p18, C1495430p1B c1495430p1B) throws SocketException {
        if (this.LJII != null) {
            return new C1495670p1Z(c1495520p1K, c1495400p18, c1495430p1B, this.LJII);
        }
        this.LJ.setSoTimeout(c1495400p18.LJIIIZ);
        C1496250p2V c1496250p2VTimeout = this.LJIIIIZZ.timeout();
        long j = c1495400p18.LJIIIZ;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c1496250p2VTimeout.LJI(j, timeUnit);
        this.LJIIIZ.timeout().LJI(c1495400p18.LJIIJ, timeUnit);
        return new C1495660p1Y(c1495520p1K, c1495430p1B, this.LJIIIIZZ, this.LJIIIZ);
    }

    public final void LIZLLL(int i, int i2, InterfaceC1495580p1Q interfaceC1495580p1Q, AbstractC1494940p0O abstractC1494940p0O) throws IOException {
        Socket socketCreateSocket;
        C1495560p1O c1495560p1O = this.LIZJ;
        Proxy proxy = c1495560p1O.LIZIZ;
        C1495540p1M c1495540p1M = c1495560p1O.LIZ;
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.HTTP) {
            socketCreateSocket = new Socket(proxy);
        } else {
            socketCreateSocket = c1495540p1M.LIZJ.createSocket();
        }
        this.LIZLLL = socketCreateSocket;
        abstractC1494940p0O.connectStart(interfaceC1495580p1Q, this.LIZJ.LIZJ, proxy);
        this.LIZLLL.setSoTimeout(i2);
        try {
            C842670X3x.LIZ.LJI(this.LIZLLL, this.LIZJ.LIZJ, i);
            try {
                Socket socket = this.LIZLLL;
                C0XMI c0xmi = new C0XMI(socket);
                this.LJIIIIZZ = new C1496670p3B(new C1495830p1p(c0xmi, new C1496340p2e(socket.getInputStream(), c0xmi)));
                Socket socket2 = this.LIZLLL;
                C0XMI c0xmi2 = new C0XMI(socket2);
                this.LJIIIZ = new C1496710p3F(new C1496270p2X(c0xmi2, new C1496650p39(socket2.getOutputStream(), c0xmi2)));
            } catch (NullPointerException e) {
                TryCatchGuardChecker.doCheck(e);
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to connect to ");
            sbLIZ.append(this.LIZJ.LIZJ);
            ConnectException connectException = new ConnectException(C2188811AlT.LIZIZ(sbLIZ));
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJFF(C1495730p1f c1495730p1f, int i, InterfaceC1495580p1Q interfaceC1495580p1Q, AbstractC1494940p0O abstractC1494940p0O) throws Throwable {
        SSLSocket sSLSocket;
        EnumC847200XLi enumC847200XLi;
        C1495540p1M c1495540p1M = this.LIZJ.LIZ;
        if (c1495540p1M.LJIIIIZZ == null) {
            List<EnumC847200XLi> list = c1495540p1M.LJ;
            EnumC847200XLi enumC847200XLi2 = EnumC847200XLi.H2_PRIOR_KNOWLEDGE;
            if (list.contains(enumC847200XLi2)) {
                this.LJ = this.LIZLLL;
                this.LJI = enumC847200XLi2;
                LJIIIZ(i);
                return;
            } else {
                this.LJ = this.LIZLLL;
                this.LJI = EnumC847200XLi.HTTP_1_1;
                return;
            }
        }
        abstractC1494940p0O.secureConnectStart(interfaceC1495580p1Q);
        C1495540p1M c1495540p1M2 = this.LIZJ.LIZ;
        SSLSocketFactory sSLSocketFactory = c1495540p1M2.LJIIIIZZ;
        SSLSocket sSLSocket2 = null;
        String strLJIIIIZZ = null;
        try {
            try {
                Socket socket = this.LIZLLL;
                C0XLQ c0xlq = c1495540p1M2.LIZ;
                sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, c0xlq.LIZLLL, c0xlq.LJ, true);
            } catch (AssertionError e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            C1495750p1h c1495750p1hLIZ = c1495730p1f.LIZ(sSLSocket);
            if (c1495750p1hLIZ.LIZIZ) {
                C842670X3x.LIZ.LJFF(sSLSocket, c1495540p1M2.LIZ.LIZLLL, c1495540p1M2.LJ);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            C1495740p1g c1495740p1gLIZ = C1495740p1g.LIZ(session);
            if (!c1495540p1M2.LJIIIZ.verify(c1495540p1M2.LIZ.LIZLLL, session)) {
                List<Certificate> list2 = c1495740p1gLIZ.LIZJ;
                if (!list2.isEmpty()) {
                    X509Certificate x509Certificate = (X509Certificate) list2.get(0);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Hostname ");
                    sbLIZ.append(c1495540p1M2.LIZ.LIZLLL);
                    sbLIZ.append(" not verified:\n    certificate: ");
                    sbLIZ.append(C1495680p1a.LIZIZ(x509Certificate));
                    sbLIZ.append("\n    DN: ");
                    sbLIZ.append(x509Certificate.getSubjectDN().getName());
                    sbLIZ.append("\n    subjectAltNames: ");
                    sbLIZ.append(C0W98.LIZ(x509Certificate));
                    throw new SSLPeerUnverifiedException(C2188811AlT.LIZIZ(sbLIZ));
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Hostname ");
                sbLIZ2.append(c1495540p1M2.LIZ.LIZLLL);
                sbLIZ2.append(" not verified (no certificates)");
                throw new SSLPeerUnverifiedException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            c1495540p1M2.LJIIJ.LIZ(c1495540p1M2.LIZ.LIZLLL, c1495740p1gLIZ.LIZJ);
            if (c1495750p1hLIZ.LIZIZ) {
                strLJIIIIZZ = C842670X3x.LIZ.LJIIIIZZ(sSLSocket);
            }
            this.LJ = sSLSocket;
            C0XMI c0xmi = new C0XMI(sSLSocket);
            this.LJIIIIZZ = new C1496670p3B(new C1495830p1p(c0xmi, new C1496340p2e(sSLSocket.getInputStream(), c0xmi)));
            Socket socket2 = this.LJ;
            C0XMI c0xmi2 = new C0XMI(socket2);
            this.LJIIIZ = new C1496710p3F(new C1496270p2X(c0xmi2, new C1496650p39(socket2.getOutputStream(), c0xmi2)));
            this.LJFF = c1495740p1gLIZ;
            if (strLJIIIIZZ != null) {
                enumC847200XLi = EnumC847200XLi.get(strLJIIIIZZ);
            } else {
                enumC847200XLi = EnumC847200XLi.HTTP_1_1;
            }
            this.LJI = enumC847200XLi;
            C842670X3x.LIZ.LIZ(sSLSocket);
            abstractC1494940p0O.secureConnectEnd(interfaceC1495580p1Q, this.LJFF);
            if (this.LJI == EnumC847200XLi.HTTP_2) {
                LJIIIZ(i);
            }
        } catch (AssertionError e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            if (c.LJIILLIIL(e)) {
                throw new IOException(e);
            }
            throw e;
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            TryCatchGuardChecker.doCheck(th);
            if (sSLSocket2 != null) {
                C842670X3x.LIZ.LIZ(sSLSocket2);
            }
            c.LJFF(sSLSocket2);
            throw th;
        }
    }

    public final void LJ(int i, int i2, int i3, InterfaceC1495580p1Q interfaceC1495580p1Q, AbstractC1494940p0O abstractC1494940p0O) throws IOException {
        C0X33 c0x33 = new C0X33();
        c0x33.LJIIIIZZ(this.LIZJ.LIZ.LIZ);
        c0x33.LIZLLL("CONNECT", null);
        c0x33.LIZLLL.LJ("Host", c.LJIIL(this.LIZJ.LIZ.LIZ, true));
        c0x33.LIZLLL.LJ("Proxy-Connection", "Keep-Alive");
        c0x33.LIZLLL.LJ("User-Agent", "okhttp/3.12.13.21");
        Request requestLIZIZ = c0x33.LIZIZ();
        C0XLX c0xlx = new C0XLX();
        c0xlx.LIZ = requestLIZIZ;
        c0xlx.LIZIZ = EnumC847200XLi.HTTP_1_1;
        c0xlx.LIZJ = 407;
        c0xlx.LIZLLL = "Preemptive Authenticate";
        c0xlx.LJI = c.LIZJ;
        c0xlx.LJIIJ = -1L;
        c0xlx.LJIIJJI = -1L;
        c0xlx.LJFF.LJ("Proxy-Authenticate", "OkHttp-Preemptive");
        c0xlx.LIZ();
        this.LIZJ.LIZ.LIZLLL.getClass();
        C0XLQ c0xlqUrl = requestLIZIZ.url();
        LIZLLL(i, i2, interfaceC1495580p1Q, abstractC1494940p0O);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CONNECT ");
        sbLIZ.append(c.LJIIL(c0xlqUrl, true));
        sbLIZ.append(" HTTP/1.1");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1496670p3B c1496670p3B = this.LJIIIIZZ;
        C1495660p1Y c1495660p1Y = new C1495660p1Y(null, null, c1496670p3B, this.LJIIIZ);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c1496670p3B.timeout().LJI(i2, timeUnit);
        this.LJIIIZ.timeout().LJI(i3, timeUnit);
        c1495660p1Y.LJIIIIZZ(requestLIZIZ.headers(), strLIZIZ);
        c1495660p1Y.LIZLLL();
        C0XLX c0xlxLJFF = c1495660p1Y.LJFF(false);
        c0xlxLJFF.LIZ = requestLIZIZ;
        C0XLY c0xlyLIZ = c0xlxLJFF.LIZ();
        long jLIZ = C842180X2a.LIZ(c0xlyLIZ);
        if (jLIZ == -1) {
            jLIZ = 0;
        }
        C1495720p1e c1495720p1eLJI = c1495660p1Y.LJI(jLIZ);
        c.LJIJ(c1495720p1eLJI, Integer.MAX_VALUE, timeUnit);
        c1495720p1eLJI.close();
        int i4 = c0xlyLIZ.LLILLL;
        if (i4 != 200) {
            if (i4 == 407) {
                this.LIZJ.LIZ.LIZLLL.getClass();
                throw new IOException("Failed to authenticate with proxy");
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Unexpected response code for CONNECT: ");
            sbLIZ2.append(c0xlyLIZ.LLILLL);
            throw new IOException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (this.LJIIIIZZ.LL.LJJJJLL() && this.LJIIIZ.LL.LJJJJLL()) {
        } else {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00af, code lost:
    
        r1 = r18.LIZJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b5, code lost:
    
        if (r1.LIZ.LJIIIIZZ == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bf, code lost:
    
        if (r1.LIZIZ.type() != java.net.Proxy.Type.HTTP) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c3, code lost:
    
        if (r18.LIZLLL != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d1, code lost:
    
        throw new X.C0XLZ(new java.net.ProtocolException("Too many tunnel connections attempted: 21"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0141, code lost:
    
        if (r18.LJII == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0143, code lost:
    
        r1 = r18.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0145, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0146, code lost:
    
        r18.LJIIL = r18.LJII.LJFF();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014e, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0150, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0151, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0155, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0156, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x012a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(int r19, int r20, int r21, int r22, boolean r23, X.InterfaceC1495580p1Q r24, X.AbstractC1494940p0O r25) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1495650p1X.LIZJ(int, int, int, int, boolean, X.0p1Q, X.0p0O):void");
    }
}
