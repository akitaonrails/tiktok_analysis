package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iPw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1241700iPw implements InterfaceC0148002o {
    public final List<InterfaceC1891350zJl> LL;
    public final EnumC1241490iPb LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1241700iPw)) {
            return false;
        }
        C1241700iPw c1241700iPw = (C1241700iPw) obj;
        return Intrinsics.LJFF(this.LL, c1241700iPw.LL) && this.LLILLJJLI == c1241700iPw.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxSearchResultAllTabState(itemList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", state=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1241700iPw(List<? extends InterfaceC1891350zJl> list, EnumC1241490iPb enumC1241490iPb) {
        this.LL = list;
        this.LLILLJJLI = enumC1241490iPb;
    }
}
