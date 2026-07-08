package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QcK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C674100QcK {
    public final C674090QcJ LIZ;
    public final C674170QcR LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C674100QcK)) {
            return false;
        }
        C674100QcK c674100QcK = (C674100QcK) obj;
        return Intrinsics.LJFF(this.LIZ, c674100QcK.LIZ) && Intrinsics.LJFF(this.LIZIZ, c674100QcK.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcSearchBarEnterSnapshot(visibility=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", style=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C674100QcK(C674090QcJ c674090QcJ, C674170QcR c674170QcR) {
        this.LIZ = c674090QcJ;
        this.LIZIZ = c674170QcR;
    }
}
