package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yi3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1867970yi3 {
    public final Function0<Float> LIZ;
    public final Function0<int[]> LIZIZ;
    public final Function0<Boolean> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1867970yi3)) {
            return false;
        }
        C1867970yi3 c1867970yi3 = (C1867970yi3) obj;
        return Intrinsics.LJFF(this.LIZ, c1867970yi3.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1867970yi3.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1867970yi3.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DowngradeOptimization(downgradeBitrate=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", downgradeSize=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enableOptEffectRender=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1867970yi3() {
        this(AFwS217S0000000_28.get$arr$(557), AFwS217S0000000_28.get$arr$(558), AFwS217S0000000_28.get$arr$(559));
    }

    public C1867970yi3(Function0<Float> function0, Function0<int[]> function02, Function0<Boolean> function03) {
        this.LIZ = function0;
        this.LIZIZ = function02;
        this.LIZJ = function03;
    }
}
