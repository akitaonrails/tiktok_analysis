package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mCI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1387000mCI extends AbstractC1387030mCL {
    public final String LIZ;

    public C1387000mCI() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1387000mCI) && Intrinsics.LJFF(this.LIZ, ((C1387000mCI) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NoNetwork(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1387000mCI(int i) {
        this.LIZ = "no network";
    }
}
