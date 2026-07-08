package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01uE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C482001uE extends AbstractC481901uD {
    public final int LIZ;
    public final int LIZIZ;
    public final Throwable LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C482001uE)) {
            return false;
        }
        C482001uE c482001uE = (C482001uE) obj;
        return this.LIZ == c482001uE.LIZ && this.LIZIZ == c482001uE.LIZIZ && Intrinsics.LJFF(this.LIZJ, c482001uE.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed(failedStep=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", targetStep=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", cause=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C482001uE(int i, int i2, Throwable th) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = th;
    }
}
