package X;

import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.model.SearchHorizontalData;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pcx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C649010Pcx implements IEvent {
    public final SearchHorizontalData LIZ;
    public final C651000PgA LIZIZ;
    public final int LIZJ = 0;
    public final String LIZLLL;
    public final Integer LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C649010Pcx)) {
            return false;
        }
        C649010Pcx c649010Pcx = (C649010Pcx) obj;
        return Intrinsics.LJFF(this.LIZ, c649010Pcx.LIZ) && Intrinsics.LJFF(this.LIZIZ, c649010Pcx.LIZIZ) && this.LIZJ == c649010Pcx.LIZJ && Intrinsics.LJFF(this.LIZLLL, c649010Pcx.LIZLLL) && Intrinsics.LJFF(this.LJ, c649010Pcx.LJ);
    }

    public final int hashCode() {
        SearchHorizontalData searchHorizontalData = this.LIZ;
        int iHashCode = (searchHorizontalData == null ? 0 : searchHorizontalData.hashCode()) * 31;
        C651000PgA c651000PgA = this.LIZIZ;
        int iHashCode2 = (((((iHashCode + (c651000PgA == null ? 0 : c651000PgA.hashCode())) * 31) + this.LIZJ) * 31) + this.LIZLLL.hashCode()) * 31;
        Integer num = this.LJ;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C1440005kM.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C1440005kM.LIZIZ(this);
        return this;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TransferSearchHorizontalEvent(searchHorizontalData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", param=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", currentSize=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", containerId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", sessionId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C649010Pcx(SearchHorizontalData searchHorizontalData, C651000PgA c651000PgA, String str, Integer num) {
        this.LIZ = searchHorizontalData;
        this.LIZIZ = c651000PgA;
        this.LIZLLL = str;
        this.LJ = num;
    }
}
