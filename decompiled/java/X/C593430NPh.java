package X;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NPh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C593430NPh implements InterfaceC0148002o {
    public final C291001Au<Pair<EnumC1163900gOS, Integer>> LL;

    public C593430NPh() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C593430NPh) && Intrinsics.LJFF(this.LL, ((C593430NPh) obj).LL);
    }

    public final int hashCode() {
        C291001Au<Pair<EnumC1163900gOS, Integer>> c291001Au = this.LL;
        if (c291001Au == null) {
            return 0;
        }
        return c291001Au.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaylistManagementState(operationResult=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C593430NPh(C291001Au<? extends Pair<? extends EnumC1163900gOS, Integer>> c291001Au) {
        this.LL = c291001Au;
    }
}
