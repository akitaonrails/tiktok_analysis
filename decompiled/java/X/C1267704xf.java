package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04xf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1267704xf implements InterfaceC1704540uSS {
    public final String LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1267704xf)) {
            return false;
        }
        C1267704xf c1267704xf = (C1267704xf) obj;
        return Intrinsics.LJFF(this.LIZ, c1267704xf.LIZ) && this.LIZIZ == c1267704xf.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OwnerStart(sceneName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", restoreOnFirstOwnerAttach=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1267704xf(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }
}
