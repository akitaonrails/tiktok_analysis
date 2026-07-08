package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0v3C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1727320v3C implements InterfaceC1891350zJl {
    public final C1727990v4H LL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public C1727990v4H LIZ() {
        return this.LL;
    }

    public AbstractC1727320v3C(C1727990v4H c1727990v4H) {
        this.LL = c1727990v4H;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof AbstractC1727320v3C)) {
            return false;
        }
        return Intrinsics.LJFF(LIZ(), ((AbstractC1727320v3C) interfaceC1891350zJl).LIZ());
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof AbstractC1727320v3C)) {
            return false;
        }
        return Intrinsics.LJFF(LIZ().LIZ, ((AbstractC1727320v3C) interfaceC1891350zJl).LIZ().LIZ);
    }
}
