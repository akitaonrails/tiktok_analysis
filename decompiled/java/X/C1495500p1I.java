package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import okhttp3.Request;
import okhttp3.internal.cache.CacheInterceptor;
import okhttp3.internal.connection.ConnectInterceptor;
import okhttp3.internal.http.BridgeInterceptor;
import okhttp3.internal.http.CallServerInterceptor;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import xlp.c;

/* JADX INFO: renamed from: X.0p1I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1495500p1I implements InterfaceC1495580p1Q {
    public final C1495520p1K LL;
    public final RetryAndFollowUpInterceptor LLILLJJLI;
    public final C1495600p1S LLILLL;
    public AbstractC1494940p0O LLILZ;
    public final Request LLILZIL;
    public final boolean LLILZLL;
    public boolean LLIZ;

    @Override // X.InterfaceC1495580p1Q
    public final void cancel() {
        LIZ(-1);
    }

    public final C0XLY LIZIZ() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.LL.LLILZIL);
        arrayList.add(this.LLILLJJLI);
        arrayList.add(new BridgeInterceptor(this.LL.LLJ));
        this.LL.getClass();
        arrayList.add(new CacheInterceptor());
        arrayList.add(new ConnectInterceptor(this.LL));
        if (!this.LLILZLL) {
            arrayList.addAll(this.LL.LLILZLL);
        }
        arrayList.add(new CallServerInterceptor(this.LLILZLL));
        Request request = this.LLILZIL;
        AbstractC1494940p0O abstractC1494940p0O = this.LLILZ;
        C1495520p1K c1495520p1K = this.LL;
        C0XLY c0xlyLIZ = new C1495400p18(arrayList, null, null, null, 0, request, this, abstractC1494940p0O, c1495520p1K.LLJJJJ, c1495520p1K.LLJJJJJIL, c1495520p1K.LLJJJJLIIL).LIZ(request);
        if (!this.LLILLJJLI.LIZLLL) {
            return c0xlyLIZ;
        }
        c.LJ(c0xlyLIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Canceled#Reason=");
        sbLIZ.append(this.LLILLJJLI.LIZLLL);
        throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final Object clone() {
        return LIZJ(this.LL, this.LLILZIL, this.LLILZLL);
    }

    @Override // X.InterfaceC1495580p1Q
    public final C0XLY execute() throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(400209, "okhttp3/RealCall", "execute", this, new Object[0], "okhttp3.Response", new C0WZW(false, "()Lokhttp3/Response;", new C0WZX("ezR2SBYqDITuUFYtZhOIag==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (C0XLY) c0wsuLIZIZ.LIZIZ;
        }
        synchronized (this) {
            try {
                if (this.LLIZ) {
                    throw new IllegalStateException("Already Executed");
                }
                this.LLIZ = true;
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        this.LLILLJJLI.LIZJ = C842670X3x.LIZ.LJIIIZ();
        LJIIIIZZ();
        this.LLILZ.callStart(this);
        try {
            try {
                this.LL.LL.LIZIZ(this);
                C0XLY c0xlyLIZIZ = LIZIZ();
                if (c0xlyLIZIZ == null) {
                    throw new IOException("Canceled");
                }
                this.LL.LL.LJ(this);
                return c0xlyLIZIZ;
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                IOException iOExceptionLIZLLL = LIZLLL(e);
                this.LLILZ.callFailed(this, iOExceptionLIZLLL);
                throw iOExceptionLIZLLL;
            }
        } catch (Throwable th) {
            this.LL.LL.LJ(this);
            throw th;
        }
        this.LL.LL.LJ(this);
        throw th;
    }

    @Override // X.InterfaceC1495580p1Q
    public final boolean isCanceled() {
        return this.LLILLJJLI.LIZLLL;
    }

    public final String LJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILLJJLI.LIZLLL ? "canceled " : "");
        sbLIZ.append(this.LLILZLL ? "web socket" : "call");
        sbLIZ.append(" to ");
        sbLIZ.append(this.LLILZIL.url().LJIJJ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1495580p1Q
    public final Request request() {
        return this.LLILZIL;
    }

    public final void LIZ(int i) {
        InterfaceC1495410p19 interfaceC1495410p19;
        C1495650p1X c1495650p1X;
        RetryAndFollowUpInterceptor retryAndFollowUpInterceptor = this.LLILLJJLI;
        retryAndFollowUpInterceptor.LJ = i;
        retryAndFollowUpInterceptor.LIZLLL = true;
        C1495430p1B c1495430p1B = retryAndFollowUpInterceptor.LIZIZ;
        if (c1495430p1B != null) {
            synchronized (c1495430p1B.LIZLLL) {
                try {
                    c1495430p1B.LJIIL = true;
                    c1495430p1B.LJIILIIL = i;
                    interfaceC1495410p19 = c1495430p1B.LJIILJJIL;
                    c1495650p1X = c1495430p1B.LJIIIZ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (interfaceC1495410p19 != null) {
                interfaceC1495410p19.cancel();
            } else {
                if (c1495650p1X == null) {
                    return;
                }
                c.LJFF(c1495650p1X.LIZLLL);
            }
        }
    }

    public final IOException LIZLLL(IOException iOException) {
        if (!LJIIIZ()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    @Override // X.InterfaceC1495580p1Q
    public final void LJLZ(InterfaceC1495610p1T interfaceC1495610p1T) {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(400210, "okhttp3/RealCall", "enqueue", this, new Object[]{interfaceC1495610p1T}, "void", new C0WZW(false, "(Lokhttp3/Callback;)V", new C0WZX("ezR2SBYqDITuUFYtZhOIag==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            interfaceC1495610p1T = (InterfaceC1495610p1T) obj;
        }
        synchronized (this) {
            try {
                if (!this.LLIZ) {
                    this.LLIZ = true;
                } else {
                    throw new IllegalStateException("Already Executed");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LLILLJJLI.LIZJ = C842670X3x.LIZ.LJIIIZ();
        this.LLILZ.callStart(this);
        this.LL.LL.LIZ(new C1495550p1N(this, interfaceC1495610p1T));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0p1S, X.0p2V] */
    public C1495500p1I(C1495520p1K c1495520p1K, Request request, boolean z) {
        this.LL = c1495520p1K;
        this.LLILZIL = request;
        this.LLILZLL = z;
        this.LLILLJJLI = new RetryAndFollowUpInterceptor(c1495520p1K);
        ?? r3 = new C1496260p2W() { // from class: X.0p1S
            @Override // X.C1496260p2W
            public final void LJIILIIL() {
                this.LJIIJ.LIZ(-192);
            }
        };
        this.LLILLL = r3;
        r3.LJI(c1495520p1K.LLJJJIL, TimeUnit.MILLISECONDS);
    }

    public static C1495500p1I LIZJ(C1495520p1K c1495520p1K, Request request, boolean z) {
        C1495500p1I c1495500p1I = new C1495500p1I(c1495520p1K, request, z);
        c1495500p1I.LLILZ = c1495520p1K.LLIZ.create(c1495500p1I);
        return c1495500p1I;
    }
}
