package X;

import Y.ARunnableS103S0100000_3;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.tiktok.turtle.config.PrefetchDSL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: X.0q4R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1535890q4R {
    public static boolean LIZIZ;
    public static final C1535890q4R LIZ = new C1535890q4R();
    public static final ConcurrentHashMap<String, C1541070qCn<?, ?>> LIZJ = new ConcurrentHashMap<>();
    public static HashMap<String, FutureTask<k>> LIZLLL = new HashMap<>();

    public static void LIZIZ(HashMap map) {
        LIZLLL = map;
        C1532960pzi.LIZIZ(new ARunnableS103S0100000_3(map, 15));
    }

    public static void LIZJ(boolean z) {
        boolean z2;
        C1532930pzf c1532930pzf = C1532930pzf.LIZJ;
        if (!c1532930pzf.LIZIZ && !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        c1532930pzf.LIZIZ = z2;
        LIZIZ = z;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static C1540860qCS LIZ(k kVar, C1540860qCS c1540860qCS, String str, Map map, boolean z) {
        Object c098200Yq;
        String str2;
        Locale locale;
        String lowerCase;
        Object c098200Yq2;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        long jLongValue;
        int iIntValue;
        C1540860qCS c1540860qCS2 = c1540860qCS;
        C08AB c08ab = new C08AB();
        c08ab.LIZJ("parse_dsl");
        try {
            c098200Yq = (PrefetchDSL) C1531810pxr.LIZ.LIZJ(kVar, PrefetchDSL.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        EnumC1533170q03 enumC1533170q03 = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        PrefetchDSL prefetchDSL = (PrefetchDSL) c098200Yq;
        if (prefetchDSL != null && (str2 = prefetchDSL.serviceName) != null && (lowerCase = str2.toLowerCase((locale = Locale.ROOT))) != null) {
            LIZ.getClass();
            C1541070qCn<?, ?> c1541070qCn = LIZJ.get(lowerCase.toLowerCase(locale));
            if (c1541070qCn == null) {
                return c1540860qCS2;
            }
            c08ab.LIZJ("parse_input");
            try {
                k kVar2 = prefetchDSL.input;
                if (kVar2 != null) {
                    c098200Yq2 = c1541070qCn.LJIIIIZZ.LIZJ(kVar2, c08ab, (Map<String, ? extends InterfaceC679950Qll>) map);
                } else {
                    c098200Yq2 = null;
                }
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                c098200Yq2 = null;
            }
            if (c098200Yq2 == null) {
                C1532930pzf c1532930pzf = C1532930pzf.LIZJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("cannot parse Input from ");
                sbLIZ.append(str);
                c1532930pzf.LIZIZ("PrefetchServiceManager", "executeSingleDSL", C2188811AlT.LIZIZ(sbLIZ));
                return c1540860qCS2;
            }
            if (c1540860qCS2 == null) {
                c1540860qCS2 = new C1540860qCS(str, true, false, null);
            }
            String str3 = prefetchDSL.removalStrategy;
            if (str3 != null) {
                String lowerCase2 = str3.toLowerCase(Locale.ROOT);
                int iHashCode = lowerCase2.hashCode();
                if (iHashCode != -1129839561) {
                    if (iHashCode != 293053236) {
                        if (iHashCode == 1642639251 && lowerCase2.equals("keep_alive")) {
                            enumC1533170q03 = EnumC1533170q03.KEEP_ALIVE;
                        }
                    } else if (lowerCase2.equals("only_once")) {
                        enumC1533170q03 = EnumC1533170q03.ONLY_ONCE;
                    }
                } else if (lowerCase2.equals("remove_on_consume")) {
                    enumC1533170q03 = EnumC1533170q03.REMOVE_ON_CONSUME;
                }
            }
            if (prefetchDSL.removalStrategy != null && enumC1533170q03 == null) {
                C1532930pzf.LIZJ.LIZIZ("PrefetchServiceManager", "executeSingleDSL", "unknown removal_strategy: " + prefetchDSL.removalStrategy);
            }
            Boolean bool = prefetchDSL.sharable;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = c1541070qCn.LIZIZ;
            }
            Boolean bool2 = prefetchDSL.retryOnFailure;
            if (bool2 != null) {
                zBooleanValue2 = bool2.booleanValue();
            } else {
                zBooleanValue2 = c1541070qCn.LIZJ;
            }
            Long l = prefetchDSL.freshTime;
            if (l != null) {
                jLongValue = l.longValue() * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            } else {
                jLongValue = c1541070qCn.LIZLLL;
            }
            long j = c1541070qCn.LJ;
            if (enumC1533170q03 == null) {
                enumC1533170q03 = c1541070qCn.LJFF;
            }
            Integer num = prefetchDSL.maxCacheCount;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 8;
            }
            C1535940q4W c1535940q4W = new C1535940q4W(zBooleanValue, zBooleanValue2, jLongValue, j, enumC1533170q03, iIntValue);
            c1535940q4W.LJI = c08ab;
            ConcurrentHashMap<C1540860qCS, Boolean> concurrentHashMap = C1540860qCS.LJII;
            C1540860qCS c1540860qCS3 = c1540860qCS2;
            C1541080qCo<Output> c1541080qCoLJ = c1540860qCS3.LJ(c098200Yq2, c1541070qCn, str, c1535940q4W, null);
            if (c1541080qCoLJ == 0) {
                return c1540860qCS3;
            }
            if (z) {
                c1541070qCn.LIZLLL(c1541080qCoLJ);
                return c1540860qCS3;
            }
            c1541080qCoLJ.execute();
            return c1540860qCS3;
        }
        return c1540860qCS2;
    }
}
