package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05f3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1407105f3 extends AbstractC1406905f1 {
    public final int LIZ;
    public final String LIZIZ;
    public final InterfaceC1406105et LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1407105f3)) {
            return false;
        }
        C1407105f3 c1407105f3 = (C1407105f3) obj;
        return this.LIZ == c1407105f3.LIZ && Intrinsics.LJFF(this.LIZIZ, c1407105f3.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1407105f3.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31;
        InterfaceC1406105et interfaceC1406105et = this.LIZJ;
        return iHashCode + (interfaceC1406105et == null ? 0 : interfaceC1406105et.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkippedFailed(errorCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorMessage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", customContext=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1407105f3(int i, String str, InterfaceC1406105et interfaceC1406105et) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = interfaceC1406105et;
    }
}
