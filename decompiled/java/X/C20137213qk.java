package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.13qk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20137213qk {
    public static void LIZ(Object obj, boolean z) {
        if (z) {
        } else {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void LIZIZ(Object obj, String str) {
        LIZJ(str, obj);
        LIZ(obj, !TextUtils.isEmpty(str));
    }

    public static void LIZJ(Object obj, Object obj2) {
        if (obj != null) {
        } else {
            throw new NullPointerException(String.valueOf(obj2));
        }
    }

    public static void LIZLLL(Object obj, String str) {
        if (str != null) {
            LIZIZ(obj, str);
        }
    }
}
