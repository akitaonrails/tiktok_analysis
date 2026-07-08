package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.model.MentionCheckResult;
import com.ss.android.ugc.aweme.model.MentionCheckSingleTypeResult;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SearchUserSugResponse;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import com.ss.android.ugc.aweme.search.service.ISearchUserService;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Cbs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C317100Cbs {
    public static final C317100Cbs LIZ = new C317100Cbs();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2842));

    public static boolean LIZIZ(String str) {
        if (str != null && Intrinsics.LJFF(str, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
            return true;
        }
        return false;
    }

    public static void LJ(List list) {
        if (list != null && (!list.isEmpty())) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                SugExtraInfo sugExtraInfo = ((SearchSugEntity) it2.next()).sugExtraInfo;
                if (sugExtraInfo != null && !sugExtraInfo.getHasUserRelation()) {
                    return;
                }
            }
        }
    }

    public static List LIZ(String str, String str2) {
        int iLJJIJLIJ;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        if (str.length() != 0 && str2.length() != 0) {
            while (length < str.length() && (iLJJIJLIJ = a0.LJJIJLIJ(length, str, str2, true)) != -1) {
                arrayList.add(new Position(iLJJIJLIJ, (str2.length() + iLJJIJLIJ) - 1));
                length = str2.length() + iLJJIJLIJ;
            }
        }
        return arrayList;
    }

    public static C317020Cbk LIZLLL(String str, SearchUserSugResponse searchUserSugResponse, List list) {
        String str2;
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C20611415l2 c20611415l2 = (C20611415l2) it2.next();
                C317100Cbs c317100Cbs = LIZ;
                String str3 = c20611415l2.LIZ;
                c317100Cbs.getClass();
                if (!LIZIZ(str3)) {
                    arrayList.add(c20611415l2);
                }
            }
        }
        List<? extends SearchSugEntity> list2 = searchUserSugResponse.sugList;
        if (list2 != null) {
            for (SearchSugEntity searchSugEntity : list2) {
                SugExtraInfo sugExtraInfo = searchSugEntity.sugExtraInfo;
                if (sugExtraInfo != null) {
                    String userId = sugExtraInfo.getUserId();
                    String str4 = "";
                    if (userId == null) {
                        userId = "";
                    }
                    int followStatus = sugExtraInfo.getFollowStatus();
                    int followerStatus = sugExtraInfo.getFollowerStatus();
                    String userNickname = sugExtraInfo.getUserNickname();
                    if (userNickname == null) {
                        userNickname = "";
                    }
                    UrlModel urlModel = new UrlModel();
                    urlModel.setUri(sugExtraInfo.getUserAvatarUri());
                    urlModel.setUrlList(C1697810uHb.LJIIJJI(sugExtraInfo.getUserAvatarUri(), sugExtraInfo.getUserAvatarUri()));
                    String username = sugExtraInfo.getUsername();
                    if (username == null) {
                        username = "";
                    }
                    if (!sugExtraInfo.isVerifiedUser()) {
                        str2 = "";
                    } else {
                        str2 = "verified";
                    }
                    String secUserId = sugExtraInfo.getSecUserId();
                    if (secUserId == null) {
                        secUserId = "";
                    }
                    if (sugExtraInfo.getMentionBlockType() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    EnumC317520CcY enumC317520CcY = EnumC317520CcY.ALL;
                    Word word = searchSugEntity.mWord;
                    String userRelationType = sugExtraInfo.getUserRelationType();
                    String str5 = searchUserSugResponse.requestId;
                    if (str5 != null) {
                        str4 = str5;
                    }
                    List list3 = searchSugEntity.position;
                    if (list3 == null) {
                        list3 = C13BV.INSTANCE;
                    }
                    List list4 = searchSugEntity.highLightPositions;
                    if (list4 == null) {
                        list4 = C13BV.INSTANCE;
                    }
                    C20611415l2 c20611415l22 = new C20611415l2(userId, followStatus, followerStatus, userNickname, null, urlModel, username, null, str2, null, 0, null, null, 0, secUserId, new C317510CcX(z, enumC317520CcY, true, word, userRelationType, str4, 0, list3, list4, null, null, 1600), 523560);
                    C317100Cbs c317100Cbs2 = LIZ;
                    String str6 = c20611415l22.LIZ;
                    c317100Cbs2.getClass();
                    if (!LIZIZ(str6)) {
                        arrayList.add(c20611415l22);
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((C20611415l2) obj).LIZ)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        searchUserSugResponse.LIZ();
        return new C317020Cbk(new C20610715kv(str, null, null, searchUserSugResponse.logPbBean, 225), arrayList3);
    }

    public static C317020Cbk LIZJ(List list, List list2, List list3, List list4) {
        int i;
        int i2;
        C20611415l2 c20611415l2LIZ;
        boolean z;
        boolean z2;
        boolean z3;
        Object next;
        C20611415l2 c20611415l2LIZ2;
        boolean z4;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list4) {
            C317100Cbs c317100Cbs = LIZ;
            String uid = ((BaseContact) obj).getUid();
            c317100Cbs.getClass();
            if (!LIZIZ(uid)) {
                arrayList3.add(obj);
            }
        }
        List<IMUser> listLJLLLL = C13LP.LJLLLL(new Comparator() { // from class: X.0CbG
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                IMUser iMUser = (IMUser) obj2;
                IMUser iMUser2 = (IMUser) obj3;
                String strLIZ = C1247000iYU.LIZ(iMUser);
                String str = "";
                if (strLIZ == null && (strLIZ = iMUser.getInitialLetter()) == null) {
                    strLIZ = "";
                }
                String strLIZ2 = C1247000iYU.LIZ(iMUser2);
                if (strLIZ2 != null || (strLIZ2 = iMUser2.getInitialLetter()) != null) {
                    str = strLIZ2;
                }
                if (strLIZ.compareTo(str) < 0 && Intrinsics.LJFF(strLIZ, "#") && !Intrinsics.LJFF(str, "#")) {
                    return 1;
                }
                if (strLIZ.compareTo(str) > 0 && !Intrinsics.LJFF(strLIZ, "#") && Intrinsics.LJFF(str, "#")) {
                    return -1;
                }
                return strLIZ.compareTo(str);
            }
        }, arrayList3);
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            MentionCheckResult mentionCheckResult = (MentionCheckResult) it2.next();
            if (((MentionCheckSingleTypeResult) ListProtector.get(mentionCheckResult.userBlockedResults, 0)).blockType != 0) {
                linkedHashSet.add(mentionCheckResult.uid);
            }
        }
        Iterator it3 = list.iterator();
        while (true) {
            i = 10;
            if (!it3.hasNext()) {
                break;
            }
            User user = (User) it3.next();
            if (arrayList2.size() < 10) {
                Iterator it4 = listLJLLLL.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next = it4.next();
                        if (Intrinsics.LJFF(((BaseContact) next).getUid(), user.getUid())) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                IMUser iMUser = (IMUser) next;
                if (iMUser == null) {
                    c20611415l2LIZ2 = C20611715l5.LIZIZ(user);
                    c20611415l2LIZ2.LJIJJ = new C317510CcX(!linkedHashSet.contains(c20611415l2LIZ2.LIZ), EnumC317520CcY.RECENT, false, null, null, null, 0, null, null, C1247000iYU.LIZIZ(user), null, 1532);
                } else {
                    c20611415l2LIZ2 = C20611715l5.LIZ(iMUser);
                    if (!linkedHashSet.contains(c20611415l2LIZ2.LIZ) && iMUser.isMentionEnabled()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    c20611415l2LIZ2.LJIJJ = new C317510CcX(z4, EnumC317520CcY.RECENT, false, null, null, null, 0, null, null, C1247000iYU.LIZIZ(user), null, 1532);
                }
                arrayList2.add(c20611415l2LIZ2);
            }
        }
        if (arrayList2.size() < 10) {
            Iterator it5 = list3.iterator();
            while (it5.hasNext()) {
                IMUser iMUser2 = (IMUser) it5.next();
                if (arrayList2.size() < 10) {
                    C20611415l2 c20611415l2LIZ3 = C20611715l5.LIZ(iMUser2);
                    if (!linkedHashSet.contains(c20611415l2LIZ3.LIZ) && iMUser2.isMentionEnabled()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    c20611415l2LIZ3.LJIJJ = new C317510CcX(z3, EnumC317520CcY.RECENT, false, null, null, null, 0, null, null, C1247000iYU.LIZ(iMUser2), null, 1532);
                    if (!arrayList2.contains(c20611415l2LIZ3)) {
                        C317100Cbs c317100Cbs2 = LIZ;
                        String str = c20611415l2LIZ3.LIZ;
                        c317100Cbs2.getClass();
                        if (!LIZIZ(str)) {
                            arrayList2.add(c20611415l2LIZ3);
                        }
                    }
                }
            }
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        for (IMUser iMUser3 : listLJLLLL) {
            LIZ.getClass();
            if (((ISearchUserService) LIZIZ.getValue()).LIZLLL() && iMUser3.getFollowStatus() == 2 && listLJLLLL.size() >= i) {
                c20611415l2LIZ = C20611715l5.LIZ(iMUser3);
                if (!linkedHashSet.contains(c20611415l2LIZ.LIZ) && iMUser3.isMentionEnabled()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c20611415l2LIZ.LJIJJ = new C317510CcX(z2, EnumC317520CcY.FRIEND, false, null, null, null, 0, null, null, C1247000iYU.LIZ(iMUser3), null, 1532);
                if (!arrayList2.contains(c20611415l2LIZ)) {
                    arrayList4.add(c20611415l2LIZ);
                }
            } else {
                c20611415l2LIZ = C20611715l5.LIZ(iMUser3);
                if (!linkedHashSet.contains(c20611415l2LIZ.LIZ) && iMUser3.isMentionEnabled()) {
                    z = true;
                } else {
                    z = false;
                }
                c20611415l2LIZ.LJIJJ = new C317510CcX(z, EnumC317520CcY.FOLLOW, false, null, null, null, 0, null, null, C1247000iYU.LIZ(iMUser3), null, 1532);
            }
            arrayList5.add(c20611415l2LIZ);
            if (!arrayList6.isEmpty() && TextUtils.equals((CharSequence) ListProtector.get(arrayList6, arrayList6.size() - 1), iMUser3.getInitialLetter())) {
                int size = arrayList7.size() - 1;
                ListProtector.set(arrayList7, size, Integer.valueOf(((Number) ListProtector.get(arrayList7, size)).intValue() + 1));
            } else {
                String initialLetter = iMUser3.getInitialLetter();
                if (initialLetter == null) {
                    initialLetter = "";
                }
                arrayList6.add(initialLetter);
                arrayList7.add(1);
            }
            i = 10;
        }
        if (!arrayList4.isEmpty()) {
            i2 = 0;
            ListProtector.add(arrayList6, 0, "Friend");
            ListProtector.add(arrayList7, 0, Integer.valueOf(arrayList4.size()));
        } else {
            i2 = 0;
        }
        if (!arrayList2.isEmpty()) {
            ListProtector.add(arrayList6, i2, "Recent");
            ListProtector.add(arrayList7, i2, Integer.valueOf(arrayList2.size()));
        }
        arrayList.addAll(arrayList2);
        arrayList.addAll(arrayList4);
        arrayList.addAll(arrayList5);
        return new C317020Cbk(new C20610715kv(null, arrayList6, arrayList7, null, 399), arrayList);
    }
}
