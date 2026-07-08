package X;

import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.TabItem;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0wHD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1774450wHD implements InterfaceC1768150w73 {
    public final C1774480wHG LL;
    public List<TabItem> LLILLJJLI = C13BV.INSTANCE;

    public C1774450wHD(C1774480wHG c1774480wHG) {
        this.LL = c1774480wHG;
    }

    public final Map<String, Object> LIZ(int i) {
        TabItem tabItem = (TabItem) C13LP.LJJJLZIJ(i, this.LLILLJJLI);
        if (tabItem != null) {
            return C2097608Jq.LJIIIIZZ(new Pair("channel_tag", tabItem.channelTag), new Pair("personal_tab_pool_id", tabItem.personalTabPoolId));
        }
        return null;
    }
}
