package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QS8, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QS8 implements InterfaceC0148002o {
    public final float LL;
    public final float LLILLJJLI;
    public final float LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final C291001Au<Boolean> LLILZLL;

    public C0QS8() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0QS8)) {
            return false;
        }
        C0QS8 c0qs8 = (C0QS8) obj;
        return Float.compare(this.LL, c0qs8.LL) == 0 && Float.compare(this.LLILLJJLI, c0qs8.LLILLJJLI) == 0 && Float.compare(this.LLILLL, c0qs8.LLILLL) == 0 && this.LLILZ == c0qs8.LLILZ && this.LLILZIL == c0qs8.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c0qs8.LLILZLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoButtonState(translateY=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", translateX=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", alpha=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", visibility=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", showToolTip=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", shouldPostShowMob=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iFloatToIntBits = ((((((((Float.floatToIntBits(this.LL) * 31) + Float.floatToIntBits(this.LLILLJJLI)) * 31) + Float.floatToIntBits(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31;
        C291001Au<Boolean> c291001Au = this.LLILZLL;
        return iFloatToIntBits + (c291001Au == null ? 0 : c291001Au.hashCode());
    }

    public /* synthetic */ C0QS8(int i) {
        this(0.0f, 0.0f, 1.0f, false, false, null);
    }

    public C0QS8(float f, float f2, float f3, boolean z, boolean z2, C291001Au<Boolean> c291001Au) {
        this.LL = f;
        this.LLILLJJLI = f2;
        this.LLILLL = f3;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = c291001Au;
    }

    public static C0QS8 LIZ(C0QS8 c0qs8, float f, float f2, boolean z, boolean z2, C291001Au c291001Au, int i) {
        float f3;
        C291001Au c291001Au2 = c291001Au;
        boolean z3 = z2;
        boolean z4 = z;
        float f4 = f2;
        float f5 = f;
        if ((i & 1) != 0) {
            f5 = c0qs8.LL;
        }
        if ((i & 2) != 0) {
            f4 = c0qs8.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            f3 = c0qs8.LLILLL;
        } else {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            z4 = c0qs8.LLILZ;
        }
        if ((i & 16) != 0) {
            z3 = c0qs8.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au2 = c0qs8.LLILZLL;
        }
        c0qs8.getClass();
        return new C0QS8(f5, f4, f3, z4, z3, c291001Au2);
    }
}
