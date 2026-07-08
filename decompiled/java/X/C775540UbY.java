package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UbY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C775540UbY extends AbstractC775500UbU {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C775540UbY) && Intrinsics.LJFF(this.LIZ, ((C775540UbY) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChangeNoiseSuppressionStatus(enterFrom=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C775540UbY(String str) {
        this.LIZ = str;
    }
}
