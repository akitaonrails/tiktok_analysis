package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMCrossAppFeatureDiffApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.publicgroup.data.GroupAccessCriteriaCollection;
import com.ss.android.ugc.aweme.publicgroup.data.GroupCompositeType;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupEntrance;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupEntranceCommon;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0i5W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1229040i5W implements InterfaceC908170Zjz {
    public static final C1229040i5W LL;
    public static Map<GroupCompositeType, GroupEntrance> LLILLJJLI;
    public static volatile List<GroupAccessCriteriaCollection> LLILLL;
    public static volatile GroupEntranceCommon LLILZ;
    public static C099G LLILZIL;
    public static List<GroupCompositeType> LLILZLL;
    public static boolean LLIZ;
    public static Keva LLIZLLLIL;
    public static volatile String LLJ;
    public static final Object LLJI;

    static {
        C1229040i5W c1229040i5W = new C1229040i5W();
        LL = c1229040i5W;
        LLILLJJLI = new ConcurrentHashMap();
        LLJ = "-1";
        LLJI = new Object();
        ((C1400340mXo) C0I0B.LJFF.LIZ()).LIZLLL(c1229040i5W);
        LIZJ();
    }

    public static void LJIIJ() {
        Keva keva = LLIZLLLIL;
        if (keva == null) {
            return;
        }
        try {
            String string = keva.getString("entrance_map", null);
            if (C123100dR.LIZ(string)) {
                for (GroupEntrance groupEntrance : C051M.LIZLLL(GroupEntrance[].class, string, false)) {
                    ((ConcurrentHashMap) LLILLJJLI).put(groupEntrance.type, groupEntrance);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Loaded entranceMap from Keva, size: ");
                sbLIZ.append(((ConcurrentHashMap) LLILLJJLI).size());
                C2188811AlT.LIZIZ(sbLIZ);
            }
            String string2 = keva.getString("access_criteria_collections", null);
            if (C123100dR.LIZ(string2)) {
                LLILLL = C051M.LIZLLL(GroupAccessCriteriaCollection[].class, string2, false);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Loaded accessCriteriaCollectionsCache from Keva, size: ");
                List<GroupAccessCriteriaCollection> list = LLILLL;
                sbLIZ2.append(list != null ? Integer.valueOf(list.size()) : null);
                C2188811AlT.LIZIZ(sbLIZ2);
            }
            String string3 = keva.getString("entrance_common", null);
            if (C123100dR.LIZ(string3)) {
                LLILZ = (GroupEntranceCommon) C051M.LIZ(GroupEntranceCommon.class, string3);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Loaded entranceCommonCache from Keva, groupCntLimit: ");
                GroupEntranceCommon groupEntranceCommon = LLILZ;
                sbLIZ3.append(groupEntranceCommon != null ? Long.valueOf(groupEntranceCommon.groupCntLimit) : null);
                C2188811AlT.LIZIZ(sbLIZ3);
            }
            if (((ConcurrentHashMap) LLILLJJLI).isEmpty()) {
                LLIZ = true;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZJ() {
        String strLIZIZ = C461720I8s.LIZIZ();
        if (LLIZLLLIL == null || !Intrinsics.LJFF(LLJ, strLIZIZ)) {
            synchronized (LLJI) {
                try {
                    if (LLIZLLLIL == null || !Intrinsics.LJFF(LLJ, strLIZIZ)) {
                        boolean z = !Intrinsics.LJFF(LLJ, strLIZIZ);
                        LLJ = strLIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("public_group_entrance_cache_");
                        sbLIZ.append(strLIZIZ);
                        LLIZLLLIL = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
                        if (z) {
                            LLILLJJLI = new ConcurrentHashMap();
                            LLILLL = null;
                            LLILZ = null;
                            LJIIJ();
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static List LIZLLL(List list) {
        Set setLLIIIZ = C13LP.LLIIIZ(list);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(781);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((Boolean) aFwS257S0000000_19.invoke(it2.next())).booleanValue()) {
                    C19719612Di.LJJIII(setLLIIIZ, aFwS257S0000000_19, true);
                    setLLIIIZ.addAll(C1229100i5c.LJIILIIL());
                    break;
                }
            }
        }
        return C13LP.LLIIII(setLLIIIZ);
    }

    public static C1228560i4k LJI(List list) {
        LIZJ();
        List listLIZLLL = LIZLLL(list);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = listLIZLLL.iterator();
        while (it2.hasNext()) {
            Object obj = ((ConcurrentHashMap) LLILLJJLI).get(it2.next());
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (Object obj2 : arrayList) {
            linkedHashMap.put(((GroupEntrance) obj2).type, obj2);
        }
        Set setKeySet = linkedHashMap.keySet();
        List listLLIIII = C13LP.LLIIII(linkedHashMap.values());
        List listLJLI = C13LP.LJLI(listLIZLLL, setKeySet);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getEntranceCheckResult. types: ");
        sbLIZ.append(list);
        sbLIZ.append(", finalTypes: ");
        sbLIZ.append(listLIZLLL);
        sbLIZ.append(", matchedTypes: ");
        sbLIZ.append(setKeySet);
        sbLIZ.append(", missingTypes: ");
        sbLIZ.append(listLJLI);
        sbLIZ.append(", entranceMap#key: ");
        sbLIZ.append(((ConcurrentHashMap) LLILLJJLI).keySet());
        C2188811AlT.LIZIZ(sbLIZ);
        if (!listLJLI.isEmpty()) {
            LJ(Collections.singletonList(new GroupCompositeType(EnumC1228990i5R.PUBLIC_GROUP.getValue(), "", EnumC1219960hqs.UNKNOWN.getValue())), EnumC1229060i5Y.COMPENSATE);
        }
        List<GroupAccessCriteriaCollection> list2 = LLILLL;
        GroupEntranceCommon groupEntranceCommon = LLILZ;
        C1228560i4k c1228560i4k = new C1228560i4k(listLLIIII, list2, groupEntranceCommon);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getEntranceCheckResult result. entranceList: ");
        sbLIZ2.append(listLLIIII);
        sbLIZ2.append(", accessCriteriaCollections: ");
        sbLIZ2.append(list2);
        sbLIZ2.append(", entranceCommon: ");
        sbLIZ2.append(groupEntranceCommon);
        C2188811AlT.LIZIZ(sbLIZ2);
        return c1228560i4k;
    }

    public static Map LJII(List list) {
        List<GroupEntrance> list2 = LJI(LIZLLL(list)).LIZ;
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list2, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (GroupEntrance groupEntrance : list2) {
            linkedHashMap.put(groupEntrance.type, groupEntrance);
        }
        return linkedHashMap;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onReceiveCampusUpdateEvent(C0DN3 c0dn3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receive OnSaveSchoolDataEvent: ");
        sbLIZ.append(c0dn3.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        LJ(Collections.singletonList(new GroupCompositeType(EnumC1228990i5R.PUBLIC_GROUP.getValue(), EnumC913760Zt0.CAMPUS_GROUP.getValue(), EnumC1219960hqs.UNKNOWN.getValue())), EnumC1229060i5Y.CAMPUS_SWITCH);
    }

    public static void LJ(List list, EnumC1229060i5Y enumC1229060i5Y) {
        List<GroupCompositeType> list2;
        Keva keva;
        int iIntValue;
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetch entrance_check, scene: ");
        sbLIZ.append(enumC1229060i5Y.getScene());
        C2188811AlT.LIZIZ(sbLIZ);
        IMCrossAppFeatureDiffApi.LIZ.getClass();
        IMCrossAppFeatureDiffApi iMCrossAppFeatureDiffApiLIZIZ = C898670ZNh.LIZIZ();
        if (iMCrossAppFeatureDiffApiLIZIZ != null) {
            iMCrossAppFeatureDiffApiLIZIZ.LJIILL();
            EnumC1229060i5Y.Companion.getClass();
            if (EnumC1229060i5Y.controlList.contains(enumC1229060i5Y) && (keva = LLIZLLLIL) != null && (iIntValue = ((Number) C270300Aia.LIZ.getValue()).intValue()) >= 1) {
                long j = keva.getLong("last_fetch_time", 0L);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - j < ((long) iIntValue) * TimeUnit.DAYS.toMillis(1L)) {
                    z = true;
                } else {
                    z = false;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("hitFrequencyControl: lastFetchTime=");
                sbLIZ2.append(j);
                sbLIZ2.append(", currentTime=");
                sbLIZ2.append(jCurrentTimeMillis);
                sbLIZ2.append(", frequencyDays=");
                sbLIZ2.append(iIntValue);
                sbLIZ2.append(", hitControl=");
                sbLIZ2.append(z);
                C2188811AlT.LIZIZ(sbLIZ2);
                if (z) {
                    return;
                }
            }
            C099G c099g = LLILZIL;
            if (c099g != null && c099g.isActive() && (list2 = LLILZLL) != null && list.size() == list2.size() && Intrinsics.LJFF(C13LP.LLIIJI(list), C13LP.LLIIJI(list2))) {
                return;
            }
            LLILZLL = list;
            C099G c099g2 = LLILZIL;
            if (c099g2 != null) {
                c099g2.LIZIZ(null);
            }
            LLILZIL = C23250099c.LIZIZ(C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ).plus(new C1266250j3X(CoroutineExceptionHandler.LJJLIL, 2))), null, null, new C1229050i5X(list, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.aweme.publicgroup.data.GroupCompositeType r6, X.InterfaceC1364105Vn<? super X.C1226790i1t> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1229070i5Z
            if (r0 == 0) goto L22
            r4 = r7
            X.0i5Z r4 = (X.C1229070i5Z) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 != r1) goto L2c
            com.ss.android.ugc.aweme.publicgroup.data.GroupCompositeType r6 = r4.LL
            goto L28
        L22:
            X.0i5Z r4 = new X.0i5Z
            r4.<init>(r5, r7)
            goto L12
        L28:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L46
            goto L4a
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C155000ia.LIZIZ(r3)
            X.099G r0 = X.C1229040i5W.LLILZIL     // Catch: java.lang.Exception -> L46
            if (r0 == 0) goto L4a
            r4.LL = r6     // Catch: java.lang.Exception -> L46
            r4.LLILZ = r1     // Catch: java.lang.Exception -> L46
            java.lang.Object r0 = r0.LJLIIIL(r4)     // Catch: java.lang.Exception -> L46
            if (r0 != r2) goto L4a
            return r2
        L46:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4a:
            java.util.Map<com.ss.android.ugc.aweme.publicgroup.data.GroupCompositeType, com.ss.android.ugc.aweme.publicgroup.data.model.GroupEntrance> r0 = X.C1229040i5W.LLILLJJLI
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r0 = r0.get(r6)
            com.ss.android.ugc.aweme.publicgroup.data.model.GroupEntrance r0 = (com.ss.android.ugc.aweme.publicgroup.data.model.GroupEntrance) r0
            X.0i1t r2 = new X.0i1t
            if (r0 == 0) goto L7f
            boolean r1 = r0.canCreate
        L5a:
            if (r0 == 0) goto L7d
            java.lang.String r0 = r0.entranceDesc
        L5e:
            if (r0 != 0) goto L62
            java.lang.String r0 = ""
        L62:
            r2.<init>(r6, r1, r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "checkEntranceValid. type: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ", res: "
            r1.append(r0)
            r1.append(r2)
            X.C2188811AlT.LIZIZ(r1)
            return r2
        L7d:
            r0 = 0
            goto L5e
        L7f:
            r1 = 0
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1229040i5W.LIZIZ(com.ss.android.ugc.aweme.publicgroup.data.GroupCompositeType, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.util.List<com.ss.android.ugc.aweme.publicgroup.data.GroupCompositeType> r7, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.publicgroup.data.model.GroupEntranceCheckResponse> r8) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1229040i5W.LJFF(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(java.util.List<com.ss.android.ugc.aweme.publicgroup.data.GroupCompositeType> r8, X.InterfaceC1364105Vn<? super X.C1228560i4k> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C1229090i5b
            if (r0 == 0) goto L8e
            r6 = r9
            X.0i5b r6 = (X.C1229090i5b) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8e
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r5 = r6.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r3 = 1
            if (r0 == 0) goto L3c
            if (r0 != r3) goto L95
            X.C155000ia.LIZIZ(r5)
        L22:
            com.ss.android.ugc.aweme.publicgroup.data.model.GroupEntranceCheckResponse r5 = (com.ss.android.ugc.aweme.publicgroup.data.model.GroupEntranceCheckResponse) r5
            java.util.List<com.ss.android.ugc.aweme.publicgroup.data.GroupAccessCriteriaCollection> r3 = r5.accessCriteriaCollections
            if (r3 != 0) goto L2a
            java.util.List<com.ss.android.ugc.aweme.publicgroup.data.GroupAccessCriteriaCollection> r3 = X.C1229040i5W.LLILLL
        L2a:
            com.ss.android.ugc.aweme.publicgroup.data.model.GroupEntranceCommon r2 = r5.entranceCommon
            if (r2 != 0) goto L30
            com.ss.android.ugc.aweme.publicgroup.data.model.GroupEntranceCommon r2 = X.C1229040i5W.LLILZ
        L30:
            X.0i4k r1 = new X.0i4k
            java.util.List<com.ss.android.ugc.aweme.publicgroup.data.model.GroupEntrance> r0 = r5.entranceList
            if (r0 != 0) goto L38
            X.13BV r0 = X.C13BV.INSTANCE
        L38:
            r1.<init>(r0, r3, r2)
            return r1
        L3c:
            X.C155000ia.LIZIZ(r5)
            boolean r0 = r8 instanceof java.util.Collection
            if (r0 == 0) goto L6d
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L6d
        L49:
            java.util.Objects.toString(r8)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r8.iterator()
        L55:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L9d
            java.lang.Object r1 = r2.next()
            java.util.Map<com.ss.android.ugc.aweme.publicgroup.data.GroupCompositeType, com.ss.android.ugc.aweme.publicgroup.data.model.GroupEntrance> r0 = X.C1229040i5W.LLILLJJLI
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L55
            r3.add(r0)
            goto L55
        L6d:
            java.util.Iterator r2 = r8.iterator()
        L71:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L49
            java.lang.Object r1 = r2.next()
            java.util.Map<com.ss.android.ugc.aweme.publicgroup.data.GroupCompositeType, com.ss.android.ugc.aweme.publicgroup.data.model.GroupEntrance> r0 = X.C1229040i5W.LLILLJJLI
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L71
            r6.LLILLL = r3
            java.lang.Object r5 = r7.LJFF(r8, r6)
            if (r5 != r4) goto L22
            return r4
        L8e:
            X.0i5b r6 = new X.0i5b
            r6.<init>(r7, r9)
            goto L12
        L95:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L9d:
            X.0i4k r2 = new X.0i4k
            java.util.List<com.ss.android.ugc.aweme.publicgroup.data.GroupAccessCriteriaCollection> r1 = X.C1229040i5W.LLILLL
            com.ss.android.ugc.aweme.publicgroup.data.model.GroupEntranceCommon r0 = X.C1229040i5W.LLILZ
            r2.<init>(r3, r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1229040i5W.LJIIIZ(java.util.List, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC908170Zjz
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        String uid;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAccountResult: ");
        sbLIZ.append(i);
        sbLIZ.append(", success: ");
        sbLIZ.append(z);
        sbLIZ.append(", userId: ");
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        sbLIZ.append(uid);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!z) {
            return;
        }
        if (i != 1 && i != 2) {
            if (i == 3) {
                synchronized (LLJI) {
                    try {
                        LLILLJJLI = new ConcurrentHashMap();
                        LLILLL = null;
                        LLILZ = null;
                        LLJ = "-1";
                        LLIZLLLIL = null;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        } else {
            LIZJ();
            LJ(Collections.singletonList(new GroupCompositeType(EnumC1228990i5R.PUBLIC_GROUP.getValue(), "", EnumC1219960hqs.UNKNOWN.getValue())), EnumC1229060i5Y.ACCOUNT_CHANGE);
        }
        LLIZ = true;
    }
}
