package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Jxm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C509040Jxm extends AbstractC509020Jxk {
    public final C1158720gG6 LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C509040Jxm) && Intrinsics.LJFF(this.LIZ, ((C509040Jxm) obj).LIZ);
    }

    public final int hashCode() {
        C1158720gG6 c1158720gG6 = this.LIZ;
        if (c1158720gG6 == null) {
            return 0;
        }
        return c1158720gG6.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DataFromCache(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C509040Jxm(C1158720gG6 c1158720gG6) {
        this.LIZ = c1158720gG6;
    }
}
