package X;

import java.util.Locale;

/* JADX INFO: renamed from: X.08VH, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08VH {
    public static Throwable LIZJ(Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        Object obj = objArr[objArr.length - 1];
        if (!(obj instanceof Throwable)) {
            return null;
        }
        return (Throwable) obj;
    }

    public static void LIZ(String str, Object... objArr) {
        LIZIZ(str, LIZJ(objArr), objArr);
    }

    public static String LIZIZ(String str, Throwable th, Object... objArr) {
        if ((th == null && objArr.length > 0) || objArr.length > 1) {
            return C786410Ut5.k4(Locale.US, str, objArr);
        }
        return str;
    }
}
