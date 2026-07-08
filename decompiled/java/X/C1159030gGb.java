package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gGb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1159030gGb implements InterfaceC0148002o {
    public final C291001Au<Unit> LL;
    public final C291001Au<Unit> LLILLJJLI;

    public C1159030gGb() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1159030gGb)) {
            return false;
        }
        C1159030gGb c1159030gGb = (C1159030gGb) obj;
        return Intrinsics.LJFF(this.LL, c1159030gGb.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1159030gGb.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommerceAgentSheetState(expandEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", dismissEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1159030gGb(int i) {
        this(new C291001Au(null), new C291001Au(null));
    }

    public C1159030gGb(C291001Au<Unit> c291001Au, C291001Au<Unit> c291001Au2) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
    }
}
