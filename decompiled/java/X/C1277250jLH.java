package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS301S0000000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0jLH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1277250jLH<T> implements InterfaceC608270NtR<Object, T> {
    public T LL;
    public final Function2<T, T, Unit> LLILLJJLI;

    /* JADX WARN: Multi-variable type inference failed */
    public C1277250jLH(Object obj, AFwS301S0000000_17 aFwS301S0000000_17) {
        this.LL = obj;
        this.LLILLJJLI = aFwS301S0000000_17;
    }

    @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
    public final T getValue(Object obj, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
        return this.LL;
    }

    @Override // X.InterfaceC608270NtR
    public final void setValue(Object obj, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, T t) {
        if (!Intrinsics.LJFF(this.LL, t)) {
            T t2 = this.LL;
            this.LL = t;
            this.LLILLJJLI.invoke(t2, t);
        }
    }
}
