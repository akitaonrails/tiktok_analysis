package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RFo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C692820RFo implements InterfaceC0148002o {
    public final Boolean LL;
    public final int LLILLJJLI;

    public C692820RFo() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C692820RFo)) {
            return false;
        }
        C692820RFo c692820RFo = (C692820RFo) obj;
        return Intrinsics.LJFF(this.LL, c692820RFo.LL) && this.LLILLJJLI == c692820RFo.LLILLJJLI;
    }

    public final int hashCode() {
        Boolean bool = this.LL;
        return ((bool == null ? 0 : bool.hashCode()) * 31) + this.LLILLJJLI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PanelState(isPanelOn=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", targets=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C692820RFo(int i) {
        this(null, 0);
    }

    public C692820RFo(Boolean bool, int i) {
        this.LL = bool;
        this.LLILLJJLI = i;
    }
}
