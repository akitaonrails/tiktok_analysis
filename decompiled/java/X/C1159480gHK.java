package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gHK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1159480gHK implements InterfaceC1891350zJl {
    public final int LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final float LLILZ;
    public final EnumC1159500gHM LLILZIL;
    public final boolean LLILZLL;
    public final boolean LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1159480gHK)) {
            return false;
        }
        C1159480gHK c1159480gHK = (C1159480gHK) obj;
        return this.LL == c1159480gHK.LL && Intrinsics.LJFF(this.LLILLJJLI, c1159480gHK.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1159480gHK.LLILLL) && Float.compare(this.LLILZ, c1159480gHK.LLILZ) == 0 && this.LLILZIL == c1159480gHK.LLILZIL && this.LLILZLL == c1159480gHK.LLILZLL && this.LLIZ == c1159480gHK.LLIZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeekBarItem(uniqueId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", originStrength=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", enable=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", alreadyMoved=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL * 31) + this.LLILLJJLI.hashCode()) * 31;
        String str = this.LLILLL;
        return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Float.floatToIntBits(this.LLILZ)) * 31) + this.LLILZIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + C786410Ut5.Z2(this.LLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1159480gHK c1159480gHK;
        if (interfaceC1891350zJl instanceof C1159480gHK) {
            c1159480gHK = (C1159480gHK) interfaceC1891350zJl;
        } else {
            c1159480gHK = null;
        }
        if (c1159480gHK == null || this.LL != c1159480gHK.LL || !Intrinsics.LJFF(this.LLILLJJLI, c1159480gHK.LLILLJJLI) || !Intrinsics.LJFF(this.LLILLL, c1159480gHK.LLILLL)) {
            return false;
        }
        return true;
    }

    public static C1159480gHK LIZ(C1159480gHK c1159480gHK, float f, boolean z, boolean z2, int i) {
        int i2;
        String str;
        String str2;
        boolean z3 = z2;
        boolean z4 = z;
        float f2 = f;
        if ((i & 1) != 0) {
            i2 = c1159480gHK.LL;
        } else {
            i2 = 0;
        }
        EnumC1159500gHM enumC1159500gHM = null;
        if ((i & 2) != 0) {
            str = c1159480gHK.LLILLJJLI;
        } else {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = c1159480gHK.LLILLL;
        } else {
            str2 = null;
        }
        if ((i & 8) != 0) {
            f2 = c1159480gHK.LLILZ;
        }
        if ((i & 16) != 0) {
            enumC1159500gHM = c1159480gHK.LLILZIL;
        }
        if ((i & 32) != 0) {
            z4 = c1159480gHK.LLILZLL;
        }
        if ((i & 64) != 0) {
            z3 = c1159480gHK.LLIZ;
        }
        c1159480gHK.getClass();
        return new C1159480gHK(i2, str, str2, f2, enumC1159500gHM, z4, z3);
    }

    public C1159480gHK(int i, String str, String str2, float f, EnumC1159500gHM enumC1159500gHM, boolean z, boolean z2) {
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = f;
        this.LLILZIL = enumC1159500gHM;
        this.LLILZLL = z;
        this.LLIZ = z2;
    }
}
