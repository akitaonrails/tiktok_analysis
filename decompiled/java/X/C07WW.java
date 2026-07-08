package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07WW, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07WW {
    public final String LIZ;
    public final float LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07WW)) {
            return false;
        }
        C07WW c07ww = (C07WW) obj;
        return Intrinsics.LJFF(this.LIZ, c07ww.LIZ) && Float.compare(this.LIZIZ, c07ww.LIZIZ) == 0 && this.LIZJ == c07ww.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdjustOpacityPanelSceneState(editType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", currentAlpha=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", panelEnable=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public C07WW(String str, float f, boolean z) {
        this.LIZ = str;
        this.LIZIZ = f;
        this.LIZJ = z;
    }

    public static C07WW LIZ(C07WW c07ww, float f, boolean z, int i) {
        String str;
        if ((i & 1) != 0) {
            str = c07ww.LIZ;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            f = c07ww.LIZIZ;
        }
        if ((i & 4) != 0) {
            z = c07ww.LIZJ;
        }
        c07ww.getClass();
        return new C07WW(str, f, z);
    }
}
