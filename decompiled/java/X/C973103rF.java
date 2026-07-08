package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03rF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C973103rF implements InterfaceC984903t9 {
    public String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C973103rF) && Intrinsics.LJFF(this.LIZ, ((C973103rF) obj).LIZ);
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
        sbLIZ.append("USLogisticSelectByZipcodeVO(inputValue=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC984903t9
    public final String LIZIZ() {
        return this.LIZ;
    }

    public C973103rF(String str) {
        this.LIZ = str;
    }

    @Override // X.InterfaceC984903t9
    public final void LIZ(String str) {
        this.LIZ = str;
    }
}
