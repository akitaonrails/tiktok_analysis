package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04xQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1266204xQ {
    public final boolean LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1266204xQ)) {
            return false;
        }
        C1266204xQ c1266204xQ = (C1266204xQ) obj;
        return this.LIZ == c1266204xQ.LIZ && Intrinsics.LJFF(this.LIZIZ, c1266204xQ.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FcpInterceptResult(isIntercepted=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1266204xQ(boolean z, String str) {
        this.LIZ = z;
        this.LIZIZ = str;
    }
}
