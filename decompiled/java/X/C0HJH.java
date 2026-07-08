package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HJH, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HJH<T> implements InterfaceC608270NtR<Object, T> {
    public final Function0<Unit> LL;
    public T LLILLJJLI;

    /* JADX WARN: Multi-variable type inference failed */
    public C0HJH(AwS550S0100000_6 awS550S0100000_6, Object obj) {
        this.LL = awS550S0100000_6;
        this.LLILLJJLI = obj;
    }

    @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
    public final T getValue(Object obj, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC608270NtR
    public final void setValue(Object obj, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, T t) {
        if (!Intrinsics.LJFF(this.LLILLJJLI, t)) {
            this.LLILLJJLI = t;
            this.LL.invoke();
        }
    }
}
