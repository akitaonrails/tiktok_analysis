package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yrs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C887580Yrs implements InterfaceC0148002o {
    public final EnumC887600Yru LL;
    public final EnumC880850Yh1 LLILLJJLI;
    public final List<InterfaceC1891350zJl> LLILLL;

    public C887580Yrs() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C887580Yrs)) {
            return false;
        }
        C887580Yrs c887580Yrs = (C887580Yrs) obj;
        return this.LL == c887580Yrs.LL && this.LLILLJJLI == c887580Yrs.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c887580Yrs.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        List<InterfaceC1891350zJl> list = this.LLILLL;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ArchivePageState(pageStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", listMode=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", chatItemList=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C887580Yrs(int i) {
        this(EnumC887600Yru.LOADING, EnumC880850Yh1.NORMAL, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C887580Yrs(EnumC887600Yru enumC887600Yru, EnumC880850Yh1 enumC880850Yh1, List<? extends InterfaceC1891350zJl> list) {
        this.LL = enumC887600Yru;
        this.LLILLJJLI = enumC880850Yh1;
        this.LLILLL = list;
    }
}
