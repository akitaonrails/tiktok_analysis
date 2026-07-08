package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11OS, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C11OS extends AtomicInteger implements C11LR {
    public static final long serialVersionUID = -2189523197179400958L;
    public C11LR LL;
    public long LLILLJJLI;
    public final AtomicReference<C11LR> LLILLL = new AtomicReference<>();
    public final AtomicLong LLILZ = new AtomicLong();
    public final AtomicLong LLILZIL = new AtomicLong();
    public final boolean LLILZLL;
    public volatile boolean LLIZ;
    public boolean LLIZLLLIL;

    public final void LIZ() {
        int iAddAndGet = 1;
        long jLIZIZ = 0;
        C11LR c11lr = null;
        do {
            C11LR andSet = this.LLILLL.get();
            if (andSet != null) {
                andSet = this.LLILLL.getAndSet(null);
            }
            long andSet2 = this.LLILZ.get();
            if (andSet2 != 0) {
                andSet2 = this.LLILZ.getAndSet(0L);
            }
            long andSet3 = this.LLILZIL.get();
            if (andSet3 != 0) {
                andSet3 = this.LLILZIL.getAndSet(0L);
            }
            C11LR c11lr2 = this.LL;
            if (this.LLIZ) {
                if (c11lr2 != null) {
                    c11lr2.cancel();
                    this.LL = null;
                }
                if (andSet != null) {
                    andSet.cancel();
                }
            } else {
                long jLIZIZ2 = this.LLILLJJLI;
                if (jLIZIZ2 != Long.MAX_VALUE) {
                    jLIZIZ2 = C19492311Nx.LIZIZ(jLIZIZ2, andSet2);
                    if (jLIZIZ2 != Long.MAX_VALUE) {
                        jLIZIZ2 -= andSet3;
                        if (jLIZIZ2 < 0) {
                            C11NC.reportMoreProduced(jLIZIZ2);
                            jLIZIZ2 = 0;
                        }
                    }
                    this.LLILLJJLI = jLIZIZ2;
                }
                if (andSet != null) {
                    if (c11lr2 != null && this.LLILZLL) {
                        c11lr2.cancel();
                    }
                    this.LL = andSet;
                    if (jLIZIZ2 != 0) {
                        jLIZIZ = C19492311Nx.LIZIZ(jLIZIZ, jLIZIZ2);
                        c11lr = andSet;
                    }
                } else if (c11lr2 != null && andSet2 != 0) {
                    jLIZIZ = C19492311Nx.LIZIZ(jLIZIZ, andSet2);
                    c11lr = c11lr2;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
        if (jLIZIZ != 0) {
            c11lr.request(jLIZIZ);
        }
    }

    @Override // X.C11LR
    public void cancel() {
        if (this.LLIZ) {
            return;
        }
        this.LLIZ = true;
        if (getAndIncrement() == 0) {
            LIZ();
        }
    }

    public final boolean isCancelled() {
        return this.LLIZ;
    }

    public final boolean isUnbounded() {
        return this.LLIZLLLIL;
    }

    public C11OS(boolean z) {
        this.LLILZLL = z;
    }

    public final void produced(long j) {
        if (this.LLIZLLLIL) {
            return;
        }
        if (get() == 0 && compareAndSet(0, 1)) {
            long j2 = this.LLILLJJLI;
            if (j2 != Long.MAX_VALUE) {
                long j3 = j2 - j;
                if (j3 < 0) {
                    C11NC.reportMoreProduced(j3);
                    j3 = 0;
                }
                this.LLILLJJLI = j3;
            }
            if (decrementAndGet() == 0) {
                return;
            }
            LIZ();
            return;
        }
        C19492311Nx.LIZ(this.LLILZIL, j);
        if (getAndIncrement() == 0) {
            LIZ();
        }
    }

    @Override // X.C11LR
    public final void request(long j) {
        if (!C11NC.validate(j) || this.LLIZLLLIL) {
            return;
        }
        if (get() == 0 && compareAndSet(0, 1)) {
            long j2 = this.LLILLJJLI;
            if (j2 != Long.MAX_VALUE) {
                long jLIZIZ = C19492311Nx.LIZIZ(j2, j);
                this.LLILLJJLI = jLIZIZ;
                if (jLIZIZ == Long.MAX_VALUE) {
                    this.LLIZLLLIL = true;
                }
            }
            C11LR c11lr = this.LL;
            if (decrementAndGet() != 0) {
                LIZ();
            }
            if (c11lr != null) {
                c11lr.request(j);
                return;
            }
            return;
        }
        C19492311Nx.LIZ(this.LLILZ, j);
        if (getAndIncrement() == 0) {
            LIZ();
        }
    }

    public final void setSubscription(C11LR c11lr) {
        if (this.LLIZ) {
            c11lr.cancel();
            return;
        }
        C1701890uOB.LIZ(c11lr, "s is null");
        if (get() == 0 && compareAndSet(0, 1)) {
            C11LR c11lr2 = this.LL;
            if (c11lr2 != null && this.LLILZLL) {
                c11lr2.cancel();
            }
            this.LL = c11lr;
            long j = this.LLILLJJLI;
            if (decrementAndGet() != 0) {
                LIZ();
            }
            if (j != 0) {
                c11lr.request(j);
                return;
            }
            return;
        }
        C11LR andSet = this.LLILLL.getAndSet(c11lr);
        if (andSet != null && this.LLILZLL) {
            andSet.cancel();
        }
        if (getAndIncrement() == 0) {
            LIZ();
        }
    }
}
