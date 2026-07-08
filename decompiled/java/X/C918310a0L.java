package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0a0L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C918310a0L implements InterfaceC918330a0N {
    public final EnumC918870a1F LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final Function1<Long, Unit> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C918310a0L)) {
            return false;
        }
        C918310a0L c918310a0L = (C918310a0L) obj;
        return this.LIZ == c918310a0L.LIZ && this.LIZIZ == c918310a0L.LIZIZ && this.LIZJ == c918310a0L.LIZJ && Intrinsics.LJFF(this.LIZLLL, c918310a0L.LIZLLL) && Intrinsics.LJFF(this.LJ, c918310a0L.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OutsideFriend(entryType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", rank=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", shareToGoLive=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", outsideRoomInviteSource=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", onUserFreqCtrlUnFrozen=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC918330a0N
    public final String LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC918290a0J
    public final EnumC918870a1F LIZIZ() {
        return this.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C918310a0L(EnumC918870a1F enumC918870a1F, int i, boolean z, String str, Function1<? super Long, Unit> function1) {
        this.LIZ = enumC918870a1F;
        this.LIZIZ = i;
        this.LIZJ = z;
        this.LIZLLL = str;
        this.LJ = function1;
    }
}
