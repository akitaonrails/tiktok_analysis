package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0alw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C947820alw implements InterfaceC951240arS<Object> {
    public final InterfaceC950700aqa LIZ;

    @Override // X.InterfaceC951240arS
    public final boolean LIZIZ(Object obj) {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C947820alw) && Intrinsics.LJFF(this.LIZ, ((C947820alw) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LayoutItem(contextProvider=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C947820alw(C951060arA c951060arA) {
        this.LIZ = c951060arA;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LJII(Object obj) {
        return obj instanceof C947820alw;
    }
}
