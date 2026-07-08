package X;

import com.bytedance.android.livesdk.gift.model.DynamicRestriction;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.ReceiverRestriction;
import com.bytedance.android.livesdk.gift.model.SceneRestriction;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.00m9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C177100m9 {
    public final ConcurrentHashMap<Long, DynamicRestriction> LIZ = new ConcurrentHashMap<>();

    public static String LIZLLL(DynamicRestriction dynamicRestriction) {
        String strLJJLIIIJ;
        String strLJJLIIIJ2;
        String strLJJLIIIJ3;
        List<Long> list;
        List<Long> list2;
        List<Long> list3;
        List<Long> list4;
        if (dynamicRestriction == null) {
            return "[null]";
        }
        StringBuilder sb = new StringBuilder("[scenes:\n(n ");
        SceneRestriction sceneRestriction = dynamicRestriction.scenes;
        String strLJJLIIIJ4 = null;
        if (sceneRestriction != null && (list4 = sceneRestriction.matchHiddenGids) != null) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(list4, null, null, null, 0, null, null, 63);
        } else {
            strLJJLIIIJ = null;
        }
        sb.append(strLJJLIIIJ);
        sb.append(")\n(c ");
        SceneRestriction sceneRestriction2 = dynamicRestriction.scenes;
        if (sceneRestriction2 != null && (list3 = sceneRestriction2.cohostHiddenGids) != null) {
            strLJJLIIIJ2 = C13LP.LJJLIIIJ(list3, null, null, null, 0, null, null, 63);
        } else {
            strLJJLIIIJ2 = null;
        }
        sb.append(strLJJLIIIJ2);
        sb.append(")\n(m ");
        SceneRestriction sceneRestriction3 = dynamicRestriction.scenes;
        if (sceneRestriction3 != null && (list2 = sceneRestriction3.multiguestHiddenGids) != null) {
            strLJJLIIIJ3 = C13LP.LJJLIIIJ(list2, null, null, null, 0, null, null, 63);
        } else {
            strLJJLIIIJ3 = null;
        }
        sb.append(strLJJLIIIJ3);
        sb.append(")\n(");
        SceneRestriction sceneRestriction4 = dynamicRestriction.scenes;
        if (sceneRestriction4 != null && (list = sceneRestriction4.normalHiddenGids) != null) {
            strLJJLIIIJ4 = C13LP.LJJLIIIJ(list, null, null, null, 0, null, null, 63);
        }
        sb.append(strLJJLIIIJ4);
        sb.append(")\nreceivers:\n");
        List<ReceiverRestriction> list5 = dynamicRestriction.receivers;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list5, 10));
        for (ReceiverRestriction receiverRestriction : list5) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('(');
            sbLIZ.append(receiverRestriction.userId);
            sbLIZ.append(" ->");
            sbLIZ.append(C13LP.LJJLIIIJ(receiverRestriction.hiddenGids, null, null, null, 0, null, null, 63));
            sbLIZ.append(" )");
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        sb.append(C13LP.LJJLIIIJ(arrayList, "\n", null, null, 0, null, null, 62));
        sb.append(']');
        return sb.toString();
    }

    public final void LIZJ(DynamicRestriction dynamicRestriction, long j) {
        if (dynamicRestriction == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("applyOrUpdateInfoFromApi:");
        sbLIZ.append(j);
        sbLIZ.append(' ');
        sbLIZ.append(LIZLLL(dynamicRestriction));
        C20441214yg.LJ("GiftFilterManager", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZ.get(Long.valueOf(j)) == null) {
            this.LIZ.put(Long.valueOf(j), dynamicRestriction);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("applyOrUpdateInfoFromApi:");
            sbLIZ2.append(j);
            sbLIZ2.append(" applied");
            C20441214yg.LJ("GiftFilterManager", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public final void LIZ(long j, List list, List list2) {
        if (list2.isEmpty()) {
            return;
        }
        try {
            LIZIZ(j, list, list2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJFF(th, "GiftFilterManager");
        }
    }

    public final void LIZIZ(long j, List list, List list2) {
        List<Long> list3;
        List<Long> list4;
        List<Long> list5;
        Boolean boolValueOf;
        List<Gift> list6;
        List<Long> list7;
        DynamicRestriction dynamicRestriction = this.LIZ.get(Long.valueOf(j));
        if (dynamicRestriction == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("try applyFilter:");
        sb.append(j);
        sb.append(" target(");
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            C1125380fOK c1125380fOK = (C1125380fOK) it2.next();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('<');
            sbLIZ.append(c1125380fOK.LIZ.getId());
            sbLIZ.append('-');
            sbLIZ.append(c1125380fOK.LIZIZ.getValue());
            sbLIZ.append('>');
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        sb.append(C13LP.LJJLIIIJ(arrayList, null, null, null, 0, null, null, 63));
        sb.append(") with ");
        sb.append(LIZLLL(dynamicRestriction));
        C20441214yg.LJ("GiftFilterManager", sb.toString());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (C1128450fTH.LIZJ.co0()) {
            SceneRestriction sceneRestriction = dynamicRestriction.scenes;
            if (sceneRestriction != null && (list7 = sceneRestriction.matchHiddenGids) != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("isInMatch apply res: ");
                sbLIZ2.append(C13LP.LJJLIIIJ(list7, null, null, null, 0, null, null, 63));
                C20441214yg.LJ("GiftFilterManager", C2188811AlT.LIZIZ(sbLIZ2));
                linkedHashSet.addAll(list7);
            }
        } else if (C1128450fTH.LJJIIJ()) {
            SceneRestriction sceneRestriction2 = dynamicRestriction.scenes;
            if (sceneRestriction2 != null && (list5 = sceneRestriction2.cohostHiddenGids) != null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("isInCoHost apply res: ");
                sbLIZ3.append(C13LP.LJJLIIIJ(list5, null, null, null, 0, null, null, 63));
                C20441214yg.LJ("GiftFilterManager", C2188811AlT.LIZIZ(sbLIZ3));
                linkedHashSet.addAll(list5);
            }
        } else if (!C1128450fTH.LJJIJIIJIL()) {
            SceneRestriction sceneRestriction3 = dynamicRestriction.scenes;
            if (sceneRestriction3 != null && (list4 = sceneRestriction3.multiguestHiddenGids) != null) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("isMultiGuest apply res: ");
                sbLIZ4.append(C13LP.LJJLIIIJ(list4, null, null, null, 0, null, null, 63));
                C20441214yg.LJ("GiftFilterManager", C2188811AlT.LIZIZ(sbLIZ4));
                linkedHashSet.addAll(list4);
            }
        } else {
            SceneRestriction sceneRestriction4 = dynamicRestriction.scenes;
            if (sceneRestriction4 != null && (list3 = sceneRestriction4.normalHiddenGids) != null) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("normal apply res: ");
                sbLIZ5.append(C13LP.LJJLIIIJ(list3, null, null, null, 0, null, null, 63));
                C20441214yg.LJ("GiftFilterManager", C2188811AlT.LIZIZ(sbLIZ5));
                linkedHashSet.addAll(list3);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Long.valueOf(((C1125380fOK) it3.next()).LIZ.getId()));
        }
        for (ReceiverRestriction receiverRestriction : dynamicRestriction.receivers) {
            if (arrayList2.contains(Long.valueOf(receiverRestriction.userId))) {
                linkedHashSet.addAll(receiverRestriction.hiddenGids);
            }
        }
        boolean zLJJI = C1128450fTH.LJJI();
        if ((!linkedHashSet.isEmpty()) || zLJJI) {
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                GiftPage giftPage = (GiftPage) it4.next();
                List<Gift> list8 = giftPage.gifts;
                Boolean boolValueOf2 = null;
                if (list8 != null) {
                    boolValueOf = Boolean.valueOf(C19719612Di.LJJIIJ(list8, new C5183020f((Set) linkedHashSet, (Set<Integer>) 233), true));
                } else {
                    boolValueOf = null;
                }
                List<Gift> list9 = giftPage.favouriteGifts;
                if (list9 != null) {
                    boolValueOf2 = Boolean.valueOf(C19719612Di.LJJIIJ(list9, new C5183020f((Set) linkedHashSet, (Set<Integer>) 232), true));
                }
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("do applyFilter res: ");
                sbLIZ6.append(boolValueOf);
                sbLIZ6.append(' ');
                sbLIZ6.append(boolValueOf2);
                C20441214yg.LJ("GiftFilterManager", C2188811AlT.LIZIZ(sbLIZ6));
                if (zLJJI && (list6 = giftPage.gifts) != null) {
                    C19719612Di.LJJIIJ(list6, AnonymousClass0207.get$arr$(106), true);
                }
            }
        }
    }
}
