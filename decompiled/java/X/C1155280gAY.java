package X;

import com.ss.android.ugc.aweme.toptab.panel.LiveSingleFeedFragmentPanel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gAY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155280gAY implements InterfaceC111300bX {
    public final LiveSingleFeedFragmentPanel LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1155280gAY) && Intrinsics.LJFF(this.LL, ((C1155280gAY) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PanelHierarchyData(panel=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155280gAY(LiveSingleFeedFragmentPanel liveSingleFeedFragmentPanel) {
        this.LL = liveSingleFeedFragmentPanel;
    }
}
