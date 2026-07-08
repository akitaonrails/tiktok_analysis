package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rc0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C699380Rc0 {
    public final String LIZ;
    public final String LIZIZ;
    public final EnumC699470Rc9 LIZJ;
    public final long LIZLLL;
    public final C698780Rb2 LJ;
    public final EnumC699470Rc9 LJFF;
    public final EnumC699470Rc9 LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C699380Rc0)) {
            return false;
        }
        C699380Rc0 c699380Rc0 = (C699380Rc0) obj;
        return Intrinsics.LJFF(this.LIZ, c699380Rc0.LIZ) && Intrinsics.LJFF(this.LIZIZ, c699380Rc0.LIZIZ) && this.LIZJ == c699380Rc0.LIZJ && this.LIZLLL == c699380Rc0.LIZLLL && Intrinsics.LJFF(this.LJ, c699380Rc0.LJ) && this.LJFF == c699380Rc0.LJFF && this.LJI == c699380Rc0.LJI;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + this.LJ.hashCode()) * 31;
        EnumC699470Rc9 enumC699470Rc9 = this.LJFF;
        int iHashCode2 = (iHashCode + (enumC699470Rc9 == null ? 0 : enumC699470Rc9.hashCode())) * 31;
        EnumC699470Rc9 enumC699470Rc92 = this.LJI;
        return iHashCode2 + (enumC699470Rc92 != null ? enumC699470Rc92.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RuntimeCommand(stateSlotKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", runtimeSlotKey=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", availabilityState=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", revision=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", context=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", observedFromState=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", observedToState=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C699380Rc0(String str, String str2, EnumC699470Rc9 enumC699470Rc9, long j, C698780Rb2 c698780Rb2, EnumC699470Rc9 enumC699470Rc92, EnumC699470Rc9 enumC699470Rc93) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = enumC699470Rc9;
        this.LIZLLL = j;
        this.LJ = c698780Rb2;
        this.LJFF = enumC699470Rc92;
        this.LJI = enumC699470Rc93;
    }
}
