package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.Throwable;
import java.util.concurrent.ExecutionException;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.1348, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AnonymousClass1348<V, X extends Throwable, F, T> extends AbstractC199492133q<V> implements Runnable {
    public static final /* synthetic */ int LLJ = 0;
    public ListenableFuture<? extends V> LLILZLL;
    public Class<X> LLIZ;
    public F LLIZLLLIL;

    public abstract T LJIJJLI(F f, X x);

    public abstract void LJIL(T t);

    @Override // X.AbstractC199488133m
    public final void LIZJ() {
        ListenableFuture<? extends V> listenableFuture = this.LLILZLL;
        if ((listenableFuture != null) & (this.value instanceof C199496133u)) {
            Object obj = this.value;
            listenableFuture.cancel((obj instanceof C199496133u) && ((C199496133u) obj).LIZ);
        }
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
    }

    @Override // X.AbstractC199488133m
    public final String LJIILIIL() {
        String string;
        ListenableFuture<? extends V> listenableFuture = this.LLILZLL;
        Class<X> cls = this.LLIZ;
        F f = this.LLIZLLLIL;
        String strLJIILIIL = super.LJIILIIL();
        if (listenableFuture != null) {
            String strValueOf = String.valueOf(listenableFuture);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 16);
            sb.append("inputFuture=[");
            sb.append(strValueOf);
            sb.append("], ");
            string = sb.toString();
        } else {
            string = "";
        }
        if (cls == null || f == null) {
            if (strLJIILIIL == null) {
                return null;
            }
            String strValueOf2 = String.valueOf(string);
            return strLJIILIIL.length() != 0 ? strValueOf2.concat(strLJIILIIL) : new String(strValueOf2);
        }
        String strValueOf3 = String.valueOf(cls);
        String strValueOf4 = String.valueOf(f);
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 29 + strValueOf3.length() + strValueOf4.length());
        sb2.append(string);
        sb2.append("exceptionType=[");
        sb2.append(strValueOf3);
        sb2.append("], fallback=[");
        sb2.append(strValueOf4);
        sb2.append(e3.f);
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIJJ() {
        ListenableFuture<? extends V> listenableFuture = this.LLILZLL;
        Class<X> cls = this.LLIZ;
        F f = this.LLIZLLLIL;
        if (((f == null) || ((listenableFuture == 0) | (cls == null))) || (this.value instanceof C199496133u)) {
            return;
        }
        this.LLILZLL = null;
        try {
            if (!(listenableFuture instanceof AnonymousClass1343) || (th = ((AnonymousClass1343) listenableFuture).LIZ()) == null) {
                C19864312np.LJIIL(listenableFuture, "Future was expected to be done: %s", listenableFuture.isDone());
                LJIIZILJ(C23184096o.LIZ(listenableFuture));
                return;
            }
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            th = e.getCause();
            if (th == null) {
                String strValueOf = String.valueOf(listenableFuture.getClass());
                String strValueOf2 = String.valueOf(e.getClass());
                StringBuilder sb = new StringBuilder(strValueOf.length() + 35 + strValueOf2.length());
                sb.append("Future type ");
                sb.append(strValueOf);
                sb.append(" threw ");
                sb.append(strValueOf2);
                sb.append(" without a cause");
                th = new NullPointerException(sb.toString());
            }
        } catch (Throwable th) {
            th = th;
            TryCatchGuardChecker.doCheck(th);
        }
        if (!cls.isInstance(th)) {
            LJIJI(listenableFuture);
            return;
        }
        try {
            Object objLJIJJLI = LJIJJLI(f, th);
            this.LLIZ = null;
            this.LLIZLLLIL = null;
            LJIL(objLJIJJLI);
        } catch (Throwable th2) {
            try {
                TryCatchGuardChecker.doCheck(th2);
                LJIJ(th2);
                this.LLIZ = null;
                this.LLIZLLLIL = null;
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                this.LLIZ = null;
                this.LLIZLLLIL = null;
                throw th3;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("AbstractCatchingFuture@bf9a.run");
        try {
            LJIJJ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AbstractCatchingFuture@bf9a.run");
    }

    public AnonymousClass1348(ListenableFuture<? extends V> listenableFuture, Class<X> cls, F f) {
        listenableFuture.getClass();
        this.LLILZLL = listenableFuture;
        this.LLIZ = cls;
        this.LLIZLLLIL = f;
    }
}
