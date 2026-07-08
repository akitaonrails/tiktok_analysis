package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.01VZ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01VZ implements InterfaceC427710Gpt {
    public static final C01VZ LL;
    public static volatile Integer LLILLJJLI;
    public static volatile boolean LLILLL;

    static {
        C01VZ c01vz = new C01VZ();
        LL = c01vz;
        try {
            C0XQ7.LJFF().LJJIFFI(c01vz);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static int LIZ() {
        Object c098200Yq;
        Map mapLJ;
        String string;
        Integer num = LLILLJJLI;
        if (num != null) {
            return num.intValue();
        }
        if (!C882650Yjv.LJ()) {
            LLILLJJLI = 0;
            return 0;
        }
        C01VW.LIZ.getClass();
        Keva kevaLIZIZ = C01VW.LIZIZ();
        int i = kevaLIZIZ != null ? kevaLIZIZ.getInt("pending_fold_strategy", 0) : 0;
        boolean zLIZJ = LIZJ();
        int i2 = (i != 1 || zLIZJ) ? 0 : 1;
        LLILLJJLI = Integer.valueOf(i2);
        C589910NBt c589910NBt = C589910NBt.LIZ;
        EnumC343601Va enumC343601Va = null;
        if (i2 == 0) {
            if (i == 0) {
                enumC343601Va = EnumC343601Va.UNKNOWN_HABITS;
            } else if (i == 1) {
                if (zLIZJ) {
                    enumC343601Va = EnumC343601Va.MANUALLY_OPEN;
                }
            } else if (i == 2) {
                enumC343601Va = EnumC343601Va.RETURN;
            }
        }
        c589910NBt.getClass();
        if (C882650Yjv.LJ()) {
            Pair[] pairArr = new Pair[3];
            pairArr[0] = new Pair("is_fold", i2 != 0 ? "1" : CardStruct.IStatusCode.DEFAULT);
            pairArr[1] = new Pair("is_creator", C882650Yjv.LIZLLL() ? "1" : CardStruct.IStatusCode.DEFAULT);
            pairArr[2] = new Pair("is_business", C882650Yjv.LIZJ() ? "1" : CardStruct.IStatusCode.DEFAULT);
            Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            if (i2 == 0 && enumC343601Va != null) {
                mapLJIIJ.put("unfold_reason", enumC343601Va.getValue());
            }
            LL.getClass();
            Keva kevaLIZIZ2 = C01VW.LIZIZ();
            String str = "";
            if (kevaLIZIZ2 != null && (string = kevaLIZIZ2.getString("pending_tracking_fields", "")) != null) {
                str = string;
            }
            if (str.length() == 0) {
                mapLJ = C2097608Jq.LJ();
            } else {
                try {
                    C1227904rF c1227904rF = C1227904rF.LIZ;
                    Type type = C01VW.LIZJ;
                    c1227904rF.getClass();
                    c098200Yq = (Map) C1227904rF.LIZJ(str, type);
                    if (c098200Yq == null) {
                        c098200Yq = C2097608Jq.LJ();
                    }
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Map mapLJ2 = C2097608Jq.LJ();
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = mapLJ2;
                }
                mapLJ = (Map) c098200Yq;
            }
            if (!mapLJ.isEmpty()) {
                mapLJIIJ.putAll(mapLJ);
            }
            C20684815ws.LJIILLIIL("inbox_skylight_folded_status", mapLJIIJ);
        }
        return i2;
    }

    public static void LIZIZ() {
        if (C882650Yjv.LJ() && !C882650Yjv.LIZIZ() && LLILLL) {
            LLILLL = false;
            try {
                C01VW.LIZ(C01VW.LIZ);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Iterable, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.13BV] */
    public static boolean LIZJ() {
        ?? arrayList;
        int i;
        if (C882650Yjv.LIZIZ()) {
            return false;
        }
        C01B5.LIZ.getClass();
        List<C01B6> listLIZ = C01B5.LIZ();
        if (listLIZ.isEmpty()) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C01VW.LIZ.getClass();
        List listLIZLLL = C01VW.LIZLLL();
        if (listLIZLLL.isEmpty()) {
            arrayList = C13BV.INSTANCE;
        } else {
            long jLIZJ = C01VW.LIZJ();
            arrayList = new ArrayList();
            for (Object obj : listLIZLLL) {
                if (jCurrentTimeMillis - ((Number) obj).longValue() < jLIZJ) {
                    arrayList.add(obj);
                }
            }
        }
        if (arrayList.isEmpty() || listLIZ.isEmpty()) {
            return false;
        }
        for (C01B6 c01b6 : listLIZ) {
            if (arrayList.isEmpty()) {
                i = 0;
            } else {
                Iterator it2 = arrayList.iterator();
                i = 0;
                while (it2.hasNext()) {
                    if (jCurrentTimeMillis - ((Number) it2.next()).longValue() < c01b6.LIZ && (i = i + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            if (i >= c01b6.LIZIZ) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC427710Gpt
    public final void LLLLLLZZ(int i, User user, User user2) {
        LLILLJJLI = null;
        LLILLL = false;
    }
}
