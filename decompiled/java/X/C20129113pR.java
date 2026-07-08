package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;

/* JADX INFO: renamed from: X.13pR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20129113pR {
    public static <T extends Enum<T>> T LIZJ(Class<T> cls, Object obj) {
        try {
            if (obj instanceof C20129413pU) {
                return (T) C08FF.LIZ(cls, "UNDEFINED");
            }
            if (obj instanceof C20129213pS) {
                return null;
            }
            String str = (String) obj;
            if (str.equals("2-digit")) {
                return (T) C08FF.LIZ(cls, "DIGIT2");
            }
            for (T t : cls.getEnumConstants()) {
                if (t.name().compareToIgnoreCase(str) == 0) {
                    return t;
                }
            }
            return null;
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static Object LIZ(Object obj, Object obj2, Object obj3, Object obj4) throws C20129013pQ {
        if (obj instanceof C20129413pU) {
            return obj4;
        }
        if (obj instanceof Double) {
            double dLIZJ = C20129313pT.LIZJ(obj);
            if (!Double.isNaN(dLIZJ) && dLIZJ <= C20129313pT.LIZJ(obj3) && dLIZJ >= C20129313pT.LIZJ(obj2)) {
                return obj;
            }
            throw new C20129013pQ("Invalid number value !");
        }
        throw new C20129013pQ("Invalid number value !");
    }

    public static Object LIZIZ(Object obj, String str, EnumC199645139n enumC199645139n, Object obj2, Object obj3) throws C20129013pQ {
        Object objLIZ = C20129313pT.LIZ(obj, str);
        if (objLIZ instanceof C20129413pU) {
            return obj3;
        }
        if (objLIZ instanceof C20129213pS) {
            objLIZ = "";
        }
        if (enumC199645139n == EnumC199645139n.BOOLEAN && !(objLIZ instanceof Boolean)) {
            throw new C20129013pQ("Boolean option expected but not found");
        }
        if (enumC199645139n == EnumC199645139n.STRING && !(objLIZ instanceof String)) {
            throw new C20129013pQ("String option expected but not found");
        }
        if (!(obj2 instanceof C20129413pU) && !Arrays.asList((Object[]) obj2).contains(objLIZ)) {
            throw new C20129013pQ("String option expected but not found");
        }
        return objLIZ;
    }
}
