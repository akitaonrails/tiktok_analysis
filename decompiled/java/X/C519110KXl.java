package X;

/* JADX INFO: renamed from: X.0KXl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C519110KXl {
    public static final /* synthetic */ C519110KXl LIZ = new C519110KXl();

    public static String LIZ(int i) {
        switch (i) {
            case 0:
                return "NONE_LIVE";
            case 1:
                return "INNER_WATCH_LIVE";
            case 2:
                return "PREVIEW_CARD_WATCH_LIVE";
            case 3:
                return "INNER_FLOW_PULL_STREAM";
            case 4:
                return "UNKNOWN";
            case 5:
                return "PREVIEW_CARD_PULL_STREAM";
            case 6:
                return "FEED_SCROLL";
            case 7:
                return "INNER_FLOW_SCROLL";
            case 8:
                return "ENTER_INNER_FLOW_INIT";
            default:
                if (i > 100) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("POST_BLOCK_IDLE_FOR_");
                    sbLIZ.append(LIZ(i - 100));
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
                return "UNKNOWN";
        }
    }
}
