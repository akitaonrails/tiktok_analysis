package X;

import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PBC, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PBC implements C0PWT {
    public final String LL;

    public C0PBC() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0PBC) && Intrinsics.LJFF(this.LL, ((C0PBC) obj).LL);
    }

    public final int hashCode() {
        String str = this.LL;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchActivatedIdUpdateEntityIdAction(newEntityId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().cp2().LIZIZ(C13LE.LIZ(C0PBC.class), AFwS293S0000000_10.get$arr$(152));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C0PBC(String str) {
        this.LL = str;
    }
}
