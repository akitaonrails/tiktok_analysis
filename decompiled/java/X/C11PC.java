package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.11PC, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C11PC<T> extends C11NT<T> implements C11PF<T>, Runnable {
    public static final long serialVersionUID = -8241002408341274697L;
    public final C11RN LL;
    public final boolean LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final AtomicLong LLILZIL = new AtomicLong();
    public C11LR LLILZLL;
    public InterfaceC19494911Ox<T> LLIZ;
    public volatile boolean LLIZLLLIL;
    public volatile boolean LLJ;
    public Throwable LLJI;
    public int LLJIJIL;
    public long LLJILJIL;
    public boolean LLJILJILJ;

    public abstract void LIZIZ();

    public abstract void LIZLLL();

    public abstract void LJ();

    @Override // X.C11NT, X.C11LR
    public final void cancel() {
        if (this.LLIZLLLIL) {
            return;
        }
        this.LLIZLLLIL = true;
        this.LLILZLL.cancel();
        this.LL.dispose();
        if (getAndIncrement() == 0) {
            this.LLIZ.clear();
        }
    }

    @Override // X.C11NT, X.InterfaceC19494911Ox
    public final void clear() {
        this.LLIZ.clear();
    }

    @Override // X.C11NT, X.InterfaceC19494911Ox
    public final boolean isEmpty() {
        return this.LLIZ.isEmpty();
    }

    @Override // X.C11M9
    public final void onComplete() {
        if (this.LLJ) {
            return;
        }
        this.LLJ = true;
        LJFF();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.LLJILJILJ) {
                LIZLLL();
            } else if (this.LLJIJIL == 1) {
                LJ();
            } else {
                LIZIZ();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public final void LJFF() {
        if (getAndIncrement() != 0) {
            return;
        }
        this.LL.LIZIZ(this);
    }

    @Override // X.C11M9
    public final void onError(Throwable th) {
        if (this.LLJ) {
            C19489211Ms.LIZIZ(th);
            return;
        }
        this.LLJI = th;
        this.LLJ = true;
        LJFF();
    }

    @Override // X.C11M9
    public final void onNext(T t) {
        if (this.LLJ) {
            return;
        }
        if (this.LLJIJIL == 2) {
            LJFF();
            return;
        }
        if (!this.LLIZ.offer(t)) {
            this.LLILZLL.cancel();
            this.LLJI = new C11MF("Queue is full?!");
            this.LLJ = true;
        }
        LJFF();
    }

    @Override // X.C11NT, X.C11LR
    public final void request(long j) {
        if (C11NC.validate(j)) {
            C19492311Nx.LIZ(this.LLILZIL, j);
            LJFF();
        }
    }

    @Override // X.C11NT, X.InterfaceC19495111Oz
    public final int requestFusion(int i) {
        if ((i & 2) != 0) {
            this.LLJILJILJ = true;
            return 2;
        }
        return 0;
    }

    public C11PC(C11RN c11rn, boolean z, int i) {
        this.LL = c11rn;
        this.LLILLJJLI = z;
        this.LLILLL = i;
        this.LLILZ = i - (i >> 2);
    }

    public final boolean LIZ(boolean z, boolean z2, C11M9<?> c11m9) {
        if (this.LLIZLLLIL) {
            clear();
            return true;
        }
        if (z) {
            if (this.LLILLJJLI) {
                if (z2) {
                    this.LLIZLLLIL = true;
                    Throwable th = this.LLJI;
                    if (th != null) {
                        c11m9.onError(th);
                    } else {
                        c11m9.onComplete();
                    }
                    this.LL.dispose();
                    return true;
                }
                return false;
            }
            Throwable th2 = this.LLJI;
            if (th2 != null) {
                this.LLIZLLLIL = true;
                clear();
                c11m9.onError(th2);
                this.LL.dispose();
                return true;
            }
            if (z2) {
                this.LLIZLLLIL = true;
                c11m9.onComplete();
                this.LL.dispose();
                return true;
            }
            return false;
        }
        return false;
    }
}
