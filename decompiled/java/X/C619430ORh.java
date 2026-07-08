package X;

import Y.AComparatorS113S1100000_9;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ORh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C619430ORh implements InterfaceC1596240rdm {
    public static final String LIZLLL(InterfaceC1891350zJl interfaceC1891350zJl) {
        FollowingInterestUser followingInterestUserLLIILZL;
        User user;
        if (interfaceC1891350zJl instanceof C1596360rdy) {
            User user2 = ((C1596360rdy) interfaceC1891350zJl).getUser();
            if (user2 == null) {
                return null;
            }
            return user2.getUid();
        }
        if (!(interfaceC1891350zJl instanceof InterfaceC1595940rdI) || (followingInterestUserLLIILZL = ((InterfaceC1595940rdI) interfaceC1891350zJl).LLIILZL()) == null || (user = followingInterestUserLLIILZL.getUser()) == null) {
            return null;
        }
        return user.getUid();
    }

    public static int LIZJ(InterfaceC1891350zJl interfaceC1891350zJl, String str) {
        C1596360rdy c1596360rdy;
        String uid;
        Aweme aweme;
        User author;
        User author2 = null;
        if (interfaceC1891350zJl instanceof C1596360rdy) {
            c1596360rdy = (C1596360rdy) interfaceC1891350zJl;
        } else {
            c1596360rdy = null;
        }
        InterfaceC614780O9k interfaceC614780O9kLIZIZ = C614770O9j.LIZIZ.LIZIZ();
        if (c1596360rdy != null && (aweme = c1596360rdy.LLILLJJLI) != null && (author = aweme.getAuthor()) != null) {
            uid = author.getUid();
        } else {
            uid = null;
            if (c1596360rdy != null) {
            }
            return interfaceC614780O9kLIZIZ.LIZ(author2, interfaceC1891350zJl instanceof InterfaceC1595940rdI, uid, str);
        }
        Aweme aweme2 = c1596360rdy.LLILLJJLI;
        if (aweme2 != null) {
            author2 = aweme2.getAuthor();
        }
        return interfaceC614780O9kLIZIZ.LIZ(author2, interfaceC1891350zJl instanceof InterfaceC1595940rdI, uid, str);
    }

    @Override // X.InterfaceC1596240rdm
    public final List LIZ(String str, List list) {
        List listLJLLLL = C13LP.LJLLLL(new AComparatorS113S1100000_9(this, str, 1), list);
        C08QU c08quLJIJI = C09RB.LJIJI(new C1939607ik(list), C619440ORi.LL);
        C08QU c08quLJIJI2 = C09RB.LJIJI(new C1939607ik(listLJLLLL), C619450ORj.LL);
        C08QT c08qt = new C08QT(c08quLJIJI);
        C08QT c08qt2 = new C08QT(c08quLJIJI2);
        while (c08qt.hasNext() && c08qt2.hasNext()) {
            if (!Intrinsics.LJFF(c08qt.next(), c08qt2.next())) {
                break;
            }
        }
        if (c08qt.hasNext() || c08qt2.hasNext()) {
            return listLJLLLL;
        }
        return null;
    }

    @Override // X.InterfaceC1596240rdm
    public final C619460ORk LIZIZ(C619460ORk c619460ORk, String str) {
        List listLJLLLL = C13LP.LJLLLL(new AComparatorS113S1100000_9(this, str, 2), c619460ORk.LIZ);
        C619460ORk c619460ORk2 = new C619460ORk(listLJLLLL, c619460ORk.LIZIZ);
        C08QU c08quLJIJI = C09RB.LJIJI(new C1939607ik(c619460ORk.LIZ), AFwS240S0000000_9.get$arr$(872));
        C08QU c08quLJIJI2 = C09RB.LJIJI(new C1939607ik(listLJLLLL), AFwS240S0000000_9.get$arr$(873));
        C08QT c08qt = new C08QT(c08quLJIJI);
        C08QT c08qt2 = new C08QT(c08quLJIJI2);
        while (c08qt.hasNext() && c08qt2.hasNext()) {
            if (!Intrinsics.LJFF(c08qt.next(), c08qt2.next())) {
                break;
            }
        }
        if (c08qt.hasNext() || c08qt2.hasNext()) {
            return c619460ORk2;
        }
        return null;
    }
}
