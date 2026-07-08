package X;

import Y.ARunnableS123S0100000_23;
import Y.ARunnableS27S1200000_23;
import Y.ARunnableS28S1100000_23;
import Y.ARunnableS92S0200000_23;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledFuture;
import okhttp3.Request;
import okio.ByteString;
import xlp.c;

/* JADX INFO: renamed from: X.0p4N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1497410p4N implements InterfaceC1497610p4h, InterfaceC1497590p4f {
    public static final List<EnumC847200XLi> LJIJJLI = Collections.singletonList(EnumC847200XLi.HTTP_1_1);
    public AbstractC1497570p4d LIZ;
    public final Request LIZIZ;
    public final Random LIZJ;
    public final String LIZLLL;
    public final ARunnableS123S0100000_23 LJ;
    public final long LJII;
    public C1495500p1I LJIIIIZZ;
    public C1497420p4O LJIIIZ;
    public C1497440p4Q LJIIJ;
    public C822660WOy LJIIJJI;
    public AbstractC1496390p2j LJIIL;
    public long LJIILIIL;
    public boolean LJIILJJIL;
    public ScheduledFuture<?> LJIILL;
    public String LJIIZILJ;
    public boolean LJIJ;
    public int LJIJI;
    public boolean LJIJJ;
    public final ArrayDeque<ByteString> LJFF = new ArrayDeque<>();
    public final ArrayDeque<Object> LJI = new ArrayDeque<>();
    public int LJIILLIIL = -1;

    public final synchronized void LJII() {
        this.LJIJJ = false;
        AbstractC1497570p4d abstractC1497570p4d = this.LIZ;
        if (abstractC1497570p4d != null) {
            C1497580p4e c1497580p4e = (C1497580p4e) abstractC1497570p4d;
            c1497580p4e.LIZ.LJII(new ARunnableS92S0200000_23(this, c1497580p4e, 88));
        }
    }

    public final void LJFF() throws IOException {
        while (this.LJIILLIIL == -1) {
            C1497420p4O c1497420p4O = this.LJIIIZ;
            c1497420p4O.LIZIZ();
            long j = c1497420p4O.LJI;
            if (j > c1497420p4O.LIZ) {
                try {
                    c1497420p4O.LIZJ.skip(j);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else {
                if (!c1497420p4O.LJIIIIZZ) {
                    int i = c1497420p4O.LJFF;
                    if (i != 1 && i != 2) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Unknown opcode: ");
                        sbLIZ.append(Integer.toHexString(i));
                        throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    while (!c1497420p4O.LJ) {
                        long j2 = c1497420p4O.LJI;
                        if (j2 > 0) {
                            c1497420p4O.LIZJ.LJJJJLI(c1497420p4O.LJIIJ, j2);
                            if (!c1497420p4O.LIZIZ) {
                                c1497420p4O.LJIIJ.LJIILLIIL(c1497420p4O.LJIIL);
                                c1497420p4O.LJIIL.LIZIZ(c1497420p4O.LJIIJ.LLILLJJLI - c1497420p4O.LJI);
                                C1497500p4W.LIZIZ(c1497420p4O.LJIIL, c1497420p4O.LJIIJJI);
                                c1497420p4O.LJIIL.close();
                            }
                        }
                        if (!c1497420p4O.LJII) {
                            while (true) {
                                if (!c1497420p4O.LJ) {
                                    c1497420p4O.LIZIZ();
                                    long j3 = c1497420p4O.LJI;
                                    if (j3 <= c1497420p4O.LIZ) {
                                        if (!c1497420p4O.LJIIIIZZ) {
                                            break;
                                        } else {
                                            c1497420p4O.LIZ();
                                        }
                                    } else {
                                        try {
                                            c1497420p4O.LIZJ.skip(j3);
                                            break;
                                        } catch (Exception e2) {
                                            TryCatchGuardChecker.doCheck(e2);
                                        }
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (c1497420p4O.LJFF != 0) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("Expected continuation opcode. Got: ");
                                sbLIZ2.append(Integer.toHexString(c1497420p4O.LJFF));
                                throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ2));
                            }
                        } else if (i == 1) {
                            InterfaceC1497590p4f interfaceC1497590p4f = c1497420p4O.LIZLLL;
                            String strLJJIZ = c1497420p4O.LJIIJ.LJJIZ();
                            AbstractC1497570p4d abstractC1497570p4d = ((C1497410p4N) interfaceC1497590p4f).LIZ;
                            if (abstractC1497570p4d != null) {
                                C1497580p4e c1497580p4e = (C1497580p4e) abstractC1497570p4d;
                                c1497580p4e.LIZ.LJII(new ARunnableS28S1100000_23(c1497580p4e, strLJJIZ, 28));
                            }
                        } else {
                            InterfaceC1497590p4f interfaceC1497590p4f2 = c1497420p4O.LIZLLL;
                            ByteString byteStringLJIJJ = c1497420p4O.LJIIJ.LJIJJ();
                            AbstractC1497570p4d abstractC1497570p4d2 = ((C1497410p4N) interfaceC1497590p4f2).LIZ;
                            if (abstractC1497570p4d2 != null) {
                                C1497580p4e c1497580p4e2 = (C1497580p4e) abstractC1497570p4d2;
                                c1497580p4e2.LIZ.LJII(new ARunnableS92S0200000_23(byteStringLJIJJ, c1497580p4e2, 87));
                            }
                        }
                    }
                    throw new IOException("closed");
                }
                c1497420p4O.LIZ();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0108  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIJ() {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1497410p4N.LJIIJ():boolean");
    }

    public final Request LJIIIIZZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1497620p4i
    public final boolean LIZ(String str) {
        if (str != null) {
            return LJIIIZ(ByteString.encodeUtf8(str), 1);
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
                    sbLIZ.append(this.LIZLLL);
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
            String strLIZ = C1497500p4W.LIZ(i);
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
                if (!this.LJIJ && !this.LJIILJJIL) {
                    this.LJIILJJIL = true;
                    this.LJI.add(new C1497530p4Z(i, byteStringEncodeUtf8));
                    C822660WOy c822660WOy = this.LJIIJJI;
                    if (c822660WOy != null) {
                        c822660WOy.execute(this.LJ);
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
                if (this.LJIJ) {
                    return;
                }
                this.LJIJ = true;
                AbstractC1496390p2j abstractC1496390p2j = this.LJIIL;
                this.LJIIL = null;
                ScheduledFuture<?> scheduledFuture = this.LJIILL;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                C822660WOy c822660WOy = this.LJIIJJI;
                if (c822660WOy != null) {
                    c822660WOy.shutdown();
                }
                try {
                    AbstractC1497570p4d abstractC1497570p4d = this.LIZ;
                    if (abstractC1497570p4d != null) {
                        abstractC1497570p4d.LIZ(this, exc, c0xly);
                    }
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
                this.LJIIL = c1495860p1s;
                this.LJIIJ = new C1497440p4Q(c1495860p1s.LL, c1495860p1s.LLILLL, this.LIZJ);
                byte[] bArr = c.LIZ;
                this.LJIIJJI = new C822660WOy(1, new ThreadFactoryC1496300p2a(str, false));
                if (!this.LJI.isEmpty() && (c822660WOy = this.LJIIJJI) != null) {
                    c822660WOy.execute(this.LJ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LJIIIZ = new C1497420p4O(c1495860p1s.LL, c1495860p1s.LLILLJJLI, this, this.LJII);
    }

    public final void LJI(int i, String str) {
        AbstractC1496390p2j abstractC1496390p2j;
        String str2;
        C0XLQ c0xlqUrl;
        if (i != -1) {
            synchronized (this) {
                try {
                    if (this.LJIILLIIL == -1) {
                        this.LJIILLIIL = i;
                        this.LJIIZILJ = str;
                        abstractC1496390p2j = null;
                        if (this.LJIILJJIL && this.LJI.isEmpty()) {
                            AbstractC1496390p2j abstractC1496390p2j2 = this.LJIIL;
                            this.LJIIL = null;
                            ScheduledFuture<?> scheduledFuture = this.LJIILL;
                            if (scheduledFuture != null) {
                                scheduledFuture.cancel(false);
                            }
                            this.LJIIJJI.shutdown();
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
                AbstractC1497570p4d abstractC1497570p4d = this.LIZ;
                if (abstractC1497570p4d != null) {
                    C1497580p4e c1497580p4e = (C1497580p4e) abstractC1497570p4d;
                    c1497580p4e.LIZ.LJII(new ARunnableS123S0100000_23(c1497580p4e, 141));
                    if (abstractC1496390p2j != null) {
                        C1497580p4e c1497580p4e2 = (C1497580p4e) this.LIZ;
                        c1497580p4e2.LIZ.getClass();
                        Request requestLJIIIIZZ = LJIIIIZZ();
                        if (requestLJIIIIZZ != null && (c0xlqUrl = requestLJIIIIZZ.url()) != null) {
                            str2 = c0xlqUrl.LJIIIIZZ;
                        } else {
                            str2 = "";
                        }
                        c1497580p4e2.LIZ.LJII(new ARunnableS27S1200000_23(c1497580p4e2, this, str2, i, str, 14));
                    }
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

    public final synchronized boolean LJIIIZ(ByteString byteString, int i) {
        if (this.LJIJ || this.LJIILJJIL) {
            return false;
        }
        if (this.LJIILIIL + ((long) byteString.size()) > 16777216) {
            LIZIZ(1001, null);
            return false;
        }
        this.LJIILIIL += (long) byteString.size();
        this.LJI.add(new C1497550p4b(byteString, i));
        C822660WOy c822660WOy = this.LJIIJJI;
        if (c822660WOy != null) {
            c822660WOy.execute(this.LJ);
        }
        return true;
    }

    public C1497410p4N(Request request, long j, C1497580p4e c1497580p4e, Random random) {
        if ("GET".equals(request.method())) {
            this.LIZIZ = request;
            this.LIZ = c1497580p4e;
            this.LIZJ = random;
            this.LJII = j;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            this.LIZLLL = ByteString.of(bArr).base64();
            this.LJ = new ARunnableS123S0100000_23(this, 150);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Request must be GET: ");
        sbLIZ.append(request.method());
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
