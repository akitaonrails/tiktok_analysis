package X;

import com.ss.android.ugc.aweme.topicfeed.panel.TopicFeedFragmentPanel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gCg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156600gCg implements InterfaceC111300bX {
    public final TopicFeedFragmentPanel LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1156600gCg) && Intrinsics.LJFF(this.LL, ((C1156600gCg) obj).LL);
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

    public C1156600gCg(TopicFeedFragmentPanel topicFeedFragmentPanel) {
        this.LL = topicFeedFragmentPanel;
    }
}
