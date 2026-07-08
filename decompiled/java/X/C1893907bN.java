package X;

import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07bN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1893907bN {
    public final Set<EnumC379630EuX> LIZ;
    public final Function0<InterfaceC381790Ey1> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1893907bN)) {
            return false;
        }
        C1893907bN c1893907bN = (C1893907bN) obj;
        return Intrinsics.LJFF(this.LIZ, c1893907bN.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1893907bN.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BridgeEntry(supportedScenes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", factory=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1893907bN(Set<? extends EnumC379630EuX> set, Function0<? extends InterfaceC381790Ey1> function0) {
        this.LIZ = set;
        this.LIZIZ = function0;
    }
}
