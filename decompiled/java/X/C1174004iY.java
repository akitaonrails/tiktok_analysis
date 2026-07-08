package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04iY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1174004iY {
    public final String LIZ;
    public final Object LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1174004iY)) {
            return false;
        }
        C1174004iY c1174004iY = (C1174004iY) obj;
        return Intrinsics.LJFF(this.LIZ, c1174004iY.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1174004iY.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TriggerHandle(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", inner=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1174004iY(String str, Object obj) {
        this.LIZ = str;
        this.LIZIZ = obj;
    }
}
