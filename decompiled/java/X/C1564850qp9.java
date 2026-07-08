package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qp9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1564850qp9 implements Comparable<C1564850qp9> {
    public final int LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final EnumC1564840qp8 LLILZ;
    public final Function0<Unit> LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1564850qp9)) {
            return false;
        }
        C1564850qp9 c1564850qp9 = (C1564850qp9) obj;
        return this.LL == c1564850qp9.LL && Intrinsics.LJFF(this.LLILLJJLI, c1564850qp9.LLILLJJLI) && this.LLILLL == c1564850qp9.LLILLL && this.LLILZ == c1564850qp9.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1564850qp9.LLILZIL);
    }

    public final int hashCode() {
        return (((((((this.LL * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoPriorityTask(priority=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", tag=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isBackground=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", task=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C1564850qp9 c1564850qp9) {
        return c1564850qp9.LL - this.LL;
    }

    public C1564850qp9(int i, String str, boolean z, EnumC1564840qp8 enumC1564840qp8, Function0<Unit> function0) {
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = enumC1564840qp8;
        this.LLILZIL = function0;
    }
}
