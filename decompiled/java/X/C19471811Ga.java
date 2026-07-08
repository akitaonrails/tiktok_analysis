package X;

/* JADX INFO: renamed from: X.11Ga, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19471811Ga {
    public static final C19471811Ga LIZ = new C19471811Ga();
    public static boolean LIZIZ;

    public static boolean LIZ() {
        C675950QfJ.LIZ.getClass();
        if (C675950QfJ.LIZ().getBoolean("is_photo_search_new_user", true) && !C675950QfJ.LIZ().getBoolean("disable_photo_search_new_guide", false)) {
            return (System.currentTimeMillis() - C675950QfJ.LIZ().getLong("close_new_user_guide_recent_time", -1L)) / 86400000 >= 30;
        }
        return false;
    }
}
