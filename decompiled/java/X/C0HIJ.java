package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HIJ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HIJ extends AbstractC942990ae9 {
    public final String LIZ;
    public final Long LIZIZ;
    public final Long LIZJ;

    public C0HIJ() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HIJ)) {
            return false;
        }
        C0HIJ c0hij = (C0HIJ) obj;
        return Intrinsics.LJFF(this.LIZ, c0hij.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0hij.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0hij.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.LIZIZ;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.LIZJ;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DestroyModeSuccess(wallPaperUrl=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", playerUserId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0HIJ(String str, Long l, Long l2) {
        this.LIZ = str;
        this.LIZIZ = l;
        this.LIZJ = l2;
    }
}
