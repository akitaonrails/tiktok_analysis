package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.userstory.mine.MineStoryFullSnapshot;
import com.ss.android.ugc.aweme.story.userstory.mine.MineStoryLightSnapshot;
import com.ss.android.ugc.aweme.story.userstory.mine.StoryEntrySnapshot;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06UY, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06UY {
    public static final C06UY LIZ = new C06UY();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1344));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1342));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1343));
    public static final C054G LJ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    public static final AtomicReference<String> LJFF = new AtomicReference<>(null);
    public static final AtomicReference<String> LJI = new AtomicReference<>(null);
    public static final AtomicLong LJII = new AtomicLong(0);
    public static final AtomicReference<C09AE> LJIIIIZZ = new AtomicReference<>(null);
    public static final AtomicReference<MineStoryLightSnapshot> LJIIIZ = new AtomicReference<>(null);
    public static final AtomicReference<MineStoryFullSnapshot> LJIIJ = new AtomicReference<>(null);

    public static Aweme LIZ(String str) {
        Object c098200Yq;
        Object c098200Yq2;
        UserStory userStory;
        List<Aweme> stories;
        List<Aweme> stories2;
        List<Aweme> stories3;
        try {
            c098200Yq = ((Keva) LIZJ.getValue()).getString(str, "");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str2 = (String) c098200Yq;
        if (str2 == null || str2.length() == 0) {
            return null;
        }
        try {
            c098200Yq2 = (MineStoryFullSnapshot) ((Gson) LIZLLL.getValue()).LJII(str2, MineStoryFullSnapshot.class);
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq2);
        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
            c098200Yq2 = null;
        }
        MineStoryFullSnapshot mineStoryFullSnapshot = (MineStoryFullSnapshot) c098200Yq2;
        if (mineStoryFullSnapshot == null || !Intrinsics.LJFF(mineStoryFullSnapshot.uid, str)) {
            return null;
        }
        long j = mineStoryFullSnapshot.savedAtMs;
        long j2 = C1615106Ub.LIZ().diskCacheTtlInMs;
        if (j2 > 0 && System.currentTimeMillis() - j > j2) {
            C23250099c.LIZLLL(LJ, null, null, new C1314005Cg(str, null), 3);
            return null;
        }
        Aweme aweme = mineStoryFullSnapshot.aweme;
        if (aweme == null) {
            return null;
        }
        if (aweme.getAuthor() == null) {
            aweme.setAuthor(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser());
        }
        String aid = aweme.getAid();
        if (aid == null || aid.length() == 0) {
            aweme.setAid(str);
        }
        if (aweme.getUserStory() == null || (userStory = aweme.getUserStory()) == null || (stories = userStory.getStories()) == null || stories.isEmpty()) {
            return null;
        }
        UserStory userStory2 = aweme.getUserStory();
        if (userStory2 != null && (stories3 = userStory2.getStories()) != null) {
            for (Aweme aweme2 : stories3) {
                if (aweme2.getAuthor() == null) {
                    aweme2.setAuthor(aweme.getAuthor());
                }
            }
        }
        UserStory userStory3 = aweme.getUserStory();
        if (userStory3 != null && (stories2 = userStory3.getStories()) != null) {
            stories2.size();
        }
        return aweme;
    }

    public static Aweme LIZIZ(String str) {
        boolean z;
        Object c098200Yq;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        Object obj = null;
        if (z || Intrinsics.LJFF(LJI.getAndSet(str), str)) {
            return null;
        }
        try {
            c098200Yq = LIZ(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (Aweme) obj;
    }

    public static Aweme LIZJ(String str) {
        Object c098200Yq;
        Object c098200Yq2;
        Aweme aweme = null;
        if (Intrinsics.LJFF(LJFF.getAndSet(str), str)) {
            return null;
        }
        try {
            c098200Yq = ((Keva) LIZIZ.getValue()).getString(str, "");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str2 = (String) c098200Yq;
        if (str2 != null && str2.length() != 0) {
            try {
                c098200Yq2 = (MineStoryLightSnapshot) ((Gson) LIZLLL.getValue()).LJII(str2, MineStoryLightSnapshot.class);
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq2);
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                c098200Yq2 = null;
            }
            MineStoryLightSnapshot mineStoryLightSnapshot = (MineStoryLightSnapshot) c098200Yq2;
            if (mineStoryLightSnapshot != null && Intrinsics.LJFF(mineStoryLightSnapshot.uid, str)) {
                long j = mineStoryLightSnapshot.savedAtMs;
                long j2 = C1615106Ub.LIZ().diskCacheTtlInMs;
                if (j2 > 0 && System.currentTimeMillis() - j > j2) {
                    C23250099c.LIZLLL(LJ, null, null, new C1313805Ce(str, null), 3);
                    return null;
                }
                if (!mineStoryLightSnapshot.stories.isEmpty()) {
                    User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
                    aweme = new Aweme();
                    aweme.setAid(str);
                    aweme.setAuthor(curUser);
                    aweme.setAwemeType(40);
                    aweme.setIsTikTokStory(true);
                    List<StoryEntrySnapshot> list = mineStoryLightSnapshot.stories;
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    for (StoryEntrySnapshot storyEntrySnapshot : list) {
                        Aweme aweme2 = new Aweme();
                        aweme2.setAid(storyEntrySnapshot.aid);
                        aweme2.setAuthor(curUser);
                        aweme2.setCreateTime(storyEntrySnapshot.createTime);
                        aweme2.setIsTikTokStory(true);
                        aweme2.setStory(new Story(0L, storyEntrySnapshot.viewed, 0L, null, 0L, false, false, false, false, false));
                        arrayList.add(aweme2);
                    }
                    ArrayList arrayList2 = new ArrayList(arrayList);
                    long j3 = mineStoryLightSnapshot.totalCount;
                    aweme.setUserStory(new UserStory(arrayList2, j3, 0L, false, 0L, 0L, false, false, 0L, false, null, null, false, null, j3, new UserStoryCurrentInfo(null, null, 0), false, false, new UserStoryCurrentInfo(-1, null, 0), (int) 0, false, 0L, null, false));
                }
            }
        }
        return aweme;
    }

    public static void LIZLLL(String str) {
        AtomicReference<String> atomicReference = LJFF;
        while (!atomicReference.compareAndSet(str, null) && atomicReference.get() == str) {
        }
        AtomicReference<String> atomicReference2 = LJI;
        while (!atomicReference2.compareAndSet(str, null) && atomicReference2.get() == str) {
        }
        C09AE andSet = LJIIIIZZ.getAndSet(null);
        if (andSet != null) {
            andSet.LIZIZ(null);
        }
        C23250099c.LIZLLL(LJ, null, null, new C1313905Cf(str, null), 3);
    }
}
