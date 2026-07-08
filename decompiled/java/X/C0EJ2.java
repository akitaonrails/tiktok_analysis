package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EJ2, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EJ2 {
    public final int LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;

    public C0EJ2() {
        this(0, false, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0EJ2)) {
            return false;
        }
        C0EJ2 c0ej2 = (C0EJ2) obj;
        return this.LIZ == c0ej2.LIZ && this.LIZIZ == c0ej2.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0ej2.LIZJ) && this.LIZLLL == c0ej2.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CaptionFillerWordPanelConfig(panelHeight=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", fromEditPanel=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", currentLanguage=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", autoResizeCanvasOnPanelToggle=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0EJ2(int i, boolean z, String str, int i2) {
        i = (i2 & 1) != 0 ? ((int) (C1415610mwR.LIZ() * 0.4f)) + C0ES4.LIZJ : i;
        z = (i2 & 2) != 0 ? false : z;
        str = (i2 & 4) != 0 ? "" : str;
        boolean z2 = (i2 & 8) != 0;
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = str;
        this.LIZLLL = z2;
    }
}
