package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0gY9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1169910gY9 {
    public static final Keva LIZ = Keva.getRepo("avatar_nickname_frequency_cache");

    public static int LIZ(String str) {
        Keva keva = LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("/_popup_show_cnt");
        return keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
    }
}
