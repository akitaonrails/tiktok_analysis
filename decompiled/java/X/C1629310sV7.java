package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS426S0200000_25;

/* JADX INFO: renamed from: X.0sV7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1629310sV7 implements InterfaceC1625550sP3 {
    public final int LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final InterfaceC1625550sP3 LLILZ;
    public final InterfaceC1629370sVD LLILZIL;
    public final Function2<Boolean, Effect, Unit> LLILZLL;
    public final Function0<Unit> LLIZ;
    public final C138P LLIZLLLIL = C138P.LIZ();

    @Override // X.InterfaceC1625550sP3
    public final void LJIIIIZZ(Effect effect) {
        InterfaceC1625550sP3 interfaceC1625550sP3 = this.LLILZ;
        if (interfaceC1625550sP3 != null) {
            interfaceC1625550sP3.LJIIIIZZ(effect);
        }
    }

    @Override // X.InterfaceC1625550sP3
    public final void onSuccess(Effect effect) {
        long jLIZIZ = this.LLIZLLLIL.LIZIZ(TimeUnit.MILLISECONDS);
        this.LLILZLL.invoke(Boolean.TRUE, effect);
        InterfaceC1625550sP3 interfaceC1625550sP3 = this.LLILZ;
        if ((interfaceC1625550sP3 instanceof InterfaceC1625540sP2) && this.LL == 1) {
            ((InterfaceC1625540sP2) interfaceC1625550sP3).LJIILJJIL(effect);
        } else if (interfaceC1625550sP3 != null) {
            interfaceC1625550sP3.onSuccess(effect);
        }
        InterfaceC1629370sVD interfaceC1629370sVD = this.LLILZIL;
        if (interfaceC1629370sVD != null) {
            interfaceC1629370sVD.LIZIZ(effect, jLIZIZ, this.LL, this.LLILLJJLI, this.LLILLL);
        }
    }

    @Override // X.InterfaceC1625550sP3
    public final void LJII(int i, Effect effect) {
        InterfaceC1625550sP3 interfaceC1625550sP3 = this.LLILZ;
        if (interfaceC1625550sP3 != null) {
            interfaceC1625550sP3.LJII(i, effect);
        }
    }

    @Override // X.InterfaceC1625550sP3
    public final void LJIILLIIL(Effect effect, ExceptionResult exceptionResult) {
        long jLIZIZ = this.LLIZLLLIL.LIZIZ(TimeUnit.MILLISECONDS);
        this.LLILZLL.invoke(Boolean.FALSE, effect);
        InterfaceC1625550sP3 interfaceC1625550sP3 = this.LLILZ;
        if (interfaceC1625550sP3 != null) {
            interfaceC1625550sP3.LJIILLIIL(effect, exceptionResult);
        }
        InterfaceC1629370sVD interfaceC1629370sVD = this.LLILZIL;
        if (interfaceC1629370sVD != null) {
            interfaceC1629370sVD.LIZ(effect, jLIZIZ, this.LL, this.LLILLJJLI, this.LLILLL, exceptionResult);
        }
    }

    public C1629310sV7(int i, String str, String str2, InterfaceC1625550sP3 interfaceC1625550sP3, InterfaceC1629370sVD interfaceC1629370sVD, Function2 function2, AwS426S0200000_25 awS426S0200000_25) {
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = interfaceC1625550sP3;
        this.LLILZIL = interfaceC1629370sVD;
        this.LLILZLL = function2;
        this.LLIZ = awS426S0200000_25;
    }
}
