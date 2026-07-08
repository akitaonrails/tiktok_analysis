package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed;
import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rPk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1587540rPk implements InterfaceC427710Gpt {
    public static long LLILLJJLI;
    public static long LLILLL;
    public static volatile FriendsFeedResponse LLILZLL;
    public static volatile FriendsFeedResponse LLIZ;
    public static boolean LLIZLLLIL;
    public static final C1587540rPk LL = new C1587540rPk();
    public static String LLILZ = C0XQ7.LJFF().getCurUserId();
    public static final C01GW LLILZIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(527));

    public static long LIZJ() {
        return ((Number) LLILZIL.getValue()).longValue();
    }

    public static boolean LIZIZ(boolean z) {
        if (z && !LLIZLLLIL) {
            if (LLILLL != 0 && LLIZ != null) {
                long jCurrentTimeMillis = System.currentTimeMillis() - LLILLL;
                if (jCurrentTimeMillis <= LIZJ() && LIZJ() - jCurrentTimeMillis > 10000) {
                    return true;
                }
            }
            return false;
        }
        if (LLILLJJLI == 0 || LLILZLL == null) {
            return false;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - LLILLJJLI;
        if (jCurrentTimeMillis2 <= LIZJ() && LIZJ() - jCurrentTimeMillis2 > 10000) {
            return true;
        }
        return false;
    }

    public static boolean LIZ(String str, boolean z) {
        int size;
        List<FriendsFeed> list;
        boolean zLIZLLL = false;
        if (str == null || str.length() == 0) {
            return true;
        }
        if (!LIZIZ(z)) {
            return false;
        }
        try {
            List list2 = (List) C08JS.LIZIZ().LJIIIIZZ(str, new TypeToken<List<? extends String>>() { // from class: X.0rPm
            }.getType());
            int size2 = list2.size();
            FriendsFeedResponse friendsFeedResponse = LLILZLL;
            if (friendsFeedResponse != null && (list = friendsFeedResponse.friendFeedData) != null) {
                size = list.size();
            } else {
                size = 0;
            }
            if (size2 > size) {
                return false;
            }
            zLIZLLL = LIZLLL(list2, z);
            return zLIZLLL;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "awemeIdsInCachedResponse");
            return zLIZLLL;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0005 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZLLL(java.util.List r6, boolean r7) {
        /*
            java.util.Iterator r6 = r6.iterator()
            r5 = 1
        L5:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r3 = r6.next()
            r4 = 0
            if (r7 == 0) goto L43
            boolean r0 = X.C1587540rPk.LLIZLLLIL
            if (r0 != 0) goto L43
            com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse r0 = X.C1587540rPk.LLIZ
            if (r0 == 0) goto L72
            java.util.List<com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed> r0 = r0.friendFeedData
            if (r0 == 0) goto L72
            java.util.Iterator r1 = r0.iterator()
            r2 = 0
        L23:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L70
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed r0 = (com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            if (r0 == 0) goto L41
            java.lang.String r0 = r0.getAid()
        L39:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)
            if (r0 == 0) goto L23
            r2 = 1
            goto L23
        L41:
            r0 = r4
            goto L39
        L43:
            com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse r0 = X.C1587540rPk.LLILZLL
            if (r0 == 0) goto L72
            java.util.List<com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed> r0 = r0.friendFeedData
            if (r0 == 0) goto L72
            java.util.Iterator r1 = r0.iterator()
            r2 = 0
        L50:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L70
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed r0 = (com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            if (r0 == 0) goto L6e
            java.lang.String r0 = r0.getAid()
        L66:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)
            if (r0 == 0) goto L50
            r2 = 1
            goto L50
        L6e:
            r0 = r4
            goto L66
        L70:
            if (r2 != 0) goto L5
        L72:
            r5 = 0
            goto L5
        L74:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1587540rPk.LIZLLL(java.util.List, boolean):boolean");
    }

    @Override // X.InterfaceC427710Gpt
    public final void LLLLLLZZ(int i, User user, User user2) {
        if (user2 != null && !Intrinsics.LJFF(LLILZ, user2.getUid())) {
            LLILZ = user2.getUid();
            LLILLJJLI = 0L;
        }
    }
}
