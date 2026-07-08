package X;

import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel.cell.HighLightIconTag;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H4V, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H4V implements InterfaceC1891350zJl {
    public final Integer LL;
    public final HighLightIconTag LLILLJJLI;
    public final int LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0H4V)) {
            return false;
        }
        C0H4V c0h4v = (C0H4V) obj;
        return Intrinsics.LJFF(this.LL, c0h4v.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0h4v.LLILLJJLI) && this.LLILLL == c0h4v.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        Integer num = this.LL;
        return ((((num == null ? 0 : num.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiHighLightIconTagItem(id=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", iconTag=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", headerOptStyle=");
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

    public C0H4V(Integer num, HighLightIconTag highLightIconTag, int i) {
        this.LL = num;
        this.LLILLJJLI = highLightIconTag;
        this.LLILLL = i;
    }
}
