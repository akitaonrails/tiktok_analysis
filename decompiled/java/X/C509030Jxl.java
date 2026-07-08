package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Jxl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C509030Jxl extends AbstractC509020Jxk {
    public final C1158720gG6 LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C509030Jxl) && Intrinsics.LJFF(this.LIZ, ((C509030Jxl) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DataFromServer(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C509030Jxl(C1158720gG6 c1158720gG6) {
        this.LIZ = c1158720gG6;
    }
}
