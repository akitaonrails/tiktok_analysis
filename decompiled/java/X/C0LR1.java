package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LR1, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LR1 extends C0LR3 {
    public final int LIZ;
    public final String LIZIZ;
    public final Throwable LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0LR1)) {
            return false;
        }
        C0LR1 c0lr1 = (C0LR1) obj;
        return this.LIZ == c0lr1.LIZ && Intrinsics.LJFF(this.LIZIZ, c0lr1.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0lr1.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31;
        Throwable th = this.LIZJ;
        return iHashCode + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failure(errorCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", throwable=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0LR1(int i, String str, Throwable th) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = th;
    }
}
