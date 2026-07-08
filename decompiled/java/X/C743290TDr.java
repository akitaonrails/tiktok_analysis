package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TDr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C743290TDr extends AbstractC743230TDl {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C743290TDr)) {
            return false;
        }
        C743290TDr c743290TDr = (C743290TDr) obj;
        return this.LIZ == c743290TDr.LIZ && this.LIZIZ == c743290TDr.LIZIZ && Intrinsics.LJFF(this.LIZJ, c743290TDr.LIZJ);
    }

    public final int hashCode() {
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        String str = this.LIZJ;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(what=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", msg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C743290TDr(int i, int i2, String str) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = str;
    }
}
