package X;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.11Of, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19493111Of<T> extends AtomicLong implements C11LR {
    public static final long serialVersionUID = 3562861878281475070L;
    public final C11M9<? super T> LL;
    public final C19493011Oe<T> LLILLJJLI;

    @Override // X.C11LR
    public final void cancel() {
        if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
            this.LLILLJJLI.LJIJ(this);
        }
    }

    @Override // X.C11LR
    public final void request(long j) {
        long j2;
        if (C11NC.validate(j)) {
            do {
                j2 = get();
                if (j2 == Long.MIN_VALUE || j2 == Long.MAX_VALUE) {
                    return;
                }
            } while (!compareAndSet(j2, C19492311Nx.LIZIZ(j2, j)));
        }
    }

    public C19493111Of(C11M9<? super T> c11m9, C19493011Oe<T> c19493011Oe) {
        this.LL = c11m9;
        this.LLILLJJLI = c19493011Oe;
    }
}
