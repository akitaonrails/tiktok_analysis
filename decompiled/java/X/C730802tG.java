package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02tG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C730802tG implements InterfaceC729102sz {
    public final Object LIZ;

    public C730802tG() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C730802tG) && Intrinsics.LJFF(this.LIZ, ((C730802tG) obj).LIZ);
    }

    public final int hashCode() {
        Object obj = this.LIZ;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPlatformPromotionCompState(dummy=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C730802tG(int i) {
        this.LIZ = null;
    }
}
