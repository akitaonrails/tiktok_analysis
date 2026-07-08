package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TDe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C743160TDe extends AbstractC743230TDl {
    public final int LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C743160TDe)) {
            return false;
        }
        C743160TDe c743160TDe = (C743160TDe) obj;
        return this.LIZ == c743160TDe.LIZ && Intrinsics.LJFF(this.LIZIZ, c743160TDe.LIZIZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InitError(errCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errMsg=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C743160TDe(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
