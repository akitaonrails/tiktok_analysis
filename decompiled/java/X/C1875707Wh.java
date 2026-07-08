package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Wh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1875707Wh implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;
    public final Function1<String, Unit> LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1875707Wh)) {
            return false;
        }
        C1875707Wh c1875707Wh = (C1875707Wh) obj;
        return Intrinsics.LJFF(this.LL, c1875707Wh.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1875707Wh.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1875707Wh.LLILLL);
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
        sbLIZ.append("CollectionRecommendNameData(name=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", clickInvoke=");
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
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1875707Wh(String str, String str2, Function1<? super String, Unit> function1) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = function1;
    }
}
