package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZUE, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZUE implements InterfaceC0148002o {
    public final List<C06TE> LL;
    public final List<AbstractC345490DgZ> LLILLJJLI;
    public final List<AbstractC345490DgZ> LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;

    public C0ZUE() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZUE)) {
            return false;
        }
        C0ZUE c0zue = (C0ZUE) obj;
        return Intrinsics.LJFF(this.LL, c0zue.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0zue.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0zue.LLILLL) && this.LLILZ == c0zue.LLILZ && this.LLILZIL == c0zue.LLILZIL;
    }

    public final int hashCode() {
        return (((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MediaGridState(tabs=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", awemePowerItems=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", privateMediaPowerItems=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isUpToOldest=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isLoading=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0ZUE(int i) {
        C13BV c13bv = C13BV.INSTANCE;
        this(c13bv, c13bv, c13bv, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0ZUE(List<C06TE> list, List<? extends AbstractC345490DgZ> list2, List<? extends AbstractC345490DgZ> list3, boolean z, boolean z2) {
        this.LL = list;
        this.LLILLJJLI = list2;
        this.LLILLL = list3;
        this.LLILZ = z;
        this.LLILZIL = z2;
    }

    public static C0ZUE LIZ(C0ZUE c0zue, List list, List list2, List list3, int i) {
        boolean z;
        boolean z2;
        List list4 = list3;
        List list5 = list2;
        List list6 = list;
        if ((i & 1) != 0) {
            list6 = c0zue.LL;
        }
        if ((i & 2) != 0) {
            list5 = c0zue.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            list4 = c0zue.LLILLL;
        }
        if ((i & 8) != 0) {
            z = c0zue.LLILZ;
        } else {
            z = false;
        }
        if ((i & 16) != 0) {
            z2 = c0zue.LLILZIL;
        } else {
            z2 = false;
        }
        c0zue.getClass();
        return new C0ZUE(list6, list5, list4, z, z2);
    }
}
