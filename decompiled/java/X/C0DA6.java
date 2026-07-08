package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DA6, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DA6 extends AbstractC334720DAg {
    public final String LIZ;

    public C0DA6() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0DA6) && Intrinsics.LJFF(this.LIZ, ((C0DA6) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Disabled(text=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DA6(int i) {
        this.LIZ = C0D9L.LIZ(2131857526);
    }
}
