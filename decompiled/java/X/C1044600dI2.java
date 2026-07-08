package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dI2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1044600dI2 {
    public final List<AbstractC1384320m7y> LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final int LJ;
    public final int LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1044600dI2)) {
            return false;
        }
        C1044600dI2 c1044600dI2 = (C1044600dI2) obj;
        return Intrinsics.LJFF(this.LIZ, c1044600dI2.LIZ) && this.LIZIZ == c1044600dI2.LIZIZ && this.LIZJ == c1044600dI2.LIZJ && this.LIZLLL == c1044600dI2.LIZLLL && this.LJ == c1044600dI2.LJ && this.LJFF == c1044600dI2.LJFF;
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + this.LJ) * 31) + this.LJFF;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WindowBatch(items=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", windowStartTimeMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", nextWindowStartTimeMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", nextAppendTriggerTimeMs=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", consumedCapsuleCount=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", consumedNormalCount=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1044600dI2(List<? extends AbstractC1384320m7y> list, long j, long j2, long j3, int i, int i2) {
        this.LIZ = list;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = j3;
        this.LJ = i;
        this.LJFF = i2;
    }
}
