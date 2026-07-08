package X;

import Y.ARunnableS106S0100000_6;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gfw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421540Gfw {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(532));

    public static void LIZ(Function0 function0) {
        if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            function0.invoke();
        } else {
            C786410Ut5.LJJZZIII((Handler) LIZ.getValue(), new ARunnableS106S0100000_6(function0, 255));
        }
    }

    public static void LIZIZ(Function0 function0) {
        if (!Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            C786410Ut5.LJJZZIII((Handler) LIZ.getValue(), new ARunnableS106S0100000_6(function0, 254));
        } else {
            function0.invoke();
        }
    }
}
