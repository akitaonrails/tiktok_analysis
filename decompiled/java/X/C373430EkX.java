package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EkX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C373430EkX {
    public final int LIZ;
    public final boolean LIZIZ;
    public final float LIZJ;
    public final Integer LIZLLL;
    public final float LJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C373430EkX() {
        this(0, (boolean) (0 == true ? 1 : 0), 0.0f, (Integer) null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C373430EkX)) {
            return false;
        }
        C373430EkX c373430EkX = (C373430EkX) obj;
        return this.LIZ == c373430EkX.LIZ && this.LIZIZ == c373430EkX.LIZIZ && Float.compare(this.LIZJ, c373430EkX.LIZJ) == 0 && Intrinsics.LJFF(this.LIZLLL, c373430EkX.LIZLLL) && Float.compare(this.LJ, c373430EkX.LJ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConsoleBarViewState(visibility=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enable=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", alpha=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", scale=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iZ2 = ((((this.LIZ * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31;
        Integer num = this.LIZLLL;
        return ((iZ2 + (num == null ? 0 : num.hashCode())) * 31) + Float.floatToIntBits(this.LJ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C373430EkX(int i, boolean z, float f, Integer num, int i2) {
        float f2;
        i = (i2 & 1) != 0 ? 4 : i;
        z = (i2 & 2) != 0 ? true : z;
        f = (i2 & 4) != 0 ? 1.0f : f;
        num = (i2 & 8) != 0 ? null : num;
        if ((i2 & 16) != 0) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        this(i, z, f, num, f2);
    }

    public C373430EkX(int i, boolean z, float f, Integer num, float f2) {
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = f;
        this.LIZLLL = num;
        this.LJ = f2;
    }

    public static C373430EkX LIZ(C373430EkX c373430EkX, int i, boolean z, float f, Integer num, float f2, int i2) {
        float f3 = f2;
        Integer num2 = num;
        float f4 = f;
        boolean z2 = z;
        int i3 = i;
        if ((i2 & 1) != 0) {
            i3 = c373430EkX.LIZ;
        }
        if ((i2 & 2) != 0) {
            z2 = c373430EkX.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            f4 = c373430EkX.LIZJ;
        }
        if ((i2 & 8) != 0) {
            num2 = c373430EkX.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            f3 = c373430EkX.LJ;
        }
        return new C373430EkX(i3, z2, f4, num2, f3);
    }
}
