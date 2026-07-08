package X;

import Y.AComparatorS50S0000000_31;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import webcast.data.multi_guest_play.GuestShowdownContent;
import webcast.data.multi_guest_play.GuestShowdownUser;

/* JADX INFO: renamed from: X.15BD, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15BD {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(GuestShowdownContent guestShowdownContent) {
        ArrayList arrayList = new ArrayList();
        Iterator<GuestShowdownUser> it2 = guestShowdownContent.runningPlayUsers.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            GuestShowdownUser next = it2.next();
            if (next.rank > 0) {
                if (next != null) {
                    for (GuestShowdownUser guestShowdownUser : C13LP.LJLLLL(new AComparatorS50S0000000_31(12), guestShowdownContent.runningPlayUsers)) {
                        arrayList.add(new C15BM(guestShowdownUser.userTag, guestShowdownUser.userId, guestShowdownUser.score));
                    }
                    return arrayList;
                }
            }
        }
        List<GuestShowdownUser> list = guestShowdownContent.runningPlayUsers;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (GuestShowdownUser guestShowdownUser2 : list) {
            arrayList2.add(new C15BM(guestShowdownUser2.userTag, guestShowdownUser2.userId, guestShowdownUser2.score));
        }
        return arrayList2;
    }
}
