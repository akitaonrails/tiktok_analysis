package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lXm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1361880lXm implements IEvent {
    public final Aweme LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1361880lXm)) {
            return false;
        }
        C1361880lXm c1361880lXm = (C1361880lXm) obj;
        return Intrinsics.LJFF(this.LIZ, c1361880lXm.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1361880lXm.LIZIZ) && this.LIZJ == c1361880lXm.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1361880lXm.LIZLLL);
    }

    public final int hashCode() {
        Aweme aweme = this.LIZ;
        int iHashCode = (((((aweme == null ? 0 : aweme.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31;
        String str = this.LIZLLL;
        return iHashCode + (str != null ? str.hashCode() : 0);
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
        sbLIZ.append("DramaLynxCardLoadFailedEvent(aweme=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", eventType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1361880lXm(int i, Aweme aweme, String str, String str2) {
        this.LIZ = aweme;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = str2;
    }
}
