package X;

import Y.AComparatorS516S0100000_19;
import android.util.LruCache;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.affinity.model.SocialAffinityItem;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.upvote.CarrierType;
import com.ss.android.ugc.aweme.feed.model.upvote.CommentInfoStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.PublishFrom;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteCacheState;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lSw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1358880lSw {
    public static final C1358880lSw LIZ = new C1358880lSw();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1358920lT0());
    public static final Map<String, Long> LIZJ = new LinkedHashMap();
    public static final Map<String, String> LIZLLL = new LinkedHashMap();
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(13));
    public static final Map<String, String> LJFF = new LinkedHashMap();
    public static final HashSet<String> LJI = new HashSet<>();
    public static final C01GW LJII = C452501pT.LIZIZ(new C1358910lSz());
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(new C1358900lSy());
    public static final HashMap<String, String> LJIIIZ = new HashMap<>();

    public static HashSet LIZJ() {
        return (HashSet) LJII.getValue();
    }

    public static LruCache LJI() {
        return (LruCache) LJIIIIZZ.getValue();
    }

    public static String LIZLLL(String str) {
        return (String) ((LinkedHashMap) LIZLLL).get(str);
    }

    public static UpvoteList LJFF(String str) {
        UpvoteList upvoteList;
        ArrayList arrayList;
        String uid;
        String uid2;
        if (str == null || (upvoteList = (UpvoteList) LJI().get(str)) == null) {
            return null;
        }
        List<UpvoteStruct> list = upvoteList.upvotes;
        ArrayList arrayList2 = new ArrayList();
        for (UpvoteStruct upvoteStruct : list) {
            LIZ.getClass();
            HashSet hashSetLIZJ = LIZJ();
            User user = upvoteStruct.user;
            if (user != null) {
                uid2 = user.getUid();
            } else {
                uid2 = null;
            }
            if (!C13LP.LJJJJ(uid2, hashSetLIZJ)) {
                arrayList2.add(upvoteStruct);
            }
        }
        List<UpvoteStruct> list2 = upvoteList.mafUpvotes;
        if (list2 != null) {
            arrayList = new ArrayList();
            for (UpvoteStruct upvoteStruct2 : list2) {
                LIZ.getClass();
                HashSet hashSetLIZJ2 = LIZJ();
                User user2 = upvoteStruct2.user;
                if (user2 != null) {
                    uid = user2.getUid();
                } else {
                    uid = null;
                }
                if (!C13LP.LJJJJ(uid, hashSetLIZJ2)) {
                    arrayList.add(upvoteStruct2);
                }
            }
        } else {
            arrayList = null;
        }
        return upvoteList.copy(arrayList2, upvoteList.cursor, upvoteList.hasMore, upvoteList.total - ((long) (upvoteList.upvotes.size() - arrayList2.size())), upvoteList.itemId, upvoteList.emojis, upvoteList.repostCount, upvoteList.carrierUpvotes, arrayList, upvoteList.insertUid, upvoteList.forceInsertRepostUids, upvoteList.timestamp);
    }

    public static boolean LJII(String str) {
        UpvoteList upvoteList;
        String uid;
        if (str == null || (upvoteList = (UpvoteList) LJI().get(str)) == null) {
            return false;
        }
        List<UpvoteStruct> list = upvoteList.upvotes;
        ArrayList arrayList = new ArrayList();
        for (UpvoteStruct upvoteStruct : list) {
            LIZ.getClass();
            HashSet hashSetLIZJ = LIZJ();
            User user = upvoteStruct.user;
            if (user != null) {
                uid = user.getUid();
            } else {
                uid = null;
            }
            if (true ^ C13LP.LJJJJ(uid, hashSetLIZJ)) {
                arrayList.add(upvoteStruct);
            }
        }
        int size = upvoteList.upvotes.size() - arrayList.size();
        if (!(!arrayList.isEmpty()) || upvoteList.total - ((long) size) <= 0) {
            return false;
        }
        return true;
    }

    public static void LJIIIIZZ(String str) {
        List<UpvoteStruct> list;
        String uid;
        long j;
        String uid2;
        String uid3 = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getUid();
        UpvoteList upvoteList = (UpvoteList) LJI().get(str);
        if (upvoteList != null && (list = upvoteList.upvotes) != null) {
            for (UpvoteStruct upvoteStruct : list) {
                User user = upvoteStruct.user;
                if (user != null) {
                    uid = user.getUid();
                } else {
                    uid = null;
                }
                if (Intrinsics.LJFF(uid, uid3)) {
                    if (upvoteStruct != null) {
                        ArrayList arrayList = new ArrayList(upvoteList.upvotes);
                        arrayList.remove(upvoteStruct);
                        List<UpvoteStruct> commentUpvotes = upvoteList.getCommentUpvotes();
                        ArrayList arrayList2 = new ArrayList();
                        for (UpvoteStruct upvoteStruct2 : commentUpvotes) {
                            User user2 = upvoteStruct2.user;
                            if (user2 != null) {
                                uid2 = user2.getUid();
                            } else {
                                uid2 = null;
                            }
                            if (!Intrinsics.LJFF(uid2, uid3)) {
                                arrayList2.add(upvoteStruct2);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            j = 0;
                        } else {
                            j = upvoteList.repostCount - 1;
                        }
                        LJI().put(str, upvoteList.copy(arrayList, upvoteList.cursor, upvoteList.hasMore, upvoteList.total - 1, upvoteList.itemId, upvoteList.emojis, j, upvoteList.carrierUpvotes, upvoteList.mafUpvotes, upvoteList.insertUid, upvoteList.forceInsertRepostUids, upvoteList.timestamp).withCommentUpvotes(arrayList2));
                        LJI.add(str);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public static UpvoteStruct LIZ(User user, String str) {
        return new UpvoteStruct(null, null, str, System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT), 0, user, 0, null, 0, false, 0, false, null, null, null, null, false, null, 0, 0, 0, null, null, UpvoteCacheState.PRE_PUBLISH, PublishFrom.ONLY_REPOST, 8388563, null);
    }

    public static PublishFrom LJ(boolean z, boolean z2) {
        if (z) {
            if (z2) {
                return PublishFrom.ADD_TEXT;
            }
            return PublishFrom.DEFAULT;
        }
        if (z2) {
            return PublishFrom.REPOST_AND_TEXT;
        }
        return PublishFrom.ONLY_REPOST;
    }

    public static void LJIIIZ(UpvoteStruct upvoteStruct, String str) {
        if (LJI().get(str) == null) {
            LJI().put(str, new UpvoteList(Collections.singletonList(upvoteStruct), 0L, false, 1L, null, null, 1L, null, null, null, null, System.currentTimeMillis(), 1974, null));
            return;
        }
        UpvoteList upvoteList = (UpvoteList) LJI().get(str);
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        Iterator<UpvoteStruct> it2 = upvoteList.upvotes.iterator();
        while (true) {
            String uid = null;
            if (!it2.hasNext()) {
                break;
            }
            UpvoteStruct next = it2.next();
            User user = next.user;
            if (user != null) {
                uid = user.getUid();
            }
            if (Intrinsics.LJFF(uid, curUser.getUid())) {
                if (next != null) {
                    int iIndexOf = upvoteList.upvotes.indexOf(next);
                    ArrayList arrayList = new ArrayList(upvoteList.upvotes);
                    ListProtector.set(arrayList, iIndexOf, upvoteStruct);
                    LJI().put(str, upvoteList.copy(arrayList, upvoteList.cursor, upvoteList.hasMore, upvoteList.total, upvoteList.itemId, upvoteList.emojis, upvoteList.repostCount, upvoteList.carrierUpvotes, upvoteList.mafUpvotes, upvoteList.insertUid, upvoteList.forceInsertRepostUids, upvoteList.timestamp));
                    return;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(upvoteList.upvotes);
        ListProtector.add(arrayList2, 0, upvoteStruct);
        LJI().put(str, upvoteList.copy(arrayList2, upvoteList.cursor, upvoteList.hasMore, upvoteList.total + 1, upvoteList.itemId, upvoteList.emojis, 1 + upvoteList.repostCount, upvoteList.carrierUpvotes, upvoteList.mafUpvotes, upvoteList.insertUid, upvoteList.forceInsertRepostUids, upvoteList.timestamp));
    }

    public static List LJIIJJI(String str, List list) {
        List listSingletonList;
        String uid;
        String uid2;
        if (!((Boolean) C263690AVb.LIZ.getValue()).booleanValue()) {
            return list;
        }
        if (str != null) {
            listSingletonList = Collections.singletonList(str);
        } else {
            listSingletonList = null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list);
        if (listSingletonList != null) {
            for (Object obj : listSingletonList) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        User user = ((UpvoteStruct) next).user;
                        if (user != null) {
                            uid2 = user.getUid();
                        } else {
                            uid2 = null;
                        }
                        if (Intrinsics.LJFF(uid2, obj)) {
                            if (next != null) {
                                arrayList.add(next);
                                arrayList2.remove(next);
                            }
                        }
                    }
                }
            }
        }
        Map<String, SocialAffinityItem> mapLIZIZ = C1610960s1W.LIZIZ.LIZIZ("repost_sort");
        if (mapLIZIZ == null) {
            if (!arrayList.isEmpty()) {
                return C13LP.LJLIL(arrayList2, arrayList);
            }
            return list;
        }
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        Iterator it3 = arrayList2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next2 = it3.next();
            User user2 = ((UpvoteStruct) next2).user;
            if (user2 != null) {
                uid = user2.getUid();
            } else {
                uid = null;
            }
            if (Intrinsics.LJFF(uid, curUserId)) {
                if (next2 != null) {
                    arrayList.add(next2);
                    arrayList2.remove(next2);
                }
            }
        }
        if (((Boolean) C263760AVi.LIZ.getValue()).booleanValue()) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (C1359720lUI.LJ((UpvoteStruct) obj2)) {
                    arrayList3.add(obj2);
                }
            }
            List listLJLLLL = C13LP.LJLLLL(new AComparatorS516S0100000_19(mapLIZIZ, 1), arrayList3);
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : arrayList2) {
                if (!C1359720lUI.LJ((UpvoteStruct) obj3)) {
                    arrayList4.add(obj3);
                }
            }
            List listLJLLLL2 = C13LP.LJLLLL(new AComparatorS516S0100000_19(mapLIZIZ, 2), arrayList4);
            arrayList.addAll(listLJLLLL);
            arrayList.addAll(listLJLLLL2);
            return arrayList;
        }
        arrayList.addAll(C13LP.LJLLLL(new AComparatorS516S0100000_19(mapLIZIZ, 3), arrayList2));
        return arrayList;
    }

    public static UpvoteStruct LIZIZ(String str, User user, String str2, String str3, List list, Comment comment) {
        CommentInfoStruct commentInfoStruct;
        int value = CarrierType.COMMENT.getValue();
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        UpvoteCacheState upvoteCacheState = UpvoteCacheState.PRE_PUBLISH;
        if (comment != null) {
            commentInfoStruct = new CommentInfoStruct(comment, null);
        } else {
            commentInfoStruct = null;
        }
        return new UpvoteStruct(null, null, str, jCurrentTimeMillis, 0, user, 0, null, 0, false, 0, false, str3, null, list, null, false, null, 0, 0, value, str2, commentInfoStruct, upvoteCacheState, null, 17805267, null);
    }

    public static void LJIIJ(int i, UpvoteList upvoteList, String str, String str2, boolean z, boolean z2) {
        String str3;
        String uid;
        List<UpvoteStruct> list;
        String uid2;
        long j;
        for (UpvoteStruct upvoteStruct : upvoteList.upvotes) {
            if (!C1359720lUI.LJII(upvoteStruct.user)) {
                upvoteStruct.setText(null);
                upvoteStruct.setTextExtra(null);
            }
        }
        List<UpvoteStruct> list2 = upvoteList.mafUpvotes;
        if (list2 != null) {
            for (UpvoteStruct upvoteStruct2 : list2) {
                if (!C1359720lUI.LJII(upvoteStruct2.user)) {
                    upvoteStruct2.setText(null);
                    upvoteStruct2.setTextExtra(null);
                }
            }
        }
        UpvoteList upvoteList2 = (UpvoteList) LJI().get(str);
        if (str2 == null) {
            str3 = upvoteList.insertUid;
        } else {
            str3 = str2;
        }
        UpvoteStruct next = null;
        UpvoteList upvoteListCopy = upvoteList.copy(LJIIJJI(str3, upvoteList.upvotes), upvoteList.cursor, upvoteList.hasMore, upvoteList.total, upvoteList.itemId, upvoteList.emojis, upvoteList.repostCount, upvoteList.carrierUpvotes, upvoteList.mafUpvotes, str2, upvoteList.forceInsertRepostUids, upvoteList.timestamp);
        if (z2 && C703302op.LIZ(str2)) {
            upvoteListCopy = upvoteListCopy.copy(upvoteListCopy.upvotes, upvoteListCopy.cursor, upvoteListCopy.hasMore, upvoteListCopy.total, upvoteListCopy.itemId, upvoteListCopy.emojis, upvoteListCopy.repostCount, upvoteListCopy.carrierUpvotes, upvoteListCopy.mafUpvotes, upvoteListCopy.insertUid, Collections.singletonList(str2), upvoteListCopy.timestamp);
        }
        boolean z3 = true;
        if (upvoteList2 != null && !z) {
            if (upvoteListCopy.cursor == upvoteList2.cursor + ((long) i)) {
                List<UpvoteStruct> list3 = upvoteList2.upvotes;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list3, 10));
                Iterator<UpvoteStruct> it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().upvoteId);
                }
                Set setLLIIJI = C13LP.LLIIJI(arrayList);
                ArrayList arrayList2 = new ArrayList(upvoteList2.upvotes);
                List<UpvoteStruct> list4 = upvoteListCopy.upvotes;
                ArrayList arrayList3 = new ArrayList();
                for (UpvoteStruct upvoteStruct3 : list4) {
                    if (!setLLIIJI.contains(upvoteStruct3.upvoteId)) {
                        arrayList3.add(upvoteStruct3);
                    }
                }
                arrayList2.addAll(arrayList3);
                C01GW c01gw = C287260BNs.LIZ;
                if (((Number) c01gw.getValue()).intValue() != 1 && ((Number) c01gw.getValue()).intValue() != 2) {
                    j = upvoteListCopy.total;
                } else {
                    j = upvoteList2.total;
                }
                long j2 = upvoteList2.repostCount;
                long jCurrentTimeMillis = System.currentTimeMillis();
                List<String> list5 = upvoteList2.forceInsertRepostUids;
                if (list5 == null) {
                    list5 = upvoteListCopy.forceInsertRepostUids;
                }
                LJI().put(str, upvoteListCopy.copy(arrayList2, upvoteListCopy.cursor, upvoteListCopy.hasMore, j, upvoteListCopy.itemId, upvoteListCopy.emojis, j2, upvoteListCopy.carrierUpvotes, upvoteListCopy.mafUpvotes, upvoteListCopy.insertUid, list5, jCurrentTimeMillis));
                return;
            }
            return;
        }
        LruCache lruCacheLJI = LJI();
        UpvoteList upvoteList3 = (UpvoteList) LJI().get(upvoteListCopy.itemId);
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (upvoteList3 != null && (list = upvoteList3.upvotes) != null) {
            Iterator<UpvoteStruct> it3 = list.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = it3.next();
                    UpvoteStruct upvoteStruct4 = next;
                    User user = upvoteStruct4.user;
                    if (user != null) {
                        uid2 = user.getUid();
                    } else {
                        uid2 = null;
                    }
                    if (Intrinsics.LJFF(uid2, curUserId) && upvoteStruct4.isFake()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
        }
        List<UpvoteStruct> list6 = upvoteListCopy.upvotes;
        if ((list6 instanceof Collection) && list6.isEmpty()) {
            z3 = false;
        } else {
            Iterator<UpvoteStruct> it4 = list6.iterator();
            while (it4.hasNext()) {
                User user2 = it4.next().user;
                if (user2 != null) {
                    uid = user2.getUid();
                } else {
                    uid = null;
                }
                if (Intrinsics.LJFF(uid, curUserId)) {
                    break;
                }
            }
            z3 = false;
        }
        if (next != null && !z3) {
            ArrayList arrayList4 = new ArrayList(upvoteListCopy.upvotes);
            ListProtector.add(arrayList4, 0, next);
            upvoteListCopy = upvoteListCopy.copy(arrayList4, upvoteListCopy.cursor, upvoteListCopy.hasMore, upvoteListCopy.total + 1, upvoteListCopy.itemId, upvoteListCopy.emojis, 1 + upvoteListCopy.repostCount, upvoteListCopy.carrierUpvotes, upvoteListCopy.mafUpvotes, upvoteListCopy.insertUid, upvoteListCopy.forceInsertRepostUids, upvoteListCopy.timestamp);
        }
        lruCacheLJI.put(str, upvoteListCopy);
    }
}
