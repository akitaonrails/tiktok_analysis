package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.AggTopItem;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0y6k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1844840y6k implements InterfaceC1891350zJl {
    public final AggTopItem LL;
    public final HashMap<String, String> LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1844840y6k)) {
            return false;
        }
        C1844840y6k c1844840y6k = (C1844840y6k) obj;
        return Intrinsics.LJFF(this.LL, c1844840y6k.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1844840y6k.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        HashMap<String, String> map = this.LLILLJJLI;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AggregateTopAreaItem(topItem=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", extraMap=");
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
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1844840y6k(AggTopItem aggTopItem, HashMap<String, String> map) {
        this.LL = aggTopItem;
        this.LLILLJJLI = map;
    }
}
