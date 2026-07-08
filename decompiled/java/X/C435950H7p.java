package X;

import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H7p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C435950H7p implements InterfaceC0148002o {
    public final List<SearchKeyFramePoint> LL;
    public final boolean LLILLJJLI;

    public C435950H7p() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C435950H7p)) {
            return false;
        }
        C435950H7p c435950H7p = (C435950H7p) obj;
        return Intrinsics.LJFF(this.LL, c435950H7p.LL) && this.LLILLJJLI == c435950H7p.LLILLJJLI;
    }

    public final int hashCode() {
        List<SearchKeyFramePoint> list = this.LL;
        return ((list == null ? 0 : list.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchVideoKeyFrameState(searchKeyPoints=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isDir3PanelExpanded=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C435950H7p(int i) {
        this(null, false);
    }

    public C435950H7p(List<SearchKeyFramePoint> list, boolean z) {
        this.LL = list;
        this.LLILLJJLI = z;
    }
}
