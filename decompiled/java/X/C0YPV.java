package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YPV, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YPV {
    public final C0Y8T LIZ;
    public final C869590Y9l LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0YPV)) {
            return false;
        }
        C0YPV c0ypv = (C0YPV) obj;
        return Intrinsics.LJFF(this.LIZ, c0ypv.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0ypv.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocalPreparedMessage(conversation=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0YPV(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
        this.LIZ = c0y8t;
        this.LIZIZ = c869590Y9l;
    }
}
