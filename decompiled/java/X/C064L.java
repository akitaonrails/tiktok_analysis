package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.064L, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C064L implements InterfaceC1891350zJl {
    public final Integer LL;

    public C064L() {
        this(null);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public C064L(Integer num) {
        this.LL = num;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
