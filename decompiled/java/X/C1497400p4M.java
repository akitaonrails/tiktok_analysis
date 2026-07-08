package X;

import Y.ARunnableS123S0100000_23;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import okhttp3.Request;
import okio.ByteString;
import xlp.c;

/* JADX INFO: renamed from: X.0p4M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1497400p4M implements InterfaceC1497620p4i, InterfaceC1497600p4g {
    public static final List<EnumC847200XLi> LJIJJ = Collections.singletonList(EnumC847200XLi.HTTP_1_1);
    public final Request LIZ;
    public final AbstractC1497520p4Y LIZIZ;
    public final Random LIZJ;
    public final long LIZLLL;
    public final String LJ;
    public C1495500p1I LJFF;
    public final ARunnableS123S0100000_23 LJI;
    public C1497430p4P LJII;
    public C1497450p4R LJIIIIZZ;
    public C822660WOy LJIIIZ;
    public AbstractC1496390p2j LJIIJ;
    public long LJIILIIL;
    public boolean LJIILJJIL;
    public ScheduledFuture<?> LJIILL;
    public boolean LJIIZILJ;
    public int LJIJ;
    public boolean LJIJI;
    public final ArrayDeque<ByteString> LJIIJJI = new ArrayDeque<>();
    public final ArrayDeque<Object> LJIIL = new ArrayDeque<>();
    public int LJIILLIIL = -1;

    public final synchronized void LJII() {
        this.LJIJI = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d9 A[Catch: all -> 0x00ef, TRY_LEAVE, TryCatch #3 {all -> 0x00ef, blocks: (B:25:0x0052, B:26:0x0057, B:28:0x005b, B:30:0x006d, B:31:0x0084, B:38:0x0096, B:39:0x0097, B:40:0x009e, B:41:0x009f, B:43:0x00a3, B:51:0x00bf, B:53:0x00c9, B:54:0x00cc, B:57:0x00d5, B:59:0x00d9, B:64:0x00e6, B:65:0x00e8, B:47:0x00b3, B:49:0x00b9, B:50:0x00be, B:66:0x00e9, B:67:0x00ee, B:32:0x0085, B:33:0x008f, B:56:0x00d2), top: B:81:0x004e, inners: #0, #1 }] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIIZZ() {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1497400p4M.LJIIIIZZ():boolean");
    }

    public final void LJFF() throws IOException {
        while (this.LJIILLIIL == -1) {
            C1497430p4P c1497430p4P = this.LJII;
            c1497430p4P.LIZIZ();
            if (!c1497430p4P.LJII) {
                int i = c1497430p4P.LJ;
                if (i != 1 && i != 2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Unknown opcode: ");
                    sbLIZ.append(Integer.toHexString(i));
                    throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ));
                }
                while (!c1497430p4P.LIZLLL) {
                    long j = c1497430p4P.LJFF;
                    if (j > 0) {
                        c1497430p4P.LIZIZ.LJJJJLI(c1497430p4P.LJIIIZ, j);
                        if (!c1497430p4P.LIZ) {
                            c1497430p4P.LJIIIZ.LJIILLIIL(c1497430p4P.LJIIJJI);
                            c1497430p4P.LJIIJJI.LIZIZ(c1497430p4P.LJIIIZ.LLILLJJLI - c1497430p4P.LJFF);
                            C1497510p4X.LIZIZ(c1497430p4P.LJIIJJI, c1497430p4P.LJIIJ);
                            c1497430p4P.LJIIJJI.close();
                        }
                    }
                    if (!c1497430p4P.LJI) {
                        while (!c1497430p4P.LIZLLL) {
                            c1497430p4P.LIZIZ();
                            if (!c1497430p4P.LJII) {
                                break;
                            } else {
                                c1497430p4P.LIZ();
                            }
                        }
                        if (c1497430p4P.LJ != 0) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("Expected continuation opcode. Got: ");
                            sbLIZ2.append(Integer.toHexString(c1497430p4P.LJ));
                            throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ2));
                        }
                    } else if (i == 1) {
                        InterfaceC1497600p4g interfaceC1497600p4g = c1497430p4P.LIZJ;
                        ((C1497400p4M) interfaceC1497600p4g).LIZIZ.LJ(c1497430p4P.LJIIIZ.LJJIZ());
                    } else {
                        InterfaceC1497600p4g interfaceC1497600p4g2 = c1497430p4P.LIZJ;
                        C1497400p4M c1497400p4M = (C1497400p4M) interfaceC1497600p4g2;
                        c1497400p4M.LIZIZ.LIZLLL(c1497400p4M, c1497430p4P.LJIIIZ.LJIJJ());
                    }
                }
                throw new IOException("closed");
            }
            c1497430p4P.LIZ();
        }
    }

    @Override // X.InterfaceC1497620p4i
    public final boolean LIZ(String str) {
        if (str != null) {
            ByteString byteStringEncodeUtf8 = ByteString.encodeUtf8(str);
            synchronized (this) {
                if (!this.LJIIZILJ && !this.LJIILJJIL) {
                    if (this.LJIILIIL + ((long) byteStringEncodeUtf8.size()) > 16777216) {
                        LIZIZ(1001, null);
                        return false;
                    }
                    this.LJIILIIL += (long) byteStringEncodeUtf8.size();
                    this.LJIIL.add(new C1497560p4c(byteStringEncodeUtf8));
                    C822660WOy c822660WOy = this.LJIIIZ;
                    if (c822660WOy != null) {
                        c822660WOy.execute(this.LJI);
                    }
                    return true;
                }
                return false;
            }
        }
        throw new NullPointerException("text == null");
    }

    public final void LIZJ(C0XLY c0xly) throws ProtocolException {
        if (c0xly.LLILLL == 101) {
            String strLIZ = c0xly.LIZ("Connection", null);
            if ("Upgrade".equalsIgnoreCase(strLIZ)) {
                String strLIZ2 = c0xly.LIZ("Upgrade", null);
                if ("websocket".equalsIgnoreCase(strLIZ2)) {
                    String strLIZ3 = c0xly.LIZ("Sec-WebSocket-Accept", null);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(this.LJ);
                    sbLIZ.append("258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
                    String strBase64 = ByteString.encodeUtf8(C2188811AlT.LIZIZ(sbLIZ)).sha1().base64();
                    if (strBase64.equals(strLIZ3)) {
                        return;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Expected 'Sec-WebSocket-Accept' header value '");
                    sbLIZ2.append(strBase64);
                    sbLIZ2.append("' but was '");
                    sbLIZ2.append(strLIZ3);
                    sbLIZ2.append("'");
                    throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ2));
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Expected 'Upgrade' header value 'websocket' but was '");
                sbLIZ3.append(strLIZ2);
                sbLIZ3.append("'");
                throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ3));
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("Expected 'Connection' header value 'Upgrade' but was '");
            sbLIZ4.append(strLIZ);
            sbLIZ4.append("'");
            throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ4));
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("Expected HTTP 101 response but was '");
        sbLIZ5.append(c0xly.LLILLL);
        sbLIZ5.append(" ");
        sbLIZ5.append(c0xly.LLILZ);
        sbLIZ5.append("'");
        throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ5));
    }

    @Override // X.InterfaceC1497620p4i
    public final boolean LIZIZ(int i, String str) {
        ByteString byteStringEncodeUtf8;
        synchronized (this) {
            String strLIZ = C1497510p4X.LIZ(1001);
            if (strLIZ == null) {
                if (str != null) {
                    byteStringEncodeUtf8 = ByteString.encodeUtf8(str);
                    if (byteStringEncodeUtf8.size() > 123) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("reason.size() > 123: ");
                        sbLIZ.append(str);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else {
                    byteStringEncodeUtf8 = null;
                }
                if (!this.LJIIZILJ && !this.LJIILJJIL) {
                    this.LJIILJJIL = true;
                    this.LJIIL.add(new C1497540p4a(byteStringEncodeUtf8));
                    C822660WOy c822660WOy = this.LJIIIZ;
                    if (c822660WOy != null) {
                        c822660WOy.execute(this.LJI);
                    }
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException(strLIZ);
        }
    }

    public final void LIZLLL(Exception exc, C0XLY c0xly) {
        synchronized (this) {
            try {
                if (this.LJIIZILJ) {
                    return;
                }
                this.LJIIZILJ = true;
                AbstractC1496390p2j abstractC1496390p2j = this.LJIIJ;
                this.LJIIJ = null;
                ScheduledFuture<?> scheduledFuture = this.LJIILL;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                C822660WOy c822660WOy = this.LJIIIZ;
                if (c822660WOy != null) {
                    c822660WOy.shutdown();
                }
                try {
                    this.LIZIZ.LIZJ();
                    c.LJ(abstractC1496390p2j);
                } catch (Throwable th) {
                    c.LJ(abstractC1496390p2j);
                    throw th;
                }
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final void LJ(String str, C1495860p1s c1495860p1s) {
        C822660WOy c822660WOy;
        synchronized (this) {
            try {
                this.LJIIJ = c1495860p1s;
                this.LJIIIIZZ = new C1497450p4R(c1495860p1s.LL, c1495860p1s.LLILLL, this.LIZJ);
                byte[] bArr = c.LIZ;
                C822660WOy c822660WOy2 = new C822660WOy(1, new ThreadFactoryC1496300p2a(str, false));
                this.LJIIIZ = c822660WOy2;
                long j = this.LIZLLL;
                if (j != 0) {
                    c822660WOy2.scheduleAtFixedRate(new Runnable() { // from class: X.0p4S
                        public final void LIZ() {
                            C1497400p4M c1497400p4M = this.LL;
                            synchronized (c1497400p4M) {
                                try {
                                    if (c1497400p4M.LJIIZILJ) {
                                        return;
                                    }
                                    C1497450p4R c1497450p4R = c1497400p4M.LJIIIIZZ;
                                    int i = c1497400p4M.LJIJI ? c1497400p4M.LJIJ : -1;
                                    c1497400p4M.LJIJ++;
                                    c1497400p4M.LJIJI = true;
                                    if (i == -1) {
                                        try {
                                            c1497450p4R.LIZ(ByteString.EMPTY, 9);
                                            return;
                                        } catch (IOException e) {
                                            TryCatchGuardChecker.doCheck(e);
                                            c1497400p4M.LIZLLL(e, null);
                                            return;
                                        }
                                    }
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("sent ping but didn't receive pong within ");
                                    sbLIZ.append(c1497400p4M.LIZLLL);
                                    sbLIZ.append("ms (after ");
                                    sbLIZ.append(i - 1);
                                    sbLIZ.append(" successful ping/pongs)");
                                    c1497400p4M.LIZLLL(new SocketTimeoutException(C2188811AlT.LIZIZ(sbLIZ)), null);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                LIZ();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                if (!C2179971ATj.LIZ(th)) {
                                    throw th;
                                }
                            }
                        }
                    }, j, j, TimeUnit.MILLISECONDS);
                }
                if (!this.LJIIL.isEmpty() && (c822660WOy = this.LJIIIZ) != null) {
                    c822660WOy.execute(this.LJI);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LJII = new C1497430p4P(c1495860p1s.LL, c1495860p1s.LLILLJJLI, this);
    }

    public final void LJI(int i, String str) {
        AbstractC1496390p2j abstractC1496390p2j;
        if (i != -1) {
            synchronized (this) {
                try {
                    if (this.LJIILLIIL == -1) {
                        this.LJIILLIIL = i;
                        abstractC1496390p2j = null;
                        if (this.LJIILJJIL && this.LJIIL.isEmpty()) {
                            AbstractC1496390p2j abstractC1496390p2j2 = this.LJIIJ;
                            this.LJIIJ = null;
                            ScheduledFuture<?> scheduledFuture = this.LJIILL;
                            if (scheduledFuture != null) {
                                scheduledFuture.cancel(false);
                            }
                            this.LJIIIZ.shutdown();
                            abstractC1496390p2j = abstractC1496390p2j2;
                        }
                    } else {
                        throw new IllegalStateException("already closed");
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            try {
                AbstractC1497520p4Y.LIZIZ();
                if (abstractC1496390p2j != null) {
                    this.LIZIZ.LIZ();
                }
                c.LJ(abstractC1496390p2j);
                return;
            } catch (Throwable th) {
                c.LJ(abstractC1496390p2j);
                throw th;
            }
        }
        throw new IllegalArgumentException();
    }

    public C1497400p4M(Request request, AbstractC1497520p4Y abstractC1497520p4Y, Random random, long j) {
        if ("GET".equals(request.method())) {
            this.LIZ = request;
            this.LIZIZ = abstractC1497520p4Y;
            this.LIZJ = random;
            this.LIZLLL = j;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            this.LJ = ByteString.of(bArr).base64();
            this.LJI = new ARunnableS123S0100000_23(this, 99);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Request must be GET: ");
        sbLIZ.append(request.method());
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
