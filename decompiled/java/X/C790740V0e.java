package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0V0e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C790740V0e implements InterfaceC1786840wbC {
    public final int LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C790740V0e)) {
            return false;
        }
        C790740V0e c790740V0e = (C790740V0e) obj;
        return this.LIZ == c790740V0e.LIZ && Intrinsics.LJFF(this.LIZIZ, c790740V0e.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c790740V0e.LIZJ) && this.LIZLLL == c790740V0e.LIZLLL;
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31;
        Integer num = this.LIZJ;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(resultCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", resultMessage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", resultSubCode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", canRetry=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1786840wbC
    public final String LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1786840wbC
    public final Integer LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1786840wbC
    public final int getResultCode() {
        return this.LIZ;
    }

    public C790740V0e(Integer num, String str, int i, boolean z) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = num;
        this.LIZLLL = z;
    }
}
