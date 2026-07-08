package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00rt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C212700rt<T> implements InterfaceC1891350zJl {
    public final String LL;
    public final C05YD<InterfaceC905820ZgC> LLILLJJLI;
    public final T LLILLL = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C212700rt)) {
            return false;
        }
        C212700rt c212700rt = (C212700rt) obj;
        return Intrinsics.LJFF(this.LL, c212700rt.LL) && Intrinsics.LJFF(this.LLILLJJLI, c212700rt.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c212700rt.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        T t = this.LLILLL;
        return iHashCode + (t == null ? 0 : t.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreamingBubbleItem(uuid=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", streamingStateFlow=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", extra=");
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

    public C212700rt(String str, C05YD c05yd) {
        this.LL = str;
        this.LLILLJJLI = c05yd;
    }
}
