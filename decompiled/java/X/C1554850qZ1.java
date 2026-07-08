package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qZ1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1554850qZ1 implements InterfaceC2217411BqV {
    public final Class<?> LL;

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(" (Kotlin reflection is not available)");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC2217411BqV
    public final Class<?> LIZJ() {
        return this.LL;
    }

    public C1554850qZ1(Class cls) {
        this.LL = cls;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C1554850qZ1) && Intrinsics.LJFF(this.LL, ((C1554850qZ1) obj).LL)) {
            return true;
        }
        return false;
    }
}
