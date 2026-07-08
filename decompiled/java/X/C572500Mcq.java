package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mcq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C572500Mcq {
    public final C572410Mch LIZ;
    public final C572370Mcd LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C572500Mcq)) {
            return false;
        }
        C572500Mcq c572500Mcq = (C572500Mcq) obj;
        return Intrinsics.LJFF(this.LIZ, c572500Mcq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c572500Mcq.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cached(result=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", config=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C572500Mcq(C572410Mch c572410Mch, C572370Mcd c572370Mcd) {
        this.LIZ = c572410Mch;
        this.LIZIZ = c572370Mcd;
    }
}
