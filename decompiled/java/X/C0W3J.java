package X;

import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.base.zaq;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0W3J, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W3J {
    public static void LIZIZ(boolean z) {
        if (z) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void LIZJ(zaq zaqVar) {
        String name;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != zaqVar.getLooper()) {
            if (looperMyLooper != null) {
                name = looperMyLooper.getThread().getName();
            } else {
                name = "null current looper";
            }
            throw new IllegalStateException("Must be called on " + zaqVar.getLooper().getThread().getName() + " thread, but got " + name + e3.d);
        }
    }

    public static void LJ(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    public static void LJI(String str) {
        if (!TextUtils.isEmpty(str)) {
        } else {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void LJII(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void LJIIIIZZ(Object obj) {
        if (obj != null) {
        } else {
            throw new NullPointerException("null reference");
        }
    }

    public static void LJIIJJI(boolean z) {
        if (z) {
        } else {
            throw new IllegalStateException();
        }
    }

    public static void LIZ(Object obj, boolean z) {
        if (z) {
        } else {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void LIZLLL(String str, zaq zaqVar) {
        if (Looper.myLooper() == zaqVar.getLooper()) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    public static void LJFF(Object obj, String str) {
        if (!TextUtils.isEmpty(str)) {
        } else {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void LJIIIZ(Object obj, Object obj2) {
        if (obj != null) {
        } else {
            throw new NullPointerException(String.valueOf(obj2));
        }
    }

    public static void LJIIJ(Object obj, boolean z) {
        if (z) {
        } else {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
