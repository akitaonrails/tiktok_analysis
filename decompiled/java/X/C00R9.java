package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00R9, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00R9 {
    public final long LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final List<String> LIZLLL;

    public C00R9() {
        this(0, 0L, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00R9)) {
            return false;
        }
        C00R9 c00r9 = (C00R9) obj;
        return this.LIZ == c00r9.LIZ && this.LIZIZ == c00r9.LIZIZ && this.LIZJ == c00r9.LIZJ && Intrinsics.LJFF(this.LIZLLL, c00r9.LIZLLL);
    }

    public final int hashCode() {
        int iY2 = ((((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31;
        List<String> list = this.LIZLLL;
        return iY2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocationConfig(timeout=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", accuracyLevel=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", cacheTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", allowedSignals=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00R9(int i, long j, List list, int i2) {
        long j2;
        if ((i2 & 1) != 0) {
            j2 = 30000;
        } else {
            j2 = 0;
        }
        i = (i2 & 2) != 0 ? 0 : i;
        j = (i2 & 4) != 0 ? 0L : j;
        list = (i2 & 8) != 0 ? null : list;
        this.LIZ = j2;
        this.LIZIZ = i;
        this.LIZJ = j;
        this.LIZLLL = list;
    }
}
