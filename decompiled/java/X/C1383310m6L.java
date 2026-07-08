package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0m6L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1383310m6L implements InterfaceC0148002o {
    public Boolean LL;
    public int LLILLJJLI;
    public final int LLILLL;

    public C1383310m6L() {
        this(7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1383310m6L)) {
            return false;
        }
        C1383310m6L c1383310m6L = (C1383310m6L) obj;
        return Intrinsics.LJFF(this.LL, c1383310m6L.LL) && this.LLILLJJLI == c1383310m6L.LLILLJJLI && this.LLILLL == c1383310m6L.LLILLL;
    }

    public final int hashCode() {
        Boolean bool = this.LL;
        return ((((bool == null ? 0 : bool.hashCode()) * 31) + this.LLILLJJLI) * 31) + this.LLILLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NonPersonalizedState(triggerNP=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", showToastOpt=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", showToastScenario=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1383310m6L(int i, Boolean bool) {
        int i2;
        bool = (i & 1) != 0 ? null : bool;
        if ((i & 2) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        this(i2, 0, bool);
    }

    public C1383310m6L(int i, int i2, Boolean bool) {
        this.LL = bool;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }

    public static C1383310m6L LIZ(C1383310m6L c1383310m6L, Boolean bool, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            bool = c1383310m6L.LL;
        }
        if ((i3 & 2) != 0) {
            i = c1383310m6L.LLILLJJLI;
        }
        if ((i3 & 4) != 0) {
            i2 = c1383310m6L.LLILLL;
        }
        c1383310m6L.getClass();
        return new C1383310m6L(i, i2, bool);
    }
}
