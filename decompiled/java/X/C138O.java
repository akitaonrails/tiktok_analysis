package X;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.138O, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C138O extends AtomicLong implements C138K {
    public C138O() {
    }

    @Override // X.C138K
    public final void LIZ() {
        getAndIncrement();
    }

    public /* synthetic */ C138O(int i) {
        this();
    }

    @Override // X.C138K
    public final void add(long j) {
        getAndAdd(j);
    }
}
