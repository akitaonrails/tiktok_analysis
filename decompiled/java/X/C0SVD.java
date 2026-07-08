package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS37S2100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SVD, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SVD implements InterfaceC1597970rgZ, InterfaceC497601wk {
    public static final C0SVD LL = new C0SVD();
    public static final CopyOnWriteArrayList<String> LLILLJJLI = new CopyOnWriteArrayList<>();
    public static final ConcurrentHashMap<String, CopyOnWriteArrayList<C0SVE>> LLILLL = new ConcurrentHashMap<>();
    public static final Set<String> LLILZ = new LinkedHashSet();
    public static final C054G LLILZIL = C2296808zG.LIZ(C0PEM.LIZJ);

    @Override // X.InterfaceC1597970rgZ
    public final boolean LIZLLL() {
        return LLILLJJLI.isEmpty();
    }

    @Override // X.InterfaceC1597970rgZ
    public final void LJII() {
        LLILZ.clear();
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        C1DFH c1dfh = C0PEM.LIZ;
        return C2107308Nj.LIZ.plus(C2296908zH.LIZ());
    }

    @Override // X.InterfaceC1597970rgZ
    public final boolean LIZ(String str) {
        if (str == null) {
            return false;
        }
        return LLILLJJLI.contains(str);
    }

    @Override // X.InterfaceC1597970rgZ
    public final StoryGetFeedByPageResponse LJIIIIZZ(StoryGetFeedByPageResponse storyGetFeedByPageResponse) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        ArrayList arrayList;
        if (!C298540Bn2.LIZ() || (copyOnWriteArrayList = LLILLJJLI) == null || copyOnWriteArrayList.isEmpty()) {
            return storyGetFeedByPageResponse;
        }
        List<Aweme> awemes = storyGetFeedByPageResponse.getAwemes();
        if (awemes != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Aweme aweme : awemes) {
                if (!LLILLJJLI.contains(AwemeExtKt.getAuthorUid(aweme))) {
                    arrayList2.add(aweme);
                }
            }
            arrayList = new ArrayList(arrayList2);
        } else {
            arrayList = null;
        }
        return storyGetFeedByPageResponse.copy(arrayList, storyGetFeedByPageResponse.hasMore, storyGetFeedByPageResponse.cursor, storyGetFeedByPageResponse.totalCnt, storyGetFeedByPageResponse.highlightTotalCount, storyGetFeedByPageResponse.skylightStoryUsers, storyGetFeedByPageResponse.isDemotioned, storyGetFeedByPageResponse.userLatestStoryNotes, storyGetFeedByPageResponse.skylightAutoDisplay, storyGetFeedByPageResponse.skylightSort, storyGetFeedByPageResponse.insertCards, storyGetFeedByPageResponse.pageControlToken, storyGetFeedByPageResponse.highlightUsers, storyGetFeedByPageResponse.hasEverPublishedStory);
    }

    @Override // X.InterfaceC1597970rgZ
    public final void LIZJ(String str, String str2) {
        CopyOnWriteArrayList<C0SVE> copyOnWriteArrayList = LLILLL.get(str);
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return;
        }
        try {
            C189200o6.m2constructorimpl(C23250099c.LIZLLL(LLILZIL, null, null, new C01L3("author_list_update", new AwS37S2100000_11(str2, (String) copyOnWriteArrayList, (CopyOnWriteArrayList<C0SVE>) str, (String) 1), null), 3));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        LLILLL.remove(str);
    }

    @Override // X.InterfaceC1597970rgZ
    public final void LJ(int i, String str) {
        if (str == null) {
            return;
        }
        C1717206ny.LIZ(str, LLILLJJLI);
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C610550Nx7(i, str, null), 3);
    }

    @Override // X.InterfaceC1597970rgZ
    public final C09AE LJI(long j, Function0<Unit> function0) {
        return C23250099c.LIZLLL(this, null, null, new C320401Mc(j, function0, null), 3);
    }

    @Override // X.InterfaceC1597970rgZ
    public final void LIZIZ(int i, User user, String str) {
        String uid;
        int i2;
        C0SVE next;
        if (user == null || (uid = user.getUid()) == null) {
            return;
        }
        String accurateRecType = user.getAccurateRecType();
        if (user.getStoryStatus() == 2) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i3 = i2 ^ 1;
        ConcurrentHashMap<String, CopyOnWriteArrayList<C0SVE>> concurrentHashMap = LLILLL;
        if (concurrentHashMap.get(str) == null) {
            concurrentHashMap.put(str, new CopyOnWriteArrayList<>());
        }
        CopyOnWriteArrayList<C0SVE> copyOnWriteArrayList = concurrentHashMap.get(str);
        if (copyOnWriteArrayList == null) {
            return;
        }
        Iterator<C0SVE> it2 = copyOnWriteArrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.LIZ, uid)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C0SVE c0sve = next;
        if (c0sve == null) {
            if (i != 100 && i != 200) {
                return;
            }
            copyOnWriteArrayList.add(new C0SVE(uid, C1697810uHb.LJ(Integer.valueOf(i)), accurateRecType, i3));
            return;
        }
        if (i != 100 && i != 200) {
            c0sve.LIZIZ.add(Integer.valueOf(i));
        }
    }

    @Override // X.InterfaceC1597970rgZ
    public final void LJFF(String str, String str2, EnumC1260930iux enumC1260930iux, User user, String str3, boolean z) {
        if (user == null || !C10EU.LJIILJJIL(user)) {
            return;
        }
        if (C296550Bjp.LIZ() && enumC1260930iux == EnumC1260930iux.SHOW && LLILZ.contains(user.getUid())) {
            return;
        }
        LLILZ.add(user.getUid());
        C1260910iuv c1260910iuv = new C1260910iuv(0);
        c1260910iuv.LJJIJLIJ(str);
        c1260910iuv.LJJIL(str2);
        c1260910iuv.LJJLIIIJJI = enumC1260930iux;
        c1260910iuv.LJJJJZI(user);
        c1260910iuv.LJJJLL = user.getFollowerStatus();
        if (C296550Bjp.LIZ()) {
            c1260910iuv.LJJJJLI(str3);
            if (!C1533950q1J.LJ(user.getAccurateRecType()) || z) {
                c1260910iuv.LJJJJZ(EnumC1260920iuw.STORY);
            } else {
                c1260910iuv.LJJJJZ(EnumC1260920iuw.CARD);
            }
        } else {
            c1260910iuv.LJJJJZ(EnumC1260920iuw.STORY);
        }
        c1260910iuv.LJIILJJIL();
    }
}
