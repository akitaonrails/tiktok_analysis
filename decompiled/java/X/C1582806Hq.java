package X;

import com.ss.android.ugc.aweme.im.streak.api.pet.StreakExtension;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.06Hq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1582806Hq implements C06C8 {
    public static final C1582806Hq LLILLJJLI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public static final ConcurrentHashMap<String, ConcurrentHashMap<Long, Integer>> LLILZ;
    public static final ConcurrentHashMap<String, ConcurrentHashMap<String, Integer>> LLILZIL;
    public static final ConcurrentHashMap<String, AnonymousClass0957<Unit>> LLILZLL;
    public static final ConcurrentHashMap<String, AnonymousClass0957<Unit>> LLIZ;
    public static final C054G LLIZLLLIL;
    public volatile C1598406Nq LL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1582806Hq.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        C1582806Hq c1582806Hq = new C1582806Hq();
        LLILLJJLI = c1582806Hq;
        LLILZ = new ConcurrentHashMap<>();
        LLILZIL = new ConcurrentHashMap<>();
        LLILZLL = new ConcurrentHashMap<>();
        LLIZ = new ConcurrentHashMap<>();
        C1598406Nq c1598406Nq = c1582806Hq.LL;
        if (c1598406Nq == null) {
            synchronized (c1582806Hq) {
                c1598406Nq = c1582806Hq.LL;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    c1582806Hq.LL = c1598406Nq;
                }
            }
        }
        LLIZLLLIL = C2296808zG.LIZ(c1598406Nq.LIZ.plus(C2296908zH.LIZ()));
        ((C1400340mXo) C0I0B.LJFF.LIZ()).LIZLLL(new InterfaceC908170Zjz() { // from class: X.06GW
            @Override // X.InterfaceC908170Zjz
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                if (z) {
                    if (i == 2 || i == 3) {
                        C1582806Hq.LLILZ.clear();
                        C1582806Hq.LLILZIL.clear();
                    }
                }
            }
        });
        C06C6.LIZIZ.getClass();
        C06C6.LIZLLL(c1582806Hq);
    }

    @Override // X.C06C8
    public final void Ro1(String str) {
    }

    @Override // X.C06C8
    public final void wK0(String str, StreakExtension streakExtension, StreakPetData streakPetData) {
    }

    public static void LIZ(String str, Map map) {
        if (map.isEmpty()) {
            return;
        }
        ConcurrentHashMap<String, ConcurrentHashMap<Long, Integer>> concurrentHashMap = LLILZ;
        ConcurrentHashMap concurrentHashMap2 = concurrentHashMap.get(str);
        if (concurrentHashMap2 == null) {
            concurrentHashMap2 = new ConcurrentHashMap();
            concurrentHashMap.put(str, (ConcurrentHashMap<Long, Integer>) concurrentHashMap2);
        }
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key != null && value != null) {
                concurrentHashMap2.put(key, value);
            }
        }
    }

    public static void LIZIZ(String str, Map map) {
        if (map.isEmpty()) {
            return;
        }
        ConcurrentHashMap<String, ConcurrentHashMap<String, Integer>> concurrentHashMap = LLILZIL;
        ConcurrentHashMap concurrentHashMap2 = concurrentHashMap.get(str);
        if (concurrentHashMap2 == null) {
            concurrentHashMap2 = new ConcurrentHashMap();
            concurrentHashMap.put(str, (ConcurrentHashMap<String, Integer>) concurrentHashMap2);
        }
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                concurrentHashMap2.put(key, value);
            }
        }
    }

    public static C099G LIZJ(String str, List list) {
        List listLJJJJI = C13LP.LJJJJI(list);
        ConcurrentHashMap<Long, Integer> concurrentHashMap = LLILZ.get(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJJJJI) {
            long jLongValue = ((Number) obj).longValue();
            if (concurrentHashMap == null || !concurrentHashMap.containsKey(Long.valueOf(jLongValue))) {
                arrayList.add(obj);
            }
        }
        C099G c099gLIZIZ = C23250099c.LIZIZ(LLIZLLLIL, null, null, new C479001tk(str, arrayList, null), 3);
        LLILZLL.put(str, c099gLIZIZ);
        return c099gLIZIZ;
    }

    public static C099G LIZLLL(String str, List list) {
        List listLJJJJI = C13LP.LJJJJI(list);
        ConcurrentHashMap<String, Integer> concurrentHashMap = LLILZIL.get(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJJJJI) {
            if (concurrentHashMap == null || !concurrentHashMap.containsKey(obj)) {
                arrayList.add(obj);
            }
        }
        C099G c099gLIZIZ = C23250099c.LIZIZ(LLIZLLLIL, null, null, new C479101tl(str, arrayList, null), 3);
        LLIZ.put(str, c099gLIZIZ);
        return c099gLIZIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        if (r2.equals("streak_pet_invite_search_banner") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        if (r2.equals("streak_pet_invite_banner") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        return X.EnumC1583106Ht.FEATURE_KEY_STREAK_PET_SHARE_PANEL.getValue();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJ(java.lang.String r2, boolean r3) {
        /*
            if (r3 == 0) goto Lb
            if (r2 != 0) goto La
            X.06Ht r0 = X.EnumC1583106Ht.FEATURE_KEY_STREAK_PET_SHARE_PANEL
            java.lang.String r2 = r0.getValue()
        La:
            return r2
        Lb:
            if (r2 == 0) goto L40
            int r1 = r2.hashCode()
            r0 = -1814161490(0xffffffff93de17ae, float:-5.606403E-27)
            if (r1 == r0) goto L2f
            r0 = -1610532991(0xffffffffa0013781, float:-1.094509E-19)
            if (r1 == r0) goto L38
            r0 = -1295496047(0xffffffffb2c84c91, float:-2.3317883E-8)
            if (r1 != r0) goto L40
            java.lang.String r0 = "streak_pet_invite_market"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L40
            X.06Ht r0 = X.EnumC1583106Ht.FEATURE_KEY_MARKET_STREAK_PET_SHARE_PANEL
            java.lang.String r0 = r0.getValue()
            return r0
        L2f:
            java.lang.String r0 = "streak_pet_invite_search_banner"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L47
            goto L40
        L38:
            java.lang.String r0 = "streak_pet_invite_banner"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L47
        L40:
            X.06Ht r0 = X.EnumC1583106Ht.FEATURE_KEY_STREAK_PET_SHARE_PANEL
            java.lang.String r0 = r0.getValue()
            return r0
        L47:
            X.06Ht r0 = X.EnumC1583106Ht.FEATURE_KEY_STREAK_PET_SHARE_PANEL
            java.lang.String r0 = r0.getValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1582806Hq.LJ(java.lang.String, boolean):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d3  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.lang.String r14, java.util.List<java.lang.Long> r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1582806Hq.LJFF(java.lang.String, java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0125  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(java.lang.String r13, java.util.List<java.lang.String> r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1582806Hq.LJI(java.lang.String, java.util.List, X.05Vn):java.lang.Object");
    }

    @Override // X.C06C8
    public final void SI2(String str, StreakPetData streakPetData, StreakPetData streakPetData2) {
        if (!C1571306Df.LJII(streakPetData2) && !C1571306Df.LIZLLL(streakPetData2)) {
            if (streakPetData != null && C1571306Df.LIZLLL(streakPetData) && !C1571306Df.LIZLLL(streakPetData2)) {
                long jLJII = C0YNP.LJII(str);
                for (Map.Entry<String, ConcurrentHashMap<Long, Integer>> entry : LLILZ.entrySet()) {
                    entry.getKey();
                    ConcurrentHashMap<Long, Integer> value = entry.getValue();
                    if (value.containsKey(Long.valueOf(jLJII))) {
                        value.put(Long.valueOf(jLJII), 1);
                    }
                }
                for (Map.Entry<String, ConcurrentHashMap<String, Integer>> entry2 : LLILZIL.entrySet()) {
                    entry2.getKey();
                    ConcurrentHashMap<String, Integer> value2 = entry2.getValue();
                    if (value2.containsKey(str)) {
                        value2.put(str, 1);
                    }
                }
                return;
            }
            return;
        }
        long jLJII2 = C0YNP.LJII(str);
        for (Map.Entry<String, ConcurrentHashMap<Long, Integer>> entry3 : LLILZ.entrySet()) {
            entry3.getKey();
            ConcurrentHashMap<Long, Integer> value3 = entry3.getValue();
            if (value3.containsKey(Long.valueOf(jLJII2))) {
                value3.put(Long.valueOf(jLJII2), 2);
            }
        }
        for (Map.Entry<String, ConcurrentHashMap<String, Integer>> entry4 : LLILZIL.entrySet()) {
            entry4.getKey();
            ConcurrentHashMap<String, Integer> value4 = entry4.getValue();
            if (value4.containsKey(str)) {
                value4.put(str, 2);
            }
        }
    }
}
