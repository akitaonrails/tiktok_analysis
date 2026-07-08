package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h4V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1189970h4V implements IEvent {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1189970h4V)) {
            return false;
        }
        C1189970h4V c1189970h4V = (C1189970h4V) obj;
        return Intrinsics.LJFF(this.LIZ, c1189970h4V.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1189970h4V.LIZIZ) && this.LIZJ == c1189970h4V.LIZJ && this.LIZLLL == c1189970h4V.LIZLLL;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL;
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
        sbLIZ.append("PoiReviewsInteractionEvent(poiId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", reviewId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", likeCount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", action=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1189970h4V(int i, String str, long j, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LIZLLL = i;
    }
}
