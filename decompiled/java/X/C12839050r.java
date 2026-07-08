package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.050r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12839050r {
    public final String LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12839050r)) {
            return false;
        }
        C12839050r c12839050r = (C12839050r) obj;
        return Intrinsics.LJFF(this.LIZ, c12839050r.LIZ) && this.LIZIZ == c12839050r.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DropdownTextSegment(text=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", useUnselectedColor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C12839050r(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }
}
