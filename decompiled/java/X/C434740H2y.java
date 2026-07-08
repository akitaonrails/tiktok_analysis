package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H2y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C434740H2y extends C0H30 {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C434740H2y)) {
            return false;
        }
        C434740H2y c434740H2y = (C434740H2y) obj;
        return Intrinsics.LJFF(this.LIZ, c434740H2y.LIZ) && this.LIZIZ == c434740H2y.LIZIZ && this.LIZJ == c434740H2y.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Text(text=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", strokeColor=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C434740H2y(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
