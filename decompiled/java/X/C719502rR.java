package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02rR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C719502rR implements InterfaceC1891350zJl {
    public final String LL;
    public final List<C719202rO> LLILLJJLI;
    public final Boolean LLILLL;

    public C719502rR() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C719502rR)) {
            return false;
        }
        C719502rR c719502rR = (C719502rR) obj;
        return Intrinsics.LJFF(this.LL, c719502rR.LL) && Intrinsics.LJFF(this.LLILLJJLI, c719502rR.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c719502rR.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31;
        Boolean bool = this.LLILLL;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopModuleVO(shopModuleTitle=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", shopInfoList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isPreHandle=");
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
        if (interfaceC1891350zJl instanceof C719502rR) {
            return true;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C719502rR(String str, List list) {
        this.LL = str;
        this.LLILLJJLI = list;
        this.LLILLL = null;
    }
}
