package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XcK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C852460XcK {
    public final String LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C852460XcK)) {
            return false;
        }
        C852460XcK c852460XcK = (C852460XcK) obj;
        return Intrinsics.LJFF(this.LIZ, c852460XcK.LIZ) && this.LIZIZ == c852460XcK.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreatePasswordClickActionParams(password=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", oclCheckboxChecked=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C852460XcK(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }
}
