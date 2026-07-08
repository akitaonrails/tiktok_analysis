package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.147S, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C147S implements InterfaceC0148002o {
    public final Integer LL;
    public final C147W LLILLJJLI;

    public C147S() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C147S)) {
            return false;
        }
        C147S c147s = (C147S) obj;
        return Intrinsics.LJFF(this.LL, c147s.LL) && Intrinsics.LJFF(this.LLILLJJLI, c147s.LLILLJJLI);
    }

    public final int hashCode() {
        Integer num = this.LL;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        C147W c147w = this.LLILLJJLI;
        return iHashCode + (c147w != null ? c147w.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NimbleCardUIState(screenOrientation=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", containerLayoutInfo=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C147S(Integer num, C147W c147w) {
        this.LL = num;
        this.LLILLJJLI = c147w;
    }
}
