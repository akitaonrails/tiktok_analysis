package X;

import Y.AUListenerS256S0100000_6;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hcT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1211030hcT {
    public Integer LIZ;
    public C1211040hcU LIZIZ;

    public final void LIZJ() {
        C1211040hcU c1211040hcU;
        C1211040hcU c1211040hcU2 = this.LIZIZ;
        if (c1211040hcU2 == null || !c1211040hcU2.LIZ.isRunning() || (c1211040hcU = this.LIZIZ) == null) {
            return;
        }
        c1211040hcU.LIZ.cancel();
    }

    public final void LIZ(int i, int i2, long j, Function1<? super Integer, Unit> function1) {
        C1211040hcU c1211040hcU = this.LIZIZ;
        if (c1211040hcU != null) {
            c1211040hcU.LIZ.cancel();
        }
        if (i >= 100) {
            function1.invoke(100);
            return;
        }
        Integer num = this.LIZ;
        if (num == null || i != num.intValue()) {
            this.LIZ = Integer.valueOf(i);
            C1211040hcU c1211040hcU2 = new C1211040hcU(i, i2, j);
            this.LIZIZ = c1211040hcU2;
            c1211040hcU2.LIZ.setDuration(j);
            c1211040hcU2.LIZ.addUpdateListener(new AUListenerS256S0100000_6(function1, 184));
            c1211040hcU2.LIZ.start();
        }
    }
}
