package X;

/* JADX INFO: renamed from: X.0C90, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C90 {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C308910C8z());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C308900C8y());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C0C91());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C0C92());

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final int LIZ(String str) {
        switch (str.hashCode()) {
            case -30016963:
                if (!str.equals("live_view_action")) {
                    return 30;
                }
                return ((Number) LIZJ.getValue()).intValue();
            case 401047372:
                if (!str.equals("video_view_action")) {
                    return 30;
                }
                return ((Number) LIZIZ.getValue()).intValue();
            case 937355437:
                if (!str.equals("search_action")) {
                    return 30;
                }
                return ((Number) LIZLLL.getValue()).intValue();
            case 1543147943:
                if (!str.equals("goods_view_action")) {
                    return 30;
                }
                return ((Number) LIZ.getValue()).intValue();
            default:
                return 30;
        }
    }
}
