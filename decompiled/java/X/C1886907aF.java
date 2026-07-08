package X;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07aF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1294060jmO
public final class C1886907aF {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str, String[] strArr) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        for (String str2 : strArr) {
            if (Intrinsics.LJFF(lowerCase, str2.toLowerCase(Locale.ROOT))) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZIZ(String str, String[] strArr) {
        for (String str2 : strArr) {
            if (a0.LJJJ(str, str2, 0, false, 6) == 0) {
                return true;
            }
        }
        return false;
    }
}
