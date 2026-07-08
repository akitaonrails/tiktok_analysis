package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TQa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C746500TQa {
    public final String LIZ;
    public final List<C746510TQb> LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C746500TQa)) {
            return false;
        }
        C746500TQa c746500TQa = (C746500TQa) obj;
        return Intrinsics.LJFF(this.LIZ, c746500TQa.LIZ) && Intrinsics.LJFF(this.LIZIZ, c746500TQa.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c746500TQa.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c746500TQa.LIZLLL) && Intrinsics.LJFF(this.LJ, c746500TQa.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SheetContent(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", benefitDetails=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", footNote=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", primaryButtonText=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", secondaryButtonText=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C746500TQa(String str, List<C746510TQb> list, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
    }
}
