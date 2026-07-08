package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LMt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C541810LMt {
    public final int LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C541810LMt)) {
            return false;
        }
        C541810LMt c541810LMt = (C541810LMt) obj;
        return this.LIZ == c541810LMt.LIZ && Intrinsics.LJFF(this.LIZIZ, c541810LMt.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MockFail(errorCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C541810LMt(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
