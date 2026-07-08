package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.Request;
import okio.ByteString;
import xlp.c;

/* JADX INFO: renamed from: X.0p1Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1495670p1Z implements InterfaceC1495410p19 {
    public static final List<String> LJFF = c.LJIILJJIL("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List<String> LJI = c.LJIILJJIL("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public final C0X0W LIZ;
    public final C1495430p1B LIZIZ;
    public final C1495910p1x LIZJ;
    public C1495890p1v LIZLLL;
    public final EnumC847200XLi LJ;

    @Override // X.InterfaceC1495410p19
    public final void LIZ() {
        this.LIZJ.flush();
    }

    @Override // X.InterfaceC1495410p19
    public final void LIZLLL() {
        this.LIZLLL.LJ().close();
    }

    @Override // X.InterfaceC1495410p19
    public final void cancel() {
        C1495890p1v c1495890p1v = this.LIZLLL;
        if (c1495890p1v != null) {
            EnumC1496090p2F enumC1496090p2F = EnumC1496090p2F.CANCEL;
            if (c1495890p1v.LIZLLL(enumC1496090p2F)) {
                c1495890p1v.LIZLLL.LJIJJ(c1495890p1v.LIZJ, enumC1496090p2F);
            }
        }
    }

    @Override // X.InterfaceC1495410p19
    public final void LIZIZ(Request request) {
        boolean z;
        int i;
        C1495890p1v c1495890p1v;
        if (this.LIZLLL != null) {
            return;
        }
        boolean z2 = true;
        if (request.body() != null) {
            z = true;
        } else {
            z = false;
        }
        C0X1V c0x1vHeaders = request.headers();
        ArrayList arrayList = new ArrayList((c0x1vHeaders.LIZ.length / 2) + 4);
        arrayList.add(new C1495840p1q(C1495840p1q.LJFF, request.method()));
        arrayList.add(new C1495840p1q(C1495840p1q.LJI, C0XLT.LIZ(request.url())));
        String strHeader = request.header("Host");
        if (strHeader != null) {
            arrayList.add(new C1495840p1q(C1495840p1q.LJIIIIZZ, strHeader));
        }
        arrayList.add(new C1495840p1q(C1495840p1q.LJII, request.url().LIZ));
        int length = c0x1vHeaders.LIZ.length / 2;
        for (int i2 = 0; i2 < length; i2++) {
            ByteString byteStringEncodeUtf8 = ByteString.encodeUtf8(c0x1vHeaders.LJ(i2).toLowerCase(Locale.US));
            if (!LJFF.contains(byteStringEncodeUtf8.utf8())) {
                arrayList.add(new C1495840p1q(byteStringEncodeUtf8, c0x1vHeaders.LJIIJ(i2)));
            }
        }
        C1495910p1x c1495910p1x = this.LIZJ;
        boolean z3 = !z;
        synchronized (c1495910p1x.LLJJJ) {
            try {
                synchronized (c1495910p1x) {
                    try {
                        if (c1495910p1x.LLILZLL > 1073741823) {
                            c1495910p1x.LJIILL(EnumC1496090p2F.REFUSED_STREAM);
                        }
                        if (!c1495910p1x.LLIZ) {
                            i = c1495910p1x.LLILZLL;
                            c1495910p1x.LLILZLL = i + 2;
                            c1495890p1v = new C1495890p1v(i, c1495910p1x, z3, false, null);
                            if (z && c1495910p1x.LLJJIII != 0 && c1495890p1v.LIZIZ != 0) {
                                z2 = false;
                            }
                            if (c1495890p1v.LJI()) {
                                c1495910p1x.LLILLL.put(Integer.valueOf(i), c1495890p1v);
                            }
                        } else {
                            throw new IOException() { // from class: X.0p17
                            };
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                c1495910p1x.LLJJJ.LJIIZILJ(i, z3, arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            c1495910p1x.LLJJJ.flush();
        }
        this.LIZLLL = c1495890p1v;
        C1495970p23 c1495970p23 = c1495890p1v.LJIIIIZZ;
        long jLIZIZ = this.LIZ.LIZIZ();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c1495970p23.LJI(jLIZIZ, timeUnit);
        this.LIZLLL.LJIIIZ.LJI(this.LIZ.LIZJ(), timeUnit);
    }

    @Override // X.InterfaceC1495410p19
    public final C842200X2c LJ(C0XLY c0xly) {
        C1495430p1B c1495430p1B = this.LIZIZ;
        c1495430p1B.LJFF.responseBodyStart(c1495430p1B.LJ);
        String strLIZ = c0xly.LIZ("Content-Type", null);
        long jLIZ = C842180X2a.LIZ(c0xly);
        final C1495900p1w c1495900p1w = this.LIZLLL.LJI;
        return new C842200X2c(strLIZ, jLIZ, new C1496670p3B(new AbstractC842560X3m(c1495900p1w) { // from class: X.0p1r
            public boolean LL;
            public long LLILLJJLI;

            @Override // X.AbstractC842560X3m, X.InterfaceC842570X3n, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                super.close();
                if (this.LL) {
                    return;
                }
                this.LL = true;
                C1495670p1Z c1495670p1Z = this.LLILLL;
                c1495670p1Z.LIZIZ.LJIIIIZZ(false, c1495670p1Z, this.LLILLJJLI, null);
            }

            @Override // X.AbstractC842560X3m, X.InterfaceC842570X3n
            public final long read(C1496690p3D c1496690p3D, long j) throws IOException {
                try {
                    long j2 = this.delegate.read(c1496690p3D, j);
                    if (j2 > 0) {
                        this.LLILLJJLI += j2;
                    }
                    return j2;
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (!this.LL) {
                        this.LL = true;
                        C1495670p1Z c1495670p1Z = this.LLILLL;
                        c1495670p1Z.LIZIZ.LJIIIIZZ(false, c1495670p1Z, this.LLILLJJLI, e);
                    }
                    throw e;
                }
            }
        }));
    }

    @Override // X.InterfaceC1495410p19
    public final C0XLX LJFF(boolean z) throws ProtocolException {
        C0X1V c0x1v;
        C1495890p1v c1495890p1v = this.LIZLLL;
        synchronized (c1495890p1v) {
            c1495890p1v.LJIIIIZZ.LJIIIIZZ();
            while (((ArrayDeque) c1495890p1v.LJ).isEmpty() && c1495890p1v.LJIIJ == null) {
                try {
                    c1495890p1v.LJIIJ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1495890p1v.LJIIIIZZ.LJIILJJIL();
                    throw th;
                }
            }
            c1495890p1v.LJIIIIZZ.LJIILJJIL();
            if (!((ArrayDeque) c1495890p1v.LJ).isEmpty()) {
                c0x1v = (C0X1V) ((ArrayDeque) c1495890p1v.LJ).removeFirst();
            } else {
                throw new C1495470p1F(c1495890p1v.LJIIJ);
            }
        }
        EnumC847200XLi enumC847200XLi = this.LJ;
        C0X1U c0x1u = new C0X1U();
        int length = c0x1v.LIZ.length / 2;
        C0X50 c0x50LIZ = null;
        for (int i = 0; i < length; i++) {
            String strLJ = c0x1v.LJ(i);
            String strLJIIJ = c0x1v.LJIIJ(i);
            if (strLJ.equals(":status")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("HTTP/1.1 ");
                sbLIZ.append(strLJIIJ);
                c0x50LIZ = C0X50.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            } else if (!LJI.contains(strLJ)) {
                AbstractC1495490p1H.LIZ.getClass();
                c0x1u.LIZIZ(strLJ, strLJIIJ);
            }
        }
        if (c0x50LIZ != null) {
            C0XLX c0xlx = new C0XLX();
            c0xlx.LIZIZ = enumC847200XLi;
            c0xlx.LIZJ = c0x50LIZ.LIZIZ;
            c0xlx.LIZLLL = c0x50LIZ.LIZJ;
            c0xlx.LJFF = new C0X1V(c0x1u).LJI();
            if (z) {
                AbstractC1495490p1H.LIZ.getClass();
                if (c0xlx.LIZJ == 100) {
                    return null;
                }
            }
            return c0xlx;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // X.InterfaceC1495410p19
    public final InterfaceC1495590p1R LIZJ(Request request, long j) {
        return this.LIZLLL.LJ();
    }

    public C1495670p1Z(C1495520p1K c1495520p1K, C1495400p18 c1495400p18, C1495430p1B c1495430p1B, C1495910p1x c1495910p1x) {
        this.LIZ = c1495400p18;
        this.LIZIZ = c1495430p1B;
        this.LIZJ = c1495910p1x;
        List<EnumC847200XLi> list = c1495520p1K.LLILLL;
        EnumC847200XLi enumC847200XLi = EnumC847200XLi.H2_PRIOR_KNOWLEDGE;
        this.LJ = list.contains(enumC847200XLi) ? enumC847200XLi : EnumC847200XLi.HTTP_2;
    }
}
