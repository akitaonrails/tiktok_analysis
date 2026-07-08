package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qbJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556270qbJ extends AbstractC1556290qbL {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1556270qbJ) && Intrinsics.LJFF(this.LIZ, ((C1556270qbJ) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SUG(keyword=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1556270qbJ(String str) {
        this.LIZ = str;
    }
}
