package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Nsk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C607840Nsk implements IEvent {
    public final int LIZ;
    public final int LIZIZ;
    public final List<User> LIZJ;
    public final Long LIZLLL;
    public final int LJ;

    public C607840Nsk() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C607840Nsk)) {
            return false;
        }
        C607840Nsk c607840Nsk = (C607840Nsk) obj;
        return this.LIZ == c607840Nsk.LIZ && this.LIZIZ == c607840Nsk.LIZIZ && Intrinsics.LJFF(this.LIZJ, c607840Nsk.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c607840Nsk.LIZLLL) && this.LJ == c607840Nsk.LJ;
    }

    public final int hashCode() {
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        List<User> list = this.LIZJ;
        int iHashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.LIZLLL;
        return ((iHashCode + (l != null ? l.hashCode() : 0)) * 31) + this.LJ;
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
        sbLIZ.append("NoticeFollowingTabInfo(group=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", level=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", followeeInfo=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", serverTriggerTime=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", triggerScene=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C607840Nsk(int i, int i2, List list, Long l, int i3, int i4) {
        l = (i4 & 8) != 0 ? 0L : l;
        i3 = (i4 & 16) != 0 ? -1 : i3;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = list;
        this.LIZLLL = l;
        this.LJ = i3;
    }
}
