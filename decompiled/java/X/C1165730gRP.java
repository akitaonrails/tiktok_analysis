package X;

import com.ss.android.ugc.aweme.minidrama.common.component.model.ShortDramaOverview;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gRP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1165730gRP implements InterfaceC1891350zJl {
    public final ShortDramaOverview LL;
    public final int LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1165730gRP)) {
            return false;
        }
        C1165730gRP c1165730gRP = (C1165730gRP) obj;
        return Intrinsics.LJFF(this.LL, c1165730gRP.LL) && this.LLILLJJLI == c1165730gRP.LLILLJJLI;
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
        sbLIZ.append("DramaGuestCollectionItem(model=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", itemIndex=");
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

    public C1165730gRP(ShortDramaOverview shortDramaOverview, int i) {
        this.LL = shortDramaOverview;
        this.LLILLJJLI = i;
    }
}
