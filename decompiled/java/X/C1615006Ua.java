package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.userstory.mine.MineStoryFullSnapshot;
import com.ss.android.ugc.aweme.story.userstory.mine.MineStoryLightSnapshot;
import com.ss.android.ugc.aweme.story.userstory.mine.StoryEntrySnapshot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06Ua, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1615006Ua {
    public static volatile Aweme LIZIZ;
    public static final C01GW LJFF;
    public static final C1615006Ua LIZ = new C1615006Ua();
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public static final AtomicBoolean LJ = new AtomicBoolean(false);

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1341));
        LJFF = c01gwLIZIZ;
        C0XQ7.LJFF().LJJIFFI((InterfaceC427710Gpt) c01gwLIZIZ.getValue());
    }

    public static Aweme LIZIZ() {
        Aweme aweme = new Aweme();
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        String uid = curUser.getUid();
        if (uid == null) {
            uid = "";
        }
        aweme.setAid(uid);
        aweme.setAuthor(curUser);
        aweme.setAwemeType(40);
        aweme.setUserStory(new UserStory(new ArrayList(), 0L, 0L, false, 0L, 0L, false, false, 0L, false, null, null, false, null, 0L, new UserStoryCurrentInfo(null, null, 0), true, false, new UserStoryCurrentInfo(-1, null, 0), (int) 0, false, 0L, null, false));
        aweme.setIsTikTokStory(true);
        return aweme;
    }

    public static boolean LJ() {
        Aweme aweme;
        UserStory userStory;
        return (LIZLLL.get() || (aweme = LIZIZ) == null || (userStory = aweme.getUserStory()) == null || userStory.getFakeSelfStoryCollection()) ? false : true;
    }

    public static void LIZJ() {
        User author;
        String uid;
        UserStory userStory;
        if (C1615106Ub.LIZIZ()) {
            C06UY c06uy = C06UY.LIZ;
            Aweme aweme = LIZIZ;
            c06uy.getClass();
            if (!C1615106Ub.LIZIZ() || aweme == null || (author = aweme.getAuthor()) == null || (uid = author.getUid()) == null || uid.length() == 0 || (userStory = aweme.getUserStory()) == null || userStory.getFakeAwemeShell() || userStory.getFakeSelfStoryCollection()) {
                return;
            }
            List<Aweme> stories = userStory.getStories();
            if (stories == null || stories.isEmpty()) {
                C06UY.LIZLLL(uid);
                return;
            }
            if (C1615106Ub.LIZLLL()) {
                AtomicReference<MineStoryLightSnapshot> atomicReference = C06UY.LJIIIZ;
                List<Aweme> stories2 = userStory.getStories();
                if (stories2 == null) {
                    stories2 = C13BV.INSTANCE;
                }
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(stories2, 10));
                for (Aweme aweme2 : stories2) {
                    String aid = aweme2.getAid();
                    if (aid == null) {
                        aid = "";
                    }
                    Story story = aweme2.getStory();
                    arrayList.add(new StoryEntrySnapshot(aid, story != null && story.viewed, aweme2.getCreateTime()));
                }
                atomicReference.set(new MineStoryLightSnapshot(uid, userStory.getTotalCount(), arrayList, System.currentTimeMillis()));
            }
            if (C1615106Ub.LIZJ()) {
                C06UY.LJIIJ.set(new MineStoryFullSnapshot(uid, aweme, System.currentTimeMillis()));
            }
            long j = C1615106Ub.LIZ().flushThrottleMs;
            if (j < 0) {
                j = 0;
            }
            long jCurrentTimeMillis = j - (System.currentTimeMillis() - C06UY.LJII.get());
            long j2 = jCurrentTimeMillis >= 0 ? jCurrentTimeMillis : 0L;
            AtomicReference<C09AE> atomicReference2 = C06UY.LJIIIIZZ;
            C09AE andSet = atomicReference2.getAndSet(null);
            if (andSet != null) {
                andSet.LIZIZ(null);
            }
            atomicReference2.set(C23250099c.LIZLLL(C06UY.LJ, null, null, new C06UZ(j2, null), 3));
        }
    }

    public static void LIZ(Aweme aweme) {
        List<Aweme> stories;
        UserStory userStory;
        boolean z;
        UserStory userStory2;
        int size = 0;
        if (!LIZLLL.compareAndSet(true, false)) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("MineStoryDiskCache", "applyFullMergeWithRaceGuard: skip, no longer light-only");
            return;
        }
        UserStory userStory3 = aweme.getUserStory();
        if (userStory3 == null) {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LJI("MineStoryDiskCache", "mergeFullIntoMemory: skip, full.userStory null");
            return;
        }
        List<Aweme> stories2 = userStory3.getStories();
        if (stories2 != null && !stories2.isEmpty()) {
            Aweme aweme2 = LIZIZ;
            String uid = null;
            if (aweme2 == null || (userStory2 = aweme2.getUserStory()) == null || (stories = userStory2.getStories()) == null) {
                stories = C13BV.INSTANCE;
            }
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(stories, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
            Iterator<Aweme> it2 = stories.iterator();
            while (true) {
                String str = "";
                if (!it2.hasNext()) {
                    break;
                }
                Aweme next = it2.next();
                String aid = next.getAid();
                if (aid != null) {
                    str = aid;
                }
                Story story = next.getStory();
                if (story != null && story.viewed) {
                    z = true;
                } else {
                    z = false;
                }
                linkedHashMap.put(str, Boolean.valueOf(z));
            }
            List<Aweme> stories3 = userStory3.getStories();
            if (stories3 != null) {
                for (Aweme aweme3 : stories3) {
                    String aid2 = aweme3.getAid();
                    if (aid2 == null) {
                        aid2 = "";
                    }
                    if (Intrinsics.LJFF(linkedHashMap.get(aid2), Boolean.TRUE)) {
                        Story story2 = aweme3.getStory();
                        if (story2 != null) {
                            story2.setViewed(true);
                        } else {
                            aweme3.setStory(new Story(0L, true, 0L, null, 0L, false, false, false, false, false));
                        }
                    }
                }
            }
            Aweme aweme4 = LIZIZ;
            if (aweme4 != null) {
                userStory = aweme4.getUserStory();
            } else {
                userStory = null;
            }
            LIZIZ = aweme;
            LIZLLL.set(false);
            LIZLLL(userStory3);
            C727150Sfh.LIZLLL.LIZIZ(userStory, userStory3, aweme);
            StringBuilder sb = new StringBuilder("mergeFullIntoMemory: applied, uid=");
            User author = aweme.getAuthor();
            if (author != null) {
                uid = author.getUid();
            }
            sb.append(uid);
            sb.append(", stories=");
            List<Aweme> stories4 = userStory3.getStories();
            if (stories4 != null) {
                size = stories4.size();
            }
            sb.append(size);
            C1720106oR.LJI("MineStoryDiskCache", sb.toString());
            return;
        }
        int i3 = C2187451AjH.LIZ;
        C1720106oR.LJI("MineStoryDiskCache", "mergeFullIntoMemory: skip, full.stories empty");
    }

    public static void LIZLLL(UserStory userStory) {
        List<Aweme> stories;
        if (C1615106Ub.LIZIZ() && userStory != null && (stories = userStory.getStories()) != null && !stories.isEmpty()) {
            LIZJ.set(true);
        }
    }

    public static boolean LJI(UserStory userStory) {
        Aweme aweme;
        UserStory userStory2;
        List<Aweme> stories;
        List<Aweme> stories2;
        if (!C1615106Ub.LIZIZ() || LIZJ.get()) {
            return false;
        }
        if ((userStory != null && (stories2 = userStory.getStories()) != null && !stories2.isEmpty()) || (aweme = LIZIZ) == null || (userStory2 = aweme.getUserStory()) == null || (stories = userStory2.getStories()) == null || !(!stories.isEmpty())) {
            return false;
        }
        return true;
    }

    public static void LJFF(Aweme aweme, String str) {
        List<Aweme> stories;
        Object c098200Yq;
        UserStory userStory = aweme.getUserStory();
        if (userStory == null || (stories = userStory.getStories()) == null || stories.isEmpty()) {
            return;
        }
        boolean z = false;
        int i = 1;
        if (!stories.isEmpty()) {
            Iterator<Aweme> it2 = stories.iterator();
            while (it2.hasNext()) {
                Story story = it2.next().getStory();
                if (story == null || !story.viewed) {
                    z = true;
                    break;
                }
            }
            i = 2;
        } else {
            i = 2;
        }
        try {
            C1605650rsx.LIZIZ.LJIILJJIL(EnumC1615506Uf.STORY, new C727780Sgi(i, Boolean.TRUE, Long.valueOf(System.currentTimeMillis()), null, null, 50));
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pushSocPubStatus: success, uid=");
            sbLIZ.append(str);
            sbLIZ.append(", status=");
            sbLIZ.append(i);
            sbLIZ.append(", hasUnviewed=");
            sbLIZ.append(z);
            C1720106oR.LJI("MineStoryDiskCache", C2188811AlT.LIZIZ(sbLIZ));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("pushSocPubStatus: failed, uid=");
            sbLIZ2.append(str);
            sbLIZ2.append(", ");
            sbLIZ2.append(thM5exceptionOrNullimpl.getClass().getSimpleName());
            sbLIZ2.append(": ");
            sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
            C1720106oR.LJI("MineStoryDiskCache", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }
}
