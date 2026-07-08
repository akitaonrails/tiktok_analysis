package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09mQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2472009mQ {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2472009mQ)) {
            return false;
        }
        C2472009mQ c2472009mQ = (C2472009mQ) obj;
        return this.LIZ == c2472009mQ.LIZ && this.LIZIZ == c2472009mQ.LIZIZ && Intrinsics.LJFF(this.LIZJ, c2472009mQ.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DecodeBoundsCache(width=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mimeType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2472009mQ(int i, int i2, String str) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = str;
    }
}
