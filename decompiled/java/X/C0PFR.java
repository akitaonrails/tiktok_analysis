package X;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PFR, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PFR implements InterfaceC2753014t {
    public final C653660PkS LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0PFR) && Intrinsics.LJFF(this.LL, ((C0PFR) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchItemMobParamSource(itemMobParam=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0PFR(C653660PkS c653660PkS) {
        this.LL = c653660PkS;
        UUID.randomUUID().toString();
    }
}
