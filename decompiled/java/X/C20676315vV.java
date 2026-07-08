package X;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.15vV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20676315vV {
    public static final InterfaceC20676615vY LIZ;
    public static final C01GW LIZIZ;

    static {
        InterfaceC20676615vY.LIZ.getClass();
        LIZ = C20677015vc.LIZJ;
        LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(606));
    }

    public static void LIZ(List list, Function1 function1, Function0 function0) {
        if (LIZ == null) {
            Throwable th = new Throwable("Can't get api object.");
            th.getMessage();
            function1.invoke(th);
            return;
        }
        C23250099c.LIZLLL((InterfaceC497601wk) LIZIZ.getValue(), null, null, new C20676415vW(list, null, function0, function1), 3);
    }
}
