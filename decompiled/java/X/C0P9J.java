package X;

import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0P9J, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P9J implements C0PWT {
    public final boolean LL;
    public final String LLILLJJLI;

    public C0P9J() {
        this(false, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0P9J)) {
            return false;
        }
        C0P9J c0p9j = (C0P9J) obj;
        return this.LL == c0p9j.LL && Intrinsics.LJFF(this.LLILLJJLI, c0p9j.LLILLJJLI);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecordSearchLatestGroupIdAction(isFullscreen=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", groupId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().FF2().LIZIZ(C13LE.LIZ(C0P9J.class), AFwS293S0000000_10.get$arr$(147));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C0P9J(boolean z, String str) {
        this.LL = z;
        this.LLILLJJLI = str;
    }
}
