package X;

import java.util.List;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.u;

/* JADX INFO: renamed from: X.14Mk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20252814Mk {
    public static final AFwS274S0000000_30 LIZ = AFwS274S0000000_30.get$arr$(254);
    public static final Regex LIZIZ = new Regex("^(\\d+(\\.\\d+)?)%$");

    public static final Double LIZ(Object obj) {
        if (obj instanceof Float) {
            return Double.valueOf(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Integer) {
            return Double.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return Double.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            return C2327809Ae.LJII((String) obj);
        }
        return null;
    }

    public static final Float LIZIZ(Object obj) {
        if (obj instanceof Float) {
            return (Float) obj;
        }
        if (obj instanceof Double) {
            return Float.valueOf((float) ((Number) obj).doubleValue());
        }
        if (obj instanceof Integer) {
            return Float.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return Float.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            return C2327809Ae.LJIIIIZZ((String) obj);
        }
        return null;
    }

    public static final Integer LIZJ(Object obj) {
        if (obj instanceof Float) {
            return Integer.valueOf(Math.round(((Number) obj).floatValue()));
        }
        if (obj instanceof Double) {
            return Integer.valueOf((int) ((Number) obj).doubleValue());
        }
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Long) {
            return Integer.valueOf((int) ((Number) obj).longValue());
        }
        if (obj instanceof String) {
            return C2095008Iq.LJIIJJI((String) obj);
        }
        return null;
    }

    public static final Long LIZLLL(Object obj) {
        if (obj instanceof Float) {
            return Long.valueOf((long) ((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return Long.valueOf((long) ((Number) obj).doubleValue());
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            return C2095008Iq.LJIILIIL((String) obj);
        }
        return null;
    }

    public static final Object LJ(String str) {
        if (C2095008Iq.LJIIJJI(str) != null) {
            return C2095008Iq.LJIIJJI(str);
        }
        if (C2327809Ae.LJIIIIZZ(str) != null) {
            return C2327809Ae.LJIIIIZZ(str);
        }
        if (u.LJIJI(str, "true", true)) {
            return Boolean.TRUE;
        }
        if (u.LJIJI(str, "false", true)) {
            return Boolean.FALSE;
        }
        if (!u.LJIJI(str, "null", true)) {
            return str;
        }
        return null;
    }

    public static final boolean LJFF(String str) {
        if (str == null || !u.LJJIIJZLJL(str, "{", false) || !u.LJIIZILJ(str, "}", false)) {
            return false;
        }
        return true;
    }

    public static final Object LJI(Object obj) {
        List<String> listLIZ;
        String str;
        Float fLJIIIIZZ;
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Float)) {
            if (obj instanceof Integer) {
                return Float.valueOf(((Number) obj).intValue());
            }
            if (!(obj instanceof String)) {
                return obj;
            }
            Regex regex = LIZIZ;
            CharSequence charSequence = (CharSequence) obj;
            if (!regex.matches(charSequence)) {
                return obj;
            }
            MatchResult matchResultFind$default = Regex.find$default(regex, charSequence, 0, 2, null);
            if (matchResultFind$default == null || (listLIZ = matchResultFind$default.LIZ()) == null || (str = (String) C13LP.LJJJLZIJ(1, listLIZ)) == null || (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str)) == null) {
                return null;
            }
            return new C20252914Ml(fLJIIIIZZ.floatValue());
        }
        return obj;
    }

    public static final String LJII(String str) {
        if (!LJFF(str) || str.length() <= 2) {
            return str;
        }
        return str.substring(1, str.length() - 1);
    }
}
