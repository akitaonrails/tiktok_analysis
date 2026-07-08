package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0rev, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1596950rev {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(User user) {
        String uid;
        EnumC1597060rf6 enumC1597060rf6 = EnumC1597060rf6.LIVE;
        if (user == null || (uid = user.getUid()) == null) {
            uid = "";
        }
        return LIZJ(enumC1597060rf6, uid);
    }

    public static String LIZIZ(Aweme aweme) {
        return LIZJ(EnumC1597060rf6.STORY, C729510SjV.LJIIIZ(aweme));
    }

    public static String LIZJ(EnumC1597060rf6 enumC1597060rf6, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(enumC1597060rf6.name());
        sbLIZ.append('_');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
