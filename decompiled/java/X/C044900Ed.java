package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Ed, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C044900Ed extends AbstractC044800Ec {
    public final String LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C044900Ed)) {
            return false;
        }
        C044900Ed c044900Ed = (C044900Ed) obj;
        return Intrinsics.LJFF(this.LIZ, c044900Ed.LIZ) && this.LIZIZ == c044900Ed.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FollowButtonUIUpdate(userId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", followStatus=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C044900Ed(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
