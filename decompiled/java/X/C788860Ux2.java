package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ux2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C788860Ux2 extends AbstractC788840Ux0 {
    public final String LIZ;
    public final Throwable LIZIZ;
    public final Integer LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C788860Ux2)) {
            return false;
        }
        C788860Ux2 c788860Ux2 = (C788860Ux2) obj;
        return Intrinsics.LJFF(this.LIZ, c788860Ux2.LIZ) && Intrinsics.LJFF(this.LIZIZ, c788860Ux2.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c788860Ux2.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        Integer num = this.LIZJ;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowFail(errorCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", throwable=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", instanceHashCode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC788840Ux0
    public final Integer LIZ() {
        return this.LIZJ;
    }

    public C788860Ux2(Throwable th, String str, Integer num) {
        this.LIZ = str;
        this.LIZIZ = th;
        this.LIZJ = num;
    }
}
