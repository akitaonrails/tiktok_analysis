package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07a1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1885507a1 {
    public final String LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1885507a1)) {
            return false;
        }
        C1885507a1 c1885507a1 = (C1885507a1) obj;
        return Intrinsics.LJFF(this.LIZ, c1885507a1.LIZ) && this.LIZIZ == c1885507a1.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupInvitationJoinButtonDisplayState(text=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enabled=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1885507a1(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }
}
