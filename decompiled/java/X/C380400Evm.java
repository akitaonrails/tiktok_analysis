package X;

import android.view.animation.Interpolator;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlinx.coroutines.flow.b;

/* JADX INFO: renamed from: X.0Evm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C380400Evm {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(218));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(216));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(217));

    public static C414301jJ LIZIZ(boolean z) {
        C01GW c01gw = LIZJ;
        InterfaceC346201Wa interfaceC346201WaLIZ = LIZ(200L, (Interpolator) c01gw.getValue(), 0.0f, 1.0f);
        if (!z) {
            interfaceC346201WaLIZ = new C095D(new C330701Qb(interfaceC346201WaLIZ, LIZ(150L, (Interpolator) c01gw.getValue(), 1.0f, 0.0f), null));
        }
        return new C414301jJ(interfaceC346201WaLIZ, LIZ(400L, (Interpolator) LIZ.getValue(), 0.0f, 1.0f), new C330601Qa(null));
    }

    public static b LIZ(long j, Interpolator interpolator, float f, float f2) {
        return C09IC.LJ(new C534410Kxb(f, f2, j, interpolator, null));
    }
}
