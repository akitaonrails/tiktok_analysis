package X;

import kotlin.jvm.internal.AFwS293S0000000_10;

/* JADX INFO: renamed from: X.0Q8R, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q8R implements C0PWT {
    public final long LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0Q8R) && this.LL == ((C0Q8R) obj).LL;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchUpdateEntToEndSessionAction(currentSearchSession=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0Q8R() {
        this(0L);
    }

    static {
        C0Q3E.LJFF().pR().LIZIZ(C13LE.LIZ(C0Q8R.class), AFwS293S0000000_10.get$arr$(191));
        C0Q3E.LJFF().uF().LIZIZ(C13LE.LIZ(C0Q8R.class), AFwS293S0000000_10.get$arr$(192));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C0Q8R(long j) {
        this.LL = j;
    }
}
