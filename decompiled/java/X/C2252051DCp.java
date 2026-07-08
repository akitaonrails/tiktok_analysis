package X;

import Y.ARunnableS110S0100000_10;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.explore.experiment.ExploreSearchRealTimeConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1DCp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2252051DCp {
    public static boolean LIZIZ;
    public static final IAccountService LIZLLL;
    public static String LJ;
    public static final HashSet<AbstractC20290414aM> LJFF;
    public static final C01GW LJI;
    public static final C2252051DCp LIZ = new C2252051DCp();
    public static final C1D39 LIZJ = new C1D39();

    static {
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        LIZLLL = iAccountService;
        LJ = TextUtils.isEmpty(iAccountService.LJIIJ().getCurUserId()) ? CardStruct.IStatusCode.DEFAULT : iAccountService.LJIIJ().getCurUserId();
        LJFF = new HashSet<>();
        LJI = C452501pT.LIZ(EnumC452301pR.PUBLICATION, new C741060T5c());
    }

    public static ExecutorService LJFF() {
        return (ExecutorService) LJI.getValue();
    }

    public static void LIZ(String str) {
        C01GW c01gw = C2252101DCu.LIZ;
        if (!TextUtils.isEmpty(str) && C13LP.LJJJJ(str, (HashSet) C2252101DCu.LIZIZ.getValue())) {
            LIZJ.LIZ(LJ, str);
        }
    }

    public static ArrayList LIZLLL(int i) {
        C1D39 c1d39 = LIZJ;
        String str = LJ;
        C1D38 c1d38 = c1d39.LIZ.get(str);
        if (c1d38 == null) {
            c1d38 = new C1D38();
            c1d39.LIZ.put(str, c1d38);
        }
        if (c1d38.LIZIZ == null) {
            c1d38.LIZIZ = new C1D37();
        }
        C1D37 c1d37 = c1d38.LIZIZ;
        if (c1d37 == null) {
            return null;
        }
        return c1d37.LIZIZ.LIZIZ(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJI(X.C2252061DCq r7) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2252051DCp.LJIJI(X.1DCq):void");
    }

    public static C2252061DCq LIZJ(String str, String str2) {
        C1D3B c1d3b;
        if (C0BPJ.LIZ() && C296300BjQ.LIZJ) {
            C1D39 c1d39 = LIZJ;
            String str3 = LJ;
            C1D38 c1d38 = c1d39.LIZ.get(str3);
            if (c1d38 == null) {
                c1d38 = new C1D38();
                c1d39.LIZ.put(str3, c1d38);
            }
            if (c1d38.LIZIZ == null) {
                c1d38.LIZIZ = new C1D37();
            }
            C1D37 c1d37 = c1d38.LIZIZ;
            if (c1d37 == null || (c1d3b = c1d37.LIZIZ) == null) {
                return null;
            }
        } else {
            C1D36 c1d36LIZIZ = LIZJ.LIZIZ(LJ, str);
            if (c1d36LIZIZ == null || (c1d3b = c1d36LIZIZ.LIZJ) == null) {
                return null;
            }
        }
        return c1d3b.LIZ(str2);
    }

    public static String LJ(Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if (z) {
            String strValueOf = String.valueOf(LJI(obj, "enter_from_merge"));
            String strValueOf2 = String.valueOf(LJI(obj, "enter_from_info"));
            if (C123100dR.LIZ(strValueOf)) {
                return strValueOf;
            }
            if (C123100dR.LIZ(strValueOf2) && Intrinsics.LJFF(strValueOf2, "general_search_temai_live_cover")) {
                return "general_search";
            }
        }
        String strValueOf3 = String.valueOf(LJI(obj, "enter_from"));
        if (!C123100dR.LIZ(strValueOf3) || strValueOf3 == null) {
            return String.valueOf(LJI(obj, "enter_from_merge"));
        }
        return strValueOf3;
    }

    public static Object LJI(Object obj, String str) {
        try {
            if (C19719512Dh.LJII(obj)) {
                return ((Map) obj).get(str);
            }
            if (obj instanceof JSONObject) {
                return ((JSONObject) obj).opt(str);
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static String LJII(Object obj, String str) {
        if (C2252021DCm.LJIILIIL) {
            return String.valueOf(LJI(obj, str));
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).optString(str);
        }
        if (C19719512Dh.LJII(obj)) {
            Object obj2 = ((Map) obj).get(str);
            if (obj2 instanceof String) {
                return (String) obj2;
            }
            return null;
        }
        return null;
    }

    public static void LJIIIZ(String str, Map map) {
        if (Intrinsics.LJFF(str, "search")) {
            if (C21141917oP.LIZ() || ((ExploreSearchRealTimeConfig) C291500Bbg.LIZIZ.getValue()).enable) {
                LJFF().execute(new ARunnableS110S0100000_10(str, (String) map, (Map<String, String>) 192));
            }
        }
    }

    public static int LJIIL(int i, Object obj) {
        try {
            Integer numLJIIJJI = C2095008Iq.LJIIJJI(String.valueOf(obj));
            if (numLJIIJJI != null) {
                return numLJIIJJI.intValue();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return i;
    }

    public static long LJIILIIL(long j, Object obj) {
        try {
            Long lLJIILIIL = C2095008Iq.LJIILIIL(String.valueOf(obj));
            if (lLJIILIIL != null) {
                return lLJIILIIL.longValue();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return j;
    }

    public static void LJIILJJIL(String str, Function0 function0) {
        if (Intrinsics.LJFF(str, "general_search") && C07HO.LIZ) {
            try {
                function0.invoke();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public static void LJIILLIIL(String str, Function0 function0) {
        if (Intrinsics.LJFF(str, "general_search") && C21203217yI.LIZ) {
            try {
                function0.invoke();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public static void LJIIZILJ(Function0 function0, Object obj) {
        String strLJII = LJII(obj, "click_user_position");
        if (strLJII == null) {
            strLJII = "";
        }
        if (!a0.LJJJIL(strLJII) && C21203217yI.LIZIZ.contains(strLJII)) {
            function0.invoke();
        }
    }

    public static void LJIJ(C2252061DCq c2252061DCq, Object obj) {
        long j;
        if (c2252061DCq == null) {
            return;
        }
        String strLJII = LJII(obj, "duration");
        long jLongValue = -1;
        if (strLJII != null) {
            j = CastLongProtector.parseLong(strLJII);
        } else {
            j = -1;
        }
        Long l = c2252061DCq.LJIILLIIL;
        if (l != null) {
            jLongValue = l.longValue();
        }
        if (j >= 0) {
            c2252061DCq.LIZLLL(Long.valueOf(j + jLongValue));
        }
    }

    public static String LIZIZ(Object obj, String str, boolean z) {
        Object objLJI;
        Object objLJI2;
        Object objLJI3;
        Object objLJI4;
        Object objLJI5;
        Object objLJI6 = null;
        if (obj != null) {
            objLJI = LJI(obj, "group_id");
        } else {
            objLJI = null;
        }
        String strValueOf = String.valueOf(objLJI);
        if (TextUtils.isEmpty(strValueOf)) {
            if (obj != null) {
                objLJI5 = LJI(obj, "aweme_id");
            } else {
                objLJI5 = null;
            }
            strValueOf = String.valueOf(objLJI5);
        }
        if (z) {
            if (!Intrinsics.LJFF(str, "general_search")) {
                strValueOf = "";
            } else {
                if (obj != null) {
                    objLJI3 = LJI(obj, "room_id");
                } else {
                    objLJI3 = null;
                }
                strValueOf = String.valueOf(objLJI3);
                if (!C123100dR.LIZ(strValueOf) || strValueOf == null) {
                    if (obj != null) {
                        objLJI4 = LJI(obj, "source_content_id");
                    } else {
                        objLJI4 = null;
                    }
                    strValueOf = String.valueOf(objLJI4);
                    if (!C123100dR.LIZ(strValueOf)) {
                        strValueOf = null;
                    }
                }
            }
        }
        if (C296300BjQ.LIZIZ) {
            return strValueOf;
        }
        if (TextUtils.isEmpty(strValueOf)) {
            if (obj != null) {
                objLJI2 = LJI(obj, "object_id");
            } else {
                objLJI2 = null;
            }
            strValueOf = String.valueOf(objLJI2);
        }
        if (TextUtils.isEmpty(strValueOf)) {
            if (obj != null) {
                objLJI6 = LJI(obj, "room_id");
            }
            return String.valueOf(objLJI6);
        }
        return strValueOf;
    }

    public static void LJIIJ(EnumC2252111DCv enumC2252111DCv, String str, String str2, Map map) {
        LJIIJJI(enumC2252111DCv, map, Boolean.TRUE, str, str2);
    }

    public static void LJIILL(C2252061DCq c2252061DCq, Map map, Object obj, int i) {
        Object objLJJLIIIJJIZ;
        if (c2252061DCq == null) {
            return;
        }
        String strLJII = LJII(obj, "entrance_form");
        String str = "";
        if (strLJII == null) {
            strLJII = "";
        }
        if (!a0.LJJJIL(strLJII) && C21203217yI.LIZJ.contains(strLJII)) {
            String strLJII2 = LJII(obj, "product_id");
            if (strLJII2 != null) {
                str = strLJII2;
            }
            if (a0.LJJJIL(str)) {
                return;
            }
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            Object linkedHashSet = linkedHashMap.get(strLJII);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(strLJII, linkedHashSet);
            }
            HashSet hashSet = (HashSet) linkedHashSet;
            if (i < 0) {
                hashSet.add(str);
                return;
            }
            if (hashSet.size() == i && (objLJJLIIIJJIZ = C13LP.LJJLIIIJJIZ(hashSet)) != null) {
                hashSet.remove(objLJJLIIIJJIZ);
            }
            hashSet.add(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:408:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIIZZ(X.EnumC2252111DCv r16, java.lang.Object r17, java.lang.Object r18, X.C2252061DCq r19, java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 1912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2252051DCp.LJIIIIZZ(X.1DCv, java.lang.Object, java.lang.Object, X.1DCq, java.lang.String):void");
    }

    public static void LJIIJJI(final EnumC2252111DCv enumC2252111DCv, final Object obj, final Object obj2, final String str, final String str2) {
        LJFF().execute(new Runnable() { // from class: X.1DCo
            /* JADX WARN: Removed duplicated region for block: B:42:0x00d7  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x00db  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x00de  */
            /* JADX WARN: Removed duplicated region for block: B:87:0x0174  */
            /* JADX WARN: Removed duplicated region for block: B:90:0x017b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ() {
                /*
                    Method dump skipped, instruction units count: 1190
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC2252041DCo.LIZ():void");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ConsumeManager@fa78.recordInternal$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ConsumeManager@fa78.recordInternal$1");
            }
        });
    }
}
