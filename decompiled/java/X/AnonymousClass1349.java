package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.1349, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AnonymousClass1349<I, O, F, T> extends AbstractC199492133q<O> implements Runnable {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public ListenableFuture<? extends I> LLILZLL;
    public F LLIZ;

    @Override // X.AbstractC199488133m
    public final void LIZJ() {
        ListenableFuture<? extends I> listenableFuture = this.LLILZLL;
        if ((listenableFuture != null) & (this.value instanceof C199496133u)) {
            Object obj = this.value;
            listenableFuture.cancel((obj instanceof C199496133u) && ((C199496133u) obj).LIZ);
        }
        this.LLILZLL = null;
        this.LLIZ = null;
    }

    @Override // X.AbstractC199488133m
    public final String LJIILIIL() {
        String string;
        ListenableFuture<? extends I> listenableFuture = this.LLILZLL;
        F f = this.LLIZ;
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
        if (f == null) {
            if (strLJIILIIL == null) {
                return null;
            }
            String strValueOf2 = String.valueOf(string);
            return strLJIILIIL.length() != 0 ? strValueOf2.concat(strLJIILIIL) : new String(strValueOf2);
        }
        String strValueOf3 = String.valueOf(f);
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 11 + strValueOf3.length());
        sb2.append(string);
        sb2.append("function=[");
        sb2.append(strValueOf3);
        sb2.append(e3.f);
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIJJ() {
        ListenableFuture<? extends I> listenableFuture = this.LLILZLL;
        F f = this.LLIZ;
        if (((this.value instanceof C199496133u) | (listenableFuture == null)) || (f == null)) {
            return;
        }
        this.LLILZLL = null;
        if (listenableFuture.isCancelled()) {
            LJIJI(listenableFuture);
            return;
        }
        try {
            C19864312np.LJIIL(listenableFuture, "Future was expected to be done: %s", listenableFuture.isDone());
            try {
                Object objApply = ((InterfaceC19882712qn) f).apply(C23184096o.LIZ(listenableFuture));
                this.LLIZ = null;
                LJIIZILJ(objApply);
            } catch (Throwable th) {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    LJIJ(th);
                    this.LLIZ = null;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    this.LLIZ = null;
                    throw th2;
                }
            }
        } catch (Error e) {
            TryCatchGuardChecker.doCheck(e);
            LJIJ(e);
        } catch (CancellationException e2) {
            TryCatchGuardChecker.doCheck(e2);
            cancel(false);
        } catch (RuntimeException e3) {
            TryCatchGuardChecker.doCheck(e3);
            LJIJ(e3);
        } catch (ExecutionException e4) {
            TryCatchGuardChecker.doCheck(e4);
            LJIJ(e4.getCause());
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("AbstractTransformFuture@724b.run");
        try {
            LJIJJ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AbstractTransformFuture@724b.run");
    }

    public AnonymousClass1349(ListenableFuture<? extends I> listenableFuture, F f) {
        this.LLILZLL = listenableFuture;
        this.LLIZ = f;
    }
}
