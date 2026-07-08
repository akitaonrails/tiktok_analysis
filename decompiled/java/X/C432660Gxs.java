package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gxs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C432660Gxs implements InterfaceC1175904ir {
    public final C01S9<Unit> LIZ;
    public final C01S9<Unit> LIZIZ;
    public final Function1<View, Unit> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C432660Gxs)) {
            return false;
        }
        C432660Gxs c432660Gxs = (C432660Gxs) obj;
        return Intrinsics.LJFF(this.LIZ, c432660Gxs.LIZ) && Intrinsics.LJFF(this.LIZIZ, c432660Gxs.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c432660Gxs.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecordTrashBinAction(isPlayEvent=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isHideEvent=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onDelete=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C432660Gxs(C01S9 c01s9, C01S9 c01s92, AwS585S0100000_6 awS585S0100000_6) {
        this.LIZ = c01s9;
        this.LIZIZ = c01s92;
        this.LIZJ = awS585S0100000_6;
    }
}
