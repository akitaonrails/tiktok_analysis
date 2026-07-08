package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ubs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C775740Ubs extends AbstractC775780Ubw {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C775740Ubs)) {
            return false;
        }
        C775740Ubs c775740Ubs = (C775740Ubs) obj;
        return Intrinsics.LJFF(this.LIZ, c775740Ubs.LIZ) && Intrinsics.LJFF(this.LIZIZ, c775740Ubs.LIZIZ) && this.LIZJ == c775740Ubs.LIZJ && this.LIZLLL == c775740Ubs.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReportButtonShow(enterFrom=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", toastType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", stableModeStatus=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C775740Ubs(String str, String str2, int i, int i2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = i2;
    }
}
