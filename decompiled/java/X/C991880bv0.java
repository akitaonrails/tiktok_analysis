package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bv0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C991880bv0 extends AbstractC991850bux {
    public final String LIZ;
    public final EnumC1007990cKz LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C991880bv0)) {
            return false;
        }
        C991880bv0 c991880bv0 = (C991880bv0) obj;
        return Intrinsics.LJFF(this.LIZ, c991880bv0.LIZ) && this.LIZIZ == c991880bv0.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowPreconditionsNotMet(componentType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C991880bv0(String str, EnumC1007990cKz enumC1007990cKz) {
        this.LIZ = str;
        this.LIZIZ = enumC1007990cKz;
    }
}
