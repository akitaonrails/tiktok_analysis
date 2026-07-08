package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ojf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C627690Ojf implements InterfaceC2753014t {
    public EnumC1783090wV9 LL;
    public final String LLILLJJLI;

    public C627690Ojf() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C627690Ojf)) {
            return false;
        }
        C627690Ojf c627690Ojf = (C627690Ojf) obj;
        return this.LL == c627690Ojf.LL && Intrinsics.LJFF(this.LLILLJJLI, c627690Ojf.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FlexiblePanelState(state=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", sourceId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C627690Ojf(int i) {
        this.LL = EnumC1783090wV9.PANEL;
        this.LLILLJJLI = "flexible_state";
    }
}
