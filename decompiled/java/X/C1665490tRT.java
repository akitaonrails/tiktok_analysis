package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tRT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1665490tRT implements InterfaceC1665520tRW {
    public final boolean LIZ;
    public final EnumC1308705Af LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Function0<Unit> LIZLLL;
    public final Function2<Float, C1378605aS, Unit> LJ;
    public final Function2<C1378605aS, C1683130ttv, Unit> LJFF;
    public final long LJI;

    public C1665490tRT() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1665490tRT)) {
            return false;
        }
        C1665490tRT c1665490tRT = (C1665490tRT) obj;
        return this.LIZ == c1665490tRT.LIZ && this.LIZIZ == c1665490tRT.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1665490tRT.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1665490tRT.LIZLLL) && Intrinsics.LJFF(this.LJ, c1665490tRT.LJ) && Intrinsics.LJFF(this.LJFF, c1665490tRT.LJFF) && this.LJI == c1665490tRT.LJI;
    }

    public final int hashCode() {
        return (((((((((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + C786410Ut5.Y2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryShootButtonState(isVisible=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", recordState=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", recordOnDown=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", recordOnUp=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", recordOnZoom=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", recordOnDrag=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", maxTimeMs=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1665520tRW
    public final boolean isVisible() {
        return this.LIZ;
    }

    public C1665490tRT(int i) {
        this(true, EnumC1308705Af.NOT_RECORDING, AFwS214S0000000_25.get$arr$(207), AFwS214S0000000_25.get$arr$(208), AFwS292S0000000_9.get$arr$(34), AFwS311S0000000_25.get$arr$(24), C1665860tS4.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1665490tRT(boolean z, EnumC1308705Af enumC1308705Af, Function0<Unit> function0, Function0<Unit> function02, Function2<? super Float, ? super C1378605aS, Unit> function2, Function2<? super C1378605aS, ? super C1683130ttv, Unit> function22, long j) {
        this.LIZ = z;
        this.LIZIZ = enumC1308705Af;
        this.LIZJ = function0;
        this.LIZLLL = function02;
        this.LJ = function2;
        this.LJFF = function22;
        this.LJI = j;
    }
}
