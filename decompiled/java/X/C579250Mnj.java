package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mnj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C579250Mnj extends AbstractC579260Mnk {
    public final AbstractC577050MkB LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C579250Mnj) && Intrinsics.LJFF(this.LIZ, ((C579250Mnj) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Preparing(layoutType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C579250Mnj(AbstractC577050MkB abstractC577050MkB) {
        this.LIZ = abstractC577050MkB;
    }
}
