package X;

import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EF5, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EF5 {
    public final EnumC355950DxR LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public NLESegmentFilter LJI;
    public final Integer LJII;
    public float LJIIIIZZ;
    public final Float LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0EF5)) {
            return false;
        }
        C0EF5 c0ef5 = (C0EF5) obj;
        return this.LIZ == c0ef5.LIZ && this.LIZIZ == c0ef5.LIZIZ && this.LIZJ == c0ef5.LIZJ && this.LIZLLL == c0ef5.LIZLLL && this.LJ == c0ef5.LJ && this.LJFF == c0ef5.LJFF && Intrinsics.LJFF(this.LJI, c0ef5.LJI) && Intrinsics.LJFF(this.LJII, c0ef5.LJII) && Float.compare(this.LJIIIIZZ, c0ef5.LJIIIIZZ) == 0 && Intrinsics.LJFF(this.LJIIIZ, c0ef5.LJIIIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdjustItemData(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", iconResId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", nameResId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", hasNegative=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isUsed=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isSelect=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", nleFilter=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", defaultIntensity=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", intensity=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", lastUseIntensity=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31;
        NLESegmentFilter nLESegmentFilter = this.LJI;
        int iHashCode2 = (iHashCode + (nLESegmentFilter == null ? 0 : nLESegmentFilter.hashCode())) * 31;
        Integer num = this.LJII;
        int iHashCode3 = (((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + Float.floatToIntBits(this.LJIIIIZZ)) * 31;
        Float f = this.LJIIIZ;
        return iHashCode3 + (f != null ? f.hashCode() : 0);
    }

    public static C0EF5 LIZ(C0EF5 c0ef5) {
        EnumC355950DxR enumC355950DxR = c0ef5.LIZ;
        int i = c0ef5.LIZIZ;
        int i2 = c0ef5.LIZJ;
        boolean z = c0ef5.LIZLLL;
        boolean z2 = c0ef5.LJ;
        boolean z3 = c0ef5.LJFF;
        NLESegmentFilter nLESegmentFilter = c0ef5.LJI;
        Integer num = c0ef5.LJII;
        float f = c0ef5.LJIIIIZZ;
        Float f2 = c0ef5.LJIIIZ;
        c0ef5.getClass();
        return new C0EF5(enumC355950DxR, i, i2, z, z2, z3, nLESegmentFilter, num, f, f2);
    }

    public /* synthetic */ C0EF5(EnumC355950DxR enumC355950DxR, int i, int i2, boolean z, Integer num, int i3) {
        this(enumC355950DxR, i, i2, z, false, false, null, (i3 & 128) != 0 ? null : num, 0.0f, null);
    }

    public C0EF5(EnumC355950DxR enumC355950DxR, int i, int i2, boolean z, boolean z2, boolean z3, NLESegmentFilter nLESegmentFilter, Integer num, float f, Float f2) {
        this.LIZ = enumC355950DxR;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = z3;
        this.LJI = nLESegmentFilter;
        this.LJII = num;
        this.LJIIIIZZ = f;
        this.LJIIIZ = f2;
    }
}
