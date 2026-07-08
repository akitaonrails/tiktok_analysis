package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0V0Z, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V0Z implements InterfaceC790710V0b {
    public final int LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0V0Z)) {
            return false;
        }
        C0V0Z c0v0z = (C0V0Z) obj;
        return this.LIZ == c0v0z.LIZ && Intrinsics.LJFF(this.LIZIZ, c0v0z.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(resultCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", resultMessage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0V0Z(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
