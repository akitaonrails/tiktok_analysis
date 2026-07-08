package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qbY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556420qbY extends AbstractC1556430qbZ {
    public final String LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VerbatimTtsAnnotation(verbatim=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1556420qbY(String str) {
        this.LIZ = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1556420qbY) && Intrinsics.LJFF(this.LIZ, ((C1556420qbY) obj).LIZ)) {
            return true;
        }
        return false;
    }
}
