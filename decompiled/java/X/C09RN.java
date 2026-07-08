package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: renamed from: X.09RN, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09RN implements C09RO {
    public final C09RO LL;

    @Override // X.C09RO
    public final boolean LIZ() {
        return this.LL.LIZ();
    }

    @Override // X.C09RO
    public final C09R0 LJFF() {
        return this.LL.LJFF();
    }

    @Override // X.C09RO
    public final List<KTypeProjection> LJII() {
        return this.LL.LJII();
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KTypeWrapper: ");
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C09RN(C09RO c09ro) {
        this.LL = c09ro;
    }

    public final boolean equals(Object obj) {
        C09RO c09ro;
        C09R0 c09r0LJFF;
        C09RN c09rn;
        if (obj == null) {
            return false;
        }
        C09RO c09ro2 = this.LL;
        C09RO c09ro3 = null;
        if ((obj instanceof C09RN) && (c09rn = (C09RN) obj) != null) {
            c09ro3 = c09rn.LL;
        }
        if (!Intrinsics.LJFF(c09ro2, c09ro3)) {
            return false;
        }
        C09R0 c09r0LJFF2 = LJFF();
        if (!(c09r0LJFF2 instanceof C13IQ) || !(obj instanceof C09RO) || (c09ro = (C09RO) obj) == null || (c09r0LJFF = c09ro.LJFF()) == null || !(c09r0LJFF instanceof C13IQ)) {
            return false;
        }
        return Intrinsics.LJFF(C09R7.LIZ((C13IQ) c09r0LJFF2), C09R7.LIZ((C13IQ) c09r0LJFF));
    }
}
