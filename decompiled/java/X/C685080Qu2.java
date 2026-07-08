package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qu2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C685080Qu2 implements InterfaceC685100Qu4, InterfaceC685610Qut {
    public final List<C0R0A> LL;
    public final boolean LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C685080Qu2)) {
            return false;
        }
        C685080Qu2 c685080Qu2 = (C685080Qu2) obj;
        return Intrinsics.LJFF(this.LL, c685080Qu2.LL) && this.LLILLJJLI == c685080Qu2.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Top1NimbleImageListData(imageList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isPage=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC685100Qu4
    public final boolean LJIIIZ() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC685610Qut
    public final List<C0R0A> getImageList() {
        return this.LL;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C685080Qu2(List<C0R0A> list, boolean z) {
        this.LL = list;
        this.LLILLJJLI = z;
    }
}
