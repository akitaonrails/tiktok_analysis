package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0V0I, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V0I extends C0V0J {
    public final String LIZ;

    public C0V0I() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0V0I) && Intrinsics.LJFF(this.LIZ, ((C0V0I) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BackButton(action=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0V0I(int i) {
        this.LIZ = "Back Button";
    }
}
