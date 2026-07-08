package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05vy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1512005vy implements InterfaceC0148002o {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;
    public final List<C05MO> LLILZIL;
    public final C291001Au<Unit> LLILZLL;

    public C1512005vy() {
        this(null, null, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1512005vy)) {
            return false;
        }
        C1512005vy c1512005vy = (C1512005vy) obj;
        return Intrinsics.LJFF(this.LL, c1512005vy.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1512005vy.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1512005vy.LLILLL) && this.LLILZ == c1512005vy.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1512005vy.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1512005vy.LLILZLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        String str = this.LLILLL;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + this.LLILZIL.hashCode()) * 31;
        C291001Au<Unit> c291001Au = this.LLILZLL;
        return iHashCode2 + (c291001Au != null ? c291001Au.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InstructionEditState(currentText=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", conflictError=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isSubmitting=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", highlightRanges=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", closeTaskEvent=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1512005vy(String str, String str2, C13BV c13bv, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", null, false, (i & 16) != 0 ? C13BV.INSTANCE : c13bv, null);
    }

    public C1512005vy(String str, String str2, String str3, boolean z, List<C05MO> list, C291001Au<Unit> c291001Au) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = z;
        this.LLILZIL = list;
        this.LLILZLL = c291001Au;
    }

    public static C1512005vy LIZ(C1512005vy c1512005vy, String str, String str2, boolean z, List list, C291001Au c291001Au, int i) {
        String str3;
        C291001Au c291001Au2 = c291001Au;
        List list2 = list;
        boolean z2 = z;
        String str4 = str2;
        String str5 = str;
        if ((i & 1) != 0) {
            str5 = c1512005vy.LL;
        }
        if ((i & 2) != 0) {
            str3 = c1512005vy.LLILLJJLI;
        } else {
            str3 = null;
        }
        if ((i & 4) != 0) {
            str4 = c1512005vy.LLILLL;
        }
        if ((i & 8) != 0) {
            z2 = c1512005vy.LLILZ;
        }
        if ((i & 16) != 0) {
            list2 = c1512005vy.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au2 = c1512005vy.LLILZLL;
        }
        c1512005vy.getClass();
        return new C1512005vy(str5, str3, str4, z2, list2, c291001Au2);
    }
}
