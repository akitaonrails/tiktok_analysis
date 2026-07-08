package X;

import com.ss.android.ugc.aweme.minidrama.common.component.model.ShortDramaOverview;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r2Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1573160r2Y implements InterfaceC1891350zJl {
    public final ShortDramaOverview LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HistoryListItem(model=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", itemIndex=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", sessionId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", fromScene=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        Long l = this.LL.collectionId;
        if (l != null) {
            return l.hashCode();
        }
        return 0;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1573160r2Y) {
            C1573160r2Y c1573160r2Y = (C1573160r2Y) interfaceC1891350zJl;
            if (Intrinsics.LJFF(c1573160r2Y.LL.collectionId, this.LL.collectionId) && Intrinsics.LJFF(c1573160r2Y.LL.title, this.LL.title) && Intrinsics.LJFF(c1573160r2Y.LL.numWatched, this.LL.numWatched) && Intrinsics.LJFF(c1573160r2Y.LL.numVideos, this.LL.numVideos) && Intrinsics.LJFF(c1573160r2Y.LL.labelNew, this.LL.labelNew) && Intrinsics.LJFF(c1573160r2Y.LL.labelHot, this.LL.labelHot) && Intrinsics.LJFF(c1573160r2Y.LLILZ, this.LLILZ)) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1573160r2Y) {
            C1573160r2Y c1573160r2Y = (C1573160r2Y) interfaceC1891350zJl;
            if (Intrinsics.LJFF(c1573160r2Y.LL.collectionId, this.LL.collectionId) && Intrinsics.LJFF(c1573160r2Y.LLILZ, this.LLILZ)) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1573160r2Y) {
            return Intrinsics.LJFF(((C1573160r2Y) obj).LL.collectionId, this.LL.collectionId);
        }
        return super.equals(obj);
    }

    public C1573160r2Y(ShortDramaOverview shortDramaOverview, int i, String str, String str2) {
        this.LL = shortDramaOverview;
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = str2;
    }
}
