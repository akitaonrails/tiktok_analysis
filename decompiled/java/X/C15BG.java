package X;

import webcast.data.multi_guest_play.GuestShowdownContent;
import webcast.data.multi_guest_play.GuestShowdownUser;

/* JADX INFO: renamed from: X.15BG, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15BG {
    public static final int LIZ(GuestShowdownContent guestShowdownContent) {
        boolean z;
        Integer numLJ;
        int i = guestShowdownContent.playStatus;
        if (i == 2) {
            InterfaceC938530aWx interfaceC938530aWxLIZ = C01IB.LIZ();
            if (interfaceC938530aWxLIZ != null && (numLJ = interfaceC938530aWxLIZ.LJ()) != null && numLJ.intValue() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (guestShowdownContent.playStatus == 2) {
                    for (GuestShowdownUser guestShowdownUser : guestShowdownContent.runningPlayUsers) {
                        if (guestShowdownUser.rank == 1) {
                            if (guestShowdownUser != null) {
                                return 22;
                            }
                            return 21;
                        }
                    }
                    return 21;
                }
                return 21;
            }
            if (guestShowdownContent.playStatus == 2) {
                for (GuestShowdownUser guestShowdownUser2 : guestShowdownContent.runningPlayUsers) {
                    if (guestShowdownUser2.userTag == 2) {
                        if (guestShowdownUser2 != null) {
                            return 22;
                        }
                        return 21;
                    }
                }
                return 21;
            }
            return 21;
        }
        return i * 10;
    }
}
