package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03rG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C973203rG implements InterfaceC984903t9 {
    public String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C973203rG) && Intrinsics.LJFF(this.LIZ, ((C973203rG) obj).LIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EULogisticSelectByZipcodeVO(inputValue=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC984903t9
    public final String LIZIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC984903t9
    public final void LIZ(String str) {
        this.LIZ = str;
    }
}
