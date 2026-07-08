package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0a12, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C918740a12 {
    public final C967180bHA LIZ;
    public final C920820a4O LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C918740a12)) {
            return false;
        }
        C918740a12 c918740a12 = (C918740a12) obj;
        return Intrinsics.LJFF(this.LIZ, c918740a12.LIZ) && Intrinsics.LJFF(this.LIZIZ, c918740a12.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C920820a4O c920820a4O = this.LIZIZ;
        return iHashCode + (c920820a4O == null ? 0 : c920820a4O.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkMicInviteeParam(player=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", inviteePos=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C918740a12(C967180bHA c967180bHA, C920820a4O c920820a4O) {
        this.LIZ = c967180bHA;
        this.LIZIZ = c920820a4O;
    }
}
