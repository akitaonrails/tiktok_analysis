package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cpk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C325700Cpk implements InterfaceC1891350zJl {
    public final Aweme LL;
    public final int LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C325700Cpk)) {
            return false;
        }
        C325700Cpk c325700Cpk = (C325700Cpk) obj;
        return Intrinsics.LJFF(this.LL, c325700Cpk.LL) && this.LLILLJJLI == c325700Cpk.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicCellSpotlightItem(aweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", hash=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C325700Cpk)) {
            return false;
        }
        C325700Cpk c325700Cpk = (C325700Cpk) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(c325700Cpk.LL, this.LL) || c325700Cpk.LLILLJJLI != this.LLILLJJLI) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C325700Cpk) {
            return Intrinsics.LJFF(((C325700Cpk) interfaceC1891350zJl).LL, this.LL);
        }
        return false;
    }

    public C325700Cpk(Aweme aweme, int i) {
        this.LL = aweme;
        this.LLILLJJLI = i;
    }
}
