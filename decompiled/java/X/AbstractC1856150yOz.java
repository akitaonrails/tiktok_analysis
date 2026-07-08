package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yOz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1856150yOz implements InterfaceC1891350zJl {
    public final int LL;

    public AbstractC1856150yOz() {
        this(0);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public AbstractC1856150yOz(int i) {
        this.LL = i;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (Intrinsics.LJFF(interfaceC1891350zJl, this) && areItemTheSame(interfaceC1891350zJl)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (Intrinsics.LJFF(interfaceC1891350zJl, this) && (interfaceC1891350zJl instanceof AbstractC1856150yOz) && ((AbstractC1856150yOz) interfaceC1891350zJl).LL == this.LL) {
            return true;
        }
        return false;
    }
}
