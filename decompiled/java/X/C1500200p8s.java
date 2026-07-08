package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.util.ArrayList;
import okhttp3.Request;

/* JADX INFO: renamed from: X.0p8s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1500200p8s<T> implements InterfaceC1501750pBN<T> {
    public final C1500210p8t LL;
    public final Object[] LLILLJJLI;
    public final InterfaceC1496610p35 LLILLL;
    public final InterfaceC1501650pBD<AbstractC842510X3h, T> LLILZ;
    public volatile boolean LLILZIL;
    public InterfaceC1495580p1Q LLILZLL;
    public Throwable LLIZ;
    public boolean LLIZLLLIL;

    @Override // X.InterfaceC1501750pBN
    public final void cancel() {
        InterfaceC1495580p1Q interfaceC1495580p1Q;
        this.LLILZIL = true;
        synchronized (this) {
            try {
                interfaceC1495580p1Q = this.LLILZLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (interfaceC1495580p1Q != null) {
            interfaceC1495580p1Q.cancel();
        }
    }

    @Override // X.InterfaceC1501750pBN
    public final C1500770p9n<T> execute() {
        InterfaceC1495580p1Q interfaceC1495580p1QLIZ;
        synchronized (this) {
            try {
                if (this.LLIZLLLIL) {
                    throw new IllegalStateException("Already executed.");
                }
                this.LLIZLLLIL = true;
                Throwable th = this.LLIZ;
                if (th != null) {
                    if (th instanceof IOException) {
                        throw ((IOException) th);
                    }
                    if (th instanceof RuntimeException) {
                        throw ((RuntimeException) th);
                    }
                    throw ((Error) th);
                }
                interfaceC1495580p1QLIZ = this.LLILZLL;
                if (interfaceC1495580p1QLIZ == null) {
                    try {
                        interfaceC1495580p1QLIZ = LIZ();
                        this.LLILZLL = interfaceC1495580p1QLIZ;
                    } catch (IOException | Error | RuntimeException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1502190pC5.LJIILIIL(e);
                        this.LLIZ = e;
                        throw e;
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        if (this.LLILZIL) {
            interfaceC1495580p1QLIZ.cancel();
        }
        return LIZIZ(C2204961BRm.j0(interfaceC1495580p1QLIZ, new C0WZX("ZjpqTg08Vt6OG3gqbQaQdl0zDnk=", null)));
    }

    @Override // X.InterfaceC1501750pBN
    public final synchronized Request request() {
        InterfaceC1495580p1Q interfaceC1495580p1Q = this.LLILZLL;
        if (interfaceC1495580p1Q != null) {
            return interfaceC1495580p1Q.request();
        }
        Throwable th = this.LLIZ;
        if (th != null) {
            if (th instanceof IOException) {
                throw new RuntimeException("Unable to create request.", this.LLIZ);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            InterfaceC1495580p1Q interfaceC1495580p1QLIZ = LIZ();
            this.LLILZLL = interfaceC1495580p1QLIZ;
            return interfaceC1495580p1QLIZ.request();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLIZ = e;
            throw new RuntimeException("Unable to create request.", e);
        } catch (Error e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            C1502190pC5.LJIILIIL(e);
            this.LLIZ = e;
            throw e;
        } catch (RuntimeException e3) {
            e = e3;
            TryCatchGuardChecker.doCheck(e);
            C1502190pC5.LJIILIIL(e);
            this.LLIZ = e;
            throw e;
        }
    }

    public final InterfaceC1495580p1Q LIZ() {
        C0XLQ c0xlqLJIJJLI;
        InterfaceC1496610p35 interfaceC1496610p35 = this.LLILLL;
        C1500210p8t c1500210p8t = this.LL;
        Object[] objArr = this.LLILLJJLI;
        AbstractC1500140p8m<?>[] abstractC1500140p8mArr = c1500210p8t.LJIIIZ;
        int length = objArr.length;
        if (length != abstractC1500140p8mArr.length) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Argument count (");
            sbLIZ.append(length);
            sbLIZ.append(") doesn't match expected count (");
            sbLIZ.append(abstractC1500140p8mArr.length);
            sbLIZ.append(")");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        C1500190p8r c1500190p8r = new C1500190p8r(c1500210p8t.LIZJ, c1500210p8t.LIZIZ, c1500210p8t.LIZLLL, c1500210p8t.LJ, c1500210p8t.LJFF, c1500210p8t.LJI, c1500210p8t.LJII, c1500210p8t.LJIIIIZZ);
        if (c1500210p8t.LJIIJ) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            abstractC1500140p8mArr[i].LIZ(c1500190p8r, objArr[i]);
        }
        C0XLP c0xlp = c1500190p8r.LIZLLL;
        if (c0xlp != null) {
            c0xlqLJIJJLI = c0xlp.LIZLLL();
        } else {
            c0xlqLJIJJLI = c1500190p8r.LIZIZ.LJIJJLI(c1500190p8r.LIZJ, false);
            if (c0xlqLJIJJLI == null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Malformed URL. Base: ");
                sbLIZ2.append(c1500190p8r.LIZIZ);
                sbLIZ2.append(", Relative: ");
                sbLIZ2.append(c1500190p8r.LIZJ);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        final AbstractC842530X3j abstractC842530X3jLIZLLL = c1500190p8r.LJIIJ;
        if (abstractC842530X3jLIZLLL == null) {
            C837630WtV c837630WtV = c1500190p8r.LJIIIZ;
            if (c837630WtV != null) {
                abstractC842530X3jLIZLLL = c837630WtV.LIZJ();
            } else {
                C0X7B c0x7b = c1500190p8r.LJIIIIZZ;
                if (c0x7b != null) {
                    abstractC842530X3jLIZLLL = c0x7b.LIZLLL();
                } else if (c1500190p8r.LJII) {
                    abstractC842530X3jLIZLLL = AbstractC842530X3j.LIZLLL(null, new byte[0]);
                }
            }
        }
        final C0X0P c0x0p = c1500190p8r.LJI;
        if (c0x0p != null) {
            if (abstractC842530X3jLIZLLL != null) {
                abstractC842530X3jLIZLLL = new AbstractC842530X3j(abstractC842530X3jLIZLLL, c0x0p) { // from class: X.0p2i
                    public final AbstractC842530X3j LIZ;
                    public final C0X0P LIZIZ;

                    @Override // X.AbstractC842530X3j
                    public final long LIZ() {
                        return this.LIZ.LIZ();
                    }

                    @Override // X.AbstractC842530X3j
                    public final C0X0P LIZIZ() {
                        return this.LIZIZ;
                    }

                    @Override // X.AbstractC842530X3j
                    public final void LJ(InterfaceC1496780p3M interfaceC1496780p3M) {
                        this.LIZ.LJ(interfaceC1496780p3M);
                    }

                    {
                        this.LIZ = abstractC842530X3jLIZLLL;
                        this.LIZIZ = c0x0p;
                    }
                };
            } else {
                c1500190p8r.LJFF.LIZ("Content-Type", c0x0p.LIZ);
            }
        }
        C0X33 c0x33 = c1500190p8r.LJ;
        c0x33.LJIIIIZZ(c0xlqLJIJJLI);
        C0X1U c0x1u = c1500190p8r.LJFF;
        c0x1u.getClass();
        c0x33.LIZLLL = new C0X1V(c0x1u).LJI();
        c0x33.LIZLLL(c1500190p8r.LIZ, abstractC842530X3jLIZLLL);
        c0x33.LJI(C1974207oK.class, new C1974207oK(c1500210p8t.LIZ, arrayList));
        C1495500p1I c1495500p1ILIZ = interfaceC1496610p35.LIZ(c0x33.LIZIZ());
        if (c1495500p1ILIZ != null) {
            return c1495500p1ILIZ;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    @Override // X.InterfaceC1501750pBN
    /* JADX INFO: renamed from: clone */
    public final InterfaceC1501750pBN m56clone() {
        return new C1500200p8s(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ);
    }

    @Override // X.InterfaceC1501750pBN
    public final boolean isCanceled() {
        boolean z;
        if (this.LLILZIL) {
            return true;
        }
        synchronized (this) {
            try {
                InterfaceC1495580p1Q interfaceC1495580p1Q = this.LLILZLL;
                z = interfaceC1495580p1Q != null && interfaceC1495580p1Q.isCanceled();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final Object m54clone() {
        return new C1500200p8s(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ);
    }

    public final C1500770p9n<T> LIZIZ(C0XLY c0xly) throws IOException {
        AbstractC842510X3h abstractC842510X3h = c0xly.LLIZ;
        C0XLX c0xlx = new C0XLX(c0xly);
        final C0X0P c0x0pContentType = abstractC842510X3h.contentType();
        final long jContentLength = abstractC842510X3h.contentLength();
        c0xlx.LJI = new AbstractC842510X3h(c0x0pContentType, jContentLength) { // from class: X.0X3q
            public final C0X0P LL;
            public final long LLILLJJLI;

            @Override // X.AbstractC842510X3h
            public final InterfaceC1496620p36 source() {
                throw new IllegalStateException("Cannot read raw response body of a converted body.");
            }

            @Override // X.AbstractC842510X3h
            public final long contentLength() {
                return this.LLILLJJLI;
            }

            @Override // X.AbstractC842510X3h
            public final C0X0P contentType() {
                return this.LL;
            }

            {
                this.LL = c0x0pContentType;
                this.LLILLJJLI = jContentLength;
            }
        };
        C0XLY c0xlyLIZ = c0xlx.LIZ();
        int i = c0xlyLIZ.LLILLL;
        if (i >= 200 && i < 300) {
            if (i != 204 && i != 205) {
                C842590X3p c842590X3p = new C842590X3p(abstractC842510X3h);
                try {
                    T tLIZ = this.LLILZ.LIZ(c842590X3p);
                    if (c0xlyLIZ.LIZIZ()) {
                        return new C1500770p9n<>(c0xlyLIZ, tLIZ, null);
                    }
                    throw new IllegalArgumentException("rawResponse must be successful response");
                } catch (RuntimeException e) {
                    TryCatchGuardChecker.doCheck(e);
                    IOException iOException = c842590X3p.LLILLL;
                    if (iOException == null) {
                        throw e;
                    }
                    throw iOException;
                }
            }
            abstractC842510X3h.close();
            if (c0xlyLIZ.LIZIZ()) {
                return new C1500770p9n<>(c0xlyLIZ, null, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        try {
            C1496690p3D c1496690p3D = new C1496690p3D();
            abstractC842510X3h.source().LJJJJL(c1496690p3D);
            AbstractC842510X3h abstractC842510X3hCreate = AbstractC842510X3h.create(abstractC842510X3h.contentType(), abstractC842510X3h.contentLength(), c1496690p3D);
            C1502190pC5.LIZ(abstractC842510X3hCreate, "body == null");
            if (!c0xlyLIZ.LIZIZ()) {
                C1500770p9n<T> c1500770p9n = new C1500770p9n<>(c0xlyLIZ, null, abstractC842510X3hCreate);
                abstractC842510X3h.close();
                return c1500770p9n;
            }
            throw new IllegalArgumentException("rawResponse should not be successful response");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            abstractC842510X3h.close();
            throw th;
        }
    }

    @Override // X.InterfaceC1501750pBN
    public final void LLIIIJ(final InterfaceC1500240p8w<T> interfaceC1500240p8w) throws Throwable {
        InterfaceC1495580p1Q interfaceC1495580p1Q;
        Throwable th;
        synchronized (this) {
            try {
                if (!this.LLIZLLLIL) {
                    this.LLIZLLLIL = true;
                    interfaceC1495580p1Q = this.LLILZLL;
                    th = this.LLIZ;
                    if (interfaceC1495580p1Q == null && th == null) {
                        try {
                            InterfaceC1495580p1Q interfaceC1495580p1QLIZ = LIZ();
                            this.LLILZLL = interfaceC1495580p1QLIZ;
                            interfaceC1495580p1Q = interfaceC1495580p1QLIZ;
                        } catch (Throwable th2) {
                            th = th2;
                            TryCatchGuardChecker.doCheck(th);
                            C1502190pC5.LJIILIIL(th);
                            this.LLIZ = th;
                        }
                    }
                } else {
                    throw new IllegalStateException("Already executed.");
                }
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                throw th3;
            }
        }
        if (th != null) {
            interfaceC1500240p8w.onFailure(this, th);
            return;
        }
        if (this.LLILZIL) {
            interfaceC1495580p1Q.cancel();
        }
        C2204961BRm.i0(interfaceC1495580p1Q, new InterfaceC1495610p1T() { // from class: X.0p8v
            @Override // X.InterfaceC1495610p1T
            public final void onFailure(InterfaceC1495580p1Q interfaceC1495580p1Q2, IOException iOException) throws Throwable {
                try {
                    interfaceC1500240p8w.onFailure(this.LIZIZ, iOException);
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                    C1502190pC5.LJIILIIL(th4);
                }
            }

            @Override // X.InterfaceC1495610p1T
            public final void onResponse(InterfaceC1495580p1Q interfaceC1495580p1Q2, C0XLY c0xly) throws Throwable {
                try {
                    try {
                        interfaceC1500240p8w.onResponse(this.LIZIZ, this.LIZIZ.LIZIZ(c0xly));
                    } catch (Throwable th4) {
                        TryCatchGuardChecker.doCheck(th4);
                        C1502190pC5.LJIILIIL(th4);
                    }
                } catch (Throwable th5) {
                    TryCatchGuardChecker.doCheck(th5);
                    C1502190pC5.LJIILIIL(th5);
                    try {
                        interfaceC1500240p8w.onFailure(this.LIZIZ, th5);
                    } catch (Throwable th6) {
                        TryCatchGuardChecker.doCheck(th6);
                        C1502190pC5.LJIILIIL(th6);
                    }
                }
            }
        }, new C0WZX("ZjpqTg08Vt6OG3gqbQaQdl0zDnk=", null));
    }

    public C1500200p8s(C1500210p8t c1500210p8t, Object[] objArr, InterfaceC1496610p35 interfaceC1496610p35, InterfaceC1501650pBD<AbstractC842510X3h, T> interfaceC1501650pBD) {
        this.LL = c1500210p8t;
        this.LLILLJJLI = objArr;
        this.LLILLL = interfaceC1496610p35;
        this.LLILZ = interfaceC1501650pBD;
    }
}
