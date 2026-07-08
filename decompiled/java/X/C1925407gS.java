package X;

import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.q;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07gS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1925407gS {
    public static final C1925407gS LIZ = new C1925407gS();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Boolean] */
    public static HashMap LIZ(n nVar) {
        ?? string;
        Object string2;
        HashMap map = new HashMap();
        for (Map.Entry<String, k> entry : nVar.entrySet()) {
            String key = entry.getKey();
            k value = entry.getValue();
            value.getClass();
            if (value instanceof q) {
                q qVarLJIILJJIL = value.LJIILJJIL();
                Object obj = qVarLJIILJJIL.LL;
                if (obj instanceof Boolean) {
                    string = Boolean.valueOf(qVarLJIILJJIL.LJ());
                } else if (obj instanceof Number) {
                    string = LIZIZ(qVarLJIILJJIL);
                } else if (obj instanceof String) {
                    string = qVarLJIILJJIL.LJIL();
                } else {
                    string = qVarLJIILJJIL.LJIL();
                }
            } else if (value instanceof n) {
                string = LIZ(value.LJIILIIL());
            } else if (value instanceof h) {
                h hVarLJIIL = value.LJIIL();
                string = new ArrayList(C15438062q.LJIJJ(hVarLJIIL, 10));
                for (k kVar : hVarLJIIL) {
                    kVar.getClass();
                    if (kVar instanceof m) {
                        string2 = null;
                    } else if (kVar instanceof q) {
                        q qVarLJIILJJIL2 = kVar.LJIILJJIL();
                        Object obj2 = qVarLJIILJJIL2.LL;
                        if (obj2 instanceof Boolean) {
                            string2 = Boolean.valueOf(qVarLJIILJJIL2.LJ());
                        } else if (obj2 instanceof Number) {
                            LIZ.getClass();
                            string2 = LIZIZ(qVarLJIILJJIL2);
                        } else if (obj2 instanceof String) {
                            string2 = qVarLJIILJJIL2.LJIL();
                        } else {
                            string2 = qVarLJIILJJIL2.LJIL();
                        }
                    } else if (kVar instanceof n) {
                        C1925407gS c1925407gS = LIZ;
                        n nVarLJIILIIL = kVar.LJIILIIL();
                        c1925407gS.getClass();
                        string2 = LIZ(nVarLJIILIIL);
                    } else {
                        string2 = kVar.toString();
                    }
                    string.add(string2);
                }
            } else {
                string = value.toString();
            }
            map.put(key, string);
        }
        return map;
    }

    public static Object LIZIZ(q qVar) {
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        Object c098200Yq4;
        boolean z;
        String string = a0.LJLIIIL(qVar.LJIL()).toString();
        boolean z2 = true;
        if (!a0.LJJIJ(string, '.')) {
            if (a0.LJJIZ(string, 'e', 0, true, 2) >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                z2 = false;
            }
        }
        if (!z2) {
            try {
                c098200Yq3 = Integer.valueOf(CastIntegerProtector.parseInt(string));
                C189200o6.m2constructorimpl(c098200Yq3);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq3 = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq3);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq3) != null) {
                try {
                    c098200Yq4 = Long.valueOf(CastLongProtector.parseLong(string));
                    C189200o6.m2constructorimpl(c098200Yq4);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq4 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq4);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq4) != null) {
                    return new BigInteger(string);
                }
                return c098200Yq4;
            }
            return c098200Yq3;
        }
        try {
            c098200Yq = Float.valueOf(CastFloatProtector.parseFloat(string));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            try {
                c098200Yq2 = Double.valueOf(CastDoubleProtector.parseDouble(string));
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                c098200Yq2 = new C098200Yq(th4);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq2) != null) {
                return new BigDecimal(string);
            }
            return c098200Yq2;
        }
        return c098200Yq;
    }

    public static HashMap LIZJ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            try {
                return LIZ((n) C20484080s.LIZ(str, n.class));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    public static HashMap LIZLLL(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            try {
                HashMap mapLIZ = LIZ((n) C20484080s.LIZ(str, n.class));
                HashMap map = new HashMap();
                for (Map.Entry entry : mapLIZ.entrySet()) {
                    map.put(entry.getKey(), entry.getValue().toString());
                }
                return map;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }
}
