package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ubr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C775730Ubr extends AbstractC775780Ubw {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C775730Ubr)) {
            return false;
        }
        C775730Ubr c775730Ubr = (C775730Ubr) obj;
        return Intrinsics.LJFF(this.LIZ, c775730Ubr.LIZ) && Intrinsics.LJFF(this.LIZIZ, c775730Ubr.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c775730Ubr.LIZJ) && this.LIZLLL == c775730Ubr.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReportButtonClick(changeEntry=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", clickType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", toastType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C775730Ubr(String str, String str2, String str3, int i) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = i;
    }
}
