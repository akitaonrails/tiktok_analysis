package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uQD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1703150uQD implements InterfaceC1703170uQF {
    public final C1703590uQv LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1703150uQD) && Intrinsics.LJFF(this.LIZ, ((C1703150uQD) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Pending(context=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1703150uQD(C1703590uQv c1703590uQv) {
        this.LIZ = c1703590uQv;
    }
}
