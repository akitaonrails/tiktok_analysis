package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rc1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C699390Rc1 {
    public final String LIZ;
    public final String LIZIZ;
    public final EnumC356400DyA LIZJ;
    public final int LIZLLL;
    public final long LJ;
    public final EnumC1986107qF LJFF;
    public final EnumC112300bh LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C699390Rc1)) {
            return false;
        }
        C699390Rc1 c699390Rc1 = (C699390Rc1) obj;
        return Intrinsics.LJFF(this.LIZ, c699390Rc1.LIZ) && Intrinsics.LJFF(this.LIZIZ, c699390Rc1.LIZIZ) && this.LIZJ == c699390Rc1.LIZJ && this.LIZLLL == c699390Rc1.LIZLLL && this.LJ == c699390Rc1.LJ && this.LJFF == c699390Rc1.LJFF && this.LJI == c699390Rc1.LJI;
    }

    public final int hashCode() {
        return (((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlotOperation(opId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", slotId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", actionType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", order=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", delayMs=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", addDisplayEffect=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", removeDisplayEffect=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C699390Rc1(String str, String str2, EnumC356400DyA enumC356400DyA, int i, EnumC1986107qF enumC1986107qF, EnumC112300bh enumC112300bh, int i2) {
        enumC1986107qF = (i2 & 32) != 0 ? EnumC1986107qF.NONE : enumC1986107qF;
        enumC112300bh = (i2 & 64) != 0 ? EnumC112300bh.NONE : enumC112300bh;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = enumC356400DyA;
        this.LIZLLL = i;
        this.LJ = 0L;
        this.LJFF = enumC1986107qF;
        this.LJI = enumC112300bh;
    }
}
