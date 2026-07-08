package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.Map;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0Puf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C659990Puf {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(588));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(589));

    public static Map LIZIZ() {
        return (Map) LIZIZ.getValue();
    }

    public static Object LIZ(InterfaceC660500PvU interfaceC660500PvU, SearchMixFeed searchMixFeed, Aweme aweme) {
        ISearchVideoBottomAnchorProtocol iSearchVideoBottomAnchorProtocol;
        if (interfaceC660500PvU == null) {
            return null;
        }
        Object obj = LIZIZ().get(interfaceC660500PvU);
        if (!(obj instanceof ISearchVideoBottomAnchorProtocol) || (iSearchVideoBottomAnchorProtocol = (ISearchVideoBottomAnchorProtocol) obj) == null) {
            return null;
        }
        return iSearchVideoBottomAnchorProtocol.qX1(aweme, searchMixFeed);
    }
}
