package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fgY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136680fgY extends AbstractC1136890fgt {
    public final C1135810ff9 LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1136680fgY) && Intrinsics.LJFF(this.LIZ, ((C1136680fgY) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Enter(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1136680fgY(C1135810ff9 c1135810ff9) {
        this.LIZ = c1135810ff9;
    }
}
