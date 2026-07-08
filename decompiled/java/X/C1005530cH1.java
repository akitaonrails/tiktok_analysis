package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cH1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1005530cH1 implements InterfaceC1806790x7N {
    public final String LIZ;

    @Override // X.InterfaceC1806790x7N
    public final int LIZ() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1005530cH1) && Intrinsics.LJFF(this.LIZ, ((C1005530cH1) obj).LIZ);
    }

    @Override // X.InterfaceC1806790x7N
    public final int getStyle() {
        return 11;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FirstRechargeDescData(description=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1005530cH1(String str) {
        this.LIZ = str;
    }
}
