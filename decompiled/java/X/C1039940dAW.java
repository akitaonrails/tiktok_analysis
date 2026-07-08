package X;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dAW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1039940dAW {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str, String str2) {
        String lowerCase;
        String lowerCase2 = null;
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
        } else {
            lowerCase = null;
        }
        if (str2 != null) {
            lowerCase2 = str2.toLowerCase(Locale.ROOT);
        }
        return Intrinsics.LJFF(lowerCase, lowerCase2);
    }
}
