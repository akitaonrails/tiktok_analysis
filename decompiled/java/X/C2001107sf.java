package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07sf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2001107sf implements InterfaceC0148002o {
    public final Boolean LL;

    public C2001107sf() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2001107sf) && Intrinsics.LJFF(this.LL, ((C2001107sf) obj).LL);
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
        sbLIZ.append("CpfState(isLoading=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2001107sf(Boolean bool) {
        this.LL = bool;
    }
}
