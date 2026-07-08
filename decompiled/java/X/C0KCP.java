package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KCP, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KCP {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0KCP)) {
            return false;
        }
        C0KCP c0kcp = (C0KCP) obj;
        return this.LIZ == c0kcp.LIZ && this.LIZIZ == c0kcp.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0kcp.LIZJ);
    }

    public final int hashCode() {
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        String str = this.LIZJ;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ErrorInfo(status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0KCP(int i, int i2, String str) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = str;
    }
}
