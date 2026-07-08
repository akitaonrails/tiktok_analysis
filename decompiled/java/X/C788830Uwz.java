package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Uwz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C788830Uwz {
    public final AbstractC788840Ux0 LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C788830Uwz) && Intrinsics.LJFF(this.LIZ, ((C788830Uwz) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PcsServiceSkuPageEvent(perfTrackerEvent=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C788830Uwz() {
        this(new C788820Uwy(null));
    }

    public C788830Uwz(AbstractC788840Ux0 abstractC788840Ux0) {
        this.LIZ = abstractC788840Ux0;
    }
}
