package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZeY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C904800ZeY {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C904800ZeY)) {
            return false;
        }
        C904800ZeY c904800ZeY = (C904800ZeY) obj;
        return Intrinsics.LJFF(this.LIZ, c904800ZeY.LIZ) && Intrinsics.LJFF(this.LIZIZ, c904800ZeY.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SessionInfo(uuid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sessionId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C904800ZeY(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
