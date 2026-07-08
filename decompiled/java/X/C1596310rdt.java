package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0rdt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1596310rdt {
    public static final List<C1596040rdS> LIZIZ(List<FollowingInterestUser> list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        int i = 0;
        for (FollowingInterestUser followingInterestUser : list) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new C1596040rdS(followingInterestUser, i));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return arrayList;
    }

    public static final List<Object> LIZ(List<? extends InterfaceC1595940rdI> list, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        if (z) {
            if (!arrayList.isEmpty()) {
                ListProtector.set(arrayList, 0, new C1596320rdu(!z2));
            } else {
                arrayList.add(new C1596320rdu(!z2));
                return arrayList;
            }
        }
        return arrayList;
    }

    public static final List<InterfaceC1595940rdI> LIZLLL(List<FollowingInterestUser> list, boolean z, boolean z2) {
        boolean z3;
        SlimRoom.LinkMic linkMic;
        List<User> list2;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        int i = 0;
        for (FollowingInterestUser followingInterestUser : list) {
            int i2 = i + 1;
            if (i >= 0) {
                FollowingInterestUser followingInterestUser2 = followingInterestUser;
                int i3 = i - (z2 ? 1 : 0);
                C1597740rgC.LIZ.getClass();
                SlimRoom slimRoomLJII = C1597740rgC.LJII(followingInterestUser2);
                if (slimRoomLJII != null && (linkMic = slimRoomLJII.getLinkMic()) != null && (list2 = linkMic.followedList) != null && list2.size() >= 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                arrayList.add(LIZJ(followingInterestUser2, z3, list, i3));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return arrayList;
    }

    public static final InterfaceC1595940rdI LIZJ(FollowingInterestUser followingInterestUser, boolean z, List list, int i) {
        if (z) {
            return new C1597830rgL(followingInterestUser, list, i);
        }
        return new C1597820rgK(followingInterestUser, list, i);
    }
}
