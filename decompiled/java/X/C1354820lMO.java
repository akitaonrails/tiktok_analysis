package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lMO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1354820lMO implements InterfaceC0148002o {
    public final EnumC1354770lMJ LL;
    public final int LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final C291001Au<Unit> LLILZIL;

    public C1354820lMO() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1354820lMO)) {
            return false;
        }
        C1354820lMO c1354820lMO = (C1354820lMO) obj;
        return this.LL == c1354820lMO.LL && this.LLILLJJLI == c1354820lMO.LLILLJJLI && this.LLILLL == c1354820lMO.LLILLL && this.LLILZ == c1354820lMO.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1354820lMO.LLILZIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31;
        C291001Au<Unit> c291001Au = this.LLILZIL;
        return iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DanmakuInputVMState(panelType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", softKeyboardHeight=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isSoftKeyboardOpened=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isInputtingContent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", triggerCloseInputFragment=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1354820lMO(int i) {
        this(EnumC1354770lMJ.SOFT_KEYBOARD, 0, false, false, null);
    }

    public C1354820lMO(EnumC1354770lMJ enumC1354770lMJ, int i, boolean z, boolean z2, C291001Au<Unit> c291001Au) {
        this.LL = enumC1354770lMJ;
        this.LLILLJJLI = i;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = c291001Au;
    }

    public static C1354820lMO LIZ(C1354820lMO c1354820lMO, EnumC1354770lMJ enumC1354770lMJ, int i, boolean z, boolean z2, C291001Au c291001Au, int i2) {
        C291001Au c291001Au2 = c291001Au;
        boolean z3 = z2;
        boolean z4 = z;
        int i3 = i;
        EnumC1354770lMJ enumC1354770lMJ2 = enumC1354770lMJ;
        if ((i2 & 1) != 0) {
            enumC1354770lMJ2 = c1354820lMO.LL;
        }
        if ((i2 & 2) != 0) {
            i3 = c1354820lMO.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            z4 = c1354820lMO.LLILLL;
        }
        if ((i2 & 8) != 0) {
            z3 = c1354820lMO.LLILZ;
        }
        if ((i2 & 16) != 0) {
            c291001Au2 = c1354820lMO.LLILZIL;
        }
        c1354820lMO.getClass();
        return new C1354820lMO(enumC1354770lMJ2, i3, z4, z3, c291001Au2);
    }
}
