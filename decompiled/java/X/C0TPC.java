package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TPC, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TPC extends AbstractC746450TPv {
    public final String LIZ;
    public final int LIZIZ = 5;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0TPC) && Intrinsics.LJFF(this.LIZ, ((C0TPC) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FooterItem(description=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC746450TPv
    public final int LIZ() {
        return this.LIZIZ;
    }

    public C0TPC(String str) {
        this.LIZ = str;
    }
}
