package X;

import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09Gp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2344509Gp implements IEvent {
    public final GlobalDoodleConfig LIZ;
    public final LogPbBean LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2344509Gp)) {
            return false;
        }
        C2344509Gp c2344509Gp = (C2344509Gp) obj;
        return Intrinsics.LJFF(this.LIZ, c2344509Gp.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2344509Gp.LIZIZ) && this.LIZJ == c2344509Gp.LIZJ;
    }

    public final int hashCode() {
        GlobalDoodleConfig globalDoodleConfig = this.LIZ;
        int iHashCode = (globalDoodleConfig == null ? 0 : globalDoodleConfig.hashCode()) * 31;
        LogPbBean logPbBean = this.LIZIZ;
        return ((iHashCode + (logPbBean != null ? logPbBean.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LIZJ);
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
        sbLIZ.append("SearchRequestSuccessConfigEvent(globalDoodleConfig=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", logPb=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isLoadMore=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2344509Gp(GlobalDoodleConfig globalDoodleConfig, LogPbBean logPbBean, boolean z) {
        this.LIZ = globalDoodleConfig;
        this.LIZIZ = logPbBean;
        this.LIZJ = z;
    }
}
