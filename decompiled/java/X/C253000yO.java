package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00yO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C253000yO extends AbstractC253300yR {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C253000yO) && Intrinsics.LJFF(this.LIZ, ((C253000yO) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fail(reason=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C253000yO(String str) {
        this.LIZ = str;
    }
}
