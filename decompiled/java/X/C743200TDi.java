package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TDi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C743200TDi extends AbstractC743230TDl {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C743200TDi)) {
            return false;
        }
        C743200TDi c743200TDi = (C743200TDi) obj;
        return this.LIZ == c743200TDi.LIZ && this.LIZIZ == c743200TDi.LIZIZ && Intrinsics.LJFF(this.LIZJ, c743200TDi.LIZJ);
    }

    public final int hashCode() {
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        String str = this.LIZJ;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StartMirrorServiceError(what=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", msg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C743200TDi(int i, int i2, String str) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = str;
    }
}
