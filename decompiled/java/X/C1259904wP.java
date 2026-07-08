package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04wP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1259904wP {
    public final Function0<Unit> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1259904wP) && Intrinsics.LJFF(this.LIZ, ((C1259904wP) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftUiAction(onSaveDraft=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1259904wP(AwS552S0100000_8 awS552S0100000_8) {
        this.LIZ = awS552S0100000_8;
    }
}
