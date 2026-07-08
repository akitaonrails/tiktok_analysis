package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.inbox.ab.InboxSkylightLoadMoreConfig;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.0riG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1599020riG {
    public static final C1599020riG LIZ = new C1599020riG();
    public static final AtomicInteger LIZIZ = new AtomicInteger(0);
    public static final AtomicReference<C09AE> LIZJ = new AtomicReference<>(null);

    public static void LIZIZ() {
        C09AE andSet = LIZJ.getAndSet(null);
        if (andSet != null) {
            andSet.LIZIZ(null);
        }
        int andSet2 = LIZIZ.getAndSet(0);
        if (andSet2 > 0) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resetConsecutiveCount from ");
            sbLIZ.append(andSet2);
            C1720106oR.LJI("PostRefreshAutoLoad", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LIZ(SkylightListViewModel skylightListViewModel, InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod) {
        if (!C1599090riN.LIZ()) {
            return;
        }
        InboxSkylightLoadMoreConfig inboxSkylightLoadMoreConfigLIZIZ = C1599090riN.LIZIZ();
        if (!inboxSkylightLoadMoreConfigLIZIZ.enablePostRefreshAutoLoad) {
            return;
        }
        int i = inboxSkylightLoadMoreConfigLIZIZ.frontNNoStoryAutoLoadMoreN;
        List<Aweme> listExtractStories = inboxHorizontalTopListCombinePod.extractStories();
        if (listExtractStories == null) {
            listExtractStories = C13BV.INSTANCE;
        }
        List listLL = C13LP.LL(listExtractStories, i);
        if (!(listLL instanceof Collection) || !listLL.isEmpty()) {
            Iterator it2 = listLL.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                if ((!C729510SjV.LJIILJJIL(AwemeExtKt.getAuthorUid((Aweme) it2.next()))) && (i2 = i2 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
            if (i2 > 0) {
                return;
            }
        }
        if (C1206204nk.LIZ()) {
            if (skylightListViewModel.LLJJJJLIIL.length() <= 0) {
                return;
            }
        } else if (inboxHorizontalTopListCombinePod.pageToken() == null) {
            return;
        }
        AtomicInteger atomicInteger = LIZIZ;
        int iIncrementAndGet = atomicInteger.incrementAndGet();
        if (iIncrementAndGet > inboxSkylightLoadMoreConfigLIZIZ.maxConsecutivePostRefreshAutoLoad) {
            atomicInteger.decrementAndGet();
            int i3 = C2187451AjH.LIZ;
            C1720106oR.LJI("PostRefreshAutoLoad", "skip post-refresh auto load: consecutiveCount=" + iIncrementAndGet + " > max=" + inboxSkylightLoadMoreConfigLIZIZ.maxConsecutivePostRefreshAutoLoad);
            return;
        }
        AtomicReference<C09AE> atomicReference = LIZJ;
        C09AE andSet = atomicReference.getAndSet(null);
        if (andSet != null) {
            andSet.LIZIZ(null);
            atomicInteger.decrementAndGet();
        }
        long j = inboxSkylightLoadMoreConfigLIZIZ.noScrollAutoDelayMs;
        int i4 = C2187451AjH.LIZ;
        C1720106oR.LJI("PostRefreshAutoLoad", "schedule post-refresh auto load in " + j + "ms, consecutiveCount=" + iIncrementAndGet);
        atomicReference.set(C23250099c.LIZLLL(skylightListViewModel.getAssemVMScope(), null, null, new C1599030riH(j, skylightListViewModel, null), 3));
    }
}
