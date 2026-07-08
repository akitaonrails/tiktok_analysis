package X;

import com.ss.android.ugc.aweme.feed.model.trendingtopic.VideoTrendingTopic;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.159P, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C159P implements InterfaceC0148002o {
    public final C291001Au<List<VideoTrendingTopic>> LL;
    public final C291001Au<Boolean> LLILLJJLI;

    public C159P() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C159P)) {
            return false;
        }
        C159P c159p = (C159P) obj;
        return Intrinsics.LJFF(this.LL, c159p.LL) && Intrinsics.LJFF(this.LLILLJJLI, c159p.LLILLJJLI);
    }

    public final int hashCode() {
        C291001Au<List<VideoTrendingTopic>> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        C291001Au<Boolean> c291001Au2 = this.LLILLJJLI;
        return iHashCode + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchState(searchResult=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", networkState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C159P(C291001Au<? extends List<VideoTrendingTopic>> c291001Au, C291001Au<Boolean> c291001Au2) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
    }
}
