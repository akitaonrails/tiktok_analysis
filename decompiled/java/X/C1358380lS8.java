package X;

import android.util.LruCache;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lS8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1358380lS8 {
    public static final C1358380lS8 LIZ = new C1358380lS8();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(484));

    public static C1358510lSL LJ(String str) {
        C1358510lSL c1358510lSLLIZIZ;
        String uid;
        String uid2;
        if (str == null) {
            return null;
        }
        C01GW c01gw = LIZIZ;
        C1358510lSL c1358510lSL = (C1358510lSL) ((LruCache) c01gw.getValue()).get(str);
        C1358880lSw.LIZ.getClass();
        UpvoteList upvoteListLJFF = C1358880lSw.LJFF(str);
        if (upvoteListLJFF == null) {
            return null;
        }
        if (c1358510lSL != null && upvoteListLJFF.timestamp <= c1358510lSL.LIZ) {
            UpvoteStruct upvoteStructLIZJ = C1358940lT2.LIZJ(upvoteListLJFF);
            if (upvoteStructLIZJ == null) {
                c1358510lSLLIZIZ = LJFF(c1358510lSL, C10EU.LIZ().getUid());
            } else {
                c1358510lSLLIZIZ = LIZIZ(c1358510lSL, upvoteStructLIZJ);
            }
            HashSet hashSetLIZJ = C1358880lSw.LIZJ();
            if (!hashSetLIZJ.isEmpty()) {
                List<C1358440lSE> list = c1358510lSLLIZIZ.LIZIZ;
                ArrayList<C1358440lSE> arrayList = new ArrayList();
                for (C1358440lSE c1358440lSE : list) {
                    User user = c1358440lSE.LIZ.user;
                    if (user != null) {
                        uid2 = user.getUid();
                    } else {
                        uid2 = null;
                    }
                    if (!C13LP.LJJJJ(uid2, hashSetLIZJ)) {
                        arrayList.add(c1358440lSE);
                    }
                }
                for (C1358440lSE c1358440lSE2 : arrayList) {
                    int size = c1358440lSE2.LIZIZ.size() - 1;
                    int i = 0;
                    int i2 = 0;
                    int i3 = 0;
                    if (size >= 0) {
                        while (true) {
                            int i4 = size - 1;
                            User user2 = ((RepostReplyStruct) ListProtector.get(c1358440lSE2.LIZIZ, size)).user;
                            if (user2 != null) {
                                uid = user2.getUid();
                            } else {
                                uid = null;
                            }
                            if (C13LP.LJJJJ(uid, hashSetLIZJ)) {
                                ListProtector.remove(c1358440lSE2.LIZIZ, size);
                                i2++;
                                if (size < c1358440lSE2.LIZLLL) {
                                    i3++;
                                }
                            }
                            if (i4 < 0) {
                                break;
                            }
                            size = i4;
                        }
                    }
                    int i5 = c1358440lSE2.LIZLLL - i3;
                    if (i5 >= 0) {
                        i = i5;
                    }
                    c1358440lSE2.LIZLLL = i;
                    long j = c1358440lSE2.LJFF - ((long) i2);
                    if (j < 0) {
                        j = 0;
                    }
                    c1358440lSE2.LJFF = j;
                    C1358770lSl.LJFF(C1358770lSl.LIZ, c1358440lSE2.LIZJ, new AwS600S0100000_21(hashSetLIZJ, (HashSet<String>) 284));
                }
                c1358510lSLLIZIZ = C1358510lSL.LIZ(c1358510lSLLIZIZ, 0L, arrayList, 0L, 13);
            }
            ((LruCache) LIZIZ.getValue()).put(str, c1358510lSLLIZIZ);
            return c1358510lSLLIZIZ;
        }
        C1358510lSL c1358510lSLLJI = LJI(upvoteListLJFF);
        ((LruCache) c01gw.getValue()).put(str, c1358510lSLLJI);
        return c1358510lSLLJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0110  */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1358510lSL LJI(com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList r43) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1358380lS8.LJI(com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList):X.0lSL");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1358380lS8.LIZ(com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct, java.lang.String):void");
    }

    public static C1358510lSL LIZIZ(C1358510lSL c1358510lSL, UpvoteStruct upvoteStruct) {
        String uid;
        Iterator<C1358440lSE> it2 = c1358510lSL.LIZIZ.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            User user = it2.next().LIZ.user;
            String uid2 = null;
            if (user != null) {
                uid = user.getUid();
            } else {
                uid = null;
            }
            User user2 = upvoteStruct.user;
            if (user2 != null) {
                uid2 = user2.getUid();
            }
            if (Intrinsics.LJFF(uid, uid2)) {
                if (i != -1) {
                    C1358440lSE c1358440lSELIZ = C1358440lSE.LIZ((C1358440lSE) ListProtector.get(c1358510lSL.LIZIZ, i), upvoteStruct, null, null, 0, null, 0L, 0L, 126);
                    ArrayList arrayList = new ArrayList(c1358510lSL.LIZIZ);
                    ListProtector.set(arrayList, i, c1358440lSELIZ);
                    return C1358510lSL.LIZ(c1358510lSL, 0L, arrayList, 0L, 13);
                }
            } else {
                i++;
            }
        }
        return C1358510lSL.LIZ(c1358510lSL, 0L, C13LP.LJLIL(c1358510lSL.LIZIZ, Collections.singletonList(new C1358440lSE(upvoteStruct, new ArrayList(), new ArrayList(), 0, C13BV.INSTANCE, 0L, 0L))), c1358510lSL.LIZLLL + 1, 5);
    }

    public static void LIZJ(String str, RepostReplyStruct repostReplyStruct) {
        C1358510lSL c1358510lSLLJ = LJ(str);
        if (c1358510lSLLJ == null) {
            return;
        }
        Iterator<C1358440lSE> it2 = c1358510lSLLJ.LIZIZ.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (Intrinsics.LJFF(it2.next().LIZ.upvoteId, repostReplyStruct.repostId)) {
                if (i != -1) {
                    C1358440lSE c1358440lSE = (C1358440lSE) ListProtector.get(c1358510lSLLJ.LIZIZ, i);
                    int i2 = 0;
                    for (RepostReplyStruct repostReplyStruct2 : c1358440lSE.LIZIZ) {
                        if (!Intrinsics.LJFF(repostReplyStruct2.replyId, repostReplyStruct.replyId) && !C1357960lRS.LIZ(repostReplyStruct2.fakeId, repostReplyStruct.fakeId)) {
                            i2++;
                        } else if (i2 >= 0) {
                            ArrayList arrayList = new ArrayList(c1358440lSE.LIZIZ);
                            ListProtector.remove(arrayList, i2);
                            int i3 = c1358440lSE.LIZLLL - 1;
                            ArrayList arrayList2 = new ArrayList(c1358440lSE.LIZJ);
                            C1358770lSl c1358770lSl = C1358770lSl.LIZ;
                            C1358770lSl.LJFF(c1358770lSl, arrayList2, new AwS600S0100000_21(repostReplyStruct, 282));
                            ArrayList arrayList3 = new ArrayList(c1358440lSE.LJ);
                            C1358770lSl.LJFF(c1358770lSl, arrayList3, new AwS600S0100000_21(repostReplyStruct, 283));
                            C1358440lSE c1358440lSELIZ = C1358440lSE.LIZ(c1358440lSE, null, arrayList, arrayList2, i3, arrayList3, c1358440lSE.LJFF - 1, 0L, 65);
                            ArrayList arrayList4 = new ArrayList(c1358510lSLLJ.LIZIZ);
                            ListProtector.set(arrayList4, i, c1358440lSELIZ);
                            c1358510lSLLJ = C1358510lSL.LIZ(c1358510lSLLJ, 0L, arrayList4, 0L, 13);
                        }
                    }
                }
            } else {
                i++;
            }
        }
        LJIIIIZZ(c1358510lSLLJ, str);
    }

    public static C1358510lSL LJFF(C1358510lSL c1358510lSL, String str) {
        String uid;
        Iterator<C1358440lSE> it2 = c1358510lSL.LIZIZ.iterator();
        int i = 0;
        while (it2.hasNext()) {
            User user = it2.next().LIZ.user;
            if (user != null) {
                uid = user.getUid();
            } else {
                uid = null;
            }
            if (Intrinsics.LJFF(uid, str)) {
                if (i == -1) {
                    return c1358510lSL;
                }
                ArrayList arrayList = new ArrayList(c1358510lSL.LIZIZ);
                ListProtector.remove(arrayList, i);
                return C1358510lSL.LIZ(c1358510lSL, 0L, arrayList, c1358510lSL.LIZLLL - 1, 5);
            }
            i++;
        }
        return c1358510lSL;
    }

    public static void LJIIIIZZ(C1358510lSL c1358510lSL, String str) {
        if (str == null) {
            return;
        }
        ((LruCache) LIZIZ.getValue()).put(str, c1358510lSL);
    }

    public static void LJII(int i, String str, String str2, String str3, boolean z) {
        RepostReplyStruct repostReplyStruct;
        C1358440lSE next;
        List<RepostReplyStruct> list;
        int i2;
        UpvoteStruct upvoteStruct;
        C1358510lSL c1358510lSLLJ = LJ(str);
        if (c1358510lSLLJ == null) {
            return;
        }
        Iterator<C1358440lSE> it2 = c1358510lSLLJ.LIZIZ.iterator();
        while (true) {
            repostReplyStruct = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.LIZ.upvoteId, str2)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1358440lSE c1358440lSE = next;
        if (str3 == null) {
            if (c1358440lSE != null && (upvoteStruct = c1358440lSE.LIZ) != null) {
                upvoteStruct.setLikeCount(i);
                upvoteStruct.setUserLiked(z);
                return;
            }
            return;
        }
        if (c1358440lSE == null || (list = c1358440lSE.LIZIZ) == null) {
            return;
        }
        Iterator<RepostReplyStruct> it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            RepostReplyStruct next2 = it3.next();
            if (Intrinsics.LJFF(next2.replyId, str3)) {
                repostReplyStruct = next2;
                break;
            }
        }
        RepostReplyStruct repostReplyStruct2 = repostReplyStruct;
        if (repostReplyStruct2 == null) {
            return;
        }
        repostReplyStruct2.setDiggCount(Integer.valueOf(i));
        if (z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        repostReplyStruct2.setUserDigged(Integer.valueOf(i2));
    }

    public static void LIZLLL(String str, String str2, int i, List list, Long l, long j) {
        long jLongValue;
        C1358510lSL c1358510lSLLJ = LJ(str);
        if (c1358510lSLLJ == null) {
            return;
        }
        Iterator<C1358440lSE> it2 = c1358510lSLLJ.LIZIZ.iterator();
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (Intrinsics.LJFF(it2.next().LIZ.upvoteId, str2)) {
                if (i2 != -1) {
                    C1358440lSE c1358440lSE = (C1358440lSE) ListProtector.get(c1358510lSLLJ.LIZIZ, i2);
                    List<RepostReplyStruct> list2 = c1358440lSE.LIZIZ;
                    list2.addAll(list);
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = c1358440lSE.LJFF;
                    }
                    int size = list2.size();
                    if (i <= size) {
                        size = i;
                    }
                    C1358440lSE c1358440lSELIZ = C1358440lSE.LIZ(c1358440lSE, null, list2, null, size, null, jLongValue, j, 21);
                    ArrayList arrayList = new ArrayList(c1358510lSLLJ.LIZIZ);
                    ListProtector.set(arrayList, i2, c1358440lSELIZ);
                    c1358510lSLLJ = C1358510lSL.LIZ(c1358510lSLLJ, 0L, arrayList, 0L, 13);
                }
            } else {
                i2++;
            }
        }
        LJIIIIZZ(c1358510lSLLJ, str);
    }
}
