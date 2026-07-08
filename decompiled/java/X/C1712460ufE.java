package X;

import com.ss.android.ugc.aweme.pipo.cashier.common.address.Region;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS132S0101000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ufE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1712460ufE implements InterfaceC1891350zJl {
    public final List<Region> LL;
    public final Map<String, String> LLILLJJLI;
    public final Function1<String, Unit> LLILLL;
    public final Function1<Region, Unit> LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1712460ufE)) {
            return false;
        }
        C1712460ufE c1712460ufE = (C1712460ufE) obj;
        return Intrinsics.LJFF(this.LL, c1712460ufE.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1712460ufE.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1712460ufE.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1712460ufE.LLILZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DistrictItem(regions=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", eventParams=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", onStickyTitleChange=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", onSelect=");
        sbLIZ.append(this.LLILZ);
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

    public C1712460ufE(List list, Map map, AwS132S0101000_26 awS132S0101000_26, Function1 function1) {
        this.LL = list;
        this.LLILLJJLI = map;
        this.LLILLL = awS132S0101000_26;
        this.LLILZ = function1;
    }
}
