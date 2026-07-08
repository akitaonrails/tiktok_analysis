package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OLM, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OLM implements InterfaceC0148002o {
    public final C291001Au<Boolean> LL;
    public final C291001Au<String> LLILLJJLI;

    public C0OLM() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OLM)) {
            return false;
        }
        C0OLM c0olm = (C0OLM) obj;
        return Intrinsics.LJFF(this.LL, c0olm.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0olm.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageRequestLoadingState(showLoading=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", toast=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0OLM(int i) {
        this(new C291001Au(Boolean.FALSE), new C291001Au(""));
    }

    public C0OLM(C291001Au<Boolean> c291001Au, C291001Au<String> c291001Au2) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
    }
}
