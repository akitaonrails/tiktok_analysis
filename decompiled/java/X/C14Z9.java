package X;

import java.util.Locale;

/* JADX INFO: renamed from: X.14Z9, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14Z9 {
    public static String LIZ(Integer num) {
        for (C14ZA c14za : C14ZA.values()) {
            int type = c14za.getType();
            if (num != null && type == num.intValue()) {
                return c14za.name().toLowerCase(Locale.getDefault());
            }
        }
        return "";
    }

    public static boolean LIZIZ(Integer num) {
        int type = C14ZA.MULTIPLE_CHOICE.getType();
        if (num == null || num.intValue() != type) {
            int type2 = C14ZA.MULTIPLE_CHOICE_INPUT.getType();
            if (num != null && num.intValue() == type2) {
                return true;
            }
            return false;
        }
        return true;
    }
}
