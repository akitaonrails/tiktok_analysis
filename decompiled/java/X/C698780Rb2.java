package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rb2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698780Rb2 {
    public final String LIZ;
    public final long LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C698780Rb2)) {
            return false;
        }
        C698780Rb2 c698780Rb2 = (C698780Rb2) obj;
        return Intrinsics.LJFF(this.LIZ, c698780Rb2.LIZ) && this.LIZIZ == c698780Rb2.LIZIZ && this.LIZJ == c698780Rb2.LIZJ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RequestContext(awemeId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", generation=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", executeSeq=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C698780Rb2(String str, long j, long j2) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = j2;
    }
}
