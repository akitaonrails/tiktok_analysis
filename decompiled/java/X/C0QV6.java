package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QV6, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QV6 implements InterfaceC0148002o {
    public final C0QOD LL;
    public final int LLILLJJLI;

    public C0QV6() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0QV6)) {
            return false;
        }
        C0QV6 c0qv6 = (C0QV6) obj;
        return Intrinsics.LJFF(this.LL, c0qv6.LL) && this.LLILLJJLI == c0qv6.LLILLJJLI;
    }

    public final int hashCode() {
        C0QOD c0qod = this.LL;
        return ((c0qod == null ? 0 : c0qod.hashCode()) * 31) + this.LLILLJJLI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VerticalSearchSkinFactorState(skin=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", headerHeight=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0QV6(int i) {
        this(null, 0);
    }

    public C0QV6(C0QOD c0qod, int i) {
        this.LL = c0qod;
        this.LLILLJJLI = i;
    }
}
