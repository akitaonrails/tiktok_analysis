package X;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gFU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158340gFU {
    public final Set<EnumC1800110wwb> LIZ;
    public final InterfaceC1201510hN7 LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1158340gFU)) {
            return false;
        }
        C1158340gFU c1158340gFU = (C1158340gFU) obj;
        return Intrinsics.LJFF(this.LIZ, c1158340gFU.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1158340gFU.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InAppPreciseConsentConfig(enabledTriggers=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", promoteHandler=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1158340gFU(Set set, C1201500hN6 c1201500hN6) {
        this.LIZ = set;
        this.LIZIZ = c1201500hN6;
    }
}
