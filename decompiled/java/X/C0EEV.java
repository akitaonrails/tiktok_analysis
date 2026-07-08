package X;

import com.bytedance.ies.nle.editor_jni.NLEHSLColorType;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EEV, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EEV {
    public final C0EEX LIZ;
    public final NLEHSLColorType LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public NLESegmentFilter LJ;
    public double LJFF;
    public double LJI;
    public double LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0EEV)) {
            return false;
        }
        C0EEV c0eev = (C0EEV) obj;
        return Intrinsics.LJFF(this.LIZ, c0eev.LIZ) && this.LIZIZ == c0eev.LIZIZ && this.LIZJ == c0eev.LIZJ && this.LIZLLL == c0eev.LIZLLL && Intrinsics.LJFF(this.LJ, c0eev.LJ) && Double.compare(this.LJFF, c0eev.LJFF) == 0 && Double.compare(this.LJI, c0eev.LJI) == 0 && Double.compare(this.LJII, c0eev.LJII) == 0;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        NLESegmentFilter nLESegmentFilter = this.LJ;
        return ((((((iHashCode + (nLESegmentFilter == null ? 0 : nLESegmentFilter.hashCode())) * 31) + C786410Ut5.X2(this.LJFF)) * 31) + C786410Ut5.X2(this.LJI)) * 31) + C786410Ut5.X2(this.LJII);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HSLItemData(colorData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", nleHSLColorType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isUsed=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", nleFilter=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", hIntensity=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", sIntensity=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", lIntensity=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C0EEV LIZ(C0EEV c0eev) {
        C0EEX c0eex = c0eev.LIZ;
        NLEHSLColorType nLEHSLColorType = c0eev.LIZIZ;
        boolean z = c0eev.LIZJ;
        boolean z2 = c0eev.LIZLLL;
        NLESegmentFilter nLESegmentFilter = c0eev.LJ;
        double d = c0eev.LJFF;
        double d2 = c0eev.LJI;
        double d3 = c0eev.LJII;
        c0eev.getClass();
        return new C0EEV(c0eex, nLEHSLColorType, z, z2, nLESegmentFilter, d, d2, d3);
    }

    public /* synthetic */ C0EEV(C0EEX c0eex, NLEHSLColorType nLEHSLColorType) {
        this(c0eex, nLEHSLColorType, false, false, null, 0.5d, 0.5d, 0.5d);
    }

    public C0EEV(C0EEX c0eex, NLEHSLColorType nLEHSLColorType, boolean z, boolean z2, NLESegmentFilter nLESegmentFilter, double d, double d2, double d3) {
        this.LIZ = c0eex;
        this.LIZIZ = nLEHSLColorType;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = nLESegmentFilter;
        this.LJFF = d;
        this.LJI = d2;
        this.LJII = d3;
    }
}
