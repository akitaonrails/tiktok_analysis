package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PD6, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PD6 implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0PD6)) {
            return false;
        }
        C0PD6 c0pd6 = (C0PD6) obj;
        return Intrinsics.LJFF(this.LL, c0pd6.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0pd6.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxSearchResultFragmentInfo(tabName=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", eventTabName=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0PD6(String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
    }
}
