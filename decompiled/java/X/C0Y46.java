package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Y46, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y46 {
    public static final /* synthetic */ int LJ = 0;
    public final List<Long> LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final EnumC868900Y6u LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Y46)) {
            return false;
        }
        C0Y46 c0y46 = (C0Y46) obj;
        return Intrinsics.LJFF(this.LIZ, c0y46.LIZ) && this.LIZIZ == c0y46.LIZIZ && this.LIZJ == c0y46.LIZJ && this.LIZLLL == c0y46.LIZLLL;
    }

    public final int hashCode() {
        List<Long> list = this.LIZ;
        return ((((((list == null ? 0 : list.hashCode()) * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrefetchConversationIdsInfo(convShortIds=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", capacity=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", threshold=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0Y46() {
        this(null, 0, 0, EnumC868900Y6u.READ_ONLY);
    }

    public C0Y46(List<Long> list, int i, int i2, EnumC868900Y6u enumC868900Y6u) {
        this.LIZ = list;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = enumC868900Y6u;
    }
}
