package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.model.MentionRecommendResponse;
import com.ss.android.ugc.aweme.model.UserListWithPagination;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SearchUserSugResponse;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Cbt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C317110Cbt {
    public static final C317110Cbt LIZ = new C317110Cbt();
    public static final Set<String> LIZIZ = new LinkedHashSet();

    public static C317130Cbv LIZ(MentionRecommendResponse mentionRecommendResponse) {
        long j;
        boolean z;
        long j2;
        boolean z2;
        long j3;
        boolean z3;
        long j4 = 0;
        Pair pair = new Pair(0L, Boolean.FALSE);
        UserListWithPagination userListWithPagination = mentionRecommendResponse.friendUserList;
        if (userListWithPagination != null) {
            j = userListWithPagination.offset;
        } else {
            j = 0;
        }
        Long lValueOf = Long.valueOf(j);
        UserListWithPagination userListWithPagination2 = mentionRecommendResponse.friendUserList;
        boolean z4 = false;
        if (userListWithPagination2 != null) {
            z = userListWithPagination2.hasMore;
        } else {
            z = false;
        }
        Pair pair2 = new Pair(lValueOf, Boolean.valueOf(z));
        UserListWithPagination userListWithPagination3 = mentionRecommendResponse.followingUserList;
        if (userListWithPagination3 != null) {
            j2 = userListWithPagination3.offset;
        } else {
            j2 = 0;
        }
        Long lValueOf2 = Long.valueOf(j2);
        UserListWithPagination userListWithPagination4 = mentionRecommendResponse.followingUserList;
        if (userListWithPagination4 != null) {
            z2 = userListWithPagination4.hasMore;
        } else {
            z2 = false;
        }
        Pair pair3 = new Pair(lValueOf2, Boolean.valueOf(z2));
        UserListWithPagination userListWithPagination5 = mentionRecommendResponse.mentionedUserList;
        if (userListWithPagination5 != null) {
            j3 = userListWithPagination5.offset;
        } else {
            j3 = 0;
        }
        Long lValueOf3 = Long.valueOf(j3);
        UserListWithPagination userListWithPagination6 = mentionRecommendResponse.mentionedUserList;
        if (userListWithPagination6 != null) {
            z3 = userListWithPagination6.hasMore;
        } else {
            z3 = false;
        }
        Pair pair4 = new Pair(lValueOf3, Boolean.valueOf(z3));
        UserListWithPagination userListWithPagination7 = mentionRecommendResponse.sortedUserList;
        if (userListWithPagination7 != null) {
            j4 = userListWithPagination7.offset;
        }
        Long lValueOf4 = Long.valueOf(j4);
        UserListWithPagination userListWithPagination8 = mentionRecommendResponse.sortedUserList;
        if (userListWithPagination8 != null) {
            z4 = userListWithPagination8.hasMore;
        }
        return new C317130Cbv(pair, pair2, pair3, pair4, new Pair(lValueOf4, Boolean.valueOf(z4)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        r9.add(r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZJ(com.ss.android.ugc.aweme.model.MentionRecommendResponse r13, java.util.List r14) {
        /*
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            java.util.List<com.ss.android.ugc.aweme.model.MentionCheckResult> r0 = r13.blockResults
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r12 = r0.iterator()
        L1a:
            boolean r0 = r12.hasNext()
            r1 = 0
            r7 = 1
            r5 = 0
            if (r0 == 0) goto L4c
            java.lang.Object r11 = r12.next()
            r0 = r11
            com.ss.android.ugc.aweme.model.MentionCheckResult r0 = (com.ss.android.ugc.aweme.model.MentionCheckResult) r0
            java.util.List<com.ss.android.ugc.aweme.model.MentionCheckSingleTypeResult> r0 = r0.userBlockedResults
            java.util.Iterator r10 = r0.iterator()
        L30:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L48
            java.lang.Object r8 = r10.next()
            r0 = r8
            com.ss.android.ugc.aweme.model.MentionCheckSingleTypeResult r0 = (com.ss.android.ugc.aweme.model.MentionCheckSingleTypeResult) r0
            long r0 = r0.blockType
            r6 = 0
            int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r5 != 0) goto L30
            if (r8 == 0) goto L48
            goto L1a
        L48:
            r9.add(r11)
            goto L1a
        L4c:
            java.util.Iterator r6 = r9.iterator()
        L50:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L62
            java.lang.Object r0 = r6.next()
            com.ss.android.ugc.aweme.model.MentionCheckResult r0 = (com.ss.android.ugc.aweme.model.MentionCheckResult) r0
            java.lang.String r0 = r0.uid
            r4.add(r0)
            goto L50
        L62:
            com.ss.android.ugc.aweme.model.UserListWithPagination r0 = r13.mentionedUserList
            if (r0 == 0) goto La1
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r0 = r0.userList
        L68:
            LIZIZ(r4, r2, r3, r0, r7)
            com.ss.android.ugc.aweme.model.UserListWithPagination r0 = r13.sortedUserList
            if (r0 == 0) goto L7e
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r0 = r0.userList
            LIZIZ(r4, r2, r3, r0, r1)
        L74:
            java.util.Set<java.lang.String> r0 = X.C317110Cbt.LIZIZ
            r0.addAll(r2)
            java.util.List r0 = X.C13LP.LJJJJI(r3)
            return r0
        L7e:
            LIZIZ(r4, r2, r3, r14, r1)
            com.ss.android.ugc.aweme.model.UserListWithPagination r0 = r13.recentUserList
            if (r0 == 0) goto L9f
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r0 = r0.userList
        L87:
            LIZIZ(r4, r2, r3, r0, r1)
            com.ss.android.ugc.aweme.model.UserListWithPagination r0 = r13.friendUserList
            if (r0 == 0) goto L9d
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r0 = r0.userList
        L90:
            LIZIZ(r4, r2, r3, r0, r1)
            com.ss.android.ugc.aweme.model.UserListWithPagination r0 = r13.followingUserList
            if (r0 == 0) goto L99
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r5 = r0.userList
        L99:
            LIZIZ(r4, r2, r3, r5, r1)
            goto L74
        L9d:
            r0 = r5
            goto L90
        L9f:
            r0 = r5
            goto L87
        La1:
            r0 = r5
            goto L68
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C317110Cbt.LIZJ(com.ss.android.ugc.aweme.model.MentionRecommendResponse, java.util.List):java.util.List");
    }

    public static List LIZLLL(String str, SearchUserSugResponse searchUserSugResponse) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        List<? extends SearchSugEntity> list = searchUserSugResponse.sugList;
        if (list != null) {
            Iterator<? extends SearchSugEntity> it2 = list.iterator();
            while (it2.hasNext()) {
                SugExtraInfo sugExtraInfo = it2.next().sugExtraInfo;
                if (sugExtraInfo != null) {
                    LIZ.getClass();
                    User user = new User();
                    String userId = sugExtraInfo.getUserId();
                    String str2 = "";
                    if (userId == null) {
                        userId = "";
                    }
                    user.setUid(userId);
                    String secUserId = sugExtraInfo.getSecUserId();
                    if (secUserId == null) {
                        secUserId = "";
                    }
                    user.setSecUid(secUserId);
                    UrlModel urlModel = new UrlModel();
                    urlModel.setUri(sugExtraInfo.getUserAvatarUri());
                    urlModel.setUrlList(C1697810uHb.LJIIJJI(sugExtraInfo.getUserAvatarUri(), sugExtraInfo.getUserAvatarUri()));
                    user.setAvatarThumb(urlModel);
                    UrlModel urlModel2 = new UrlModel();
                    urlModel2.setUri(sugExtraInfo.getUserAvatarUri());
                    urlModel2.setUrlList(C1697810uHb.LJIIJJI(sugExtraInfo.getUserAvatarUri(), sugExtraInfo.getUserAvatarUri()));
                    user.setAvatarMedium(urlModel2);
                    String userNickname = sugExtraInfo.getUserNickname();
                    if (userNickname == null) {
                        userNickname = "";
                    }
                    user.setNickname(userNickname);
                    String username = sugExtraInfo.getUsername();
                    if (username != null) {
                        str2 = username;
                    }
                    user.setUniqueId(str2);
                    if (sugExtraInfo.getMentionBlockType() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList.add(new C317160Cby(user, str, false, z, null, 20));
                }
            }
        }
        return arrayList;
    }

    public static final void LIZIZ(Set<String> set, Set<String> set2, List<C317160Cby> list, List<? extends User> list2, boolean z) {
        if (list2 == null) {
            return;
        }
        ArrayList<User> arrayList = new ArrayList();
        for (User user : list2) {
            if (!LIZIZ.contains(user.getUid())) {
                arrayList.add(user);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (User user2 : arrayList) {
            arrayList2.add(new C317160Cby(user2, "", z, set.contains(user2.getUid()), null, 16));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (hashSet.add(((C317160Cby) obj).LL.getUid())) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (!set2.contains(((C317160Cby) obj2).LL.getUid())) {
                arrayList4.add(obj2);
            }
        }
        ((ArrayList) list).addAll(arrayList4);
        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList4, 10));
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            arrayList5.add(((C317160Cby) it2.next()).LL.getUid());
        }
        set2.addAll(arrayList5);
    }
}
