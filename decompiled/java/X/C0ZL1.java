package X;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZL1, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZL1 {
    public static final C0ZL1 LIZJ = new C0ZL1(null, new C0ZL7(true));
    public final Set<C0ZL0> LIZ;
    public final C0ZLF LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZL1)) {
            return false;
        }
        C0ZL1 c0zl1 = (C0ZL1) obj;
        return Intrinsics.LJFF(this.LIZ, c0zl1.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0zl1.LIZIZ);
    }

    public final int hashCode() {
        Set<C0ZL0> set = this.LIZ;
        return ((set == null ? 0 : set.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LongPressCapability(allowedActionKeys=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", reaction=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0ZL1(Set<? extends C0ZL0> set, C0ZLF c0zlf) {
        this.LIZ = set;
        this.LIZIZ = c0zlf;
    }
}
