package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.internal.s;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: renamed from: X.0wp1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1795410wp1 implements InterfaceC1792370wk7 {
    public static final boolean LJFF() {
        return LIZJ("iap_kill_switch_biz_error_codes", 1) == 1;
    }

    public static boolean LIZ(String str) {
        Double d;
        try {
            Map mapLIZIZ = LIZIZ("iap_billing_client_investigate");
            if (str.isEmpty() || (d = (Double) mapLIZIZ.get(str)) == null) {
                return false;
            }
            if (d.doubleValue() != 1.0d) {
                return false;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static Map LIZIZ(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Object obj = ((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ().get(str);
            if (obj instanceof Map) {
                return (Map) obj;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return linkedHashMap;
    }

    public static String LIZLLL(String str) {
        try {
            Object obj = ((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ().get(str);
            Objects.requireNonNull(obj);
            return obj.toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static int LIZJ(String str, int i) {
        try {
            Object obj = ((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ().get(str);
            if (obj == null) {
                return i;
            }
            if (obj instanceof Number) {
                return ((Number) obj).intValue();
            }
            if (obj instanceof String) {
                return CastIntegerProtector.parseInt((String) obj);
            }
            return 0;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return i;
        }
    }

    public static final boolean LJ(double d, String str) {
        Object obj;
        if (C1796030wq1.LIZLLL == null) {
            C1796030wq1.LIZLLL = new C1796030wq1();
        }
        C1796030wq1 c1796030wq1 = C1796030wq1.LIZLLL;
        if (c1796030wq1.LIZJ == null) {
            c1796030wq1.LIZJ = new s();
            try {
                Map<String, ?> mapLIZ = ((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ();
                Object obj2 = mapLIZ.get("live_slardar_is_sample_experiment");
                if (obj2 != null && (obj2 instanceof Boolean)) {
                    c1796030wq1.LIZIZ = ((Boolean) obj2).booleanValue();
                }
                if (c1796030wq1.LIZIZ && (obj = mapLIZ.get("live_slardar_sample_list")) != null && (obj instanceof s)) {
                    c1796030wq1.LIZJ = (s) obj;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (c1796030wq1.LIZIZ) {
            s sVar = c1796030wq1.LIZJ;
            if (sVar != null && sVar.get(str) != null) {
                d = ((Double) c1796030wq1.LIZJ.get(str)).doubleValue();
            }
            if (d > 0.0d) {
                if (c1796030wq1.LIZ < 0.0d) {
                    c1796030wq1.LIZ = ThreadLocalRandom.current().nextDouble();
                }
                if (c1796030wq1.LIZ < d) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
