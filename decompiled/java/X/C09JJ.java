package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09JJ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09JJ extends C09JG {
    public final C0LSZ LIZ;

    public C09JJ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C09JJ) && Intrinsics.LJFF(this.LIZ, ((C09JJ) obj).LIZ);
    }

    public final int hashCode() {
        C0LSZ c0lsz = this.LIZ;
        if (c0lsz == null) {
            return 0;
        }
        return c0lsz.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RetryTaskInput(taskInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C09JJ(int i) {
        this.LIZ = null;
    }
}
