package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07US, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07US {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07US) && Intrinsics.LJFF(this.LIZ, ((C07US) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BalanceUpdatePayload(newBalance=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07US(String str) {
        this.LIZ = str;
    }
}
