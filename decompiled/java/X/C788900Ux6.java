package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ux6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C788900Ux6 implements InterfaceC788910Ux7 {
    public final long LIZ;
    public final boolean LIZIZ;
    public final Function1<Long, Unit> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C788900Ux6)) {
            return false;
        }
        C788900Ux6 c788900Ux6 = (C788900Ux6) obj;
        return this.LIZ == c788900Ux6.LIZ && this.LIZIZ == c788900Ux6.LIZIZ && Intrinsics.LJFF(this.LIZJ, c788900Ux6.LIZJ);
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Search(targetIndex=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", needBounce=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", setMsgBounceEvent=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C788900Ux6(long j, AwS593S0100000_14 awS593S0100000_14, boolean z) {
        this.LIZ = j;
        this.LIZIZ = z;
        this.LIZJ = awS593S0100000_14;
    }
}
