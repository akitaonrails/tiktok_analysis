package X;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0W1u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C816640W1u {
    public final String LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final Boolean LIZLLL;
    public final String LJ;
    public final String LJFF;

    public final C816640W1u LIZ() {
        if (((ArrayList) C13LQ.LJIJI(new Object[]{this.LIZJ, this.LIZLLL, this.LJ, this.LJFF})).isEmpty()) {
            return null;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C816640W1u)) {
            return false;
        }
        C816640W1u c816640W1u = (C816640W1u) obj;
        return Intrinsics.LJFF(this.LIZ, c816640W1u.LIZ) && this.LIZIZ == c816640W1u.LIZIZ && Intrinsics.LJFF(this.LIZJ, c816640W1u.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c816640W1u.LIZLLL) && Intrinsics.LJFF(this.LJ, c816640W1u.LJ) && Intrinsics.LJFF(this.LJFF, c816640W1u.LJFF);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.LJ;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJFF;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserInfo(uid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", version=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", nickname=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isPrivateAccount=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", avatar168=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", avatar300=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C816640W1u(long j, Boolean bool, String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = str2;
        this.LIZLLL = bool;
        this.LJ = str3;
        this.LJFF = str4;
    }
}
