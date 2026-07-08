package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Jqj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C504670Jqj {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    public static boolean LIZ(String str, String str2) {
        if (LIZIZ(str) && LIZIZ(str2)) {
            return true;
        }
        return Intrinsics.LJFF(str, str2);
    }
}
