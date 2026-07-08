package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YJD, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YJD extends C0YJF {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0YJD) && Intrinsics.LJFF(this.LIZ, ((C0YJD) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Value(value=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0YJD(String str) {
        this.LIZ = str;
    }
}
