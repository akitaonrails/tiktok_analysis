package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DA7, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DA7 extends AbstractC334740DAi {
    public final C334580D9s LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0DA7) && Intrinsics.LJFF(this.LIZ, ((C0DA7) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuantityChanged(mutation=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DA7(C334580D9s c334580D9s) {
        this.LIZ = c334580D9s;
    }
}
