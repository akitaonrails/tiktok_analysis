package X;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0W1v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C816650W1v {
    public final String LIZ;
    public final Integer LIZIZ;
    public final Integer LIZJ;
    public final Boolean LIZLLL;
    public final long LJ;

    public final C816650W1v LIZ() {
        if (((ArrayList) C13LQ.LJIJI(new Object[]{this.LIZIZ, this.LIZJ, this.LIZLLL})).isEmpty()) {
            return null;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C816650W1v)) {
            return false;
        }
        C816650W1v c816650W1v = (C816650W1v) obj;
        return Intrinsics.LJFF(this.LIZ, c816650W1v.LIZ) && Intrinsics.LJFF(this.LIZIZ, c816650W1v.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c816650W1v.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c816650W1v.LIZLLL) && this.LJ == c816650W1v.LJ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Integer num = this.LIZIZ;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.LIZLLL;
        return ((iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserStatus(uid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", followStatus=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", followerStatus=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isBlock=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", version=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C816650W1v(String str, Integer num, Integer num2, Boolean bool, long j) {
        this.LIZ = str;
        this.LIZIZ = num;
        this.LIZJ = num2;
        this.LIZLLL = bool;
        this.LJ = j;
    }
}
