package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZQi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C899460ZQi implements InterfaceC0148002o {
    public final C419910GdJ LL;
    public final String LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C899460ZQi)) {
            return false;
        }
        C899460ZQi c899460ZQi = (C899460ZQi) obj;
        return Intrinsics.LJFF(this.LL, c899460ZQi.LL) && Intrinsics.LJFF(this.LLILLJJLI, c899460ZQi.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TitleBarLeftState(icon=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", contentDescription=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C899460ZQi(C419910GdJ c419910GdJ, String str) {
        this.LL = c419910GdJ;
        this.LLILLJJLI = str;
    }
}
