package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0a0y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C918700a0y implements InterfaceC918590a0n {
    public final Function0<Boolean> LIZ;
    public final Function2<String, Function1<? super String, Unit>, Boolean> LIZIZ;
    public final String LIZJ;
    public final Function0<Unit> LIZLLL;
    public boolean LJ;

    @Override // X.InterfaceC918590a0n
    public final C918610a0p LIZ(C918580a0m c918580a0m) {
        if (!this.LIZ.invoke().booleanValue()) {
            return new C918610a0p(EnumC918840a1C.PASSED);
        }
        if (this.LJ) {
            this.LJ = false;
            return new C918610a0p(EnumC918840a1C.PASSED);
        }
        Function2<String, Function1<? super String, Unit>, Boolean> function2 = this.LIZIZ;
        if (function2 != null && function2.invoke(this.LIZJ, new AwS381S0200000_15(this, c918580a0m, 144)).booleanValue()) {
            return C918580a0m.LIZIZ(EnumC918770a15.UNKNOWN, "wait_for_increase_guest_spot");
        }
        return new C918610a0p(EnumC918840a1C.PASSED);
    }

    public C918700a0y(AwS559S0100000_15 awS559S0100000_15, Function2 function2, String str, Function0 function0) {
        this.LIZ = awS559S0100000_15;
        this.LIZIZ = function2;
        this.LIZJ = str;
        this.LIZLLL = function0;
    }
}
