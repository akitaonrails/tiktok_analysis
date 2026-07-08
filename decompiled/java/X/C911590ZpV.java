package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZpV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C911590ZpV {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(321));

    public static boolean LIZ(IMContact iMContact) {
        if ((iMContact instanceof IMUser) && ((IMUser) iMContact).getFollowStatus() == 2) {
            String uid = iMContact.getUid();
            String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
            if (curUserId != null) {
                if (!Intrinsics.LJFF(uid, curUserId)) {
                    return true;
                }
                return false;
            }
            "must be available".toString();
            throw new IllegalStateException("must be available");
        }
        return false;
    }
}
