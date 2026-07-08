package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07ee, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1914207ee {
    public final int LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;

    public C1914207ee() {
        this(null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1914207ee)) {
            return false;
        }
        C1914207ee c1914207ee = (C1914207ee) obj;
        return this.LIZ == c1914207ee.LIZ && this.LIZIZ == c1914207ee.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1914207ee.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CaptionFormatPanelConfig(panelHeight=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", autoResizeCanvasOnPanelToggle=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", currentLanguage=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1914207ee(String str, int i) {
        int iLIZIZ;
        if ((i & 1) != 0) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(319));
        } else {
            iLIZIZ = 0;
        }
        str = (i & 4) != 0 ? "" : str;
        this.LIZ = iLIZIZ;
        this.LIZIZ = false;
        this.LIZJ = str;
    }
}
