package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AKe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2177581AKe {
    public final String LIZ;
    public final EnumC2177591AKf LIZIZ;
    public final EnumC2177591AKf LIZJ;
    public final EnumC1153480g7e LIZLLL;
    public final InterfaceC2177561AKc LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2177581AKe)) {
            return false;
        }
        C2177581AKe c2177581AKe = (C2177581AKe) obj;
        return Intrinsics.LJFF(this.LIZ, c2177581AKe.LIZ) && this.LIZIZ == c2177581AKe.LIZIZ && this.LIZJ == c2177581AKe.LIZJ && this.LIZLLL == c2177581AKe.LIZLLL && Intrinsics.LJFF(this.LJ, c2177581AKe.LJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        EnumC2177591AKf enumC2177591AKf = this.LIZIZ;
        int iHashCode2 = (iHashCode + (enumC2177591AKf == null ? 0 : enumC2177591AKf.hashCode())) * 31;
        EnumC2177591AKf enumC2177591AKf2 = this.LIZJ;
        return ((((iHashCode2 + (enumC2177591AKf2 != null ? enumC2177591AKf2.hashCode() : 0)) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BusinessEntry(bizName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", javaHeapLevel=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", deviceRamLevel=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", scope=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", callback=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2177581AKe(String str, EnumC2177591AKf enumC2177591AKf, EnumC2177591AKf enumC2177591AKf2, EnumC1153480g7e enumC1153480g7e, InterfaceC2177561AKc interfaceC2177561AKc) {
        this.LIZ = str;
        this.LIZIZ = enumC2177591AKf;
        this.LIZJ = enumC2177591AKf2;
        this.LIZLLL = enumC1153480g7e;
        this.LJ = interfaceC2177561AKc;
    }
}
