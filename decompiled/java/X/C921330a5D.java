package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import java.util.List;
import kotlin.jvm.internal.AFwS203S0000000_15;

/* JADX INFO: renamed from: X.0a5D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C921330a5D {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(268));
    public static String LIZIZ = "single_live";
    public static int LIZJ;

    public static ListByTypeResponse.ReservedUser LIZ(long j) {
        List<ListByTypeResponse.ReservedUser> list = (List) LIZ.getValue();
        if (list != null) {
            for (ListByTypeResponse.ReservedUser reservedUser : list) {
                User user = reservedUser.user;
                if (user != null && user.getId() == j) {
                    return reservedUser;
                }
            }
            return null;
        }
        return null;
    }
}
