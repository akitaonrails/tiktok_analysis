package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ESy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C365060ESy {
    public final Function0<Unit> LIZ;
    public final Function1<Integer, Unit> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C365060ESy)) {
            return false;
        }
        C365060ESy c365060ESy = (C365060ESy) obj;
        return Intrinsics.LJFF(this.LIZ, c365060ESy.LIZ) && Intrinsics.LJFF(this.LIZIZ, c365060ESy.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AudioFadeHeaderActions(onCloseBtnClicked=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", changeConsoleBarBtnState=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C365060ESy(AwS549S0100000_5 awS549S0100000_5, C365070ESz c365070ESz) {
        this.LIZ = awS549S0100000_5;
        this.LIZIZ = c365070ESz;
    }
}
