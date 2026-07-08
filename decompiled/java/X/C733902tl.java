package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02tl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C733902tl implements InterfaceC1891350zJl {
    public final String LL;
    public final List<C719302rP> LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C733902tl)) {
            return false;
        }
        C733902tl c733902tl = (C733902tl) obj;
        return Intrinsics.LJFF(this.LL, c733902tl.LL) && Intrinsics.LJFF(this.LLILLJJLI, c733902tl.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        String str = this.LL;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AggregationOrderModuleVO(aggregationOrderModuleTitle=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", aggregationOrderVOList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C733902tl) {
            return true;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C733902tl(String str, List<C719302rP> list) {
        this.LL = str;
        this.LLILLJJLI = list;
    }
}
