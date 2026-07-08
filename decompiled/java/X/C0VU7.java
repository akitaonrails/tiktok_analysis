package X;

import Y.ARunnableS13S1300000_13;
import Y.ARunnableS18S1100000_13;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: renamed from: X.0VU7, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VU7 implements InterfaceC466670IRt {
    public String LIZ = "";
    public final List<String> LIZIZ = new ArrayList();
    public final AtomicInteger LIZJ = new AtomicInteger(0);
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(397));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(396));

    public final boolean LJ() {
        return ((Boolean) this.LJ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC466670IRt
    public final void LIZ(String str) throws Throwable {
        int i;
        if (!LJ() || (i = this.LIZJ.get()) == 0) {
            return;
        }
        ARunnableS18S1100000_13 aRunnableS18S1100000_13 = new ARunnableS18S1100000_13(this, str, 29);
        if (i != 1) {
            if (i == 2) {
                aRunnableS18S1100000_13.run();
                return;
            }
            return;
        }
        C823050WQl.LJ().execute(aRunnableS18S1100000_13);
    }

    @Override // X.InterfaceC466670IRt
    public final void LIZIZ(String str) throws Throwable {
        int i;
        if (!LJ() || (i = this.LIZJ.get()) == 0) {
            return;
        }
        ARunnableS18S1100000_13 aRunnableS18S1100000_13 = new ARunnableS18S1100000_13(this, str, 31);
        if (i != 1) {
            if (i == 2) {
                aRunnableS18S1100000_13.run();
                return;
            }
            return;
        }
        C823050WQl.LJ().execute(aRunnableS18S1100000_13);
    }

    @Override // X.InterfaceC466670IRt
    public final void LIZLLL(String str) {
        if (LJ() && this.LIZJ.compareAndSet(0, 1)) {
            C823050WQl.LJ().execute(new ARunnableS18S1100000_13(this, str, 30));
        }
    }

    @Override // X.InterfaceC466670IRt
    public final void LIZJ(String str, Function0<? extends Map<String, ? extends Object>> function0, Function0<? extends Map<String, ? extends Object>> function02) {
        int i;
        if (!LJ() || (i = this.LIZJ.get()) == 0) {
            return;
        }
        ARunnableS13S1300000_13 aRunnableS13S1300000_13 = new ARunnableS13S1300000_13(function02, this, str, function0, 3);
        if (i != 1) {
            if (i == 2) {
                aRunnableS13S1300000_13.run();
                return;
            }
            return;
        }
        C823050WQl.LJ().execute(aRunnableS13S1300000_13);
    }
}
