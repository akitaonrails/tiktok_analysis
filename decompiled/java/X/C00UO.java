package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00UO, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00UO implements InterfaceC951240arS<Object> {
    public final String LIZ;

    public C00UO() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C00UO) && Intrinsics.LJFF(this.LIZ, ((C00UO) obj).LIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveShowDescGuidanceItemData(extra=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00UO(int i) {
        this.LIZ = null;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LIZIZ(Object obj) {
        return obj instanceof C00UO;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LJII(Object obj) {
        return obj instanceof C00UO;
    }
}
