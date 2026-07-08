package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07am, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1890207am extends AbstractC1890407ao {
    public final float LIZ;
    public final Integer LIZIZ = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1890207am)) {
            return false;
        }
        C1890207am c1890207am = (C1890207am) obj;
        return Float.compare(this.LIZ, c1890207am.LIZ) == 0 && Intrinsics.LJFF(this.LIZIZ, c1890207am.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StarBar(value=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", activeColor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.LIZ) * 31;
        Integer num = this.LIZIZ;
        return iFloatToIntBits + (num == null ? 0 : num.hashCode());
    }

    public C1890207am(float f) {
        this.LIZ = f;
    }
}
