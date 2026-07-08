package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yyl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1878330yyl<T> implements InterfaceC1731706qJ<Object, T> {
    public final Object LL;

    static {
        new C1878330yyl();
    }

    public C1878330yyl() {
        this.LL = C1610310s0T.LIZ;
    }

    public C1878330yyl(T t) {
        this.LL = t;
    }

    @Override // X.InterfaceC1731706qJ
    public final T getValue(Object obj, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
        T t = (T) this.LL;
        if (Intrinsics.LJFF(t, C1610310s0T.LIZ)) {
            return null;
        }
        return t;
    }
}
