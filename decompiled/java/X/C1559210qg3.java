package X;

import com.ss.android.ugc.aweme.series.feed.model.SeriesCenterCenterScene;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qg3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1559210qg3 implements InterfaceC2753014t, InterfaceC111300bX {
    public final SeriesCenterCenterScene LL;
    public final boolean LLILLJJLI;
    public final C01GW LLILLL;

    public C1559210qg3() {
        this(null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1559210qg3)) {
            return false;
        }
        C1559210qg3 c1559210qg3 = (C1559210qg3) obj;
        return Intrinsics.LJFF(this.LL, c1559210qg3.LL) && this.LLILLJJLI == c1559210qg3.LLILLJJLI;
    }

    public final int hashCode() {
        SeriesCenterCenterScene seriesCenterCenterScene = this.LL;
        return ((seriesCenterCenterScene == null ? 0 : seriesCenterCenterScene.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DramaCategoryContentListHierarchyData(category=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isFromInnerfeedDiscover=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1559210qg3(SeriesCenterCenterScene seriesCenterCenterScene, boolean z) {
        this.LL = seriesCenterCenterScene;
        this.LLILLJJLI = z;
        this.LLILLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(497));
    }
}
