package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.arch.SeriesFeedResp;
import com.ss.android.ugc.aweme.network.INetwork;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedService;
import com.ss.android.ugc.aweme.series.feed.tab.feed.MiniDramaTabCacheWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r8H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1576710r8H {
    public static final boolean LIZ(Long l, long j, Object obj) {
        String aid;
        INetwork iNetwork;
        long jCurrentTimeMillis;
        MiniDramaTabCacheWrapper miniDramaTabCacheWrapper;
        List<? extends Aweme> list;
        String aid2;
        InterfaceC1577280r9C interfaceC1577280r9CLIZ;
        Aweme awemeLJIILLIIL;
        MiniDramaTabCacheWrapper miniDramaTabCacheWrapper2;
        SeriesFeedResp seriesFeedResp;
        List<? extends Aweme> list2;
        Aweme aweme;
        boolean z = obj instanceof MiniDramaTabCacheWrapper;
        Set setLLIIJI = null;
        if (!z || (miniDramaTabCacheWrapper2 = (MiniDramaTabCacheWrapper) obj) == null || (seriesFeedResp = miniDramaTabCacheWrapper2.resp) == null || (list2 = seriesFeedResp.feedItemList) == null || (aweme = (Aweme) C13LP.LJJJLL(list2)) == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        if (aid.length() > 0) {
            ISeriesFeedService iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ();
            if (iSeriesFeedServiceLIZIZ != null && (interfaceC1577280r9CLIZ = iSeriesFeedServiceLIZIZ.LIZ()) != null && (awemeLJIILLIIL = interfaceC1577280r9CLIZ.LJIILLIIL()) != null) {
                aid2 = awemeLJIILLIIL.getAid();
            } else {
                aid2 = null;
            }
            if (Intrinsics.LJFF(aid, aid2)) {
                C1155310gAb.LIZ.getClass();
                C1155310gAb.LIZJ();
                return true;
            }
        }
        if (!C298310Bmf.LIZ() && (iNetwork = (INetwork) PluggableExtentionKt.pluggableSpi$default(INetwork.class, false, false, false, 14, null)) != null) {
            jCurrentTimeMillis = iNetwork.LIZIZ();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        if (l != null) {
            long jLongValue = l.longValue();
            if (jLongValue != 0) {
                long j2 = jCurrentTimeMillis - jLongValue;
                if (0 <= j2 && j2 <= j) {
                    return true;
                }
                C1155310gAb.LIZ.getClass();
                if (!C1155310gAb.LIZJ() || !z || (miniDramaTabCacheWrapper = (MiniDramaTabCacheWrapper) obj) == null) {
                    return false;
                }
                Set<String> set = miniDramaTabCacheWrapper.LIZ;
                SeriesFeedResp seriesFeedResp2 = miniDramaTabCacheWrapper.resp;
                if (seriesFeedResp2 != null && (list = seriesFeedResp2.feedItemList) != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<? extends Aweme> it2 = list.iterator();
                    while (it2.hasNext()) {
                        String aid3 = it2.next().getAid();
                        if (aid3 != null) {
                            arrayList.add(aid3);
                        }
                    }
                    setLLIIJI = C13LP.LLIIJI(arrayList);
                }
                if (set != null && !set.isEmpty()) {
                    if (setLLIIJI != null && !setLLIIJI.isEmpty()) {
                        if (set.containsAll(setLLIIJI)) {
                            return true;
                        }
                        C15442062u.LJII(setLLIIJI, set);
                    }
                } else if (setLLIIJI != null) {
                    setLLIIJI.size();
                }
                return false;
            }
        }
        return false;
    }
}
