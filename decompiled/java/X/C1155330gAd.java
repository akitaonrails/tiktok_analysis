package X;

import com.ss.android.ugc.aweme.series.feed.tab.v2.DramaPicksPanel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gAd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155330gAd implements InterfaceC111300bX {
    public final DramaPicksPanel LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1155330gAd) && Intrinsics.LJFF(this.LL, ((C1155330gAd) obj).LL);
    }

    public final int hashCode() {
        DramaPicksPanel dramaPicksPanel = this.LL;
        if (dramaPicksPanel == null) {
            return 0;
        }
        return dramaPicksPanel.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DramaPicksHierarchyData(panel=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155330gAd(DramaPicksPanel dramaPicksPanel) {
        this.LL = dramaPicksPanel;
    }
}
