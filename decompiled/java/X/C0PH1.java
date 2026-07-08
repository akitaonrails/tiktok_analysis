package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PH1, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PH1 implements Comparable<C0PH1> {
    public final int LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final C0PGJ LLILZ;
    public final Function0<Unit> LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0PH1)) {
            return false;
        }
        C0PH1 c0ph1 = (C0PH1) obj;
        return this.LL == c0ph1.LL && Intrinsics.LJFF(this.LLILLJJLI, c0ph1.LLILLJJLI) && this.LLILLL == c0ph1.LLILLL && this.LLILZ == c0ph1.LLILZ && Intrinsics.LJFF(this.LLILZIL, c0ph1.LLILZIL);
    }

    public final int hashCode() {
        return (((((((this.LL * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchPriorityTask(priority=");
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
    public final int compareTo(C0PH1 c0ph1) {
        return c0ph1.LL - this.LL;
    }

    public C0PH1(int i, String str, boolean z, C0PGJ c0pgj, Function0<Unit> function0) {
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = c0pgj;
        this.LLILZIL = function0;
    }
}
