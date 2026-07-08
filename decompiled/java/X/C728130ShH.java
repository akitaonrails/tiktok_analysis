package X;

import Y.ARunnableS16S1100000_11;
import Y.AkS41S1000000_11;
import android.util.LruCache;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.model.UserStoriesResponse;
import com.ss.android.ugc.aweme.story.userstory.mine.MineUserStoryFetcher;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;

/* JADX INFO: renamed from: X.0ShH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C728130ShH implements InterfaceC728100ShE {
    public static final C728130ShH LIZ;
    public static final C01GW LIZIZ;
    public static final C01GW LIZJ;
    public static final C01GW LIZLLL;
    public static String LJ;

    static {
        C728130ShH c728130ShH = new C728130ShH();
        LIZ = c728130ShH;
        LIZIZ = C452501pT.LIZIZ(new C728190ShN());
        LIZJ = C452501pT.LIZIZ(new C728120ShG());
        LIZLLL = C452501pT.LIZIZ(new C728170ShL());
        C622680Oba.LIZJ(c728130ShH);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C2450209iu(null), 3);
        C0S78.LIZJ(AFwS198S0000000_11.get$arr$(379), true);
    }

    public static C727880Sgs LJIIJ() {
        return (C727880Sgs) LIZJ.getValue();
    }

    @Override // X.InterfaceC728100ShE
    public final Aweme LJIIIIZZ() {
        ((C729860Sk4) LIZLLL.getValue()).LLILLL.LIZJ().getClass();
        return MineUserStoryFetcher.LIZ();
    }

    @Override // X.InterfaceC728100ShE
    public final void clear() {
        ((LruCache) LJIIJ().LIZLLL.getValue()).evictAll();
    }

    @Override // X.InterfaceC728100ShE
    public final void LJFF(FollowStatus followStatus) {
        Aweme awemeLJIIIZ;
        User author;
        String userId = followStatus.getUserId();
        if (userId != null && (awemeLJIIIZ = LIZ.LJIIIZ(userId)) != null && (author = awemeLJIIIZ.getAuthor()) != null) {
            int iIntValue = -1;
            if (followStatus.getFollowStatus() != -1) {
                author.setFollowStatus(followStatus.getFollowStatus());
            }
            Integer followerStatus = followStatus.getFollowerStatus();
            if (followerStatus == null || followerStatus.intValue() != -1) {
                Integer followerStatus2 = followStatus.getFollowerStatus();
                if (followerStatus2 != null) {
                    iIntValue = followerStatus2.intValue();
                }
                author.setFollowerStatus(iIntValue);
            }
        }
    }

    @Override // X.InterfaceC728100ShE
    public final void LJI(String str) {
        Aweme aweme = LJIIJ().get(str);
        if (aweme != null) {
            UserStory userStory = aweme.getUserStory();
            if (userStory != null) {
                userStory.setAllViewed(true);
            }
            C727890Sgt c727890Sgt = C727890Sgt.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" 's stories reported all viewed");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c727890Sgt.getClass();
            C727890Sgt.LIZ("UserStoryRepoImplV2", strLIZIZ);
            C726920SfK.LIZ.getClass();
            C2487409ou.LIZJ(new ARunnableS16S1100000_11(aweme, str, 5));
        }
    }

    @Override // X.InterfaceC728100ShE
    public final C11NZ<Pair<Aweme, Integer>> LJII(String str) {
        return ((C729860Sk4) LIZLLL.getValue()).LJFF(new C728180ShM(Collections.singletonList(str), C0O3P.NetworkOnly)).LJJJJZI(new AkS41S1000000_11(str, 1));
    }

    @Override // X.InterfaceC728100ShE
    public final Aweme LJIIIZ(String str) {
        return LJIIJ().get(str);
    }

    @C14EU
    public final void onBlockEvent(C888460YtI c888460YtI) {
        String uid;
        User user = c888460YtI.LIZ;
        if (user == null || (uid = user.getUid()) == null) {
            return;
        }
        LJIIJ().remove(uid);
        C726920SfK.LIZ.getClass();
        C2487409ou.LIZJ(new ARunnableS16S1100000_11(null, uid, 5));
    }

    @Override // X.InterfaceC728100ShE
    public final void LIZJ(String str, String str2) {
        C1605650rsx.LIZIZ.LJIIJ(EnumC1615506Uf.STORY, str, str2, AFwS243S0000000_11.get$arr$(636));
    }

    @Override // X.InterfaceC728100ShE
    public final C11NZ<Aweme> LIZLLL(String str, boolean z) {
        C0O3P c0o3p;
        C729860Sk4 c729860Sk4 = (C729860Sk4) LIZLLL.getValue();
        List listSingletonList = Collections.singletonList(str);
        if (z) {
            c0o3p = C0O3P.NetWhenCacheMiss;
        } else {
            c0o3p = C0O3P.NetworkOnly;
        }
        C11ON c11onLJFF = c729860Sk4.LJFF(new C728180ShM(listSingletonList, c0o3p));
        if (z) {
            return c11onLJFF.LJJIL(new InterfaceC19483011Ki() { // from class: X.0ShK
                @Override // X.InterfaceC19483011Ki
                public final boolean test(Object obj) {
                    List<Aweme> awemes = ((UserStoriesResponse) obj).getAwemes();
                    if (awemes == null) {
                        awemes = C13BV.INSTANCE;
                    }
                    return !awemes.isEmpty();
                }
            }).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0ShI
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    Object objLJJJLL;
                    List<Aweme> awemes = ((UserStoriesResponse) obj).getAwemes();
                    if (awemes == null || (objLJJJLL = C13LP.LJJJLL(awemes)) == null) {
                        return new Aweme();
                    }
                    return objLJJJLL;
                }
            });
        }
        return c11onLJFF.LJJJJZI(new AkS41S1000000_11(str, 0));
    }

    @Override // X.InterfaceC728100ShE
    public final void LJ(String str, UserStory userStory) {
        LJIIJ().LJIIIIZZ(str, userStory);
    }

    @Override // X.InterfaceC728100ShE
    public final void LIZIZ(Aweme aweme, String str, boolean z) {
        LJIIJ().LJIIJ(aweme, str, z);
    }

    @Override // X.InterfaceC728100ShE
    public final void LIZ(List list, String str, List list2, boolean z) {
        LJIIJ().LIZ(list, str, list2, z);
    }
}
