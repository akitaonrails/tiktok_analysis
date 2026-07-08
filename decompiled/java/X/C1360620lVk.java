package X;

import Y.AComparatorS518S0100000_21;
import Y.ARunnableS97S0000000_21;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.affinity.model.SocialAffinityItem;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.repostfeed.model.RepostFeedEntranceResponse;
import com.ss.android.ugc.aweme.repostfeed.model.RepostNewContentMeta;
import com.ss.android.ugc.aweme.repostfeed.model.RepostNewContentUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lVk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1360620lVk {
    public static C1360650lVn LIZ;
    public static C1360650lVn LIZIZ;
    public static volatile boolean LJFF;
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(538));
    public static final BPEAHandler LIZLLL = new BPEAHandler(Looper.getMainLooper());
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(537));
    public static final ARunnableS97S0000000_21 LJI = new ARunnableS97S0000000_21(1);

    public static Pair LIZ(RepostFeedEntranceResponse repostFeedEntranceResponse) {
        List<RepostNewContentUser> listLJLLLL;
        if (ComplianceServiceProvider.LJI().LJIIJ(false) && Intrinsics.LJFF(ComplianceServiceProvider.LJI().LJJIII().getValue(), Boolean.TRUE)) {
            listLJLLLL = repostFeedEntranceResponse.newContentUsers;
            if (listLJLLLL == null) {
                listLJLLLL = C13BV.INSTANCE;
            }
        } else {
            listLJLLLL = repostFeedEntranceResponse.newContentUsers;
            if (listLJLLLL == null) {
                listLJLLLL = C13BV.INSTANCE;
            }
            Map<String, SocialAffinityItem> mapLIZIZ = C1610960s1W.LIZIZ.LIZIZ("repost_sort");
            if (mapLIZIZ != null) {
                listLJLLLL = C13LP.LJLLLL(new AComparatorS518S0100000_21(mapLIZIZ, 9), listLJLLLL);
            }
        }
        if (listLJLLLL.size() >= 3) {
            listLJLLLL = listLJLLLL.subList(0, 3);
        }
        ArrayList arrayList = new ArrayList();
        for (RepostNewContentUser repostNewContentUser : listLJLLLL) {
            List<RepostNewContentMeta> list = repostFeedEntranceResponse.newContentMetas;
            if (list != null) {
                Iterator<RepostNewContentMeta> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        RepostNewContentMeta next = it2.next();
                        if (Intrinsics.LJFF(next.itemId, repostNewContentUser.itemId)) {
                            if (next != null) {
                                arrayList.add(next);
                            }
                        }
                    }
                }
            }
        }
        return new Pair(listLJLLLL, arrayList);
    }

    public static void LIZIZ(EnumC1360550lVd enumC1360550lVd) {
        if (!C298720BnK.LIZ()) {
            return;
        }
        if (((Number) C298720BnK.LIZ.getValue()).intValue() == 1) {
            C1360680lVq.LIZ.getClass();
            if (C1360680lVq.LIZLLL()) {
                return;
            }
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1360630lVl(enumC1360550lVd, null), 3);
    }
}
