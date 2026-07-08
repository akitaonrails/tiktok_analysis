package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TPD, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TPD extends AbstractC746450TPv {
    public final String LIZ;

    @Override // X.AbstractC746450TPv
    public final int LIZ() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0TPD) && Intrinsics.LJFF(this.LIZ, ((C0TPD) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HeaderItem(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0TPD(String str) {
        this.LIZ = str;
    }
}
