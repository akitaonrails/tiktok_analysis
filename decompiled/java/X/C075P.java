package X;

import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.075P, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C075P {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C075D());
    public static final int LIZIZ = 1;

    public static boolean LIZ() {
        int i;
        if (!Intrinsics.LJFF(Build.MODEL, "aosp") && (i = Build.VERSION.SDK_INT) >= 29 && i <= 34) {
            return ((C1785306yx) LIZ.getValue()).LIZ(new C075Q());
        }
        return false;
    }
}
