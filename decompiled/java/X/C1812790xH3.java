package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xH3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1812790xH3 extends AbstractC1812820xH6 {
    public final C1812850xH9 LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1812790xH3)) {
            return false;
        }
        C1812790xH3 c1812790xH3 = (C1812790xH3) obj;
        return Intrinsics.LJFF(this.LIZ, c1812790xH3.LIZ) && this.LIZIZ == c1812790xH3.LIZIZ;
    }

    public final int hashCode() {
        C1812850xH9 c1812850xH9 = this.LIZ;
        return ((c1812850xH9 == null ? 0 : c1812850xH9.hashCode()) * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowBigImagePanel(item=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", entrance=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1812790xH3(C1812850xH9 c1812850xH9, int i) {
        this.LIZ = c1812850xH9;
        this.LIZIZ = i;
    }
}
