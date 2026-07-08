package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lIb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1352470lIb implements InterfaceC111300bX {
    public final Aweme LL;
    public final NowFeedMobHierarchyData LLILLJJLI;

    public C1352470lIb() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1352470lIb)) {
            return false;
        }
        C1352470lIb c1352470lIb = (C1352470lIb) obj;
        return Intrinsics.LJFF(this.LL, c1352470lIb.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1352470lIb.LLILLJJLI);
    }

    public final int hashCode() {
        Aweme aweme = this.LL;
        int iHashCode = (aweme == null ? 0 : aweme.hashCode()) * 31;
        NowFeedMobHierarchyData nowFeedMobHierarchyData = this.LLILLJJLI;
        return iHashCode + (nowFeedMobHierarchyData != null ? nowFeedMobHierarchyData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LikeListInitData(aweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", interactionHierarchyData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1352470lIb(Aweme aweme, NowFeedMobHierarchyData nowFeedMobHierarchyData) {
        this.LL = aweme;
        this.LLILLJJLI = nowFeedMobHierarchyData;
    }
}
