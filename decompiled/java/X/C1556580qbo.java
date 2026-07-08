package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qbo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556580qbo {
    public final String LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1556580qbo)) {
            return false;
        }
        C1556580qbo c1556580qbo = (C1556580qbo) obj;
        return Intrinsics.LJFF(this.LIZ, c1556580qbo.LIZ) && this.LIZIZ == c1556580qbo.LIZIZ && this.LIZJ == c1556580qbo.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RechargePanelTitleBarUiData(titleText=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", showFaq=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", titlePaddingHorizontalDp=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1556580qbo(String str, boolean z, int i) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = i;
    }
}
