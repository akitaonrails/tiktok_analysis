package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07a4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1885807a4 implements InterfaceC1891350zJl {
    public final List<C1837000xu6> LL;
    public final boolean LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1885807a4)) {
            return false;
        }
        C1885807a4 c1885807a4 = (C1885807a4) obj;
        return Intrinsics.LJFF(this.LL, c1885807a4.LL) && this.LLILLJJLI == c1885807a4.LLILLJJLI;
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
        sbLIZ.append("VideoRowItem(videos=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isLastItem=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1885807a4) {
            C1885807a4 c1885807a4 = (C1885807a4) interfaceC1891350zJl;
            if (Intrinsics.LJFF(c1885807a4.LL, this.LL) && c1885807a4.LLILLJJLI == this.LLILLJJLI) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1885807a4) {
            C1885807a4 c1885807a4 = (C1885807a4) interfaceC1891350zJl;
            if (Intrinsics.LJFF(c1885807a4.LL, this.LL) && c1885807a4.LLILLJJLI == this.LLILLJJLI) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C1885807a4(List<C1837000xu6> list, boolean z) {
        this.LL = list;
        this.LLILLJJLI = z;
    }
}
