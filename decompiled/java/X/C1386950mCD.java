package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mCD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1386950mCD extends AbstractC1387030mCL {
    public final String LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;

    public C1386950mCD() {
        this(false, 0, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1386950mCD)) {
            return false;
        }
        C1386950mCD c1386950mCD = (C1386950mCD) obj;
        return Intrinsics.LJFF(this.LIZ, c1386950mCD.LIZ) && this.LIZIZ == c1386950mCD.LIZIZ && this.LIZJ == c1386950mCD.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hasGuide=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", unReadCount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1386950mCD(boolean z, int i, int i2) {
        String str;
        if ((i2 & 1) != 0) {
            str = "success";
        } else {
            str = null;
        }
        z = (i2 & 2) != 0 ? false : z;
        i = (i2 & 4) != 0 ? 0 : i;
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = i;
    }
}
