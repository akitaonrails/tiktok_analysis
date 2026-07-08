package X;

import java.util.Locale;

/* JADX INFO: renamed from: X.08IF, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08IF {
    public static void LIZJ(int i) {
        if (i >= 0) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void LIZ(Object obj, boolean z) {
        if (z) {
        } else {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void LIZLLL(Object obj, Object obj2) {
        if (obj != null) {
        } else {
            throw new NullPointerException(String.valueOf(obj2));
        }
    }

    public static void LIZIZ(int i, int i2, int i3, String str) {
        if (i >= i2) {
            if (i <= i3) {
                return;
            } else {
                throw new IllegalArgumentException(C786410Ut5.k4(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i3)}));
            }
        }
        throw new IllegalArgumentException(C786410Ut5.k4(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i3)}));
    }
}
