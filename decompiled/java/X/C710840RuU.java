package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RuU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C710840RuU {
    public final String LIZ;
    public final C160B LIZIZ;
    public final boolean LIZJ;
    public final C0Q69 LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C710840RuU)) {
            return false;
        }
        C710840RuU c710840RuU = (C710840RuU) obj;
        return Intrinsics.LJFF(this.LIZ, c710840RuU.LIZ) && this.LIZIZ == c710840RuU.LIZIZ && this.LIZJ == c710840RuU.LIZJ && Intrinsics.LJFF(this.LIZLLL, c710840RuU.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CaptionDisplayUIData(captionText=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", captionIUDisplayState=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", showEditHint=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", captionUpdateParams=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C710840RuU(String str, C160B c160b, boolean z, C0Q69 c0q69) {
        this.LIZ = str;
        this.LIZIZ = c160b;
        this.LIZJ = z;
        this.LIZLLL = c0q69;
    }
}
