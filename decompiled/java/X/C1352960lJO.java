package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lJO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1352960lJO implements InterfaceC1891350zJl {
    public final Aweme LL;
    public final NowFeedMobHierarchyData LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1352960lJO)) {
            return false;
        }
        C1352960lJO c1352960lJO = (C1352960lJO) obj;
        return Intrinsics.LJFF(this.LL, c1352960lJO.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1352960lJO.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        Aweme aweme = this.LL;
        int iHashCode = (aweme == null ? 0 : aweme.hashCode()) * 31;
        NowFeedMobHierarchyData nowFeedMobHierarchyData = this.LLILLJJLI;
        return iHashCode + (nowFeedMobHierarchyData != null ? nowFeedMobHierarchyData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CaptionItem(aweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", interactionHierarchyData=");
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

    public C1352960lJO(Aweme aweme, NowFeedMobHierarchyData nowFeedMobHierarchyData) {
        this.LL = aweme;
        this.LLILLJJLI = nowFeedMobHierarchyData;
    }
}
