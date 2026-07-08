package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SSF, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SSF {
    public Integer LIZ;
    public int LIZIZ;
    public int LIZJ;

    public C0SSF() {
        this(0);
    }

    public final void LIZ() {
        this.LIZ = null;
        this.LIZIZ = 0;
        this.LIZJ = Integer.MIN_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0SSF)) {
            return false;
        }
        C0SSF c0ssf = (C0SSF) obj;
        return Intrinsics.LJFF(this.LIZ, c0ssf.LIZ) && this.LIZIZ == c0ssf.LIZIZ && this.LIZJ == c0ssf.LIZJ;
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        return ((((num == null ? 0 : num.hashCode()) * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HitConfirmState(candidateTarget=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", stableCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", lastOffset=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0SSF(int i) {
        this.LIZ = null;
        this.LIZIZ = 0;
        this.LIZJ = Integer.MIN_VALUE;
    }
}
