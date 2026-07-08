package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07ax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1891307ax extends AbstractC1892207b6 {
    public final String LIZ = "";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1891307ax) && Intrinsics.LJFF(this.LIZ, ((C1891307ax) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreateAdSession(contentUrl=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
