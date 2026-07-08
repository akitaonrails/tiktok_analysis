package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Zi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1883607Zi {
    public final boolean LIZ = true;
    public final EnumC1122690fJz LIZIZ;
    public final float LIZJ;
    public final Map<String, String> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1883607Zi)) {
            return false;
        }
        C1883607Zi c1883607Zi = (C1883607Zi) obj;
        return this.LIZ == c1883607Zi.LIZ && this.LIZIZ == c1883607Zi.LIZIZ && Float.compare(this.LIZJ, c1883607Zi.LIZJ) == 0 && Intrinsics.LJFF(this.LIZLLL, c1883607Zi.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TriggerSignal(triggered=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", modelScore=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", strategyResult=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + this.LIZLLL.hashCode();
    }

    public C1883607Zi(EnumC1122690fJz enumC1122690fJz, float f, Map map) {
        this.LIZIZ = enumC1122690fJz;
        this.LIZJ = f;
        this.LIZLLL = map;
    }
}
