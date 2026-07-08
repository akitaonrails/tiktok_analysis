package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.model.MentionCheckResult;
import com.ss.android.ugc.aweme.model.MentionCheckSingleTypeResult;
import com.ss.android.ugc.aweme.model.MentionCommentSortedResponse;
import com.ss.android.ugc.aweme.model.MentionFollowFriendResponse;
import com.ss.android.ugc.aweme.model.MentionRecentContactResponse;
import com.ss.android.ugc.aweme.model.MentionRecommendResponse;
import com.ss.android.ugc.aweme.model.UserListWithPagination;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SearchUserSugResponse;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import com.ss.android.ugc.aweme.search.service.ISearchUserService;
import com.ss.android.ugc.aweme.tako.ITakoService;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CbD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C316690CbD {
    public static final C316690CbD LIZ = new C316690CbD();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3611));

    public static boolean LIZ(C20612815lG c20612815lG) {
        String str;
        boolean z;
        Map<String, String> map;
        if (c20612815lG != null && (map = c20612815lG.LIZLLL) != null) {
            str = map.get("can_show_tako_account");
        } else {
            str = null;
        }
        boolean zLJFF = Intrinsics.LJFF(str, "1");
        ITakoService iTakoService = (ITakoService) PluggableExtentionKt.pluggableSpi$default(ITakoService.class, false, false, false, 14, null);
        if (iTakoService != null && iTakoService.LJJLIIIJILLIZJL()) {
            z = true;
        } else {
            z = false;
        }
        if (!zLJFF || !z) {
            return false;
        }
        return true;
    }

    public static Set LIZLLL(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            MentionCheckResult mentionCheckResult = (MentionCheckResult) it2.next();
            boolean z = false;
            for (MentionCheckSingleTypeResult mentionCheckSingleTypeResult : mentionCheckResult.userBlockedResults) {
                C316690CbD c316690CbD = LIZ;
                long j = mentionCheckSingleTypeResult.mentionType;
                c316690CbD.getClass();
                if (j == 3 || j == 6 || j == 9) {
                    if (mentionCheckSingleTypeResult.blockType != 0) {
                        z = true;
                    }
                }
            }
            if (z) {
                linkedHashSet.add(mentionCheckResult.uid);
            }
        }
        return linkedHashSet;
    }

    public static List LIZIZ(List list, C20612815lG c20612815lG) {
        if (LIZ(c20612815lG)) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((User) obj).isVerifiedTako != 1) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List LIZJ(List list, C20612815lG c20612815lG) {
        if (LIZ(c20612815lG)) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!Intrinsics.LJFF(((C20611915l7) obj).LJIIJJI, "1")) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List LJ(MentionCommentSortedResponse mentionCommentSortedResponse, C20612815lG c20612815lG) {
        String str;
        new LinkedHashSet().addAll(LIZLLL(mentionCommentSortedResponse.blockResults));
        Map<String, String> map = mentionCommentSortedResponse.sortReason;
        List listLIZIZ = LIZIZ(mentionCommentSortedResponse.users, c20612815lG);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
        int i = 0;
        for (Object obj : listLIZIZ) {
            int i2 = i + 1;
            if (i >= 0) {
                User user = (User) obj;
                int followStatus = user.getFollowStatus();
                if (followStatus != 1) {
                    if (followStatus != 2) {
                        str = "";
                    } else {
                        str = "friend";
                    }
                } else {
                    str = "follow";
                }
                String str2 = map.get(user.getUid());
                if (str2 == null) {
                    str2 = str;
                }
                arrayList.add(C20611815l6.LIZLLL(user, !r5.contains(user.getUid()), new C20611315l1(str, null, false, null, null, null, null, i2, str2, C1247000iYU.LIZIZ(user), 254), new C316780CbM(null, 3, 0)));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return arrayList;
    }

    public static List LJFF(MentionRecommendResponse mentionRecommendResponse, C20612815lG c20612815lG) {
        List list;
        String str;
        Set setLIZLLL = LIZLLL(mentionRecommendResponse.blockResults);
        UserListWithPagination userListWithPagination = mentionRecommendResponse.sortedUserList;
        if (userListWithPagination == null || (list = userListWithPagination.userList) == null) {
            list = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!setLIZLLL.contains(((User) obj).getUid())) {
                arrayList.add(obj);
            }
        }
        List listLIZIZ = LIZIZ(arrayList, c20612815lG);
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
        int i = 0;
        for (Object obj2 : listLIZIZ) {
            int i2 = i + 1;
            if (i >= 0) {
                User user = (User) obj2;
                int followStatus = user.getFollowStatus();
                if (followStatus != 1) {
                    if (followStatus != 2) {
                        str = "";
                    } else {
                        str = "friend";
                    }
                } else {
                    str = "follow";
                }
                arrayList2.add(C20611815l6.LIZLLL(user, true, new C20611315l1(str, null, false, null, null, null, null, i2, str, C1247000iYU.LIZIZ(user), 254), new C316780CbM(null, 3, 0)));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return arrayList2;
    }

    public static List LJII(MentionFollowFriendResponse mentionFollowFriendResponse, C20612815lG c20612815lG) {
        String str;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(LIZLLL(mentionFollowFriendResponse.blockResults));
        List<User> listLIZIZ = LIZIZ(mentionFollowFriendResponse.users, c20612815lG);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
        for (User user : listLIZIZ) {
            boolean z = !linkedHashSet.contains(user.getUid());
            int followStatus = user.getFollowStatus();
            if (followStatus != 1) {
                if (followStatus != 2) {
                    str = "";
                } else {
                    str = "friend";
                }
            } else {
                str = "follow";
            }
            arrayList.add(C20611815l6.LIZLLL(user, z, new C20611315l1(str, null, false, null, null, null, null, 0, null, C1247000iYU.LIZIZ(user), 1022), new C316780CbM(null, 3, 0)));
        }
        return arrayList;
    }

    public static List LJI(MentionFollowFriendResponse mentionFollowFriendResponse, MentionRecentContactResponse mentionRecentContactResponse, C20612815lG c20612815lG) {
        String str;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        linkedHashSet.addAll(LIZLLL(mentionRecentContactResponse.blockResults));
        linkedHashSet.addAll(LIZLLL(mentionFollowFriendResponse.blockResults));
        List listLIZIZ = LIZIZ(mentionRecentContactResponse.users, c20612815lG);
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
        int i = 0;
        int i2 = 0;
        for (Object obj : listLIZIZ) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                User user = (User) obj;
                arrayList2.add(C20611815l6.LIZLLL(user, !linkedHashSet.contains(user.getUid()), new C20611315l1("recent", null, false, null, null, null, null, i3, null, C1247000iYU.LIZIZ(user), 766), new C316780CbM(null, 3, 0)));
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        arrayList.addAll(arrayList2);
        List listLIZIZ2 = LIZIZ(mentionFollowFriendResponse.users, c20612815lG);
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLIZIZ2, 10));
        for (Object obj2 : listLIZIZ2) {
            int i4 = i + 1;
            if (i >= 0) {
                User user2 = (User) obj2;
                boolean z = !linkedHashSet.contains(user2.getUid());
                int followStatus = user2.getFollowStatus();
                if (followStatus != 1) {
                    if (followStatus != 2) {
                        str = "";
                    } else {
                        str = "friend";
                    }
                } else {
                    str = "follow";
                }
                arrayList3.add(C20611815l6.LIZLLL(user2, z, new C20611315l1(str, null, false, null, null, null, null, i + mentionRecentContactResponse.users.size() + 1, null, C1247000iYU.LIZIZ(user2), 766), new C316780CbM(null, 3, 0)));
                i = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        arrayList.addAll(arrayList3);
        HashSet hashSet = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (hashSet.add(((C20611915l7) obj3).LIZ)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    public static List LJIIIIZZ(MentionRecentContactResponse mentionRecentContactResponse, List list, List list2) {
        int i;
        new LinkedHashSet().addAll(LIZLLL(mentionRecentContactResponse.blockResults));
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            C316690CbD c316690CbD = LIZ;
            String uid = ((BaseContact) obj).getUid();
            c316690CbD.getClass();
            if (uid == null || !Intrinsics.LJFF(uid, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
                arrayList.add(obj);
            }
        }
        List<IMUser> listLJLLLL = C13LP.LJLLLL(new Comparator() { // from class: X.0CbE
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                IMUser iMUser = (IMUser) obj3;
                String initialLetter = ((IMUser) obj2).getInitialLetter();
                if (initialLetter == null) {
                    initialLetter = "#";
                }
                String initialLetter2 = iMUser.getInitialLetter();
                if (initialLetter2 == null) {
                    initialLetter2 = "#";
                }
                if (initialLetter.compareTo(initialLetter2) < 0 && Intrinsics.LJFF(initialLetter, "#") && !Intrinsics.LJFF(initialLetter2, "#")) {
                    return 1;
                }
                if (initialLetter.compareTo(initialLetter2) > 0 && !Intrinsics.LJFF(initialLetter, "#") && Intrinsics.LJFF(initialLetter2, "#")) {
                    return -1;
                }
                return initialLetter.compareTo(initialLetter2);
            }
        }, arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        List<User> list3 = mentionRecentContactResponse.users;
        ArrayList arrayList7 = new ArrayList(C15438062q.LJIJJ(list3, 10));
        for (User user : list3) {
            arrayList7.add(C20611815l6.LIZLLL(user, !r11.contains(user.getUid()), new C20611315l1("recent", null, false, null, null, null, null, 0, null, C1247000iYU.LIZIZ(user), 1022), new C316780CbM(null, 3, 0)));
        }
        arrayList2.addAll(arrayList7);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            IMUser iMUser = (IMUser) it2.next();
            if (arrayList2.size() < 10) {
                arrayList2.add(C20611815l6.LIZJ(iMUser, new C20611315l1("recent", null, false, null, null, null, null, 0, null, C1247000iYU.LIZ(iMUser), 1022)));
            }
        }
        for (IMUser iMUser2 : listLJLLLL) {
            LIZ.getClass();
            if (((ISearchUserService) LIZIZ.getValue()).LIZLLL() && iMUser2.getFollowStatus() == 2 && listLJLLLL.size() >= 10) {
                arrayList3.add(C20611815l6.LIZJ(iMUser2, new C20611315l1("friend", null, false, null, null, null, null, 0, null, C1247000iYU.LIZ(iMUser2), 1022)));
            } else {
                arrayList4.add(C20611815l6.LIZJ(iMUser2, new C20611315l1("follow", null, false, null, null, null, null, 0, null, C1247000iYU.LIZ(iMUser2), 1022)));
            }
            if (!arrayList5.isEmpty() && !Intrinsics.LJFF(ListProtector.get(arrayList5, arrayList5.size() - 1), iMUser2.getInitialLetter())) {
                int size = arrayList6.size() - 1;
                ListProtector.set(arrayList6, size, Integer.valueOf(((Number) ListProtector.get(arrayList6, size)).intValue() + 1));
            } else {
                String initialLetter = iMUser2.getInitialLetter();
                if (initialLetter == null) {
                    initialLetter = "";
                }
                arrayList5.add(initialLetter);
                arrayList6.add(1);
            }
        }
        if (!arrayList3.isEmpty()) {
            i = 0;
            ListProtector.add(arrayList5, 0, "Friend");
            ListProtector.add(arrayList6, 0, Integer.valueOf(arrayList3.size()));
        } else {
            i = 0;
        }
        if (!arrayList2.isEmpty()) {
            ListProtector.add(arrayList5, i, "Recent");
            ListProtector.add(arrayList6, i, Integer.valueOf(arrayList2.size()));
        }
        C316710CbF.LIZ = arrayList5;
        C316710CbF.LIZIZ = arrayList6;
        ArrayList arrayList8 = new ArrayList();
        arrayList8.addAll(arrayList2);
        arrayList8.addAll(arrayList3);
        arrayList8.addAll(arrayList4);
        HashSet hashSet = new HashSet();
        ArrayList arrayList9 = new ArrayList();
        for (Object obj2 : arrayList8) {
            if (hashSet.add(((C20611915l7) obj2).LIZ)) {
                arrayList9.add(obj2);
            }
        }
        return arrayList9;
    }

    public static List LJIIIZ(SearchUserSugResponse searchUserSugResponse, String str, List list, C20612815lG c20612815lG) {
        String strIsVerifiedTako;
        List listLIZJ;
        List<? extends SearchSugEntity> list2 = searchUserSugResponse.sugList;
        if ((list2 == null || list2.isEmpty()) && (list == null || list.isEmpty())) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && (listLIZJ = LIZJ(list, c20612815lG)) != null) {
            Iterator it2 = listLIZJ.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
        List<? extends SearchSugEntity> list3 = searchUserSugResponse.sugList;
        if (list3 != null) {
            if (!LIZ(c20612815lG)) {
                ArrayList arrayList2 = new ArrayList();
                for (SearchSugEntity searchSugEntity : list3) {
                    SugExtraInfo sugExtraInfo = searchSugEntity.sugExtraInfo;
                    if (sugExtraInfo != null) {
                        strIsVerifiedTako = sugExtraInfo.isVerifiedTako();
                    } else {
                        strIsVerifiedTako = null;
                    }
                    if (!Intrinsics.LJFF(strIsVerifiedTako, "1")) {
                        arrayList2.add(searchSugEntity);
                    }
                }
                list3 = arrayList2;
            }
            for (SearchSugEntity searchSugEntity2 : list3) {
                if (searchSugEntity2.sugExtraInfo != null) {
                    String str2 = searchUserSugResponse.requestId;
                    if (str2 == null) {
                        str2 = "";
                    }
                    arrayList.add(C20611815l6.LIZ(searchSugEntity2, str2, str));
                }
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((C20611915l7) obj).LIZ)) {
                arrayList3.add(obj);
            }
        }
        return arrayList3;
    }
}
