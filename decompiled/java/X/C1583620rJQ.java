package X;

import com.ss.android.ugc.aweme.node.InboxPageNode;
import com.ss.android.ugc.aweme.node.MainPageNode;
import com.ss.android.ugc.aweme.node.MyProfilePageNode;
import com.ss.android.ugc.aweme.node.ProfileGroupPageNode;
import com.ss.android.ugc.aweme.node.ProfilePageNode;
import com.ss.android.ugc.aweme.node.SeriesDiscoverTabPageNode;

/* JADX INFO: renamed from: X.0rJQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1583620rJQ {
    public static final C1583620rJQ LIZ = new C1583620rJQ();
    public static AbstractC1583720rJa LIZIZ;
    public static AbstractC1583720rJa LIZJ;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static AbstractC1583720rJa LIZ(C19EG c19eg, String str) {
        switch (str.hashCode()) {
            case -1382453013:
                if (!str.equals("NOTIFICATION")) {
                    return null;
                }
                return new InboxPageNode();
            case 2614219:
                if (!str.equals("USER")) {
                    return null;
                }
                return new MyProfilePageNode();
            case 185242617:
                if (!str.equals("page_profile")) {
                    return null;
                }
                if (C1585030rLh.LJJI()) {
                    return new ProfileGroupPageNode(c19eg);
                }
                return new ProfilePageNode();
            case 877821105:
                if (!str.equals("SERIES_DISCOVER")) {
                    return null;
                }
                return new SeriesDiscoverTabPageNode();
            case 883457358:
                if (!str.equals("page_feed")) {
                    return null;
                }
                return new MainPageNode(c19eg);
            default:
                return null;
        }
    }
}
