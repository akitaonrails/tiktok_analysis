package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0np6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1449500np6 {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("homepage_hot", "general_search", "others_homepage", "personal_homepage", "homepage_friends", "homepage_follow", "collection_video", "notification_page", "homepage_explore");

    public static void LIZ(String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = (Object[]) C303740BvQ.LIZ.getValue();
        if (objArr == null) {
            objArr = new String[0];
        }
        if (LIZ.contains(str) || C13LQ.LJJIJIIJI(str, objArr) >= 0) {
            C1449490np5.LIZ.getClass();
            String strLIZLLL = C1449490np5.LIZLLL(null);
            String strLJ = C1449490np5.LJ(null);
            String str6 = C1449490np5.LJIIIIZZ(null).lastPagePlayMusicId;
            if (!Intrinsics.LJFF(strLIZLLL, str)) {
                C1449490np5.LJIIIIZZ(null).prePageName = strLIZLLL;
                if (!Intrinsics.LJFF(strLJ, str2)) {
                    C1449490np5.LJIIIIZZ(null).prePagePlayGid = strLJ;
                }
                if (!Intrinsics.LJFF(str6, str3)) {
                    C1449490np5.LJIIIIZZ(null).prePagePlayMusicId = str6;
                }
            }
            C1449490np5.LJIIIIZZ(null).lastPagePlayGid = str2;
            C1449490np5.LJIIIIZZ(null).lastPagePlayMusicId = str3;
            C1449490np5.LJIIIIZZ(null).lastPageName = str;
        }
        C1449490np5.LIZ.getClass();
        C1449490np5.LJIIIIZZ(null).lastPlayGid = str2;
        C1449490np5.LJIIIIZZ(null).lastPlayMusicId = str3;
        C1449490np5.LJIIIIZZ(null).authorId = str4;
        C1449490np5.LJIIIIZZ(null).requestId = str5;
    }
}
