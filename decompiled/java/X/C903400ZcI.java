package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZcI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C903400ZcI extends AbstractC903430ZcL {
    public final String LIZIZ;
    public final boolean LIZJ;
    public final C903380ZcG LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C903400ZcI)) {
            return false;
        }
        C903400ZcI c903400ZcI = (C903400ZcI) obj;
        return Intrinsics.LJFF(this.LIZIZ, c903400ZcI.LIZIZ) && this.LIZJ == c903400ZcI.LIZJ && Intrinsics.LJFF(this.LIZLLL, c903400ZcI.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        C903380ZcG c903380ZcG = this.LIZLLL;
        return iHashCode + (c903380ZcG == null ? 0 : c903380ZcG.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Translated(translationLang=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", autoTranslate=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", bizCompData=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C903400ZcI(String str, boolean z, C903380ZcG c903380ZcG) {
        super(C0SKK.TRANSLATED);
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = c903380ZcG;
    }
}
