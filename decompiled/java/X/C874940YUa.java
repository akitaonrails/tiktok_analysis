package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YUa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C874940YUa extends AbstractC875030YUj {
    public final C1785380wYq LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C874940YUa) && Intrinsics.LJFF(this.LIZ, ((C874940YUa) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C874940YUa(C1785380wYq c1785380wYq) {
        this.LIZ = c1785380wYq;
    }
}
