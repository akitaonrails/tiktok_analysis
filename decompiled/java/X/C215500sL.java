package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00sL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C215500sL {
    public final long LIZ;
    public final long LIZIZ;
    public final List<Long> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C215500sL)) {
            return false;
        }
        C215500sL c215500sL = (C215500sL) obj;
        return this.LIZ == c215500sL.LIZ && this.LIZIZ == c215500sL.LIZIZ && Intrinsics.LJFF(this.LIZJ, c215500sL.LIZJ);
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RenderKey(giftId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", colorId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", colorIds=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C215500sL(List list, long j, long j2) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = list;
    }
}
