package X;

import com.ss.android.ugc.aweme.repostfeed.feed.RepostFeedPanel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gCe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156580gCe implements InterfaceC111300bX {
    public final RepostFeedPanel LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1156580gCe) && Intrinsics.LJFF(this.LL, ((C1156580gCe) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PanelHierachyData(panel=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1156580gCe(RepostFeedPanel repostFeedPanel) {
        this.LL = repostFeedPanel;
    }
}
