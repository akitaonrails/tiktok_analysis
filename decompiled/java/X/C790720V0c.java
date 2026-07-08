package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0V0c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C790720V0c implements InterfaceC790710V0b {
    public final int LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C790720V0c)) {
            return false;
        }
        C790720V0c c790720V0c = (C790720V0c) obj;
        return this.LIZ == c790720V0c.LIZ && Intrinsics.LJFF(this.LIZIZ, c790720V0c.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(resultCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", resultMessage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C790720V0c(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
