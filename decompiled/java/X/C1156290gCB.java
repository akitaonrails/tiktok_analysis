package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gCB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156290gCB implements InterfaceC0148002o {
    public final String LL;
    public final Throwable LLILLJJLI;

    public C1156290gCB() {
        this((String) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1156290gCB)) {
            return false;
        }
        C1156290gCB c1156290gCB = (C1156290gCB) obj;
        return Intrinsics.LJFF(this.LL, c1156290gCB.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1156290gCB.LLILLJJLI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        Throwable th = this.LLILLJJLI;
        return iHashCode + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RequestState(status=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", e=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1156290gCB(String str, int i) {
        this((i & 1) != 0 ? "" : str, (Throwable) null);
    }

    public C1156290gCB(String str, Throwable th) {
        this.LL = str;
        this.LLILLJJLI = th;
    }
}
