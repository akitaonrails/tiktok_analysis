package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HN5, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HN5 {
    public static final /* synthetic */ int LJIIJ = 0;
    public final EnumC513530KBz LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final float LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final Integer LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HN5)) {
            return false;
        }
        C0HN5 c0hn5 = (C0HN5) obj;
        return this.LIZ == c0hn5.LIZ && Float.compare(this.LIZIZ, c0hn5.LIZIZ) == 0 && Float.compare(this.LIZJ, c0hn5.LIZJ) == 0 && this.LIZLLL == c0hn5.LIZLLL && this.LJ == c0hn5.LJ && Float.compare(this.LJFF, c0hn5.LJFF) == 0 && this.LJI == c0hn5.LJI && this.LJII == c0hn5.LJII && this.LJIIIIZZ == c0hn5.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c0hn5.LJIIIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PgcSheetOptions(style=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", heightRatio=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", maxHeightRatio=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", peekHeight=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", dragEnabled=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", cornerRadiusDp=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", skipCollapsedState=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", hideable=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", usesBehaviorControlledHeight=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", maxWidthDpForPad=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((this.LIZ.hashCode() * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + this.LIZLLL) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + Float.floatToIntBits(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII)) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31;
        Integer num = this.LJIIIZ;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public C0HN5(EnumC513530KBz enumC513530KBz, float f, float f2, int i, boolean z, boolean z2, boolean z3, boolean z4, Integer num, int i2) {
        f = (i2 & 2) != 0 ? 0.0f : f;
        f2 = (i2 & 4) != 0 ? 0.0f : f2;
        i = (i2 & 8) != 0 ? -1 : i;
        z = (i2 & 16) != 0 ? true : z;
        float f3 = (i2 & 32) != 0 ? 12.0f : 0.0f;
        z2 = (i2 & 64) != 0 ? true : z2;
        z3 = (i2 & 128) != 0 ? true : z3;
        z4 = (i2 & 256) != 0 ? false : z4;
        num = (i2 & 512) != 0 ? null : num;
        this.LIZ = enumC513530KBz;
        this.LIZIZ = f;
        this.LIZJ = f2;
        this.LIZLLL = i;
        this.LJ = z;
        this.LJFF = f3;
        this.LJI = z2;
        this.LJII = z3;
        this.LJIIIIZZ = z4;
        this.LJIIIZ = num;
    }
}
