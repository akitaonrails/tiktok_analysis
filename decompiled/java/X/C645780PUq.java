package X;

import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PUq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C645780PUq implements C0PWT {
    public final Long LL;

    public C645780PUq() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C645780PUq) && Intrinsics.LJFF(this.LL, ((C645780PUq) obj).LL);
    }

    public final int hashCode() {
        Long l = this.LL;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateAwemeStartPlayTimeForCsAction(awemeStartPlayTimeForCs=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Y30().LIZIZ(C13LE.LIZ(C645780PUq.class), AFwS293S0000000_10.get$arr$(93));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C645780PUq(Long l) {
        this.LL = l;
    }
}
