package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14F7, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14F7 {
    public static String LIZ = "";
    public static int LIZIZ = -1;
    public static long LIZJ = -1;
    public static int LIZLLL = -1;

    public static boolean LIZJ() {
        return LIZIZ == 1;
    }

    public static boolean LIZLLL() {
        return LIZIZ == 0;
    }

    public static long LIZ(String str) {
        if (str != null && str.length() != 0 && !Intrinsics.LJFF(str, LIZ)) {
            return -1L;
        }
        return LIZLLL;
    }

    public static long LIZIZ(String str) {
        if (str != null && str.length() != 0 && !Intrinsics.LJFF(str, LIZ)) {
            return -1L;
        }
        return LIZJ;
    }
}
