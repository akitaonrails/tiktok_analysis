package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteCacheState;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteReason;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.api.UpvoteApi;
import com.ss.android.ugc.aweme.upvote.experiment.UpvoteBatchQpsCutoffExp;
import com.ss.android.ugc.aweme.upvote.model.UpvoteReasonRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lT3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1358950lT3 {
    public static final C1358950lT3 LIZ;
    public static final C01GW LIZIZ;
    public static final C01GW LIZJ;
    public static final C01GW LIZLLL;
    public static final C01GW LJ;
    public static int LJFF;
    public static volatile boolean LJI;

    static {
        C1358950lT3 c1358950lT3 = new C1358950lT3();
        LIZ = c1358950lT3;
        LIZIZ = C452501pT.LIZIZ(new C1260840iuo());
        LIZJ = C452501pT.LIZIZ(new C1359080lTG());
        LIZLLL = C452501pT.LIZIZ(new C1358980lT6());
        LJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(25));
        LJI = true;
        C622680Oba.LIZJ(c1358950lT3);
    }

    public static String LIZIZ() {
        return (String) LJ.getValue();
    }

    public static HashMap LIZJ() {
        return (HashMap) LIZIZ.getValue();
    }

    public static UpvoteList LJIIIZ(UpvoteList upvoteList) {
        List<UpvoteStruct> list = upvoteList.upvotes;
        ArrayList arrayList = new ArrayList();
        for (UpvoteStruct upvoteStruct : list) {
            if (!upvoteStruct.isRecommendMaf()) {
                arrayList.add(upvoteStruct);
            }
        }
        List<UpvoteStruct> list2 = upvoteList.upvotes;
        ArrayList arrayList2 = new ArrayList();
        for (UpvoteStruct upvoteStruct2 : list2) {
            if (upvoteStruct2.isRecommendMaf()) {
                arrayList2.add(upvoteStruct2);
            }
        }
        return upvoteList.copy(arrayList, upvoteList.cursor, upvoteList.hasMore, arrayList.size(), upvoteList.itemId, upvoteList.emojis, upvoteList.repostCount, upvoteList.carrierUpvotes, arrayList2, upvoteList.insertUid, upvoteList.forceInsertRepostUids, upvoteList.timestamp);
    }

    public final void LJFF(String str) {
        C1358880lSw.LIZ.getClass();
        C1358880lSw.LJIIIIZZ(str);
        if (C1359110lTJ.LIZ()) {
            C1358380lS8 c1358380lS8 = C1358380lS8.LIZ;
            String uid = C10EU.LIZ().getUid();
            c1358380lS8.getClass();
            C1358510lSL c1358510lSLLJ = C1358380lS8.LJ(str);
            if (c1358510lSLLJ != null) {
                C1358380lS8.LJIIIIZZ(C1358380lS8.LJFF(c1358510lSLLJ, uid), str);
            }
        }
        getClass();
        LIZLLL(str, "delete_success", false);
    }

    @C14EU
    public final void onBlockUserSuccessEvent(C1479605qk c1479605qk) {
        C1358880lSw c1358880lSw = C1358880lSw.LIZ;
        String str = c1479605qk.LIZ;
        if (str == null) {
            str = "";
        }
        c1358880lSw.getClass();
        C1358880lSw.LIZJ().add(str);
        for (Map.Entry entry : LIZJ().entrySet()) {
            C1358950lT3 c1358950lT3 = LIZ;
            String str2 = (String) entry.getKey();
            c1358950lT3.getClass();
            LIZLLL(str2, "unknown", false);
        }
    }

    @C14EU
    public final void onUserBlocked(C888460YtI c888460YtI) {
        String uid;
        C1358880lSw c1358880lSw = C1358880lSw.LIZ;
        User user = c888460YtI.LIZ;
        if (user == null || (uid = user.getUid()) == null) {
            uid = "";
        }
        c1358880lSw.getClass();
        C1358880lSw.LIZJ().add(uid);
        for (Map.Entry entry : LIZJ().entrySet()) {
            C1358950lT3 c1358950lT3 = LIZ;
            String str = (String) entry.getKey();
            c1358950lT3.getClass();
            LIZLLL(str, "unknown", false);
        }
    }

    @C14EU
    public final void onUserUnBlocked(C486890J7n c486890J7n) {
        String uid;
        C1358880lSw c1358880lSw = C1358880lSw.LIZ;
        User user = c486890J7n.LIZ;
        if (user == null || (uid = user.getUid()) == null) {
            uid = "";
        }
        c1358880lSw.getClass();
        C1358880lSw.LIZJ().remove(uid);
        for (Map.Entry entry : LIZJ().entrySet()) {
            C1358950lT3 c1358950lT3 = LIZ;
            String str = (String) entry.getKey();
            c1358950lT3.getClass();
            LIZLLL(str, "unknown", false);
        }
    }

    public static UpvoteList LJIIJ(Aweme aweme, InterfaceC1359100lTI interfaceC1359100lTI) {
        String aid = aweme.getAid();
        List arrayList = (List) LIZJ().get(aid);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (!arrayList.contains(interfaceC1359100lTI)) {
            arrayList.add(interfaceC1359100lTI);
        }
        LIZJ().put(aid, arrayList);
        C1358880lSw.LIZ.getClass();
        return C1358880lSw.LJFF(aid);
    }

    public static void LJIIJJI(String str, InterfaceC1359100lTI interfaceC1359100lTI) {
        List list = (List) LIZJ().get(str);
        if (list != null) {
            list.remove(interfaceC1359100lTI);
            if (list.isEmpty()) {
                LIZJ().remove(str);
            }
        }
        if (LIZJ().isEmpty()) {
            ((C11NJ) LIZJ.getValue()).LJ();
        }
    }

    public final void LJIIL(String str, UpvoteCacheState upvoteCacheState) {
        Object uid;
        C1358880lSw.LIZ.getClass();
        if (C1358880lSw.LJI().get(str) != null) {
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            Iterator<UpvoteStruct> it2 = ((UpvoteList) C1358880lSw.LJI().get(str)).upvotes.iterator();
            while (true) {
                uid = null;
                if (!it2.hasNext()) {
                    break;
                }
                UpvoteStruct next = it2.next();
                User user = next.user;
                if (user != null) {
                    uid = user.getUid();
                }
                if (Intrinsics.LJFF(uid, curUserId)) {
                    uid = next;
                    break;
                }
            }
            UpvoteStruct upvoteStruct = (UpvoteStruct) uid;
            if (upvoteStruct != null) {
                upvoteStruct.setCacheState(upvoteCacheState);
            }
        }
        if (upvoteCacheState == UpvoteCacheState.PRE_REMOVE) {
            getClass();
            LIZLLL(str, "fake_delete_upvote", false);
        }
    }

    public static void LIZLLL(String str, String str2, boolean z) {
        C1358880lSw.LIZ.getClass();
        UpvoteList upvoteListLJFF = C1358880lSw.LJFF(str);
        List list = (List) LIZJ().get(str);
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1359100lTI) it2.next()).P12(str, upvoteListLJFF, str2, z);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(java.lang.String r49, java.lang.String r50, java.util.List<? extends com.ss.android.ugc.aweme.model.TextExtraStruct> r51, X.C453740Hqm r52) {
        /*
            Method dump skipped, instruction units count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1358950lT3.LJI(java.lang.String, java.lang.String, java.util.List, X.0Hqm):void");
    }

    public static void LJII(C1358950lT3 c1358950lT3, String str, UpvoteList upvoteList, String str2, boolean z, int i, boolean z2, int i2) {
        boolean z3 = z2;
        int i3 = i;
        boolean z4 = z;
        String str3 = str2;
        if ((i2 & 4) != 0) {
            str3 = null;
        }
        if ((i2 & 8) != 0) {
            z4 = true;
        }
        if ((i2 & 16) != 0) {
            i3 = 20;
        }
        if ((i2 & 32) != 0) {
            z3 = false;
        }
        c1358950lT3.getClass();
        if (upvoteList != null) {
            C1358880lSw.LIZ.getClass();
            C1358880lSw.LJIIJ(i3, upvoteList, str, str3, z4, z3);
            C1606010rtX.LIZIZ.LIZJ(EnumC1615506Uf.STORY, EnumC1606080rte.DEFAULT, upvoteList.upvotes, AFwS259S0000000_21.get$arr$(27));
            if (z4) {
                c1358950lT3.getClass();
                LIZLLL(str, "refresh", false);
            } else {
                c1358950lT3.getClass();
                LIZLLL(str, "load_more", false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x024c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIIZZ(X.C1358950lT3 r21, java.util.List r22, boolean r23, java.util.Map r24, java.util.Map r25, boolean r26, X.EnumC1359020lTA r27, X.InterfaceC1359090lTH r28, java.util.Map r29, int r30) {
        /*
            Method dump skipped, instruction units count: 809
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1358950lT3.LJIIIIZZ(X.0lT3, java.util.List, boolean, java.util.Map, java.util.Map, boolean, X.0lTA, X.0lTH, java.util.Map, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(C1358950lT3 c1358950lT3, final List list, List list2, Map map, Map map2, Map map3, final C1358870lSv c1358870lSv, EnumC1359020lTA enumC1359020lTA, String str, InterfaceC1359090lTH interfaceC1359090lTH, Map map4, int i) {
        String strLIZLLL;
        String strLIZLLL2;
        boolean zBooleanValue;
        final boolean z;
        Integer numValueOf;
        String strLIZLLL3;
        ArrayList arrayList;
        UpvoteBatchQpsCutoffExp.UpvoteBatchQpsCutoffConfig upvoteBatchQpsCutoffConfigLIZIZ;
        final Map map5 = map4;
        final EnumC1359020lTA enumC1359020lTA2 = enumC1359020lTA;
        String str2 = str;
        final InterfaceC1359090lTH interfaceC1359090lTH2 = interfaceC1359090lTH;
        final Map map6 = map2;
        if ((i & 4) != 0) {
            map = null;
        }
        if ((i & 8) != 0) {
            map6 = null;
        }
        if ((i & 16) != 0) {
            map3 = null;
        }
        if ((i & 64) != 0) {
            enumC1359020lTA2 = EnumC1359020lTA.OTHERS;
        }
        if ((i & 128) != 0) {
            str2 = null;
        }
        if ((i & 256) != 0) {
            interfaceC1359090lTH2 = null;
        }
        if ((i & 1024) != 0) {
            map5 = null;
        }
        c1358950lT3.getClass();
        boolean zLJI = MethodIDManager.LJI(137690);
        if (UpvoteBatchQpsCutoffExp.LIZ() && (upvoteBatchQpsCutoffConfigLIZIZ = UpvoteBatchQpsCutoffExp.LIZIZ()) != null && (upvoteBatchQpsCutoffConfigLIZIZ.optTask & 8) == 8 && !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            if (interfaceC1359090lTH2 != null) {
                new C0XIR(8);
                interfaceC1359090lTH2.onFail();
            }
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (map != null) {
            strLIZLLL = C08JS.LIZLLL(map);
        } else {
            strLIZLLL = null;
        }
        if (map6 != null) {
            strLIZLLL2 = C08JS.LIZLLL(map6);
        } else {
            strLIZLLL2 = null;
        }
        final ArrayList arrayList2 = new ArrayList(list);
        Boolean bool = (Boolean) ComplianceServiceProvider.LJI().LJJIII().getValue();
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        if ((map != null && (!map.isEmpty())) || (map6 != null && (!map6.isEmpty()))) {
            z = true;
        } else {
            z = false;
        }
        UpvoteApi upvoteApi = UpvoteApi.LIZIZ;
        String strLIZLLL4 = C08JS.LIZLLL(list);
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            UpvoteReason upvoteReason = (UpvoteReason) it2.next();
            Integer num = upvoteReason.reasonType;
            Integer num2 = upvoteReason.subType;
            long[] jArr = upvoteReason.middleInfo;
            if (jArr != null) {
                arrayList = new ArrayList(jArr.length);
                for (long j : jArr) {
                    arrayList.add(String.valueOf(j));
                }
            } else {
                arrayList = null;
            }
            arrayList3.add(C08JS.LIZLLL(new UpvoteReasonRequest(num, num2, arrayList, upvoteReason.middleCount, upvoteReason.userId, upvoteReason.itemId, upvoteReason.friendTypeStr)));
        }
        String string = arrayList3.toString();
        if (enumC1359020lTA2 != null) {
            numValueOf = Integer.valueOf(enumC1359020lTA2.getValue());
        } else {
            numValueOf = null;
        }
        String str3 = (String) LIZLLL.getValue();
        String strLIZLLL5 = C08JS.LIZLLL(map3);
        String strLIZIZ = LIZIZ();
        if (map5 != null) {
            strLIZLLL3 = C08JS.LIZLLL(map5);
        } else {
            strLIZLLL3 = null;
        }
        final EnumC1359020lTA enumC1359020lTA3 = enumC1359020lTA2;
        final boolean z2 = z;
        final InterfaceC1359090lTH interfaceC1359090lTH3 = interfaceC1359090lTH2;
        ((C11NJ) LIZJ.getValue()).LIZ(upvoteApi.getUpvoteBatchList(strLIZLLL4, string, numValueOf, strLIZLLL, strLIZLLL2, zBooleanValue, null, str3, str2, strLIZLLL5, strLIZIZ, null, strLIZLLL3).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0lT4
            /* JADX WARN: Removed duplicated region for block: B:76:0x0163 A[Catch: all -> 0x018f, TryCatch #0 {all -> 0x018f, blocks: (B:65:0x013d, B:67:0x0147, B:69:0x014b, B:71:0x0155, B:73:0x0159, B:75:0x015f, B:76:0x0163, B:78:0x016d, B:80:0x0171, B:83:0x0178, B:85:0x0182, B:87:0x0186), top: B:128:0x013d }] */
            /* JADX WARN: Removed duplicated region for block: B:90:0x018d  */
            /* JADX WARN: Removed duplicated region for block: B:95:0x01a1  */
            @Override // X.C09JN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r26) {
                /*
                    Method dump skipped, instruction units count: 595
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1358960lT4.accept(java.lang.Object):void");
            }
        }, new C09JN() { // from class: X.0lT5
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("UpvoteListDataCenter@8fc.fetchUpvoteBatchList$4");
                C1358550lSP c1358550lSP = C1358550lSP.LIZ;
                EnumC1359020lTA enumC1359020lTA4 = enumC1359020lTA3;
                if (enumC1359020lTA4 == null) {
                    enumC1359020lTA4 = EnumC1359020lTA.OTHERS;
                }
                int value = enumC1359020lTA4.getValue();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                long j2 = jCurrentTimeMillis;
                long j3 = jCurrentTimeMillis2 - j2;
                C1358870lSv c1358870lSv2 = c1358870lSv;
                long j4 = j2 - c1358870lSv2.LIZJ;
                boolean z3 = z2;
                int size = list.size();
                c1358550lSP.getClass();
                C1358550lSP.LJIL(0, value, j3, j4, z3, true, c1358870lSv2, size);
                if (c1358870lSv.LIZ && arrayList2.size() > 0) {
                    C20684815ws.LJIJI("repost_tab_batch_list_inconsistency", new Pair(C08JS.LIZLLL(arrayList2), "group_ids"));
                }
                InterfaceC1359090lTH interfaceC1359090lTH4 = interfaceC1359090lTH3;
                if (interfaceC1359090lTH4 != null) {
                    interfaceC1359090lTH4.onFail();
                }
                C429430Gsf.LIZ("RepostTagMonitor", "fetchUpvoteBatchList fail");
                C1C7U.LIZIZ("UpvoteListDataCenter@8fc.fetchUpvoteBatchList$4");
            }
        }));
        if (!zLJI) {
            return;
        }
        MethodIDManager.LJ();
    }
}
