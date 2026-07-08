package X;

import com.ss.android.ugc.aweme.minidrama.common.component.model.ShortDramaOverview;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r2T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1573110r2T implements InterfaceC1891350zJl {
    public final ShortDramaOverview LL;
    public final String LLILLJJLI;
    public final int LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1573110r2T)) {
            return false;
        }
        C1573110r2T c1573110r2T = (C1573110r2T) obj;
        return Intrinsics.LJFF(this.LL, c1573110r2T.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1573110r2T.LLILLJJLI) && this.LLILLL == c1573110r2T.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MiniDramaCenterNewStyleOverViewItem(overView=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", tag=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1573110r2T)) {
            return false;
        }
        C1573110r2T c1573110r2T = (C1573110r2T) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(this.LL, c1573110r2T.LL) || !Intrinsics.LJFF(this.LLILLJJLI, c1573110r2T.LLILLJJLI) || this.LLILLL != c1573110r2T.LLILLL) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1573110r2T)) {
            return false;
        }
        C1573110r2T c1573110r2T = (C1573110r2T) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(this.LL, c1573110r2T.LL) || !Intrinsics.LJFF(this.LLILLJJLI, c1573110r2T.LLILLJJLI) || this.LLILLL != c1573110r2T.LLILLL) {
            return false;
        }
        return true;
    }

    public C1573110r2T(ShortDramaOverview shortDramaOverview, String str, int i) {
        this.LL = shortDramaOverview;
        this.LLILLJJLI = str;
        this.LLILLL = i;
    }
}
