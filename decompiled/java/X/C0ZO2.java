package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZO2, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZO2 extends C0ZO4 {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0ZO2) && Intrinsics.LJFF(this.LIZ, ((C0ZO2) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NotYetOpen(resourcesPath=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZO2(String str) {
        this.LIZ = str;
    }
}
