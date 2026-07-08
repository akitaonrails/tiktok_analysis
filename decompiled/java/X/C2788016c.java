package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.016c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2788016c {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2788016c)) {
            return false;
        }
        C2788016c c2788016c = (C2788016c) obj;
        return Intrinsics.LJFF(this.LIZ, c2788016c.LIZ) && this.LIZIZ == c2788016c.LIZIZ && this.LIZJ == c2788016c.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DubbingStatus(targetLanguage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hasDubbing=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isDubbed=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2788016c(String str, int i, int i2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
