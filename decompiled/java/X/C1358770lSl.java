package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lSl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1358770lSl {
    public static final C1358770lSl LIZ = new C1358770lSl();

    public static boolean LIZLLL(User user) {
        if (user.getFollowStatus() == 2 || user.getFollowStatus() == 1) {
            return true;
        }
        return false;
    }

    public static boolean LJ(UpvoteStruct upvoteStruct) {
        User user;
        if (!upvoteStruct.isRecommendMaf() || (user = upvoteStruct.user) == null || LIZLLL(user)) {
            return false;
        }
        return true;
    }

    public static UpvoteList LJI(UpvoteList upvoteList) {
        long j;
        UpvoteStruct upvoteStructLIZJ = C1358940lT2.LIZJ(upvoteList);
        if (upvoteStructLIZJ == null) {
            return upvoteList;
        }
        ArrayList arrayList = new ArrayList(upvoteList.upvotes);
        arrayList.remove(upvoteStructLIZJ);
        if (arrayList.isEmpty()) {
            j = 0;
        } else {
            j = upvoteList.repostCount - 1;
        }
        return upvoteList.copy(arrayList, upvoteList.cursor, upvoteList.hasMore, upvoteList.total - 1, upvoteList.itemId, upvoteList.emojis, j, upvoteList.carrierUpvotes, upvoteList.mafUpvotes, upvoteList.insertUid, upvoteList.forceInsertRepostUids, upvoteList.timestamp);
    }

    public static String LJII(UpvoteStruct upvoteStruct) {
        String str = upvoteStruct.upvoteId;
        if (str.length() <= 0 && 0 == 0) {
            String str2 = upvoteStruct.carrierId;
            if (str2 == null || str2.length() <= 0) {
                return null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fake_");
            sbLIZ.append(str2);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    public static UpvoteList LIZ(UpvoteList upvoteList, UpvoteStruct upvoteStruct) {
        long j;
        UpvoteStruct upvoteStructLIZJ = C1358940lT2.LIZJ(upvoteList);
        if (upvoteStructLIZJ == null) {
            if (upvoteList.upvotes.isEmpty()) {
                j = 1;
            } else {
                j = upvoteList.repostCount + 1;
            }
            ArrayList arrayList = new ArrayList(upvoteList.upvotes);
            ListProtector.add(arrayList, 0, upvoteStruct);
            return upvoteList.copy(arrayList, upvoteList.cursor, upvoteList.hasMore, 1 + upvoteList.total, upvoteList.itemId, upvoteList.emojis, j, upvoteList.carrierUpvotes, upvoteList.mafUpvotes, upvoteList.insertUid, upvoteList.forceInsertRepostUids, upvoteList.timestamp);
        }
        int iIndexOf = upvoteList.upvotes.indexOf(upvoteStructLIZJ);
        ArrayList arrayList2 = new ArrayList(upvoteList.upvotes);
        ListProtector.set(arrayList2, iIndexOf, upvoteStruct);
        return upvoteList.copy(arrayList2, upvoteList.cursor, upvoteList.hasMore, upvoteList.total, upvoteList.itemId, upvoteList.emojis, upvoteList.repostCount, upvoteList.carrierUpvotes, upvoteList.mafUpvotes, upvoteList.insertUid, upvoteList.forceInsertRepostUids, upvoteList.timestamp);
    }

    public static UpvoteList LIZIZ(UpvoteList upvoteList, String str) {
        ArrayList arrayList;
        String uid;
        List<UpvoteStruct> list = upvoteList.upvotes;
        ArrayList arrayList2 = new ArrayList();
        Iterator<UpvoteStruct> it2 = list.iterator();
        while (true) {
            String uid2 = null;
            if (!it2.hasNext()) {
                break;
            }
            UpvoteStruct next = it2.next();
            User user = next.user;
            if (user != null) {
                uid2 = user.getUid();
            }
            if (!Intrinsics.LJFF(uid2, str)) {
                arrayList2.add(next);
            }
        }
        List<UpvoteStruct> list2 = upvoteList.mafUpvotes;
        if (list2 != null) {
            arrayList = new ArrayList();
            for (UpvoteStruct upvoteStruct : list2) {
                User user2 = upvoteStruct.user;
                if (user2 != null) {
                    uid = user2.getUid();
                } else {
                    uid = null;
                }
                if (!Intrinsics.LJFF(uid, str)) {
                    arrayList.add(upvoteStruct);
                }
            }
        } else {
            arrayList = null;
        }
        long size = upvoteList.upvotes.size() - arrayList2.size();
        return upvoteList.copy(arrayList2, upvoteList.cursor, upvoteList.hasMore, upvoteList.total - size, upvoteList.itemId, upvoteList.emojis, upvoteList.repostCount - size, upvoteList.carrierUpvotes, arrayList, upvoteList.insertUid, upvoteList.forceInsertRepostUids, upvoteList.timestamp);
    }

    public static UpvoteList LIZJ(UpvoteList upvoteList, String str) {
        String uid;
        List<UpvoteStruct> list = upvoteList.mafUpvotes;
        if (list == null) {
            return upvoteList;
        }
        for (UpvoteStruct upvoteStruct : list) {
            UpvoteStruct upvoteStruct2 = upvoteStruct;
            User user = upvoteStruct2.user;
            if (user != null) {
                uid = user.getUid();
            } else {
                uid = null;
            }
            if (Intrinsics.LJFF(uid, str) && upvoteStruct2.isRecommendMaf()) {
                if (upvoteStruct == null) {
                    return upvoteList;
                }
                C1358880lSw c1358880lSw = C1358880lSw.LIZ;
                ArrayList arrayList = new ArrayList(upvoteList.upvotes);
                arrayList.add(upvoteStruct);
                String str2 = upvoteList.insertUid;
                c1358880lSw.getClass();
                List<UpvoteStruct> listLJIIJJI = C1358880lSw.LJIIJJI(str2, arrayList);
                ArrayList arrayList2 = new ArrayList(list);
                arrayList2.remove(upvoteStruct);
                return upvoteList.copy(listLJIIJJI, upvoteList.cursor, upvoteList.hasMore, upvoteList.total + 1, upvoteList.itemId, upvoteList.emojis, upvoteList.repostCount, upvoteList.carrierUpvotes, arrayList2, upvoteList.insertUid, upvoteList.forceInsertRepostUids, upvoteList.timestamp);
            }
        }
        return upvoteList;
    }

    public static UpvoteList LJIIIIZZ(UpvoteList upvoteList, String str) {
        String uid;
        List<UpvoteStruct> list = upvoteList.upvotes;
        List<UpvoteStruct> list2 = upvoteList.mafUpvotes;
        Iterator<UpvoteStruct> it2 = list.iterator();
        while (true) {
            ArrayList arrayList = null;
            if (!it2.hasNext()) {
                return upvoteList;
            }
            UpvoteStruct next = it2.next();
            UpvoteStruct upvoteStruct = next;
            User user = upvoteStruct.user;
            if (user != null) {
                uid = user.getUid();
            } else {
                uid = null;
            }
            if (Intrinsics.LJFF(uid, str) && upvoteStruct.isRecommendMaf()) {
                if (next == null) {
                    return upvoteList;
                }
                ArrayList arrayList2 = new ArrayList(list);
                arrayList2.remove(next);
                if (list2 != null) {
                    arrayList = new ArrayList(list2);
                    arrayList.add(next);
                }
                return upvoteList.copy(arrayList2, upvoteList.cursor, upvoteList.hasMore, upvoteList.total - 1, upvoteList.itemId, upvoteList.emojis, upvoteList.repostCount, upvoteList.carrierUpvotes, arrayList, upvoteList.insertUid, upvoteList.forceInsertRepostUids, upvoteList.timestamp);
            }
        }
    }

    public static void LJFF(C1358770lSl c1358770lSl, List list, Function1 function1) {
        c1358770lSl.getClass();
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            listIterator.nextIndex();
            if (((Boolean) function1.invoke(listIterator.next())).booleanValue()) {
                listIterator.remove();
            }
        }
    }
}
