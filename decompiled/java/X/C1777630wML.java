package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wML, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777630wML extends AbstractC1777660wMO {
    public final String LIZ = "pageDataUpdate";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1777630wML) && Intrinsics.LJFF(this.LIZ, ((C1777630wML) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StateUpdated(source=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
