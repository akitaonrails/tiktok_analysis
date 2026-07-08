package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14Kl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20247714Kl implements InterfaceC0148002o {
    public final C291001Au<C20248414Ks> LL;
    public final EnumC1783090wV9 LLILLJJLI;
    public final int LLILLL;
    public final float LLILZ;
    public final int LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20247714Kl)) {
            return false;
        }
        C20247714Kl c20247714Kl = (C20247714Kl) obj;
        return Intrinsics.LJFF(this.LL, c20247714Kl.LL) && this.LLILLJJLI == c20247714Kl.LLILLJJLI && this.LLILLL == c20247714Kl.LLILLL && Float.compare(this.LLILZ, c20247714Kl.LLILZ) == 0 && this.LLILZIL == c20247714Kl.LLILZIL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FlexiblePanelVMState(triggerClose=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", pageState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", sheetState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", scrollOffest=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", sheetTop=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL) * 31) + Float.floatToIntBits(this.LLILZ)) * 31) + this.LLILZIL;
    }

    public C20247714Kl(C291001Au<C20248414Ks> c291001Au, EnumC1783090wV9 enumC1783090wV9, int i, float f, int i2) {
        this.LL = c291001Au;
        this.LLILLJJLI = enumC1783090wV9;
        this.LLILLL = i;
        this.LLILZ = f;
        this.LLILZIL = i2;
    }

    public static C20247714Kl LIZ(C20247714Kl c20247714Kl, C291001Au c291001Au, EnumC1783090wV9 enumC1783090wV9, int i, float f, int i2, int i3) {
        int i4 = i2;
        float f2 = f;
        int i5 = i;
        EnumC1783090wV9 enumC1783090wV92 = enumC1783090wV9;
        C291001Au c291001Au2 = c291001Au;
        if ((i3 & 1) != 0) {
            c291001Au2 = c20247714Kl.LL;
        }
        if ((i3 & 2) != 0) {
            enumC1783090wV92 = c20247714Kl.LLILLJJLI;
        }
        if ((i3 & 4) != 0) {
            i5 = c20247714Kl.LLILLL;
        }
        if ((i3 & 8) != 0) {
            f2 = c20247714Kl.LLILZ;
        }
        if ((i3 & 16) != 0) {
            i4 = c20247714Kl.LLILZIL;
        }
        c20247714Kl.getClass();
        return new C20247714Kl(c291001Au2, enumC1783090wV92, i5, f2, i4);
    }
}
