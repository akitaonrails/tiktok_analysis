package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.List;

/* JADX INFO: renamed from: X.0iNr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1240410iNr {
    public static final C1240410iNr LIZ = new C1240410iNr();
    public static final List<Integer> LIZIZ = C1697810uHb.LJIIJJI(Integer.valueOf(EnumC1240560iO6.FOLLOWING.getStatus()), Integer.valueOf(EnumC1240560iO6.FOLLOW_EACH_OTHER.getStatus()));

    public static boolean LIZ(IMUser iMUser) {
        Integer numValueOf;
        List<Integer> list = LIZIZ;
        if (iMUser != null) {
            numValueOf = Integer.valueOf(iMUser.getFollowStatus());
        } else {
            numValueOf = null;
        }
        if (C13LP.LJJJJ(numValueOf, list) || (iMUser != null && iMUser.isMAF())) {
            return true;
        }
        return false;
    }
}
