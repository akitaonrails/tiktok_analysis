package X;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Zf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1883307Zf extends AbstractC1883407Zg {
    public final String LIZ;
    public final Set<EnumC1355300lNA> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1883307Zf)) {
            return false;
        }
        C1883307Zf c1883307Zf = (C1883307Zf) obj;
        return Intrinsics.LJFF(this.LIZ, c1883307Zf.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1883307Zf.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Denied(reason=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", conflictOwners=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1883307Zf(String str, Set<? extends EnumC1355300lNA> set) {
        this.LIZ = str;
        this.LIZIZ = set;
    }
}
