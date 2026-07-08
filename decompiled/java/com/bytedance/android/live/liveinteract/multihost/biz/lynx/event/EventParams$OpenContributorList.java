package com.bytedance.android.live.liveinteract.multihost.biz.lynx.event;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes3.dex */
public final class EventParams$OpenContributorList {

    @C09CT("is_self_team")
    public final boolean isSelfTeam;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EventParams$OpenContributorList) && this.isSelfTeam == ((EventParams$OpenContributorList) obj).isSelfTeam;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.isSelfTeam);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OpenContributorList(isSelfTeam=");
        sbLIZ.append(this.isSelfTeam);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EventParams$OpenContributorList(boolean z) {
        this.isSelfTeam = z;
    }
}
