package X;

import com.ss.android.ugc.aweme.feed.model.trendingtopic.VideoTrendingTopic;
import com.ss.android.ugc.aweme.topic.trendingtopic.api.BillboardInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15GD, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15GD implements InterfaceC0148002o {
    public final C291001Au<VideoTrendingTopic> LL;
    public final C291001Au<Boolean> LLILLJJLI;
    public final C291001Au<List<BillboardInfo>> LLILLL;

    public C15GD() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15GD)) {
            return false;
        }
        C15GD c15gd = (C15GD) obj;
        return Intrinsics.LJFF(this.LL, c15gd.LL) && Intrinsics.LJFF(this.LLILLJJLI, c15gd.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c15gd.LLILLL);
    }

    public final int hashCode() {
        C291001Au<VideoTrendingTopic> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        C291001Au<Boolean> c291001Au2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<List<BillboardInfo>> c291001Au3 = this.LLILLL;
        return iHashCode2 + (c291001Au3 != null ? c291001Au3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TopicSelectState(selectTopic=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", networkStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", topicBoards=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C15GD(C291001Au<VideoTrendingTopic> c291001Au, C291001Au<Boolean> c291001Au2, C291001Au<? extends List<BillboardInfo>> c291001Au3) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
        this.LLILLL = c291001Au3;
    }

    public static C15GD LIZ(C15GD c15gd, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, int i) {
        if ((i & 1) != 0) {
            c291001Au = c15gd.LL;
        }
        if ((i & 2) != 0) {
            c291001Au2 = c15gd.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au3 = c15gd.LLILLL;
        }
        c15gd.getClass();
        return new C15GD(c291001Au, c291001Au2, c291001Au3);
    }
}
