package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lAS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1347420lAS implements InterfaceC0148002o {
    public final C1347410lAR LL;

    public C1347420lAS() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1347420lAS) && Intrinsics.LJFF(this.LL, ((C1347420lAS) obj).LL);
    }

    public final int hashCode() {
        C1347410lAR c1347410lAR = this.LL;
        if (c1347410lAR == null) {
            return 0;
        }
        return c1347410lAR.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentPollCreateState(draft=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1347420lAS(C1347410lAR c1347410lAR) {
        this.LL = c1347410lAR;
    }
}
