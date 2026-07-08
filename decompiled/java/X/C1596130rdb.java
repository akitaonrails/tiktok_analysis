package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUsersResponse;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.ISkylightMafService;
import com.ss.android.ugc.aweme.story.inbox.SkylightStoryUser;
import com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rdb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1596130rdb {
    public static final C1596130rdb LIZ = new C1596130rdb();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(510));

    public static ConcurrentHashMap LIZLLL() {
        return (ConcurrentHashMap) LIZIZ.getValue();
    }

    public static int LIZJ(int i) {
        CopyOnWriteArrayList<Aweme> copyOnWriteArrayList;
        String uid;
        UserStory userStory;
        C1596120rda c1596120rda = (C1596120rda) LIZLLL().get(Integer.valueOf(i));
        if (c1596120rda == null || (copyOnWriteArrayList = c1596120rda.LIZ) == null || copyOnWriteArrayList.isEmpty()) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme : copyOnWriteArrayList) {
            Aweme aweme2 = aweme;
            if (aweme2 == null || (userStory = aweme2.getUserStory()) == null || !userStory.getAllViewed()) {
                User author = aweme2.getAuthor();
                if (author != null) {
                    uid = author.getUid();
                } else {
                    uid = null;
                }
                if (!C729510SjV.LJIILJJIL(uid) && !C729510SjV.LJJII(aweme2)) {
                    arrayList.add(aweme);
                }
            }
        }
        return arrayList.size();
    }

    public static int LJ(int i) {
        C1596120rda c1596120rda = (C1596120rda) LIZLLL().get(Integer.valueOf(i));
        if (c1596120rda != null) {
            return c1596120rda.LJII;
        }
        return 0;
    }

    public static C1596120rda LJFF(int i) {
        return (C1596120rda) LIZLLL().get(Integer.valueOf(i));
    }

    public static int LJI(int i) {
        String uid;
        Aweme next;
        String uid2;
        User author;
        C1596120rda c1596120rda = (C1596120rda) LIZLLL().get(Integer.valueOf(i));
        int i2 = 0;
        if (c1596120rda == null) {
            return 0;
        }
        CopyOnWriteArrayList<Aweme> copyOnWriteArrayList = c1596120rda.LIZ;
        CopyOnWriteArrayList<SkylightStoryUser> copyOnWriteArrayList2 = c1596120rda.LIZIZ;
        if (!copyOnWriteArrayList.isEmpty() && !copyOnWriteArrayList2.isEmpty()) {
            int i3 = c1596120rda.LJ;
            if (i3 != -1) {
                return i3;
            }
            for (SkylightStoryUser skylightStoryUser : copyOnWriteArrayList2) {
                Iterator<Aweme> it2 = copyOnWriteArrayList.iterator();
                while (true) {
                    uid = null;
                    if (it2.hasNext()) {
                        next = it2.next();
                        Aweme aweme = next;
                        if (aweme != null && (author = aweme.getAuthor()) != null) {
                            uid2 = author.getUid();
                        } else {
                            uid2 = null;
                        }
                        if (Intrinsics.LJFF(uid2, String.valueOf(skylightStoryUser.userId))) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                Aweme aweme2 = next;
                if (aweme2 != null) {
                    User author2 = aweme2.getAuthor();
                    if (author2 != null) {
                        uid = author2.getUid();
                    }
                    if (!C729510SjV.LJIILJJIL(uid) && !C729510SjV.LJJII(aweme2) && !Intrinsics.LJFF(skylightStoryUser.allViewed, Boolean.TRUE)) {
                        i2++;
                    }
                }
            }
            c1596120rda.LJ = i2;
        }
        return i2;
    }

    public static boolean LJII(int i) {
        CopyOnWriteArrayList<Aweme> copyOnWriteArrayList;
        C1596120rda c1596120rda = (C1596120rda) LIZLLL().get(Integer.valueOf(i));
        if (c1596120rda == null || (copyOnWriteArrayList = c1596120rda.LIZ) == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        return !C729510SjV.LJJII(C1618440sDa.LIZIZ.LJJLIIIJLJLI().LJIIIIZZ());
    }

    public static boolean LJIIIIZZ(int i) {
        C1596120rda c1596120rda = (C1596120rda) LIZLLL().get(Integer.valueOf(i));
        if (c1596120rda == null) {
            return false;
        }
        return c1596120rda.LJI;
    }

    public static boolean LJIIIZ(int i) {
        C1596120rda c1596120rda = (C1596120rda) LIZLLL().get(Integer.valueOf(i));
        if (c1596120rda != null) {
            return c1596120rda.LJFF;
        }
        return false;
    }

    public static void LIZ(int i, InterfaceC1594910rbd interfaceC1594910rbd) {
        C1596120rda c1596120rda = (C1596120rda) LIZLLL().get(Integer.valueOf(i));
        if (c1596120rda == null) {
            return;
        }
        if (interfaceC1594910rbd instanceof C1596360rdy) {
            if (c1596120rda.LIZ.remove(((C1596360rdy) interfaceC1594910rbd).LLILLJJLI)) {
                c1596120rda.LJ = -1;
                int i2 = c1596120rda.LIZLLL;
                if (i2 > 0) {
                    c1596120rda.LIZLLL = i2 - 1;
                    return;
                }
                return;
            }
            return;
        }
        if (interfaceC1594910rbd instanceof InterfaceC1595940rdI) {
            c1596120rda.LJII--;
            if (C10EU.LJIIL(((InterfaceC1595940rdI) interfaceC1594910rbd).LLIILZL().getUser())) {
                c1596120rda.LJIIIIZZ--;
            } else {
                c1596120rda.LJIIIZ--;
            }
            C1595340rcK.LIZ.getClass();
            ConcurrentHashMap<Integer, List<InterfaceC1891350zJl>> concurrentHashMap = C1595340rcK.LIZIZ;
            List<InterfaceC1891350zJl> list = concurrentHashMap.get(Integer.valueOf(i));
            if (list != null) {
                ArrayList arrayList = new ArrayList(list);
                if (arrayList.remove(interfaceC1594910rbd)) {
                    concurrentHashMap.put(Integer.valueOf(i), arrayList);
                }
            }
        }
    }

    @InterfaceC1294060jmO
    public static void LIZIZ(int i, Aweme aweme) {
        C1596120rda c1596120rda = (C1596120rda) LIZLLL().get(Integer.valueOf(i));
        if (c1596120rda == null) {
            return;
        }
        c1596120rda.LIZ.remove(aweme);
        c1596120rda.LJ = -1;
        for (SkylightStoryUser skylightStoryUser : c1596120rda.LIZIZ) {
            if (Intrinsics.LJFF(String.valueOf(skylightStoryUser.userId), C729510SjV.LJIIIZ(aweme))) {
                c1596120rda.LIZIZ.remove(skylightStoryUser);
            }
        }
    }

    public static void LJIIJJI(int i, int i2) {
        C1596120rda c1596120rda = (C1596120rda) LIZLLL().get(Integer.valueOf(i));
        if (c1596120rda == null) {
            return;
        }
        c1596120rda.LJII = i2;
    }

    public static void LJIILIIL(int i, FollowingInterestUsersResponse followingInterestUsersResponse) {
        int size;
        int i2;
        LIZ.getClass();
        C1596120rda c1596120rda = (C1596120rda) LIZLLL().get(Integer.valueOf(i));
        if (c1596120rda == null) {
            return;
        }
        List<FollowingInterestUser> followingInterestUsers = followingInterestUsersResponse.getFollowingInterestUsers();
        int i3 = 0;
        if (followingInterestUsers != null) {
            size = followingInterestUsers.size();
        } else {
            size = 0;
        }
        LJIIJJI(i, size);
        List<FollowingInterestUser> followingInterestUsers2 = followingInterestUsersResponse.getFollowingInterestUsers();
        if (followingInterestUsers2 != null && !followingInterestUsers2.isEmpty()) {
            Iterator<FollowingInterestUser> it2 = followingInterestUsers2.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                if (C10EU.LJIIL(it2.next().getUser()) && (i2 = i2 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        } else {
            i2 = 0;
        }
        List<FollowingInterestUser> followingInterestUsers3 = followingInterestUsersResponse.getFollowingInterestUsers();
        if (followingInterestUsers3 != null && !followingInterestUsers3.isEmpty()) {
            Iterator<FollowingInterestUser> it3 = followingInterestUsers3.iterator();
            while (it3.hasNext()) {
                if ((!C10EU.LJIIL(it3.next().getUser())) && (i3 = i3 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        LJIIL(i, i2, i3);
        c1596120rda.LJIIJ = followingInterestUsersResponse.getSkylightStrategy();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0092 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILJJIL(boolean r19, com.ss.android.ugc.aweme.bean.MixRankSkylightResponse r20) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1596130rdb.LJIILJJIL(boolean, com.ss.android.ugc.aweme.bean.MixRankSkylightResponse):void");
    }

    public static List LJIIJ(int i, boolean z, List list) {
        boolean z2;
        boolean z3;
        ArrayList arrayList = new ArrayList();
        if (z && C1601110rld.LIZ() && (list == null || list.isEmpty() || !C729510SjV.LJIILJJIL(AwemeExtKt.getAuthorUid((Aweme) ListProtector.get(list, 0))))) {
            ListProtector.add(arrayList, 0, new C1596360rdy(true, C1618440sDa.LIZIZ.LJJLIIIJLJLI().LJIIIIZZ()));
        }
        ISkylightMafService iSkylightMafService = (ISkylightMafService) PluggableExtentionKt.pluggableSpi$default(ISkylightMafService.class, false, false, false, 14, null);
        if (iSkylightMafService != null && iSkylightMafService.LIZ(i)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (list != null) {
            LIZ.getClass();
            ISkylightMafService iSkylightMafService2 = (ISkylightMafService) PluggableExtentionKt.pluggableSpi$default(ISkylightMafService.class, false, false, false, 14, null);
            ArrayList<Aweme> arrayList2 = new ArrayList();
            for (Object obj : list) {
                Aweme aweme = (Aweme) obj;
                boolean zLJIILJJIL = C729510SjV.LJIILJJIL(C729510SjV.LJIIIZ(aweme));
                boolean z4 = !C729510SjV.LJJII(aweme);
                if (z2 && iSkylightMafService2 != null && iSkylightMafService2.LIZLLL(aweme.getAuthor())) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (zLJIILJJIL || z4) {
                    if (z3) {
                        arrayList2.add(obj);
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            for (Aweme aweme2 : arrayList2) {
                arrayList3.add(new C1596360rdy(C729510SjV.LJIILJJIL(AwemeExtKt.getAuthorUid(aweme2)), aweme2));
            }
            arrayList.addAll(new ArrayList(arrayList3));
        }
        return arrayList;
    }

    public static void LJIIL(int i, int i2, int i3) {
        C1596120rda c1596120rda = (C1596120rda) LIZLLL().get(Integer.valueOf(i));
        if (c1596120rda == null) {
            return;
        }
        c1596120rda.LJIIIIZZ = i2;
        c1596120rda.LJIIIZ = i3;
    }

    public static void LJIILL(int i, boolean z, StoryGetFeedByPageResponse storyGetFeedByPageResponse) {
        LJIILLIIL(i, z, storyGetFeedByPageResponse.getAwemes(), storyGetFeedByPageResponse.getSkylightStoryUsers(), (int) storyGetFeedByPageResponse.getTotalCnt(), storyGetFeedByPageResponse.getHasMore(), String.valueOf(storyGetFeedByPageResponse.getCursor()), storyGetFeedByPageResponse.getSkylightSort(), storyGetFeedByPageResponse.getSkylightAutoDisplay());
    }

    public static void LJIILLIIL(int i, boolean z, List list, List list2, int i2, boolean z2, String str, int i3, Boolean bool) {
        C1596120rda c1596120rda = (C1596120rda) LIZLLL().get(Integer.valueOf(i));
        if (c1596120rda == null) {
            return;
        }
        CopyOnWriteArrayList<Aweme> copyOnWriteArrayList = c1596120rda.LIZ;
        CopyOnWriteArrayList<SkylightStoryUser> copyOnWriteArrayList2 = c1596120rda.LIZIZ;
        if (z) {
            copyOnWriteArrayList.clear();
            copyOnWriteArrayList2.clear();
            c1596120rda.LIZJ.clear();
            c1596120rda.LJ = -1;
        }
        if (list != null) {
            copyOnWriteArrayList.addAll(C13LP.LJJJJLI(list));
        }
        if (list2 != null) {
            copyOnWriteArrayList2.addAll(list2);
        }
        c1596120rda.LIZLLL = i2;
        if (LJII(i) && z) {
            c1596120rda.LIZLLL--;
        }
        c1596120rda.LJIIJJI = z2;
        c1596120rda.LJIIL = str;
        c1596120rda.LJIILIIL = i3;
        c1596120rda.LJIILJJIL = bool;
    }
}
