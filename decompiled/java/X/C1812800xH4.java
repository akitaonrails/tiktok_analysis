package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xH4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1812800xH4 extends AbstractC1812820xH6 {
    public final AbstractC1812590xGj LIZ;

    public C1812800xH4() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1812800xH4) && Intrinsics.LJFF(this.LIZ, ((C1812800xH4) obj).LIZ);
    }

    public final int hashCode() {
        AbstractC1812590xGj abstractC1812590xGj = this.LIZ;
        if (abstractC1812590xGj == null) {
            return 0;
        }
        return abstractC1812590xGj.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowFaqPanel(item=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1812800xH4(AbstractC1812590xGj abstractC1812590xGj) {
        this.LIZ = abstractC1812590xGj;
    }
}
