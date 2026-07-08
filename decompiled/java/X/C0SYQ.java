package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SYQ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SYQ implements InterfaceC0148002o {
    public final String LL;
    public final boolean LLILLJJLI;

    public C0SYQ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0SYQ)) {
            return false;
        }
        C0SYQ c0syq = (C0SYQ) obj;
        return Intrinsics.LJFF(this.LL, c0syq.LL) && this.LLILLJJLI == c0syq.LLILLJJLI;
    }

    public final int hashCode() {
        String str = this.LL;
        return ((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PostModeShareState(shareCountText=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isShareCountVisible=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0SYQ(int i) {
        this("", true);
    }

    public C0SYQ(String str, boolean z) {
        this.LL = str;
        this.LLILLJJLI = z;
    }
}
