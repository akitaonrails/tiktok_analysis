package X;

import jkp.j;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0u0g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1687320u0g implements InterfaceC0148002o {
    public final InterfaceC1664360tPe<InterfaceC1672680td4> LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final C291001Au<Unit> LLILZ;
    public final int LLILZIL;
    public final String LLILZLL;

    public C1687320u0g() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1687320u0g)) {
            return false;
        }
        C1687320u0g c1687320u0g = (C1687320u0g) obj;
        return Intrinsics.LJFF(this.LL, c1687320u0g.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1687320u0g.LLILLJJLI) && this.LLILLL == c1687320u0g.LLILLL && Intrinsics.LJFF(this.LLILZ, c1687320u0g.LLILZ) && this.LLILZIL == c1687320u0g.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1687320u0g.LLILZLL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL) * 31) + this.LLILZLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AiVideoState(data=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", userQuery=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isFinalSubtitle=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", idleDetectedEvent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", userName=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1687320u0g(int i) {
        this(j.LLILLL, null, false, new C291001Au(null), EnumC1301920jz4.VOICE.getCode(), "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1687320u0g(InterfaceC1664360tPe<? extends InterfaceC1672680td4> interfaceC1664360tPe, String str, boolean z, C291001Au<Unit> c291001Au, int i, String str2) {
        this.LL = interfaceC1664360tPe;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = c291001Au;
        this.LLILZIL = i;
        this.LLILZLL = str2;
    }

    public static C1687320u0g LIZ(C1687320u0g c1687320u0g, InterfaceC1664360tPe interfaceC1664360tPe, String str, boolean z, C291001Au c291001Au, int i, String str2, int i2) {
        String str3 = str2;
        int i3 = i;
        C291001Au c291001Au2 = c291001Au;
        boolean z2 = z;
        String str4 = str;
        InterfaceC1664360tPe interfaceC1664360tPe2 = interfaceC1664360tPe;
        if ((i2 & 1) != 0) {
            interfaceC1664360tPe2 = c1687320u0g.LL;
        }
        if ((i2 & 2) != 0) {
            str4 = c1687320u0g.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            z2 = c1687320u0g.LLILLL;
        }
        if ((i2 & 8) != 0) {
            c291001Au2 = c1687320u0g.LLILZ;
        }
        if ((i2 & 16) != 0) {
            i3 = c1687320u0g.LLILZIL;
        }
        if ((i2 & 32) != 0) {
            str3 = c1687320u0g.LLILZLL;
        }
        c1687320u0g.getClass();
        return new C1687320u0g(interfaceC1664360tPe2, str4, z2, c291001Au2, i3, str3);
    }
}
