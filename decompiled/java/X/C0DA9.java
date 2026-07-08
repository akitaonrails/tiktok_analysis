package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DA9, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DA9 extends AbstractC334690DAd {
    public final C0D9S LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0DA9) && Intrinsics.LJFF(this.LIZ, ((C0DA9) obj).LIZ);
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

    public C0DA9(C0D9S c0d9s) {
        this.LIZ = c0d9s;
    }
}
