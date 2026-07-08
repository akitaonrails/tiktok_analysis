package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: X.16D1, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public abstract class C16D1 extends C157R implements Runnable, InterfaceC204578153g {
    public final URI LLJ;
    public final C16D0 LLJI;
    public Socket LLJIJIL;
    public OutputStream LLJILJIL;
    public BPEAThread LLJILLL;
    public BPEAThread LLJJ;
    public final int LLJJIJI;
    public final C20738316Dd LLJJIJIIJIL;
    public final Proxy LLJILJILJ = Proxy.NO_PROXY;
    public final CountDownLatch LLJJI = new CountDownLatch(1);
    public final CountDownLatch LLJJIII = new CountDownLatch(1);

    @Override // X.C16D4
    public final void LIZJ() {
    }

    @Override // X.C16D4
    public final void LJII() {
    }

    @Override // X.C16D4
    public final void LJIIJJI() {
    }

    @Override // X.C16D4
    public final void LJIILIIL(InterfaceC204578153g interfaceC204578153g) {
    }

    public abstract void LJJII(Exception exc);

    public final void LJJIII() throws Throwable {
        int i;
        InetSocketAddress inetSocketAddress;
        try {
            boolean zLJJIIJ = LJJIIJ();
            this.LLJIJIL.setTcpNoDelay(false);
            this.LLJIJIL.setReuseAddress(this.LLILLL);
            if (!this.LLJIJIL.isConnected()) {
                if (this.LLJJIJIIJIL == null) {
                    inetSocketAddress = InetSocketAddress.createUnresolved(this.LLJ.getHost(), LJJIFFI());
                } else {
                    C20738316Dd c20738316Dd = this.LLJJIJIIJIL;
                    URI uri = this.LLJ;
                    c20738316Dd.getClass();
                    inetSocketAddress = new InetSocketAddress(InetAddress.getByName(uri.getHost()), LJJIFFI());
                }
                this.LLJIJIL.connect(inetSocketAddress, this.LLJJIJI);
            }
            if (zLJJIIJ && "wss".equals(this.LLJ.getScheme())) {
                LJJIIZ();
            }
            Socket socket = this.LLJIJIL;
            if (socket instanceof SSLSocket) {
                SSLSocket sSLSocket = (SSLSocket) socket;
                SSLParameters sSLParameters = sSLSocket.getSSLParameters();
                sSLParameters.setEndpointIdentificationAlgorithm("HTTPS");
                sSLSocket.setSSLParameters(sSLParameters);
            }
            InputStream inputStream = this.LLJIJIL.getInputStream();
            this.LLJILJIL = this.LLJIJIL.getOutputStream();
            LJJIIJZLJL();
            BPEAThread bPEAThread = this.LLJILLL;
            if (bPEAThread != null) {
                bPEAThread.interrupt();
                try {
                    ThreadMethodProxy.join(this.LLJILLL);
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            BPEAThread bPEAThread2 = new BPEAThread(new Runnable(this) { // from class: X.0p6H
                public final void LIZJ() throws IOException {
                    while (!Thread.interrupted()) {
                        try {
                            ByteBuffer byteBuffer = (ByteBuffer) ((LinkedBlockingQueue) this.LL.LLJI.LLILLJJLI).take();
                            this.LL.LLJILJIL.write(byteBuffer.array(), 0, byteBuffer.limit());
                            this.LL.LLJILJIL.flush();
                        } catch (InterruptedException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            for (ByteBuffer byteBuffer2 : (LinkedBlockingQueue) this.LL.LLJI.LLILLJJLI) {
                                this.LL.LLJILJIL.write(byteBuffer2.array(), 0, byteBuffer2.limit());
                                this.LL.LLJILJIL.flush();
                            }
                            C786410Ut5.u3().interrupt();
                            return;
                        }
                    }
                }

                public final void LIZ() {
                    try {
                        Socket socket2 = this.LL.LLJIJIL;
                        if (socket2 != null) {
                            socket2.close();
                        }
                    } catch (IOException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        this.LL.LJJII(e2);
                    }
                }

                public final void LIZIZ() {
                    Thread threadU3 = C786410Ut5.u3();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("WebSocketWriteThread-");
                    sbLIZ.append(C786410Ut5.u3().getId());
                    ThreadMethodProxy.setName(threadU3, C2188811AlT.LIZIZ(sbLIZ));
                    try {
                        try {
                            LIZJ();
                        } catch (IOException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            C16D1 c16d1 = this.LL;
                            c16d1.getClass();
                            if (e2 instanceof SSLException) {
                                c16d1.LJJII(e2);
                            }
                            c16d1.LLJI.LJIIIIZZ();
                        }
                        LIZ();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        LIZ();
                        throw th;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        LIZIZ();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            });
            this.LLJILLL = bPEAThread2;
            bPEAThread2.start();
            byte[] bArr = new byte[16384];
            while (this.LLJI.LLJ != EnumC199634139c.CLOSING && this.LLJI.LLJ != EnumC199634139c.CLOSED && (i = inputStream.read(bArr)) != -1) {
                try {
                    this.LLJI.LJI(ByteBuffer.wrap(bArr, 0, i));
                } catch (IOException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    if (e2 instanceof SSLException) {
                        LJJII(e2);
                    }
                    this.LLJI.LJIIIIZZ();
                    return;
                } catch (RuntimeException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    LJJII(e3);
                    this.LLJI.LJ(1006, e3.getMessage(), false);
                    return;
                }
            }
            this.LLJI.LJIIIIZZ();
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
            LJJII(e4);
            this.LLJI.LJ(-1, e4.getMessage(), false);
        } catch (InternalError e5) {
            TryCatchGuardChecker.doCheck(e5);
            if (!(e5.getCause() instanceof InvocationTargetException) || !(e5.getCause().getCause() instanceof IOException)) {
                throw e5;
            }
            Exception exc = (Exception) e5.getCause().getCause();
            LJJII(exc);
            this.LLJI.LJ(-1, exc.getMessage(), false);
        }
    }

    @Override // X.InterfaceC204578153g
    public final InetSocketAddress LIZLLL() {
        return this.LLJI.LIZLLL();
    }

    @Override // X.InterfaceC204578153g
    public final InetSocketAddress LJIILJJIL() {
        return this.LLJI.LJIILJJIL();
    }

    @Override // X.C157R
    public final Collection<InterfaceC204578153g> LJIJJ() {
        return Collections.singletonList(this.LLJI);
    }

    public final void LJJI() {
        if (this.LLJJ != null) {
            throw new IllegalStateException("WebSocketClient objects are not reuseable");
        }
        BPEAThread bPEAThread = new BPEAThread(this);
        this.LLJJ = bPEAThread;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WebSocketConnectReadThread-");
        sbLIZ.append(this.LLJJ.getId());
        ThreadMethodProxy.setName(bPEAThread, C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJ.start();
    }

    public final int LJJIFFI() {
        int port = this.LLJ.getPort();
        String scheme = this.LLJ.getScheme();
        if ("wss".equals(scheme)) {
            if (port == -1) {
                return 443;
            }
            return port;
        }
        if ("ws".equals(scheme)) {
            if (port == -1) {
                return 80;
            }
            return port;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unknown scheme: ");
        sbLIZ.append(scheme);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final boolean LJJIIJ() throws IOException {
        if (this.LLJILJILJ != Proxy.NO_PROXY) {
            this.LLJIJIL = new Socket(this.LLJILJILJ);
            return true;
        }
        Socket socket = this.LLJIJIL;
        if (socket == null) {
            this.LLJIJIL = new Socket(this.LLJILJILJ);
            return true;
        }
        if (socket.isClosed()) {
            throw new IOException();
        }
        return false;
    }

    public final void LJJIIJZLJL() throws C16DJ {
        String strLIZIZ;
        String rawPath = this.LLJ.getRawPath();
        String rawQuery = this.LLJ.getRawQuery();
        if (rawPath == null || rawPath.length() == 0) {
            rawPath = "/";
        }
        if (rawQuery != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(rawPath);
            sbLIZ.append('?');
            sbLIZ.append(rawQuery);
            rawPath = C2188811AlT.LIZIZ(sbLIZ);
        }
        int iLJJIFFI = LJJIFFI();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LLJ.getHost());
        if (iLJJIFFI == 80 || iLJJIFFI == 443) {
            strLIZIZ = "";
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(":");
            sbLIZ3.append(iLJJIFFI);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        sbLIZ2.append(strLIZIZ);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        C16DR c16dr = new C16DR();
        if (rawPath == null) {
            throw new IllegalArgumentException("http resource descriptor must not be null");
        }
        c16dr.LIZIZ = rawPath;
        c16dr.LJFF("Host", strLIZIZ2);
        C16D0 c16d0 = this.LLJI;
        c16d0.LLJIJIL.LJII(c16dr);
        c16d0.LLJILLL = c16dr;
        try {
            c16d0.LLILZ.getClass();
            C16D2 c16d2 = c16d0.LLJIJIL;
            C16DZ c16dz = c16d0.LLJILLL;
            c16d2.getClass();
            c16d0.LJIILLIIL(C16D2.LJFF(c16dz));
        } catch (C16DI e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C16DJ("Handshake data rejected by client.");
        } catch (RuntimeException e2) {
            TryCatchGuardChecker.doCheck(e2);
            c16d0.LL.error("Exception in startHandshake", (Throwable) e2);
            c16d0.LLILZ.LJIIZILJ(c16d0, e2);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("rejected because of ");
            sbLIZ4.append(e2);
            throw new C16DJ(C2188811AlT.LIZIZ(sbLIZ4));
        }
    }

    public final void LJJIIZ() throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
        sSLContext.init(null, null, null);
        this.LLJIJIL = sSLContext.getSocketFactory().createSocket(this.LLJIJIL, this.LLJ.getHost(), LJJIFFI(), true);
    }

    @Override // X.InterfaceC204578153g
    public final void close() {
        if (this.LLJILLL != null) {
            this.LLJI.close(LSPassThroughRecordSizeConfig.DEFAULT);
        }
    }

    @Override // X.InterfaceC204578153g
    public final boolean isOpen() {
        return this.LLJI.isOpen();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            LJJIII();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    @Override // X.InterfaceC204578153g
    public final void LIZ(String str) {
        this.LLJI.LIZ(str);
    }

    @Override // X.InterfaceC204578153g
    public final void LIZIZ(String str) {
        this.LLJI.LIZJ(1001, str, false);
    }

    @Override // X.C16D4
    public final InetSocketAddress LJIIIIZZ(InterfaceC204578153g interfaceC204578153g) {
        Socket socket = this.LLJIJIL;
        if (socket != null) {
            return (InetSocketAddress) socket.getLocalSocketAddress();
        }
        return null;
    }

    @Override // X.C16D4
    public final InetSocketAddress LJIIIZ(InterfaceC204578153g interfaceC204578153g) {
        Socket socket = this.LLJIJIL;
        if (socket != null) {
            return (InetSocketAddress) socket.getRemoteSocketAddress();
        }
        return null;
    }

    @Override // X.InterfaceC204578153g
    public final void LJIIL(String str) {
        this.LLJI.LJ(1006, str, false);
    }

    @Override // X.InterfaceC204578153g
    public final void close(int i) {
        this.LLJI.close(1001);
    }

    @Override // X.C16D4
    public final void LJ(String str, InterfaceC204578153g interfaceC204578153g) {
        C16DL c16dl = ((C16D3) this).LLJJIJIL;
        if (c16dl != null) {
            c16dl.LIZLLL();
        }
    }

    @Override // X.C16D4
    public final void LJIIJ(InterfaceC204578153g interfaceC204578153g, C16D5 c16d5) {
        LJIL();
        C16DL c16dl = ((C16D3) this).LLJJIJIL;
        if (c16dl != null) {
            c16dl.LIZ();
        }
        this.LLJJI.countDown();
    }

    @Override // X.C16D4
    public final void LJIIZILJ(InterfaceC204578153g interfaceC204578153g, Exception exc) {
        LJJII(exc);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.16Dd] */
    public C16D1(URI uri, C16D6 c16d6, int i) {
        this.LLJJIJI = 0;
        this.LLJJIJIIJIL = null;
        this.LLJ = uri;
        this.LLJJIJIIJIL = new Object() { // from class: X.16Dd
        };
        this.LLJJIJI = i;
        this.LLILLL = false;
        this.LLJI = new C16D0(this, c16d6);
    }

    @Override // X.C16D4
    public final void LJFF(InterfaceC204578153g interfaceC204578153g, int i, String str, boolean z) {
        LJJ();
        BPEAThread bPEAThread = this.LLJILLL;
        if (bPEAThread != null) {
            bPEAThread.interrupt();
        }
        this.LLJJI.countDown();
        this.LLJJIII.countDown();
    }
}
