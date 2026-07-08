package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Eqs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C377360Eqs {
    public final List<C377380Equ> LIZ;
    public final C377390Eqv LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C377360Eqs)) {
            return false;
        }
        C377360Eqs c377360Eqs = (C377360Eqs) obj;
        return Intrinsics.LJFF(this.LIZ, c377360Eqs.LIZ) && Intrinsics.LJFF(this.LIZIZ, c377360Eqs.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AsyncTaskStatusChangeEvent(asyncTaskList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", delete=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C377360Eqs() {
        this(C13BV.INSTANCE, new C377390Eqv(false, false, false, false, 15));
    }

    public C377360Eqs(List<C377380Equ> list, C377390Eqv c377390Eqv) {
        this.LIZ = list;
        this.LIZIZ = c377390Eqv;
    }
}
