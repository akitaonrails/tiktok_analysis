package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0V0d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C790730V0d implements InterfaceC1786840wbC {
    public final int LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C790730V0d)) {
            return false;
        }
        C790730V0d c790730V0d = (C790730V0d) obj;
        return this.LIZ == c790730V0d.LIZ && Intrinsics.LJFF(this.LIZIZ, c790730V0d.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c790730V0d.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31;
        Integer num = this.LIZJ;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cancelled(resultCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", resultMessage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", resultSubCode=");
        sbLIZ.append(this.LIZJ);
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

    public C790730V0d(int i, String str, Integer num) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = num;
    }
}
