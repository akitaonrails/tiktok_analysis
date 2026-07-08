package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fIz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122070fIz extends AbstractC1122060fIy {
    public final C1122110fJ3 LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1122070fIz) && Intrinsics.LJFF(this.LIZ, ((C1122070fIz) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(error=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1122070fIz(C1122110fJ3 c1122110fJ3) {
        this.LIZ = c1122110fJ3;
    }
}
