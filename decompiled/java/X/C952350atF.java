package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0atF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C952350atF extends C952370atH {
    public final int LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C952350atF)) {
            return false;
        }
        C952350atF c952350atF = (C952350atF) obj;
        return this.LIZ == c952350atF.LIZ && Intrinsics.LJFF(this.LIZIZ, c952350atF.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiHostError(errorCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C952350atF(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
