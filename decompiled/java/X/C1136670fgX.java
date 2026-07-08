package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fgX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136670fgX extends AbstractC1136890fgt {
    public final C1135810ff9 LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1136670fgX) && Intrinsics.LJFF(this.LIZ, ((C1136670fgX) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Combo(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1136670fgX(C1135810ff9 c1135810ff9) {
        this.LIZ = c1135810ff9;
    }
}
