package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.ByteString;
import xlp.c;

/* JADX INFO: renamed from: X.0p1z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1495930p1z implements Closeable {
    public static final Logger LLILZIL = Logger.getLogger(C1495990p25.class.getName());
    public final InterfaceC1496620p36 LL;
    public final C1495980p24 LLILLJJLI;
    public final boolean LLILLL;
    public final C1495940p20 LLILZ;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LL.close();
    }

    public final void LIZLLL(InterfaceC1496210p2R interfaceC1496210p2R) throws IOException {
        if (this.LLILLL) {
            if (!LIZIZ(true, interfaceC1496210p2R)) {
                C1495990p25.LIZIZ("Required SETTINGS preface not received", new Object[0]);
                throw null;
            }
            return;
        }
        InterfaceC1496620p36 interfaceC1496620p36 = this.LL;
        ByteString byteString = C1495990p25.LIZ;
        ByteString byteStringLJLILLLLZI = interfaceC1496620p36.LJLILLLLZI(byteString.size());
        Logger logger = LLILZIL;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(c.LJIIJJI("<< CONNECTION %s", byteStringLJLILLLLZI.hex()));
        }
        if (!byteString.equals(byteStringLJLILLLLZI)) {
            C1495990p25.LIZIZ("Expected a connection header but was %s", byteStringLJLILLLLZI.utf8());
            throw null;
        }
    }

    public C1495930p1z(InterfaceC1496620p36 interfaceC1496620p36, boolean z) {
        this.LL = interfaceC1496620p36;
        this.LLILLL = z;
        C1495980p24 c1495980p24 = new C1495980p24(interfaceC1496620p36);
        this.LLILLJJLI = c1495980p24;
        this.LLILZ = new C1495940p20(c1495980p24);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0137, code lost:
    
        if (r18 == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0139, code lost:
    
        r9.LJII();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(boolean r20, X.InterfaceC1496210p2R r21) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1495930p1z.LIZIZ(boolean, X.0p2R):boolean");
    }

    public static int LIZ(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        C1495990p25.LIZIZ("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }

    public final void LJFF(InterfaceC1496210p2R interfaceC1496210p2R, int i, int i2) throws IOException {
        C1495890p1v[] c1495890p1vArr;
        if (i >= 8) {
            if (i2 == 0) {
                int i3 = this.LL.readInt();
                int i4 = this.LL.readInt();
                int i5 = i - 8;
                if (EnumC1496090p2F.fromHttp2(i4) != null) {
                    ByteString byteStringLJLILLLLZI = ByteString.EMPTY;
                    if (i5 > 0) {
                        byteStringLJLILLLLZI = this.LL.LJLILLLLZI(i5);
                    }
                    C1496010p27 c1496010p27 = (C1496010p27) interfaceC1496210p2R;
                    c1496010p27.getClass();
                    byteStringLJLILLLLZI.size();
                    synchronized (c1496010p27.LLILLL) {
                        try {
                            c1495890p1vArr = (C1495890p1v[]) ((LinkedHashMap) c1496010p27.LLILLL.LLILLL).values().toArray(new C1495890p1v[c1496010p27.LLILLL.LLILLL.size()]);
                            c1496010p27.LLILLL.LLIZ = true;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    for (C1495890p1v c1495890p1v : c1495890p1vArr) {
                        if (c1495890p1v.LIZJ > i3 && c1495890p1v.LJFF()) {
                            c1495890p1v.LJIIIZ(EnumC1496090p2F.REFUSED_STREAM);
                            c1496010p27.LLILLL.LJII(c1495890p1v.LIZJ);
                        }
                    }
                    return;
                }
                C1495990p25.LIZIZ("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i4));
                throw null;
            }
            C1495990p25.LIZIZ("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
        C1495990p25.LIZIZ("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
        throw null;
    }

    public final void LJIIZILJ(InterfaceC1496210p2R interfaceC1496210p2R, int i, int i2) throws IOException {
        if (i == 4) {
            long j = ((long) this.LL.readInt()) & 2147483647L;
            if (j != 0) {
                C1496010p27 c1496010p27 = (C1496010p27) interfaceC1496210p2R;
                if (i2 == 0) {
                    synchronized (c1496010p27.LLILLL) {
                        try {
                            C1495910p1x c1495910p1x = c1496010p27.LLILLL;
                            c1495910p1x.LLJJIII += j;
                            c1495910p1x.notifyAll();
                        } finally {
                        }
                    }
                    return;
                }
                C1495890p1v c1495890p1vLIZLLL = c1496010p27.LLILLL.LIZLLL(i2);
                if (c1495890p1vLIZLLL != null) {
                    synchronized (c1495890p1vLIZLLL) {
                        try {
                            c1495890p1vLIZLLL.LIZIZ += j;
                            if (j > 0) {
                                c1495890p1vLIZLLL.notifyAll();
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            }
            C1495990p25.LIZIZ("windowSizeIncrement was 0", Long.valueOf(j));
            throw null;
        }
        C1495990p25.LIZIZ("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
        throw null;
    }

    public final List<C1495840p1q> LJI(int i, short s, byte b, int i2) throws IOException {
        C1495980p24 c1495980p24 = this.LLILLJJLI;
        c1495980p24.LLILZIL = i;
        c1495980p24.LLILLJJLI = i;
        c1495980p24.LLILZLL = s;
        c1495980p24.LLILLL = b;
        c1495980p24.LLILZ = i2;
        C1495940p20 c1495940p20 = this.LLILZ;
        while (!c1495940p20.LIZIZ.LJJJJLL()) {
            int i3 = c1495940p20.LIZIZ.readByte() & 255;
            if (i3 != 128) {
                if ((i3 & 128) == 128) {
                    int iLJ = c1495940p20.LJ(i3, 127) - 1;
                    if (iLJ >= 0 && iLJ <= C1496360p2g.LIZ.length - 1) {
                        ((ArrayList) c1495940p20.LIZ).add(C1496360p2g.LIZ[iLJ]);
                    } else {
                        int length = c1495940p20.LJFF + 1 + (iLJ - C1496360p2g.LIZ.length);
                        if (length >= 0) {
                            C1495840p1q[] c1495840p1qArr = c1495940p20.LJ;
                            if (length < c1495840p1qArr.length) {
                                ((ArrayList) c1495940p20.LIZ).add(c1495840p1qArr[length]);
                            }
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Header index too large ");
                        sbLIZ.append(iLJ + 1);
                        throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else if (i3 == 64) {
                    ByteString byteStringLIZLLL = c1495940p20.LIZLLL();
                    C1496360p2g.LIZ(byteStringLIZLLL);
                    c1495940p20.LIZJ(new C1495840p1q(byteStringLIZLLL, c1495940p20.LIZLLL()));
                } else if ((i3 & 64) == 64) {
                    c1495940p20.LIZJ(new C1495840p1q(c1495940p20.LIZIZ(c1495940p20.LJ(i3, 63) - 1), c1495940p20.LIZLLL()));
                } else if ((i3 & 32) == 32) {
                    int iLJ2 = c1495940p20.LJ(i3, 31);
                    c1495940p20.LIZLLL = iLJ2;
                    if (iLJ2 >= 0 && iLJ2 <= c1495940p20.LIZJ) {
                        int i4 = c1495940p20.LJII;
                        if (iLJ2 < i4) {
                            if (iLJ2 == 0) {
                                Arrays.fill(c1495940p20.LJ, (Object) null);
                                c1495940p20.LJFF = c1495940p20.LJ.length - 1;
                                c1495940p20.LJI = 0;
                                c1495940p20.LJII = 0;
                            } else {
                                c1495940p20.LIZ(i4 - iLJ2);
                            }
                        }
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Invalid dynamic table size update ");
                        sbLIZ2.append(c1495940p20.LIZLLL);
                        throw new IOException(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                } else if (i3 != 16 && i3 != 0) {
                    ((ArrayList) c1495940p20.LIZ).add(new C1495840p1q(c1495940p20.LIZIZ(c1495940p20.LJ(i3, 15) - 1), c1495940p20.LIZLLL()));
                } else {
                    ByteString byteStringLIZLLL2 = c1495940p20.LIZLLL();
                    C1496360p2g.LIZ(byteStringLIZLLL2);
                    ((ArrayList) c1495940p20.LIZ).add(new C1495840p1q(byteStringLIZLLL2, c1495940p20.LIZLLL()));
                }
            } else {
                throw new IOException("index == 0");
            }
        }
        C1495940p20 c1495940p202 = this.LLILZ;
        c1495940p202.getClass();
        ArrayList arrayList = new ArrayList(c1495940p202.LIZ);
        ((ArrayList) c1495940p202.LIZ).clear();
        return arrayList;
    }

    public final void LJII(InterfaceC1496210p2R interfaceC1496210p2R, int i, byte b, final int i2) throws IOException {
        final boolean z;
        short s;
        boolean z2;
        int i3 = i;
        if (i2 != 0) {
            if ((b & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((b & 8) != 0) {
                s = (short) (this.LL.readByte() & 255);
            } else {
                s = 0;
            }
            if ((b & 32) != 0) {
                this.LL.readInt();
                this.LL.readByte();
                interfaceC1496210p2R.getClass();
                i3 -= 5;
            }
            final List<C1495840p1q> listLJI = LJI(LIZ(i3, b, s), s, b, i2);
            final C1496010p27 c1496010p27 = (C1496010p27) interfaceC1496210p2R;
            c1496010p27.LLILLL.getClass();
            if ((i2 & 1) == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                final C1495910p1x c1495910p1x = c1496010p27.LLILLL;
                c1495910p1x.getClass();
                try {
                    final Object[] objArr = {c1495910p1x.LLILZ, Integer.valueOf(i2)};
                    c1495910p1x.LJI(new AbstractRunnableC846600XJa(objArr, i2, listLJI, z) { // from class: X.0p2B
                        public final /* synthetic */ int LLILLJJLI;
                        public final /* synthetic */ List LLILLL;

                        @Override // X.AbstractRunnableC846600XJa
                        public final void LIZ() {
                            getClass();
                            try {
                                this.LLILZ.LLJJJ.LJIILL(this.LLILLJJLI, EnumC1496090p2F.CANCEL);
                                synchronized (this.LLILZ) {
                                    try {
                                        this.LLILZ.LLJJJJ.remove(Integer.valueOf(this.LLILLJJLI));
                                    } finally {
                                        TryCatchGuardChecker.doCheck(th);
                                    }
                                }
                            } catch (IOException th) {
                            }
                        }
                    });
                    return;
                } catch (RejectedExecutionException e) {
                    return;
                }
            }
            synchronized (c1496010p27.LLILLL) {
                try {
                    C1495890p1v c1495890p1vLIZLLL = c1496010p27.LLILLL.LIZLLL(i2);
                    if (c1495890p1vLIZLLL == null) {
                        C1495910p1x c1495910p1x2 = c1496010p27.LLILLL;
                        if (c1495910p1x2.LLIZ) {
                            return;
                        }
                        if (i2 <= c1495910p1x2.LLILZIL) {
                            return;
                        }
                        if (i2 % 2 == c1495910p1x2.LLILZLL % 2) {
                            return;
                        }
                        final C1495890p1v c1495890p1v = new C1495890p1v(i2, c1496010p27.LLILLL, false, z, c.LJIJJLI(listLJI));
                        C1495910p1x c1495910p1x3 = c1496010p27.LLILLL;
                        c1495910p1x3.LLILZIL = i2;
                        c1495910p1x3.LLILLL.put(Integer.valueOf(i2), c1495890p1v);
                        C822650WOx c822650WOx = C1495910p1x.LLJJJJJIL;
                        final Object[] objArr2 = {c1496010p27.LLILLL.LLILZ, Integer.valueOf(i2)};
                        c822650WOx.execute(new AbstractRunnableC846600XJa(objArr2) { // from class: X.0p26
                            @Override // X.AbstractRunnableC846600XJa
                            public final void LIZ() {
                                try {
                                    c1496010p27.LLILLL.LLILLJJLI.LIZIZ(c1495890p1v);
                                } catch (IOException e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                    C842670X3x c842670X3x = C842670X3x.LIZ;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("Http2Connection.Listener failure for ");
                                    sbLIZ.append(c1496010p27.LLILLL.LLILZ);
                                    c842670X3x.LJIIJJI(4, C2188811AlT.LIZIZ(sbLIZ), e2);
                                    try {
                                        c1495890p1v.LIZJ(EnumC1496090p2F.PROTOCOL_ERROR);
                                    } catch (IOException e3) {
                                        TryCatchGuardChecker.doCheck(e3);
                                    }
                                }
                            }
                        });
                        return;
                    }
                    c1495890p1vLIZLLL.LJIIIIZZ(listLJI);
                    if (z) {
                        c1495890p1vLIZLLL.LJII();
                        return;
                    }
                    return;
                } finally {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        C1495990p25.LIZIZ("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        throw null;
    }

    public final void LJIILL(InterfaceC1496210p2R interfaceC1496210p2R, int i, byte b, int i2) throws IOException {
        boolean z = false;
        if (i == 8) {
            if (i2 == 0) {
                final int i3 = this.LL.readInt();
                final int i4 = this.LL.readInt();
                if ((b & 1) != 0) {
                    z = true;
                }
                C1496010p27 c1496010p27 = (C1496010p27) interfaceC1496210p2R;
                c1496010p27.getClass();
                if (z) {
                    synchronized (c1496010p27.LLILLL) {
                        try {
                            if (i3 == 1) {
                                c1496010p27.LLILLL.LLJILJIL++;
                            } else if (i3 != 2) {
                                if (i3 == 3) {
                                    C1495910p1x c1495910p1x = c1496010p27.LLILLL;
                                    c1495910p1x.getClass();
                                    c1495910p1x.notifyAll();
                                }
                            } else {
                                c1496010p27.LLILLL.LLJILLL++;
                            }
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                    return;
                }
                try {
                    final C1495910p1x c1495910p1x2 = c1496010p27.LLILLL;
                    c1495910p1x2.LLIZLLLIL.execute(new AbstractRunnableC846600XJa(i3, i4) { // from class: X.0p2C
                        public final boolean LLILLJJLI;
                        public final int LLILLL;
                        public final int LLILZ;

                        @Override // X.AbstractRunnableC846600XJa
                        public final void LIZ() {
                            C1495910p1x c1495910p1x3 = this.LLILZIL;
                            boolean z2 = this.LLILLJJLI;
                            int i5 = this.LLILLL;
                            int i6 = this.LLILZ;
                            c1495910p1x3.getClass();
                            try {
                                c1495910p1x3.LLJJJ.LJII(i5, i6, z2);
                            } catch (IOException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c1495910p1x3.LIZIZ();
                            }
                        }

                        {
                            super("OkHttp %s ping %08x%08x", this.LLILZIL.LLILZ, Integer.valueOf(i3), Integer.valueOf(i4));
                            this.LLILLJJLI = true;
                            this.LLILLL = i3;
                            this.LLILZ = i4;
                        }
                    });
                    return;
                } catch (RejectedExecutionException th) {
                    return;
                }
            }
            C1495990p25.LIZIZ("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
        C1495990p25.LIZIZ("TYPE_PING length != 8: %s", Integer.valueOf(i));
        throw null;
    }

    public final void LJIILLIIL(InterfaceC1496210p2R interfaceC1496210p2R, int i, byte b, int i2) throws IOException {
        short s;
        if (i2 != 0) {
            if ((b & 8) != 0) {
                s = (short) (this.LL.readByte() & 255);
            } else {
                s = 0;
            }
            final int i3 = this.LL.readInt() & Integer.MAX_VALUE;
            final List<C1495840p1q> listLJI = LJI(LIZ(i - 4, b, s), s, b, i2);
            final C1495910p1x c1495910p1x = ((C1496010p27) interfaceC1496210p2R).LLILLL;
            synchronized (c1495910p1x) {
                try {
                    if (c1495910p1x.LLJJJJ.contains(Integer.valueOf(i3))) {
                        c1495910p1x.LJIJJ(i3, EnumC1496090p2F.PROTOCOL_ERROR);
                        return;
                    }
                    c1495910p1x.LLJJJJ.add(Integer.valueOf(i3));
                    try {
                        final Object[] objArr = {c1495910p1x.LLILZ, Integer.valueOf(i3)};
                        c1495910p1x.LJI(new AbstractRunnableC846600XJa(objArr) { // from class: X.0p2A
                            @Override // X.AbstractRunnableC846600XJa
                            public final void LIZ() {
                                getClass();
                                try {
                                    c1495910p1x.LLJJJ.LJIILL(i3, EnumC1496090p2F.CANCEL);
                                    synchronized (c1495910p1x) {
                                        try {
                                            c1495910p1x.LLJJJJ.remove(Integer.valueOf(i3));
                                        } finally {
                                            TryCatchGuardChecker.doCheck(th);
                                        }
                                    }
                                } catch (IOException th) {
                                }
                            }
                        });
                        return;
                    } catch (RejectedExecutionException e) {
                        return;
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        C1495990p25.LIZIZ("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        throw null;
    }
}
