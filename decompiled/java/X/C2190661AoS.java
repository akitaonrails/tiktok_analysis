package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AoS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2190661AoS implements C1DWC {
    public final Function0<Unit> LIZIZ;
    public final Function0<Unit> LIZLLL;
    public final int LIZ = 2131835402;
    public final int LIZJ = 2131832012;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2190661AoS)) {
            return false;
        }
        C2190661AoS c2190661AoS = (C2190661AoS) obj;
        return this.LIZ == c2190661AoS.LIZ && Intrinsics.LJFF(this.LIZIZ, c2190661AoS.LIZIZ) && this.LIZJ == c2190661AoS.LIZJ && Intrinsics.LJFF(this.LIZLLL, c2190661AoS.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TwoButton(text1Res=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onClick1=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", text2Res=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", onClick2=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2190661AoS(AwS578S0100000_34 awS578S0100000_34, AwS578S0100000_34 awS578S0100000_342) {
        this.LIZIZ = awS578S0100000_34;
        this.LIZLLL = awS578S0100000_342;
    }
}
