package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06Qg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1605206Qg implements InterfaceC910110Zn7 {
    public final Long LIZ;

    public C1605206Qg() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1605206Qg) && Intrinsics.LJFF(this.LIZ, ((C1605206Qg) obj).LIZ);
    }

    public final int hashCode() {
        Long l = this.LIZ;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Alpha(duration=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1605206Qg(int i) {
        this.LIZ = null;
    }
}
