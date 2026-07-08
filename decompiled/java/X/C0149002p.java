package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.002p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0149002p implements InterfaceC0148002o {
    public final Boolean LL;

    public C0149002p() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0149002p) && Intrinsics.LJFF(this.LL, ((C0149002p) obj).LL);
    }

    public final int hashCode() {
        Boolean bool = this.LL;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AlgoRefreshState(isRefreshing=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0149002p(Boolean bool) {
        this.LL = bool;
    }
}
