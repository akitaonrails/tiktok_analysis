package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SYL, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SYL implements InterfaceC0148002o {
    public final String LL;
    public final boolean LLILLJJLI;

    public C0SYL() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0SYL)) {
            return false;
        }
        C0SYL c0syl = (C0SYL) obj;
        return Intrinsics.LJFF(this.LL, c0syl.LL) && this.LLILLJJLI == c0syl.LLILLJJLI;
    }

    public final int hashCode() {
        String str = this.LL;
        return ((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TitlePanelBottomBarDiggState(displayCount=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", selected=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0SYL(int i) {
        this(null, false);
    }

    public C0SYL(String str, boolean z) {
        this.LL = str;
        this.LLILLJJLI = z;
    }
}
