package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HQU, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HQU implements InterfaceC0148002o {
    public final List<C440830HQj> LL;
    public final boolean LLILLJJLI;
    public final int LLILLL;
    public final boolean LLILZ;
    public final long LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HQU)) {
            return false;
        }
        C0HQU c0hqu = (C0HQU) obj;
        return Intrinsics.LJFF(this.LL, c0hqu.LL) && this.LLILLJJLI == c0hqu.LLILLJJLI && this.LLILLL == c0hqu.LLILLL && this.LLILZ == c0hqu.LLILZ && this.LLILZIL == c0hqu.LLILZIL;
    }

    public final int hashCode() {
        return (((((((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + this.LLILLL) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Y2(this.LLILZIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixStudioResultsPageState(results=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isGeneratingStatic=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", imageSelectedIndex=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", canGenerateMore=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", enterTimestampMS=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0HQU(boolean z, boolean z2, long j, int i, List list) {
        this.LL = list;
        this.LLILLJJLI = z;
        this.LLILLL = i;
        this.LLILZ = z2;
        this.LLILZIL = j;
    }

    public static C0HQU LIZ(C0HQU c0hqu, List list, boolean z, int i, boolean z2, long j, int i2) {
        long j2 = j;
        boolean z3 = z2;
        int i3 = i;
        boolean z4 = z;
        List list2 = list;
        if ((i2 & 1) != 0) {
            list2 = c0hqu.LL;
        }
        if ((i2 & 2) != 0) {
            z4 = c0hqu.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            i3 = c0hqu.LLILLL;
        }
        if ((i2 & 8) != 0) {
            z3 = c0hqu.LLILZ;
        }
        if ((i2 & 16) != 0) {
            j2 = c0hqu.LLILZIL;
        }
        c0hqu.getClass();
        return new C0HQU(z4, z3, j2, i3, list2);
    }
}
