package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s7u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1614920s7u extends AbstractC1615220s8O {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1614920s7u) && Intrinsics.LJFF(this.LIZ, ((C1614920s7u) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(clientParam=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1614920s7u(String str) {
        this.LIZ = str;
    }
}
