package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0N4v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C588110N4v {
    public final boolean LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C588110N4v)) {
            return false;
        }
        C588110N4v c588110N4v = (C588110N4v) obj;
        return this.LIZ == c588110N4v.LIZ && Intrinsics.LJFF(this.LIZIZ, c588110N4v.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StarshipCepResult(success=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", error=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C588110N4v(boolean z, String str) {
        this.LIZ = z;
        this.LIZIZ = str;
    }
}
