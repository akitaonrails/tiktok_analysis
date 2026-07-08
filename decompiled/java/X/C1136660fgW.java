package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fgW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136660fgW extends AbstractC1136890fgt {
    public final C1135810ff9 LIZ;
    public final Function0<Unit> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1136660fgW)) {
            return false;
        }
        C1136660fgW c1136660fgW = (C1136660fgW) obj;
        return Intrinsics.LJFF(this.LIZ, c1136660fgW.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1136660fgW.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiHostExit(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onCompleteHideAnim=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1136660fgW(C1135810ff9 c1135810ff9, AwS418S0200000_17 awS418S0200000_17) {
        this.LIZ = c1135810ff9;
        this.LIZIZ = awS418S0200000_17;
    }
}
