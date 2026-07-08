package X;

import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0j1C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1264800j1C {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C296560Bjq());

    public static boolean LIZIZ() {
        return ((Boolean) LIZ.getValue()).booleanValue();
    }

    public static EnumC1260920iuw LIZJ() {
        return LIZIZ() ? EnumC1260920iuw.RELATION_LABEL : EnumC1260920iuw.CARD;
    }

    public static boolean LIZ(User user) {
        if (LIZIZ() && user.getMatchedFriendStruct() == null) {
            return false;
        }
        return true;
    }
}
