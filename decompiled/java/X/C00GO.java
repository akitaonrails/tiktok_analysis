package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00GO, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00GO implements InterfaceC0148002o {
    public Boolean LL;

    public C00GO() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C00GO) && Intrinsics.LJFF(this.LL, ((C00GO) obj).LL);
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
        sbLIZ.append("FriendsNonPersonalizedState(triggerNP=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00GO(Boolean bool) {
        this.LL = bool;
    }
}
