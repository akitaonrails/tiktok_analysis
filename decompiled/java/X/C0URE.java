package X;

import android.app.Dialog;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0URE, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0URE implements Comparable<C0URE> {
    public final Dialog LL;
    public final C0URF LLILLJJLI;
    public final long LLILLL;
    public final C0UQ3 LLILZ;
    public final String LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0URE)) {
            return false;
        }
        C0URE c0ure = (C0URE) obj;
        return Intrinsics.LJFF(this.LL, c0ure.LL) && this.LLILLJJLI == c0ure.LLILLJJLI && this.LLILLL == c0ure.LLILLL && Intrinsics.LJFF(this.LLILZ, c0ure.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0ure.LLILZIL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Y2(this.LLILLL)) * 31;
        C0UQ3 c0uq3 = this.LLILZ;
        int iHashCode2 = (iHashCode + (c0uq3 == null ? 0 : c0uq3.hashCode())) * 31;
        String str = this.LLILZIL;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DialogWithTimestamp(toShowDialog=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", priority=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", callBack=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", dialogTag=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C0URE c0ure) {
        C0URE c0ure2 = c0ure;
        if (this.LLILLJJLI.getPriorityInt() == c0ure2.LLILLJJLI.getPriorityInt()) {
            return (int) (this.LLILLL - c0ure2.LLILLL);
        }
        return c0ure2.LLILLJJLI.getPriorityInt() - this.LLILLJJLI.getPriorityInt();
    }

    public C0URE(DialogC19728412Gs dialogC19728412Gs, C0URF c0urf, long j, C0UQ3 c0uq3, String str) {
        this.LL = dialogC19728412Gs;
        this.LLILLJJLI = c0urf;
        this.LLILLL = j;
        this.LLILZ = c0uq3;
        this.LLILZIL = str;
    }
}
