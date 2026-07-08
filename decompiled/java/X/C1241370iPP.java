package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iPP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1241370iPP implements InterfaceC0148002o {
    public final EnumC1241490iPb LL;
    public final List<InterfaceC1891350zJl> LLILLJJLI;
    public final C1241470iPZ LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1241370iPP)) {
            return false;
        }
        C1241370iPP c1241370iPP = (C1241370iPP) obj;
        return this.LL == c1241370iPP.LL && Intrinsics.LJFF(this.LLILLJJLI, c1241370iPP.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1241370iPP.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxSearchDefaultState(loadFlag=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", items=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", loadData=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1241370iPP(EnumC1241490iPb enumC1241490iPb, List<? extends InterfaceC1891350zJl> list, C1241470iPZ c1241470iPZ) {
        this.LL = enumC1241490iPb;
        this.LLILLJJLI = list;
        this.LLILLL = c1241470iPZ;
    }
}
