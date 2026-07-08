package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.model.MentionRecommendResponse;
import com.ss.android.ugc.aweme.model.UserListWithPagination;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SearchUserSugResponse;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import com.ss.android.ugc.aweme.search.service.ISearchUserService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0Cbu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C317120Cbu {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static final Set<String> LIZJ = new LinkedHashSet();
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(6020));

    public static C317130Cbv LIZ(MentionRecommendResponse mentionRecommendResponse) {
        long j;
        boolean z;
        Pair pair;
        long j2;
        boolean z2;
        long j3 = 0;
        Boolean bool = Boolean.FALSE;
        Pair pair2 = new Pair(0L, bool);
        UserListWithPagination userListWithPagination = mentionRecommendResponse.friendUserList;
        if (userListWithPagination != null) {
            j = userListWithPagination.offset;
        } else {
            j = 0;
        }
        Long lValueOf = Long.valueOf(j);
        UserListWithPagination userListWithPagination2 = mentionRecommendResponse.friendUserList;
        boolean z3 = false;
        if (userListWithPagination2 != null) {
            z = userListWithPagination2.hasMore;
        } else {
            z = false;
        }
        Pair pair3 = new Pair(lValueOf, Boolean.valueOf(z));
        UserListWithPagination userListWithPagination3 = mentionRecommendResponse.friendUserList;
        if (userListWithPagination3 != null && userListWithPagination3.hasMore) {
            pair = new Pair(0L, bool);
        } else if (LIZ) {
            UserListWithPagination userListWithPagination4 = mentionRecommendResponse.followingUserList;
            if (userListWithPagination4 != null) {
                j2 = userListWithPagination4.offset;
            } else {
                j2 = 0;
            }
            Long lValueOf2 = Long.valueOf(j2);
            UserListWithPagination userListWithPagination5 = mentionRecommendResponse.followingUserList;
            if (userListWithPagination5 != null) {
                z2 = userListWithPagination5.hasMore;
            } else {
                z2 = false;
            }
            pair = new Pair(lValueOf2, Boolean.valueOf(z2));
        } else {
            pair = new Pair(0L, Boolean.TRUE);
        }
        UserListWithPagination userListWithPagination6 = mentionRecommendResponse.mentionedUserList;
        if (userListWithPagination6 != null) {
            j3 = userListWithPagination6.offset;
        }
        Long lValueOf3 = Long.valueOf(j3);
        UserListWithPagination userListWithPagination7 = mentionRecommendResponse.mentionedUserList;
        if (userListWithPagination7 != null) {
            z3 = userListWithPagination7.hasMore;
        }
        return new C317130Cbv(pair2, pair3, pair, new Pair(lValueOf3, Boolean.valueOf(z3)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static List LIZIZ(boolean z, MentionRecommendResponse mentionRecommendResponse) {
        C13BV arrayList;
        UserListWithPagination userListWithPagination;
        List<User> list;
        List<User> list2;
        UserListWithPagination userListWithPagination2;
        ArrayList arrayList2 = new ArrayList();
        if (z && (userListWithPagination2 = mentionRecommendResponse.recentUserList) != null) {
            if (!userListWithPagination2.userList.isEmpty()) {
                arrayList2.add(new C0283007t("recent"));
            }
            List listLL = C13LP.LL(userListWithPagination2.userList, 10);
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLL, 10));
            Iterator it2 = listLL.iterator();
            while (it2.hasNext()) {
                arrayList3.add(new C317150Cbx((User) it2.next(), "recent", 2));
            }
            arrayList2.addAll(arrayList3);
            Set<String> set = LIZJ;
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((C317150Cbx) it3.next()).LL.getUid());
            }
            set.addAll(arrayList4);
        }
        UserListWithPagination userListWithPagination3 = mentionRecommendResponse.friendUserList;
        if (userListWithPagination3 != null && (list2 = userListWithPagination3.userList) != null) {
            arrayList = new ArrayList();
            for (User user : list2) {
                if (!LIZJ.contains(user.getUid())) {
                    arrayList.add(user);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        if (!LIZIZ && (!arrayList.isEmpty())) {
            arrayList2.add(new C0283007t("friends"));
            LIZIZ = true;
        }
        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList5.add(new C317150Cbx((User) it4.next(), "friends", 2));
        }
        arrayList2.addAll(arrayList5);
        UserListWithPagination userListWithPagination4 = mentionRecommendResponse.friendUserList;
        if ((userListWithPagination4 == null || (list = userListWithPagination4.userList) == null || list.isEmpty()) && (userListWithPagination = mentionRecommendResponse.followingUserList) != null) {
            if (!LIZ && (!userListWithPagination.userList.isEmpty())) {
                arrayList2.add(new C0283007t("following"));
                LIZ = true;
            }
            List<User> list3 = userListWithPagination.userList;
            ArrayList arrayList6 = new ArrayList();
            for (User user2 : list3) {
                if (!LIZJ.contains(user2.getUid())) {
                    arrayList6.add(user2);
                }
            }
            ArrayList arrayList7 = new ArrayList(C15438062q.LJIJJ(arrayList6, 10));
            Iterator it5 = arrayList6.iterator();
            while (it5.hasNext()) {
                arrayList7.add(new C317150Cbx((User) it5.next(), "following", 2));
            }
            arrayList2.addAll(arrayList7);
        }
        return arrayList2;
    }

    public static List LIZJ(boolean z, String str, SearchUserSugResponse searchUserSugResponse) {
        SugExtraInfo sugExtraInfo;
        SugExtraInfo sugExtraInfo2;
        SugExtraInfo sugExtraInfo3;
        ArrayList arrayList = new ArrayList();
        List<? extends SearchSugEntity> list = searchUserSugResponse.sugList;
        if (list != null) {
            boolean z2 = false;
            boolean z3 = false;
            for (SearchSugEntity searchSugEntity : list) {
                if (z) {
                    ISearchUserService iSearchUserService = (ISearchUserService) LIZLLL.getValue();
                    if (iSearchUserService != null && iSearchUserService.LIZLLL()) {
                        if (!z3 && (sugExtraInfo3 = searchSugEntity.sugExtraInfo) != null && sugExtraInfo3.getHasUserRelation()) {
                            arrayList.add(new C0283007t("following"));
                            z3 = true;
                        }
                        if (!z2 && (sugExtraInfo2 = searchSugEntity.sugExtraInfo) != null && !sugExtraInfo2.getHasUserRelation()) {
                            arrayList.add(new C0283007t("all_user"));
                            z2 = true;
                        }
                    } else if (!z2 && (sugExtraInfo = searchSugEntity.sugExtraInfo) != null && !sugExtraInfo.getHasUserRelation()) {
                        arrayList.add(new C0283007t("all_user"));
                        z2 = true;
                    }
                }
                SugExtraInfo sugExtraInfo4 = searchSugEntity.sugExtraInfo;
                if (sugExtraInfo4 != null) {
                    User user = new User();
                    String userId = sugExtraInfo4.getUserId();
                    String str2 = "";
                    if (userId == null) {
                        userId = "";
                    }
                    user.setUid(userId);
                    String secUserId = sugExtraInfo4.getSecUserId();
                    if (secUserId == null) {
                        secUserId = "";
                    }
                    user.setSecUid(secUserId);
                    UrlModel urlModel = new UrlModel();
                    urlModel.setUri(sugExtraInfo4.getUserAvatarUri());
                    urlModel.setUrlList(C1697810uHb.LJIIJJI(sugExtraInfo4.getUserAvatarUri(), sugExtraInfo4.getUserAvatarUri()));
                    user.setAvatarThumb(urlModel);
                    UrlModel urlModel2 = new UrlModel();
                    urlModel2.setUri(sugExtraInfo4.getUserAvatarUri());
                    urlModel2.setUrlList(C1697810uHb.LJIIJJI(sugExtraInfo4.getUserAvatarUri(), sugExtraInfo4.getUserAvatarUri()));
                    user.setAvatarMedium(urlModel2);
                    user.setFollowStatus(sugExtraInfo4.getFollowStatus());
                    user.setFollowerStatus(sugExtraInfo4.getFollowerStatus());
                    String userNickname = sugExtraInfo4.getUserNickname();
                    if (userNickname == null) {
                        userNickname = "";
                    }
                    user.setNickname(userNickname);
                    String username = sugExtraInfo4.getUsername();
                    if (username == null) {
                        username = "";
                    }
                    user.setUniqueId(username);
                    if (sugExtraInfo4.isVerifiedUser()) {
                        str2 = "verified";
                    }
                    user.setCustomVerify(str2);
                    arrayList.add(new C317150Cbx(user, str, "all_user"));
                }
            }
        }
        return arrayList;
    }
}
