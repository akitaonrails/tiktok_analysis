package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: X.16D0, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16D0 implements InterfaceC204578153g {
    public final C13AX LL;
    public final BlockingQueue<ByteBuffer> LLILLJJLI;
    public final BlockingQueue<ByteBuffer> LLILLL;
    public final C16D4 LLILZ;
    public SelectionKey LLILZIL;
    public ByteChannel LLILZLL;
    public C20737716Cx LLIZ;
    public boolean LLIZLLLIL;
    public volatile EnumC199634139c LLJ;
    public final List<C16D2> LLJI;
    public C16D2 LLJIJIL;
    public final EnumC19524111a3 LLJILJIL;
    public ByteBuffer LLJILJILJ;
    public C16DZ LLJILLL;
    public String LLJJ;
    public Integer LLJJI;
    public Boolean LLJJIII;
    public long LLJJIJI;
    public final Object LLJJIJIIJIL;

    @Override // X.InterfaceC204578153g
    public final InetSocketAddress LIZLLL() {
        return this.LLILZ.LJIIIZ(this);
    }

    public final void LJIIIIZZ() {
        if (this.LLJ == EnumC199634139c.NOT_YET_CONNECTED) {
            LJ(-1, "", true);
            return;
        }
        if (this.LLIZLLLIL) {
            LJ(this.LLJJI.intValue(), this.LLJJ, this.LLJJIII.booleanValue());
            return;
        }
        if (this.LLJIJIL.LJI() == EnumC994310byv.NONE) {
            LJ(LSPassThroughRecordSizeConfig.DEFAULT, "", true);
            return;
        }
        if (this.LLJIJIL.LJI() != EnumC994310byv.ONEWAY) {
            LJ(1006, "", true);
        } else if (this.LLJILJIL == EnumC19524111a3.SERVER) {
            LJ(1006, "", true);
        } else {
            LJ(LSPassThroughRecordSizeConfig.DEFAULT, "", true);
        }
    }

    @Override // X.InterfaceC204578153g
    public final InetSocketAddress LJIILJJIL() {
        return this.LLILZ.LJIIIIZZ(this);
    }

    @Override // X.InterfaceC204578153g
    public final void close() {
        close(LSPassThroughRecordSizeConfig.DEFAULT);
    }

    @Override // X.InterfaceC204578153g
    public final boolean isOpen() {
        return this.LLJ == EnumC199634139c.OPEN;
    }

    public final String toString() {
        return super.toString();
    }

    public static ByteBuffer LJIIJ(int i) {
        String str;
        if (i != 404) {
            str = "500 Internal Server Error";
        } else {
            str = "404 WebSocket Upgrade Failure";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HTTP/1.1 ");
        sbLIZ.append(str);
        sbLIZ.append("\r\nContent-Type: text/html\r\nServer: TooTallNate Java-WebSocket\r\nContent-Length: ");
        sbLIZ.append(str.length() + 48);
        sbLIZ.append("\r\n\r\n<html><head></head><body><h1>");
        sbLIZ.append(str);
        sbLIZ.append("</h1></body></html>");
        return ByteBuffer.wrap(C2188811AlT.LIZIZ(sbLIZ).getBytes(StandardCharsets.US_ASCII));
    }

    @Override // X.InterfaceC204578153g
    public final void LIZ(String str) {
        boolean z;
        if (str != null) {
            C16D2 c16d2 = this.LLJIJIL;
            if (this.LLJILJIL == EnumC19524111a3.CLIENT) {
                z = true;
            } else {
                z = false;
            }
            LJIILIIL(c16d2.LJ(str, z));
            return;
        }
        throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
    }

    @Override // X.InterfaceC204578153g
    public final void LIZIZ(String str) {
        LIZJ(1001, str, false);
    }

    public final void LJFF(C16DI c16di) {
        LJIILL(LJIIJ(404));
        LJIIIZ(c16di.getCloseCode(), c16di.getMessage(), false);
    }

    public final void LJI(ByteBuffer byteBuffer) throws Throwable {
        ByteBuffer byteBuffer2;
        C16D5 c16d5LJIIL;
        String str;
        if (this.LL.isTraceEnabled()) {
            C13AX c13ax = this.LL;
            Integer numValueOf = Integer.valueOf(byteBuffer.remaining());
            if (byteBuffer.remaining() > 1000) {
                str = "too big to display";
            } else {
                str = new String(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining());
            }
            c13ax.trace("process({}): ({})", numValueOf, str);
        }
        if (this.LLJ != EnumC199634139c.NOT_YET_CONNECTED) {
            if (this.LLJ == EnumC199634139c.OPEN) {
                LJII(byteBuffer);
                return;
            }
            return;
        }
        if (this.LLJILJILJ.capacity() == 0) {
            byteBuffer2 = byteBuffer;
        } else {
            if (this.LLJILJILJ.remaining() < byteBuffer.remaining()) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.LLJILJILJ.capacity() + byteBuffer.remaining());
                this.LLJILJILJ.flip();
                byteBufferAllocate.put(this.LLJILJILJ);
                this.LLJILJILJ = byteBufferAllocate;
            }
            this.LLJILJILJ.put(byteBuffer);
            this.LLJILJILJ.flip();
            byteBuffer2 = this.LLJILJILJ;
        }
        byteBuffer2.mark();
        try {
            try {
                EnumC19524111a3 enumC19524111a3 = this.LLJILJIL;
                if (enumC19524111a3 == EnumC19524111a3.SERVER) {
                    C16D2 c16d2 = this.LLJIJIL;
                    if (c16d2 == null) {
                        Iterator<C16D2> it2 = this.LLJI.iterator();
                        while (it2.hasNext()) {
                            C16D6 c16d6LIZJ = it2.next().LIZJ();
                            try {
                                c16d6LIZJ.LIZ = this.LLJILJIL;
                                byteBuffer2.reset();
                                c16d5LJIIL = c16d6LIZJ.LJIIL(byteBuffer2);
                            } catch (C16DJ e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            if (!(c16d5LJIIL instanceof C16DX)) {
                                this.LL.trace("Closing due to wrong handshake");
                                LJFF(new C16DI(1002, "wrong http function"));
                                return;
                            }
                            C16DX c16dx = (C16DX) c16d5LJIIL;
                            if (c16d6LIZJ.LIZIZ(c16dx) == EnumC994240byo.MATCHED) {
                                c16dx.LIZJ();
                                try {
                                    ((C157S) this.LLILZ).getClass();
                                    C16DS c16ds = new C16DS();
                                    c16d6LIZJ.LJIJJLI(c16dx, c16ds);
                                    LJIILLIIL(C16D2.LJFF(c16ds));
                                    this.LLJIJIL = c16d6LIZJ;
                                    LJIIJJI(c16dx);
                                } catch (C16DI e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                    this.LL.trace("Closing due to wrong handshake. Possible handshake rejection", (Throwable) e2);
                                    LJFF(e2);
                                    return;
                                } catch (RuntimeException e3) {
                                    TryCatchGuardChecker.doCheck(e3);
                                    this.LL.error("Closing due to internal server error", (Throwable) e3);
                                    this.LLILZ.LJIIZILJ(this, e3);
                                    LJIILL(LJIIJ(500));
                                    LJIIIZ(-1, e3.getMessage(), false);
                                    return;
                                }
                            }
                        }
                        if (this.LLJIJIL != null) {
                            return;
                        }
                        this.LL.trace("Closing due to protocol error: no draft matches");
                        LJFF(new C16DI(1002, "no draft matches"));
                        return;
                    }
                    C16D5 c16d5LJIIL2 = c16d2.LJIIL(byteBuffer2);
                    if (!(c16d5LJIIL2 instanceof C16DX)) {
                        this.LL.trace("Closing due to protocol error: wrong http function");
                        LJIIIZ(1002, "wrong http function", false);
                        return;
                    }
                    C16DX c16dx2 = (C16DX) c16d5LJIIL2;
                    if (this.LLJIJIL.LIZIZ(c16dx2) == EnumC994240byo.MATCHED) {
                        LJIIJJI(c16dx2);
                    } else {
                        this.LL.trace("Closing due to protocol error: the handshake did finally not match");
                        LIZJ(1002, "the handshake did finally not match", false);
                        return;
                    }
                } else {
                    if (enumC19524111a3 != EnumC19524111a3.CLIENT) {
                        return;
                    }
                    C16D2 c16d22 = this.LLJIJIL;
                    c16d22.LIZ = enumC19524111a3;
                    C16D5 c16d5LJIIL3 = c16d22.LJIIL(byteBuffer2);
                    if (!(c16d5LJIIL3 instanceof C16DY)) {
                        this.LL.trace("Closing due to protocol error: wrong http function");
                        LJIIIZ(1002, "wrong http function", false);
                        return;
                    }
                    C16DY c16dy = (C16DY) c16d5LJIIL3;
                    if (this.LLJIJIL.LIZ(this.LLJILLL, c16dy) == EnumC994240byo.MATCHED) {
                        try {
                            this.LLILZ.getClass();
                            LJIIJJI(c16dy);
                        } catch (C16DI e4) {
                            TryCatchGuardChecker.doCheck(e4);
                            this.LL.trace("Closing due to invalid data exception. Possible handshake rejection", (Throwable) e4);
                            LJIIIZ(e4.getCloseCode(), e4.getMessage(), false);
                            return;
                        } catch (RuntimeException e5) {
                            TryCatchGuardChecker.doCheck(e5);
                            this.LL.error("Closing since client was never connected", (Throwable) e5);
                            this.LLILZ.LJIIZILJ(this, e5);
                            LJIIIZ(-1, e5.getMessage(), false);
                            return;
                        }
                    } else {
                        this.LL.trace("Closing due to protocol error: draft {} refuses handshake", this.LLJIJIL);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("draft ");
                        sbLIZ.append(this.LLJIJIL);
                        sbLIZ.append(" refuses handshake");
                        LIZJ(1002, C2188811AlT.LIZIZ(sbLIZ), false);
                        return;
                    }
                }
                if (this.LLJ == EnumC199634139c.CLOSING || this.LLJ == EnumC199634139c.CLOSED) {
                    return;
                }
                if (byteBuffer.hasRemaining()) {
                    LJII(byteBuffer);
                } else {
                    if (!this.LLJILJILJ.hasRemaining()) {
                        return;
                    }
                    LJII(this.LLJILJILJ);
                }
            } catch (C16DJ e6) {
                TryCatchGuardChecker.doCheck(e6);
                this.LL.trace("Closing due to invalid handshake", (Throwable) e6);
                LIZJ(e6.getCloseCode(), e6.getMessage(), false);
            }
        } catch (C16DM e7) {
            TryCatchGuardChecker.doCheck(e7);
            if (this.LLJILJILJ.capacity() == 0) {
                byteBuffer2.reset();
                int preferredSize = e7.getPreferredSize();
                if (preferredSize == 0) {
                    preferredSize = byteBuffer2.capacity() + 16;
                }
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(preferredSize);
                this.LLJILJILJ = byteBufferAllocate2;
                byteBufferAllocate2.put(byteBuffer);
                return;
            }
            ByteBuffer byteBuffer3 = this.LLJILJILJ;
            byteBuffer3.position(byteBuffer3.limit());
            ByteBuffer byteBuffer4 = this.LLJILJILJ;
            byteBuffer4.limit(byteBuffer4.capacity());
        }
    }

    public final void LJII(ByteBuffer byteBuffer) throws Throwable {
        try {
            for (C16DG c16dg : this.LLJIJIL.LJIIJJI(byteBuffer)) {
                this.LL.trace("matched frame: {}", c16dg);
                this.LLJIJIL.LJIIIIZZ(this, c16dg);
            }
        } catch (C16DH e) {
            TryCatchGuardChecker.doCheck(e);
            if (e.getLimit() == Integer.MAX_VALUE) {
                this.LL.error("Closing due to invalid size of frame", (Throwable) e);
                this.LLILZ.LJIIZILJ(this, e);
            }
            LIZJ(e.getCloseCode(), e.getMessage(), false);
        } catch (C16DI e2) {
            TryCatchGuardChecker.doCheck(e2);
            this.LL.error("Closing due to invalid data in frame", (Throwable) e2);
            this.LLILZ.LJIIZILJ(this, e2);
            LIZJ(e2.getCloseCode(), e2.getMessage(), false);
        } catch (LinkageError e3) {
            e = e3;
            TryCatchGuardChecker.doCheck(e);
            this.LL.error("Got fatal error during frame processing");
            throw e;
        } catch (ThreadDeath e4) {
            e = e4;
            TryCatchGuardChecker.doCheck(e);
            this.LL.error("Got fatal error during frame processing");
            throw e;
        } catch (VirtualMachineError e5) {
            e = e5;
            TryCatchGuardChecker.doCheck(e);
            this.LL.error("Got fatal error during frame processing");
            throw e;
        } catch (Error e6) {
            TryCatchGuardChecker.doCheck(e6);
            this.LL.error("Closing web socket due to an error during frame processing");
            this.LLILZ.LJIIZILJ(this, new Exception(e6));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Got error ");
            sbLIZ.append(e6.getClass().getName());
            LIZJ(1011, C2188811AlT.LIZIZ(sbLIZ), false);
        }
    }

    public final void LJIIJJI(C16D5 c16d5) {
        this.LL.trace("open using draft: {}", this.LLJIJIL);
        this.LLJ = EnumC199634139c.OPEN;
        this.LLJJIJI = System.nanoTime();
        try {
            this.LLILZ.LJIIJ(this, c16d5);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILZ.LJIIZILJ(this, e);
        }
    }

    @Override // X.InterfaceC204578153g
    public final void LJIIL(String str) {
        LJ(1006, str, false);
    }

    public final void LJIILIIL(Collection<C16DG> collection) {
        if (isOpen()) {
            if (collection != null) {
                ArrayList arrayList = new ArrayList();
                for (C16DG c16dg : collection) {
                    this.LL.trace("send frame: {}", c16dg);
                    arrayList.add(this.LLJIJIL.LIZLLL(c16dg));
                }
                LJIILLIIL(arrayList);
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new RuntimeException() { // from class: X.16DW
            public static final long serialVersionUID = -785314021592982715L;
        };
    }

    public final void LJIILL(ByteBuffer byteBuffer) {
        String str;
        C13AX c13ax = this.LL;
        Integer numValueOf = Integer.valueOf(byteBuffer.remaining());
        if (byteBuffer.remaining() > 1000) {
            str = "too big to display";
        } else {
            str = new String(byteBuffer.array());
        }
        c13ax.trace("write({}): {}", numValueOf, str);
        this.LLILLJJLI.add(byteBuffer);
        this.LLILZ.LJIILIIL(this);
    }

    public final void LJIILLIIL(List<ByteBuffer> list) {
        synchronized (this.LLJJIJIIJIL) {
            try {
                Iterator<ByteBuffer> it2 = list.iterator();
                while (it2.hasNext()) {
                    LJIILL(it2.next());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC204578153g
    public final void close(int i) {
        LIZJ(i, "", false);
    }

    public C16D0(C16D4 c16d4, C16D6 c16d6) {
        this.LL = C13AD.LIZIZ(C16D0.class);
        this.LLIZLLLIL = false;
        this.LLJ = EnumC199634139c.NOT_YET_CONNECTED;
        this.LLJIJIL = null;
        this.LLJILJILJ = ByteBuffer.allocate(0);
        this.LLJILLL = null;
        this.LLJJ = null;
        this.LLJJI = null;
        this.LLJJIII = null;
        this.LLJJIJI = System.nanoTime();
        this.LLJJIJIIJIL = new Object();
        if (c16d4 != null && (c16d6 != null || this.LLJILJIL != EnumC19524111a3.SERVER)) {
            this.LLILLJJLI = new LinkedBlockingQueue();
            this.LLILLL = new LinkedBlockingQueue();
            this.LLILZ = c16d4;
            this.LLJILJIL = EnumC19524111a3.CLIENT;
            if (c16d6 != null) {
                this.LLJIJIL = c16d6.LIZJ();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("parameters must not be null");
    }

    public C16D0(C16D4 c16d4, List<C16D2> list) {
        this(c16d4, (C16D6) null);
        this.LLJILJIL = EnumC19524111a3.SERVER;
        if (list != null && !list.isEmpty()) {
            this.LLJI = list;
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.LLJI = arrayList;
        arrayList.add(new C16D6());
    }

    public final synchronized void LIZJ(int i, String str, boolean z) {
        String str2;
        EnumC199634139c enumC199634139c = this.LLJ;
        EnumC199634139c enumC199634139c2 = EnumC199634139c.CLOSING;
        if (enumC199634139c != enumC199634139c2 && this.LLJ != EnumC199634139c.CLOSED) {
            if (this.LLJ == EnumC199634139c.OPEN) {
                if (i == 1006) {
                    this.LLJ = enumC199634139c2;
                    LJIIIZ(i, str, false);
                    return;
                }
                if (this.LLJIJIL.LJI() != EnumC994310byv.NONE) {
                    try {
                        if (!z) {
                            try {
                                this.LLILZ.LJII();
                            } catch (RuntimeException e) {
                                TryCatchGuardChecker.doCheck(e);
                                this.LLILZ.LJIIZILJ(this, e);
                            }
                        }
                        if (isOpen()) {
                            C16D7 c16d7 = new C16D7();
                            if (str != null) {
                                str2 = str;
                            } else {
                                str2 = "";
                            }
                            c16d7.LJIIIIZZ = str2;
                            c16d7.LJIIIIZZ();
                            c16d7.LJII = i;
                            if (i == 1015) {
                                c16d7.LJII = 1005;
                                c16d7.LJIIIIZZ = "";
                            }
                            c16d7.LJIIIIZZ();
                            c16d7.LJI();
                            LJIILIIL(Collections.singletonList(c16d7));
                        }
                    } catch (C16DI e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        this.LL.error("generated frame is invalid", (Throwable) e2);
                        this.LLILZ.LJIIZILJ(this, e2);
                        LJIIIZ(1006, "generated frame is invalid", false);
                    }
                }
                LJIIIZ(i, str, z);
            } else if (i != -3) {
                if (i == 1002) {
                    LJIIIZ(i, str, z);
                } else {
                    LJIIIZ(-1, str, false);
                }
            } else {
                LJIIIZ(-3, str, true);
            }
            this.LLJ = EnumC199634139c.CLOSING;
            this.LLJILJILJ = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0063 A[Catch: all -> 0x006f, TryCatch #2 {, blocks: (B:3:0x0001, B:7:0x0009, B:11:0x0013, B:12:0x0017, B:14:0x001b, B:15:0x001e, B:17:0x0022, B:25:0x0050, B:28:0x005f, B:30:0x0063, B:31:0x0066, B:27:0x0057, B:19:0x0027, B:21:0x0030, B:23:0x003c, B:24:0x0044), top: B:41:0x0001, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LJ(int r4, java.lang.String r5, boolean r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            X.139c r1 = r3.LLJ     // Catch: java.lang.Throwable -> L6f
            X.139c r0 = X.EnumC199634139c.CLOSED     // Catch: java.lang.Throwable -> L6f
            if (r1 != r0) goto L9
            monitor-exit(r3)
            return
        L9:
            X.139c r1 = r3.LLJ     // Catch: java.lang.Throwable -> L6f
            X.139c r0 = X.EnumC199634139c.OPEN     // Catch: java.lang.Throwable -> L6f
            if (r1 != r0) goto L17
            r0 = 1006(0x3ee, float:1.41E-42)
            if (r4 != r0) goto L17
            X.139c r0 = X.EnumC199634139c.CLOSING     // Catch: java.lang.Throwable -> L6f
            r3.LLJ = r0     // Catch: java.lang.Throwable -> L6f
        L17:
            java.nio.channels.SelectionKey r0 = r3.LLILZIL     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L1e
            r0.cancel()     // Catch: java.lang.Throwable -> L6f
        L1e:
            java.nio.channels.ByteChannel r0 = r3.LLILZLL     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L50
            r0.close()     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L6f
            goto L50
        L26:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = r2.getMessage()     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L44
            java.lang.String r1 = r2.getMessage()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = "Broken pipe"
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L44
            X.13AX r1 = r3.LL     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = "Caught IOException: Broken pipe during closeConnection()"
            r1.trace(r0, r2)     // Catch: java.lang.Throwable -> L6f
            goto L50
        L44:
            X.13AX r1 = r3.LL     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = "Exception during channel.close()"
            r1.error(r0, r2)     // Catch: java.lang.Throwable -> L6f
            X.16D4 r0 = r3.LLILZ     // Catch: java.lang.Throwable -> L6f
            r0.LJIIZILJ(r3, r2)     // Catch: java.lang.Throwable -> L6f
        L50:
            X.16D4 r0 = r3.LLILZ     // Catch: java.lang.RuntimeException -> L56 java.lang.Throwable -> L6f
            r0.LJFF(r3, r4, r5, r6)     // Catch: java.lang.RuntimeException -> L56 java.lang.Throwable -> L6f
            goto L5f
        L56:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L6f
            X.16D4 r0 = r3.LLILZ     // Catch: java.lang.Throwable -> L6f
            r0.LJIIZILJ(r3, r1)     // Catch: java.lang.Throwable -> L6f
        L5f:
            X.16D2 r0 = r3.LLJIJIL     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L66
            r0.LJIIJ()     // Catch: java.lang.Throwable -> L6f
        L66:
            r0 = 0
            r3.LLJILLL = r0     // Catch: java.lang.Throwable -> L6f
            X.139c r0 = X.EnumC199634139c.CLOSED     // Catch: java.lang.Throwable -> L6f
            r3.LLJ = r0     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r3)
            return
        L6f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16D0.LJ(int, java.lang.String, boolean):void");
    }

    public final synchronized void LJIIIZ(int i, String str, boolean z) {
        if (this.LLIZLLLIL) {
            return;
        }
        this.LLJJI = Integer.valueOf(i);
        this.LLJJ = str;
        this.LLJJIII = Boolean.valueOf(z);
        this.LLIZLLLIL = true;
        this.LLILZ.LJIILIIL(this);
        try {
            this.LLILZ.LJIIJJI();
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LL.error("Exception in onWebsocketClosing", (Throwable) e);
            this.LLILZ.LJIIZILJ(this, e);
        }
        C16D2 c16d2 = this.LLJIJIL;
        if (c16d2 != null) {
            c16d2.LJIIJ();
        }
        this.LLJILLL = null;
    }
}
