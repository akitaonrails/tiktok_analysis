package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mCJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1387010mCJ extends AbstractC1387030mCL {
    public final String LIZ;

    public C1387010mCJ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1387010mCJ) && Intrinsics.LJFF(this.LIZ, ((C1387010mCJ) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RefreshEmpty(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1387010mCJ(int i) {
        this.LIZ = "refresh empty";
    }
}
