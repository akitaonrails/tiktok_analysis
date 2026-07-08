package X;

import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0ijK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1253720ijK {
    public static InterfaceC1253680ijG LIZIZ;
    public static FeedItemList LIZJ;
    public static Exception LIZLLL;
    public static boolean LJ;
    public static final Object LIZ = new Object();
    public static final Map<String, Boolean> LJFF = new LinkedHashMap();

    static {
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIILL(new InterfaceC586170Myt() { // from class: X.0ijJ
            @Override // X.InterfaceC586170Myt
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                String nickname;
                String uid = null;
                if (!z) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("type: ");
                    sbLIZ.append(i);
                    sbLIZ.append(" failed, nickname:");
                    if (user != null) {
                        nickname = user.getNickname();
                    } else {
                        nickname = null;
                    }
                    sbLIZ.append(nickname);
                    sbLIZ.append(" , uid:");
                    if (user != null) {
                        uid = user.getUid();
                    }
                    sbLIZ.append(uid);
                    C1720106oR.LJI("Profile_ProfileAwemeCacheManager", C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                int i3 = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("change account: ");
                sbLIZ2.append(C1253720ijK.LJ);
                C1720106oR.LJI("Profile_ProfileAwemeCacheManager", C2188811AlT.LIZIZ(sbLIZ2));
                C1253720ijK.LJ = false;
                ((LinkedHashMap) C1253720ijK.LJFF).clear();
                C1253720ijK.LIZJ = null;
                C1253720ijK.LIZIZ = null;
                C1253720ijK.LIZLLL = null;
            }
        });
    }
}
