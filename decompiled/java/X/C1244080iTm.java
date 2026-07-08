package X;

import kotlin.text.CharsKt__CharJVMKt;

/* JADX INFO: renamed from: X.0iTm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1244080iTm extends CharsKt__CharJVMKt {
    public static final Integer LIZ(char c) {
        Integer numValueOf = Integer.valueOf(Character.digit((int) c, 10));
        if (numValueOf.intValue() < 0) {
            return null;
        }
        return numValueOf;
    }

    public static final Integer LIZIZ(char c) {
        CharsKt__CharJVMKt.checkRadix(16);
        Integer numValueOf = Integer.valueOf(Character.digit((int) c, 16));
        if (numValueOf.intValue() < 0) {
            return null;
        }
        return numValueOf;
    }

    public static EnumC1244060iTk LIZLLL(char c) {
        C1244070iTl c1244070iTl = EnumC1244060iTk.Companion;
        int type = Character.getType(c);
        c1244070iTl.getClass();
        if (type >= 0) {
            if (type < 17) {
                return EnumC1244060iTk.getEntries().get(type);
            }
            if (18 <= type && type < 31) {
                return EnumC1244060iTk.getEntries().get(type - 1);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Category #");
        sbLIZ.append(type);
        sbLIZ.append(" is not defined.");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static boolean LJ(char c) {
        if (!Character.isWhitespace(c) && !Character.isSpaceChar(c)) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }
}
