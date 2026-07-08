package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DBw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C335140DBw extends AbstractC335160DBy {
    public final C0DB8 LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C335140DBw) && Intrinsics.LJFF(this.LIZ, ((C335140DBw) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaymentMethods(state=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C335140DBw(C0DB8 c0db8) {
        this.LIZ = c0db8;
    }
}
