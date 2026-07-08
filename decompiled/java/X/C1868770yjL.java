package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yjL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1868770yjL extends AbstractC1868780yjM {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1868770yjL) && Intrinsics.LJFF(this.LIZ, ((C1868770yjL) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Reject(reason=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1868770yjL(String str) {
        this.LIZ = str;
    }
}
