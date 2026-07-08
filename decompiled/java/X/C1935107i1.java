package X;

import android.os.Build;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07i1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1935107i1 {
    public static final EnumC452301pR LIZ;

    static {
        int i = Build.VERSION.SDK_INT;
        LIZ = (i == 31 || i == 32) ? EnumC452301pR.SYNCHRONIZED : EnumC452301pR.PUBLICATION;
    }

    public static final <T> C01GW<T> LIZ(Function0<? extends T> function0) {
        return C452501pT.LIZ(LIZ, function0);
    }
}
