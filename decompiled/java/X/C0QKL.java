package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.config.Crowd;
import com.ss.android.ugc.aweme.search.pages.reinforceinterest.repo.SuggestReason;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AFwS241S0000000_10;

/* JADX INFO: renamed from: X.0QKL, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QKL {
    public static List<C0QKM> LIZIZ;
    public static boolean LJ;
    public static final C01GW LJI;
    public static final boolean LJII;
    public static C0QK7 LJIIIIZZ;
    public static final C0QKL LIZ = new C0QKL();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(470));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(468));
    public static int LJFF = 1;

    public static boolean LJIIIIZZ() {
        C0QKM c0qkm;
        if (LJIIIZ(false)) {
            return false;
        }
        if (!C07IR.LIZ()) {
            List listLJFF = LJFF();
            return (listLJFF == null || (c0qkm = (C0QKM) C13LP.LJJJLL(listLJFF)) == null || !c0qkm.isEffective()) ? false : true;
        }
        List listLJFF2 = LJFF();
        if (listLJFF2 == null || listLJFF2.isEmpty()) {
            return false;
        }
        Iterator it2 = listLJFF2.iterator();
        while (it2.hasNext()) {
            if (((C0QKM) it2.next()).isEffective()) {
                return true;
            }
        }
        return false;
    }

    public static void LJIIJJI() {
        LJIIL(true);
        LJI().storeLong(LJII("search_reinforce_interest_function_exited_time_key"), System.currentTimeMillis());
    }

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(469));
        LJI = c01gwLIZIZ;
        LJII = ((Boolean) c01gwLIZIZ.getValue()).booleanValue() && !C0XQ7.LJFF().getCurUser().isAccuratePrivateAccount();
    }

    public static C0QK7 LIZLLL() {
        C0QK7 c0qk7 = LJIIIIZZ;
        return c0qk7 == null ? new C0QK7((String) null, (String) null, (String) null, (String) null, (String) null, 63) : c0qk7;
    }

    public static List LJFF() {
        if (LIZIZ == null) {
            try {
                if (!LJI().contains(LJII("search_reinforce_interest_local_key"))) {
                    return null;
                }
                C1227904rF c1227904rF = C1227904rF.LIZ;
                String string = LJI().getString(LJII("search_reinforce_interest_local_key"), "");
                Type type = new TypeToken<List<? extends C0QKM>>() { // from class: X.0QKN
                }.getType();
                c1227904rF.getClass();
                LIZIZ = (List) C1227904rF.LIZJ(string, type);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return LIZIZ;
    }

    public static Keva LJI() {
        return (Keva) LIZJ.getValue();
    }

    public static void LIZ() {
        C0QKM c0qkm;
        List listLJFF = LJFF();
        if (listLJFF != null && (c0qkm = (C0QKM) C13LP.LJJJLL(listLJFF)) != null) {
            LJIILIIL(c0qkm.copy(c0qkm.interestWord, c0qkm.interestRecommendList, c0qkm.hasClicked, true, c0qkm.exposeCount, c0qkm.exposeLastTime, c0qkm.accessedTime, c0qkm.currentRecommendPosition, c0qkm.imprId, c0qkm.code, c0qkm.recallType));
        }
        LJIIJJI();
        LJI().storeLong(LJII("search_reinforce_interest_function_manual_exited_time_key"), System.currentTimeMillis());
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZIZ() {
        /*
            java.util.List r1 = LJFF()
            if (r1 == 0) goto Lc1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r12 = r0.iterator()
        L19:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto La8
            java.lang.Object r8 = r12.next()
            X.0QKM r8 = (X.C0QKM) r8
            long r1 = r8.accessedTime
            com.ss.android.ugc.aweme.search.pages.reinforceinterest.config.SearchInterestReinforceConfigData r0 = X.C0QKO.LIZ()
            int r0 = r0.wordLocalSavedMaxTime
            int r0 = r0 * 24
            int r0 = r0 * 60
            int r0 = r0 * 60
            r9 = 1000(0x3e8, float:1.401E-42)
            int r0 = r0 * r9
            long r3 = (long) r0
            long r1 = r1 + r3
            long r3 = java.lang.System.currentTimeMillis()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r7 = 1
            if (r0 <= 0) goto La6
            r4 = 1
        L42:
            long r2 = r8.accessedTime
            com.ss.android.ugc.aweme.search.pages.reinforceinterest.config.SearchInterestReinforceConfigData r0 = X.C0QKO.LIZ()
            int r0 = r0.wordExpiredTime
            int r0 = r0 * 24
            int r0 = r0 * 60
            int r0 = r0 * 60
            int r0 = r0 * r9
            long r0 = (long) r0
            long r2 = r2 + r0
            long r10 = java.lang.System.currentTimeMillis()
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 <= 0) goto La4
            r1 = 1
        L5c:
            if (r4 == 0) goto L19
            boolean r0 = r8.hasClicked
            if (r0 != 0) goto L78
            boolean r0 = r8.hasClosed
            if (r0 != 0) goto L78
            boolean r0 = r8.exposeUpLimit()
            if (r0 != 0) goto L78
            boolean r0 = r8.isTraverseFinished()
            if (r0 != 0) goto L78
            if (r1 == 0) goto L19
            r5.add(r8)
            goto L19
        L78:
            com.ss.android.ugc.aweme.search.pages.reinforceinterest.repo.InterestPointReportInfo r10 = new com.ss.android.ugc.aweme.search.pages.reinforceinterest.repo.InterestPointReportInfo
            java.lang.String r4 = r8.interestWord
            if (r4 != 0) goto L80
            java.lang.String r4 = ""
        L80:
            boolean r0 = X.C07IR.LIZ()
            if (r0 == 0) goto L99
            boolean r0 = r8.hasClosed
            if (r0 == 0) goto L9e
            r7 = 3
        L8b:
            long r2 = r8.exposeLastTime
            long r0 = (long) r9
            long r2 = r2 / r0
            r10.<init>(r4, r7, r2)
            r6.add(r10)
            r5.add(r8)
            goto L19
        L99:
            boolean r0 = r8.hasClicked
            if (r0 == 0) goto L8b
            goto La2
        L9e:
            boolean r0 = r8.hasClicked
            if (r0 == 0) goto L8b
        La2:
            r7 = 2
            goto L8b
        La4:
            r1 = 0
            goto L5c
        La6:
            r4 = 0
            goto L42
        La8:
            X.C0QKL.LIZIZ = r5
            com.bytedance.keva.Keva r2 = LJI()
            java.lang.String r0 = "search_reinforce_interest_local_key"
            java.lang.String r1 = LJII(r0)
            X.04rF r0 = X.C1227904rF.LIZ
            r0.getClass()
            java.lang.String r0 = X.C1227904rF.LJI(r5)
            r2.storeString(r1, r0)
            return r6
        Lc1:
            X.13BV r0 = X.C13BV.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QKL.LIZIZ():java.util.List");
    }

    public static C0QKM LJ() {
        List listLJFF;
        if (!LJIIIIZZ() || (listLJFF = LJFF()) == null) {
            return null;
        }
        return (C0QKM) C13LP.LJJJLL(listLJFF);
    }

    public static void LJIIJ() {
        boolean z;
        if (C07IR.LIZ()) {
            if (LJIIIZ(true)) {
                return;
            }
        } else if (!LJIIIIZZ()) {
            return;
        }
        C0QKM c0qkmLJ = LJ();
        if (c0qkmLJ != null) {
            LJIILIIL(c0qkmLJ.copy(c0qkmLJ.interestWord, c0qkmLJ.interestRecommendList, c0qkmLJ.hasClicked, c0qkmLJ.hasClosed, c0qkmLJ.exposeCount + 1, System.currentTimeMillis(), c0qkmLJ.accessedTime, c0qkmLJ.currentRecommendPosition + 1, c0qkmLJ.imprId, c0qkmLJ.code, c0qkmLJ.recallType));
        }
        List listLJFF = LJFF();
        C0QKM c0qkm = listLJFF != null ? (C0QKM) C13LP.LJJJLL(listLJFF) : null;
        if (LJ) {
            LJIIL(true);
            LIZJ(true);
            LJ = false;
            return;
        }
        if (c0qkm != null) {
            List<SuggestReason> list = c0qkm.interestRecommendList;
            if (list == null || c0qkm.currentRecommendPosition < list.size()) {
                z = false;
                if (c0qkm != null) {
                }
            } else {
                z = true;
            }
            if (c0qkm.exposeCount >= C0QKO.LIZ().wordExposeLimit || z) {
                if (!C1387310mCn.LJ(LJI().getLong(LJII("search_reinforce_interest_first_exited_time_key"), 0L))) {
                    LJIIL(true);
                }
                int i = LJI().getInt(LJII("search_reinforce_interest_unclick_count_local_key"), 0);
                if (i == 0) {
                    LJI().storeLong(LJII("search_reinforce_interest_first_exited_time_key"), System.currentTimeMillis());
                }
                if (i + 1 < C0QKO.LIZ().wordUnClickLimit) {
                    LJIIL(false);
                    LIZJ(false);
                    return;
                } else {
                    LJIIJJI();
                    if (C07IR.LIZ()) {
                        LIZJ(false);
                        return;
                    }
                    return;
                }
            }
        }
        if (C07IR.LIZ()) {
            LIZJ(false);
        }
    }

    public static void LIZJ(boolean z) {
        C0QKM c0qkm;
        List listLJFF = LJFF();
        if (listLJFF != null && (c0qkm = (C0QKM) C13LP.LJJJLL(listLJFF)) != null) {
            LJIILIIL(c0qkm.copy(c0qkm.interestWord, c0qkm.interestRecommendList, z, c0qkm.hasClosed, c0qkm.exposeCount, System.currentTimeMillis(), c0qkm.accessedTime, c0qkm.currentRecommendPosition, c0qkm.imprId, c0qkm.code, c0qkm.recallType));
        }
        List listLIZIZ = LIZIZ();
        C054G c054g = C324560Cnu.LIZ;
        AFwS241S0000000_10 aFwS241S0000000_10 = AFwS241S0000000_10.get$arr$(447);
        C2296808zG.LIZJ(C324560Cnu.LIZ, null);
        C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZJ);
        C324560Cnu.LIZ = c054gLIZ;
        C23250099c.LIZLLL(c054gLIZ, null, null, new C324550Cnt(listLIZIZ, null, aFwS241S0000000_10), 3);
    }

    public static String LJII(String str) {
        C01GW c01gw = LIZLLL;
        if (!((IAccountUserService) c01gw.getValue()).isLogin()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("search_reinforce_interest_storage_");
            sbLIZ.append(str);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("search_reinforce_interest_storage_");
        sbLIZ2.append(str);
        sbLIZ2.append('_');
        sbLIZ2.append(((IAccountUserService) c01gw.getValue()).getCurUserId());
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static boolean LJIIIZ(boolean z) {
        int i;
        int i2;
        if (z) {
            C311300CIe.LIZ.getClass();
            Crowd crowdLIZ = C311300CIe.LIZ();
            if (crowdLIZ == null || 100 > (i2 = crowdLIZ.showInterestWord) || i2 >= 200) {
                C668400QJq.LIZ.getClass();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("position", "search_blankpage");
                Crowd crowdLIZ2 = C311300CIe.LIZ();
                if (crowdLIZ2 != null) {
                    i = crowdLIZ2.showInterestWord;
                } else {
                    i = 0;
                }
                c2344009Gk.LIZJ(i, "avoid_type");
                C20684815ws.LJIILLIIL("interest_point_module_avoid", c2344009Gk.LIZ);
            }
        }
        if (LJII && ((Boolean) C0QKO.LIZJ.getValue()).booleanValue()) {
            if (C07IR.LIZ()) {
                if (System.currentTimeMillis() - LJI().getLong(LJII("search_reinforce_interest_function_manual_exited_time_key"), 0L) >= 86400000) {
                    return false;
                }
            } else {
                if (System.currentTimeMillis() - LJI().getLong(LJII("search_reinforce_interest_function_exited_time_key"), 0L) < 86400000) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    public static void LJIIL(boolean z) {
        if (z) {
            LJI().storeInt(LJII("search_reinforce_interest_unclick_count_local_key"), 0);
        } else {
            LJI().storeInt(LJII("search_reinforce_interest_unclick_count_local_key"), LJI().getInt(LJII("search_reinforce_interest_unclick_count_local_key"), 0) + 1);
        }
    }

    public static void LJIILIIL(C0QKM c0qkm) {
        ArrayList arrayList;
        List listLJFF = LJFF();
        if (listLJFF != null && (arrayList = new ArrayList(listLJFF)) != null && !arrayList.isEmpty()) {
            ListProtector.remove(arrayList, 0);
            ListProtector.add(arrayList, 0, c0qkm);
            LIZIZ = arrayList;
            Keva kevaLJI = LJI();
            String strLJII = LJII("search_reinforce_interest_local_key");
            C1227904rF.LIZ.getClass();
            kevaLJI.storeString(strLJII, C1227904rF.LJI(arrayList));
        }
    }
}
