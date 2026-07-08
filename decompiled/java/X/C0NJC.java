package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NJC, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NJC<V> implements InterfaceC608270NtR<Object, V> {
    public final V LL;
    public V LLILLJJLI;

    public C0NJC(V v) {
        this.LL = v;
        this.LLILLJJLI = v;
    }

    @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
    public final V getValue(Object obj, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC608270NtR
    public final void setValue(Object obj, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, V v) {
        if (!Intrinsics.LJFF(this.LLILLJJLI, this.LL)) {
            return;
        }
        this.LLILLJJLI = v;
    }
}
