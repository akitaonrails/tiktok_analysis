package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0F0B, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F0B {
    public final Function1<Integer, Unit> LIZ;
    public final Function1<Integer, Unit> LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Function0<Unit> LIZLLL;
    public final Function0<Unit> LJ;
    public final Function0<Unit> LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0F0B)) {
            return false;
        }
        C0F0B c0f0b = (C0F0B) obj;
        return Intrinsics.LJFF(this.LIZ, c0f0b.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0f0b.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0f0b.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0f0b.LIZLLL) && Intrinsics.LJFF(this.LJ, c0f0b.LJ) && Intrinsics.LJFF(this.LJFF, c0f0b.LJFF);
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EPAIGCConfigurationActions(updateAspectRatio=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", updateDuration=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", openModelPanel=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", openStylePanel=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", openPromptRewritePanel=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", swapEditTextHint=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0F0B(C0F0A c0f0a, C0F0D c0f0d, C0F0E c0f0e, AwS549S0100000_5 awS549S0100000_5, C0F09 c0f09, C0F0C c0f0c) {
        this.LIZ = c0f09;
        this.LIZIZ = c0f0c;
        this.LIZJ = c0f0a;
        this.LIZLLL = c0f0d;
        this.LJ = c0f0e;
        this.LJFF = awS549S0100000_5;
    }
}
