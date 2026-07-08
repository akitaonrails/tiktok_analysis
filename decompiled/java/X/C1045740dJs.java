package X;

import android.content.Context;
import kotlin.jvm.internal.AwS260S0300000_16;

/* JADX INFO: renamed from: X.0dJs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1045740dJs {
    public final /* synthetic */ C1045640dJi LIZ;
    public final /* synthetic */ C1045720dJq LIZIZ;
    public final /* synthetic */ Context LIZJ;

    public final void LIZ() {
        C1045640dJi c1045640dJi = this.LIZ;
        AwS260S0300000_16 awS260S0300000_16 = new AwS260S0300000_16(c1045640dJi, this.LIZIZ, this.LIZJ, 27);
        if ((c1045640dJi.LJII & 1) == 0) {
            awS260S0300000_16.invoke();
        }
        c1045640dJi.LJII |= 1;
    }

    public final void LIZIZ() {
        C1045640dJi c1045640dJi = this.LIZ;
        AwS260S0300000_16 awS260S0300000_16 = new AwS260S0300000_16(c1045640dJi, this.LIZIZ, this.LIZJ, 28);
        if ((c1045640dJi.LJII & 2) == 0) {
            awS260S0300000_16.invoke();
        }
        c1045640dJi.LJII |= 2;
    }

    public final void LIZJ() {
        this.LIZ.getClass();
    }

    public final void LIZLLL() {
        C1045640dJi c1045640dJi = this.LIZ;
        AwS260S0300000_16 awS260S0300000_16 = new AwS260S0300000_16(c1045640dJi, this.LIZIZ, this.LIZJ, 29);
        if ((c1045640dJi.LJII & 4) == 0) {
            awS260S0300000_16.invoke();
        }
        c1045640dJi.LJII |= 4;
    }

    public C1045740dJs(C1045640dJi c1045640dJi, C1045720dJq c1045720dJq, Context context) {
        this.LIZ = c1045640dJi;
        this.LIZIZ = c1045720dJq;
        this.LIZJ = context;
    }
}
