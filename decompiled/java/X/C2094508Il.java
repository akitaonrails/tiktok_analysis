package X;

import Y.ARunnableS103S0100000_3;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08Il, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2094508Il {
    public static final void LIZ(EnumC2094708In enumC2094708In, Function0<Unit> function0) {
        int i = C2094608Im.LIZ[enumC2094708In.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C313901Jp(new AwS547S0100000_3(function0, (Function0<Unit>) 121), null), 2);
                return;
            }
            throw new C1954807lC();
        }
        AwS547S0100000_3 awS547S0100000_3 = new AwS547S0100000_3(function0, (Function0<Unit>) 120);
        if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C786410Ut5.LJJZZIII(C0IK5.LIZ(), new ARunnableS103S0100000_3((Object) awS547S0100000_3, 92));
        } else {
            awS547S0100000_3.invoke();
        }
    }
}
