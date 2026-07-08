package X;

import Y.ARunnableS113S0100000_13;
import android.os.SystemClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS106S1200000_23;
import kotlin.jvm.internal.AwS107S1000000_23;
import kotlin.jvm.internal.AwS137S1100000_23;
import kotlin.jvm.internal.AwS567S0100000_23;

/* JADX INFO: renamed from: X.0qMx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1547370qMx extends AbstractC1537870q7d {
    public final String LL;
    public final boolean LLILLJJLI;
    public final Function1<InterfaceC1541990qEH, Unit> LLILLL;
    public final Function0<Unit> LLILZ;
    public long LLILZIL;

    @Override // X.AbstractC1537870q7d
    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        AwS567S0100000_23 awS567S0100000_23 = new AwS567S0100000_23(interfaceC1541990qEH, 187);
        c2341109Fh.getClass();
        C2341109Fh.LIZIZ(awS567S0100000_23);
        Function1<InterfaceC1541990qEH, Unit> function1 = this.LLILLL;
        if (function1 != null) {
            function1.invoke(interfaceC1541990qEH);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        AwS107S1000000_23 awS107S1000000_23 = new AwS107S1000000_23(str, 32);
        c2341109Fh.getClass();
        C2341109Fh.LIZIZ(awS107S1000000_23);
        this.LLILZIL = SystemClock.elapsedRealtime();
        C1747970vaV c1747970vaV = new C1747970vaV();
        c1747970vaV.LJIIIIZZ(new AwS137S1100000_23(str, this, 7));
        c1747970vaV.LIZJ(false);
    }

    @Override // X.AbstractC1537870q7d
    public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        C1260120ite.LIZIZ(new ARunnableS113S0100000_13(this, 238));
        C1747970vaV c1747970vaV = new C1747970vaV();
        c1747970vaV.LJIIIIZZ(new AwS106S1200000_23(str, this, c1542120qEU, 5));
        c1747970vaV.LIZJ(false);
    }

    public C1547370qMx(String str, Function0 function0, Function1 function1, boolean z) {
        super((Object) null);
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = function1;
        this.LLILZ = function0;
    }
}
