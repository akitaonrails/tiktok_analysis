package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.051k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12858051k {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str, String str2) {
        Keva repo = Keva.getRepo("im_group_share_post_banner_keva_config");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(C461720I8s.LIZIZ());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append('_');
        sbLIZ2.append(str2);
        return repo.getBoolean(C2188811AlT.LIZIZ(sbLIZ2), false);
    }

    public static void LIZIZ(String str, String str2) {
        Keva repo = Keva.getRepo("im_group_share_post_banner_keva_config");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(C461720I8s.LIZIZ());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append('_');
        sbLIZ2.append(str2);
        repo.storeBoolean(C2188811AlT.LIZIZ(sbLIZ2), true);
    }
}
