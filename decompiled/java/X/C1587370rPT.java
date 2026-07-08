package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.ui.FriendsFeedFragmentPanel;
import java.util.List;

/* JADX INFO: renamed from: X.0rPT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1587370rPT {
    public static int LIZIZ;
    public static boolean LIZJ;
    public static int LIZLLL;
    public static final C1587370rPT LIZ = new C1587370rPT();
    public static int LJ = -1;

    public static int LIZ(FriendsFeedFragmentPanel friendsFeedFragmentPanel) {
        int size;
        List<Aweme> listFg;
        C0SR4 c0sr4 = friendsFeedFragmentPanel.LLJL;
        if (c0sr4 != null && (listFg = c0sr4.Fg()) != null) {
            size = listFg.size();
        } else {
            size = 0;
        }
        int i = LJ;
        if (i < 0) {
            LJ = 0;
        } else if (i > size) {
            LJ = size;
        }
        return LJ;
    }
}
