package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07c3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1898107c3 {
    public final String LIZ;
    public final EnumC1781360wSM LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1898107c3)) {
            return false;
        }
        C1898107c3 c1898107c3 = (C1898107c3) obj;
        return Intrinsics.LJFF(this.LIZ, c1898107c3.LIZ) && this.LIZIZ == c1898107c3.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RequestKey(clientKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", rewardScene=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1898107c3(String str, EnumC1781360wSM enumC1781360wSM) {
        this.LIZ = str;
        this.LIZIZ = enumC1781360wSM;
    }
}
