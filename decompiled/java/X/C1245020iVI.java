package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0iVI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1245020iVI {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3118));
    public static final boolean LIZIZ;
    public static final boolean LIZJ;
    public static final boolean LIZLLL;

    static {
        LIZIZ = LIZ() > 0;
        C13LQ.LJLIIL(new Integer[]{1, 4}).contains(Integer.valueOf(LIZ()));
        LIZJ = C13LQ.LJLIIL(new Integer[]{2, 4}).contains(Integer.valueOf(LIZ()));
        LIZLLL = C13LQ.LJLIIL(new Integer[]{3, 4}).contains(Integer.valueOf(LIZ()));
    }

    public static int LIZ() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static boolean LIZIZ(User user) {
        if (LIZLLL && user.getMatchedFriendStruct() != null) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(User user) {
        if (LIZLLL && user.getMatchedFriendStruct() != null) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(User user) {
        if (LIZJ && user.getMatchedFriendStruct() != null) {
            return true;
        }
        return false;
    }
}
