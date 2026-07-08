package X;

import android.content.Context;

/* JADX INFO: renamed from: X.13rq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20144013rq {
    public static boolean LIZ(Context context, int i, String str) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i)) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZIZ(Context context, int i, String str) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i)) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZJ(Context context, int i, String str) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i)) {
            if (str.equalsIgnoreCase(str2)) {
                return true;
            }
        }
        return false;
    }
}
