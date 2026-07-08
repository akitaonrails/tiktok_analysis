package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fRR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1127310fRR extends AbstractC1127100fR6 {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1127310fRR)) {
            return false;
        }
        C1127310fRR c1127310fRR = (C1127310fRR) obj;
        return Intrinsics.LJFF(this.LIZ, c1127310fRR.LIZ) && this.LIZIZ == c1127310fRR.LIZIZ && this.LIZJ == c1127310fRR.LIZJ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageLoadSuccess(imageUrl=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", width=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1127310fRR(String str, int i, int i2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
