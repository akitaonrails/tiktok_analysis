package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0jVX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1283610jVX<T> implements InterfaceC608270NtR<Object, T> {
    public T LL = null;
    public final AtomicBoolean LLILLJJLI = new AtomicBoolean(false);

    public C1283610jVX(int i) {
    }

    @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
    public final T getValue(Object obj, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
        return this.LL;
    }

    @Override // X.InterfaceC608270NtR
    public final void setValue(Object obj, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, T t) {
        if (this.LLILLJJLI.compareAndSet(false, true)) {
            this.LL = t;
        }
    }
}
