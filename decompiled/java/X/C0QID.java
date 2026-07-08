package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QID, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QID implements InterfaceC663910Q2j {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0QID) && Intrinsics.LJFF(this.LIZ, ((C0QID) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecordClearAction(query=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0QID(String str) {
        this.LIZ = str;
    }
}
