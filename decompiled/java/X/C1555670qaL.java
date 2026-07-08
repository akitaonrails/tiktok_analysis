package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qaL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1555670qaL {
    public final Class<?> LIZ;
    public final Function0<AbstractC1720840usk<?>> LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1555670qaL)) {
            return false;
        }
        C1555670qaL c1555670qaL = (C1555670qaL) obj;
        return Intrinsics.LJFF(this.LIZ, c1555670qaL.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1555670qaL.LIZIZ) && this.LIZJ == c1555670qaL.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1555670qaL.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        String str = this.LIZLLL;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CardDefinition(clazz=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", factory=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", useTheme=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", trackEventName=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1555670qaL(Class<?> cls, Function0<? extends AbstractC1720840usk<?>> function0, boolean z, String str) {
        this.LIZ = cls;
        this.LIZIZ = function0;
        this.LIZJ = z;
        this.LIZLLL = str;
    }

    public /* synthetic */ C1555670qaL(Class cls, Function0 function0, String str, int i) {
        this((Class<?>) cls, (Function0<? extends AbstractC1720840usk<?>>) function0, false, (i & 8) != 0 ? null : str);
    }
}
