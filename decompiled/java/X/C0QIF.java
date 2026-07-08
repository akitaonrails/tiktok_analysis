package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QIF, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QIF implements InterfaceC663910Q2j {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0QIF) && Intrinsics.LJFF(this.LIZ, ((C0QIF) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateLastSugAction(lastSug=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0QIF(String str) {
        this.LIZ = str;
    }
}
