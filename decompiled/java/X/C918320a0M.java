package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0a0M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C918320a0M implements InterfaceC918330a0N {
    public final EnumC918870a1F LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final EnumC918850a1D LIZLLL;
    public final Function0<Unit> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C918320a0M)) {
            return false;
        }
        C918320a0M c918320a0M = (C918320a0M) obj;
        return this.LIZ == c918320a0M.LIZ && this.LIZIZ == c918320a0M.LIZIZ && Intrinsics.LJFF(this.LIZJ, c918320a0M.LIZJ) && this.LIZLLL == c918320a0M.LIZLLL && Intrinsics.LJFF(this.LJ, c918320a0M.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        Function0<Unit> function0 = this.LJ;
        return iHashCode + (function0 == null ? 0 : function0.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OutsideRoomInvite(entryType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", rank=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", shareIntent=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", legacyMode=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", onAfterIncreaseGuestSpot=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC918330a0N
    public final String LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC918290a0J
    public final EnumC918870a1F LIZIZ() {
        return this.LIZ;
    }

    public C918320a0M(EnumC918870a1F enumC918870a1F, int i, String str, EnumC918850a1D enumC918850a1D, Function0<Unit> function0) {
        this.LIZ = enumC918870a1F;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = enumC918850a1D;
        this.LJ = function0;
    }
}
