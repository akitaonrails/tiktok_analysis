package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CM8, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CM8 implements Comparable<C0CM8> {
    public final int LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final C0CME LLILZ;
    public final Function0<Unit> LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0CM8)) {
            return false;
        }
        C0CM8 c0cm8 = (C0CM8) obj;
        return this.LL == c0cm8.LL && Intrinsics.LJFF(this.LLILLJJLI, c0cm8.LLILLJJLI) && this.LLILLL == c0cm8.LLILLL && this.LLILZ == c0cm8.LLILZ && Intrinsics.LJFF(this.LLILZIL, c0cm8.LLILZIL);
    }

    public final int hashCode() {
        return (((((((this.LL * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PriorityTask(priority=");
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
    public final int compareTo(C0CM8 c0cm8) {
        return c0cm8.LL - this.LL;
    }

    public C0CM8(int i, C0CME c0cme, String str, Function0 function0, boolean z) {
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = c0cme;
        this.LLILZIL = function0;
    }
}
