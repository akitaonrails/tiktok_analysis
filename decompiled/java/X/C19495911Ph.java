package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.11Ph, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19495911Ph<T> extends AtomicInteger implements C09AK<T> {
    public static final long serialVersionUID = 4883307006032401862L;
    public final AbstractC19495811Pg<T> LL;
    public final C19487711Md LLILLJJLI = new C19487711Md();
    public final C19500111Qx LLILLL = new C19500111Qx(16);
    public volatile boolean LLILZ;

    public final void LIZ() {
        AbstractC19495811Pg<T> abstractC19495811Pg = this.LL;
        C19500111Qx c19500111Qx = this.LLILLL;
        C19487711Md c19487711Md = this.LLILLJJLI;
        int iAddAndGet = 1;
        while (!abstractC19495811Pg.isCancelled()) {
            if (c19487711Md.get() != null) {
                c19500111Qx.clear();
                abstractC19495811Pg.onError(c19487711Md.terminate());
                return;
            }
            boolean z = this.LLILZ;
            Object objPoll = c19500111Qx.poll();
            boolean z2 = objPoll == null;
            if (z) {
                if (z2) {
                    abstractC19495811Pg.onComplete();
                    return;
                }
            } else if (z2) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            abstractC19495811Pg.onNext((T) objPoll);
        }
        c19500111Qx.clear();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public final String toString() {
        return this.LL.toString();
    }

    public C19495911Ph(AbstractC19495811Pg<T> abstractC19495811Pg) {
        this.LL = abstractC19495811Pg;
    }

    @Override // X.InterfaceC947803nA
    public final void onError(Throwable th) {
        Throwable nullPointerException;
        if (!this.LL.isCancelled() && !this.LLILZ) {
            if (th == null) {
                nullPointerException = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            } else {
                nullPointerException = th;
            }
            if (this.LLILLJJLI.addThrowable(nullPointerException)) {
                this.LLILZ = true;
                if (getAndIncrement() == 0) {
                    LIZ();
                    return;
                }
                return;
            }
        }
        C19489211Ms.LIZIZ(th);
    }

    @Override // X.InterfaceC947803nA
    public final void onNext(T t) {
        if (!this.LL.isCancelled() && !this.LLILZ) {
            if (t == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            if (get() == 0 && compareAndSet(0, 1)) {
                this.LL.onNext(t);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                C19500111Qx c19500111Qx = this.LLILLL;
                synchronized (c19500111Qx) {
                    try {
                        c19500111Qx.offer(t);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            LIZ();
        }
    }
}
