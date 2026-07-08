package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bu6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C991320bu6 extends AbstractC1003980cEW {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C991320bu6) && Intrinsics.LJFF(this.LIZ, ((C991320bu6) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserInteract(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C991320bu6(String str) {
        this.LIZ = str;
    }
}
