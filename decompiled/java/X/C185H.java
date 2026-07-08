package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.185H, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C185H {
    public final int LIZ;
    public final String LIZIZ;
    public final List<C1555800qaY> LIZJ;
    public final double LIZLLL;
    public final float LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C185H)) {
            return false;
        }
        C185H c185h = (C185H) obj;
        return this.LIZ == c185h.LIZ && Intrinsics.LJFF(this.LIZIZ, c185h.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c185h.LIZJ) && Double.compare(this.LIZLLL, c185h.LIZLLL) == 0 && Float.compare(this.LJ, c185h.LJ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaFlashSalePriceSceneVM(displayType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mainText=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", buyerInfos=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", priceCurveChangeRate=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", stockProgress=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.X2(this.LIZLLL)) * 31) + Float.floatToIntBits(this.LJ);
    }

    public C185H(int i, String str, float f, double d, List list) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = list;
        this.LIZLLL = d;
        this.LJ = f;
    }

    public static C185H LIZ(C185H c185h, int i, String str, List list, float f, int i2) {
        double d;
        float f2 = f;
        List list2 = list;
        String str2 = str;
        int i3 = i;
        if ((i2 & 1) != 0) {
            i3 = c185h.LIZ;
        }
        if ((i2 & 2) != 0) {
            str2 = c185h.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            list2 = c185h.LIZJ;
        }
        if ((i2 & 8) != 0) {
            d = c185h.LIZLLL;
        } else {
            d = 0.0d;
        }
        if ((i2 & 16) != 0) {
            f2 = c185h.LJ;
        }
        c185h.getClass();
        return new C185H(i3, str2, f2, d, list2);
    }
}
