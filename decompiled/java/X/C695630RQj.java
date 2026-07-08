package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.0RQj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C695630RQj {
    public static Boolean LIZ;
    public static Boolean LIZIZ;
    public static Boolean LIZJ;

    public static boolean LIZ() {
        if (LIZIZ == null) {
            LIZIZ = Boolean.FALSE;
        }
        Boolean bool = LIZIZ;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static boolean LIZIZ() {
        if (LIZ == null) {
            LIZ = Boolean.valueOf(LIZ() || LIZJ());
        }
        Boolean bool = LIZ;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static boolean LIZJ() {
        if (LIZJ == null) {
            C844470XAv.LIZ.getClass();
            LIZJ = Boolean.valueOf(TextUtils.equals(C844470XAv.LJIILL, "local_test"));
        }
        Boolean bool = LIZJ;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
