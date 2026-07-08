package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.005q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0228005q implements InterfaceC443810Hal {
    public final int LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0228005q)) {
            return false;
        }
        C0228005q c0228005q = (C0228005q) obj;
        return this.LIZ == c0228005q.LIZ && Intrinsics.LJFF(this.LIZIZ, c0228005q.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreationInProgress(percentage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", caption=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0228005q(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
