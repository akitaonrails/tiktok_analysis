package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00F7, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00F7 {
    public final Long LIZ;

    public C00F7() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C00F7) && Intrinsics.LJFF(this.LIZ, ((C00F7) obj).LIZ);
    }

    public final int hashCode() {
        Long l = this.LIZ;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WalletBalanceDataEvent(latestDiamond=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00F7(Long l) {
        this.LIZ = l;
    }
}
