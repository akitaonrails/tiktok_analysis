package X;

import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03J4, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03J4 implements InterfaceC1891350zJl {
    public final List<C03J5> LL;
    public final List<Image> LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C03J4)) {
            return false;
        }
        C03J4 c03j4 = (C03J4) obj;
        return Intrinsics.LJFF(this.LL, c03j4.LL) && Intrinsics.LJFF(this.LLILLJJLI, c03j4.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AggregateLogisticVO(logistics=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", skuImages=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C03J4() {
        C13BV c13bv = C13BV.INSTANCE;
        this(c13bv, c13bv);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C03J4) {
            return true;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C03J4(List<C03J5> list, List<Image> list2) {
        this.LL = list;
        this.LLILLJJLI = list2;
    }
}
