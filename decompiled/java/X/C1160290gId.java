package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gId, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1160290gId implements InterfaceC1160280gIc {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1160290gId) && Intrinsics.LJFF(this.LIZ, ((C1160290gId) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RemoveOp(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1160290gId(String str) {
        this.LIZ = str;
    }
}
