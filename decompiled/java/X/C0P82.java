package X;

import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0P82, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P82 implements C0PWT {
    public final C0PB1 LL;

    public C0P82() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0P82) && Intrinsics.LJFF(this.LL, ((C0P82) obj).LL);
    }

    public final int hashCode() {
        C0PB1 c0pb1 = this.LL;
        if (c0pb1 == null) {
            return 0;
        }
        return c0pb1.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateFeelgoodSurveyDataAction(data=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Ph1().LIZIZ(C13LE.LIZ(C0P82.class), AFwS293S0000000_10.get$arr$(173));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C0P82(C0PB1 c0pb1) {
        this.LL = c0pb1;
    }
}
