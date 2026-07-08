package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D9z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C334650D9z extends AbstractC334670DAb {
    public final C0D9Y LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C334650D9z) && Intrinsics.LJFF(this.LIZ, ((C334650D9z) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RefreshCashier(params=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C334650D9z(C0D9Y c0d9y) {
        this.LIZ = c0d9y;
    }
}
