package X;

import com.ss.android.ugc.aweme.stemfeed.panel.StemFeedFragmentPanel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gCf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156590gCf implements InterfaceC111300bX {
    public final StemFeedFragmentPanel LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1156590gCf) && Intrinsics.LJFF(this.LL, ((C1156590gCf) obj).LL);
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

    public C1156590gCf(StemFeedFragmentPanel stemFeedFragmentPanel) {
        this.LL = stemFeedFragmentPanel;
    }
}
