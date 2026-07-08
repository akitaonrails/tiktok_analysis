package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lKm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1353820lKm implements InterfaceC636340Oxc<C1353820lKm, InterfaceC1891350zJl> {
    public final C627660Ojc<InterfaceC1891350zJl> LL;
    public final Aweme LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final C291001Au<Long> LLILZIL;
    public final C291001Au<Long> LLILZLL;
    public final int LLIZ;
    public final NowFeedMobHierarchyData LLIZLLLIL;

    public C1353820lKm() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1353820lKm)) {
            return false;
        }
        C1353820lKm c1353820lKm = (C1353820lKm) obj;
        return Intrinsics.LJFF(this.LL, c1353820lKm.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1353820lKm.LLILLJJLI) && this.LLILLL == c1353820lKm.LLILLL && this.LLILZ == c1353820lKm.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1353820lKm.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1353820lKm.LLILZLL) && this.LLIZ == c1353820lKm.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c1353820lKm.LLIZLLLIL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        Aweme aweme = this.LLILLJJLI;
        int iHashCode2 = (((((iHashCode + (aweme == null ? 0 : aweme.hashCode())) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31;
        C291001Au<Long> c291001Au = this.LLILZIL;
        int iHashCode3 = (iHashCode2 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<Long> c291001Au2 = this.LLILZLL;
        int iHashCode4 = (((iHashCode3 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31) + this.LLIZ) * 31;
        NowFeedMobHierarchyData nowFeedMobHierarchyData = this.LLIZLLLIL;
        return iHashCode4 + (nowFeedMobHierarchyData != null ? nowFeedMobHierarchyData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InteractionBubbleListVMState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isActive=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isVisible=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", commentCount=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", likeCount=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", commentPosition=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", hierarchyData=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<InterfaceC1891350zJl> getListItemState() {
        return C627260Oiy.LIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadLatestState() {
        return C627260Oiy.LIZIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadMoreState() {
        return C627260Oiy.LIZJ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getRefreshState() {
        return C627260Oiy.LIZLLL(this);
    }

    @Override // X.InterfaceC627270Oiz
    public final C627660Ojc<InterfaceC1891350zJl> getListState() {
        return this.LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C1353820lKm(int i) {
        this(new C627660Ojc(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15), null, false, false, null, null, 0, null);
    }

    public C1353820lKm(C627660Ojc<InterfaceC1891350zJl> c627660Ojc, Aweme aweme, boolean z, boolean z2, C291001Au<Long> c291001Au, C291001Au<Long> c291001Au2, int i, NowFeedMobHierarchyData nowFeedMobHierarchyData) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = aweme;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = c291001Au;
        this.LLILZLL = c291001Au2;
        this.LLIZ = i;
        this.LLIZLLLIL = nowFeedMobHierarchyData;
    }

    public static C1353820lKm LIZ(C1353820lKm c1353820lKm, C627660Ojc c627660Ojc, Aweme aweme, boolean z, C291001Au c291001Au, C291001Au c291001Au2, NowFeedMobHierarchyData nowFeedMobHierarchyData, int i) {
        boolean z2;
        int i2;
        NowFeedMobHierarchyData nowFeedMobHierarchyData2 = nowFeedMobHierarchyData;
        C291001Au c291001Au3 = c291001Au;
        boolean z3 = z;
        Aweme aweme2 = aweme;
        C291001Au c291001Au4 = c291001Au2;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        if ((i & 1) != 0) {
            c627660Ojc2 = c1353820lKm.LL;
        }
        if ((i & 2) != 0) {
            aweme2 = c1353820lKm.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z2 = c1353820lKm.LLILLL;
        } else {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = c1353820lKm.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au3 = c1353820lKm.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au4 = c1353820lKm.LLILZLL;
        }
        if ((i & 64) != 0) {
            i2 = c1353820lKm.LLIZ;
        } else {
            i2 = 0;
        }
        if ((i & 128) != 0) {
            nowFeedMobHierarchyData2 = c1353820lKm.LLIZLLLIL;
        }
        c1353820lKm.getClass();
        return new C1353820lKm(c627660Ojc2, aweme2, z2, z3, c291001Au3, c291001Au4, i2, nowFeedMobHierarchyData2);
    }
}
