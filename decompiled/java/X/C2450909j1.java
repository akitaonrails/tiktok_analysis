package X;

import Y.ACallableS411S0100000_3;
import Y.ARunnableS103S0100000_3;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.09j1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2450909j1 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1499));

    public static final void LIZ(Function0<Unit> function0) {
        C799570VYd.LJFF(false).execute(new ARunnableS103S0100000_3((Function0) function0, 139));
    }

    public static final void LIZIZ(Function0<Unit> function0) {
        if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
            function0.invoke();
        } else {
            LIZJ(function0);
        }
    }

    public static final void LIZJ(Function0 function0) {
        C15O7.LIZIZ(new ACallableS411S0100000_3(function0, 34), C15O7.LJIIIIZZ, null);
    }
}
