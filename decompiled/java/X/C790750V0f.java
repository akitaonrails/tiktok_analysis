package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0V0f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C790750V0f implements InterfaceC1786840wbC {
    public final int LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;
    public final C1788060wdA LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C790750V0f)) {
            return false;
        }
        C790750V0f c790750V0f = (C790750V0f) obj;
        return this.LIZ == c790750V0f.LIZ && Intrinsics.LJFF(this.LIZIZ, c790750V0f.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c790750V0f.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c790750V0f.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31;
        Integer num = this.LIZJ;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Updated(resultCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", resultMessage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", resultSubCode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", purchase=");
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

    public C790750V0f(int i, String str, Integer num, C1788060wdA c1788060wdA) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = num;
        this.LIZLLL = c1788060wdA;
    }
}
