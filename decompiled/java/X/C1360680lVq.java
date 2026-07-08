package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0lVq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1360680lVq {
    public static final C1360680lVq LIZ = new C1360680lVq();
    public static final Keva LIZIZ = Keva.getRepo("social_repost_feed");
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1360690lVr());

    public static long LIZIZ() {
        Keva keva = LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("last_read_time_");
        sbLIZ.append(LIZ());
        return keva.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
    }

    public static String LIZJ() {
        Keva keva = LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("page_token_");
        sbLIZ.append(LIZ());
        return keva.getString(C2188811AlT.LIZIZ(sbLIZ), "");
    }

    public static boolean LIZLLL() {
        Keva keva = LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("repost_feed_entrance_shown_");
        sbLIZ.append(LIZ());
        return keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    public static String LIZ() {
        return ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
    }
}
