package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YKG, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YKG extends C0YKN {
    public final C0YKD LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0YKG) && Intrinsics.LJFF(this.LIZ, ((C0YKG) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnGetByUserRequested(getByUserBufferItem=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0YKG(C0YKD c0ykd) {
        this.LIZ = c0ykd;
    }
}
