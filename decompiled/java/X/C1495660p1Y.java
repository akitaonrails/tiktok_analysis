package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import okhttp3.Request;
import xlp.c;

/* JADX INFO: renamed from: X.0p1Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1495660p1Y implements InterfaceC1495410p19 {
    public final C1495520p1K LIZ;
    public final C1495430p1B LIZIZ;
    public final InterfaceC1496620p36 LIZJ;
    public final InterfaceC1496780p3M LIZLLL;
    public int LJ;
    public long LJFF = 262144;

    @Override // X.InterfaceC1495410p19
    public final void LIZ() {
        this.LIZLLL.flush();
    }

    @Override // X.InterfaceC1495410p19
    public final void LIZLLL() {
        this.LIZLLL.flush();
    }

    public final C0X1V LJII() {
        C0X1U c0x1u = new C0X1U();
        while (true) {
            String strLJLJLLL = this.LIZJ.LJLJLLL(this.LJFF);
            this.LJFF -= (long) strLJLJLLL.length();
            if (strLJLJLLL.length() == 0) {
                return new C0X1V(c0x1u);
            }
            AbstractC1495490p1H.LIZ.getClass();
            int iIndexOf = strLJLJLLL.indexOf(":", 1);
            if (iIndexOf != -1) {
                c0x1u.LIZIZ(strLJLJLLL.substring(0, iIndexOf), strLJLJLLL.substring(iIndexOf + 1));
            } else if (strLJLJLLL.startsWith(":")) {
                c0x1u.LIZIZ("", strLJLJLLL.substring(1));
            } else {
                c0x1u.LIZIZ("", strLJLJLLL);
            }
        }
    }

    @Override // X.InterfaceC1495410p19
    public final void cancel() {
        C1495650p1X c1495650p1XLIZIZ = this.LIZIZ.LIZIZ();
        if (c1495650p1XLIZIZ != null) {
            c.LJFF(c1495650p1XLIZIZ.LIZLLL);
        }
    }

    @Override // X.InterfaceC1495410p19
    public final void LIZIZ(Request request) {
        Proxy.Type type = this.LIZIZ.LIZIZ().LIZJ.LIZIZ.type();
        StringBuilder sb = new StringBuilder();
        sb.append(request.method());
        sb.append(' ');
        if (!request.isHttps() && type == Proxy.Type.HTTP) {
            sb.append(request.url());
        } else {
            sb.append(C0XLT.LIZ(request.url()));
        }
        sb.append(" HTTP/1.1");
        LJIIIIZZ(request.headers(), sb.toString());
    }

    @Override // X.InterfaceC1495410p19
    public final C842200X2c LJ(C0XLY c0xly) {
        C1495430p1B c1495430p1B = this.LIZIZ;
        c1495430p1B.LJFF.responseBodyStart(c1495430p1B.LJ);
        String strLIZ = c0xly.LIZ("Content-Type", null);
        if (!C842180X2a.LIZIZ(c0xly)) {
            return new C842200X2c(strLIZ, 0L, new C1496670p3B(LJI(0L)));
        }
        if ("chunked".equalsIgnoreCase(c0xly.LIZ("Transfer-Encoding", null))) {
            final C0XLQ c0xlqUrl = c0xly.LL.url();
            if (this.LJ == 4) {
                this.LJ = 5;
                return new C842200X2c(strLIZ, -1L, new C1496670p3B(new AbstractC1495800p1m(c0xlqUrl) { // from class: X.0p1b
                    public final C0XLQ LLILZIL;
                    public long LLILZLL;
                    public boolean LLIZ;

                    @Override // X.InterfaceC842570X3n, java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        if (this.LLILLJJLI) {
                            return;
                        }
                        if (this.LLIZ) {
                            try {
                            } catch (IOException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            if (!c.LJIJ(this, 100, TimeUnit.MILLISECONDS)) {
                                LIZ(null, false);
                            }
                        }
                        this.LLILLJJLI = true;
                    }

                    {
                        super(this.LLIZLLLIL);
                        this.LLILZLL = -1L;
                        this.LLIZ = true;
                        this.LLILZIL = c0xlqUrl;
                    }

                    @Override // X.AbstractC1495800p1m, X.InterfaceC842570X3n
                    public final long read(C1496690p3D c1496690p3D, long j) throws IOException {
                        if (j >= 0) {
                            if (!this.LLILLJJLI) {
                                if (!this.LLIZ) {
                                    return -1L;
                                }
                                long j2 = this.LLILZLL;
                                if (j2 == 0 || j2 == -1) {
                                    if (j2 != -1) {
                                        this.LLIZLLLIL.LIZJ.LJLLJ();
                                    }
                                    try {
                                        this.LLILZLL = this.LLIZLLLIL.LIZJ.LJJJIL();
                                        String strTrim = this.LLIZLLLIL.LIZJ.LJLLJ().trim();
                                        if (this.LLILZLL >= 0 && (strTrim.isEmpty() || strTrim.startsWith(";"))) {
                                            if (this.LLILZLL == 0) {
                                                this.LLIZ = false;
                                                C1495660p1Y c1495660p1Y = this.LLIZLLLIL;
                                                C842180X2a.LIZLLL(c1495660p1Y.LIZ.LLJ, this.LLILZIL, c1495660p1Y.LJII());
                                                LIZ(null, true);
                                            }
                                            if (!this.LLIZ) {
                                                return -1L;
                                            }
                                        } else {
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("expected chunk size and optional extensions but was \"");
                                            sbLIZ.append(this.LLILZLL);
                                            sbLIZ.append(strTrim);
                                            sbLIZ.append("\"");
                                            throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ));
                                        }
                                    } catch (NumberFormatException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        throw new ProtocolException(e.getMessage());
                                    }
                                }
                                long j3 = super.read(c1496690p3D, Math.min(j, this.LLILZLL));
                                if (j3 != -1) {
                                    this.LLILZLL -= j3;
                                    return j3;
                                }
                                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                                LIZ(protocolException, false);
                                throw protocolException;
                            }
                            throw new IllegalStateException("closed");
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("byteCount < 0: ");
                        sbLIZ2.append(j);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }));
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("state: ");
            sbLIZ.append(this.LJ);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        long jLIZ = C842180X2a.LIZ(c0xly);
        if (jLIZ != -1) {
            return new C842200X2c(strLIZ, jLIZ, new C1496670p3B(LJI(jLIZ)));
        }
        if (this.LJ == 4) {
            C1495430p1B c1495430p1B2 = this.LIZIZ;
            if (c1495430p1B2 != null) {
                this.LJ = 5;
                c1495430p1B2.LJFF();
                return new C842200X2c(strLIZ, -1L, new C1496670p3B(new AbstractC1495800p1m(this) { // from class: X.0p1l
                    public boolean LLILZIL;

                    @Override // X.InterfaceC842570X3n, java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        if (this.LLILLJJLI) {
                            return;
                        }
                        if (!this.LLILZIL) {
                            LIZ(null, false);
                        }
                        this.LLILLJJLI = true;
                    }

                    {
                        super(this);
                    }

                    @Override // X.AbstractC1495800p1m, X.InterfaceC842570X3n
                    public final long read(C1496690p3D c1496690p3D, long j) throws IOException {
                        if (j >= 0) {
                            if (!this.LLILLJJLI) {
                                if (this.LLILZIL) {
                                    return -1L;
                                }
                                long j2 = super.read(c1496690p3D, j);
                                if (j2 == -1) {
                                    this.LLILZIL = true;
                                    LIZ(null, true);
                                    return -1L;
                                }
                                return j2;
                            }
                            throw new IllegalStateException("closed");
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("byteCount < 0: ");
                        sbLIZ2.append(j);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }));
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("state: ");
        sbLIZ2.append(this.LJ);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.InterfaceC1495410p19
    public final C0XLX LJFF(boolean z) {
        int i = this.LJ;
        if (i != 1 && i != 3) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("state: ");
            sbLIZ.append(this.LJ);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            String strLJLJLLL = this.LIZJ.LJLJLLL(this.LJFF);
            this.LJFF -= (long) strLJLJLLL.length();
            C0X50 c0x50LIZ = C0X50.LIZ(strLJLJLLL);
            C0XLX c0xlx = new C0XLX();
            c0xlx.LIZIZ = c0x50LIZ.LIZ;
            c0xlx.LIZJ = c0x50LIZ.LIZIZ;
            c0xlx.LIZLLL = c0x50LIZ.LIZJ;
            c0xlx.LJFF = LJII().LJI();
            if (z && c0x50LIZ.LIZIZ == 100) {
                return null;
            }
            if (c0x50LIZ.LIZIZ == 100) {
                this.LJ = 3;
                return c0xlx;
            }
            this.LJ = 4;
            return c0xlx;
        } catch (EOFException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("unexpected end of stream on ");
            sbLIZ2.append(this.LIZIZ);
            IOException iOException = new IOException(C2188811AlT.LIZIZ(sbLIZ2));
            iOException.initCause(e);
            throw iOException;
        }
    }

    public final C1495720p1e LJI(long j) {
        if (this.LJ == 4) {
            this.LJ = 5;
            return new C1495720p1e(this, j);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("state: ");
        sbLIZ.append(this.LJ);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1495410p19
    public final InterfaceC1495590p1R LIZJ(Request request, final long j) {
        if ("chunked".equalsIgnoreCase(request.header("Transfer-Encoding"))) {
            if (this.LJ == 1) {
                this.LJ = 2;
                return new InterfaceC1495590p1R() { // from class: X.0p1o
                    public final C1496240p2U LL;
                    public boolean LLILLJJLI;

                    @Override // X.InterfaceC1495590p1R, java.io.Closeable, java.lang.AutoCloseable
                    public final synchronized void close() {
                        if (this.LLILLJJLI) {
                            return;
                        }
                        this.LLILLJJLI = true;
                        this.LLILLL.LIZLLL.LJLLILLLL("0\r\n\r\n");
                        C1495660p1Y c1495660p1Y = this.LLILLL;
                        C1496240p2U c1496240p2U = this.LL;
                        c1495660p1Y.getClass();
                        C1496250p2V c1496250p2V = c1496240p2U.LJ;
                        c1496240p2U.LJ = C1496250p2V.LIZLLL;
                        c1496250p2V.LIZ();
                        c1496250p2V.LIZIZ();
                        this.LLILLL.LJ = 3;
                    }

                    @Override // X.InterfaceC1495590p1R, java.io.Flushable
                    public final synchronized void flush() {
                        if (this.LLILLJJLI) {
                            return;
                        }
                        this.LLILLL.LIZLLL.flush();
                    }

                    @Override // X.InterfaceC1495590p1R
                    public final C1496250p2V timeout() {
                        return this.LL;
                    }

                    {
                        this.LL = new C1496240p2U(this.LLILLL.LIZLLL.timeout());
                    }

                    @Override // X.InterfaceC1495590p1R
                    public final void LLFF(C1496690p3D c1496690p3D, long j2) {
                        if (!this.LLILLJJLI) {
                            if (j2 == 0) {
                                return;
                            }
                            this.LLILLL.LIZLLL.LJJLIIIJJI(j2);
                            this.LLILLL.LIZLLL.LJLLILLLL("\r\n");
                            this.LLILLL.LIZLLL.LLFF(c1496690p3D, j2);
                            this.LLILLL.LIZLLL.LJLLILLLL("\r\n");
                            return;
                        }
                        throw new IllegalStateException("closed");
                    }
                };
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("state: ");
            sbLIZ.append(this.LJ);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (j != -1) {
            if (this.LJ == 1) {
                this.LJ = 2;
                return new InterfaceC1495590p1R(j) { // from class: X.0p1n
                    public final C1496240p2U LL;
                    public boolean LLILLJJLI;
                    public long LLILLL;

                    @Override // X.InterfaceC1495590p1R, java.io.Closeable, java.lang.AutoCloseable
                    public final void close() throws ProtocolException {
                        if (this.LLILLJJLI) {
                            return;
                        }
                        this.LLILLJJLI = true;
                        if (this.LLILLL > 0) {
                            throw new ProtocolException("unexpected end of stream");
                        }
                        C1495660p1Y c1495660p1Y = this.LLILZ;
                        C1496240p2U c1496240p2U = this.LL;
                        c1495660p1Y.getClass();
                        C1496250p2V c1496250p2V = c1496240p2U.LJ;
                        c1496240p2U.LJ = C1496250p2V.LIZLLL;
                        c1496250p2V.LIZ();
                        c1496250p2V.LIZIZ();
                        this.LLILZ.LJ = 3;
                    }

                    @Override // X.InterfaceC1495590p1R, java.io.Flushable
                    public final void flush() {
                        if (this.LLILLJJLI) {
                            return;
                        }
                        this.LLILZ.LIZLLL.flush();
                    }

                    @Override // X.InterfaceC1495590p1R
                    public final C1496250p2V timeout() {
                        return this.LL;
                    }

                    {
                        this.LL = new C1496240p2U(this.LLILZ.LIZLLL.timeout());
                        this.LLILLL = j;
                    }

                    @Override // X.InterfaceC1495590p1R
                    public final void LLFF(C1496690p3D c1496690p3D, long j2) throws ProtocolException {
                        if (!this.LLILLJJLI) {
                            long j3 = c1496690p3D.LLILLJJLI;
                            byte[] bArr = c.LIZ;
                            if ((0 | j2) >= 0 && 0 <= j3 && j3 - 0 >= j2) {
                                if (j2 <= this.LLILLL) {
                                    this.LLILZ.LIZLLL.LLFF(c1496690p3D, j2);
                                    this.LLILLL -= j2;
                                    return;
                                }
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("expected ");
                                sbLIZ2.append(this.LLILLL);
                                sbLIZ2.append(" bytes but received ");
                                sbLIZ2.append(j2);
                                throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ2));
                            }
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        throw new IllegalStateException("closed");
                    }
                };
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("state: ");
            sbLIZ2.append(this.LJ);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    public final void LJIIIIZZ(C0X1V c0x1v, String str) {
        if (this.LJ == 0) {
            InterfaceC1496780p3M interfaceC1496780p3M = this.LIZLLL;
            interfaceC1496780p3M.LJLLILLLL(str);
            interfaceC1496780p3M.LJLLILLLL("\r\n");
            int length = c0x1v.LIZ.length / 2;
            for (int i = 0; i < length; i++) {
                InterfaceC1496780p3M interfaceC1496780p3M2 = this.LIZLLL;
                interfaceC1496780p3M2.LJLLILLLL(c0x1v.LJ(i));
                interfaceC1496780p3M2.LJLLILLLL(": ");
                interfaceC1496780p3M2.LJLLILLLL(c0x1v.LJIIJ(i));
                interfaceC1496780p3M2.LJLLILLLL("\r\n");
            }
            this.LIZLLL.LJLLILLLL("\r\n");
            this.LJ = 1;
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("state: ");
        sbLIZ.append(this.LJ);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public C1495660p1Y(C1495520p1K c1495520p1K, C1495430p1B c1495430p1B, InterfaceC1496620p36 interfaceC1496620p36, InterfaceC1496780p3M interfaceC1496780p3M) {
        this.LIZ = c1495520p1K;
        this.LIZIZ = c1495430p1B;
        this.LIZJ = interfaceC1496620p36;
        this.LIZLLL = interfaceC1496780p3M;
    }
}
