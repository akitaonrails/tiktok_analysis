package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IPG, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IPG {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0IPG)) {
            return false;
        }
        C0IPG c0ipg = (C0IPG) obj;
        return Intrinsics.LJFF(this.LIZ, c0ipg.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0ipg.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StatusText(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", subtitle=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0IPG(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
