package X;

import java.util.List;
import webcast.data.multi_guest_play.ShowListUser;

/* JADX INFO: renamed from: X.01Fp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C303501Fp {
    public final Long LIZ;
    public final ShowListUser LIZIZ;
    public final List<ShowListUser> LIZJ;
    public final List<ShowListUser> LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NextGuestEventData(durationPerGuest=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", showListUser=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", readyAndShowingList=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", finishGuestList=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C303501Fp(Long l, ShowListUser showListUser, List<ShowListUser> list, List<ShowListUser> list2) {
        this.LIZ = l;
        this.LIZIZ = showListUser;
        this.LIZJ = list;
        this.LIZLLL = list2;
    }
}
