package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07YG, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07YG {
    public final Function0<Unit> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07YG) && Intrinsics.LJFF(this.LIZ, ((C07YG) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CaptionFormatHeaderActions(onCloseBtnClicked=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07YG(AwS549S0100000_5 awS549S0100000_5) {
        this.LIZ = awS549S0100000_5;
    }
}
