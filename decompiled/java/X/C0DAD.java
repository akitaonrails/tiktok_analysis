package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DAD, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DAD extends AbstractC334710DAf {
    public final C334530D9n LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0DAD) && Intrinsics.LJFF(this.LIZ, ((C0DAD) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Allow(input=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DAD(C334530D9n c334530D9n) {
        this.LIZ = c334530D9n;
    }
}
