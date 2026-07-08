package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00dj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C124900dj implements InterfaceC1891350zJl {
    public final List<String> LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C124900dj)) {
            return false;
        }
        C124900dj c124900dj = (C124900dj) obj;
        return Intrinsics.LJFF(this.LL, c124900dj.LL) && Intrinsics.LJFF(this.LLILLJJLI, c124900dj.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c124900dj.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TabListRenderData(tabList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", selectTab=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", itemId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C124900dj c124900dj;
        String str = this.LLILLL;
        String str2 = null;
        if ((interfaceC1891350zJl instanceof C124900dj) && (c124900dj = (C124900dj) interfaceC1891350zJl) != null) {
            str2 = c124900dj.LLILLL;
        }
        return Intrinsics.LJFF(str, str2);
    }

    public C124900dj(List<String> list, String str, String str2) {
        this.LL = list;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }
}
