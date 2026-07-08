package X;

import com.ss.android.ugc.aweme.feed.model.upvote.CarrierType;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteCacheState;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l4g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1343840l4g implements IEvent {
    public final String LIZ;
    public final String LIZIZ;
    public final UpvoteCacheState LIZJ;
    public final CarrierType LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1343840l4g)) {
            return false;
        }
        C1343840l4g c1343840l4g = (C1343840l4g) obj;
        return Intrinsics.LJFF(this.LIZ, c1343840l4g.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1343840l4g.LIZIZ) && this.LIZJ == c1343840l4g.LIZJ && this.LIZLLL == c1343840l4g.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
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
        sbLIZ.append("CommentRepostNoteEvent(aid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", carrierId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", publishState=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", carrierType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1343840l4g(String str, String str2, UpvoteCacheState upvoteCacheState, CarrierType carrierType) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = upvoteCacheState;
        this.LIZLLL = carrierType;
    }
}
