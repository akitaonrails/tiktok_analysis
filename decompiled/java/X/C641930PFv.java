package X;

import com.ss.android.ugc.aweme.search.SearchTabInfo;
import com.ss.android.ugc.aweme.search.SearchTabList;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0PFv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C641930PFv {
    public static final SearchTabList LIZ = new SearchTabList(LIZ(), new ArrayList());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C641940PFw());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C641830PFl());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C641920PFu());

    public static List LIZ() {
        return C1697810uHb.LJIIJJI(new SearchTabInfo("general", -1, false, false), new SearchTabInfo("video", -1, false, false), new SearchTabInfo("photos", -1, false, false), new SearchTabInfo("user", -1, false, false), new SearchTabInfo("music", -1, false, false), new SearchTabInfo("shop", -1, false, false), new SearchTabInfo("store", -1, false, false), new SearchTabInfo("live", -1, false, false), new SearchTabInfo("place", -1, false, false), new SearchTabInfo("hashtag", -1, false, false));
    }

    public static Map LIZIZ() {
        return C2097608Jq.LJIIIIZZ(new Pair("general", new SearchTabInfo("general", -1, false, false)), new Pair("video", new SearchTabInfo("video", -1, false, false)), new Pair("photos", new SearchTabInfo("photos", -1, false, false)), new Pair("user", new SearchTabInfo("user", -1, false, false)), new Pair("music", new SearchTabInfo("music", -1, false, false)), new Pair("shop", new SearchTabInfo("shop", -1, false, false)), new Pair("live", new SearchTabInfo("live", -1, false, false)), new Pair("place", new SearchTabInfo("place", -1, false, false)), new Pair("hashtag", new SearchTabInfo("hashtag", -1, false, false)));
    }

    public static Map LIZJ() {
        return (Map) LIZLLL.getValue();
    }

    public static SearchTabList LIZLLL() {
        return (SearchTabList) LIZIZ.getValue();
    }
}
