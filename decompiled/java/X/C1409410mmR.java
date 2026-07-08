package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mmR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1409410mmR extends AbstractC1409420mmS {
    public final int LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1409410mmR)) {
            return false;
        }
        C1409410mmR c1409410mmR = (C1409410mmR) obj;
        return this.LIZ == c1409410mmR.LIZ && Intrinsics.LJFF(this.LIZIZ, c1409410mmR.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(errorCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorMessage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1409410mmR(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
