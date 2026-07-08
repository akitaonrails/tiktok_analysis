package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Z2N, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z2N implements InterfaceC1891350zJl {
    public final C869590Y9l LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0Z2N) && Intrinsics.LJFF(this.LL, ((C0Z2N) obj).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublicGroupOnboardingCardData(message=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0Z2N(C869590Y9l c869590Y9l) {
        this.LL = c869590Y9l;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C0Z2N) {
            return Intrinsics.LJFF(this.LL.getUuid(), ((C0Z2N) interfaceC1891350zJl).LL.getUuid());
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
